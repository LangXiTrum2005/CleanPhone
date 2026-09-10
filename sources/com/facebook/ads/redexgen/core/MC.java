package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class MC extends AbstractC1863Zd {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C1590Og A03;
    public final C2300gi A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-52, -21, -19, -11, 120, -95, -92, -88, -102, 85, 118, -103, 85, -121, -102, -91, -92, -89, -87, -98, -93, -100};
    }

    static {
        A01();
        A08 = (int) (XX.A02 * 8.0f);
        A07 = (int) (XX.A02 * 10.0f);
        A06 = (int) (XX.A02 * 44.0f);
    }

    public MC(C2300gi c2300gi, VA va, String str) {
        super(c2300gi, va, str);
        this.A04 = c2300gi;
        this.A03 = AbstractC1591Oh.A00(this.A04.A02());
        this.A00 = new ImageView(getContext());
        this.A00.setPadding(A07, A07, A07, A07);
        this.A00.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        YB.A0N(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        this.A01.setPadding(A08, A08, A08, A08);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1863Zd
    public final void A0O() {
        this.A00.setImageBitmap(YN.A01(YM.CROSS));
        this.A00.setOnClickListener(new ViewOnClickListenerC1882Zw(this));
        this.A00.setContentDescription(A00(4, 18, 29));
        C1867Zh c1867Zh = new C1867Zh(this.A04);
        c1867Zh.setData(this.A03.A0H(), YM.HIDE_AD);
        c1867Zh.setOnClickListener(new ViewOnClickListenerC1883Zx(this, c1867Zh));
        C1867Zh c1867Zh2 = new C1867Zh(this.A04);
        c1867Zh2.setData(this.A03.A0L(), YM.REPORT_AD);
        c1867Zh2.setOnClickListener(new ViewOnClickListenerC1884Zy(this, c1867Zh2));
        C1867Zh c1867Zh3 = new C1867Zh(this.A04);
        c1867Zh3.setData(this.A03.A0M(), YM.AD_CHOICES_ICON);
        c1867Zh3.setOnClickListener(new ViewOnClickListenerC1885Zz(this, c1867Zh3));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        menuParams.setMargins(A08, A08, A08, A08);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        YB.A0W(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(c1867Zh, menuParams);
        linearLayout.addView(c1867Zh2, menuParams);
        linearLayout.addView(c1867Zh3, menuParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1863Zd
    public final void A0P() {
        YB.A0I(this);
        YB.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1863Zd
    public final void A0Q(C1594Ok c1594Ok, EnumC1592Oi enumC1592Oi) {
        String strA0H;
        YM ym;
        int i2;
        this.A00.setOnClickListener(null);
        if (enumC1592Oi == EnumC1592Oi.A06) {
            strA0H = this.A03.A0F();
            ym = YM.REPORT_AD;
            i2 = -552389;
        } else {
            strA0H = this.A03.A0H();
            ym = YM.HIDE_AD;
            i2 = -13272859;
        }
        C1860Za c1860ZaA0H = new C1860Za(this.A04, this.A0D).A0H(strA0H);
        String title = this.A03.A0D();
        C1860Za c1860ZaA0G = c1860ZaA0H.A0G(title);
        String title2 = c1594Ok.A04();
        C1861Zb adHiddenView = c1860ZaA0G.A0E(title2).A0J(false).A0D(ym).A0C(i2).A0K(false).A0I(false).A0L();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        YB.A0W(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
        super.A0Q(c1594Ok, enumC1592Oi);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1863Zd
    public final void A0R(C1594Ok c1594Ok, EnumC1592Oi enumC1592Oi) {
        boolean isReportFlow = enumC1592Oi == EnumC1592Oi.A06;
        C1881Zv c1881Zv = new C1881Zv(this.A04, c1594Ok, this.A0D, isReportFlow ? YM.REPORT_AD : YM.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(YN.A01(YM.BACK_ARROW));
        this.A00.setOnClickListener(new ViewOnClickListenerC1886a0(this));
        this.A00.setContentDescription(A00(0, 4, 114));
        YB.A0W(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(c1881Zv, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1863Zd
    public final boolean A0S() {
        return true;
    }
}
