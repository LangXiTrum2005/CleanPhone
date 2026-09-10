package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAd;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2004ef extends LinearLayout {
    public static final int A00 = (int) (XX.A02 * 32.0f);
    public static final int A01 = (int) (XX.A02 * 8.0f);

    public C2004ef(C2131gi c2131gi, NativeAd nativeAd, C1595Vd c1595Vd, C1825bk c1825bk, AdOptionsView adOptionsView) {
        super(c2131gi);
        setOrientation(0);
        c1825bk.setFullCircleCorners(true);
        LinearLayout.LayoutParams iconViewParams = new LinearLayout.LayoutParams(A00, A00);
        iconViewParams.gravity = 16;
        iconViewParams.setMargins(0, 0, A01, 0);
        addView(c1825bk, iconViewParams);
        TextView textView = new TextView(c2131gi);
        c1595Vd.A08(textView);
        textView.setMaxLines(1);
        textView.setText(nativeAd.getAdvertiserName());
        TextView sponsoredTextView = new TextView(c2131gi);
        c1595Vd.A06(sponsoredTextView);
        sponsoredTextView.setMaxLines(1);
        sponsoredTextView.setText(nativeAd.getSponsoredTranslation());
        LinearLayout linearLayout = new LinearLayout(c2131gi);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams iconViewParams2 = new LinearLayout.LayoutParams(0, -2);
        iconViewParams2.weight = 1.0f;
        iconViewParams2.gravity = 16;
        LinearLayout.LayoutParams textContainerParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(textView, textContainerParams);
        LinearLayout.LayoutParams textContainerParams2 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(sponsoredTextView, textContainerParams2);
        addView(linearLayout, iconViewParams2);
        ViewGroup.LayoutParams textContainerParams3 = new LinearLayout.LayoutParams(-2, -2);
        addView(adOptionsView, textContainerParams3);
    }
}
