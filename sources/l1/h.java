package l1;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f44787g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f44788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f44789b = new int[1];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EGLDisplay f44790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLContext f44791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLSurface f44792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SurfaceTexture f44793f;

    public h(Handler handler) {
        this.f44788a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f44788a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f44793f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
