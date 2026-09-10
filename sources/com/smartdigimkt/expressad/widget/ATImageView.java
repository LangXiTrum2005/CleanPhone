package com.smartdigimkt.expressad.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.smartdigimkt.f0.b;
import com.smartdigimkt.f0.c;

/* JADX INFO: loaded from: classes5.dex */
public class ATImageView extends ImageView {
    private static final String g0 = "at-widget-imageview";
    private Bitmap e0;
    private String f0;

    public class a implements c {
        public a() {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            ATImageView.this.setImageBitmap(bitmap);
        }
    }

    public ATImageView(Context context) {
        super(context);
        this.e0 = null;
    }

    private void a() {
        if (getContext() != null) {
            b.a(getContext()).a(this.f0, new a());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            Bitmap bitmap = this.e0;
            if (bitmap == null || !bitmap.isRecycled()) {
                super.onDraw(canvas);
            } else {
                a();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.e0 = bitmap;
        if (bitmap == null) {
            super.setImageBitmap(bitmap);
        } else if (!bitmap.isRecycled()) {
            super.setImageBitmap(bitmap);
        } else {
            this.e0 = null;
            super.setImageBitmap(null);
        }
    }

    public void setImageUrl(String str) {
        this.f0 = str;
    }

    public ATImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = null;
    }

    public ATImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = null;
    }
}
