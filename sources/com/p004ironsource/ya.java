package com.p004ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.sdk.utils.IronSourceStorageUtils;
import com.p004ironsource.sdk.utils.Logger;
import com.p004ironsource.sdk.utils.SDKUtils;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f27779a = "ya";

    public static JSONObject a(Context context) {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        String limitAdTracking = SDKUtils.getLimitAdTracking();
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(f27779a, "add AID");
                jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            }
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(f27779a, "add LAT");
                jSONObject.put(d9.i.M, Boolean.parseBoolean(limitAdTracking));
                return jSONObject;
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return jSONObject;
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

    public static JSONObject c(Context context) {
        vf vfVarF = on.U().f();
        za zaVarB = za.b(context);
        JSONObject jSONObject = new JSONObject();
        try {
            String strD = zaVarB.d();
            if (strD != null) {
                jSONObject.put(SDKUtils.encodeString(d9.i.k), SDKUtils.encodeString(strD));
            }
            String strC = zaVarB.c();
            if (strC != null) {
                jSONObject.put(SDKUtils.encodeString(d9.i.f24755l), SDKUtils.encodeString(strC));
            }
            String strE = zaVarB.e();
            if (strE != null) {
                jSONObject.put(SDKUtils.encodeString(d9.i.m), SDKUtils.encodeString(strE));
            }
            String strF = zaVarB.f();
            if (strF != null) {
                jSONObject.put(SDKUtils.encodeString(d9.i.f24756n), strF.replaceAll("[^0-9/.]", ""));
            }
            String strF2 = zaVarB.f();
            if (strF2 != null) {
                jSONObject.put(SDKUtils.encodeString(d9.i.o), SDKUtils.encodeString(strF2));
            }
            jSONObject.put(SDKUtils.encodeString(d9.i.f24757p), String.valueOf(zaVarB.a()));
            jSONObject.put(SDKUtils.encodeString(d9.i.q), SDKUtils.encodeString(SDKUtils.getSDKVersion()));
            if (zaVarB.b() != null && zaVarB.b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(d9.i.r), SDKUtils.encodeString(zaVarB.b()));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(d9.i.x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            if (a(d9.i.j0)) {
                jSONObject.put(SDKUtils.encodeString(d9.i.j0), SDKUtils.encodeString(String.valueOf(vfVarF.h(context))));
            }
            String strG = b4.g(context);
            if (!TextUtils.isEmpty(strG)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strG));
            }
            String strValueOf = String.valueOf(vfVarF.h());
            if (!TextUtils.isEmpty(strValueOf)) {
                jSONObject.put(SDKUtils.encodeString(d9.i.K), SDKUtils.encodeString(strValueOf));
            }
            String strValueOf2 = String.valueOf(vfVarF.f());
            if (!TextUtils.isEmpty(strValueOf2)) {
                jSONObject.put(SDKUtils.encodeString(d9.i.O), SDKUtils.encodeString(strValueOf2));
            }
            jSONObject.put(SDKUtils.encodeString("gpi"), fq.d(context));
            jSONObject.put("mcc", z8.b(context));
            jSONObject.put("mnc", z8.c(context));
            jSONObject.put(SDKUtils.encodeString(d9.i.S), z8.f(context));
            jSONObject.put(SDKUtils.encodeString(d9.i.f24743R), SDKUtils.encodeString(z8.g(context)));
            jSONObject.put(SDKUtils.encodeString(d9.i.f24745V), b4.f(context));
            jSONObject.put(SDKUtils.encodeString(d9.i.X), b4.d(context));
            jSONObject.put(SDKUtils.encodeString(d9.i.W), SDKUtils.encodeString(b4.b(context)));
            jSONObject.put(SDKUtils.encodeString("stid"), fq.c(context));
            String strE2 = b4.e(context);
            if (!TextUtils.isEmpty(strE2)) {
                jSONObject.put(SDKUtils.encodeString(d9.i.f24750c0), SDKUtils.encodeString(strE2));
            }
            jSONObject.put(d9.i.f24751d0, SDKUtils.encodeString(String.valueOf(vfVarF.j())));
            jSONObject.put(d9.i.e0, SDKUtils.encodeString(String.valueOf(vfVarF.q())));
            String strN = vfVarF.n(context);
            if (!TextUtils.isEmpty(strN)) {
                jSONObject.put("icc", strN);
            }
            String strB = vfVarF.b();
            if (!TextUtils.isEmpty(strB)) {
                jSONObject.put("tz", SDKUtils.encodeString(strB));
            }
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
            return jSONObject;
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return jSONObject;
        }
    }

    private static void d(Context context, JSONObject jSONObject) {
        try {
            String strB = a9.b(context);
            String strD = a9.d(context);
            if (!TextUtils.isEmpty(strD)) {
                jSONObject.put(SDKUtils.encodeString(d9.i.f24758u), SDKUtils.encodeString(strD));
            }
            if (!TextUtils.isEmpty(strB) && !strB.equals("none")) {
                jSONObject.put(SDKUtils.encodeString(d9.i.t), SDKUtils.encodeString(strB));
            }
            jSONObject.put(SDKUtils.encodeString(d9.i.v), a9.e(context));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private static void e(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(d9.i.f24741P), za.b(context).a(context));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private static void f(Context context, JSONObject jSONObject) {
        vf vfVarF = on.U().f();
        try {
            if (a(d9.i.k0)) {
                jSONObject.put(SDKUtils.encodeString(d9.i.k0), vfVarF.J(context));
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private static void g(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(ne.X0), on.U().f().q(context));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private static void h(Context context, JSONObject jSONObject) {
        vf vfVarF = on.U().f();
        try {
            if (a(d9.i.n0)) {
                jSONObject.put(SDKUtils.encodeString(d9.i.n0), vfVarF.d(context));
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private static void a(Context context, JSONObject jSONObject) {
        vf vfVarF = on.U().f();
        try {
            if (a(d9.i.m0)) {
                jSONObject.put(SDKUtils.encodeString(d9.i.m0), vfVarF.c(context));
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private static void b(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(d9.i.f24746Y), on.U().f().y(context));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private static void c(Context context, JSONObject jSONObject) {
        vf vfVarF = on.U().f();
        try {
            if (a(d9.i.l0)) {
                jSONObject.put(SDKUtils.encodeString(d9.i.l0), vfVarF.l(context));
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private static void a(JSONObject jSONObject) {
        vf vfVarF = on.U().f();
        try {
            a(jSONObject, d9.i.H, String.valueOf(vfVarF.d()));
            a(jSONObject, d9.i.f24738I, String.valueOf(vfVarF.k()));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private static void b(JSONObject jSONObject) {
        vf vfVarF = on.U().f();
        try {
            if (a(d9.i.i0)) {
                jSONObject.put(SDKUtils.encodeString(d9.i.i0), vfVarF.c());
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private static void c(JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(d9.i.y), SDKUtils.encodeString(String.valueOf(on.U().f().o())));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            jSONObject.put(str, SDKUtils.encodeString(str2));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private static boolean a(String str) {
        return SDKUtils.getControllerConfigAsJSONObject().optBoolean(str);
    }
}
