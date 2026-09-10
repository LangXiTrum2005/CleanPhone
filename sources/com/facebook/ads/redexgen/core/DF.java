package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class DF implements DialogInterface.OnClickListener {
    public final /* synthetic */ C1706hz A00;

    public DF(C1706hz c1706hz) {
        this.A00 = c1706hz;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
