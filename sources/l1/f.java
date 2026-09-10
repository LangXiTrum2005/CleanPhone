package l1;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f44785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44786b;

    public f() {
        this(u.f44822a);
    }

    public final synchronized void a() {
        boolean z10 = false;
        while (!this.f44786b) {
            try {
                this.f44785a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean b(long j10) {
        try {
            if (j10 <= 0) {
                return this.f44786b;
            }
            this.f44785a.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = j10 + jElapsedRealtime;
            if (j11 < jElapsedRealtime) {
                a();
            } else {
                boolean z10 = false;
                while (!this.f44786b && jElapsedRealtime < j11) {
                    try {
                        this.f44785a.getClass();
                        wait(j11 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                    this.f44785a.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.f44786b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean c() {
        if (this.f44786b) {
            return false;
        }
        this.f44786b = true;
        notifyAll();
        return true;
    }

    public f(u uVar) {
        this.f44785a = uVar;
    }
}
