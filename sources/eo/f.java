package eo;

import java.io.IOException;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40194d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f40180b) {
            return;
        }
        if (!this.f40194d) {
            d();
        }
        this.f40180b = true;
    }

    @Override // eo.a, lo.t
    public final long l(long j10, lo.e sink) throws IOException {
        n.f(sink, "sink");
        if (this.f40180b) {
            throw new IllegalStateException("closed");
        }
        if (this.f40194d) {
            return -1L;
        }
        long jL = super.l(8192L, sink);
        if (jL != -1) {
            return jL;
        }
        this.f40194d = true;
        d();
        return -1L;
    }
}
