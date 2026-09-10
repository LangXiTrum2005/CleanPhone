package com.google.android.gms.internal.ads;

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
import android.view.Surface;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f20979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Error f20980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RuntimeException f20981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f20982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Surface f20983f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(String str, int i10) {
        super(str);
        this.f20978a = i10;
    }

    public void a(int i10) throws l1.i {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        ((l1.h) this.f20982e).getClass();
        l1.h hVar = (l1.h) this.f20982e;
        int[] iArr = hVar.f44789b;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        l1.a.c("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr2 = new int[2];
        l1.a.c("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
        hVar.f44790c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, l1.h.f44787g, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z10 = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = l1.y.f44830a;
        l1.a.c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z10);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(hVar.f44790c, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        l1.a.c("eglCreateContext failed", eGLContextEglCreateContext != null);
        hVar.f44791d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = hVar.f44790c;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            l1.a.c("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        l1.a.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        hVar.f44792e = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        l1.a.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        hVar.f44793f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(hVar);
        SurfaceTexture surfaceTexture2 = ((l1.h) this.f20982e).f44793f;
        surfaceTexture2.getClass();
        this.f20983f = new l2.i(this, surfaceTexture2, i10 != 0);
    }

    public void b() {
        ((l1.h) this.f20982e).getClass();
        l1.h hVar = (l1.h) this.f20982e;
        hVar.f44788a.removeCallbacks(hVar);
        try {
            SurfaceTexture surfaceTexture = hVar.f44793f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, hVar.f44789b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = hVar.f44790c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = hVar.f44790c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = hVar.f44792e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(hVar.f44790c, hVar.f44792e);
            }
            EGLContext eGLContext = hVar.f44791d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(hVar.f44790c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = hVar.f44790c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(hVar.f44790c);
            }
            hVar.f44790c = null;
            hVar.f44791d = null;
            hVar.f44792e = null;
            hVar.f44793f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f20978a) {
            case 0:
                int i10 = message.what;
                try {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            try {
                                yg0 yg0Var = (yg0) this.f20982e;
                                if (yg0Var == null) {
                                    throw null;
                                }
                                yg0Var.b();
                            } catch (Throwable th2) {
                                try {
                                    v71.J("PlaceholderSurface", "Failed to release placeholder surface", th2);
                                } finally {
                                    quit();
                                }
                            }
                        }
                        break;
                    } else {
                        try {
                            try {
                                int i11 = message.arg1;
                                yg0 yg0Var2 = (yg0) this.f20982e;
                                if (yg0Var2 == null) {
                                    throw null;
                                }
                                yg0Var2.a(i11);
                                SurfaceTexture surfaceTexture = ((yg0) this.f20982e).f22244f;
                                surfaceTexture.getClass();
                                this.f20983f = new w0(this, surfaceTexture, i11 != 0);
                                synchronized (this) {
                                    notify();
                                }
                            } catch (Error e10) {
                                v71.J("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                                this.f20980c = e10;
                                synchronized (this) {
                                    notify();
                                }
                            } catch (RuntimeException e11) {
                                v71.J("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                                this.f20981d = e11;
                                synchronized (this) {
                                    notify();
                                }
                            }
                        } catch (ih0 e12) {
                            v71.J("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                            this.f20981d = new IllegalStateException(e12);
                            synchronized (this) {
                                notify();
                            }
                        }
                        break;
                    }
                    return true;
                } catch (Throwable th3) {
                    synchronized (this) {
                        notify();
                        throw th3;
                    }
                }
            default:
                int i12 = message.what;
                try {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            try {
                                b();
                            } catch (Throwable th4) {
                                try {
                                    l1.a.f("PlaceholderSurface", "Failed to release placeholder surface", th4);
                                } finally {
                                    quit();
                                }
                            }
                        }
                        break;
                    } else {
                        try {
                            try {
                                a(message.arg1);
                                synchronized (this) {
                                    notify();
                                }
                            } catch (RuntimeException e13) {
                                l1.a.f("PlaceholderSurface", "Failed to initialize placeholder surface", e13);
                                this.f20981d = e13;
                                synchronized (this) {
                                    notify();
                                }
                            } catch (l1.i e14) {
                                l1.a.f("PlaceholderSurface", "Failed to initialize placeholder surface", e14);
                                this.f20981d = new IllegalStateException(e14);
                                synchronized (this) {
                                    notify();
                                }
                            }
                        } catch (Error e15) {
                            l1.a.f("PlaceholderSurface", "Failed to initialize placeholder surface", e15);
                            this.f20980c = e15;
                            synchronized (this) {
                                notify();
                            }
                        }
                        break;
                    }
                    return true;
                } catch (Throwable th5) {
                    synchronized (this) {
                        notify();
                        throw th5;
                    }
                }
        }
    }
}
