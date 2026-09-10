package com.facebook.ads.redexgen.core;

import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2042na implements C1X {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C2042na(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.core.C1X
    public final void AFr(int i) throws C2040nX {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i);
    }

    @Override // com.facebook.ads.redexgen.core.C1X
    public final void close() throws C2040nX {
    }

    @Override // com.facebook.ads.redexgen.core.C1X
    public final int length() throws C2040nX {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.core.C1X
    public final int read(byte[] bArr) throws C2040nX {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
