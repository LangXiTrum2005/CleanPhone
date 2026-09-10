package com.facebook.ads.redexgen.core;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1977bT extends RelativeLayout {
    public static byte[] A0E;
    public static String[] A0F = {"ZXfERob4xoBH3IcU8XCjlL1hD69lrIyA", "mQeX6yhTUvQ4pK8ACBM6nUVZWHaQDR", "t18Mgh0fo46erZhvjKlVSbwf5heaPhmM", "S6rERx5ctFRQ2KVL", "3Fwf", "FlQfbFZAJ1ylax3KsERNgz88EmHf", "VMbmryNa1vDSool6GPHICtScLmJABdX", "KdX0dASRYEcEQR8bSkkNlsR1046Pig"};
    public static final int A0G;
    public AnimatorSet A00;
    public AnimatorSet A01;
    public AnimatorSet A02;
    public LinearLayout A03;
    public C1934am A04;
    public M3 A05;
    public final int A06;
    public final int A07;
    public final View A08;
    public final AbstractC1552Mt A09;
    public final C1602Os A0A;
    public final C2300gi A0B;
    public final InterfaceC1841Yh A0C;
    public final ViewOnClickListenerC1498Kr A0D;

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0E = new byte[]{77};
    }

    static {
        A08();
        A0G = XV.A02;
    }

    public C1977bT(C2300gi c2300gi, InterfaceC1841Yh interfaceC1841Yh, int i2, AbstractC1552Mt abstractC1552Mt, ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr, View view) {
        super(c2300gi);
        this.A0B = c2300gi;
        this.A0C = interfaceC1841Yh;
        this.A09 = abstractC1552Mt;
        this.A0D = viewOnClickListenerC1498Kr;
        this.A08 = view;
        if (getResources().getConfiguration().orientation == 1) {
            this.A02 = new AnimatorSet();
            this.A01 = new AnimatorSet();
            this.A00 = new AnimatorSet();
        }
        int i3 = (int) (i2 * XX.A02);
        this.A07 = i3;
        this.A06 = i3 - A0G;
        this.A0A = A02();
    }

    private LinearLayout A00() {
        M3 m3;
        this.A03 = new LinearLayout(this.A0B);
        this.A03.setOrientation(1);
        this.A03.addView(A01());
        C1500Kt c1500Kt = new C1500Kt(this);
        if (AbstractC1751Uq.A02(this.A0B) || this.A0B.A0E() == null) {
            m3 = new M3(this.A0B, c1500Kt);
        } else {
            m3 = new M3(this.A0B, this.A0B.A0E(), c1500Kt);
        }
        this.A05 = m3;
        this.A03.addView(this.A05, new LinearLayout.LayoutParams(-1, -1));
        this.A05.loadUrl(((AnonymousClass85) this.A09).A0M().toString());
        return this.A03;
    }

    private LinearLayout A01() {
        this.A04 = new C1934am(this.A0B);
        this.A04.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(XV.A0G, 0, XV.A0G, 0);
        this.A04.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(this.A0B);
        linearLayout.addView(this.A04);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(XV.A0U, XV.A0U, XV.A0U, XV.A0U);
        linearLayout.setLayoutParams(layoutParams2);
        return linearLayout;
    }

    private C1602Os A02() {
        C1602Os c1602Os = new C1602Os(this.A0B);
        c1602Os.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        c1602Os.setRadius(40.0f);
        c1602Os.addView(A00());
        c1602Os.setTranslationY(getResources().getDisplayMetrics().heightPixels);
        View view = new View(this.A0B);
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        view.setBackgroundColor(0);
        view.setOnClickListener(new ViewOnClickListenerC1976bS(this));
        c1602Os.addView(view);
        return c1602Os;
    }

    private void A07() {
        if (this.A02 != null) {
            this.A02.cancel();
            this.A02 = null;
        }
        if (this.A01 != null) {
            this.A01.cancel();
            this.A01 = null;
        }
        if (this.A00 != null) {
            this.A00.cancel();
            this.A00 = null;
        }
    }

    private final void A09() {
        this.A08.setTranslationY(0.0f);
    }

    public final void A0A() {
        int i2 = getResources().getDisplayMetrics().heightPixels;
        C1602Os c1602Os = this.A0A;
        int screenHeight = this.A07;
        String strA06 = A06(0, 1, 105);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1602Os, strA06, i2 - screenHeight);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.A08, strA06, -this.A07);
        objectAnimatorOfFloat2.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.A0A, strA06, i2 - this.A06);
        objectAnimatorOfFloat3.setDuration(300L);
        ObjectAnimator adDetailsViewDown = ObjectAnimator.ofFloat(this.A08, strA06, -this.A06);
        adDetailsViewDown.setDuration(300L);
        if (this.A02 != null && this.A01 != null && this.A00 != null) {
            this.A02.setInterpolator(new AccelerateDecelerateInterpolator());
            this.A02.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            this.A01.playTogether(objectAnimatorOfFloat3, adDetailsViewDown);
            this.A00.playSequentially(this.A02, this.A01);
            this.A00.start();
        }
    }

    public final void A0B() {
        A07();
        this.A05.destroy();
        this.A0A.setVisibility(8);
        A09();
    }

    public final void A0C() {
        if (this.A02 != null) {
            this.A02.pause();
        }
        if (this.A01 != null) {
            this.A01.pause();
        }
        if (this.A00 != null) {
            this.A00.pause();
        }
    }

    public final void A0D(int i2) {
        if (i2 == 2) {
            this.A0A.setVisibility(8);
            this.A08.setTranslationY(0.0f);
            if (A0F[2].charAt(16) != 'j') {
                throw new RuntimeException();
            }
            A0F[3] = "0Dd01EimJB8SQQk0dQvdznLslJ";
            A07();
            A09();
            return;
        }
        if (i2 == 1) {
            int i3 = getResources().getDisplayMetrics().heightPixels;
            this.A0A.setVisibility(0);
            C1602Os c1602Os = this.A0A;
            int screenHeight = this.A06;
            c1602Os.setTranslationY(i3 - screenHeight);
            View view = this.A08;
            int screenHeight2 = this.A06;
            view.setTranslationY(-screenHeight2);
        }
    }

    public C1602Os getBrowserPeekView() {
        return this.A0A;
    }
}
