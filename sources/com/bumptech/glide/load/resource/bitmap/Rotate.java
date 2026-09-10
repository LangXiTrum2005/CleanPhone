package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Paint;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class Rotate extends BitmapTransformation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f12687b = "com.bumptech.glide.load.resource.bitmap.Rotate".getBytes(Key.f12364a);

    @Override // com.bumptech.glide.load.Key
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f12687b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(0).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final Bitmap c(BitmapPool bitmapPool, Bitmap bitmap, int i2, int i3) {
        Paint paint = TransformationUtils.f12693a;
        return bitmap;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (!(obj instanceof Rotate)) {
            return false;
        }
        ((Rotate) obj).getClass();
        return true;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return Util.h(-950519196, Util.h(0, 17));
    }
}
