package lo;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f45627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f45628c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f45626a = i10;
        this.f45627b = obj;
        this.f45628c = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f45626a) {
            case 0:
                s sVar = (s) this.f45627b;
                c cVar = (c) this.f45628c;
                sVar.h();
                try {
                    try {
                        cVar.close();
                        if (sVar.i()) {
                            throw sVar.k(null);
                        }
                        return;
                    } catch (IOException e10) {
                        if (!sVar.i()) {
                            throw e10;
                        }
                        throw sVar.k(e10);
                    }
                } catch (Throwable th2) {
                    sVar.i();
                    throw th2;
                }
            default:
                ((InputStream) this.f45627b).close();
                return;
        }
    }

    @Override // lo.t
    public final long l(long j10, e sink) throws IOException {
        switch (this.f45626a) {
            case 0:
                kotlin.jvm.internal.n.f(sink, "sink");
                s sVar = (s) this.f45627b;
                c cVar = (c) this.f45628c;
                sVar.h();
                try {
                    try {
                        long jL = cVar.l(8192L, sink);
                        if (sVar.i()) {
                            throw sVar.k(null);
                        }
                        return jL;
                    } catch (IOException e10) {
                        if (sVar.i()) {
                            throw sVar.k(e10);
                        }
                        throw e10;
                    }
                } catch (Throwable th2) {
                    sVar.i();
                    throw th2;
                }
            default:
                kotlin.jvm.internal.n.f(sink, "sink");
                try {
                    ((v) this.f45628c).f();
                    o oVarK = sink.k(1);
                    int i10 = ((InputStream) this.f45627b).read(oVarK.f45659a, oVarK.f45661c, (int) Math.min(8192L, 8192 - oVarK.f45661c));
                    if (i10 == -1) {
                        if (oVarK.f45660b == oVarK.f45661c) {
                            sink.f45636a = oVarK.a();
                            p.a(oVarK);
                        }
                        return -1L;
                    }
                    oVarK.f45661c += i10;
                    long j11 = i10;
                    sink.f45637b += j11;
                    return j11;
                } catch (AssertionError e11) {
                    if (q1.u(e11)) {
                        throw new IOException(e11);
                    }
                    throw e11;
                }
        }
    }

    @Override // lo.t
    public final v timeout() {
        switch (this.f45626a) {
            case 0:
                return (s) this.f45627b;
            default:
                return (v) this.f45628c;
        }
    }

    public final String toString() {
        switch (this.f45626a) {
            case 0:
                return "AsyncTimeout.source(" + ((c) this.f45628c) + ')';
            default:
                return "source(" + ((InputStream) this.f45627b) + ')';
        }
    }
}
