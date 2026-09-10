package com.facebook.ads.redexgen.core;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1861Zb extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final C1590Og A02;
    public final C2300gi A03;
    public final InterfaceC1865Zf A04;
    public final boolean A05;
    public static final int A09 = (int) (XX.A02 * 16.0f);
    public static final int A0A = (int) (XX.A02 * 8.0f);
    public static final int A0D = (int) (XX.A02 * 44.0f);
    public static final int A08 = (int) (XX.A02 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (XX.A02 * 75.0f);
    public static final int A0B = (int) (XX.A02 * 25.0f);
    public static final int A0F = (int) (XX.A02 * 45.0f);
    public static final int A0C = (int) (XX.A02 * 15.0f);
    public static final int A06 = (int) (XX.A02 * 16.0f);

    public C1861Zb(C1860Za c1860Za) {
        super(c1860Za.A0B);
        this.A03 = c1860Za.A0B;
        this.A02 = AbstractC1591Oh.A00(this.A03.A02());
        this.A04 = c1860Za.A02;
        this.A01 = c1860Za.A0A ? A0E : A0F;
        this.A00 = c1860Za.A0A ? A0B : A0C;
        this.A05 = c1860Za.A07;
        setFocusable(true);
        View viewA01 = A01(c1860Za);
        View viewA00 = A00(c1860Za);
        View footerView = getFooterView();
        YB.A0K(viewA01);
        YB.A0K(viewA00);
        YB.A0K(footerView);
        RelativeLayout.LayoutParams contentParams = new RelativeLayout.LayoutParams(-1, -2);
        contentParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        layoutParams.addRule(3, viewA01.getId());
        layoutParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(12);
        footerParams.setMargins(A09, 0, A09, A09);
        addView(viewA01, contentParams);
        addView(viewA00, layoutParams);
        addView(footerView, footerParams);
        footerView.setVisibility(0);
    }

    public /* synthetic */ C1861Zb(C1860Za c1860Za, ZY zy) {
        this(c1860Za);
    }

    private View A00(C1860Za c1860Za) {
        ImageView imageView = new ImageView(getContext());
        imageView.setPadding(this.A00, this.A00, this.A00, this.A00);
        imageView.setImageBitmap(YN.A01(c1860Za.A01));
        imageView.setColorFilter(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.A01, this.A01);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(c1860Za.A00);
        YB.A0V(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        layoutParams.setMargins(A09, 0, A09, A09);
        TextView subtitleView = new TextView(getContext());
        YB.A0a(subtitleView, true, 20);
        subtitleView.setTextColor(-14934495);
        subtitleView.setText(c1860Za.A06);
        subtitleView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A09, 0, A09, A09);
        TextView titleView = new TextView(getContext());
        YB.A0a(titleView, false, 16);
        titleView.setTextColor(-10459280);
        titleView.setText(c1860Za.A05);
        titleView.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A09, 0, A09, A09);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(subtitleView, layoutParams2);
        linearLayout.addView(titleView, layoutParams3);
        if (c1860Za.A08) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(c1860Za.A04)) {
                C1994bk c1994bk = new C1994bk(this.A03);
                LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(A0F, A0F);
                iconParams.setMargins(0, 0, A0A, 0);
                c1994bk.setFullCircleCorners(true);
                new LM(c1994bk, this.A03).A05(A0F, A0F).A07(c1860Za.A04);
                linearLayout2.addView(c1994bk, iconParams);
            }
            C1867Zh c1867Zh = new C1867Zh(this.A03);
            c1867Zh.setData(c1860Za.A03, YM.CHECKMARK);
            c1867Zh.setSelected(true);
            linearLayout2.addView(c1867Zh, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(C1860Za c1860Za) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (c1860Za.A09) {
            ImageView imageView = new ImageView(getContext());
            imageView.setPadding(A08, A08, A08, A08);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(YN.A01(YM.CROSS));
            imageView.setOnClickListener(new ZY(this));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0D, A0D);
            layoutParams.setMargins(A07, A07, A07, A07);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(YN.A01(YM.SETTINGS));
        imageView.setColorFilter(-13272859);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        YB.A0a(textView, false, 16);
        textView.setTextColor(-13272859);
        textView.setPadding(A0A, A0A, A0A, A0A);
        textView.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new ZZ(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, settingsIconParams);
        return linearLayout;
    }
}
