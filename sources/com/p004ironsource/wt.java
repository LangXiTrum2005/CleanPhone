package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class wt implements ii, ii.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f27638c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<IronSource.AD_UNIT, Integer> f27639a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ok f27640b = new ok();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27641a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            f27641a = iArr;
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27641a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27641a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27641a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public wt() {
        for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
            a(ad_unit, 1);
        }
    }

    @Override // com.p004ironsource.ii
    public synchronized int a(IronSource.AD_UNIT ad_unit) {
        int iIntValue = -1;
        if (ad_unit == null) {
            return -1;
        }
        Integer num = this.f27639a.get(ad_unit);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }

    @Override // com.ironsource.ii.a
    public synchronized void b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return;
        }
        a(ad_unit, this.f27639a.get(ad_unit).intValue() + 1);
    }

    @Override // com.p004ironsource.ii
    public int a(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return -1;
        }
        return a(com.unity3d.mediation.a.a(adFormat)) - 1;
    }

    private void a(IronSource.AD_UNIT ad_unit, int i2) {
        this.f27639a.put(ad_unit, Integer.valueOf(i2));
        int i3 = a.f27641a[ad_unit.ordinal()];
        if (i3 == 1) {
            this.f27640b.d(i2);
            return;
        }
        if (i3 == 2) {
            this.f27640b.b(i2);
        } else if (i3 == 3) {
            this.f27640b.a(i2);
        } else {
            if (i3 != 4) {
                return;
            }
            this.f27640b.c(i2);
        }
    }
}
