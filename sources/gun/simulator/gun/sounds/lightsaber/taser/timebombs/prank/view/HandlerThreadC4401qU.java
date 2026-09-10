package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import java.util.Locale;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerThreadC4401qU extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RunnableC2527Jq f4883a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public PlaceholderSurface e;

    public final void a(int i) throws C2819Ux {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f4883a.getClass();
        RunnableC2527Jq runnableC2527Jq = this.f4883a;
        runnableC2527Jq.getClass();
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC2845Vx.O("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr = new int[2];
        AbstractC2845Vx.O("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
        runnableC2527Jq.c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, RunnableC2527Jq.g, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i2 = Ug0.f3833a;
        AbstractC2845Vx.O(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(runnableC2527Jq.c, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC2845Vx.O("eglCreateContext failed", eGLContextEglCreateContext != null);
        runnableC2527Jq.d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = runnableC2527Jq.c;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC2845Vx.O("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        AbstractC2845Vx.O("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        runnableC2527Jq.e = eGLSurfaceEglCreatePbufferSurface;
        int[] iArr3 = runnableC2527Jq.b;
        GLES20.glGenTextures(1, iArr3, 0);
        AbstractC2845Vx.N();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        runnableC2527Jq.f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(runnableC2527Jq);
        SurfaceTexture surfaceTexture2 = this.f4883a.f;
        surfaceTexture2.getClass();
        this.e = new PlaceholderSurface(this, surfaceTexture2, i != 0);
    }

    public final void b() {
        this.f4883a.getClass();
        RunnableC2527Jq runnableC2527Jq = this.f4883a;
        runnableC2527Jq.f3285a.removeCallbacks(runnableC2527Jq);
        try {
            SurfaceTexture surfaceTexture = runnableC2527Jq.f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, runnableC2527Jq.b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = runnableC2527Jq.c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = runnableC2527Jq.c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = runnableC2527Jq.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(runnableC2527Jq.c, runnableC2527Jq.e);
            }
            EGLContext eGLContext = runnableC2527Jq.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(runnableC2527Jq.c, eGLContext);
            }
            if (Ug0.f3833a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = runnableC2527Jq.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(runnableC2527Jq.c);
            }
            runnableC2527Jq.c = null;
            runnableC2527Jq.d = null;
            runnableC2527Jq.e = null;
            runnableC2527Jq.f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    b();
                } catch (Throwable th) {
                    try {
                        AbstractC4038mJ.d("Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
                return true;
            }
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (C2819Ux e) {
                AbstractC4038mJ.d("Failed to initialize placeholder surface", e);
                this.d = new IllegalStateException(e);
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                AbstractC4038mJ.d("Failed to initialize placeholder surface", e2);
                this.c = e2;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e3) {
                AbstractC4038mJ.d("Failed to initialize placeholder surface", e3);
                this.d = e3;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
