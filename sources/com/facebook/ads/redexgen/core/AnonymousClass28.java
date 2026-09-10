package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.28, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass28 {
    public static AnonymousClass23 A00;

    public final AnonymousClass23 A00(C1828k1 c1828k1, AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (AnonymousClass27.A00[adPlacementType.ordinal()]) {
            case 1:
                return new N5();
            case 2:
                if (C05789m.A1L(c1828k1)) {
                    return new N4();
                }
                return new N5();
            case 3:
                return new C2010n3();
            case 4:
                return new C2002mv(c1828k1);
            case 5:
                return new N3(c1828k1);
            case 6:
                return new N0();
            default:
                return null;
        }
    }
}
