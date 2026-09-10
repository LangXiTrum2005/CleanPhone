package com.bumptech.glide.load.resource.transcode;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.load.resource.gif.GifDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class DrawableBytesTranscoder implements ResourceTranscoder<Drawable, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapPool f12738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BitmapBytesTranscoder f12739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GifDrawableBytesTranscoder f12740c;

    public DrawableBytesTranscoder(BitmapPool bitmapPool, BitmapBytesTranscoder bitmapBytesTranscoder, GifDrawableBytesTranscoder gifDrawableBytesTranscoder) {
        this.f12738a = bitmapPool;
        this.f12739b = bitmapBytesTranscoder;
        this.f12740c = gifDrawableBytesTranscoder;
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public final Resource a(Resource resource, Options options) {
        Drawable drawable = (Drawable) resource.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f12739b.a(BitmapResource.b(((BitmapDrawable) drawable).getBitmap(), this.f12738a), options);
        }
        if (drawable instanceof GifDrawable) {
            return this.f12740c.a(resource, options);
        }
        return null;
    }
}
