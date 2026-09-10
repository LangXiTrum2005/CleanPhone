package com.facebook.ads.redexgen.core;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0891Mi extends AbstractC1958mC {
    public final /* synthetic */ C2002mv A00;
    public final /* synthetic */ C1957mB A01;
    public final /* synthetic */ List A02;

    public C0891Mi(C1957mB c1957mB, List list, C2002mv c2002mv) {
        this.A01 = c1957mB;
        this.A02 = list;
        this.A00 = c2002mv;
    }

    @Override // com.facebook.ads.redexgen.core.C2I
    public final void AEB(C2002mv c2002mv) {
        this.A02.add(this.A00);
    }
}
