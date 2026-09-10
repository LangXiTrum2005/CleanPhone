package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1689hg extends FH {
    public final TextView A00;
    public final TextView A01;
    public static final int A02 = (int) (CP.A02 * 36.0f);
    public static final int A05 = (int) (CP.A02 * 4.0f);
    public static final int A03 = (int) (CP.A02 * 8.0f);
    public static final int A04 = (int) (CP.A02 * 4.0f);

    public C1689hg(C1828k1 c1828k1, int i, C03912c c03912c, boolean z, String str, A7 a7, DR dr, JL jl, C0647Cv c0647Cv, C03962h c03962h) {
        super(c1828k1, null, i, c03912c, z, str, a7, dr, jl, c0647Cv, c03962h, false, "");
        setOrientation(0);
        setPadding(A05, A05, A05, A05);
        this.A01 = A02(-16448251, 13, true);
        this.A00 = A02(-10131605, 12, false);
        this.A06.addView(A01(i), new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(this.A06, layoutParams);
        this.A08.setPadding(A03, 0, A03, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, A02);
        layoutParams2.gravity = 17;
        addView(this.A08, layoutParams2);
    }

    private LinearLayout A01(int i) {
        LinearLayout linearLayout = new LinearLayout(this.A07);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04, 0, A04, 0);
        linearLayout.addView(this.A01, FH.A0B);
        linearLayout.addView(this.A00, FH.A0B);
        LinearLayout linearLayout2 = new LinearLayout(this.A07);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(this.A09, new LinearLayout.LayoutParams(i, i));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout2.addView(linearLayout, layoutParams);
        return linearLayout2;
    }

    private TextView A02(int i, int i2, boolean z) {
        TextView textView = new TextView(this.A07);
        textView.setTextColor(i);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        D3.A0W(textView, z, i2);
        return textView;
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public final void A0D(int i) {
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public final void A0N() {
        super.A0N();
        setOnClickListener(this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public void setInfo(C03892a c03892a, C03922d c03922d, String str, String str2, CZ cz, FP fp) {
        super.setInfo(c03892a, c03922d, str, str2, cz, fp);
        this.A01.setText(c03892a.A0F());
        this.A00.setText(c03892a.A0E());
        if (TextUtils.isEmpty(c03922d.A04())) {
            D3.A0F(this.A08);
        }
    }
}
