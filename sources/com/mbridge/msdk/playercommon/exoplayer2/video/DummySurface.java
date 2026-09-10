package com.mbridge.msdk.playercommon.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.EGLSurfaceTexture;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@TargetApi(17)
public final class DummySurface extends Surface {
    private static final String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final String TAG = "DummySurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final DummySurfaceThread thread;
    private boolean threadReleased;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class DummySurfaceThread extends HandlerThread implements Handler.Callback {
        private static final int MSG_INIT = 1;
        private static final int MSG_RELEASE = 2;

        @Nullable
        private EGLSurfaceTexture eglSurfaceTexture;

        @Nullable
        private Handler handler;

        @Nullable
        private Error initError;

        @Nullable
        private RuntimeException initException;

        @Nullable
        private DummySurface surface;

        public DummySurfaceThread() {
            super("dummySurface");
        }

        private void initInternal(int i10) {
            Assertions.checkNotNull(this.eglSurfaceTexture);
            this.eglSurfaceTexture.init(i10);
            this.surface = new DummySurface(this, this.eglSurfaceTexture.getSurfaceTexture(), i10 != 0);
        }

        private void releaseInternal() {
            Assertions.checkNotNull(this.eglSurfaceTexture);
            this.eglSurfaceTexture.release();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        releaseInternal();
                    } catch (Throwable th2) {
                        try {
                            Log.e(DummySurface.TAG, "Failed to release dummy surface", th2);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    initInternal(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    Log.e(DummySurface.TAG, "Failed to initialize dummy surface", e10);
                    this.initError = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    Log.e(DummySurface.TAG, "Failed to initialize dummy surface", e11);
                    this.initException = e11;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th3) {
                synchronized (this) {
                    notify();
                    throw th3;
                }
            }
        }

        public DummySurface init(int i10) {
            boolean z10;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.handler = handler;
            this.eglSurfaceTexture = new EGLSurfaceTexture(handler);
            synchronized (this) {
                z10 = false;
                this.handler.obtainMessage(1, i10, 0).sendToTarget();
                while (this.surface == null && this.initException == null && this.initError == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.initException;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.initError;
            if (error == null) {
                return (DummySurface) Assertions.checkNotNull(this.surface);
            }
            throw error;
        }

        public void release() {
            Assertions.checkNotNull(this.handler);
            this.handler.sendEmptyMessage(2);
        }
    }

    private static void assertApiLevel17OrHigher() {
        if (Util.SDK_INT < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    @TargetApi(24)
    private static int getSecureModeV24(Context context) {
        String strEglQueryString;
        int i10 = Util.SDK_INT;
        if (i10 < 26 && (Constants.REFERRER_API_SAMSUNG.equals(Util.MANUFACTURER) || "XT1650".equals(Util.MODEL))) {
            return 0;
        }
        if ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(EXTENSION_PROTECTED_CONTENT)) {
            return strEglQueryString.contains(EXTENSION_SURFACELESS_CONTEXT) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean isSecureSupported(Context context) {
        try {
            if (!secureModeInitialized) {
                secureMode = Util.SDK_INT < 24 ? 0 : getSecureModeV24(context);
                secureModeInitialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return secureMode != 0;
    }

    public static DummySurface newInstanceV17(Context context, boolean z10) {
        assertApiLevel17OrHigher();
        Assertions.checkState(!z10 || isSecureSupported(context));
        return new DummySurfaceThread().init(z10 ? secureMode : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.thread) {
            try {
                if (!this.threadReleased) {
                    this.thread.release();
                    this.threadReleased = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private DummySurface(DummySurfaceThread dummySurfaceThread, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.thread = dummySurfaceThread;
        this.secure = z10;
    }
}
