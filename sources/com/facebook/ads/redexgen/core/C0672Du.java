package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Du, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0672Du extends LinearLayout {
    public static final int A03 = (int) (CP.A02 * 10.0f);
    public static final int A04 = (int) (CP.A02 * 24.0f);
    public final ImageView A00;
    public final C04213g A01;
    public final C1828k1 A02;

    public C0672Du(C1828k1 c1828k1) {
        super(c1828k1);
        this.A02 = c1828k1;
        this.A01 = AbstractC04223h.A00(c1828k1.A02());
        this.A00 = new ImageView(c1828k1);
        A02();
    }

    private void A02() {
        A03(this.A00, DB.REDESIGN_INFO_ICON);
        setPadding(A03, A03 / 3, A03, A03 / 3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        addView(this.A00, layoutParams);
    }

    public static void A03(ImageView imageView, DB db) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(DC.A01(db));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C04022n c04022n, String str, AF af, DR dr) {
        setOnClickListener(new ViewOnClickListenerC0671Dt(this, af, dr, str, c04022n));
    }

    public void setIconColors(int i) {
        this.A00.setColorFilter(i);
    }
}
