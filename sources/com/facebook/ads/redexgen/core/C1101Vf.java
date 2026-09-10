package com.facebook.ads.redexgen.core;

import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1101Vf extends UD {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1101Vf(final UU uu, int i, long j, long j2) {
        super(new U8() { // from class: com.facebook.ads.redexgen.X.Vq
            @Override // com.facebook.ads.redexgen.core.U8
            public final long AJV(long j3) {
                return uu.A07(j3);
            }
        }, new C1110Vo(uu, i), uu.A06(), 0L, uu.A09, j, j2, uu.A05(), Math.max(6, uu.A06));
        Objects.requireNonNull(uu);
    }
}
