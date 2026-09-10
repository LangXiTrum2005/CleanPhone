package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class GranularRoundedCorners extends BitmapTransformation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f12665b = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(Key.f12364a);

    @Override // com.bumptech.glide.load.Key
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f12665b);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(0.0f).putFloat(0.0f).putFloat(0.0f).putFloat(0.0f).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final Bitmap c(BitmapPool bitmapPool, Bitmap bitmap, int i2, int i3) {
        return TransformationUtils.e(bitmapPool, bitmap, new TransformationUtils.AnonymousClass2());
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (!(obj instanceof GranularRoundedCorners)) {
            return false;
        }
        ((GranularRoundedCorners) obj).getClass();
        return true;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return Util.g(0.0f, Util.g(0.0f, Util.g(0.0f, Util.h(-2013597734, Util.g(0.0f, 17)))));
    }
}
