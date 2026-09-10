package com.bytedance.sdk.openadsdk.tvp;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.bitmap.a;
import com.bytedance.sdk.component.mzz.jtx;
import com.bytedance.sdk.component.mzz.rq;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.utils.fco;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class lnr implements jtx {
    private jtx lnr;
    private final WeakReference<ImageView> qdl;
    private final String ud = "ImageLoaderToViewWrapper";

    private lnr(ImageView imageView, jtx jtxVar) {
        this.qdl = new WeakReference<>(imageView);
        this.lnr = jtxVar;
    }

    public static jtx qdl(ljh ljhVar, String str, ImageView imageView) {
        return new ud(ljhVar, str, new lnr(imageView));
    }

    public static jtx qdl(ljh ljhVar, String str, ImageView imageView, jtx jtxVar) {
        return new ud(ljhVar, str, new lnr(imageView, jtxVar));
    }

    private lnr(ImageView imageView) {
        this.qdl = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.mzz.jtx
    public void qdl(rq rqVar) {
        final ImageView imageView = this.qdl.get();
        if (imageView != null) {
            final Object objUd = rqVar.ud();
            if (objUd instanceof Bitmap) {
                if (fco.mo()) {
                    imageView.setImageBitmap((Bitmap) objUd);
                } else {
                    rdp.lnr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tvp.lnr.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap((Bitmap) objUd);
                        }
                    });
                }
                jtx jtxVar = this.lnr;
                if (jtxVar != null) {
                    jtxVar.qdl(rqVar);
                    return;
                }
                return;
            }
            if (objUd instanceof Drawable) {
                if (fco.mo()) {
                    qdl(objUd, imageView);
                } else {
                    rdp.lnr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tvp.lnr.2
                        @Override // java.lang.Runnable
                        public void run() {
                            lnr.this.qdl(objUd, imageView);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(Object obj, ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 28 && a.w(obj)) {
            a.l(obj).start();
        }
        imageView.setImageDrawable((Drawable) obj);
    }

    @Override // com.bytedance.sdk.component.mzz.jtx
    public void qdl(int i2, String str, Throwable th) {
        jtx jtxVar = this.lnr;
        if (jtxVar != null) {
            jtxVar.qdl(i2, str, th);
        }
    }
}
