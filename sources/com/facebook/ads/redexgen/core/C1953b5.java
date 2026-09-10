package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1953b5 extends FrameLayout {
    public int A00;
    public int A01;
    public final ImageView A02;
    public final ImageView A03;

    public C1953b5(C2300gi c2300gi) {
        super(c2300gi);
        this.A03 = new ImageView(c2300gi);
        this.A02 = new ImageView(c2300gi);
        A00();
    }

    public C1953b5(C2300gi c2300gi, AttributeSet attributeSet) {
        super(c2300gi, attributeSet);
        this.A03 = new ImageView(c2300gi, attributeSet);
        this.A02 = new ImageView(c2300gi, attributeSet);
        A00();
    }

    public C1953b5(C2300gi c2300gi, AttributeSet attributeSet, int i2) {
        super(c2300gi, attributeSet, i2);
        this.A03 = new ImageView(c2300gi, attributeSet, i2);
        this.A02 = new ImageView(c2300gi, attributeSet, i2);
        A00();
    }

    public C1953b5(C2300gi c2300gi, AttributeSet attributeSet, int i2, int i3) {
        super(c2300gi, attributeSet, i2, i3);
        this.A03 = new ImageView(c2300gi, attributeSet, i2, i3);
        this.A02 = new ImageView(c2300gi, attributeSet, i2, i3);
        A00();
    }

    private void A00() {
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
        addView(this.A03, new FrameLayout.LayoutParams(-2, -2));
        EnumC1810Xc.A04(this.A03, EnumC1810Xc.A0B);
        setId(YB.A00());
    }

    public ImageView getBodyImageView() {
        return this.A03;
    }

    public int getImageHeight() {
        return this.A00;
    }

    public int getImageWidth() {
        return this.A01;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (this.A01 <= 0 || this.A00 <= 0) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        float fMin = Math.min(i6 / this.A01, i7 / this.A00);
        int i8 = (int) (this.A01 * fMin);
        int i9 = (int) (this.A00 * fMin);
        this.A02.layout(i2, i3, i4, i5);
        int blurBorderViewHeight = (i6 / 2) + i2;
        int blurBorderViewWidth = (i7 / 2) + i3;
        this.A03.layout(blurBorderViewHeight - (i8 / 2), blurBorderViewWidth - (i9 / 2), (i8 / 2) + blurBorderViewHeight, blurBorderViewWidth + (i9 / 2));
        this.A02.setVisibility(0);
    }

    public void setImage(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            YB.A0V(this.A02, new BitmapDrawable(getContext().getResources(), bitmap2));
        } else {
            YB.A0N(this.A02, 0);
        }
        if (bitmap != null) {
            this.A01 = bitmap.getWidth();
            this.A00 = bitmap.getHeight();
            this.A03.setImageBitmap(Bitmap.createBitmap(bitmap));
            return;
        }
        this.A03.setImageDrawable(null);
    }
}
