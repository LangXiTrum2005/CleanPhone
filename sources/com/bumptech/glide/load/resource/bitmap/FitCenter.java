package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class FitCenter extends BitmapTransformation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f12664b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(Key.f12364a);

    @Override // com.bumptech.glide.load.Key
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f12664b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final Bitmap c(BitmapPool bitmapPool, Bitmap bitmap, int i2, int i3) {
        return TransformationUtils.b(bitmapPool, bitmap, i2, i3);
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return obj instanceof FitCenter;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return 1572326941;
    }
}
