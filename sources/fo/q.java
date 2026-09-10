package fo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements lo.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lo.g f41286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41291f;

    public q(lo.g source) {
        kotlin.jvm.internal.n.f(source, "source");
        this.f41286a = source;
    }

    @Override // lo.t
    public final long l(long j10, lo.e sink) throws IOException {
        int i10;
        int i11;
        kotlin.jvm.internal.n.f(sink, "sink");
        do {
            int i12 = this.f41290e;
            lo.g gVar = this.f41286a;
            if (i12 == 0) {
                gVar.skip(this.f41291f);
                this.f41291f = 0;
                if ((this.f41288c & 4) == 0) {
                    i10 = this.f41289d;
                    int iR = yn.a.r(gVar);
                    this.f41290e = iR;
                    this.f41287b = iR;
                    int i13 = gVar.readByte() & 255;
                    this.f41288c = gVar.readByte() & 255;
                    Logger logger = r.f41292d;
                    if (logger.isLoggable(Level.FINE)) {
                        lo.h hVar = f.f41230a;
                        logger.fine(f.a(true, this.f41289d, this.f41287b, i13, this.f41288c));
                    }
                    i11 = gVar.readInt() & Integer.MAX_VALUE;
                    this.f41289d = i11;
                    if (i13 != 9) {
                        throw new IOException(d5.u.f(i13, " != TYPE_CONTINUATION"));
                    }
                }
            } else {
                long jL = gVar.l(Math.min(8192L, i12), sink);
                if (jL != -1) {
                    this.f41290e -= (int) jL;
                    return jL;
                }
            }
            return -1L;
        } while (i11 == i10);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // lo.t
    public final lo.v timeout() {
        return this.f41286a.timeout();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
