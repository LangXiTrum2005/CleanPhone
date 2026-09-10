package ri;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import bo.e;
import com.ironsource.X3;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f49589a = d.class.getName().concat(".aot-shared-library-name");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f49590b = d.class.getName().concat(".vm-snapshot-data");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f49591c = d.class.getName().concat(".isolate-snapshot-data");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f49592d = d.class.getName().concat(".flutter-assets-dir");

    public static e a(Context context) {
        int i10;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            String string = null;
            String string2 = bundle == null ? null : bundle.getString(f49589a, null);
            Bundle bundle2 = applicationInfo.metaData;
            if (bundle2 != null) {
                bundle2.getString(f49590b, null);
            }
            Bundle bundle3 = applicationInfo.metaData;
            if (bundle3 != null) {
                bundle3.getString(f49591c, null);
            }
            Bundle bundle4 = applicationInfo.metaData;
            String string3 = bundle4 == null ? null : bundle4.getString(f49592d, null);
            Bundle bundle5 = applicationInfo.metaData;
            if (bundle5 != null && (i10 = bundle5.getInt("io.flutter.network-policy", 0)) > 0) {
                JSONArray jSONArray = new JSONArray();
                try {
                    XmlResourceParser xml = context.getResources().getXml(i10);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2 && xml.getName().equals("domain-config")) {
                            b(xml, jSONArray, false);
                        }
                    }
                    string = jSONArray.toString();
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            String str = applicationInfo.nativeLibraryDir;
            Bundle bundle6 = applicationInfo.metaData;
            boolean z10 = bundle6 != null ? bundle6.getBoolean("io.flutter.automatically-register-plugins", true) : true;
            e eVar = new e();
            if (string2 == null) {
                string2 = "libapp.so";
            }
            eVar.f5777b = string2;
            if (string3 == null) {
                string3 = "flutter_assets";
            }
            eVar.f5778c = string3;
            eVar.f5780e = str;
            if (string == null) {
                string = "";
            }
            eVar.f5779d = string;
            eVar.f5776a = z10;
            return eVar;
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void b(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z10) throws XmlPullParserException, IOException {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z10);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals(X3.j.D)) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 4) {
                        throw new IllegalStateException("Expected text");
                    }
                    String strTrim = xmlResourceParser.getText().trim();
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(strTrim);
                    jSONArray2.put(attributeBooleanValue2);
                    jSONArray2.put(attributeBooleanValue);
                    jSONArray.put(jSONArray2);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 3) {
                        throw new IllegalStateException("Expected end of domain tag");
                    }
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    b(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }
}
