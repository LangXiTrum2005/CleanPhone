package bo;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.n;
import lo.t;
import lo.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f5769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f5775g;

    public d(e eVar, t delegate, long j10) {
        n.f(delegate, "delegate");
        this.f5775g = eVar;
        this.f5769a = delegate;
        this.f5770b = j10;
        this.f5772d = true;
        if (j10 == 0) {
            h(null);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f5774f) {
            return;
        }
        this.f5774f = true;
        try {
            d();
            h(null);
        } catch (IOException e10) {
            throw h(e10);
        }
    }

    public final void d() throws IOException {
        this.f5769a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f5773e) {
            return iOException;
        }
        this.f5773e = true;
        if (iOException == null && this.f5772d) {
            this.f5772d = false;
        }
        return this.f5775g.a(true, false, iOException);
    }

    @Override // lo.t
    public final long l(long j10, lo.e sink) throws IOException {
        n.f(sink, "sink");
        if (this.f5774f) {
            throw new IllegalStateException("closed");
        }
        try {
            long jL = this.f5769a.l(8192L, sink);
            if (this.f5772d) {
                this.f5772d = false;
            }
            if (jL == -1) {
                h(null);
                return -1L;
            }
            long j11 = this.f5771c + jL;
            long j12 = this.f5770b;
            if (j12 == -1 || j11 <= j12) {
                this.f5771c = j11;
                if (j11 == j12) {
                    h(null);
                }
                return jL;
            }
            throw new ProtocolException("expected " + j12 + " bytes but received " + j11);
        } catch (IOException e10) {
            throw h(e10);
        }
    }

    @Override // lo.t
    public final v timeout() {
        return this.f5769a.timeout();
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f5769a + ')';
    }
}
