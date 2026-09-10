package com.mbridge.msdk.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"AppCompatCustomView"})
public class MBImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f38354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38355b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements c {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("mb-widget-imageview", str2 + " load failed:" + str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            MBImageView.this.setImageBitmap(bitmap);
        }
    }

    public MBImageView(Context context) {
        super(context);
        this.f38354a = null;
    }

    private void a() {
        if (getContext() != null) {
            b.a(getContext()).a(this.f38355b, new a());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f38354a;
        if (bitmap == null || !bitmap.isRecycled()) {
            super.onDraw(canvas);
        } else {
            q0.b("mb-widget-imageview", "onDraw bitmap recycled");
            a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f38354a = bitmap;
        if (bitmap == null) {
            super.setImageBitmap(bitmap);
        } else {
            if (!bitmap.isRecycled()) {
                super.setImageBitmap(bitmap);
                return;
            }
            this.f38354a = null;
            super.setImageBitmap(null);
            q0.b("mb-widget-imageview", "setImageBitmap recycled");
        }
    }

    public void setImageUrl(String str) {
        this.f38355b = str;
    }

    public MBImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38354a = null;
    }

    public MBImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f38354a = null;
    }
}
