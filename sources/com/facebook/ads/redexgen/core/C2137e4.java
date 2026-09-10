package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2137e4 extends LinearLayout {
    public static final int A04 = (int) (XX.A02 * 32.0f);
    public static final int A05 = (int) (XX.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C1994bk A02;
    public final C2300gi A03;

    public C2137e4(C2300gi c2300gi) {
        super(c2300gi);
        this.A03 = c2300gi;
        A00(c2300gi);
    }

    private final void A00(C2300gi c2300gi) {
        setGravity(16);
        this.A02 = new C1994bk(c2300gi);
        this.A02.setFullCircleCorners(true);
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(A04, A04);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c2300gi);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c2300gi);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        YB.A0a(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c2300gi);
        YB.A0a(this.A01, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01() {
        this.A02.setImageBitmap(null);
        this.A00.setText("");
        this.A01.setText("");
    }

    public final void A02(int i2, int i3) {
        this.A00.setTextColor(i2);
        this.A01.setTextColor(i3);
    }

    public void setPageDetails(C1570Nm c1570Nm) {
        LM lm = new LM(this.A02, this.A03);
        lm.A05(A04, A04);
        lm.A07(c1570Nm.A01());
        this.A00.setText(c1570Nm.A02());
        this.A01.setText(c1570Nm.A03());
    }
}
