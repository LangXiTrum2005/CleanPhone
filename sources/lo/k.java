package lo;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f45648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Inflater f45649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45651d;

    public k(n nVar, Inflater inflater) {
        this.f45648a = nVar;
        this.f45649b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f45651d) {
            return;
        }
        this.f45649b.end();
        this.f45651d = true;
        this.f45648a.close();
    }

    @Override // lo.t
    public final long l(long j10, e sink) throws IOException {
        long j11;
        Inflater inflater = this.f45649b;
        kotlin.jvm.internal.n.f(sink, "sink");
        while (!this.f45651d) {
            try {
                o oVarK = sink.k(1);
                int iMin = (int) Math.min(8192L, 8192 - oVarK.f45661c);
                boolean zNeedsInput = inflater.needsInput();
                n nVar = this.f45648a;
                if (zNeedsInput && !nVar.exhausted()) {
                    o oVar = nVar.f45657b.f45636a;
                    kotlin.jvm.internal.n.c(oVar);
                    int i10 = oVar.f45661c;
                    int i11 = oVar.f45660b;
                    int i12 = i10 - i11;
                    this.f45650c = i12;
                    inflater.setInput(oVar.f45659a, i11, i12);
                }
                int iInflate = inflater.inflate(oVarK.f45659a, oVarK.f45661c, iMin);
                int i13 = this.f45650c;
                if (i13 != 0) {
                    int remaining = i13 - inflater.getRemaining();
                    this.f45650c -= remaining;
                    nVar.skip(remaining);
                }
                if (iInflate > 0) {
                    oVarK.f45661c += iInflate;
                    j11 = iInflate;
                    sink.f45637b += j11;
                } else {
                    if (oVarK.f45660b == oVarK.f45661c) {
                        sink.f45636a = oVarK.a();
                        p.a(oVarK);
                    }
                    j11 = 0;
                }
                if (j11 > 0) {
                    return j11;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (nVar.exhausted()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override // lo.t
    public final v timeout() {
        return this.f45648a.f45656a.timeout();
    }
}
