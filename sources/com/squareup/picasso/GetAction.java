package com.squareup.picasso;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes6.dex */
class GetAction extends Action<Void> {
    public GetAction(Picasso picasso, Request request, int i2, int i3, Object obj, String str) {
        super(picasso, null, request, i2, i3, 0, null, str, obj, false);
    }

    @Override // com.squareup.picasso.Action
    public void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
    }

    @Override // com.squareup.picasso.Action
    public void error(Exception exc) {
    }
}
