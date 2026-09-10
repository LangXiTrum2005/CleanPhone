package com.smartdigimkt.n4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.smartdigimkt.p4.d0;
import com.smartdigimkt.p4.f0;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements u {
    public static final int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f37062e = 1;
    public static final int f = 2;
    public static final int g = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f37063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b<? extends c> f37064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOException f37065c;

    public interface a<T extends c> {
        int a(T t, long j, long j2, IOException iOException);

        void a(T t, long j, long j2);

        void a(T t, long j, long j2, boolean z2);
    }

    public interface c {
        void a() throws InterruptedException, IOException;

        void b();
    }

    public interface d {
        void d();
    }

    public static final class e implements Runnable {
        private final d X;

        public e(d dVar) {
            this.X = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.d();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    public static final class g extends IOException {
        public g(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public t(String str) {
        this.f37063a = f0.g(str);
    }

    public boolean c() {
        return this.f37064b != null;
    }

    public void d() {
        a((d) null);
    }

    public final class b<T extends c> extends Handler implements Runnable {
        private static final String l0 = "LoadTask";
        private static final int m0 = 0;
        private static final int n0 = 1;
        private static final int o0 = 2;
        private static final int p0 = 3;
        private static final int q0 = 4;
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private final T f37066Y;
        private final long Z;
        private a<T> e0;
        private IOException f0;
        private int g0;
        private volatile Thread h0;
        private volatile boolean i0;
        private volatile boolean j0;

        public b(Looper looper, T t, a<T> aVar, int i2, long j) {
            super(looper);
            this.f37066Y = t;
            this.e0 = aVar;
            this.X = i2;
            this.Z = j;
        }

        private void b() {
            this.f0 = null;
            t.this.f37063a.execute(t.this.f37064b);
        }

        private void c() {
            t.this.f37064b = null;
        }

        private long d() {
            return Math.min((this.g0 - 1) * 1000, 5000);
        }

        public void a(int i2) throws IOException {
            IOException iOException = this.f0;
            if (iOException != null && this.g0 > i2) {
                throw iOException;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.j0) {
                return;
            }
            int i2 = message.what;
            if (i2 == 0) {
                b();
                return;
            }
            if (i2 == 4) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.Z;
            if (this.i0) {
                this.e0.a((c) this.f37066Y, jElapsedRealtime, j, false);
                return;
            }
            int i3 = message.what;
            if (i3 == 1) {
                this.e0.a((c) this.f37066Y, jElapsedRealtime, j, false);
                return;
            }
            if (i3 == 2) {
                try {
                    this.e0.a(this.f37066Y, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e2) {
                    Log.e(l0, "Unexpected exception handling load completed", e2);
                    t.this.f37065c = new g(e2);
                    return;
                }
            }
            if (i3 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f0 = iOException;
            int iA = this.e0.a(this.f37066Y, jElapsedRealtime, j, iOException);
            if (iA == 3) {
                t.this.f37065c = this.f0;
            } else if (iA != 2) {
                this.g0 = iA != 1 ? 1 + this.g0 : 1;
                a(d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.h0 = Thread.currentThread();
                if (!this.i0) {
                    d0.a("load:".concat(this.f37066Y.getClass().getSimpleName()));
                    try {
                        this.f37066Y.a();
                        d0.a();
                    } catch (Throwable th) {
                        d0.a();
                        throw th;
                    }
                }
                if (this.j0) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e2) {
                if (this.j0) {
                    return;
                }
                obtainMessage(3, e2).sendToTarget();
            } catch (InterruptedException unused) {
                com.smartdigimkt.p4.a.b(this.i0);
                if (this.j0) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (Exception e3) {
                Log.e(l0, "Unexpected exception loading stream", e3);
                if (this.j0) {
                    return;
                }
                obtainMessage(3, new g(e3)).sendToTarget();
            } catch (OutOfMemoryError e4) {
                Log.e(l0, "OutOfMemory error loading stream", e4);
                if (this.j0) {
                    return;
                }
                obtainMessage(3, new g(e4)).sendToTarget();
            } catch (Error e5) {
                Log.e(l0, "Unexpected error loading stream", e5);
                if (!this.j0) {
                    obtainMessage(4, e5).sendToTarget();
                }
                throw e5;
            }
        }

        public void a(long j) {
            com.smartdigimkt.p4.a.b(t.this.f37064b == null);
            t.this.f37064b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                b();
            }
        }

        public void a(boolean z2) {
            this.j0 = z2;
            this.f0 = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z2) {
                    sendEmptyMessage(1);
                }
            } else {
                this.i0 = true;
                this.f37066Y.b();
                if (this.h0 != null) {
                    this.h0.interrupt();
                }
            }
            if (z2) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.e0.a((c) this.f37066Y, jElapsedRealtime, jElapsedRealtime - this.Z, true);
                this.e0 = null;
            }
        }
    }

    public void b() {
        this.f37064b.a(false);
    }

    public <T extends c> long a(T t, a<T> aVar, int i2) {
        Looper looperMyLooper = Looper.myLooper();
        com.smartdigimkt.p4.a.b(looperMyLooper != null);
        this.f37065c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new b(looperMyLooper, t, aVar, i2, jElapsedRealtime).a(0L);
        return jElapsedRealtime;
    }

    public void a(d dVar) {
        b<? extends c> bVar = this.f37064b;
        if (bVar != null) {
            bVar.a(true);
        }
        if (dVar != null) {
            this.f37063a.execute(new e(dVar));
        }
        this.f37063a.shutdown();
    }

    @Override // com.smartdigimkt.n4.u
    public void a() throws IOException {
        a(Integer.MIN_VALUE);
    }

    @Override // com.smartdigimkt.n4.u
    public void a(int i2) throws IOException {
        IOException iOException = this.f37065c;
        if (iOException == null) {
            b<? extends c> bVar = this.f37064b;
            if (bVar != null) {
                if (i2 == Integer.MIN_VALUE) {
                    i2 = bVar.X;
                }
                bVar.a(i2);
                return;
            }
            return;
        }
        throw iOException;
    }
}
