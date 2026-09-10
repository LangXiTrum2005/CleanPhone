package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.p004ironsource.z8;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0958r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f11544a = {7, 4, 2, 1, 11};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f11545b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f11546c = {15, 13};
    private static final int[] d = {20};

    public static boolean a(int i2) {
        return i2 < 200 || i2 >= 300;
    }

    public static String b(String str, com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(x4.n0), str, kVar);
    }

    public static Map c(com.applovin.impl.sdk.k kVar) {
        HashMap map = new HashMap();
        String str = (String) kVar.a(x4.j);
        if (StringUtils.isValidString(str)) {
            map.put("device_token", str);
        } else if (!((Boolean) kVar.a(x4.k5)).booleanValue()) {
            map.put("api_key", kVar.i0());
        }
        map.putAll(n7.a(kVar.A().e()));
        return map;
    }

    public static String d(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(x4.m0), "4.0/ad", kVar);
    }

    public static String e(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(x4.l0), "4.0/ad", kVar);
    }

    public static Long f(com.applovin.impl.sdk.k kVar) {
        C0957q0.d dVarA = kVar.w().a();
        if (dVarA == null) {
            return null;
        }
        double dC = n7.c(dVarA.b());
        double d2 = n7.d(dVarA.a());
        if (d2 == 0.0d) {
            return null;
        }
        return Long.valueOf((long) (dC / d2));
    }

    public static String g(com.applovin.impl.sdk.k kVar) {
        NetworkInfo networkInfoB = b(com.applovin.impl.sdk.k.o());
        if (networkInfoB != null) {
            int type = networkInfoB.getType();
            int subtype = networkInfoB.getSubtype();
            if (type == 1) {
                return z8.f27869b;
            }
            if (type == 0) {
                if (a(subtype, f11544a)) {
                    return "2g";
                }
                if (a(subtype, f11545b)) {
                    return z8.f27868a;
                }
                if (a(subtype, f11546c)) {
                    return "4g";
                }
                return a(subtype, d) ? "5g" : "mobile";
            }
        }
        return "unknown";
    }

    public static String a(String str, com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(x4.o0), str, kVar);
    }

    public static void b(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            kVar.b(z4.H, string);
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().d("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    public static void a(JSONObject jSONObject, boolean z2, com.applovin.impl.sdk.k kVar) {
        kVar.t().a(jSONObject, z2);
    }

    public static void a(int i2, com.applovin.impl.sdk.k kVar) {
        if (i2 == 401) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "SDK key \"" + kVar.i0() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
            return;
        }
        if (i2 == 418) {
            kVar.o0().a(x4.f12073e, Boolean.TRUE);
            kVar.o0().e();
        } else if (i2 >= 400 && i2 < 500) {
            if (((Boolean) kVar.a(x4.g)).booleanValue()) {
                kVar.T0();
            }
        } else if (i2 == -1 && ((Boolean) kVar.a(x4.g)).booleanValue()) {
            kVar.T0();
        }
    }

    private static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static void c(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (kVar != null) {
            try {
                if (jSONObject.has("settings")) {
                    y4 y4VarO0 = kVar.o0();
                    if (jSONObject.isNull("settings")) {
                        return;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
                    y4VarO0.a(jSONObject2);
                    y4VarO0.e();
                    String strB = x4.J6.b();
                    if (JsonUtils.valueExists(jSONObject2, strB)) {
                        a5.b(z4.f12167J, JsonUtils.getBoolean(jSONObject2, strB, Boolean.FALSE), com.applovin.impl.sdk.k.o());
                        return;
                    }
                    return;
                }
                return;
            } catch (JSONException e2) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("ConnectionUtils", "Unable to parse settings out of API response", e2);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static String b(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(x4.l0), ((Boolean) kVar.a(x4.h3)).booleanValue() ? "5.0/ad" : "4.0/ad", kVar);
    }

    public static String a(String str, String str2, com.applovin.impl.sdk.k kVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (kVar != null) {
            return str.concat(str2);
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.o()).edit();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    a5.a(next, object, (SharedPreferences) null, editorEdit);
                }
            }
            if (((Boolean) kVar.a(x4.F6)).booleanValue()) {
                a5.a(editorEdit);
            } else {
                editorEdit.apply();
            }
        }
    }

    public static byte[] a(InputStream inputStream, com.applovin.impl.sdk.k kVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) kVar.a(x4.a3)).intValue()];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 > 0) {
                byteArrayOutputStream.write(bArr, 0, i2);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static boolean a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo networkInfoB = b(context);
        if (networkInfoB != null) {
            return networkInfoB.isConnected();
        }
        return false;
    }

    private static boolean a(int i2, int[] iArr) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(x4.m0), ((Boolean) kVar.a(x4.h3)).booleanValue() ? "5.0/ad" : "4.0/ad", kVar);
    }
}
