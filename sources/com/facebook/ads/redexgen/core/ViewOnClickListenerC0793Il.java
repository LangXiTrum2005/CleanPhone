package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0793Il implements View.OnClickListener {
    public final /* synthetic */ IX A00;

    public ViewOnClickListenerC0793Il(IX ix) {
        this.A00 = ix;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
        }
        try {
            if (this.A00.getVideoView() != null) {
                if (this.A00.A02 != null) {
                    this.A00.A02.A04(AE.A0x, null);
                }
                this.A00.A01.A0F().A3W();
                switch (this.A00.getVideoView().getState()) {
                    case A07:
                    case A04:
                    case A05:
                    case A06:
                        this.A00.getVideoView().A0g(IP.A04, 12);
                        break;
                    case A0A:
                        this.A00.getVideoView().A0k(true, 8);
                        break;
                    default:
                        break;
                }
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
