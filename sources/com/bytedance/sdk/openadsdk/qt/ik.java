package com.bytedance.sdk.openadsdk.qt;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.bytedance.sdk.component.fi.sf;
import com.bytedance.sdk.component.fi.slm;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.utils.dzy;
import dumb.dern;
import dumb.saneness;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class ik implements slm {
    private slm ik;
    private final String lr = "ImageLoaderToViewWrapper";
    private final WeakReference<ImageView> ri;

    private ik(ImageView imageView, slm slmVar) {
        this.ri = new WeakReference<>(imageView);
        this.ik = slmVar;
    }

    public static slm ri(wjv wjvVar, String str, ImageView imageView) {
        return new lr(wjvVar, str, new ik(imageView));
    }

    public static slm ri(wjv wjvVar, String str, ImageView imageView, slm slmVar) {
        return new lr(wjvVar, str, new ik(imageView, slmVar));
    }

    private ik(ImageView imageView) {
        this.ri = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.fi.slm
    public void ri(sf sfVar) {
        final ImageView imageView = this.ri.get();
        if (imageView != null) {
            final Object objLr = sfVar.lr();
            if (objLr instanceof Bitmap) {
                if (dzy.di()) {
                    imageView.setImageBitmap((Bitmap) objLr);
                } else {
                    vr.ik().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qt.ik.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap((Bitmap) objLr);
                        }
                    });
                }
                slm slmVar = this.ik;
                if (slmVar != null) {
                    slmVar.ri(sfVar);
                    return;
                }
                return;
            }
            if (objLr instanceof Drawable) {
                if (dzy.di()) {
                    ri(objLr, imageView);
                } else {
                    vr.ik().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qt.ik.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ik.this.ri(objLr, imageView);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(Object obj, ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 28 && saneness.attabal(obj)) {
            dern.attabal(obj).start();
        }
        imageView.setImageDrawable((Drawable) obj);
    }

    @Override // com.bytedance.sdk.component.fi.slm
    public void ri(int i, String str, Throwable th) {
        slm slmVar = this.ik;
        if (slmVar != null) {
            slmVar.ri(i, str, th);
        }
    }
}
