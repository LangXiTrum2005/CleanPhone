package com.ironsource;

import com.ironsource.mediationsdk.IronSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W0 f27518a = new W0();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27519a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27519a = iArr;
        }
    }

    private W0() {
    }

    public static final O6.a a(IronSource.a adUnit) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        int i10 = a.f27519a[adUnit.ordinal()];
        if (i10 == 1) {
            return O6.a.REWARDED_VIDEO;
        }
        if (i10 == 2) {
            return O6.a.INTERSTITIAL;
        }
        if (i10 == 3) {
            return O6.a.BANNER;
        }
        if (i10 == 4) {
            return O6.a.NATIVE_AD;
        }
        throw new aa.b((byte) 0, 20);
    }
}
