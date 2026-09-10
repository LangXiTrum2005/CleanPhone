package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1369cT extends LinearLayout implements IB {
    public final NativeBannerAd A00;
    public final C1828k1 A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (CP.A02 * 42.0f);
    public static final int A03 = (int) (CP.A02 * 48.0f);
    public static final int A05 = (int) (CP.A02 * 54.0f);
    public static final int A07 = (int) (CP.A02 * 4.0f);
    public static final int A06 = (int) (CP.A02 * 8.0f);

    public C1369cT(C1828k1 c1828k1, NativeBannerAd nativeBannerAd, AW aw, AX ax, MediaView mediaView, AdOptionsView adOptionsView) {
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams ctaButtonParams;
        super(c1828k1);
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c1828k1;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int iA00 = A00(ax);
        C0710Fg c0710Fg = new C0710Fg(this.A01);
        c0710Fg.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iA00, iA00);
        layoutParams2.gravity = 16;
        c0710Fg.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(c0710Fg, layoutParams2);
        I8 i8 = new I8(c1828k1, this.A00, ax, aw, adOptionsView);
        i8.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.gravity = 16;
        linearLayout.addView(i8, layoutParams3);
        if (ax == AX.A0A) {
            setPadding(A07, A07, A07, A07);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            ctaButtonParams = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            setPadding(A06, A06, A06, A06);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            ctaButtonParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView ctaButton = new TextView(getContext());
        ctaButton.setPadding(A06, A07, A06, A07);
        aw.A05(ctaButton);
        ctaButton.setText(this.A00.getAdCallToAction());
        addView(ctaButton, ctaButtonParams);
        this.A02.add(mediaView);
        this.A02.add(ctaButton);
    }

    public static int A00(AX ax) {
        switch (ax) {
            case A0A:
                return A04;
            case A06:
                return A03;
            default:
                return A05;
        }
    }

    @Override // com.facebook.ads.redexgen.core.IB
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.IB
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.IB
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
