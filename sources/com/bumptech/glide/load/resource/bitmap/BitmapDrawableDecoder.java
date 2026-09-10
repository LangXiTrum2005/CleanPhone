package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes.dex */
public class BitmapDrawableDecoder<DataType> implements ResourceDecoder<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceDecoder f12631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f12632b;

    public BitmapDrawableDecoder(Resources resources, ResourceDecoder resourceDecoder) {
        this.f12632b = resources;
        this.f12631a = resourceDecoder;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean a(Object obj, Options options) {
        return this.f12631a.a(obj, options);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource b(Object obj, int i2, int i3, Options options) {
        Resource resourceB = this.f12631a.b(obj, i2, i3, options);
        if (resourceB == null) {
            return null;
        }
        return new LazyBitmapDrawableResource(this.f12632b, resourceB);
    }
}
