package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1424Hu {
    public final InterfaceC1407Hd A00;

    public abstract boolean A0B(C11074v c11074v) throws C3K;

    public abstract boolean A0C(C11074v c11074v, long j) throws C3K;

    public AbstractC1424Hu(InterfaceC1407Hd interfaceC1407Hd) {
        this.A00 = interfaceC1407Hd;
    }

    public final boolean A00(C11074v c11074v, long j) throws C3K {
        return A0B(c11074v) && A0C(c11074v, j);
    }
}
