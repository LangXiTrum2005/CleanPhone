package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1255Hu {
    public final InterfaceC1238Hd A00;

    public abstract boolean A0B(C09384v c09384v) throws C3K;

    public abstract boolean A0C(C09384v c09384v, long j) throws C3K;

    public AbstractC1255Hu(InterfaceC1238Hd interfaceC1238Hd) {
        this.A00 = interfaceC1238Hd;
    }

    public final boolean A00(C09384v c09384v, long j) throws C3K {
        return A0B(c09384v) && A0C(c09384v, j);
    }
}
