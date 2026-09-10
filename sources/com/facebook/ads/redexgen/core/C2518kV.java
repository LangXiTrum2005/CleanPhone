package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2518kV implements C5V {
    public MP A02;
    public long A01 = 5242880;
    public int A00 = 20480;

    public final C2518kV A00(MP mp) {
        this.A02 = mp;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C5V
    public final C2517kU A5H() {
        return new C2517kU((MP) AbstractC10843y.A01(this.A02), this.A01, this.A00);
    }
}
