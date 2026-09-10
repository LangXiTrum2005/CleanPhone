package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1891a5 extends LinearLayout {
    public final Bitmap A00;

    public C1891a5(C2300gi c2300gi, EnumC1908aM enumC1908aM) {
        super(c2300gi);
        this.A00 = YN.A01(YM.AD_CHOICE_ICON);
        c2300gi.A0F().AAz(enumC1908aM.name().toLowerCase(Locale.US));
        A00();
        setAdChoiceIcon(c2300gi);
    }

    private void A00() {
        setOrientation(0);
        setPadding(XV.A0I, XV.A0I, XV.A0I, XV.A0I);
        setClipToPadding(false);
        setGravity(17);
        YB.A0N(this, -859190839);
        YB.A0E(XV.A0C, this);
    }

    private void setAdChoiceIcon(C2300gi c2300gi) {
        ImageView imageView = new ImageView(c2300gi);
        YB.A0K(imageView);
        imageView.setImageBitmap(this.A00);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, XV.A0U));
        addView(imageView);
    }
}
