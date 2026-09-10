package bo;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.n;
import lo.r;
import lo.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f5763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f5768f;

    public c(e eVar, r delegate, long j10) {
        n.f(delegate, "delegate");
        this.f5768f = eVar;
        this.f5763a = delegate;
        this.f5764b = j10;
    }

    @Override // lo.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f5767e) {
            return;
        }
        this.f5767e = true;
        long j10 = this.f5764b;
        if (j10 != -1 && this.f5766d != j10) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            d();
            h(null);
        } catch (IOException e10) {
            throw h(e10);
        }
    }

    public final void d() {
        this.f5763a.close();
    }

    @Override // lo.r
    public final void e(long j10, lo.e eVar) throws IOException {
        if (this.f5767e) {
            throw new IllegalStateException("closed");
        }
        long j11 = this.f5764b;
        if (j11 != -1 && this.f5766d + j10 > j11) {
            StringBuilder sbL = wi.d.l(j11, "expected ", " bytes but received ");
            sbL.append(this.f5766d + j10);
            throw new ProtocolException(sbL.toString());
        }
        try {
            this.f5763a.e(j10, eVar);
            this.f5766d += j10;
        } catch (IOException e10) {
            throw h(e10);
        }
    }

    @Override // lo.r, java.io.Flushable
    public final void flush() throws IOException {
        try {
            k();
        } catch (IOException e10) {
            throw h(e10);
        }
    }

    public final IOException h(IOException iOException) {
        if (this.f5765c) {
            return iOException;
        }
        this.f5765c = true;
        return this.f5768f.a(false, true, iOException);
    }

    public final void k() {
        this.f5763a.flush();
    }

    @Override // lo.r
    public final v timeout() {
        return this.f5763a.timeout();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f5763a + ')';
    }
}
