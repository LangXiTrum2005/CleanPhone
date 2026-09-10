package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class F7 extends LinearLayout implements InterfaceC2172ee {
    public final NativeBannerAd A00;
    public final C2300gi A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (XX.A02 * 42.0f);
    public static final int A03 = (int) (XX.A02 * 48.0f);
    public static final int A05 = (int) (XX.A02 * 54.0f);
    public static final int A07 = (int) (XX.A02 * 4.0f);
    public static final int A06 = (int) (XX.A02 * 8.0f);

    public F7(C2300gi c2300gi, NativeBannerAd nativeBannerAd, C1764Vd c1764Vd, EnumC1765Ve enumC1765Ve, MediaView mediaView, AdOptionsView adOptionsView, C1891a5 c1891a5) {
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams commonLayoutParams;
        super(c2300gi);
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c2300gi;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int iA00 = A00(enumC1765Ve);
        C1995bl c1995bl = new C1995bl(this.A01);
        c1995bl.setFullCircleCorners(true);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA00, iA00);
        c1995bl.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        relativeLayout.addView(c1995bl, layoutParams2);
        if (c1891a5 != null) {
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(10);
            layoutParams4.setMargins(XV.A0A, XV.A0A, XV.A00, XV.A00);
            relativeLayout.addView(c1891a5, layoutParams4);
        }
        linearLayout.addView(relativeLayout, layoutParams3);
        View c2169eb = new C2169eb(c2300gi, this.A00, enumC1765Ve, c1764Vd, adOptionsView);
        c2169eb.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = 16;
        linearLayout.addView(c2169eb, layoutParams5);
        if (enumC1765Ve == EnumC1765Ve.A0A) {
            setPadding(A07, A07, A07, A07);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            commonLayoutParams = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            setPadding(A06, A06, A06, A06);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            commonLayoutParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView textView = new TextView(getContext());
        textView.setPadding(A06, A07, A06, A07);
        c1764Vd.A05(textView);
        textView.setText(this.A00.getAdCallToAction());
        addView(textView, commonLayoutParams);
        this.A02.add(mediaView);
        this.A02.add(textView);
    }

    public static int A00(EnumC1765Ve enumC1765Ve) {
        switch (enumC1765Ve) {
            case A0A:
                return A04;
            case A06:
                return A03;
            default:
                return A05;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2172ee
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2172ee
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2172ee
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
