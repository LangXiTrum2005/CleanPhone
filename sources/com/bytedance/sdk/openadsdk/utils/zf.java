package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import dumb.dern;
import dumb.saneness;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class zf implements com.bytedance.sdk.component.fi.slm {
    private final WeakReference<ImageView> ri;

    public zf(ImageView imageView) {
        this.ri = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.fi.slm
    public void ri(com.bytedance.sdk.component.fi.sf sfVar) {
        ImageView imageView = this.ri.get();
        if (imageView == null) {
            return;
        }
        try {
            Object objLr = sfVar.lr();
            if (objLr instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objLr);
                return;
            }
            if (!(objLr instanceof Drawable)) {
                imageView.setVisibility(8);
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && saneness.attabal(objLr)) {
                dern.attabal(objLr).start();
            }
            imageView.setImageDrawable((Drawable) objLr);
        } catch (Throwable unused) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.fi.slm
    public void ri(int i, String str, Throwable th) {
        ImageView imageView = this.ri.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
