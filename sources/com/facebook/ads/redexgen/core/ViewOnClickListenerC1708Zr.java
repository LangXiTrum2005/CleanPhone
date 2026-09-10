package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1708Zr implements View.OnClickListener {
    public final /* synthetic */ C1425Ok A00;
    public final /* synthetic */ C1698Zh A01;
    public final /* synthetic */ MD A02;

    public ViewOnClickListenerC1708Zr(MD md, C1698Zh c1698Zh, C1425Ok c1425Ok) {
        this.A02 = md;
        this.A01 = c1698Zh;
        this.A00 = c1425Ok;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0D.AF4(this.A00);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
