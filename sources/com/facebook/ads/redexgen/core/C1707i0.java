package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1707i0 extends BY {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DG A01;

    public C1707i0(DG dg, DialogInterface dialogInterface) {
        this.A01 = dg;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        if (this.A01.A01.A02 != null) {
            this.A01.A01.A02.AG5(BE.A03(this.A01.A01.A00), new C0813Jf().A05(this.A01.A01.A02(this.A01.A00.getText().toString())).A08());
        }
        this.A00.cancel();
    }
}
