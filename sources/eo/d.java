package eo;

import bo.k;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f40190e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, long j10) {
        super(gVar);
        this.f40190e = gVar;
        this.f40189d = j10;
        if (j10 == 0) {
            d();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zS;
        if (this.f40180b) {
            return;
        }
        if (this.f40189d != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = yn.a.f54560a;
            n.f(timeUnit, "timeUnit");
            try {
                zS = yn.a.s(this, 100);
            } catch (IOException unused) {
                zS = false;
            }
            if (!zS) {
                ((k) this.f40190e.f40198d).k();
                d();
            }
        }
        this.f40180b = true;
    }

    @Override // eo.a, lo.t
    public final long l(long j10, lo.e sink) throws IOException {
        n.f(sink, "sink");
        if (this.f40180b) {
            throw new IllegalStateException("closed");
        }
        long j11 = this.f40189d;
        if (j11 == 0) {
            return -1L;
        }
        long jL = super.l(Math.min(j11, 8192L), sink);
        if (jL == -1) {
            ((k) this.f40190e.f40198d).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            d();
            throw protocolException;
        }
        long j12 = this.f40189d - jL;
        this.f40189d = j12;
        if (j12 == 0) {
            d();
        }
        return jL;
    }
}
