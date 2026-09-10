package androidx.media3.exoplayer.video;

import android.content.Context;
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
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.EGLSurfaceTexture;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class PlaceholderSurface extends Surface {
    public static int e0;
    public static boolean f0;
    public final boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final PlaceholderSurfaceThread f6638Y;
    public boolean Z;

    public static class PlaceholderSurfaceThread extends HandlerThread implements Handler.Callback {
        public EGLSurfaceTexture X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Handler f6639Y;
        public Error Z;
        public RuntimeException e0;
        public PlaceholderSurface f0;

        public final void a(int i2) throws GlUtil.GlException {
            EGLSurface eGLSurfaceEglCreatePbufferSurface;
            this.X.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.X;
            eGLSurfaceTexture.getClass();
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.c("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
            int[] iArr = new int[2];
            GlUtil.c("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
            eGLSurfaceTexture.Z = eGLDisplayEglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, EGLSurfaceTexture.h0, 0, eGLConfigArr, 0, 1, iArr2, 0);
            boolean z2 = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
            Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
            int i3 = Util.f5683a;
            GlUtil.c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z2);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLSurfaceTexture.Z, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            GlUtil.c("eglCreateContext failed", eGLContextEglCreateContext != null);
            eGLSurfaceTexture.e0 = eGLContextEglCreateContext;
            EGLDisplay eGLDisplay = eGLSurfaceTexture.Z;
            if (i2 == 1) {
                eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                GlUtil.c("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
            }
            GlUtil.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
            eGLSurfaceTexture.f0 = eGLSurfaceEglCreatePbufferSurface;
            int[] iArr3 = eGLSurfaceTexture.f5635Y;
            GLES20.glGenTextures(1, iArr3, 0);
            GlUtil.b();
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
            eGLSurfaceTexture.g0 = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(eGLSurfaceTexture);
            SurfaceTexture surfaceTexture2 = this.X.g0;
            surfaceTexture2.getClass();
            this.f0 = new PlaceholderSurface(this, surfaceTexture2, i2 != 0);
        }

        public final void b() {
            this.X.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.X;
            eGLSurfaceTexture.X.removeCallbacks(eGLSurfaceTexture);
            try {
                SurfaceTexture surfaceTexture = eGLSurfaceTexture.g0;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, eGLSurfaceTexture.f5635Y, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = eGLSurfaceTexture.Z;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = eGLSurfaceTexture.Z;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = eGLSurfaceTexture.f0;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(eGLSurfaceTexture.Z, eGLSurfaceTexture.f0);
                }
                EGLContext eGLContext = eGLSurfaceTexture.e0;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLSurfaceTexture.Z, eGLContext);
                }
                EGL14.eglReleaseThread();
                EGLDisplay eGLDisplay3 = eGLSurfaceTexture.Z;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(eGLSurfaceTexture.Z);
                }
                eGLSurfaceTexture.Z = null;
                eGLSurfaceTexture.e0 = null;
                eGLSurfaceTexture.f0 = null;
                eGLSurfaceTexture.g0 = null;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i2 = message.what;
            try {
                if (i2 == 1) {
                    try {
                        a(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                        return true;
                    } catch (GlUtil.GlException e2) {
                        Log.d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                        this.e0 = new IllegalStateException(e2);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e3) {
                        Log.d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                        this.Z = e3;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e4) {
                        Log.d("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                        this.e0 = e4;
                        synchronized (this) {
                            notify();
                        }
                    }
                } else if (i2 == 2) {
                    try {
                        b();
                        quit();
                        return true;
                    } catch (Throwable th) {
                        try {
                            Log.d("PlaceholderSurface", "Failed to release placeholder surface", th);
                        } finally {
                            quit();
                        }
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

    public PlaceholderSurface(PlaceholderSurfaceThread placeholderSurfaceThread, SurfaceTexture surfaceTexture, boolean z2) {
        super(surfaceTexture);
        this.f6638Y = placeholderSurfaceThread;
        this.X = z2;
    }

    public static synchronized boolean a(Context context) {
        String strEglQueryString;
        int i2;
        try {
            if (!f0) {
                int i3 = Util.f5683a;
                if (i3 >= 24 && ((i3 >= 26 || !("samsung".equals(Util.f5685c) || "XT1650".equals(Util.d))) && ((i3 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i2 = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i2 = 0;
                }
                e0 = i2;
                f0 = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return e0 != 0;
    }

    public static PlaceholderSurface b(Context context, boolean z2) {
        boolean z3 = false;
        Assertions.e(!z2 || a(context));
        PlaceholderSurfaceThread placeholderSurfaceThread = new PlaceholderSurfaceThread("ExoPlayer:PlaceholderSurface");
        int i2 = z2 ? e0 : 0;
        placeholderSurfaceThread.start();
        Handler handler = new Handler(placeholderSurfaceThread.getLooper(), placeholderSurfaceThread);
        placeholderSurfaceThread.f6639Y = handler;
        placeholderSurfaceThread.X = new EGLSurfaceTexture(handler);
        synchronized (placeholderSurfaceThread) {
            placeholderSurfaceThread.f6639Y.obtainMessage(1, i2, 0).sendToTarget();
            while (placeholderSurfaceThread.f0 == null && placeholderSurfaceThread.e0 == null && placeholderSurfaceThread.Z == null) {
                try {
                    placeholderSurfaceThread.wait();
                } catch (InterruptedException unused) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = placeholderSurfaceThread.e0;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = placeholderSurfaceThread.Z;
        if (error != null) {
            throw error;
        }
        PlaceholderSurface placeholderSurface = placeholderSurfaceThread.f0;
        placeholderSurface.getClass();
        return placeholderSurface;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f6638Y) {
            try {
                if (!this.Z) {
                    PlaceholderSurfaceThread placeholderSurfaceThread = this.f6638Y;
                    placeholderSurfaceThread.f6639Y.getClass();
                    placeholderSurfaceThread.f6639Y.sendEmptyMessage(2);
                    this.Z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
