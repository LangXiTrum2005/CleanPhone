package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Cj extends ImageView {
    public static final /* synthetic */ int b = 0;
    public double a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cj(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = 1.0d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size == 0 && size2 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        if (size == 0) {
            setMeasuredDimension((int) (((double) size2) * this.a), size2);
            return;
        }
        if (size2 == 0) {
            setMeasuredDimension(size, (int) (((double) size) / this.a));
            return;
        }
        double d = this.a;
        int i3 = (int) (((double) size) / d);
        if (i3 <= size2) {
            setMeasuredDimension(size, i3);
        } else {
            setMeasuredDimension((int) (((double) size2) * d), size2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (bitmap == null || bitmap.getHeight() <= 0) {
            return;
        }
        this.a = ((double) bitmap.getWidth()) / ((double) bitmap.getHeight());
        requestLayout();
    }
}
