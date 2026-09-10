package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class LazyBitmapDrawableResource implements Resource<BitmapDrawable>, Initializable {
    public final Resources X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Resource f12682Y;

    public LazyBitmapDrawableResource(Resources resources, Resource resource) {
        Preconditions.c(resources, "Argument must not be null");
        this.X = resources;
        Preconditions.c(resource, "Argument must not be null");
        this.f12682Y = resource;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void a() {
        this.f12682Y.a();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class c() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return new BitmapDrawable(this.X, (Bitmap) this.f12682Y.get());
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return this.f12682Y.getSize();
    }

    @Override // com.bumptech.glide.load.engine.Initializable
    public final void initialize() {
        Resource resource = this.f12682Y;
        if (resource instanceof Initializable) {
            ((Initializable) resource).initialize();
        }
    }
}
