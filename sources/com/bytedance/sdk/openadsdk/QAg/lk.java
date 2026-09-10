package com.bytedance.sdk.openadsdk.QAg;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.JXs.JVA;
import com.bytedance.sdk.component.JXs.VVE;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.hg;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class lk implements VVE<Bitmap> {
    private final String LD = "ImageLoaderToViewWrapper";
    private final WeakReference<ImageView> Lxb;

    private lk(ImageView imageView) {
        this.Lxb = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.JXs.VVE
    public void Lxb(int i, String str, @Nullable Throwable th) {
    }

    public static VVE Lxb(tD tDVar, String str, ImageView imageView) {
        return new LD(tDVar, str, new lk(imageView));
    }

    @Override // com.bytedance.sdk.component.JXs.VVE
    public void Lxb(JVA<Bitmap> jva) {
        final ImageView imageView = this.Lxb.get();
        if (imageView == null || !(jva.LD() instanceof Bitmap)) {
            return;
        }
        final Bitmap bitmapLD = jva.LD();
        if (hg.JXs()) {
            imageView.setImageBitmap(bitmapLD);
        } else {
            STP.lk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.QAg.lk.1
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(bitmapLD);
                }
            });
        }
    }
}
