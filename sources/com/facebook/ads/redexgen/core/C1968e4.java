package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1968e4 extends LinearLayout {
    public static final int A04 = (int) (XX.A02 * 32.0f);
    public static final int A05 = (int) (XX.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C1825bk A02;
    public final C2131gi A03;

    public C1968e4(C2131gi c2131gi) {
        super(c2131gi);
        this.A03 = c2131gi;
        A00(c2131gi);
    }

    private final void A00(C2131gi c2131gi) {
        setGravity(16);
        this.A02 = new C1825bk(c2131gi);
        this.A02.setFullCircleCorners(true);
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(A04, A04);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c2131gi);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c2131gi);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        YB.A0a(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c2131gi);
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

    public final void A02(int i, int i2) {
        this.A00.setTextColor(i);
        this.A01.setTextColor(i2);
    }

    public void setPageDetails(C1401Nm c1401Nm) {
        LM lm = new LM(this.A02, this.A03);
        lm.A05(A04, A04);
        lm.A07(c1401Nm.A01());
        this.A00.setText(c1401Nm.A02());
        this.A01.setText(c1401Nm.A03());
    }
}
