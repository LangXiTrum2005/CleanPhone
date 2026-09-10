package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yg0 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f22238g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f22239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f22240b = new int[1];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EGLDisplay f22241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLContext f22242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLSurface f22243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SurfaceTexture f22244f;

    public yg0(Handler handler) {
        this.f22239a = handler;
    }

    public final void a(int i10) throws ih0 {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        x10.x("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr = new int[2];
        x10.x("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
        this.f22241c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f22238g, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z10 = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        String str = uu0.f20901a;
        x10.x(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z10);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f22241c, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        x10.x("eglCreateContext failed", eGLContextEglCreateContext != null);
        this.f22242d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = this.f22241c;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            x10.x("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        x10.x("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        this.f22243e = eGLSurfaceEglCreatePbufferSurface;
        int[] iArr3 = this.f22240b;
        GLES20.glGenTextures(1, iArr3, 0);
        StringBuilder sb2 = new StringBuilder();
        rb0.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z11) {
                sb2.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb2.append("glError: ");
            sb2.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int length = objArrCopyOf.length;
            int i12 = i11 + 1;
            int iD = x91.d(length, i12);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i11] = numValueOf;
            i11 = i12;
            z11 = true;
        }
        if (z11) {
            throw new ih0(sb2.toString(), ca1.A(i11, objArrCopyOf));
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        this.f22244f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public final void b() {
        this.f22239a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f22244f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f22240b, 0);
            }
            EGLDisplay eGLDisplay = this.f22241c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f22241c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f22243e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f22241c, this.f22243e);
            }
            EGLContext eGLContext = this.f22242d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f22241c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f22241c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
            }
        } finally {
            EGLDisplay eGLDisplay4 = this.f22241c;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f22241c;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f22243e;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f22241c, this.f22243e);
            }
            EGLContext eGLContext2 = this.f22242d;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f22241c, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.f22241c;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f22241c);
            }
            this.f22241c = null;
            this.f22242d = null;
            this.f22243e = null;
            this.f22244f = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f22239a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f22244f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
