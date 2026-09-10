package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes6.dex */
final class TargetAction extends Action<Target> {
    public TargetAction(Picasso picasso, Target target, Request request, int i2, int i3, Drawable drawable, String str, Object obj, int i4) {
        super(picasso, target, request, i2, i3, i4, drawable, str, obj, false);
    }

    @Override // com.squareup.picasso.Action
    public void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError("Attempted to complete action with no result!\n" + this);
        }
        Target target = getTarget();
        if (target != null) {
            target.onBitmapLoaded(bitmap, loadedFrom);
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    @Override // com.squareup.picasso.Action
    public void error(Exception exc) {
        Target target = getTarget();
        if (target != null) {
            if (this.errorResId != 0) {
                target.onBitmapFailed(exc, this.picasso.context.getResources().getDrawable(this.errorResId));
            } else {
                target.onBitmapFailed(exc, this.errorDrawable);
            }
        }
    }
}
