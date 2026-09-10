package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class BitmapThumbnailImageViewTarget extends ThumbnailImageViewTarget<Bitmap> {
    @Override // com.bumptech.glide.request.target.ThumbnailImageViewTarget
    public final Drawable k(Object obj) {
        return new BitmapDrawable(this.f12821Y.getResources(), (Bitmap) obj);
    }
}
