package ads_mobile_sdk;

import android.util.Base64;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.google.android.gms.ads.AdSize;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.capsulated;
import saneness.derbyshire;
import saneness.dishoard;
import saneness.don;
import saneness.flavin;
import saneness.ginshop;
import saneness.juju;
import saneness.stupefactive;

/* JADX INFO: loaded from: classes.dex */
public final class jk0 extends zk {
    public static final JsonObject A;
    public static final JsonObject B;
    public static final JsonObject C;
    public static final JsonObject D;
    public static final JsonObject E;
    public static final JsonObject y;
    public static final JsonObject z;
    public final derbyshire r;
    public final dishoard s;
    public final flavin t;
    public final capsulated u;
    public boolean v;
    public double w;
    public int x;

    static {
        don donVar = new don();
        JsonObject jsonObject = new JsonObject();
        to0 to0Var = to0.AD_ID_INFO;
        jsonObject.addProperty(String.valueOf(to0Var.getNumber()), (Number) 500);
        to0 to0Var2 = to0.AD_REQUEST;
        zs2 zs2Var = zs2.b;
        don.attabal(donVar, jsonObject, to0Var2, zs2Var);
        to0 to0Var3 = to0.AD_SPAM;
        zs2 zs2Var2 = zs2.e;
        don.attabal(donVar, jsonObject, to0Var3, zs2Var2);
        don.attabal(donVar, jsonObject, to0.AD_SIZE, zs2Var);
        don.attabal(donVar, jsonObject, to0.AD_TYPE, zs2Var);
        don.attabal(donVar, jsonObject, to0.APP_OPEN, zs2Var);
        don.attabal(donVar, jsonObject, to0.APP_PERMISSIONS, zs2Var);
        don.attabal(donVar, jsonObject, to0.APP_SET_ID, zs2Var);
        to0 to0Var4 = to0.AUDIO;
        zs2 zs2Var3 = zs2.d;
        don.attabal(donVar, jsonObject, to0Var4, zs2Var3);
        to0 to0Var5 = to0.BATTERY;
        don.attabal(donVar, jsonObject, to0Var5, zs2Var);
        to0 to0Var6 = to0.CLD;
        zs2 zs2Var4 = zs2.c;
        don.attabal(donVar, jsonObject, to0Var6, zs2Var4);
        don.attabal(donVar, jsonObject, to0.DEBUG_SIGNAL, zs2Var);
        don.attabal(donVar, jsonObject, to0.EXPERIMENT_IDS, zs2Var);
        don.attabal(donVar, jsonObject, to0.IN_MEMORY_SDK_CORE_DATA, zs2Var);
        don.attabal(donVar, jsonObject, to0.MEMORY, zs2Var);
        don.attabal(donVar, jsonObject, to0.OMID, zs2Var);
        don.attabal(donVar, jsonObject, to0.PACKAGE_INFO, zs2Var);
        don.attabal(donVar, jsonObject, to0.PER_APP_ID_V1, zs2Var);
        don.attabal(donVar, jsonObject, to0.PER_APP_ID_V2, zs2Var);
        don.attabal(donVar, jsonObject, to0.STATIC_DEVICE, zs2Var);
        don.attabal(donVar, jsonObject, to0.TELEPHONY, zs2Var);
        don.attabal(donVar, jsonObject, to0.CONSENT_STRINGS, zs2Var);
        don.attabal(donVar, jsonObject, to0.AD_ID_PERMISSION, zs2Var);
        don.attabal(donVar, jsonObject, to0.QUALITY, zs2Var);
        don.attabal(donVar, jsonObject, to0.REQUEST_ID, zs2Var);
        don.attabal(donVar, jsonObject, to0.SDK_ENV, zs2Var);
        don.attabal(donVar, jsonObject, to0.ADAPTER_VERSIONS, zs2Var);
        don.attabal(donVar, jsonObject, to0.RTB_SIGNAL, zs2Var2);
        don.attabal(donVar, jsonObject, to0.SESSION_ID, zs2Var);
        to0 to0Var7 = to0.TRUSTLESS_TOKEN;
        don.attabal(donVar, jsonObject, to0Var7, zs2Var);
        to0 to0Var8 = to0.AD_SERVICES_EXTENSION_VERSION;
        don.attabal(donVar, jsonObject, to0Var8, zs2Var);
        don.attabal(donVar, jsonObject, to0.FIREBASE_ANALYTICS, zs2Var4);
        don.attabal(donVar, jsonObject, to0.INSPECTOR_SIGNAL, zs2Var4);
        don.attabal(donVar, jsonObject, to0.AMAZON_FIRE_AD_ID, zs2Var);
        don.attabal(donVar, jsonObject, to0.DISPLAY_COUNT, zs2Var);
        don.attabal(donVar, jsonObject, to0.CSRB_ECO_DATA, zs2Var);
        don.attabal(donVar, jsonObject, to0.PARENT_AD_CONFIG, zs2Var);
        don.attabal(donVar, jsonObject, to0.TOPICS, zs2Var4);
        don.attabal(donVar, jsonObject, to0.NATIVE_AD, zs2Var4);
        don.attabal(donVar, jsonObject, to0.ICON_AD, zs2Var);
        to0 to0Var9 = to0.UNDEFINED;
        don.attabal(donVar, jsonObject, to0Var9, zs2Var4);
        don.attabal(donVar, jsonObject, to0.AD_RESPONSE_ENCRYPTION_KEY, zs2Var3);
        don.attabal(donVar, jsonObject, to0.SCAR_SIGNAL_TYPE, zs2Var);
        y = jsonObject;
        JsonObject jsonObject2 = new JsonObject();
        String strValueOf = String.valueOf(to0Var.getNumber());
        Boolean bool = Boolean.TRUE;
        jsonObject2.addProperty(strValueOf, bool);
        String strValueOf2 = String.valueOf(to0Var8.getNumber());
        Boolean bool2 = Boolean.FALSE;
        jsonObject2.addProperty(strValueOf2, bool2);
        jsonObject2.addProperty(String.valueOf(to0Var4.getNumber()), bool2);
        jsonObject2.addProperty(String.valueOf(to0Var5.getNumber()), bool2);
        jsonObject2.addProperty(String.valueOf(to0Var7.getNumber()), bool2);
        jsonObject2.addProperty(String.valueOf(to0Var9.getNumber()), bool2);
        z = jsonObject2;
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty(String.valueOf(to0Var.getNumber()), bool);
        jsonObject3.addProperty(String.valueOf(to0Var8.getNumber()), bool2);
        jsonObject3.addProperty(String.valueOf(to0Var4.getNumber()), bool2);
        jsonObject3.addProperty(String.valueOf(to0Var5.getNumber()), bool2);
        jsonObject3.addProperty(String.valueOf(to0Var7.getNumber()), bool2);
        jsonObject3.addProperty(String.valueOf(to0Var9.getNumber()), bool2);
        A = jsonObject3;
        JsonObject jsonObject4 = new JsonObject();
        jsonObject4.addProperty(String.valueOf(to0Var.getNumber()), (Number) 0);
        jsonObject4.addProperty(String.valueOf(to0Var8.getNumber()), (Number) 0);
        jsonObject4.addProperty(String.valueOf(to0Var4.getNumber()), (Number) 0);
        jsonObject4.addProperty(String.valueOf(to0Var5.getNumber()), (Number) 0);
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        jsonObject4.addProperty(String.valueOf(to0Var7.getNumber()), Long.valueOf(p002kotlin.time.saneness.adultoid(p002kotlin.time.dern.molybdenite(30, durationUnit))));
        jsonObject4.addProperty(String.valueOf(to0Var9.getNumber()), (Number) 0);
        B = jsonObject4;
        JsonObject jsonObject5 = new JsonObject();
        DurationUnit durationUnit2 = DurationUnit.MINUTES;
        jsonObject5.addProperty(String.valueOf(to0Var.getNumber()), Long.valueOf(p002kotlin.time.saneness.adultoid(p002kotlin.time.dern.molybdenite(10, durationUnit2))));
        jsonObject5.addProperty(String.valueOf(to0Var8.getNumber()), Long.valueOf(p002kotlin.time.saneness.adultoid(p002kotlin.time.dern.molybdenite(365, DurationUnit.DAYS))));
        jsonObject5.addProperty(String.valueOf(to0Var4.getNumber()), Long.valueOf(p002kotlin.time.saneness.adultoid(p002kotlin.time.dern.molybdenite(30, durationUnit))));
        jsonObject5.addProperty(String.valueOf(to0Var5.getNumber()), Long.valueOf(p002kotlin.time.saneness.adultoid(p002kotlin.time.dern.molybdenite(5, durationUnit2))));
        jsonObject5.addProperty(String.valueOf(to0Var7.getNumber()), Long.valueOf(p002kotlin.time.saneness.adultoid(p002kotlin.time.dern.molybdenite(AdSize.MEDIUM_RECTANGLE_WIDTH, durationUnit))));
        jsonObject5.addProperty(String.valueOf(to0Var9.getNumber()), (Number) 0);
        C = jsonObject5;
        JsonObject jsonObject6 = new JsonObject();
        jsonObject6.addProperty(String.valueOf(to0Var.getNumber()), bool);
        jsonObject6.addProperty(String.valueOf(to0Var8.getNumber()), bool2);
        jsonObject6.addProperty(String.valueOf(to0Var4.getNumber()), bool2);
        jsonObject6.addProperty(String.valueOf(to0Var5.getNumber()), bool2);
        jsonObject6.addProperty(String.valueOf(to0Var7.getNumber()), bool);
        jsonObject6.addProperty(String.valueOf(to0Var9.getNumber()), bool2);
        D = jsonObject6;
        JsonObject jsonObject7 = new JsonObject();
        jsonObject7.addProperty(String.valueOf(to0Var.getNumber()), bool2);
        jsonObject7.addProperty(String.valueOf(to0Var8.getNumber()), bool2);
        jsonObject7.addProperty(String.valueOf(to0Var4.getNumber()), bool2);
        jsonObject7.addProperty(String.valueOf(to0Var5.getNumber()), bool2);
        jsonObject7.addProperty(String.valueOf(to0Var7.getNumber()), bool2);
        jsonObject7.addProperty(String.valueOf(to0Var9.getNumber()), bool2);
        E = jsonObject7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk0(derbyshire consentFlags, dishoard sdkCoreFlags, flavin safeAreaFlags, capsulated adShieldFlags, stupefactive flagValueProvider) {
        super(flagValueProvider);
        Intrinsics.checkNotNullParameter(consentFlags, "consentFlags");
        Intrinsics.checkNotNullParameter(sdkCoreFlags, "sdkCoreFlags");
        Intrinsics.checkNotNullParameter(safeAreaFlags, "safeAreaFlags");
        Intrinsics.checkNotNullParameter(adShieldFlags, "adShieldFlags");
        Intrinsics.checkNotNullParameter(flagValueProvider, "flagValueProvider");
        this.r = consentFlags;
        this.s = sdkCoreFlags;
        this.t = safeAreaFlags;
        this.u = adShieldFlags;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(jk0 jk0Var, CoroutineContext coroutineContext, saran saranVar, wretchedly.dern dernVar) {
        gk0 gk0Var;
        if (dernVar instanceof gk0) {
            gk0Var = (gk0) dernVar;
            int i = gk0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gk0Var.d = i - Integer.MIN_VALUE;
            } else {
                gk0Var = new gk0(jk0Var, dernVar);
            }
        } else {
            gk0Var = new gk0(jk0Var, dernVar);
        }
        Object obj = gk0Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = gk0Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            stupefactive stupefactiveVar = jk0Var.a;
            gk0Var.a = jk0Var;
            gk0Var.d = 1;
            ik ikVar = (ik) stupefactiveVar;
            ikVar.getClass();
            Object objCompetently = impromptu.competently(coroutineContext, new xj(ikVar, saranVar, null), gk0Var);
            if (objCompetently != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                objCompetently = Unit.f29295attabal;
            }
            if (objCompetently == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jk0Var = gk0Var.a;
            p002kotlin.dern.saneness(obj);
        }
        Boolean bool = (Boolean) ((ik) jk0Var.a).a("gads:csrb:enabled", zk.b);
        jk0Var.v = bool != null ? bool.booleanValue() : true;
        Double d = (Double) ((ik) jk0Var.a).a("gads:csrb_abtest_enabled:ratio", hk0.a);
        jk0Var.w = d != null ? d.doubleValue() : 0.0d;
        Integer num = (Integer) ((ik) jk0Var.a).a("gads:csrb_break_glass_mode", ik0.a);
        jk0Var.x = num != null ? num.intValue() : 0;
        return Unit.f29295attabal;
    }

    public final List B() {
        List defaultValue = graveside.marial("2");
        Intrinsics.checkNotNullParameter("gad:scar_encryption:enabled_list", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (List) a("gad:scar_encryption:enabled_list", defaultValue, zk.g);
    }

    public final String C() {
        Intrinsics.checkNotNullParameter("gads:firebase_analytics_class_name", X3.i.W);
        Intrinsics.checkNotNullParameter("com.google.android.gms.measurement.api.AppMeasurementSdk", "defaultValue");
        return (String) a("gads:firebase_analytics_class_name", "com.google.android.gms.measurement.api.AppMeasurementSdk", zk.o);
    }

    public final boolean D() {
        return this.v;
    }

    public final dishoard E() {
        return this.s;
    }

    public final List F() {
        List defaultValue = adultoid.kowloon("2", "8");
        Intrinsics.checkNotNullParameter("gad:scar_gks:enabled_list", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (List) a("gad:scar_gks:enabled_list", defaultValue, zk.g);
    }

    public final long I() {
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        return ((p002kotlin.time.saneness) a("gads:immersive_video_media_data_timeout_ms", juju.attabal(5, DurationUnit.SECONDS, "gads:immersive_video_media_data_timeout_ms", X3.i.W), zk.j)).getRawValue();
    }

    public final boolean J() {
        Intrinsics.checkNotNullParameter("gads:include_ping_attempts:enabled", X3.i.W);
        return ((Boolean) a("gads:include_ping_attempts:enabled", Boolean.TRUE, zk.b)).booleanValue();
    }

    public final boolean K() {
        Intrinsics.checkNotNullParameter("gads:inspector:enabled", X3.i.W);
        return ((Boolean) a("gads:inspector:enabled", Boolean.TRUE, zk.b)).booleanValue();
    }

    public final List L() {
        ginshop ginshopVar = yf2.b;
        List defaultValue = graveside.marial("native");
        Intrinsics.checkNotNullParameter("gads:lock_screen_viewable_formats", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (List) a("gads:lock_screen_viewable_formats", defaultValue, zk.g);
    }

    public final List M() {
        List defaultValue = adultoid.kowloon("com.google.ads.mediation.inmobi.InMobiMediationAdapter", "com.google.ads.mediation.imobile.IMobileMediationAdapter", "com.google.ads.mediation.nend.NendMediationAdapter", "com.google.ads.mediation.adcolony.AdColonyMediationAdapter", "com.google.ads.mediation.facebook.FacebookMediationAdapter", "com.google.ads.mediation.mopub.MoPubMediationAdapter", "com.google.ads.mediation.applovin.AppLovinMediationAdapter", "com.google.ads.mediation.tapjoy.TapjoyMediationAdapter", "com.google.ads.mediation.vungle.VungleMediationAdapter", "com.google.ads.mediation.unity.UnityMediationAdapter", "com.google.ads.mediation.chartboost.ChartboostMediationAdapter", "com.google.ads.mediation.mytarget.MyTargetMediationAdapter", "com.google.ads.mediation.maio.MaioMediationAdapter", "com.google.ads.mediation.ironsource.IronSourceMediationAdapter", "com.google.ads.mediation.fyber.FyberMediationAdapter", "com.google.ads.mediation.verizon.VerizonMediationAdapter");
        Intrinsics.checkNotNullParameter("gads:logged_adapter_version_classes", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (List) a("gads:logged_adapter_version_classes", defaultValue, zk.n);
    }

    public final String N() {
        Intrinsics.checkNotNullParameter("gad:mraid:version", X3.i.W);
        Intrinsics.checkNotNullParameter("3.0", "defaultValue");
        return (String) a("gad:mraid:version", "3.0", zk.o);
    }

    public final boolean O() {
        Intrinsics.checkNotNullParameter("gads:nas_collect_alpha:enabled", X3.i.W);
        return ((Boolean) a("gads:nas_collect_alpha:enabled", Boolean.TRUE, zk.b)).booleanValue();
    }

    public final boolean P() {
        Intrinsics.checkNotNullParameter("gads:nas_collect_layout_params:enabled", X3.i.W);
        return ((Boolean) a("gads:nas_collect_layout_params:enabled", Boolean.FALSE, zk.b)).booleanValue();
    }

    public final List Q() {
        List defaultValue = adultoid.kowloon("1.5.2", "1.4.14");
        Intrinsics.checkNotNullParameter("gads:omid_instant_app_incompatible_versions", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (List) a("gads:omid_instant_app_incompatible_versions", defaultValue, zk.g);
    }

    public final boolean R() {
        Intrinsics.checkNotNullParameter("gads:omid_javascript_session_service:enabled", X3.i.W);
        return ((Boolean) a("gads:omid_javascript_session_service:enabled", Boolean.FALSE, zk.b)).booleanValue();
    }

    public final String S() {
        Intrinsics.checkNotNullParameter("gads:omid_partner_name_prefix", X3.i.W);
        Intrinsics.checkNotNullParameter("Google/", "defaultValue");
        return (String) a("gads:omid_partner_name_prefix", "Google/", zk.o);
    }

    public final boolean T() {
        Intrinsics.checkNotNullParameter("gads:inspector:out_of_context_testing_request_params_enabled", X3.i.W);
        return ((Boolean) a("gads:inspector:out_of_context_testing_request_params_enabled", Boolean.TRUE, zk.b)).booleanValue();
    }

    public final String U() {
        Intrinsics.checkNotNullParameter("gads:pact_active_exp_id:enabled", X3.i.W);
        Intrinsics.checkNotNullParameter(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, "defaultValue");
        return (String) a("gads:pact_active_exp_id:enabled", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, zk.o);
    }

    public final b12 V() {
        return (b12) ((ik) this.a).j.get();
    }

    public final n32 W() {
        return (n32) ((ik) this.a).k.get();
    }

    public final long X() {
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        return ((p002kotlin.time.saneness) a("gads:preload_delay_after_removal:seconds", juju.attabal(10, DurationUnit.SECONDS, "gads:preload_delay_after_removal:seconds", X3.i.W), zk.l)).getRawValue();
    }

    public final String Z() {
        Intrinsics.checkNotNullParameter("gads:remote_capture_service_url", X3.i.W);
        Intrinsics.checkNotNullParameter("https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1", "defaultValue");
        return (String) a("gads:remote_capture_service_url", "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1", zk.o);
    }

    public final boolean a0() {
        Intrinsics.checkNotNullParameter("gads:request_throttler:enabled", X3.i.W);
        return ((Boolean) a("gads:request_throttler:enabled", Boolean.TRUE, zk.b)).booleanValue();
    }

    public final long b0() {
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        return ((p002kotlin.time.saneness) a("gads:request_throttler_retry_delay_ms", juju.attabal(500, DurationUnit.MILLISECONDS, "gads:request_throttler_retry_delay_ms", X3.i.W), zk.j)).getRawValue();
    }

    public final long c0() {
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        return ((p002kotlin.time.saneness) a("(gads:rtb_v1_1:signal_timeout_ms", juju.attabal(900, DurationUnit.MILLISECONDS, "(gads:rtb_v1_1:signal_timeout_ms", X3.i.W), zk.j)).getRawValue();
    }

    public final double d0() {
        Intrinsics.checkNotNullParameter("gads:rtb_timeout_multiplier", X3.i.W);
        return ((Number) a("gads:rtb_timeout_multiplier", Double.valueOf(0.95d), zk.c)).doubleValue();
    }

    public final boolean e0() {
        Intrinsics.checkNotNullParameter("gad:scar_encryption_allowlist:enabled", X3.i.W);
        return ((Boolean) a("gad:scar_encryption_allowlist:enabled", Boolean.FALSE, zk.b)).booleanValue();
    }

    public final boolean f0() {
        Intrinsics.checkNotNullParameter("gads:paw_cache:enabled", X3.i.W);
        return ((Boolean) a("gads:paw_cache:enabled", Boolean.TRUE, zk.b)).booleanValue();
    }

    public final long g0() {
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        return ((p002kotlin.time.saneness) a("gads:paw_cache:ttl_ms", juju.attabal(60, DurationUnit.SECONDS, "gads:paw_cache:ttl_ms", X3.i.W), zk.j)).getRawValue();
    }

    public final List h0() {
        List defaultValue = graveside.marial("8");
        Intrinsics.checkNotNullParameter("gad:scar_rtb_signal:enabled_list", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (List) a("gad:scar_rtb_signal:enabled_list", defaultValue, zk.g);
    }

    public final boolean i() {
        Intrinsics.checkNotNullParameter("gads:ad_request_preconnect_during_signals_enabled", X3.i.W);
        return ((Boolean) a("gads:ad_request_preconnect_during_signals_enabled", Boolean.FALSE, zk.b)).booleanValue();
    }

    public final long i0() {
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        return ((p002kotlin.time.saneness) a("gad:signal_collection_timeout_ms", juju.attabal(60, DurationUnit.SECONDS, "gad:signal_collection_timeout_ms", X3.i.W), zk.j)).getRawValue();
    }

    public final int j() {
        Intrinsics.checkNotNullParameter("gads:app_event_queue_size", X3.i.W);
        return ((Number) a("gads:app_event_queue_size", 20, zk.f)).intValue();
    }

    public final int j0() {
        Intrinsics.checkNotNullParameter("gads:maximum_query_json_cache_size", X3.i.W);
        return ((Number) a("gads:maximum_query_json_cache_size", 200, zk.f)).intValue();
    }

    public final String k() {
        Intrinsics.checkNotNullParameter("gads:gads:blob_encryption_public_key", X3.i.W);
        Intrinsics.checkNotNullParameter("MIGdMA0GCSqGSIb3DQEBAQUAA4GLADCBhwKBgQDILejyvRuVmPUcwUTpEVaE8A_-D7bZPnTOMs91 WZ0iSLQrK0lcICNKeWom1jWNBxjw89oyra30BlZCDEu7nfGacaTmzX74wD_RJV3xh81_9l2PWr46 0J9DJcXSi4yGzJyyUYp7Q1YXam8J6DYWV6PoemmP71T2fbm9i1VQy1NFgQIBAw", "defaultValue");
        return (String) a("gads:gads:blob_encryption_public_key", "MIGdMA0GCSqGSIb3DQEBAQUAA4GLADCBhwKBgQDILejyvRuVmPUcwUTpEVaE8A_-D7bZPnTOMs91 WZ0iSLQrK0lcICNKeWom1jWNBxjw89oyra30BlZCDEu7nfGacaTmzX74wD_RJV3xh81_9l2PWr46 0J9DJcXSi4yGzJyyUYp7Q1YXam8J6DYWV6PoemmP71T2fbm9i1VQy1NFgQIBAw", zk.o);
    }

    public final long k0() {
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        return ((p002kotlin.time.saneness) a("gads:timeout_query_json_cache:millis", juju.attabal(1, DurationUnit.HOURS, "gads:timeout_query_json_cache:millis", X3.i.W), zk.j)).getRawValue();
    }

    public final String l() {
        String defaultValue = Base64.encodeToString(new byte[]{0, 19, -48, -88, -79}, 0);
        Intrinsics.checkNotNullExpressionValue(defaultValue, "encodeToString(...)");
        Intrinsics.checkNotNullParameter("gads:blob_encryption_public_key_first_hashed_bytes", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (String) a("gads:blob_encryption_public_key_first_hashed_bytes", defaultValue, zk.o);
    }

    public final long l0() {
        long jDern = p002kotlin.time.saneness.INSTANCE.dern();
        Intrinsics.checkNotNullParameter("gads:integration_signal_timeout:ms", X3.i.W);
        return ((p002kotlin.time.saneness) a("gads:integration_signal_timeout:ms", p002kotlin.time.saneness.cutely(jDern), zk.j)).getRawValue();
    }

    public final String m() {
        Intrinsics.checkNotNullParameter("gads:blob_url_key", X3.i.W);
        Intrinsics.checkNotNullParameter("blob", "defaultValue");
        return (String) a("gads:blob_url_key", "blob", zk.o);
    }

    public final String m0() {
        Intrinsics.checkNotNullParameter("pps_rg", X3.i.W);
        Intrinsics.checkNotNullParameter("\\d+=([a-zA-Z0-9]+)(\\|[a-zA-Z0-9]+)*$", "defaultValue");
        return (String) a("pps_rg", "\\d+=([a-zA-Z0-9]+)(\\|[a-zA-Z0-9]+)*$", zk.o);
    }

    public final boolean n() {
        Intrinsics.checkNotNullParameter("gads:clear_webview_cache:enabled", X3.i.W);
        return ((Boolean) a("gads:clear_webview_cache:enabled", Boolean.FALSE, zk.b)).booleanValue();
    }

    public final String n0() {
        Intrinsics.checkNotNullParameter("gads:webview_cookie_url", X3.i.W);
        Intrinsics.checkNotNullParameter("https://googleads.g.doubleclick.net", "defaultValue");
        return (String) a("gads:webview_cookie_url", "https://googleads.g.doubleclick.net", zk.o);
    }

    public final String o() {
        Intrinsics.checkNotNullParameter("gads:client_default_content_url_domain_suffix", X3.i.W);
        Intrinsics.checkNotNullParameter("adsenseformobileapps.com", "defaultValue");
        return (String) a("gads:client_default_content_url_domain_suffix", "adsenseformobileapps.com", zk.o);
    }

    public final Map p() {
        return (Map) ((ik) this.a).l.get();
    }

    public final String q() {
        Intrinsics.checkNotNullParameter("gads:sdk_csi_server", X3.i.W);
        Intrinsics.checkNotNullParameter("https://csi.gstatic.com/csi", "defaultValue");
        return (String) a("gads:sdk_csi_server", "https://csi.gstatic.com/csi", zk.o);
    }

    public final List r() {
        List defaultValue = graveside.marial("1");
        Intrinsics.checkNotNullParameter("gads:pact_navigation_event_to_request_channel", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (List) a("gads:pact_navigation_event_to_request_channel", defaultValue, zk.g);
    }

    public final long s() {
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        return ((p002kotlin.time.saneness) a("gads:banner_refresh_time:seconds", juju.attabal(60, DurationUnit.SECONDS, "gads:banner_refresh_time:seconds", X3.i.W), zk.j)).getRawValue();
    }

    public final long t() {
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        return ((p002kotlin.time.saneness) a("gads:banner_refresh_load_ad_delay:seconds", juju.attabal(30, DurationUnit.SECONDS, "gads:banner_refresh_load_ad_delay:seconds", X3.i.W), zk.j)).getRawValue();
    }

    public final boolean u() {
        Intrinsics.checkNotNullParameter("gads:webview_sound_effects:disabled", X3.i.W);
        return ((Boolean) a("gads:webview_sound_effects:disabled", Boolean.TRUE, zk.b)).booleanValue();
    }

    public final boolean v() {
        Intrinsics.checkNotNullParameter("gads:disable_webview_request_network_tracing", X3.i.W);
        return ((Boolean) a("gads:disable_webview_request_network_tracing", Boolean.FALSE, zk.b)).booleanValue();
    }

    public final boolean w() {
        Intrinsics.checkNotNullParameter("gads:cct_v2_optimization:enabled", X3.i.W);
        return ((Boolean) a("gads:cct_v2_optimization:enabled", Boolean.FALSE, zk.b)).booleanValue();
    }

    public final boolean x() {
        Intrinsics.checkNotNullParameter("gads:cct_v2_connection:enabled", X3.i.W);
        return ((Boolean) a("gads:cct_v2_connection:enabled", Boolean.FALSE, zk.b)).booleanValue();
    }

    public final boolean y() {
        Intrinsics.checkNotNullParameter("gads:csrb_abtest_exception:enabled", X3.i.W);
        return ((Boolean) a("gads:csrb_abtest_exception:enabled", Boolean.FALSE, zk.b)).booleanValue();
    }

    public final boolean z() {
        Intrinsics.checkNotNullParameter("gads:post_click_lifecycle_monitoring:enabled", X3.i.W);
        return ((Boolean) a("gads:post_click_lifecycle_monitoring:enabled", Boolean.FALSE, zk.b)).booleanValue();
    }
}
