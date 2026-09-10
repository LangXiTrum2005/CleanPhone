package com.facebook.ads.redexgen.core;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class DB implements InterfaceC2214fK {
    public static byte[] A06;
    public ValueAnimator A00;
    public EnumC2213fJ A01 = EnumC2213fJ.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    static {
        A05();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{49, 32, 61, 49, 6, 42, 41, 42, 55};
    }

    public DB(View view, int i2, int i3, int i4) {
        this.A02 = i2;
        this.A05 = view;
        this.A04 = i3;
        this.A03 = i4;
    }

    private void A06(int i2, int i3) {
        this.A01 = i2 == this.A04 ? EnumC2213fJ.A03 : EnumC2213fJ.A05;
        this.A00 = ObjectAnimator.ofInt((TextView) this.A05, A04(0, 9, 85), i2, i3);
        this.A00.setEvaluator(new ArgbEvaluator());
        this.A00.setDuration(this.A02);
        this.A00.addListener(new C2220fQ(this, i2, i3));
        this.A00.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i2, int i3, boolean z2) {
        if (z2) {
            A06(i2, i3);
        } else {
            ((TextView) this.A05).setTextColor(i3);
            this.A01 = i3 == this.A03 ? EnumC2213fJ.A02 : EnumC2213fJ.A04;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2214fK
    public final void A4A(boolean z2, boolean z3) {
        int endColor = z3 ? this.A03 : this.A04;
        int startColor = z3 ? this.A04 : this.A03;
        A07(endColor, startColor, z2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2214fK
    public final EnumC2213fJ A9B() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2214fK
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
