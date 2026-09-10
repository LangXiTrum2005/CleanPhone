package androidx.media3.common.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import decarock.grimness;

/* JADX INFO: compiled from: EGLSurfaceTexture.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final int[] f11313adultoid = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final int[] f11314arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public SurfaceTexture f11315graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Handler f11316kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public EGLSurface f11317molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public EGLDisplay f11318monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public EGLContext f11319polloi;

    /* JADX INFO: renamed from: androidx.media3.common.util.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EGLSurfaceTexture.java */
    public interface InterfaceC0078attabal {
    }

    public attabal(Handler handler) {
        this(handler, null);
    }

    public static EGLConfig attabal(EGLDisplay eGLDisplay) throws GlUtil.GlException {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f11313adultoid, 0, eGLConfigArr, 0, 1, iArr, 0);
        GlUtil.dern(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, grimness.sealless("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    public static EGLDisplay beachfront() throws GlUtil.GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        GlUtil.dern(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        GlUtil.dern(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    public static EGLSurface dern(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) throws GlUtil.GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            GlUtil.dern(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        GlUtil.dern(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static void marial(int[] iArr) throws GlUtil.GlException {
        GLES20.glGenTextures(1, iArr, 0);
        GlUtil.saneness();
    }

    public static EGLContext saneness(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) throws GlUtil.GlException {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        GlUtil.dern(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    public SurfaceTexture competently() {
        return (SurfaceTexture) decarock.attabal.marial(this.f11315graveside);
    }

    public void impromptu(int i) throws GlUtil.GlException {
        EGLDisplay eGLDisplayBeachfront = beachfront();
        this.f11318monoploid = eGLDisplayBeachfront;
        EGLConfig eGLConfigAttabal = attabal(eGLDisplayBeachfront);
        EGLContext eGLContextSaneness = saneness(this.f11318monoploid, eGLConfigAttabal, i);
        this.f11319polloi = eGLContextSaneness;
        this.f11317molybdenite = dern(this.f11318monoploid, eGLConfigAttabal, eGLContextSaneness, i);
        marial(this.f11314arytenoidectomy);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f11314arytenoidectomy[0]);
        this.f11315graveside = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f11316kowloon.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        wireman();
        SurfaceTexture surfaceTexture = this.f11315graveside;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public void taiyuan() {
        this.f11316kowloon.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f11315graveside;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f11314arytenoidectomy, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f11318monoploid;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f11318monoploid;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f11317molybdenite;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f11318monoploid, this.f11317molybdenite);
            }
            EGLContext eGLContext = this.f11319polloi;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f11318monoploid, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f11318monoploid;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f11318monoploid);
            }
            this.f11318monoploid = null;
            this.f11319polloi = null;
            this.f11317molybdenite = null;
            this.f11315graveside = null;
        }
    }

    public attabal(Handler handler, InterfaceC0078attabal interfaceC0078attabal) {
        this.f11316kowloon = handler;
        this.f11314arytenoidectomy = new int[1];
    }

    public final void wireman() {
    }
}
