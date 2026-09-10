package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;

/* JADX INFO: loaded from: classes.dex */
public class BitmapResource implements Resource<Bitmap>, Initializable {
    public final Bitmap X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final BitmapPool f12639Y;

    public BitmapResource(Bitmap bitmap, BitmapPool bitmapPool) {
        Preconditions.c(bitmap, "Bitmap must not be null");
        this.X = bitmap;
        Preconditions.c(bitmapPool, "BitmapPool must not be null");
        this.f12639Y = bitmapPool;
    }

    public static BitmapResource b(Bitmap bitmap, BitmapPool bitmapPool) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapResource(bitmap, bitmapPool);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void a() {
        this.f12639Y.b(this.X);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class c() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return this.X;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return Util.c(this.X);
    }

    @Override // com.bumptech.glide.load.engine.Initializable
    public final void initialize() {
        this.X.prepareToDraw();
    }
}
