package com.smartdigimkt.u2;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.smartdigimkt.v0.q;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class j extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38794e;

    public j(ImageView imageView, int i2) {
        super(imageView);
        this.f38794e = i2;
    }

    @Override // com.smartdigimkt.u2.e, com.smartdigimkt.f0.c
    public void a(Bitmap bitmap, String str) {
        Bitmap bitmapA;
        if (bitmap == null) {
            return;
        }
        try {
            WeakReference<ImageView> weakReference = this.f38790a;
            if (weakReference == null || weakReference.get() == null || bitmap.isRecycled() || (bitmapA = q.a(bitmap, 1, this.f38794e)) == null) {
                return;
            }
            this.f38790a.get().setImageBitmap(bitmapA);
        } catch (Throwable th) {
            if (com.smartdigimkt.b.b.f33800a) {
                th.printStackTrace();
            }
        }
    }
}
