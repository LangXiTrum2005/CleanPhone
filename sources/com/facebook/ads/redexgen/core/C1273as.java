package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.as, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1273as implements InterfaceC0798Iq {
    public ValueAnimator A00;
    public EnumC0797Ip A01 = EnumC0797Ip.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public C1273as(View view, int i, int i2, int i3) {
        this.A05 = view;
        this.A02 = i;
        this.A04 = i2;
        this.A03 = i3;
    }

    private ValueAnimator A00(View view, int i, int i2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(this.A02);
        valueAnimatorOfInt.addUpdateListener(new C0807Iz(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A00 != null) {
            this.A00.removeAllListeners();
            this.A00 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        if (z) {
            this.A01 = EnumC0797Ip.A05;
            this.A00 = A00(this.A05, this.A03, this.A04);
            this.A00.addListener(new C0806Iy(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A04);
        D3.A0F(this.A05);
        this.A01 = EnumC0797Ip.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z) {
        D3.A0J(this.A05);
        if (z) {
            this.A01 = EnumC0797Ip.A03;
            this.A00 = A00(this.A05, this.A04, this.A03);
            this.A00.addListener(new C0805Ix(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A03);
        this.A01 = EnumC0797Ip.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0798Iq
    public final void A40(boolean z, boolean z2) {
        if (z2) {
            A08(z);
        } else {
            A09(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0798Iq
    public final EnumC0797Ip A91() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0798Iq
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
