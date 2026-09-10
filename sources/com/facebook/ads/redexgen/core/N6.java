package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class N6 {
    public static N1 A00;

    public final N1 A00(final C2300gi c2300gi, AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (N5.A00[adPlacementType.ordinal()]) {
            case 1:
                return new AnonymousClass81();
            case 2:
                if (C1750Up.A1O(c2300gi)) {
                    return new AnonymousClass80();
                }
                return new AnonymousClass81();
            case 3:
                return new C2487jz();
            case 4:
                return new C2482ju(c2300gi);
            case 5:
                return new C2482ju(c2300gi) { // from class: com.facebook.ads.redexgen.X.7z
                    @Override // com.facebook.ads.redexgen.core.C2482ju, com.facebook.ads.redexgen.core.N1
                    public final AdPlacementType A8k() {
                        return AdPlacementType.NATIVE_BANNER;
                    }
                };
            case 6:
                return new C11867w();
            default:
                return null;
        }
    }
}
