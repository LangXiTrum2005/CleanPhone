package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0671Dt implements View.OnClickListener {
    public final /* synthetic */ C04022n A00;
    public final /* synthetic */ AF A01;
    public final /* synthetic */ DR A02;
    public final /* synthetic */ C0672Du A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC0671Dt(C0672Du c0672Du, AF af, DR dr, String str, C04022n c04022n) {
        this.A03 = c0672Du;
        this.A01 = af;
        this.A02 = dr;
        this.A04 = str;
        this.A00 = c04022n;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A01.A04(AE.A0A, null);
            if (this.A03.A01.A0O(this.A03.A02.A02(), true)) {
                this.A02.AAd(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                C2.A0M(new C2(), this.A03.A02, C5.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
