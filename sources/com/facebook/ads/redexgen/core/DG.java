package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;
import android.widget.EditText;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class DG implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C1706hz A01;

    public DG(C1706hz c1706hz, EditText editText) {
        this.A01 = c1706hz;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A01.A03.execute(new C1707i0(this, dialogInterface));
    }
}
