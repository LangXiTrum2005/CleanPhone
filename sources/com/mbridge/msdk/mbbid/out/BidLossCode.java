package com.mbridge.msdk.mbbid.out;

import com.ironsource.InterfaceC0435l1;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class BidLossCode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f34597a;

    private BidLossCode(int i10) {
        f34597a = i10;
    }

    public static BidLossCode bidPriceNotHighest() {
        return new BidLossCode(InterfaceC0435l1.d.b.f29106c);
    }

    public static BidLossCode bidTimeOut() {
        return new BidLossCode(2);
    }

    public static BidLossCode bidWinButNotShow() {
        return new BidLossCode(IronSourceError.ERROR_DELIVERY_CAPPING_VALIDATION_FAILED);
    }

    public int getCurrentCode() {
        return f34597a;
    }
}
