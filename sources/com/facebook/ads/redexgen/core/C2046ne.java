package com.facebook.ads.redexgen.core;

import java.io.File;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2046ne implements C1G<String> {
    @Override // com.facebook.ads.redexgen.core.C1G
    public final C1F<String> A3n(File file, C1Y c1y) {
        String strA05 = C1Z.A05(file);
        return new C1F<>(strA05 != null, strA05);
    }

    @Override // com.facebook.ads.redexgen.core.C1G
    public final void A53(File file, C1Y c1y) {
    }
}
