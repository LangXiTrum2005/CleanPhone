package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.T3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f9227a = {7, 4, 2, 1, 11};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f9228b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f9229c = {15, 13};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f9230d = {20};

    public static boolean a(int i10) {
        return i10 < 200 || i10 >= 300;
    }

    public static String b(String str, com.applovin.impl.sdk.l lVar) {
        return a((String) lVar.a(z4.f10207n0), str, lVar);
    }

    public static Map c(com.applovin.impl.sdk.l lVar) {
        HashMap map = new HashMap();
        String str = (String) lVar.a(z4.f10172j);
        if (StringUtils.isValidString(str)) {
            map.put("device_token", str);
        } else if (!((Boolean) lVar.a(z4.f10227p5)).booleanValue()) {
            map.put("api_key", lVar.k0());
        }
        map.putAll(q7.a(lVar.B().e()));
        return map;
    }

    public static String d(com.applovin.impl.sdk.l lVar) {
        return a((String) lVar.a(z4.f10199m0), "4.0/ad", lVar);
    }

    public static String e(com.applovin.impl.sdk.l lVar) {
        return a((String) lVar.a(z4.f10190l0), "4.0/ad", lVar);
    }

    public static Long f(com.applovin.impl.sdk.l lVar) {
        r0.d dVarA = lVar.x().a();
        if (dVarA == null) {
            return null;
        }
        double dC = q7.c(dVarA.b());
        double d10 = q7.d(dVarA.a());
        if (d10 == 0.0d) {
            return null;
        }
        return Long.valueOf((long) (dC / d10));
    }

    public static String g(com.applovin.impl.sdk.l lVar) {
        NetworkInfo networkInfoB = b(com.applovin.impl.sdk.l.p());
        if (networkInfoB != null) {
            int type = networkInfoB.getType();
            int subtype = networkInfoB.getSubtype();
            if (type == 1) {
                return T3.f27210b;
            }
            if (type == 0) {
                if (a(subtype, f9227a)) {
                    return "2g";
                }
                if (a(subtype, f9228b)) {
                    return T3.f27209a;
                }
                if (a(subtype, f9229c)) {
                    return "4g";
                }
                return a(subtype, f9230d) ? "5g" : "mobile";
            }
        }
        return "unknown";
    }

    public static String a(String str, com.applovin.impl.sdk.l lVar) {
        return a((String) lVar.a(z4.f10215o0), str, lVar);
    }

    public static void b(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            lVar.b(b5.H, string);
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().d("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    public static void a(JSONObject jSONObject, boolean z10, com.applovin.impl.sdk.l lVar) {
        lVar.u().a(jSONObject, z10);
    }

    public static void a(int i10, com.applovin.impl.sdk.l lVar) {
        if (i10 == 401) {
            com.applovin.impl.sdk.p.h("AppLovinSdk", "SDK key \"" + lVar.k0() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
            return;
        }
        if (i10 == 418) {
            lVar.q0().a(z4.f10130e, Boolean.TRUE);
            lVar.q0().e();
        } else if (i10 >= 400 && i10 < 500) {
            if (((Boolean) lVar.a(z4.f10148g)).booleanValue()) {
                lVar.V0();
            }
        } else if (i10 == -1 && ((Boolean) lVar.a(z4.f10148g)).booleanValue()) {
            lVar.V0();
        }
    }

    private static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static void c(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (lVar != null) {
            try {
                if (jSONObject.has("settings")) {
                    a5 a5VarQ0 = lVar.q0();
                    if (jSONObject.isNull("settings")) {
                        return;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
                    a5VarQ0.a(jSONObject2);
                    a5VarQ0.e();
                    String strB = z4.N6.b();
                    if (JsonUtils.valueExists(jSONObject2, strB)) {
                        c5.b(b5.J, JsonUtils.getBoolean(jSONObject2, strB, Boolean.FALSE), com.applovin.impl.sdk.l.p());
                        return;
                    }
                    return;
                }
                return;
            } catch (JSONException e10) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("ConnectionUtils", "Unable to parse settings out of API response", e10);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static String b(com.applovin.impl.sdk.l lVar) {
        return a((String) lVar.a(z4.f10190l0), ((Boolean) lVar.a(z4.f10202m3)).booleanValue() ? "5.0/ad" : "4.0/ad", lVar);
    }

    public static String a(String str, String str2, com.applovin.impl.sdk.l lVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (lVar != null) {
            return str.concat(str2);
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.l.p()).edit();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    c5.a(next, object, (SharedPreferences) null, editorEdit);
                }
            }
            if (((Boolean) lVar.a(z4.J6)).booleanValue()) {
                c5.a(editorEdit);
            } else {
                editorEdit.apply();
            }
        }
    }

    public static byte[] a(InputStream inputStream, com.applovin.impl.sdk.l lVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) lVar.a(z4.f10143f3)).intValue()];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr, 0, i10);
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

    private static boolean a(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static String a(com.applovin.impl.sdk.l lVar) {
        return a((String) lVar.a(z4.f10199m0), ((Boolean) lVar.a(z4.f10202m3)).booleanValue() ? "5.0/ad" : "4.0/ad", lVar);
    }
}
