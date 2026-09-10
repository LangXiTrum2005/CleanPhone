package com.p004ironsource;

import android.text.TextUtils;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.IronSourceSegment;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.p;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<IronSource.AD_UNIT, o1> f24397a = new HashMap();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f24399b;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            f24399b = iArr;
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24399b[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24399b[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24399b[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.AD_UNIT.values().length];
            f24398a = iArr2;
            try {
                iArr2[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24398a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24398a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24398a[IronSource.AD_UNIT.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IronSource.AD_UNIT f24400a;

        public b(IronSource.AD_UNIT ad_unit) {
            this.f24400a = ad_unit;
        }

        private String b() {
            IronSource.AD_UNIT ad_unit = this.f24400a;
            return ad_unit != null ? ad_unit.name() : "";
        }

        public String a() {
            return a(null);
        }

        public String a(String str) {
            return a(str, null);
        }

        public String a(String str, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append(b());
            sb.append(TextUtils.isEmpty(str2) ? "" : android.support.v4.media.a.C(" - ", str2));
            String string = sb.toString();
            return TextUtils.isEmpty(str) ? string : android.support.v4.media.a.D(string, " - ", str);
        }
    }

    public static b a(IronSource.AD_UNIT ad_unit) {
        return new b(ad_unit);
    }

    public static int b(IronSource.AD_UNIT ad_unit) {
        u7.e eVar;
        int i2 = a.f24398a[ad_unit.ordinal()];
        if (i2 == 1) {
            eVar = u7.e.REWARDED_VIDEO;
        } else if (i2 == 2) {
            eVar = u7.e.INTERSTITIAL;
        } else if (i2 != 3) {
            eVar = i2 != 4 ? u7.e.NOT_SUPPORTED : u7.e.BANNER;
        } else {
            eVar = u7.e.NATIVE_AD;
        }
        return eVar.a();
    }

    public static IronSourceSegment a() {
        return p.j().q();
    }

    private static o1 a(u1 u1Var) {
        Map<IronSource.AD_UNIT, o1> map = f24397a;
        if (map.containsKey(u1Var.getAdProperties().getAdFormat())) {
            return map.get(u1Var.getAdProperties().getAdFormat());
        }
        o1 o1Var = new o1();
        map.put(u1Var.getAdProperties().getAdFormat(), o1Var);
        return o1Var;
    }

    public static q2 a(u1 u1Var, int i2) {
        return a(u1Var).a(u1Var.getAdProperties().getAdUnitId(), u1Var.m(), i2);
    }

    public static String a(LevelPlay.AdFormat adFormat) {
        int i2 = a.f24399b[adFormat.ordinal()];
        if (i2 == 1) {
            return "rewarded";
        }
        if (i2 == 2) {
            return "interstitial";
        }
        if (i2 != 3) {
            return i2 != 4 ? "" : "nativeAd";
        }
        return "banner";
    }

    public static void a(ac acVar, JSONObject jSONObject) {
        on.U().z().a(new zb(acVar, tk.a(IronSourceUtils.getMediationAdditionalData(false), jSONObject)));
    }

    public static void a(Exception exc) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "Exception", exc);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", exc.getMessage());
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        a(ac.TROUBLESHOOTING_LOAD_ARM_DATA_PARSE_ERROR, jSONObject);
    }

    public static void a(Throwable th) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "SafeRunnable", th);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", th.getMessage());
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        a(ac.TROUBLESHOOTING_SDK_INTERNAL_ERROR, jSONObject);
    }

    public static boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.AD_UNIT ad_unit, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(ad_unit)) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }
}
