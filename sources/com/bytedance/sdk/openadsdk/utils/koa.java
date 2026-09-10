package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.bitmap.a;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class koa implements com.bytedance.sdk.component.mzz.jtx {
    private final WeakReference<ImageView> qdl;

    public koa(ImageView imageView) {
        this.qdl = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.mzz.jtx
    public void qdl(com.bytedance.sdk.component.mzz.rq rqVar) {
        ImageView imageView = this.qdl.get();
        if (imageView == null) {
            return;
        }
        try {
            Object objUd = rqVar.ud();
            if (objUd instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objUd);
                return;
            }
            if (!(objUd instanceof Drawable)) {
                imageView.setVisibility(8);
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && a.v((Drawable) objUd)) {
                a.k((Drawable) objUd).start();
            }
            imageView.setImageDrawable((Drawable) objUd);
        } catch (Throwable unused) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.mzz.jtx
    public void qdl(int i2, String str, Throwable th) {
        ImageView imageView = this.qdl.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
