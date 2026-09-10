package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1660hD extends EH {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C04213g A03;
    public final C1828k1 A04;

    public static String A0B(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A05 = new byte[]{-52, -21, -19, -11, 120, -95, -92, -88, -102, 85, 118, -103, 85, -121, -102, -91, -92, -89, -87, -98, -93, -100};
    }

    static {
        A0C();
        A08 = (int) (CP.A02 * 8.0f);
        A07 = (int) (CP.A02 * 10.0f);
        A06 = (int) (CP.A02 * 44.0f);
    }

    public C1660hD(C1828k1 c1828k1, A7 a7, String str) {
        super(c1828k1, a7, str);
        this.A04 = c1828k1;
        this.A03 = AbstractC04223h.A00(this.A04.A02());
        this.A00 = new ImageView(getContext());
        this.A00.setPadding(A07, A07, A07, A07);
        this.A00.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        D3.A0K(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        this.A01.setPadding(A08, A08, A08, A08);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.EH
    public final void A0L() {
        this.A00.setImageBitmap(DC.A01(DB.CROSS));
        this.A00.setOnClickListener(new ViewOnClickListenerC0678Ea(this));
        this.A00.setContentDescription(A0B(4, 18, 29));
        EL el = new EL(this.A04);
        el.setData(this.A03.A0H(), DB.HIDE_AD);
        el.setOnClickListener(new ViewOnClickListenerC0679Eb(this, el));
        EL el2 = new EL(this.A04);
        el2.setData(this.A03.A0L(), DB.REPORT_AD);
        el2.setOnClickListener(new ViewOnClickListenerC0680Ec(this, el2));
        EL el3 = new EL(this.A04);
        el3.setData(this.A03.A0M(), DB.AD_CHOICES_ICON);
        el3.setOnClickListener(new ViewOnClickListenerC0681Ed(this, el3));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        menuParams.setMargins(A08, A08, A08, A08);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        D3.A0R(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(el, menuParams);
        linearLayout.addView(el2, menuParams);
        linearLayout.addView(el3, menuParams);
    }

    @Override // com.facebook.ads.redexgen.core.EH
    public final void A0M() {
        D3.A0G(this);
        D3.A0H(this);
    }

    @Override // com.facebook.ads.redexgen.core.EH
    public final void A0N(C04253k c04253k, EnumC04233i enumC04233i) {
        String strA0H;
        DB db;
        int i;
        this.A00.setOnClickListener(null);
        if (enumC04233i == EnumC04233i.A06) {
            strA0H = this.A03.A0F();
            db = DB.REPORT_AD;
            i = -552389;
        } else {
            strA0H = this.A03.A0H();
            db = DB.HIDE_AD;
            i = -13272859;
        }
        EF efA0I = new EF(this.A04, this.A0B).A0I(strA0H);
        String title = this.A03.A0D();
        EF efA0H = efA0I.A0H(title);
        String title2 = c04253k.A04();
        EG adHiddenView = efA0H.A0F(title2).A0K(false).A0E(db).A0D(i).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        D3.A0R(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.EH
    public final void A0O(C04253k c04253k, EnumC04233i enumC04233i) {
        boolean isReportFlow = enumC04233i == EnumC04233i.A06;
        EZ ez = new EZ(this.A04, c04253k, this.A0B, isReportFlow ? DB.REPORT_AD : DB.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(DC.A01(DB.BACK_ARROW));
        this.A00.setOnClickListener(new ViewOnClickListenerC0682Ee(this));
        this.A00.setContentDescription(A0B(0, 4, 114));
        D3.A0R(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(ez, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.EH
    public final boolean A0P() {
        return true;
    }
}
