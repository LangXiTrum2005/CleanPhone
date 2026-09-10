package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.app.NotificationCompat;
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

/* JADX INFO: loaded from: classes4.dex */
public final class IX implements InterfaceC2409Fc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4838vS f3221a;
    public final HY b;
    public final boolean c;
    public final LX d;
    public final AbstractC2865Wr e;
    public final HX f;
    public final AtomicBoolean g;
    public Object h;
    public C4352ps i;
    public KX j;
    public boolean k;
    public C4813v60 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public volatile boolean p;
    public volatile C4813v60 q;
    public volatile KX r;

    public IX(C4838vS c4838vS, HY hy, boolean z) {
        AbstractC2995aW.q(c4838vS, "client");
        AbstractC2995aW.q(hy, "originalRequest");
        this.f3221a = c4838vS;
        this.b = hy;
        this.c = z;
        this.d = (LX) c4838vS.b.b;
        this.e = c4838vS.e.create(this);
        HX hx = new HX(this);
        hx.g(c4838vS.x, TimeUnit.MILLISECONDS);
        this.f = hx;
        this.g = new AtomicBoolean();
        this.o = true;
    }

    public static final String a(IX ix) {
        StringBuilder sb = new StringBuilder();
        sb.append(ix.p ? "canceled " : "");
        sb.append(ix.c ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(ix.b.f3175a.g());
        return sb.toString();
    }

    public final void b(KX kx) {
        byte[] bArr = Vg0.f3884a;
        if (this.j != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.j = kx;
        kx.p.add(new GX(this, this.h));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketJ;
        byte[] bArr = Vg0.f3884a;
        KX kx = this.j;
        if (kx != null) {
            synchronized (kx) {
                socketJ = j();
            }
            if (this.j == null) {
                if (socketJ != null) {
                    Vg0.d(socketJ);
                }
                this.e.connectionReleased(this, kx);
            } else if (socketJ != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (!this.k && this.f.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            AbstractC2865Wr abstractC2865Wr = this.e;
            AbstractC2995aW.n(interruptedIOException);
            abstractC2865Wr.callFailed(this, interruptedIOException);
        } else {
            this.e.callEnd(this);
        }
        return interruptedIOException;
    }

    public final void cancel() {
        Socket socket;
        if (this.p) {
            return;
        }
        this.p = true;
        C4813v60 c4813v60 = this.q;
        if (c4813v60 != null) {
            ((InterfaceC4264os) c4813v60.e).cancel();
        }
        KX kx = this.r;
        if (kx != null && (socket = kx.c) != null) {
            Vg0.d(socket);
        }
        this.e.canceled(this);
    }

    public final Object clone() {
        return new IX(this.f3221a, this.b, this.c);
    }

    public final void d(InterfaceC2539Kc interfaceC2539Kc) {
        FX fxE;
        AbstractC2995aW.q(interfaceC2539Kc, "responseCallback");
        if (!this.g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        C5104yU c5104yU = C5104yU.f5278a;
        this.h = C5104yU.f5278a.g();
        this.e.callStart(this);
        C3605hO c3605hO = this.f3221a.f5131a;
        FX fx = new FX(this, interfaceC2539Kc);
        c3605hO.getClass();
        synchronized (c3605hO) {
            ((ArrayDeque) c3605hO.e).add(fx);
            IX ix = fx.c;
            if (!ix.c && (fxE = c3605hO.e(ix.b.f3175a.d)) != null) {
                fx.b = fxE.b;
            }
        }
        c3605hO.k();
    }

    public final C5021xZ e() {
        if (!this.g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f.h();
        C5104yU c5104yU = C5104yU.f5278a;
        this.h = C5104yU.f5278a.g();
        this.e.callStart(this);
        try {
            C3605hO c3605hO = this.f3221a.f5131a;
            synchronized (c3605hO) {
                ((ArrayDeque) c3605hO.g).add(this);
            }
            C5021xZ c5021xZG = g();
            C3605hO c3605hO2 = this.f3221a.f5131a;
            c3605hO2.getClass();
            c3605hO2.f((ArrayDeque) c3605hO2.g, this);
            return c5021xZG;
        } catch (Throwable th) {
            C3605hO c3605hO3 = this.f3221a.f5131a;
            c3605hO3.getClass();
            c3605hO3.f((ArrayDeque) c3605hO3.g, this);
            throw th;
        }
    }

    public final void f(boolean z) {
        C4813v60 c4813v60;
        synchronized (this) {
            if (!this.o) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (c4813v60 = this.q) != null) {
            ((InterfaceC4264os) c4813v60.e).cancel();
            ((IX) c4813v60.b).h(c4813v60, true, true, null);
        }
        this.l = null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    public final C5021xZ g() throws Throwable {
        ArrayList arrayList = new ArrayList();
        AbstractC2801Uf.a0(this.f3221a.c, arrayList);
        arrayList.add(new MZ(this.f3221a));
        arrayList.add(new C4672tb(this.f3221a.j));
        arrayList.add(new C5202zc(this.f3221a.k));
        arrayList.add(C3635hj.f4466a);
        if (!this.c) {
            AbstractC2801Uf.a0(this.f3221a.d, arrayList);
        }
        arrayList.add(new C2461Hc(this.c));
        HY hy = this.b;
        C4838vS c4838vS = this.f3221a;
        boolean z = false;
        try {
            C5021xZ c5021xZB = new MX(this, arrayList, 0, null, hy, c4838vS.y, c4838vS.z, c4838vS.A).b(this.b);
            if (this.p) {
                Vg0.c(c5021xZB);
                throw new IOException("Canceled");
            }
            i(null);
            return c5021xZB;
        } catch (IOException e) {
            try {
                IOException iOExceptionI = i(e);
                if (iOExceptionI == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionI;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    i(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z) {
                i(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final IOException h(C4813v60 c4813v60, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        AbstractC2995aW.q(c4813v60, "exchange");
        if (!AbstractC2995aW.i(c4813v60, this.q)) {
            return iOException;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (this.m) {
                        if (z) {
                            this.m = false;
                        }
                        if (z2) {
                            this.n = false;
                        }
                        z5 = this.m;
                        if (z5) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (!z5) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                    } else if (z2 || !this.n) {
                        z4 = false;
                    } else {
                        if (z) {
                            this.m = false;
                        }
                        if (z2) {
                            this.n = false;
                        }
                        z5 = this.m;
                        if (z5 || this.n) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (!z5 && !this.n && !this.o) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z2) {
                }
                z4 = false;
            }
        }
        if (z3) {
            this.q = null;
            KX kx = this.j;
            if (kx != null) {
                kx.h();
            }
        }
        return z4 ? c(iOException) : iOException;
    }

    public final IOException i(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.o) {
                this.o = false;
                if (!this.m && !this.n) {
                    z = true;
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket j() {
        KX kx = this.j;
        AbstractC2995aW.n(kx);
        byte[] bArr = Vg0.f3884a;
        ArrayList arrayList = kx.p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (AbstractC2995aW.i(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.".toString());
        }
        arrayList.remove(i);
        this.j = null;
        if (arrayList.isEmpty()) {
            kx.q = System.nanoTime();
            LX lx = this.d;
            lx.getClass();
            byte[] bArr2 = Vg0.f3884a;
            boolean z = kx.j;
            C4234ob0 c4234ob0 = lx.c;
            if (z || lx.f3355a == 0) {
                kx.j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = lx.e;
                concurrentLinkedQueue.remove(kx);
                if (concurrentLinkedQueue.isEmpty()) {
                    c4234ob0.a();
                }
                Socket socket = kx.d;
                AbstractC2995aW.n(socket);
                return socket;
            }
            c4234ob0.c(lx.d, 0L);
        }
        return null;
    }
}
