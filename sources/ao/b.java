package ao;

import bo.k;
import bo.l;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5056f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, String str, Object obj) {
        super(str, true);
        this.f5055e = i10;
        this.f5056f = obj;
    }

    @Override // ao.a
    public final long a() {
        switch (this.f5055e) {
            case 0:
                ((jk.a) this.f5056f).invoke();
                return -1L;
            case 1:
                l lVar = (l) this.f5056f;
                long jNanoTime = System.nanoTime();
                int i10 = 0;
                long j10 = Long.MIN_VALUE;
                k kVar = null;
                int i11 = 0;
                for (k connection : (ConcurrentLinkedQueue) lVar.f5821d) {
                    n.e(connection, "connection");
                    synchronized (connection) {
                        if (lVar.c(connection, jNanoTime) > 0) {
                            i11++;
                        } else {
                            i10++;
                            long j11 = jNanoTime - connection.f5815q;
                            if (j11 > j10) {
                                kVar = connection;
                                j10 = j11;
                            }
                        }
                    }
                }
                long j12 = lVar.f5818a;
                if (j10 < j12 && i10 <= 5) {
                    if (i10 > 0) {
                        return j12 - j10;
                    }
                    if (i11 > 0) {
                        return j12;
                    }
                    return -1L;
                }
                n.c(kVar);
                synchronized (kVar) {
                    if (!kVar.f5814p.isEmpty()) {
                        return 0L;
                    }
                    if (kVar.f5815q + j10 != jNanoTime) {
                        return 0L;
                    }
                    kVar.f5809j = true;
                    ((ConcurrentLinkedQueue) lVar.f5821d).remove(kVar);
                    Socket socket = kVar.f5803d;
                    n.c(socket);
                    yn.a.e(socket);
                    if (!((ConcurrentLinkedQueue) lVar.f5821d).isEmpty()) {
                        return 0L;
                    }
                    ((c) lVar.f5819b).a();
                    return 0L;
                }
            default:
                fo.n nVar = (fo.n) this.f5056f;
                nVar.getClass();
                try {
                    nVar.f41275w.j(false, 2, 0);
                    return -1L;
                } catch (IOException e10) {
                    nVar.a(2, 2, e10);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, String str) {
        super(str, true);
        this.f5055e = 1;
        this.f5056f = lVar;
    }
}
