package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class GifDrawableTransformation implements Transformation<GifDrawable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Transformation f12719b;

    public GifDrawableTransformation(Transformation transformation) {
        Preconditions.c(transformation, "Argument must not be null");
        this.f12719b = transformation;
    }

    @Override // com.bumptech.glide.load.Transformation
    public final Resource a(Context context, Resource resource, int i2, int i3) {
        GifDrawable gifDrawable = (GifDrawable) resource.get();
        Resource bitmapResource = new BitmapResource(gifDrawable.c(), Glide.a(context).X);
        Transformation transformation = this.f12719b;
        Resource resourceA = transformation.a(context, bitmapResource, i2, i3);
        if (!bitmapResource.equals(resourceA)) {
            bitmapResource.a();
        }
        gifDrawable.X.f12718a.c(transformation, (Bitmap) resourceA.get());
        return resource;
    }

    @Override // com.bumptech.glide.load.Key
    public final void b(MessageDigest messageDigest) {
        this.f12719b.b(messageDigest);
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof GifDrawableTransformation) {
            return this.f12719b.equals(((GifDrawableTransformation) obj).f12719b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.f12719b.hashCode();
    }
}
