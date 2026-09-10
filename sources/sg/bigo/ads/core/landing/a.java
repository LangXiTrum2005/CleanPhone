package sg.bigo.ads.core.landing;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import sg.bigo.ads.api.AdActivity;
import sg.bigo.ads.api.core.e;
import sg.bigo.ads.common.utils.c;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.core.d.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static Intent a(Uri uri) {
        return new Intent("android.intent.action.VIEW", uri).addFlags(268435456);
    }

    public static void b(Context context, String str) {
        Intent intentA = AdActivity.a(context, WebViewActivityImpl.class);
        intentA.putExtra("url", str);
        context.startActivity(intentA);
    }

    public static String a(String str, Map<String, String> map, String str2) {
        StringBuilder sb;
        String host = Uri.parse(str2).getHost();
        if (!q.a((CharSequence) str) && !map.isEmpty() && !q.a((CharSequence) host)) {
            try {
                Set<String> queryParameterNames = Uri.parse(str2).getQueryParameterNames();
                if (str.equals("all") || str.contains(host)) {
                    StringBuilder sb2 = new StringBuilder();
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (!queryParameterNames.contains(entry.getKey())) {
                            sb2.append(entry.getValue());
                            sb2.append(d9.i.f24749c);
                        }
                    }
                    String string = sb2.toString();
                    if (!TextUtils.isEmpty(string)) {
                        String strSubstring = string.substring(0, string.length() - 1);
                        if (str2.contains("?")) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            sb.append(d9.i.f24749c);
                            sb.append(strSubstring);
                        } else {
                            sb = new StringBuilder();
                            sb.append(str2);
                            sb.append("?");
                            sb.append(strSubstring);
                        }
                        return sb.toString();
                    }
                }
            } catch (Throwable th) {
                sg.bigo.ads.common.t.a.a(0, "LinkUtils", "appendPixel error =" + th.getMessage());
            }
        }
        return str2;
    }

    public static boolean a(Context context, String str) {
        try {
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean a(Context context, String str, String str2, List<String> list) {
        String str3;
        try {
            Intent intentA = a(Uri.parse(str));
            if (!TextUtils.isEmpty(str2)) {
                intentA.setPackage(str2);
            }
            context.startActivity(intentA);
            return true;
        } catch (Exception e2) {
            if (e2 instanceof ActivityNotFoundException) {
                str3 = "Unable to open target URL by browser due to ActivityNotFoundException.";
            } else {
                StringBuilder sb = new StringBuilder();
                if (TextUtils.isEmpty(str2)) {
                    str2 = "unknown";
                }
                sb.append(str2);
                sb.append(": ");
                sb.append(e2.getMessage());
                list.add(sb.toString());
                str3 = "Unable to open target URL by system browser.";
            }
            sg.bigo.ads.common.t.a.a(2, "LinkUtils", str3);
            return false;
        }
    }

    public static boolean a(Context context, String str, JSONArray jSONArray) {
        int i2;
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            str = "http://".concat(str);
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                String strOptString = jSONArray.optString(i3);
                if (!TextUtils.isEmpty(strOptString) && a(context, str, strOptString, arrayList)) {
                    b.a("1", arrayList, strOptString, 1);
                    return true;
                }
            }
        }
        if (c.b(context, "com.android.chrome") == 1 && a(context, str, "com.android.chrome", arrayList)) {
            i2 = 2;
        } else {
            if (!a(context, str, (String) null, arrayList)) {
                b.a("0", arrayList, "", 0);
                return false;
            }
            i2 = 3;
        }
        b.a("1", arrayList, "", i2);
        return true;
    }

    public static boolean a(Uri uri, Context context, e eVar) {
        int i2;
        Intent intentA = a(uri);
        intentA.setPackage("com.android.vending");
        try {
            context.startActivity(intentA);
            eVar.f47023b = 1;
            return true;
        } catch (ActivityNotFoundException unused) {
            i2 = 2;
            eVar.f47023b = i2;
            try {
                context.startActivity(a(uri));
                return true;
            } catch (Exception e2) {
                sg.bigo.ads.common.t.a.a(0, "LinkUtils", e2.toString());
                return false;
            }
        } catch (Exception e3) {
            sg.bigo.ads.common.t.a.a(0, "LinkUtils", e3.toString());
            i2 = 4;
            eVar.f47023b = i2;
            context.startActivity(a(uri));
            return true;
        }
    }

    public static boolean a(Uri uri, Context context, e eVar, String str) {
        if (uri == null || uri.getScheme() == null || uri.getScheme().startsWith("http")) {
            return false;
        }
        eVar.f47025e = uri.toString();
        if (uri.getScheme().startsWith("market")) {
            Intent intentA = a(uri);
            intentA.setPackage("com.android.vending");
            try {
                context.startActivity(intentA);
                eVar.f47023b = 1;
                return true;
            } catch (ActivityNotFoundException unused) {
                eVar.f47023b = 2;
            } catch (Exception e2) {
                sg.bigo.ads.common.t.a.a(0, "LinkUtils", e2.toString());
                eVar.f47023b = 4;
            }
        }
        eVar.f = str;
        try {
            context.startActivity(a(uri));
            eVar.f47024c = 1;
            return true;
        } catch (ActivityNotFoundException unused2) {
            eVar.f47023b = 2;
            return false;
        } catch (Exception e3) {
            sg.bigo.ads.common.t.a.a(0, "LinkUtils", e3.toString());
            eVar.f47024c = 4;
            return false;
        }
    }

    public static boolean a(String str) {
        return str.startsWith("market://") || str.startsWith("http://play.google.com") || str.startsWith("https://play.google.com");
    }
}
