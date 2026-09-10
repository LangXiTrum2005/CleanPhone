package com.ironsource;

import com.ironsource.mediationsdk.IronSource;

/* JADX INFO: renamed from: com.ironsource.q1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0525q1 implements InterfaceC0542r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSource.a f30047a;

    /* JADX INFO: renamed from: com.ironsource.q1$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30048a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30048a = iArr;
        }
    }

    public C0525q1(IronSource.a adFormat) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        this.f30047a = adFormat;
    }

    @Override // com.ironsource.InterfaceC0542r1
    public InterfaceC0560s1 a(InterfaceC0471n1 eventBaseData) {
        kotlin.jvm.internal.n.f(eventBaseData, "eventBaseData");
        int i10 = a.f30048a[this.f30047a.ordinal()];
        if (i10 == 1) {
            return new D9(eventBaseData);
        }
        if (i10 == 2) {
            return new C0305de(eventBaseData);
        }
        if (i10 == 3) {
            return new R2(eventBaseData);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + this.f30047a);
    }
}
