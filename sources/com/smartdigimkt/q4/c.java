package com.smartdigimkt.q4;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import com.smartdigimkt.p4.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends Surface {
    private static final String d = "DummySurface";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f37892e = "EGL_EXT_protected_content";
    private static final String f = "EGL_KHR_surfaceless_context";
    private static int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f37893h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f37895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37896c;

    public static c a(Context context, boolean z2) {
        a();
        com.smartdigimkt.p4.a.b(!z2 || b(context));
        return new b().a(z2 ? g : 0);
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f37893h) {
                g = f0.f37540a < 24 ? 0 : a(context);
                f37893h = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return g != 0;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f37895b) {
            try {
                if (!this.f37896c) {
                    this.f37895b.b();
                    this.f37896c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static class b extends HandlerThread implements Handler.Callback {
        private static final int g0 = 1;
        private static final int h0 = 2;
        private com.smartdigimkt.p4.g X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private Handler f37897Y;
        private Error Z;
        private RuntimeException e0;
        private c f0;

        public b() {
            super("dummySurface");
        }

        private void c() {
            com.smartdigimkt.p4.a.a(this.X);
            this.X.d();
        }

        public c a(int i2) {
            boolean z2;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f37897Y = handler;
            this.X = new com.smartdigimkt.p4.g(handler);
            synchronized (this) {
                z2 = false;
                this.f37897Y.obtainMessage(1, i2, 0).sendToTarget();
                while (this.f0 == null && this.e0 == null && this.Z == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.e0;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.Z;
            if (error == null) {
                return (c) com.smartdigimkt.p4.a.a(this.f0);
            }
            throw error;
        }

        public void b() {
            com.smartdigimkt.p4.a.a(this.f37897Y);
            this.f37897Y.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            try {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return true;
                    }
                    try {
                        c();
                    } catch (Throwable th) {
                        try {
                            Log.e(c.d, "Failed to release dummy surface", th);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    Log.e(c.d, "Failed to initialize dummy surface", e2);
                    this.Z = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    Log.e(c.d, "Failed to initialize dummy surface", e3);
                    this.e0 = e3;
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

        private void b(int i2) {
            com.smartdigimkt.p4.a.a(this.X);
            this.X.a(i2);
            this.f0 = new c(this, this.X.c(), i2 != 0);
        }
    }

    private c(b bVar, SurfaceTexture surfaceTexture, boolean z2) {
        super(surfaceTexture);
        this.f37895b = bVar;
        this.f37894a = z2;
    }

    private static void a() {
        if (f0.f37540a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    private static int a(Context context) {
        String strEglQueryString;
        int i2 = f0.f37540a;
        if (i2 < 26 && ("samsung".equals(f0.f37542c) || "XT1650".equals(f0.d))) {
            return 0;
        }
        if ((i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(f37892e)) {
            return strEglQueryString.contains(f) ? 1 : 2;
        }
        return 0;
    }
}
