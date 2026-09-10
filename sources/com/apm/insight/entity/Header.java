package com.apm.insight.entity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.apm.insight.e;
import com.apm.insight.l.k;
import com.apm.insight.l.l;
import com.apm.insight.runtime.o;
import com.p004ironsource.d9;
import com.p004ironsource.fl;
import com.p004ironsource.ne;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.thinkup.core.common.n.mo;
import com.zg.adlib.storage.AppPreferencesKeys;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Header {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f10085a = {"version_code", "manifest_version_code", fl.SESSION_HISTORY_KEY_AD_ID, "update_version_code"};
    private static String d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10086e = -1;
    private static int f = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f10088c = new JSONObject();

    public Header(Context context) {
        this.f10087b = context;
    }

    public static Header a(Context context) {
        Header header = new Header(context);
        JSONObject jSONObject = header.f10088c;
        try {
            jSONObject.put(com.smartdigimkt.b0.a.s1, 20089);
            jSONObject.put("sdk_version_name", "2008-20250701130429");
        } catch (Exception unused) {
        }
        return header;
    }

    public static void addOtherHeader(JSONObject jSONObject) {
        Object obj;
        if (jSONObject == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (com.apm.insight.l.d.b()) {
                sb.append("MIUI-");
            } else if (com.apm.insight.l.d.c()) {
                sb.append("FLYME-");
            } else {
                String strA = com.apm.insight.l.d.a();
                if (com.apm.insight.l.d.a(strA)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(strA)) {
                    sb.append(strA);
                    sb.append(TokenBuilder.TOKEN_DELIMITER);
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
            if (sb.length() > 0) {
                jSONObject.put("rom", sb.toString());
            }
            jSONObject.put("rom_version", l.a());
        } catch (Throwable unused) {
        }
        try {
            DisplayMetrics displayMetrics = e.g().getResources().getDisplayMetrics();
            int i2 = displayMetrics.densityDpi;
            if (i2 == 120) {
                obj = "ldpi";
            } else if (i2 != 240) {
                obj = i2 != 320 ? "mdpi" : "xhdpi";
            } else {
                obj = "hdpi";
            }
            jSONObject.put("density_dpi", i2);
            jSONObject.put("display_density", obj);
            jSONObject.put("resolution", displayMetrics.heightPixels + "x" + displayMetrics.widthPixels);
        } catch (Exception unused2) {
        }
        try {
            String language = e.g().getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put("language", language);
            }
            int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put("timezone", rawOffset);
        } catch (Exception unused3) {
        }
        try {
            jSONObject.put(ne.f26256E, d9.d);
            jSONObject.put(AppPreferencesKeys.DEVICE_ID, e.c().a());
            String strConcat = Build.VERSION.RELEASE;
            if (!strConcat.contains(mo.ono)) {
                strConcat = strConcat.concat(".0");
            }
            jSONObject.put(com.smartdigimkt.b0.a.h1, strConcat);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            String str = Build.MODEL;
            String str2 = Build.BRAND;
            if (str == null) {
                str = str2;
            } else if (str2 != null && !str.contains(str2)) {
                str = str2 + ' ' + str;
            }
            jSONObject.put("device_model", str);
            jSONObject.put("device_brand", str2);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("cpu_abi", g());
            Context contextG = e.g();
            String packageName = contextG.getPackageName();
            jSONObject.put("package", packageName);
            PackageInfo packageInfo = contextG.getPackageManager().getPackageInfo(packageName, 0);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                int i3 = applicationInfo.labelRes;
                if (i3 > 0) {
                    jSONObject.put("display_name", contextG.getString(i3));
                } else {
                    jSONObject.put("display_name", contextG.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        d.a(jSONObject);
    }

    public static void addRuntimeHeader(JSONObject jSONObject) {
        try {
            jSONObject.put("access", k.a(e.g()));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) e.g().getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    jSONObject.put(ne.O0, networkOperatorName);
                }
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator)) {
                    return;
                }
                jSONObject.put("mcc_mnc", networkOperator);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static Header b(Context context) {
        Header headerA = a(context);
        a(headerA);
        b(headerA);
        headerA.c();
        headerA.d();
        headerA.e();
        return headerA;
    }

    private static String g() {
        if (d == null) {
            try {
                StringBuilder sb = new StringBuilder();
                if (Build.SUPPORTED_ABIS.length > 0) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = Build.SUPPORTED_ABIS;
                        if (i2 >= strArr.length) {
                            break;
                        }
                        sb.append(strArr[i2]);
                        if (i2 != strArr.length - 1) {
                            sb.append(", ");
                        }
                        i2++;
                    }
                } else {
                    sb = new StringBuilder(Build.CPU_ABI);
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    d = "unknown";
                }
                d = sb.toString();
            } catch (Exception e2) {
                com.apm.insight.a.b((Throwable) e2);
                d = "unknown";
            }
        }
        return d;
    }

    public final JSONObject c() {
        return a(e.a().a());
    }

    public final JSONObject d() {
        try {
            this.f10088c.put(AppPreferencesKeys.DEVICE_ID, e.c().a());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return this.f10088c;
    }

    public final JSONObject e() {
        try {
            long jF = e.a().f();
            if (jF > 0) {
                this.f10088c.put("user_id", jF);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return this.f10088c;
    }

    public final JSONObject f() {
        return this.f10088c;
    }

    public static boolean c(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return (jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null;
    }

    public static boolean d(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            String strOptString = jSONObject.optString(fl.SESSION_HISTORY_KEY_AD_ID);
            if (TextUtils.isEmpty(strOptString)) {
                return true;
            }
            try {
                return Integer.parseInt(strOptString) <= 0;
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    public static Header a(long j) {
        Header headerA;
        o oVarA = o.a();
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        JSONObject jSONObjectA = oVarA.a(j);
        if (jSONObjectA != null && jSONObjectA.length() != 0) {
            try {
                if (!jSONObjectA.has(fl.SESSION_HISTORY_KEY_AD_ID)) {
                    jSONObjectA.put(fl.SESSION_HISTORY_KEY_AD_ID, 4444);
                }
            } catch (Exception unused) {
            }
            headerA = new Header(e.g());
        } else {
            headerA = a(e.g());
            headerA.c();
            try {
                headerA.f10088c.put("errHeader", 1);
            } catch (Throwable unused2) {
            }
        }
        b(headerA);
        headerA.a(jSONObjectA);
        return headerA;
    }

    public static boolean b() {
        if (f == -1) {
            f = g().contains("86") ? 1 : 0;
        }
        return f == 1;
    }

    public static boolean b(JSONObject jSONObject) {
        return jSONObject.optInt("unauthentic_version", 0) == 1;
    }

    public static void b(Header header) {
        if (header == null) {
            return;
        }
        addOtherHeader(header.f10088c);
    }

    public static boolean a() {
        if (f10086e == -1) {
            f10086e = g().contains("64") ? 1 : 0;
        }
        return f10086e == 1;
    }

    public final JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this.f10088c;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                this.f10088c.put(next, jSONObject.opt(next));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return this.f10088c;
    }

    public final JSONObject a(Map<String, Object> map) {
        try {
            if (map == null) {
                return this.f10088c;
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (!this.f10088c.has(entry.getKey())) {
                    this.f10088c.put(entry.getKey(), entry.getValue());
                }
            }
            String[] strArr = f10085a;
            for (int i2 = 0; i2 < 4; i2++) {
                String str = strArr[i2];
                if (map.containsKey(str)) {
                    try {
                        this.f10088c.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                    } catch (Throwable unused) {
                        this.f10088c.put(str, map.get(str));
                    }
                }
            }
            if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
                try {
                    this.f10088c.put("manifest_version_code", Integer.parseInt(String.valueOf(map.get("version_code"))));
                } catch (Throwable unused2) {
                }
            }
            if (map.containsKey("iid")) {
                this.f10088c.put("udid", map.get("iid"));
                this.f10088c.remove("iid");
            }
            if (map.containsKey("version_name")) {
                this.f10088c.put("app_version", map.get("version_name"));
                this.f10088c.remove("version_name");
            }
        } catch (Throwable unused3) {
        }
        return this.f10088c;
    }

    public static Header a(Header header) {
        addRuntimeHeader(header.f10088c);
        return header;
    }
}
