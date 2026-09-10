package fo;

import com.applovin.shadow.okhttp3.internal.http2.Http2Stream;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements lo.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lo.e f41297b = new lo.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f41299d;

    public s(v vVar, boolean z10) {
        this.f41299d = vVar;
        this.f41296a = z10;
    }

    public final void a(boolean z10) {
        long jMin;
        boolean z11;
        v vVar = this.f41299d;
        synchronized (vVar) {
            vVar.l.h();
            while (vVar.f41311e >= vVar.f41312f && !this.f41296a && !this.f41298c) {
                try {
                    synchronized (vVar) {
                        int i10 = vVar.f41318m;
                        if (i10 != 0) {
                            break;
                        }
                        try {
                            vVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th2) {
                    vVar.l.k();
                    throw th2;
                }
            }
            vVar.l.k();
            vVar.b();
            jMin = Math.min(vVar.f41312f - vVar.f41311e, this.f41297b.f45637b);
            vVar.f41311e += jMin;
            z11 = z10 && jMin == this.f41297b.f45637b;
        }
        this.f41299d.l.h();
        try {
            v vVar2 = this.f41299d;
            vVar2.f41308b.j(vVar2.f41307a, z11, this.f41297b, jMin);
        } finally {
            this.f41299d.l.k();
        }
    }

    @Override // lo.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z10;
        v vVar = this.f41299d;
        byte[] bArr = yn.a.f54560a;
        synchronized (vVar) {
            if (this.f41298c) {
                return;
            }
            synchronized (vVar) {
                z10 = vVar.f41318m == 0;
            }
            v vVar2 = this.f41299d;
            if (!vVar2.f41316j.f41296a) {
                if (this.f41297b.f45637b > 0) {
                    while (this.f41297b.f45637b > 0) {
                        a(true);
                    }
                } else if (z10) {
                    vVar2.f41308b.j(vVar2.f41307a, true, null, 0L);
                }
            }
            synchronized (this.f41299d) {
                this.f41298c = true;
            }
            this.f41299d.f41308b.flush();
            this.f41299d.a();
        }
    }

    @Override // lo.r
    public final void e(long j10, lo.e eVar) {
        byte[] bArr = yn.a.f54560a;
        lo.e eVar2 = this.f41297b;
        eVar2.e(j10, eVar);
        while (eVar2.f45637b >= Http2Stream.EMIT_BUFFER_SIZE) {
            a(false);
        }
    }

    @Override // lo.r, java.io.Flushable
    public final void flush() {
        v vVar = this.f41299d;
        byte[] bArr = yn.a.f54560a;
        synchronized (vVar) {
            vVar.b();
        }
        while (this.f41297b.f45637b > 0) {
            a(false);
            this.f41299d.f41308b.flush();
        }
    }

    @Override // lo.r
    public final lo.v timeout() {
        return this.f41299d.l;
    }
}
