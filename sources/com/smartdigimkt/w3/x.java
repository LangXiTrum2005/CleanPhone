package com.smartdigimkt.w3;

import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f39383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f39384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f39385c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f39386e;
    private Handler f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f39387h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f39388i = true;
    private boolean j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f39389l;
    private boolean m;

    public interface a {
        void a(x xVar);
    }

    public interface b {
        void a(int i2, Object obj) throws g;
    }

    public x(a aVar, b bVar, e0 e0Var, int i2, Handler handler) {
        this.f39384b = aVar;
        this.f39383a = bVar;
        this.f39385c = e0Var;
        this.f = handler;
        this.g = i2;
    }

    public x a(int i2) {
        com.smartdigimkt.p4.a.b(!this.j);
        this.d = i2;
        return this;
    }

    public x b(boolean z2) {
        com.smartdigimkt.p4.a.b(!this.j);
        this.f39388i = z2;
        return this;
    }

    public boolean c() {
        return this.f39388i;
    }

    public Handler d() {
        return this.f;
    }

    public Object e() {
        return this.f39386e;
    }

    public long f() {
        return this.f39387h;
    }

    public b g() {
        return this.f39383a;
    }

    public e0 h() {
        return this.f39385c;
    }

    public int i() {
        return this.d;
    }

    public int j() {
        return this.g;
    }

    public synchronized boolean k() {
        return this.m;
    }

    public x l() {
        com.smartdigimkt.p4.a.b(!this.j);
        if (this.f39387h == -9223372036854775807L) {
            com.smartdigimkt.p4.a.a(this.f39388i);
        }
        this.j = true;
        this.f39384b.a(this);
        return this;
    }

    public x a(Object obj) {
        com.smartdigimkt.p4.a.b(!this.j);
        this.f39386e = obj;
        return this;
    }

    public synchronized x b() {
        com.smartdigimkt.p4.a.b(this.j);
        this.m = true;
        a(false);
        return this;
    }

    public x a(Handler handler) {
        com.smartdigimkt.p4.a.b(!this.j);
        this.f = handler;
        return this;
    }

    public x a(long j) {
        com.smartdigimkt.p4.a.b(!this.j);
        this.f39387h = j;
        return this;
    }

    public x a(int i2, long j) {
        com.smartdigimkt.p4.a.b(!this.j);
        com.smartdigimkt.p4.a.a(j != -9223372036854775807L);
        if (i2 >= 0 && (this.f39385c.c() || i2 < this.f39385c.b())) {
            this.g = i2;
            this.f39387h = j;
            return this;
        }
        throw new o(this.f39385c, i2, j);
    }

    public synchronized boolean a() throws InterruptedException, TimeoutException {
        boolean z2;
        try {
            com.smartdigimkt.p4.a.b(this.j);
            com.smartdigimkt.p4.a.b(this.f.getLooper().getThread() != Thread.currentThread());
            long jElapsedRealtime = 500;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() + 500;
            while (true) {
                z2 = this.f39389l;
                if (z2 || jElapsedRealtime <= 0) {
                    break;
                }
                wait(jElapsedRealtime);
                jElapsedRealtime = jElapsedRealtime2 - SystemClock.elapsedRealtime();
            }
            if (!z2) {
                throw new TimeoutException("Message delivery time out");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.k;
    }

    public synchronized void a(boolean z2) {
        this.k = z2 | this.k;
        this.f39389l = true;
        notifyAll();
    }
}
