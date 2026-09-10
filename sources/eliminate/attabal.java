package eliminate;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class attabal implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final WeakReference<SurfaceHolder.Callback> f25614kowloon;

    public attabal(SurfaceHolder.Callback callback) {
        this.f25614kowloon = new WeakReference<>(callback);
    }

    public SurfaceHolder.Callback attabal() {
        return this.f25614kowloon.get();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder.Callback callback = this.f25614kowloon.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.f25614kowloon.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.f25614kowloon.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }
}
