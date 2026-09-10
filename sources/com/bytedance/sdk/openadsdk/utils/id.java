package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class id implements com.bytedance.sdk.component.JXs.VVE<Bitmap> {
    private final WeakReference<ImageView> Lxb;

    public id(ImageView imageView) {
        this.Lxb = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.JXs.VVE
    public void Lxb(com.bytedance.sdk.component.JXs.JVA<Bitmap> jva) {
        ImageView imageView = this.Lxb.get();
        if (imageView == null) {
            return;
        }
        if (jva != null) {
            try {
                if (jva.LD() != null) {
                    imageView.setImageBitmap(jva.LD());
                    return;
                }
            } catch (Throwable unused) {
                imageView.setVisibility(8);
                return;
            }
        }
        imageView.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.JXs.VVE
    public void Lxb(int i, String str, @Nullable Throwable th) {
        ImageView imageView = this.Lxb.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
