package fo;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends lo.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f41306m;

    public u(v vVar) {
        this.f41306m = vVar;
    }

    @Override // lo.d
    public final void j() {
        this.f41306m.e(9);
        n nVar = this.f41306m.f41308b;
        synchronized (nVar) {
            long j10 = nVar.f41266n;
            long j11 = nVar.f41265m;
            if (j10 < j11) {
                return;
            }
            nVar.f41265m = j11 + 1;
            nVar.f41267o = System.nanoTime() + ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
            int i10 = 2;
            nVar.f41261h.c(new ao.b(i10, defpackage.e.q(nVar.f41256c, " ping", new StringBuilder()), nVar), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
