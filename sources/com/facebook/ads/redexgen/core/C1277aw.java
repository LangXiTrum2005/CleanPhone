package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1277aw implements InterfaceC0798Iq {
    public int A00;
    public ValueAnimator A01;
    public EnumC0797Ip A02 = EnumC0797Ip.A04;
    public final int A03;
    public final int A04;
    public final View A05;

    public C1277aw(View view, int i, int i2, int i3) {
        this.A05 = view;
        this.A03 = i;
        this.A00 = i2;
        this.A04 = i3;
    }

    private ValueAnimator A00(int i, int i2, View view) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(this.A03);
        valueAnimatorOfInt.addUpdateListener(new C0801It(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z) {
        if (z) {
            this.A02 = EnumC0797Ip.A05;
            this.A01 = A00(this.A00, this.A04, this.A05);
            this.A01.addListener(new C0800Is(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        D3.A0F(this.A05);
        this.A02 = EnumC0797Ip.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        D3.A0J(this.A05);
        if (z) {
            this.A02 = EnumC0797Ip.A03;
            this.A01 = A00(this.A04, this.A00, this.A05);
            this.A01.addListener(new C0799Ir(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = EnumC0797Ip.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0798Iq
    public final void A40(boolean z, boolean z2) {
        if (z2) {
            A07(z);
        } else {
            A08(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0798Iq
    public final EnumC0797Ip A91() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0798Iq
    public final void cancel() {
        if (this.A01 != null) {
            this.A01.cancel();
        }
    }
}
