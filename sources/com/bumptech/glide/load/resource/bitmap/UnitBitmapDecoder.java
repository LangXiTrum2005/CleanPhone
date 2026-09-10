package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Util;

/* JADX INFO: loaded from: classes.dex */
public final class UnitBitmapDecoder implements ResourceDecoder<Bitmap, Bitmap> {

    public static final class NonOwnedBitmapResource implements Resource<Bitmap> {
        public final Bitmap X;

        public NonOwnedBitmapResource(Bitmap bitmap) {
            this.X = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final void a() {
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
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final /* bridge */ /* synthetic */ boolean a(Object obj, Options options) {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource b(Object obj, int i2, int i3, Options options) {
        return new NonOwnedBitmapResource((Bitmap) obj);
    }
}
