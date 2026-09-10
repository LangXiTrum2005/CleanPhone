package com.facebook.ads.redexgen.core;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1311bX implements IQ {
    public View A00;
    public C1361cL A01;
    public EnumC0787If A02;
    public boolean A03;
    public final Handler A04;
    public final AbstractC1343c3 A05;
    public final AbstractC1337bx A06;
    public final AbstractC1335bv A07;
    public final AbstractC1326bm A08;
    public final boolean A09;
    public final boolean A0A;

    public C1311bX(View view, EnumC0787If enumC0787If, boolean z) {
        this(view, enumC0787If, z, false);
    }

    public C1311bX(View view, EnumC0787If enumC0787If, boolean z, boolean z2) {
        this.A06 = new KN(this);
        this.A07 = new KM(this);
        this.A05 = new KL(this);
        this.A08 = new KK(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z;
        this.A0A = z2;
        A08(view, enumC0787If);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new C0786Ie(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i, int i2) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i);
        this.A00.setVisibility(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, EnumC0787If enumC0787If) {
        this.A02 = enumC0787If;
        this.A00 = view;
        this.A00.clearAnimation();
        if (enumC0787If == EnumC0787If.A03) {
            this.A00.setAlpha(0.0f);
            this.A00.setVisibility(8);
        } else {
            this.A00.setAlpha(1.0f);
            this.A00.setVisibility(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.IQ
    public final void AAk(C1361cL c1361cL) {
        this.A01 = c1361cL;
        c1361cL.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.IQ
    public final void AJa(C1361cL c1361cL) {
        A06(1, 0);
        c1361cL.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
