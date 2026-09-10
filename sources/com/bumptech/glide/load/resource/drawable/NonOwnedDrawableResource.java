package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
final class NonOwnedDrawableResource extends DrawableResource<Drawable> {
    @Override // com.bumptech.glide.load.engine.Resource
    public final void a() {
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class c() {
        return this.X.getClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        Drawable drawable = this.X;
        return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
    }
}
