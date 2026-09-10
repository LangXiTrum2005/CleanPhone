package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1389cn implements InterfaceC05006k {
    public final /* synthetic */ C04946e A00;
    public final /* synthetic */ C0842Ki A01;

    public C1389cn(C0842Ki c0842Ki, C04946e c04946e) {
        this.A01 = c0842Ki;
        this.A00 = c04946e;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05006k
    public final boolean AA8() {
        if (!this.A01.A0b()) {
            if (this.A01.A0c()) {
                return true;
            }
            return this.A01.A0d();
        }
        this.A01.A0a(this.A00);
        return true;
    }
}
