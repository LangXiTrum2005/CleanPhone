package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ZX extends FrameLayout {
    public static byte[] A03;
    public RelativeLayout A00;
    public ScrollView A01;
    public final C2300gi A02;

    static {
        A04();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{98, 94, 83, 22, 119, 82, 22, 95, 69, 22, 94, 95, 82, 82, 83, 88, 94, 101, 111, 100};
    }

    public ZX(C2300gi c2300gi) {
        super(c2300gi);
        this.A02 = c2300gi;
        this.A02.A0F().AB1();
        A03();
        A02();
    }

    private void A01() {
        YB.A0I(this);
        YB.A0J(this);
    }

    private void A02() {
        this.A00.removeAllViews();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.A00.addView(getAdHideView(), layoutParams);
        YB.A0W(this.A00);
        this.A01.fullScroll(33);
    }

    private void A03() {
        this.A01 = new ScrollView(this.A02);
        this.A01.setFillViewport(true);
        YB.A0N(this.A01, -218103809);
        this.A00 = new RelativeLayout(this.A02);
        this.A00.setPadding(XV.A0U, XV.A0U, XV.A0U, XV.A0U);
        this.A01.addView(this.A00, new FrameLayout.LayoutParams(-1, -2));
        ScrollView scrollView = this.A01;
        FrameLayout.LayoutParams mainLayoutParams = new FrameLayout.LayoutParams(-1, -1);
        addView(scrollView, mainLayoutParams);
    }

    public final /* synthetic */ void A05(C1867Zh c1867Zh, View view) {
        this.A02.A0F().AB2();
        c1867Zh.A01();
        A01();
    }

    private LinearLayout getAdHideView() {
        LinearLayout linearLayout = new LinearLayout(this.A02);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this.A02);
        YB.A0a(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(A00(0, 16, 17));
        textView.setGravity(17);
        LinearLayout.LayoutParams undoAdHideParams = new LinearLayout.LayoutParams(-2, -2);
        undoAdHideParams.setMargins(XV.A00, XV.A00, XV.A00, XV.A09);
        final C1867Zh c1867Zh = new C1867Zh(this.A02);
        c1867Zh.setData(A00(16, 4, 44), null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        c1867Zh.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.ZV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A05(c1867Zh, view);
            }
        });
        linearLayout.addView(textView, undoAdHideParams);
        linearLayout.addView(c1867Zh, layoutParams);
        return linearLayout;
    }
}
