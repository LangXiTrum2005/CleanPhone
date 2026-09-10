package com.facebook.ads.redexgen.core;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0708Fe extends LinearLayout {
    public int A00;
    public List<GradientDrawable> A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public C0708Fe(C1828k1 c1828k1, C03912c c03912c, int i) {
        super(c1828k1);
        this.A00 = -1;
        setOrientation(0);
        setGravity(17);
        float f = CP.A02;
        int i2 = (int) (8.0f * f);
        int i3 = (int) (6.0f * f);
        this.A02 = (int) (1.0f * f);
        this.A04 = c03912c.A05(false);
        this.A03 = AnonymousClass43.A02(this.A04, 128);
        this.A01 = new ArrayList();
        for (int margin = 0; margin < i; margin++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i2, i2);
            gradientDrawable.setStroke(this.A02, 0);
            ImageView imageView = new ImageView(c1828k1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, i3, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.A01.add(gradientDrawable);
            addView(imageView);
        }
        A00(0);
    }

    public final void A00(int i) {
        int i2;
        int borderColor;
        if (this.A00 == i) {
            return;
        }
        this.A00 = i;
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 == i) {
                i2 = this.A04;
                borderColor = this.A04;
            } else {
                i2 = this.A03;
                borderColor = 0;
            }
            GradientDrawable gradientDrawable = this.A01.get(i3);
            int i4 = this.A02;
            gradientDrawable.setStroke(i4, borderColor);
            this.A01.get(i3).setColor(i2);
            this.A01.get(i3).invalidateSelf();
        }
    }
}
