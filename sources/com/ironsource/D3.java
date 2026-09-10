package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class D3 {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25925a;

        static {
            int[] iArr = new int[I3.values().length];
            try {
                iArr[I3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25925a = iArr;
        }
    }

    public final int a(I3 cappingType) {
        kotlin.jvm.internal.n.f(cappingType, "cappingType");
        int i10 = a.f25925a[cappingType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        }
        if (i10 == 3) {
            return IronSourceError.ERROR_DELIVERY_CAPPING_VALIDATION_FAILED;
        }
        throw new aa.b((byte) 0, 20);
    }
}
