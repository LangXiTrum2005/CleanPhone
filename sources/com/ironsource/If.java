package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class If {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<IronSource.a, C0541r0> f26310a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f26312b;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            f26312b = iArr;
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26312b[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26312b[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26312b[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.a.values().length];
            f26311a = iArr2;
            try {
                iArr2[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26311a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26311a[IronSource.a.NATIVE_AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26311a[IronSource.a.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static S0 a(AbstractC0649x0 abstractC0649x0, int i10) {
        return a(abstractC0649x0).a(abstractC0649x0.b().c(), abstractC0649x0.m(), i10);
    }

    public static b b(IronSource.a aVar) {
        return new b(aVar);
    }

    public static int c(IronSource.a aVar) {
        int i10 = a.f26311a[aVar.ordinal()];
        if (i10 == 1) {
            return AbstractC0437l3.e.REWARDED_VIDEO.b();
        }
        if (i10 == 2) {
            return AbstractC0437l3.e.INTERSTITIAL.b();
        }
        if (i10 != 3) {
            return i10 != 4 ? AbstractC0437l3.e.NOT_SUPPORTED.b() : AbstractC0437l3.e.BANNER.b();
        }
        return AbstractC0437l3.e.NATIVE_AD.b();
    }

    public static IronSource.a b(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return null;
        }
        int i10 = a.f26312b[adFormat.ordinal()];
        if (i10 == 1) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i10 == 2) {
            return IronSource.a.INTERSTITIAL;
        }
        if (i10 == 3) {
            return IronSource.a.BANNER;
        }
        if (i10 != 4) {
            return null;
        }
        return IronSource.a.NATIVE_AD;
    }

    private static C0541r0 a(AbstractC0649x0 abstractC0649x0) {
        Map<IronSource.a, C0541r0> map = f26310a;
        if (map.containsKey(abstractC0649x0.b().a())) {
            return map.get(abstractC0649x0.b().a());
        }
        C0541r0 c0541r0 = new C0541r0();
        map.put(abstractC0649x0.b().a(), c0541r0);
        return c0541r0;
    }

    public static C0265ba a() {
        return com.ironsource.mediationsdk.p.h().n();
    }

    public static void a(Throwable th2) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "SafeRunnable", th2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", th2.getMessage());
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        a(EnumC0672y5.TROUBLESHOOTING_SDK_INTERNAL_ERROR, jSONObject);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IronSource.a f26313a;

        public b(IronSource.a aVar) {
            this.f26313a = aVar;
        }

        private String b() {
            IronSource.a aVar = this.f26313a;
            return aVar != null ? aVar.name() : "";
        }

        public String a(String str, String str2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b());
            sb2.append(TextUtils.isEmpty(str2) ? "" : defpackage.e.n(" - ", str2));
            String string = sb2.toString();
            return TextUtils.isEmpty(str) ? string : wi.d.i(string, " - ", str);
        }

        public String a(String str) {
            return a(str, null);
        }

        public String a() {
            return a(null);
        }
    }

    public static void a(Exception exc) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "Exception", exc);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", exc.getMessage());
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        a(EnumC0672y5.TROUBLESHOOTING_LOAD_ARM_DATA_PARSE_ERROR, jSONObject);
    }

    public static void a(EnumC0672y5 enumC0672y5, JSONObject jSONObject) {
        Kb.Y().q().a(new C0654x5(enumC0672y5, C0391ia.a(IronSourceUtils.b(false), jSONObject)));
    }

    public static boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.a aVar, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(a(aVar))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public static String a(LevelPlay.AdFormat adFormat) {
        int i10 = a.f26312b[adFormat.ordinal()];
        if (i10 == 1) {
            return "rewarded";
        }
        if (i10 == 2) {
            return "interstitial";
        }
        if (i10 == 3) {
            return "banner";
        }
        if (i10 != 4) {
            return "";
        }
        return "nativeAd";
    }

    public static LevelPlay.AdFormat a(IronSource.a aVar) {
        int i10 = a.f26311a[aVar.ordinal()];
        if (i10 == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i10 == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i10 == 3) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        if (i10 != 4) {
            return null;
        }
        return LevelPlay.AdFormat.BANNER;
    }
}
