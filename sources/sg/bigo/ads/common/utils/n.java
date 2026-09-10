package sg.bigo.ads.common.utils;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes7.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f47521a;
    final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f47523e;
    long f;
    long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f47524h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f47525i = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f47522b = new Handler() { // from class: sg.bigo.ads.common.utils.n.1
        /* JADX WARN: Code duplicated, block: B:19:0x003b A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x000e, B:11:0x001c, B:14:0x0026, B:16:0x002e, B:18:0x0034, B:22:0x0041, B:23:0x0047, B:19:0x003b, B:24:0x005b), top: B:28:0x0003 }] */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            long j;
            synchronized (n.this) {
                try {
                    n nVar = n.this;
                    if (!nVar.f47524h && !nVar.f47525i) {
                        long jElapsedRealtime = nVar.f47523e - SystemClock.elapsedRealtime();
                        if (jElapsedRealtime <= 0) {
                            n nVar2 = n.this;
                            nVar2.f47525i = true;
                            nVar2.a();
                        } else {
                            n nVar3 = n.this;
                            long j2 = nVar3.f;
                            if (j2 > 0) {
                                long j3 = nVar3.g;
                                if (j3 > 0) {
                                    j = nVar3.d - (j3 - j2);
                                    nVar3.g = 0L;
                                } else {
                                    j = nVar3.d;
                                }
                            } else {
                                j = nVar3.d;
                            }
                            while (j < 0) {
                                j += n.this.d;
                            }
                            n.this.a(jElapsedRealtime);
                            n.this.f = SystemClock.elapsedRealtime();
                            sendMessageDelayed(obtainMessage(1), j);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public n(long j, long j2) {
        this.d = j2;
        this.f47521a = j;
    }

    public abstract void a();

    public abstract void a(long j);

    public final synchronized void b() {
        this.f47524h = true;
        this.f47522b.removeMessages(1);
    }

    public final synchronized n c() {
        this.f47524h = false;
        if (this.f47521a <= 0) {
            if (!this.f47525i) {
                this.f47525i = true;
                a();
            }
            return this;
        }
        this.f47523e = SystemClock.elapsedRealtime() + this.f47521a;
        Handler handler = this.f47522b;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }

    public final void d() {
        if (this.f47525i || this.f47524h) {
            return;
        }
        b();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.g = jElapsedRealtime;
        this.f47521a = this.f47523e - jElapsedRealtime;
    }

    public final boolean e() {
        return !this.f47525i && this.f47524h;
    }
}
