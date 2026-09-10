package com.squareup.picasso;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes6.dex */
class FetchAction extends Action<Object> {
    private Callback callback;
    private final Object target;

    public FetchAction(Picasso picasso, Request request, int i2, int i3, Object obj, String str, Callback callback) {
        super(picasso, null, request, i2, i3, 0, null, str, obj, false);
        this.target = new Object();
        this.callback = callback;
    }

    @Override // com.squareup.picasso.Action
    public void cancel() {
        super.cancel();
        this.callback = null;
    }

    @Override // com.squareup.picasso.Action
    public void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        Callback callback = this.callback;
        if (callback != null) {
            callback.onSuccess();
        }
    }

    @Override // com.squareup.picasso.Action
    public void error(Exception exc) {
        Callback callback = this.callback;
        if (callback != null) {
            callback.onError(exc);
        }
    }

    @Override // com.squareup.picasso.Action
    public Object getTarget() {
        return this.target;
    }
}
