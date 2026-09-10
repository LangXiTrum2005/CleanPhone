package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.zg.adlib.storage.AppPreferencesKeys;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f15744a;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f15745b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject invoke() {
            return new JSONObject();
        }
    }

    public zg(Function0 jsonFactory) {
        Intrinsics.f(jsonFactory, "jsonFactory");
        this.f15744a = jsonFactory;
    }

    public final JSONObject a(JSONObject jSONObject, ch chVar) {
        Object objA;
        String strB;
        String strA;
        String strG;
        ug.a aVarC;
        JSONObject jSONObjectPut;
        try {
            String lowerCase = chVar.a().toLowerCase(Locale.ROOT);
            Intrinsics.e(lowerCase, "toLowerCase(...)");
            jSONObject.put("ad_type", lowerCase);
            ug ugVarK = chVar.k();
            if (ugVarK == null || (strB = ugVarK.b()) == null) {
                strB = "missing impression id";
            }
            jSONObject.put("ad_impression_id", strB);
            ug ugVarK2 = chVar.k();
            if (ugVarK2 == null || (strA = ugVarK2.a()) == null) {
                strA = "missing creative id";
            }
            jSONObject.put("ad_creative_id", strA);
            jSONObject.put("ad_location_id", chVar.c());
            ug ugVarK3 = chVar.k();
            if (ugVarK3 == null || (strG = ugVarK3.g()) == null) {
                strG = "";
            }
            jSONObject.put("template_url", strG);
            ug ugVarK4 = chVar.k();
            if (ugVarK4 == null || (aVarC = ugVarK4.c()) == null) {
                objA = null;
            } else {
                jSONObject.put("ad_height", aVarC.getHeight());
                jSONObjectPut = jSONObject.put("ad_width", aVarC.getWidth());
            }
            if (objA == null) {
                objA = jSONObjectPut;
                objA = jSONObject;
            }
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        objA = jSONObjectPut;
        Throwable thA = Result.a(objA);
        if (thA != null) {
            za.b("Cannot generate tracking body data: ", thA);
        }
        Object obj = jSONObject;
        if (Result.a(objA) == null) {
            obj = objA;
        }
        return (JSONObject) obj;
    }

    public final JSONObject b(JSONObject jSONObject, ch chVar) {
        Object objA;
        try {
            jSONObject.put(com.smartdigimkt.q0.b.S0, chVar.f().getValue());
            jSONObject.put("event_message", chVar.e());
            jSONObject.put(com.thinkup.core.common.oo.o.C0684o.m, chVar.l().name());
            jSONObject.put("event_timestamp", chVar.j());
            JSONObject jSONObjectPut = jSONObject.put("event_latency", chVar.b());
            objA = jSONObjectPut;
            if (jSONObjectPut == null) {
                objA = jSONObject;
            }
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            za.b("Cannot generate tracking body data: ", thA);
        }
        Object obj = jSONObject;
        if (Result.a(objA) == null) {
            obj = objA;
        }
        return (JSONObject) obj;
    }

    public final JSONObject c(JSONObject jSONObject, ch chVar) {
        Object objA;
        JSONObject jSONObjectPut;
        try {
            Mediation mediationD = chVar.d();
            if (mediationD != null) {
                jSONObject.put("mediation_sdk", mediationD.mediationType);
                jSONObject.put("mediation_sdk_version", mediationD.libraryVersion);
                jSONObjectPut = jSONObject.put("mediation_sdk_adapter_version", mediationD.adapterVersion);
            } else {
                objA = null;
            }
            if (objA == null) {
                objA = jSONObjectPut;
                objA = jSONObject;
            }
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        objA = jSONObjectPut;
        Throwable thA = Result.a(objA);
        if (thA != null) {
            za.b("Cannot generate tracking body data: ", thA);
        }
        Object obj = jSONObject;
        if (Result.a(objA) == null) {
            obj = objA;
        }
        return (JSONObject) obj;
    }

    public /* synthetic */ zg(Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? a.f15745b : function0);
    }

    public final JSONObject c(JSONObject jSONObject, s6 s6Var) {
        Object objA;
        try {
            jSONObject.put("session_id", s6Var.B());
            JSONObject jSONObjectPut = jSONObject.put("session_count", s6Var.z());
            objA = jSONObjectPut;
            if (jSONObjectPut == null) {
                objA = jSONObject;
            }
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            za.b("Cannot generate tracking body data: ", thA);
        }
        Object obj = jSONObject;
        if (Result.a(objA) == null) {
            obj = objA;
        }
        return (JSONObject) obj;
    }

    public final JSONObject b(JSONObject jSONObject, s6 s6Var) {
        Object objA;
        try {
            jSONObject.put("app_id", s6Var.a());
            JSONObject jSONObjectPut = jSONObject.put("chartboost_sdk_version", s6Var.g());
            objA = jSONObjectPut;
            if (jSONObjectPut == null) {
                objA = jSONObject;
            }
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            za.b("Cannot generate tracking body data: ", thA);
        }
        Object obj = jSONObject;
        if (Result.a(objA) == null) {
            obj = objA;
        }
        return (JSONObject) obj;
    }

    public final JSONObject a(JSONObject jSONObject, s6 s6Var) {
        Object objA;
        try {
            jSONObject.put(AppPreferencesKeys.DEVICE_ID, s6Var.m());
            jSONObject.put("device_make", s6Var.p());
            jSONObject.put("device_model", s6Var.q());
            jSONObject.put("device_os_version", s6Var.t());
            jSONObject.put("device_platform", s6Var.u());
            jSONObject.put("device_country", s6Var.l());
            jSONObject.put("device_connection_type", s6Var.k());
            JSONObject jSONObjectPut = jSONObject.put("device_orientation", s6Var.s());
            objA = jSONObjectPut;
            if (jSONObjectPut == null) {
                objA = jSONObject;
            }
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            za.b("Cannot generate tracking body data: ", thA);
        }
        Object obj = jSONObject;
        if (Result.a(objA) == null) {
            obj = objA;
        }
        return (JSONObject) obj;
    }

    public final int b(s6 s6Var, String str) {
        if (Intrinsics.a(str, y.b.g.b())) {
            return s6Var.D();
        }
        if (Intrinsics.a(str, y.c.g.b())) {
            return s6Var.E();
        }
        if (Intrinsics.a(str, y.a.g.b())) {
            return s6Var.C();
        }
        return 0;
    }

    public final JSONObject a(JSONObject jSONObject, s6 s6Var, String str) {
        Object objA;
        try {
            JSONObject jSONObjectPut = jSONObject.put("payload", a(s6Var, str));
            objA = jSONObjectPut;
            if (jSONObjectPut == null) {
                objA = jSONObject;
            }
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            za.b("Cannot generate tracking body data: ", thA);
        }
        Object obj = jSONObject;
        if (Result.a(objA) == null) {
            obj = objA;
        }
        return (JSONObject) obj;
    }

    public final String a(ch event, s6 environment) {
        Intrinsics.f(event, "event");
        Intrinsics.f(environment, "environment");
        String string = a(a(a(c(c(b(b((JSONObject) this.f15744a.invoke(), environment), event), environment), event), event), environment), environment, event.a()).toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public final JSONObject a(s6 s6Var, String str) {
        Object objA;
        JSONObject jSONObject = (JSONObject) this.f15744a.invoke();
        try {
            jSONObject.put("device_battery_level", s6Var.i());
            jSONObject.put("device_charging_status", s6Var.j());
            jSONObject.put("device_language", s6Var.n());
            jSONObject.put("device_timezone", s6Var.w());
            jSONObject.put("device_volume", s6Var.y());
            jSONObject.put("device_mute", s6Var.r());
            jSONObject.put("device_audio_output", s6Var.h());
            jSONObject.put("device_storage", s6Var.v());
            jSONObject.put("device_low_memory_warning", s6Var.o());
            jSONObject.put("device_up_time", s6Var.x());
            jSONObject.put("chartboost_sdk_autocache_enabled", s6Var.b());
            jSONObject.put("chartboost_sdk_gdpr", s6Var.e());
            jSONObject.put("chartboost_sdk_ccpa", s6Var.c());
            jSONObject.put("chartboost_sdk_coppa", s6Var.d());
            jSONObject.put("chartboost_sdk_lgpd", s6Var.f());
            jSONObject.put("session_duration", s6Var.A());
            JSONObject jSONObjectPut = jSONObject.put("session_impression_count", b(s6Var, str));
            objA = jSONObjectPut;
            if (jSONObjectPut == null) {
                objA = jSONObject;
            }
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            za.b("Cannot generate tracking body data: ", thA);
        }
        Object obj = jSONObject;
        if (Result.a(objA) == null) {
            obj = objA;
        }
        return (JSONObject) obj;
    }
}
