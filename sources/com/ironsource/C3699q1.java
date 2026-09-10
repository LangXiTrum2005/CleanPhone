package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3699q1 implements InterfaceC3715r1 {
    private final IronSource.a a;

    /* JADX INFO: renamed from: com.ironsource.q1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

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
            a = iArr;
        }
    }

    public C3699q1(IronSource.a adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.a = adFormat;
    }

    @Override // com.ironsource.InterfaceC3715r1
    public InterfaceC3732s1 a(InterfaceC3646n1 eventBaseData) {
        Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return new A9(eventBaseData);
        }
        if (i == 2) {
            return new Qd(eventBaseData);
        }
        if (i == 3) {
            return new R2(eventBaseData);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + this.a);
    }
}
