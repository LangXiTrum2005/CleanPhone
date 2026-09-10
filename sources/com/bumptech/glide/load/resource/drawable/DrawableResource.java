package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public abstract class DrawableResource<T extends Drawable> implements Resource<T>, Initializable {
    public final Drawable X;

    public DrawableResource(Drawable drawable) {
        Preconditions.c(drawable, "Argument must not be null");
        this.X = drawable;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        Drawable drawable = this.X;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    public void initialize() {
        Drawable drawable = this.X;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof GifDrawable) {
            ((GifDrawable) drawable).c().prepareToDraw();
        }
    }
}
