package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.resource.drawable.DrawableResource;
import com.bumptech.glide.util.Util;

/* JADX INFO: loaded from: classes.dex */
public class BitmapDrawableResource extends DrawableResource<BitmapDrawable> implements Initializable {
    @Override // com.bumptech.glide.load.engine.Resource
    public final void a() {
        ((BitmapDrawable) this.X).getBitmap();
        throw null;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class c() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return Util.c(((BitmapDrawable) this.X).getBitmap());
    }

    @Override // com.bumptech.glide.load.resource.drawable.DrawableResource, com.bumptech.glide.load.engine.Initializable
    public final void initialize() {
        ((BitmapDrawable) this.X).getBitmap().prepareToDraw();
    }
}
