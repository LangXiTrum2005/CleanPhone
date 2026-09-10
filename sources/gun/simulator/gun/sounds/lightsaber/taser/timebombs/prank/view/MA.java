package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
public final class MA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3396a;
    public final GA b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final LA i;
    public final KA j;
    public final HX k;
    public final HX l;
    public EnumC2502Ir m;
    public IOException n;

    public MA(int i, GA ga, boolean z, boolean z2, C4447qz c4447qz) {
        this.f3396a = i;
        this.b = ga;
        this.f = ga.s.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new LA(this, ga.r.a(), z2);
        this.j = new KA(this, z);
        this.k = new HX(this);
        this.l = new HX(this);
        if (c4447qz == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!h())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(c4447qz);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    public final void a() {
        boolean z;
        boolean zI;
        byte[] bArr = Vg0.f3884a;
        synchronized (this) {
            LA la = this.i;
            if (la.b || !la.e) {
                z = false;
            } else {
                KA ka = this.j;
                if (ka.f3306a || ka.c) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zI = i();
        }
        if (z) {
            c(EnumC2502Ir.CANCEL, null);
        } else {
            if (zI) {
                return;
            }
            this.b.g(this.f3396a);
        }
    }

    public final void b() throws IOException {
        KA ka = this.j;
        if (ka.c) {
            throw new IOException("stream closed");
        }
        if (ka.f3306a) {
            throw new IOException("stream finished");
        }
        if (this.m != null) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            EnumC2502Ir enumC2502Ir = this.m;
            AbstractC2995aW.n(enumC2502Ir);
            throw new L90(enumC2502Ir);
        }
    }

    public final void c(EnumC2502Ir enumC2502Ir, IOException iOException) {
        if (d(enumC2502Ir, iOException)) {
            GA ga = this.b;
            ga.getClass();
            ga.y.h(this.f3396a, enumC2502Ir);
        }
    }

    public final boolean d(EnumC2502Ir enumC2502Ir, IOException iOException) {
        byte[] bArr = Vg0.f3884a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            if (this.i.b && this.j.f3306a) {
                return false;
            }
            this.m = enumC2502Ir;
            this.n = iOException;
            notifyAll();
            this.b.g(this.f3396a);
            return true;
        }
    }

    public final void e(EnumC2502Ir enumC2502Ir) {
        if (d(enumC2502Ir, null)) {
            this.b.m(this.f3396a, enumC2502Ir);
        }
    }

    public final synchronized EnumC2502Ir f() {
        return this.m;
    }

    public final KA g() {
        synchronized (this) {
            if (!this.h && !h()) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.j;
    }

    public final boolean h() {
        return this.b.f3110a == ((this.f3396a & 1) == 1);
    }

    public final synchronized boolean i() {
        if (this.m != null) {
            return false;
        }
        LA la = this.i;
        if (la.b || la.e) {
            KA ka = this.j;
            if ((ka.f3306a || ka.c) && this.h) {
                return false;
            }
        }
        return true;
    }

    public final void j(C4447qz c4447qz, boolean z) {
        boolean zI;
        AbstractC2995aW.q(c4447qz, "headers");
        byte[] bArr = Vg0.f3884a;
        synchronized (this) {
            try {
                if (this.h && z) {
                    this.i.getClass();
                } else {
                    this.h = true;
                    this.g.add(c4447qz);
                }
                if (z) {
                    this.i.b = true;
                }
                zI = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zI) {
            return;
        }
        this.b.g(this.f3396a);
    }

    public final synchronized void k(EnumC2502Ir enumC2502Ir) {
        if (this.m == null) {
            this.m = enumC2502Ir;
            notifyAll();
        }
    }

    public final void l() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
