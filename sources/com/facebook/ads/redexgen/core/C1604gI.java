package com.facebook.ads.redexgen.core;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.umeng.analytics.pro.bc;
import java.text.NumberFormat;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1604gI extends FH {
    public static byte[] A0J;
    public static String[] A0K = {"U1MfpI1C6bH5E6SUUi1isARh9jp", "U", "Ubu5RVHkDHh3GnMyAX4EkYenDqWvQs6J", "Crj7vvGLMnYJtX1VpNFn8xcnVkyg9fPV", "3oNG9AhO9bk5LTGV0GcEQxoD", bc.aM, "kfjfnNCZtD", "orAcnrCTNYiJWv2aZLW"};
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final int A0V;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public C03892a A06;
    public C03912c A07;
    public C03922d A08;
    public C0711Fh A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final LinearLayout A0D;
    public final RelativeLayout A0E;
    public final RelativeLayout A0F;
    public final TextView A0G;
    public final C1828k1 A0H;
    public final boolean A0I;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 95);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A05() {
        this.A0E.removeAllViews();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = A0O;
        this.A0E.setLayoutParams(layoutParams);
        D3.A0I(this.A0E);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(super.A04, super.A04);
        layoutParams2.addRule(15);
        layoutParams2.addRule(9);
        this.A0E.addView(super.A09, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = A0P;
        layoutParams3.addRule(1, super.A09.getId());
        layoutParams3.addRule(15);
        this.A0E.addView(this.A0F, layoutParams3);
        this.A0F.removeAllViews();
        D3.A0I(this.A05);
        this.A05.setLayoutParams(FH.A0B);
        this.A05.setTextColor(this.A0B ? this.A07.A07(true) : -1);
        D3.A0W(this.A05, true, 18);
        this.A0F.addView(this.A05);
        this.A02.setOrientation(0);
        this.A02.setGravity(16);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0Q);
        layoutParams4.topMargin = A0P / 2;
        layoutParams4.addRule(3, this.A05.getId());
        this.A0F.addView(this.A02, layoutParams4);
        this.A02.removeAllViews();
        this.A09.setGravity(16);
        this.A02.addView(this.A09, new LinearLayout.LayoutParams(-2, -1));
        this.A04.setTextColor(this.A0B ? this.A07.A07(true) : -1);
        this.A04.setGravity(16);
        this.A04.setIncludeFontPadding(false);
        D3.A0W(this.A04, false, 14);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams5.leftMargin = A0P;
        this.A02.addView(this.A04, layoutParams5);
    }

    public static void A0A() {
        A0J = new byte[]{-80, -64};
    }

    static {
        A0A();
        A0U = AnonymousClass43.A02(-1, 77);
        A0O = (int) (CP.A02 * 12.0f);
        A0P = (int) (CP.A02 * 8.0f);
        A0L = (int) (CP.A02 * 26.0f);
        A0N = (int) (CP.A02 * 144.0f);
        A0M = (int) (CP.A02 * 48.0f);
        A0Q = (int) (CP.A02 * 16.0f);
        A0V = (int) (CP.A02 * 14.0f);
        A0R = (int) (AbstractC04333s.A08 * 21.0f);
        A0S = (int) (AbstractC04333s.A08 * 12.0f);
        A0T = (int) (AbstractC04333s.A08 * 10.0f);
    }

    public C1604gI(C1828k1 c1828k1, ViewOnClickListenerC1617gW viewOnClickListenerC1617gW, int i, boolean z, C03912c c03912c, boolean z2, String str, A7 a7, DR dr, JL jl, C0647Cv c0647Cv, C03962h c03962h, boolean z3, String str2, boolean z4) {
        super(c1828k1, viewOnClickListenerC1617gW, i, c03912c, z2, str, a7, dr, jl, c0647Cv, c03962h, z3, str2);
        this.A0C = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A0A = true;
        this.A0H = c1828k1;
        super.A09.setFullCircleCorners(z);
        setPadding(A0O, A0O, A0O, A0L);
        this.A0E = new RelativeLayout(getContext());
        this.A05 = new TextView(getContext());
        this.A02 = new LinearLayout(getContext());
        this.A09 = new C0711Fh(this.A0H, A0V, 5, A0U, -1);
        this.A0F = new RelativeLayout(getContext());
        this.A0D = new LinearLayout(getContext());
        this.A04 = new TextView(getContext());
        this.A03 = new TextView(getContext());
        super.A06.addView(this.A0E);
        super.A06.addView(this.A0D);
        this.A0G = new TextView(getContext());
        this.A07 = c03912c;
        this.A0I = C05789m.A16(c1828k1);
        D3.A0P(this, c1828k1);
        this.A0B = C05789m.A2S(this.A0H);
        A0O();
        if (z4) {
            this.A03.setVisibility(8);
            this.A0D.setVisibility(8);
        }
    }

    public C1604gI(C1828k1 c1828k1, ViewOnClickListenerC1617gW viewOnClickListenerC1617gW, int i, boolean z, C03912c c03912c, boolean z2, String str, A7 a7, DR dr, JL jl, C0647Cv c0647Cv, AbstractC1984md abstractC1984md) {
        this(c1828k1, viewOnClickListenerC1617gW, i, z, c03912c, false, str, a7, dr, jl, c0647Cv, abstractC1984md.A1c(), abstractC1984md.A1I(), abstractC1984md.A0k(), abstractC1984md.A1N());
    }

    private GradientDrawable A01(int i, float f) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(f);
        drawable.setColor(i);
        return drawable;
    }

    private void A03() {
        super.A08.setPadding(0, 0, 0, 0);
        super.A08.setLayoutParams(new LinearLayout.LayoutParams(-1, A0M));
    }

    private void A04() {
        LinearLayout.LayoutParams layoutParams;
        this.A0D.setOrientation(1);
        this.A0D.setPadding(0, 0, 0, A0O);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.A0E.getId());
        this.A0D.setLayoutParams(layoutParams2);
        this.A0D.removeAllViews();
        this.A03.setMaxLines(2);
        this.A03.setEllipsize(TextUtils.TruncateAt.END);
        this.A03.setGravity(16);
        this.A03.setTextColor(this.A0B ? this.A07.A06(true) : -1);
        D3.A0W(this.A03, false, 16);
        if (this.A0I) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        this.A0D.addView(this.A03, layoutParams);
    }

    private void A06() {
        if (super.A01 != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            super.A01.setPadding(0, 0, 0, A0S);
            super.A01.setText(super.A02);
            super.A01.setTextColor(-1);
            D3.A0W(super.A01, false, 15);
            super.A01.setLayoutParams(layoutParams);
        }
    }

    private void A07() {
        if (super.A00 != null) {
            super.A00.removeAllViews();
            super.A00.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            layoutParams.setMargins(0, A0R, 0, A0R);
            super.A00.setGravity(17);
            super.A00.setPadding(A0S, A0S, A0S, A0S);
            super.A00.setLayoutParams(layoutParams);
            D3.A0Q(super.A00, A01(-1121112787, A0T));
            A06();
            A03();
            if (super.A01 != null) {
                super.A00.addView(super.A01);
            }
            super.A00.addView(super.A08);
        }
    }

    private void A08() {
        LinearLayout.LayoutParams layoutParams;
        this.A0G.setMaxLines(1);
        this.A0G.setEllipsize(TextUtils.TruncateAt.END);
        this.A0G.setGravity(17);
        this.A0G.setTextColor(this.A0B ? this.A07.A07(true) : -1);
        this.A0G.setAllCaps(true);
        D3.A0W(this.A0G, false, 12);
        new LinearLayout.LayoutParams(-1, -2);
        if (this.A0I) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams.topMargin = A0O;
        this.A0G.setLayoutParams(layoutParams);
    }

    private void A09() {
        if (this.A06 == null) {
            return;
        }
        TextView textView = this.A05;
        C03892a c03892a = this.A06;
        if (A0K[2].charAt(28) == 'n') {
            throw new RuntimeException();
        }
        A0K[2] = "SIvKbfulzllrpdkfdrym2tho7PogZ3oV";
        textView.setText(c03892a.A0F());
        this.A03.setText(this.A06.A04());
        this.A0G.setText(this.A06.A0D());
        if (TextUtils.isEmpty(this.A08.A04())) {
            D3.A0F(super.A08);
        }
        if (TextUtils.isEmpty(this.A06.A0D())) {
            D3.A0F(this.A0G);
        }
        if (TextUtils.isEmpty(this.A06.A0B())) {
            this.A02.setVisibility(8);
            return;
        }
        this.A02.setVisibility(0);
        this.A09.setRating(Float.parseFloat(this.A06.A0B()));
        if (this.A06.A08() == null) {
            return;
        }
        this.A04.setText(A02(0, 1, 41) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A06.A08())) + A02(1, 1, 56));
    }

    private final void A0B() {
        setWeightSum(5.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = !super.A03 ? 4.0f : 3.0f;
        layoutParams.bottomMargin = A0L - A0O;
        super.A06.setLayoutParams(layoutParams);
        D3.A0H(super.A06);
        addView(super.A06);
        if (!super.A03) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, A0M);
            layoutParams2.bottomMargin = A0L / 2;
            layoutParams2.weight = 1.0f;
            layoutParams2.gravity = 80;
            super.A08.setLayoutParams(layoutParams2);
            super.A08.setMinWidth(A0N);
            D3.A0H(super.A08);
            addView(super.A08);
        } else if (super.A00 != null) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
            layoutParams3.weight = 2.0f;
            super.A00.setLayoutParams(layoutParams3);
            super.A00.requestLayout();
        }
        D3.A0H(this.A0G);
        LinearLayout.LayoutParams socialContextParams = new LinearLayout.LayoutParams(-1, -1);
        socialContextParams.topMargin = 0;
        socialContextParams.bottomMargin = A0P;
        this.A0D.addView(this.A0G, socialContextParams);
        this.A0D.setPadding(0, 0, 0, 0);
        this.A0G.setGravity(3);
    }

    private final void A0C() {
        super.A06.setLayoutParams(FH.A0B);
        A05();
        A04();
        if (!super.A03) {
            A03();
        } else {
            A07();
        }
        A08();
        A09();
        D3.A0H(super.A06);
        if (!super.A03) {
            ViewOnClickListenerC1617gW viewOnClickListenerC1617gW = super.A08;
            if (A0K[5].length() == 26) {
                throw new RuntimeException();
            }
            A0K[5] = "AjTT";
            D3.A0H(viewOnClickListenerC1617gW);
        }
        addView(super.A06);
        if (!super.A03) {
            ViewOnClickListenerC1617gW viewOnClickListenerC1617gW2 = super.A08;
            if (A0K[4].length() != 24) {
                addView(viewOnClickListenerC1617gW2);
            } else {
                A0K[4] = "rq1KML2CIBWnAolyigIp8Fd7";
                addView(viewOnClickListenerC1617gW2);
            }
        } else if (super.A00 != null) {
            addView(super.A00);
        }
        D3.A0H(this.A0G);
        addView(this.A0G);
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public final void A0D(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.A0A = z;
        setOrientation(this.A0A ? 1 : 0);
        A0O();
        bringToFront();
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public final void A0N() {
        super.A0N();
        this.A09.setOnClickListener(super.A05);
        this.A0G.setOnClickListener(super.A05);
        this.A04.setOnClickListener(super.A05);
        this.A03.setOnClickListener(super.A05);
        this.A05.setOnClickListener(super.A05);
    }

    public final void A0O() {
        removeAllViews();
        if (this.A0A) {
            A0C();
        } else {
            A0B();
        }
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public final View getExpandableLayout() {
        return this.A0D;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A00 == 0) {
            this.A00 = this.A03.getHeight();
            this.A01 = this.A0G.getHeight();
        }
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public void setInfo(C03892a c03892a, C03922d c03922d, String str, String str2, CZ cz, FP fp) {
        super.setInfo(c03892a, c03922d, str, str2, cz, fp);
        this.A06 = c03892a;
        this.A08 = c03922d;
        A09();
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public void setTitleMaxLines(int i) {
        this.A05.setMaxLines(i);
        this.A05.setEllipsize(TextUtils.TruncateAt.END);
    }
}
