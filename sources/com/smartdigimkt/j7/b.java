package com.smartdigimkt.j7;

import android.os.CountDownTimer;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    private static final String f = "CountDownTimerExt";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CountDownTimer f36105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f36106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36107c = true;
    private long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f36108e;

    public class a extends CountDownTimer {
        public a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            b.this.e();
            b.this.i();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            b.this.c(j);
            b.this.a(j);
        }
    }

    public b(long j, long j2) {
        this.f36106b = j2;
        this.d = j;
        this.f36108e = j;
    }

    public abstract void a(long j);

    public final void a(boolean z2) {
        this.f36107c = z2;
    }

    public final void b(long j) {
        this.d = j;
    }

    public final void c(long j) {
        this.f36108e = j;
    }

    public final boolean d() {
        return this.f36107c;
    }

    public abstract void e();

    public final void f() {
        if (this.f36107c) {
            return;
        }
        try {
            this.f36105a.cancel();
        } catch (Throwable unused) {
        }
        this.f36107c = true;
    }

    public final void g() throws Throwable {
        if (c()) {
            return;
        }
        a(this.f36108e, this.f36106b);
    }

    public final void h() throws Throwable {
        a(this.f36108e, this.f36106b);
    }

    public final void i() {
        try {
            this.f36105a.cancel();
        } catch (Throwable unused) {
        }
        this.f36107c = true;
        this.f36108e = this.d;
    }

    public final long a() {
        return this.d;
    }

    public final long b() {
        return this.f36108e;
    }

    public final boolean c() {
        return !this.f36107c;
    }

    public final void a(long j, long j2, long j3) throws Throwable {
        this.d = j;
        this.f36108e = j2;
        this.f36106b = j3;
        h();
    }

    public final synchronized void a(long j, long j2) throws Throwable {
        Throwable th;
        try {
            try {
                this.f36108e = j;
                this.f36106b = j2;
                if (this.d > 0 && j2 > 0) {
                    if (!this.f36107c) {
                        try {
                            i();
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    if (this.f36107c) {
                        a aVar = new a(b(), this.f36106b);
                        this.f36105a = aVar;
                        try {
                            aVar.start();
                        } catch (Throwable unused) {
                        }
                        this.f36107c = false;
                    } else {
                        Log.d(f, "ignore start");
                    }
                } else {
                    Log.d(f, "invalid parameter");
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }
}
