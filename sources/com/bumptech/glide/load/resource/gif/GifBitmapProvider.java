package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;

/* JADX INFO: loaded from: classes.dex */
public final class GifBitmapProvider implements GifDecoder.BitmapProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapPool f12715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LruArrayPool f12716b;

    public GifBitmapProvider(BitmapPool bitmapPool, LruArrayPool lruArrayPool) {
        this.f12715a = bitmapPool;
        this.f12716b = lruArrayPool;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final void a(Bitmap bitmap) {
        this.f12715a.b(bitmap);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final byte[] b(int i2) {
        LruArrayPool lruArrayPool = this.f12716b;
        return lruArrayPool == null ? new byte[i2] : (byte[]) lruArrayPool.d(i2, byte[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final Bitmap c(int i2, int i3, Bitmap.Config config) {
        return this.f12715a.a(i2, i3, config);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final int[] d(int i2) {
        LruArrayPool lruArrayPool = this.f12716b;
        return lruArrayPool == null ? new int[i2] : (int[]) lruArrayPool.d(i2, int[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final void e(byte[] bArr) {
        LruArrayPool lruArrayPool = this.f12716b;
        if (lruArrayPool == null) {
            return;
        }
        lruArrayPool.i(bArr);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final void f(int[] iArr) {
        LruArrayPool lruArrayPool = this.f12716b;
        if (lruArrayPool == null) {
            return;
        }
        lruArrayPool.i(iArr);
    }
}
