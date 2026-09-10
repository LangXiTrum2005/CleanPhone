package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class W4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f27525a = "W4";

    public static JSONObject a(Context context) {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        String limitAdTracking = SDKUtils.getLimitAdTracking();
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(f27525a, "add AID");
                jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            }
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(f27525a, "add LAT");
                jSONObject.put(X3.j.M, Boolean.parseBoolean(limitAdTracking));
            }
            return jSONObject;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    public static JSONObject b(Context context) {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        d(context, jSONObject);
        c(jSONObject);
        b(context, jSONObject);
        g(context, jSONObject);
        e(context, jSONObject);
        b(jSONObject);
        f(context, jSONObject);
        c(context, jSONObject);
        a(context, jSONObject);
        h(context, jSONObject);
        return jSONObject;
    }

    private static void c(JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(X3.j.f27867y), SDKUtils.encodeString(String.valueOf(Kb.Y().a().h())));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void d(Context context, JSONObject jSONObject) {
        try {
            String strB = U3.b(context);
            String strD = U3.d(context);
            if (!TextUtils.isEmpty(strD)) {
                jSONObject.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(strD));
            }
            if (!TextUtils.isEmpty(strB) && !strB.equals("none")) {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(strB));
            }
            jSONObject.put(SDKUtils.encodeString(X3.j.f27864v), U3.e(context));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void e(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(X3.j.P), X4.b(context).a(context));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void f(Context context, JSONObject jSONObject) {
        InterfaceC0674y7 interfaceC0674y7A = Kb.Y().a();
        try {
            if (a(X3.j.f27848k0)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27848k0), interfaceC0674y7A.D(context));
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void g(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(O6.f26698a1), Kb.Y().a().J(context));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void h(Context context, JSONObject jSONObject) {
        InterfaceC0674y7 interfaceC0674y7A = Kb.Y().a();
        try {
            if (a(X3.j.f27853n0)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27853n0), interfaceC0674y7A.i(context));
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void c(Context context, JSONObject jSONObject) {
        InterfaceC0674y7 interfaceC0674y7A = Kb.Y().a();
        try {
            if (a(X3.j.f27849l0)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27849l0), interfaceC0674y7A.E(context));
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void b(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(X3.j.Y), Kb.Y().a().l(context));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            jSONObject.put(str, SDKUtils.encodeString(str2));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public static JSONObject c(Context context) {
        InterfaceC0674y7 interfaceC0674y7A = Kb.Y().a();
        X4 x4B = X4.b(context);
        JSONObject jSONObject = new JSONObject();
        try {
            String strD = x4B.d();
            if (strD != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(strD));
            }
            String strC = x4B.c();
            if (strC != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(strC));
            }
            String strE = x4B.e();
            if (strE != null) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27850m), SDKUtils.encodeString(strE));
            }
            String strF = x4B.f();
            if (strF != null) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27852n), strF.replaceAll("[^0-9/.]", ""));
            }
            String strF2 = x4B.f();
            if (strF2 != null) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27854o), SDKUtils.encodeString(strF2));
            }
            jSONObject.put(SDKUtils.encodeString(X3.j.f27856p), String.valueOf(x4B.a()));
            jSONObject.put(SDKUtils.encodeString(X3.j.f27858q), SDKUtils.encodeString(SDKUtils.getSDKVersion()));
            if (x4B.b() != null && x4B.b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27860r), SDKUtils.encodeString(x4B.b()));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27866x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            if (a(X3.j.f27846j0)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27846j0), SDKUtils.encodeString(String.valueOf(interfaceC0674y7A.r(context))));
            }
            String strG = E1.g(context);
            if (!TextUtils.isEmpty(strG)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strG));
            }
            String strValueOf = String.valueOf(interfaceC0674y7A.r());
            if (!TextUtils.isEmpty(strValueOf)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.K), SDKUtils.encodeString(strValueOf));
            }
            String strValueOf2 = String.valueOf(interfaceC0674y7A.p());
            if (!TextUtils.isEmpty(strValueOf2)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.O), SDKUtils.encodeString(strValueOf2));
            }
            jSONObject.put("mcc", T3.b(context));
            jSONObject.put("mnc", T3.c(context));
            jSONObject.put(SDKUtils.encodeString(X3.j.S), T3.f(context));
            jSONObject.put(SDKUtils.encodeString(X3.j.R), SDKUtils.encodeString(T3.g(context)));
            jSONObject.put(SDKUtils.encodeString(X3.j.V), E1.f(context));
            jSONObject.put(SDKUtils.encodeString(X3.j.X), E1.d(context));
            jSONObject.put(SDKUtils.encodeString(X3.j.W), SDKUtils.encodeString(E1.b(context)));
            String strE2 = E1.e(context);
            if (!TextUtils.isEmpty(strE2)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27833c0), SDKUtils.encodeString(strE2));
            }
            jSONObject.put(X3.j.f27835d0, SDKUtils.encodeString(String.valueOf(interfaceC0674y7A.a())));
            jSONObject.put(X3.j.f27837e0, SDKUtils.encodeString(String.valueOf(interfaceC0674y7A.m())));
            String strH = interfaceC0674y7A.H(context);
            if (!TextUtils.isEmpty(strH)) {
                jSONObject.put("icc", strH);
            }
            String strD2 = interfaceC0674y7A.d();
            if (!TextUtils.isEmpty(strD2)) {
                jSONObject.put("tz", SDKUtils.encodeString(strD2));
            }
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
            return jSONObject;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    private static boolean a(String str) {
        return SDKUtils.getControllerConfigAsJSONObject().optBoolean(str);
    }

    private static void a(JSONObject jSONObject) {
        InterfaceC0674y7 interfaceC0674y7A = Kb.Y().a();
        try {
            a(jSONObject, X3.j.H, String.valueOf(interfaceC0674y7A.k()));
            a(jSONObject, X3.j.I, String.valueOf(interfaceC0674y7A.c()));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void b(JSONObject jSONObject) {
        InterfaceC0674y7 interfaceC0674y7A = Kb.Y().a();
        try {
            if (a(X3.j.f27844i0)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27844i0), interfaceC0674y7A.j());
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void a(Context context, JSONObject jSONObject) {
        InterfaceC0674y7 interfaceC0674y7A = Kb.Y().a();
        try {
            if (a(X3.j.f27851m0)) {
                jSONObject.put(SDKUtils.encodeString(X3.j.f27851m0), interfaceC0674y7A.f(context));
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }
}
