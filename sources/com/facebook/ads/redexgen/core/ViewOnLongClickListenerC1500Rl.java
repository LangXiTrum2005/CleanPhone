package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnLongClickListenerC1500Rl implements View.OnLongClickListener {
    public final /* synthetic */ C2171hM A00;
    public final /* synthetic */ C1785b6 A01;

    public ViewOnLongClickListenerC1500Rl(C2171hM c2171hM, C1785b6 c1785b6) {
        this.A00 = c2171hM;
        this.A01 = c1785b6;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.A00.A00 != null) {
            this.A01.setBounds(0, 0, this.A00.A00.getWidth(), this.A00.A00.getHeight());
            this.A01.A0D(!this.A01.A0E());
        }
        return true;
    }
}
