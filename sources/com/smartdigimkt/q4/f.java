package com.smartdigimkt.q4;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import com.p004ironsource.d9;
import com.smartdigimkt.p4.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class f {
    private static final long m = 500;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f37904n = 20000000;
    private static final long o = 80;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f37905p = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowManager f37906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f37907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f37908c;
    private long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f37909e;
    private long f;
    private long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f37910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37911i;
    private long j;
    private long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f37912l;

    public final class a implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayManager f37913a;

        public a(DisplayManager displayManager) {
            this.f37913a = displayManager;
        }

        public void a() {
            this.f37913a.registerDisplayListener(this, null);
        }

        public void b() {
            this.f37913a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
            if (i2 == 0) {
                f.this.c();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i2) {
        }
    }

    public static final class b implements Choreographer.FrameCallback, Handler.Callback {
        private static final int g0 = 0;
        private static final int h0 = 1;
        private static final int i0 = 2;
        private static final b j0 = new b();
        public volatile long X = -9223372036854775807L;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private final Handler f37915Y;
        private final HandlerThread Z;
        private Choreographer e0;
        private int f0;

        private b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.Z = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.f37915Y = handler;
            handler.sendEmptyMessage(0);
        }

        private void b() {
            Choreographer choreographer = this.e0;
            if (choreographer != null) {
                int i2 = this.f0 + 1;
                this.f0 = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            this.e0 = Choreographer.getInstance();
        }

        public static b d() {
            return j0;
        }

        private void f() {
            Choreographer choreographer = this.e0;
            if (choreographer != null) {
                int i2 = this.f0 - 1;
                this.f0 = i2;
                if (i2 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.X = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f37915Y.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            if (this.e0 != null) {
                this.X = j;
                this.e0.postFrameCallbackDelayed(this, 500L);
            }
        }

        public void e() {
            this.f37915Y.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                try {
                    c();
                } catch (Throwable unused) {
                }
                return true;
            }
            if (i2 == 1) {
                b();
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            f();
            return true;
        }
    }

    public f() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            Display defaultDisplay = this.f37906a.getDefaultDisplay();
            if (defaultDisplay != null) {
                long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
                this.d = refreshRate;
                this.f37909e = (refreshRate * o) / 100;
            }
        } catch (Throwable unused) {
        }
    }

    public void b() {
        this.f37911i = false;
        if (this.f37906a != null) {
            this.f37907b.a();
            a aVar = this.f37908c;
            if (aVar != null) {
                aVar.a();
            }
            c();
        }
    }

    public f(Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.f37906a = (WindowManager) context.getSystemService("window");
        } else {
            this.f37906a = null;
        }
        if (this.f37906a != null) {
            this.f37908c = f0.f37540a >= 17 ? a(context) : null;
            this.f37907b = b.d();
        } else {
            this.f37908c = null;
            this.f37907b = null;
        }
        this.d = -9223372036854775807L;
        this.f37909e = -9223372036854775807L;
    }

    public void a() {
        if (this.f37906a != null) {
            a aVar = this.f37908c;
            if (aVar != null) {
                aVar.b();
            }
            this.f37907b.e();
        }
    }

    public long a(long j, long j2) {
        long j3;
        long j4;
        long j5 = 1000 * j;
        if (this.f37911i) {
            if (j != this.f) {
                this.f37912l++;
                this.g = this.f37910h;
            }
            long j6 = this.f37912l;
            if (j6 >= 6) {
                j4 = this.g + ((j5 - this.k) / j6);
                if (b(j4, j2)) {
                    this.f37911i = false;
                } else {
                    j3 = (this.j + j4) - this.k;
                }
            } else if (b(j5, j2)) {
                this.f37911i = false;
            }
            j3 = j2;
            j4 = j5;
        } else {
            j3 = j2;
            j4 = j5;
        }
        if (!this.f37911i) {
            this.k = j5;
            this.j = j2;
            this.f37912l = 0L;
            this.f37911i = true;
        }
        this.f = j;
        this.f37910h = j4;
        b bVar = this.f37907b;
        if (bVar != null && this.d != -9223372036854775807L) {
            long j7 = bVar.X;
            if (j7 != -9223372036854775807L) {
                return a(j3, j7, this.d) - this.f37909e;
            }
        }
        return j3;
    }

    private boolean b(long j, long j2) {
        return Math.abs((j2 - this.j) - (j - this.k)) > f37904n;
    }

    private a a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(d9.h.d);
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
    }

    private static long a(long j, long j2, long j3) {
        long j4;
        long j5 = (((j - j2) / j3) * j3) + j2;
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j4 = j5;
            j5 = j3 + j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }
}
