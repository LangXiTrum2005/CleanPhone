package fo;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f41308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f41310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f41311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f41312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f41313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f41315i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f41316j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f41317k;
    public final u l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IOException f41319n;

    public v(int i10, n connection, boolean z10, boolean z11, xn.l lVar) {
        kotlin.jvm.internal.n.f(connection, "connection");
        this.f41307a = i10;
        this.f41308b = connection;
        this.f41312f = connection.f41269q.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f41313g = arrayDeque;
        this.f41315i = new t(this, connection.f41268p.a(), z11);
        this.f41316j = new s(this, z10);
        this.f41317k = new u(this);
        this.l = new u(this);
        if (lVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(lVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void a() {
        boolean z10;
        boolean zH;
        byte[] bArr = yn.a.f54560a;
        synchronized (this) {
            try {
                t tVar = this.f41315i;
                if (tVar.f41301b || !tVar.f41304e) {
                    z10 = false;
                } else {
                    s sVar = this.f41316j;
                    if (sVar.f41296a || sVar.f41298c) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                zH = h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            c(9, null);
        } else {
            if (zH) {
                return;
            }
            this.f41308b.c(this.f41307a);
        }
    }

    public final void b() throws IOException {
        s sVar = this.f41316j;
        if (sVar.f41298c) {
            throw new IOException("stream closed");
        }
        if (sVar.f41296a) {
            throw new IOException("stream finished");
        }
        if (this.f41318m != 0) {
            IOException iOException = this.f41319n;
            if (iOException != null) {
                throw iOException;
            }
            int i10 = this.f41318m;
            d5.u.t(i10);
            throw new a0(i10);
        }
    }

    public final void c(int i10, IOException iOException) {
        d5.u.n(i10, "rstStatusCode");
        if (d(i10, iOException)) {
            n nVar = this.f41308b;
            nVar.getClass();
            d5.u.n(i10, "statusCode");
            nVar.f41275w.k(this.f41307a, i10);
        }
    }

    public final boolean d(int i10, IOException iOException) {
        byte[] bArr = yn.a.f54560a;
        synchronized (this) {
            if (this.f41318m != 0) {
                return false;
            }
            this.f41318m = i10;
            this.f41319n = iOException;
            notifyAll();
            if (this.f41315i.f41301b && this.f41316j.f41296a) {
                return false;
            }
            this.f41308b.c(this.f41307a);
            return true;
        }
    }

    public final void e(int i10) {
        d5.u.n(i10, IronSourceConstants.EVENTS_ERROR_CODE);
        if (d(i10, null)) {
            this.f41308b.k(this.f41307a, i10);
        }
    }

    public final s f() {
        synchronized (this) {
            if (!this.f41314h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f41316j;
    }

    public final boolean g() {
        boolean z10 = (this.f41307a & 1) == 1;
        this.f41308b.getClass();
        return true == z10;
    }

    public final synchronized boolean h() {
        try {
            if (this.f41318m != 0) {
                return false;
            }
            t tVar = this.f41315i;
            if (tVar.f41301b || tVar.f41304e) {
                s sVar = this.f41316j;
                if ((sVar.f41296a || sVar.f41298c) && this.f41314h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void i(xn.l headers, boolean z10) {
        boolean zH;
        kotlin.jvm.internal.n.f(headers, "headers");
        byte[] bArr = yn.a.f54560a;
        synchronized (this) {
            try {
                if (this.f41314h && z10) {
                    this.f41315i.getClass();
                } else {
                    this.f41314h = true;
                    this.f41313g.add(headers);
                }
                if (z10) {
                    this.f41315i.f41301b = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zH) {
            return;
        }
        this.f41308b.c(this.f41307a);
    }

    public final synchronized void j(int i10) {
        d5.u.n(i10, IronSourceConstants.EVENTS_ERROR_CODE);
        if (this.f41318m == 0) {
            this.f41318m = i10;
            notifyAll();
        }
    }
}
