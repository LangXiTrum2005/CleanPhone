package com.facebook.ads.redexgen.core;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1993bj extends LinearLayout {
    public int A00;
    public List<GradientDrawable> A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public C1993bj(C2300gi c2300gi, C1558Na c1558Na, int i2) {
        super(c2300gi);
        this.A00 = -1;
        setOrientation(0);
        setGravity(17);
        float f = XX.A02;
        int i3 = (int) (8.0f * f);
        this.A02 = (int) (1.0f * f);
        this.A04 = c1558Na.A05(false);
        this.A03 = P3.A02(this.A04, 128);
        this.A01 = new ArrayList();
        for (int i4 = 0; i4 < i2; i4++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i3, i3);
            gradientDrawable.setStroke(this.A02, 0);
            ImageView imageView = new ImageView(c2300gi);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, XV.A0t, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.A01.add(gradientDrawable);
            addView(imageView);
        }
        A00(0);
    }

    public final void A00(int i2) {
        int i3;
        int borderColor;
        if (this.A00 == i2) {
            return;
        }
        this.A00 = i2;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 == i2) {
                i3 = this.A04;
                borderColor = this.A04;
            } else {
                i3 = this.A03;
                borderColor = 0;
            }
            GradientDrawable gradientDrawable = this.A01.get(i4);
            int i5 = this.A02;
            gradientDrawable.setStroke(i5, borderColor);
            this.A01.get(i4).setColor(i3);
            this.A01.get(i4).invalidateSelf();
        }
    }
}
