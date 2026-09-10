package com.facebook.ads.redexgen.core;

import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2538kq implements InterfaceC1518Ll {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C2538kq(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1518Ll
    public final void AGj(int i2) throws C2535kn {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1518Ll
    public final void close() throws C2535kn {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1518Ll
    public final int length() throws C2535kn {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1518Ll
    public final int read(byte[] bArr) throws C2535kn {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
