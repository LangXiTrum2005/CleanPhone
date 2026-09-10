package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Paint;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class RoundedCorners extends BitmapTransformation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f12688b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(Key.f12364a);

    @Override // com.bumptech.glide.load.Key
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f12688b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(0).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final Bitmap c(BitmapPool bitmapPool, Bitmap bitmap, int i2, int i3) {
        Paint paint = TransformationUtils.f12693a;
        Preconditions.a("roundingRadius must be greater than 0.", false);
        return TransformationUtils.e(bitmapPool, bitmap, new TransformationUtils.AnonymousClass1());
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (!(obj instanceof RoundedCorners)) {
            return false;
        }
        ((RoundedCorners) obj).getClass();
        return true;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return Util.h(-569625254, Util.h(0, 17));
    }
}
