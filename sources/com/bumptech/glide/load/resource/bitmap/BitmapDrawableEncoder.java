package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class BitmapDrawableEncoder implements ResourceEncoder<BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapPool f12633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BitmapEncoder f12634b;

    public BitmapDrawableEncoder(BitmapPool bitmapPool, BitmapEncoder bitmapEncoder) {
        this.f12633a = bitmapPool;
        this.f12634b = bitmapEncoder;
    }

    @Override // com.bumptech.glide.load.Encoder
    public final boolean a(Object obj, File file, Options options) {
        return this.f12634b.a(new BitmapResource(((BitmapDrawable) ((Resource) obj).get()).getBitmap(), this.f12633a), file, options);
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    public final EncodeStrategy b(Options options) {
        return EncodeStrategy.f12352Y;
    }
}
