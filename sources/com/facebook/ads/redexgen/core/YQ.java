package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class YQ implements DialogInterface.OnClickListener {
    public final /* synthetic */ C1623Pp A00;

    public YQ(C1623Pp c1623Pp) {
        this.A00 = c1623Pp;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        dialogInterface.cancel();
    }
}
