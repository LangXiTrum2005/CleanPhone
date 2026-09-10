package com.bykv.vk.openvk.qdl.qdl.qdl.mo;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class mo implements SurfaceHolder.Callback {
    private final WeakReference<SurfaceHolder.Callback> qdl;

    public mo(SurfaceHolder.Callback callback) {
        this.qdl = new WeakReference<>(callback);
    }

    public SurfaceHolder.Callback qdl() {
        return this.qdl.get();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        SurfaceHolder.Callback callback = this.qdl.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i2, i3, i4);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.qdl.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.qdl.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }
}
