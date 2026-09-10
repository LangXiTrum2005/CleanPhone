package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1874Zo implements View.OnClickListener {
    public final /* synthetic */ C1867Zh A00;
    public final /* synthetic */ MD A01;

    public ViewOnClickListenerC1874Zo(MD md, C1867Zh c1867Zh) {
        this.A01 = md;
        this.A00 = c1867Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AEr(EnumC1592Oi.A06);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
