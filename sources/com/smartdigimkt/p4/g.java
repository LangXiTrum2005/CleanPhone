package com.smartdigimkt.p4;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int h0 = 0;
    public static final int i0 = 1;
    public static final int j0 = 2;
    private static final int[] k0 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    private static final int l0 = 12992;
    private final Handler X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final int[] f37547Y = new int[1];
    private EGLDisplay Z;
    private EGLContext e0;
    private EGLSurface f0;
    private SurfaceTexture g0;

    public static final class b extends RuntimeException {
        private b(String str) {
            super(str);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public g(Handler handler) {
        this.X = handler;
    }

    private static EGLDisplay b() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new b("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw new b("eglInitialize failed");
    }

    public void a(int i2) {
        EGLDisplay eGLDisplayB = b();
        this.Z = eGLDisplayB;
        EGLConfig eGLConfigA = a(eGLDisplayB);
        EGLContext eGLContextA = a(this.Z, eGLConfigA, i2);
        this.e0 = eGLContextA;
        this.f0 = a(this.Z, eGLConfigA, eGLContextA, i2);
        a(this.f37547Y);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f37547Y[0]);
        this.g0 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public SurfaceTexture c() {
        return (SurfaceTexture) com.smartdigimkt.p4.a.a(this.g0);
    }

    public void d() {
        this.X.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.g0;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f37547Y, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.Z;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.Z;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f0;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.Z, this.f0);
            }
            EGLContext eGLContext = this.e0;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.Z, eGLContext);
            }
            if (f0.f37540a >= 19) {
                EGL14.eglReleaseThread();
            }
            this.Z = null;
            this.e0 = null;
            this.f0 = null;
            this.g0 = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.X.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        SurfaceTexture surfaceTexture = this.g0;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, k0, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!zEglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new b(f0.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfig;
    }

    private static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i2) {
        int[] iArr;
        if (i2 == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, l0, 1, 12344};
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eGLContextEglCreateContext != null) {
            return eGLContextEglCreateContext;
        }
        throw new b("eglCreateContext failed");
    }

    private static EGLSurface a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i2) {
        int[] iArr;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i2 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i2 == 2) {
                iArr = new int[]{12375, 1, 12374, 1, l0, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext)) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new b("eglMakeCurrent failed");
    }

    private static void a(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            throw new b(androidx.datastore.preferences.protobuf.a.h(iGlGetError, new StringBuilder("glGenTextures failed. Error: ")));
        }
    }
}
