package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0757Hb extends LinearLayout {
    public static final int A04 = (int) (CP.A02 * 32.0f);
    public static final int A05 = (int) (CP.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C0709Ff A02;
    public final C1828k1 A03;

    public C0757Hb(C1828k1 c1828k1) {
        super(c1828k1);
        this.A03 = c1828k1;
        A00(c1828k1);
    }

    private final void A00(C1828k1 c1828k1) {
        setGravity(16);
        this.A02 = new C0709Ff(c1828k1);
        this.A02.setFullCircleCorners(true);
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(A04, A04);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c1828k1);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c1828k1);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        D3.A0W(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c1828k1);
        D3.A0W(this.A01, false, 14);
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

    public void setPageDetails(C04022n c04022n) {
        AsyncTaskC1623gc asyncTaskC1623gc = new AsyncTaskC1623gc(this.A02, this.A03);
        asyncTaskC1623gc.A05(A04, A04);
        asyncTaskC1623gc.A07(c04022n.A01());
        this.A00.setText(c04022n.A02());
        this.A01.setText(c04022n.A03());
    }
}
