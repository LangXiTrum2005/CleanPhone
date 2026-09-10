package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1606Ow extends AbstractC1963bF {
    public final TextView A00;
    public final TextView A01;
    public static final int A02 = (int) (XX.A02 * 36.0f);
    public static final int A05 = (int) (XX.A02 * 4.0f);
    public static final int A03 = (int) (XX.A02 * 8.0f);
    public static final int A04 = (int) (XX.A02 * 4.0f);

    public C1606Ow(C2300gi c2300gi, int i2, C1558Na c1558Na, boolean z2, String str, VA va, InterfaceC1841Yh interfaceC1841Yh, C2245fp c2245fp, Y2 y2, C1564Ng c1564Ng) {
        super(c2300gi, null, i2, c1558Na, z2, str, va, interfaceC1841Yh, c2245fp, y2, c1564Ng, false, "");
        setOrientation(0);
        setPadding(A05, A05, A05, A05);
        this.A01 = A01(-16448251, 13, true);
        this.A00 = A01(-10131605, 12, false);
        this.A06.addView(A00(i2), new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(this.A06, layoutParams);
        this.A08.setPadding(A03, 0, A03, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, A02);
        layoutParams2.gravity = 17;
        addView(this.A08, layoutParams2);
    }

    private LinearLayout A00(int i2) {
        LinearLayout linearLayout = new LinearLayout(this.A07);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04, 0, A04, 0);
        linearLayout.addView(this.A01, AbstractC1963bF.A0B);
        linearLayout.addView(this.A00, AbstractC1963bF.A0B);
        LinearLayout linearLayout2 = new LinearLayout(this.A07);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(this.A09, new LinearLayout.LayoutParams(i2, i2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout2.addView(linearLayout, layoutParams);
        return linearLayout2;
    }

    private TextView A01(int i2, int i3, boolean z2) {
        TextView textView = new TextView(this.A07);
        textView.setTextColor(i2);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        YB.A0a(textView, z2, i3);
        return textView;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1963bF
    public final void A0k() {
        super.A0k();
        setOnClickListener(this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1963bF
    public final void A0l(int i2) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1963bF
    public void setInfo(NY ny, C1560Nc c1560Nc, String str, String str2, InterfaceC1815Xh interfaceC1815Xh, InterfaceC1978bU interfaceC1978bU) {
        super.setInfo(ny, c1560Nc, str, str2, interfaceC1815Xh, interfaceC1978bU);
        this.A01.setText(ny.A0G());
        this.A00.setText(ny.A0F());
        if (TextUtils.isEmpty(c1560Nc.A04())) {
            YB.A0H(this.A08);
        }
    }
}
