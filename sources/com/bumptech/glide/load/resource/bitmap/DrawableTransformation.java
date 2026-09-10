package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class DrawableTransformation implements Transformation<Drawable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Transformation f12662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12663c;

    public DrawableTransformation(Transformation transformation, boolean z2) {
        this.f12662b = transformation;
        this.f12663c = z2;
    }

    @Override // com.bumptech.glide.load.Transformation
    public final Resource a(Context context, Resource resource, int i2, int i3) {
        BitmapPool bitmapPool = Glide.a(context).X;
        Drawable drawable = (Drawable) resource.get();
        BitmapResource bitmapResourceA = DrawableToBitmapConverter.a(bitmapPool, drawable, i2, i3);
        if (bitmapResourceA != null) {
            Resource resourceA = this.f12662b.a(context, bitmapResourceA, i2, i3);
            if (!resourceA.equals(bitmapResourceA)) {
                return new LazyBitmapDrawableResource(context.getResources(), resourceA);
            }
            resourceA.a();
            return resource;
        }
        if (!this.f12663c) {
            return resource;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // com.bumptech.glide.load.Key
    public final void b(MessageDigest messageDigest) {
        this.f12662b.b(messageDigest);
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof DrawableTransformation) {
            return this.f12662b.equals(((DrawableTransformation) obj).f12662b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.f12662b.hashCode();
    }
}
