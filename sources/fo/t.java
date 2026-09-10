package fo;

import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t implements lo.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lo.e f41302c = new lo.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lo.e f41303d = new lo.e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f41305f;

    public t(v vVar, long j10, boolean z10) {
        this.f41305f = vVar;
        this.f41300a = j10;
        this.f41301b = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j10;
        v vVar = this.f41305f;
        synchronized (vVar) {
            this.f41304e = true;
            lo.e eVar = this.f41303d;
            j10 = eVar.f45637b;
            eVar.skip(j10);
            vVar.notifyAll();
        }
        if (j10 > 0) {
            v vVar2 = this.f41305f;
            byte[] bArr = yn.a.f54560a;
            vVar2.f41308b.h(j10);
        }
        this.f41305f.a();
    }

    @Override // lo.t
    public final long l(long j10, lo.e sink) throws Throwable {
        int i10;
        Throwable a0Var;
        boolean z10;
        long jL;
        kotlin.jvm.internal.n.f(sink, "sink");
        do {
            v vVar = this.f41305f;
            synchronized (vVar) {
                vVar.f41317k.h();
                try {
                    synchronized (vVar) {
                        i10 = vVar.f41318m;
                    }
                } catch (Throwable th2) {
                    vVar.f41317k.k();
                    throw th2;
                }
            }
            if (i10 != 0 && !this.f41301b) {
                a0Var = vVar.f41319n;
                if (a0Var == null) {
                    synchronized (vVar) {
                        int i11 = vVar.f41318m;
                        d5.u.t(i11);
                        a0Var = new a0(i11);
                    }
                }
                throw th;
            }
            a0Var = null;
            if (this.f41304e) {
                throw new IOException("stream closed");
            }
            lo.e eVar = this.f41303d;
            long j11 = eVar.f45637b;
            z10 = false;
            if (j11 > 0) {
                jL = eVar.l(Math.min(8192L, j11), sink);
                long j12 = vVar.f41309c + jL;
                vVar.f41309c = j12;
                long j13 = j12 - vVar.f41310d;
                if (a0Var == null && j13 >= vVar.f41308b.f41268p.a() / 2) {
                    vVar.f41308b.n(vVar.f41307a, j13);
                    vVar.f41310d = vVar.f41309c;
                }
            } else {
                if (!this.f41301b && a0Var == null) {
                    try {
                        vVar.wait();
                        z10 = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                jL = -1;
            }
            vVar.f41317k.k();
        } while (z10);
        if (jL != -1) {
            return jL;
        }
        if (a0Var == null) {
            return -1L;
        }
        throw a0Var;
    }

    @Override // lo.t
    public final lo.v timeout() {
        return this.f41305f.f41317k;
    }
}
