package com.p004ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.model.BasePlacement;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import j$.util.DesugarTimeZone;
import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
public class qq implements jg, jg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f26595a = "CappingManager.IS_DELIVERY_ENABLED";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f26596b = "CappingManager.IS_CAPPING_ENABLED";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f26597c = "CappingManager.IS_PACING_ENABLED";
    private static final String d = "CappingManager.MAX_NUMBER_OF_SHOWS";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f26598e = "CappingManager.CAPPING_TYPE";
    private static final String f = "CappingManager.SECONDS_BETWEEN_SHOWS";
    private static final String g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f26599h = "CappingManager.CAPPING_TIME_THRESHOLD";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f26600i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26601a;

        static {
            int[] iArr = new int[rq.values().length];
            f26601a = iArr;
            try {
                iArr[rq.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26601a[rq.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    private long a(rq rqVar) {
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        int i2 = a.f26601a[rqVar.ordinal()];
        if (i2 == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i2 == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    private b b(Context context, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, f26595a, str2), true)) {
            return b.CAPPED_PER_DELIVERY;
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, f26597c, str2), false)) {
            if (jCurrentTimeMillis - IronSourceUtils.getLongFromSharedPrefs(context, a(str, f26600i, str2), 0L) < IronSourceUtils.getIntFromSharedPrefs(context, a(str, f, str2), 0) * 1000) {
                return b.CAPPED_PER_PACE;
            }
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, f26596b, str2), false)) {
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, a(str, d, str2), 0);
            String strA = a(str, g, str2);
            int intFromSharedPrefs2 = IronSourceUtils.getIntFromSharedPrefs(context, strA, 0);
            String strA2 = a(str, f26599h, str2);
            if (jCurrentTimeMillis >= IronSourceUtils.getLongFromSharedPrefs(context, strA2, 0L)) {
                IronSourceUtils.saveIntToSharedPrefs(context, strA, 0);
                IronSourceUtils.saveLongToSharedPrefs(context, strA2, 0L);
            } else if (intFromSharedPrefs2 >= intFromSharedPrefs) {
                return b.CAPPED_PER_COUNT;
            }
        }
        return b.NOT_CAPPED;
    }

    @Override // com.ironsource.jg.a
    public synchronized void c(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit) {
        if (context == null || basePlacement == null) {
            return;
        }
        nq placementAvailabilitySettings = basePlacement.getPlacementAvailabilitySettings();
        if (placementAvailabilitySettings == null) {
            return;
        }
        a(context, a(ad_unit), basePlacement.getPlacementName(), placementAvailabilitySettings);
    }

    @Override // com.p004ironsource.jg
    public synchronized b a(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit) {
        try {
            if (context == null) {
                return b.NOT_CAPPED;
            }
            if (basePlacement == null) {
                return b.NOT_CAPPED;
            }
            String strA = a(ad_unit);
            if (basePlacement.getPlacementName() == null) {
                return b.NOT_CAPPED;
            }
            if (basePlacement.getPlacementAvailabilitySettings() == null) {
                return b.NOT_CAPPED;
            }
            return b(context, strA, basePlacement.getPlacementName());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.p004ironsource.jg
    public synchronized boolean b(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit) {
        return a(context, basePlacement, ad_unit) != b.NOT_CAPPED;
    }

    private String a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceConstants.REWARDED_VIDEO_AD_UNIT;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return "Interstitial";
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return "Banner";
        }
        return ad_unit == IronSource.AD_UNIT.NATIVE_AD ? IronSourceConstants.NATIVE_AD_UNIT : ad_unit.toString();
    }

    private String a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    @Override // com.ironsource.jg.a
    public synchronized void a(Context context, String str, IronSource.AD_UNIT ad_unit) {
        if (context == null) {
            return;
        }
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(context, a(ad_unit), str);
    }

    private void a(Context context, String str, String str2) {
        rq rqVar;
        int i2 = 0;
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, f26597c, str2), false)) {
            IronSourceUtils.saveLongToSharedPrefs(context, a(str, f26600i, str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, f26596b, str2), false)) {
            String strA = a(str, g, str2);
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, strA, 0);
            if (intFromSharedPrefs == 0) {
                String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(context, a(str, f26598e, str2), rq.PER_DAY.toString());
                rq[] rqVarArrValues = rq.values();
                int length = rqVarArrValues.length;
                while (true) {
                    if (i2 >= length) {
                        rqVar = null;
                        break;
                    }
                    rqVar = rqVarArrValues[i2];
                    if (rqVar.f26687a.equals(stringFromSharedPrefs)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                IronSourceUtils.saveLongToSharedPrefs(context, a(str, f26599h, str2), a(rqVar));
            }
            IronSourceUtils.saveIntToSharedPrefs(context, strA, intFromSharedPrefs + 1);
        }
    }

    private void a(Context context, String str, String str2, nq nqVar) {
        boolean zE = nqVar.e();
        IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, f26595a, str2), zE);
        if (zE) {
            boolean zD = nqVar.d();
            IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, f26596b, str2), zD);
            if (zD) {
                IronSourceUtils.saveIntToSharedPrefs(context, a(str, d, str2), nqVar.b());
                IronSourceUtils.saveStringToSharedPrefs(context, a(str, f26598e, str2), nqVar.a().toString());
            }
            boolean zF = nqVar.f();
            IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, f26597c, str2), zF);
            if (zF) {
                IronSourceUtils.saveIntToSharedPrefs(context, a(str, f, str2), nqVar.c());
            }
        }
    }
}
