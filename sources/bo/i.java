package bo;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.ws;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import kotlin.jvm.internal.n;
import xj.t;
import xn.q;
import xn.s;
import xn.w;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements xn.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f5786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f5787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f5788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f5789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f5790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Throwable f5791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b2.a f5792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f5793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f5794i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5795j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5796k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f5797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile e f5798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile k f5799o;

    public i(q qVar, s sVar) {
        this.f5786a = qVar;
        this.f5787b = sVar;
        this.f5788c = (l) qVar.f54028b.f49096b;
        qVar.f54031e.getClass();
        h hVar = new h(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hVar.g(0);
        this.f5789d = hVar;
        this.f5790e = new AtomicBoolean();
        this.l = true;
    }

    public static final String a(i iVar) {
        ws wsVar;
        StringBuilder sb2 = new StringBuilder();
        wi.d.m(sb2, iVar.f5797m ? "canceled " : "", NotificationCompat.CATEGORY_CALL, " to ");
        xn.m mVar = iVar.f5787b.f54060a;
        mVar.getClass();
        try {
            wsVar = new ws();
            wsVar.c(mVar, "/...");
        } catch (IllegalArgumentException unused) {
            wsVar = null;
        }
        n.c(wsVar);
        wsVar.f21596d = xn.b.b("", 0, 0, 251, " \"':;<=>@[]^`{}|/\\?#");
        wsVar.f21597e = xn.b.b("", 0, 0, 251, " \"':;<=>@[]^`{}|/\\?#");
        sb2.append(wsVar.a().f53996h);
        return sb2.toString();
    }

    public final void b(k kVar) {
        byte[] bArr = yn.a.f54560a;
        if (this.f5793h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f5793h = kVar;
        kVar.f5814p.add(new g(this, this.f5791f));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketL;
        byte[] bArr = yn.a.f54560a;
        k kVar = this.f5793h;
        if (kVar != null) {
            synchronized (kVar) {
                socketL = l();
            }
            if (this.f5793h == null) {
                if (socketL != null) {
                    yn.a.e(socketL);
                }
            } else if (socketL != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f5789d.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            n.c(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final void cancel() {
        Socket socket;
        if (this.f5797m) {
            return;
        }
        this.f5797m = true;
        e eVar = this.f5798n;
        if (eVar != null) {
            ((co.e) eVar.f5779d).cancel();
        }
        k kVar = this.f5799o;
        if (kVar == null || (socket = kVar.f5802c) == null) {
            return;
        }
        yn.a.e(socket);
    }

    public final Object clone() {
        return new i(this.f5786a, this.f5787b);
    }

    public final void e() {
        go.m mVar = go.m.f42045a;
        go.m.f42045a.getClass();
        this.f5791f = go.m.f42046b.isLoggable(Level.FINE) ? new Throwable("response.body().close()") : null;
    }

    public final void f(xn.e eVar) {
        f fVar;
        if (!this.f5790e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        e();
        u uVar = this.f5786a.f54027a;
        f fVar2 = new f(this, eVar);
        uVar.getClass();
        synchronized (uVar) {
            ((ArrayDeque) uVar.f54882e).add(fVar2);
            String str = this.f5787b.f54060a.f53992d;
            Iterator it = ((ArrayDeque) uVar.f54880c).iterator();
            do {
                if (!it.hasNext()) {
                    Iterator it2 = ((ArrayDeque) uVar.f54882e).iterator();
                    do {
                        if (!it2.hasNext()) {
                            fVar = null;
                            break;
                        }
                        fVar = (f) it2.next();
                    } while (!n.a(fVar.f5783c.f5787b.f54060a.f53992d, str));
                } else {
                    fVar = (f) it.next();
                }
            } while (!n.a(fVar.f5783c.f5787b.f54060a.f53992d, str));
            if (fVar != null) {
                fVar2.f5782b = fVar.f5782b;
            }
        }
        uVar.z();
    }

    public final w g() {
        if (!this.f5790e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f5789d.h();
        e();
        try {
            u uVar = this.f5786a.f54027a;
            synchronized (uVar) {
                ((ArrayDeque) uVar.f54881d).add(this);
            }
            w wVarI = i();
            u uVar2 = this.f5786a.f54027a;
            uVar2.o((ArrayDeque) uVar2.f54881d, this);
            return wVarI;
        } catch (Throwable th2) {
            u uVar3 = this.f5786a.f54027a;
            uVar3.o((ArrayDeque) uVar3.f54881d, this);
            throw th2;
        }
    }

    public final void h(boolean z10) {
        e eVar;
        synchronized (this) {
            if (!this.l) {
                throw new IllegalStateException("released");
            }
        }
        if (z10 && (eVar = this.f5798n) != null) {
            ((co.e) eVar.f5779d).cancel();
            ((i) eVar.f5777b).j(eVar, true, true, null);
        }
        this.f5794i = null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007d  */
    public final w i() {
        ArrayList arrayList = new ArrayList();
        t.a0(this.f5786a.f54029c, arrayList);
        arrayList.add(new co.a(this.f5786a));
        arrayList.add(new co.a(this.f5786a.f54036j));
        arrayList.add(new zn.b());
        arrayList.add(a.f5758a);
        t.a0(this.f5786a.f54030d, arrayList);
        arrayList.add(new co.b());
        s sVar = this.f5787b;
        q qVar = this.f5786a;
        co.g gVar = new co.g(this, arrayList, 0, null, sVar, qVar.f54047v, qVar.f54048w, qVar.f54049x);
        boolean z10 = false;
        try {
            try {
                w wVarB = gVar.b(sVar);
                if (this.f5797m) {
                    yn.a.d(wVarB);
                    throw new IOException("Canceled");
                }
                k(null);
                return wVarB;
            } catch (IOException e10) {
                z10 = true;
                IOException iOExceptionK = k(e10);
                n.d(iOExceptionK, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionK;
            }
        } catch (Throwable th2) {
            if (!z10) {
                k(null);
            }
            throw th2;
        }
        if (!z10) {
            k(null);
        }
        throw th2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001c), top: B:53:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001c), top: B:53:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final IOException j(e exchange, boolean z10, boolean z11, IOException iOException) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        n.f(exchange, "exchange");
        if (exchange.equals(this.f5798n)) {
            synchronized (this) {
                z12 = false;
                if (z10) {
                    try {
                        if (this.f5795j) {
                            if (z10) {
                                this.f5795j = false;
                            }
                            if (z11) {
                                this.f5796k = false;
                            }
                            z14 = this.f5795j;
                            if (z14) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            if (!z14) {
                                z12 = true;
                            }
                            z13 = z12;
                            z12 = z15;
                        } else if (z11 || !this.f5796k) {
                            z13 = false;
                        } else {
                            if (z10) {
                                this.f5795j = false;
                            }
                            if (z11) {
                                this.f5796k = false;
                            }
                            z14 = this.f5795j;
                            if (z14 || this.f5796k) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (!z14 && !this.f5796k && !this.l) {
                                z12 = true;
                            }
                            z13 = z12;
                            z12 = z15;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    if (z11) {
                    }
                    z13 = false;
                }
            }
            if (z12) {
                this.f5798n = null;
                k kVar = this.f5793h;
                if (kVar != null) {
                    synchronized (kVar) {
                        kVar.f5811m++;
                    }
                }
            }
            if (z13) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException k(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.l) {
                this.l = false;
                if (!this.f5795j && !this.f5796k) {
                    z10 = true;
                }
            }
        }
        return z10 ? c(iOException) : iOException;
    }

    public final Socket l() {
        k kVar = this.f5793h;
        n.c(kVar);
        byte[] bArr = yn.a.f54560a;
        ArrayList arrayList = kVar.f5814p;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (n.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i10);
        this.f5793h = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        kVar.f5815q = System.nanoTime();
        l lVar = this.f5788c;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) lVar.f5821d;
        ao.c cVar = (ao.c) lVar.f5819b;
        byte[] bArr2 = yn.a.f54560a;
        if (!kVar.f5809j) {
            cVar.c((ao.b) lVar.f5820c, 0L);
            return null;
        }
        kVar.f5809j = true;
        concurrentLinkedQueue.remove(kVar);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        Socket socket = kVar.f5803d;
        n.c(socket);
        return socket;
    }
}
