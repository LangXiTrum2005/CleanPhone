package com.facebook.ads.redexgen.core;

import java.io.File;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2374kw implements LU<File> {
    @Override // com.facebook.ads.redexgen.core.LU
    public final LT<File> A3x(File file, InterfaceC1350Lm interfaceC1350Lm) {
        if (file.exists()) {
            return new LT<>(true, file);
        }
        return new LT<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.core.LU
    public final void A5D(File file, InterfaceC1350Lm interfaceC1350Lm) {
    }
}
