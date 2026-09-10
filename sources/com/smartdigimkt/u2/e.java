package com.smartdigimkt.u2;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class e implements com.smartdigimkt.f0.c {
    protected static final String d = "ImageLoaderListener";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected WeakReference<ImageView> f38790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.x.d f38791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38792c;

    public e(ImageView imageView) {
        this.f38790a = new WeakReference<>(imageView);
    }

    @Override // com.smartdigimkt.f0.c
    public void a(String str, String str2) {
    }

    @Override // com.smartdigimkt.f0.c
    public void a(Bitmap bitmap, String str) {
        if (bitmap == null) {
            return;
        }
        try {
            WeakReference<ImageView> weakReference = this.f38790a;
            if (weakReference == null || weakReference.get() == null || bitmap.isRecycled()) {
                return;
            }
            this.f38790a.get().setImageBitmap(bitmap);
            this.f38790a.get().setVisibility(0);
        } catch (Throwable th) {
            if (com.smartdigimkt.b.b.f33800a) {
                th.printStackTrace();
            }
        }
    }

    public e(ImageView imageView, com.smartdigimkt.x.d dVar, String str) {
        this.f38790a = new WeakReference<>(imageView);
        this.f38791b = dVar;
        this.f38792c = str;
    }
}
