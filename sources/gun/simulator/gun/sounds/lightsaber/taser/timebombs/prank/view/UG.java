package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class UG extends JK {
    public final int m;
    public final GG n;
    public final UG o;
    public final Object p;
    public volatile C3433fS q;
    public volatile LG r;

    public UG(JG jg) {
        super(jg.d, jg.e);
        this.m = jg.g;
        this.n = jg.i;
        this.o = this;
        this.f = jg.f3259a;
        this.g = jg.b;
        this.e = jg.f;
        this.i = jg.c;
        this.h = jg.h;
        this.p = jg.j;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x016d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0172  */
    public final void h(Xo0 xo0) throws Throwable {
        File fileO = this.f3261a.o(this.g);
        long length = fileO.length();
        int i = this.m;
        if (i > 0 && length >= i) {
            No0 no0 = AbstractC4648tE.f5026a;
            return;
        }
        int iG = g();
        KK kkA = this.b.a(iG, this.g);
        if (kkA != null && length >= kkA.c) {
            No0 no1 = AbstractC4648tE.f5026a;
            return;
        }
        a();
        int i2 = (int) length;
        C4568sM c4568sMC = c(xo0, i2, this.m, "GET");
        if (c4568sMC == null) {
            return;
        }
        boolean z = true;
        NN nn = null;
        try {
            a();
            String strF = PK.f(c4568sMC, this.h == null && AbstractC4648tE.e, true);
            if (strF != null) {
                throw new Oo0(strF + ", rawKey: " + this.f + ", url: " + xo0);
            }
            int iB = PK.b(c4568sMC);
            if (kkA != null && kkA.c != iB) {
                No0 no2 = AbstractC4648tE.f5026a;
                throw new LG("Content-Length not match, old length: " + kkA.c + ", new length: " + iB + ", rawKey: " + this.f + ", currentUrl: " + xo0 + ", previousInfo: " + kkA.e);
            }
            PK.c(c4568sMC, this.b, this.g, iG);
            KK kkA2 = this.b.a(iG, this.g);
            int i3 = kkA2 == null ? 0 : kkA2.c;
            InputStream inputStreamG = c4568sMC.g();
            No0 no3 = AbstractC4648tE.f5026a;
            NN nn2 = new NN(fileO, "rw");
            try {
                nn2.g(length);
                if (AbstractC4648tE.c) {
                    "preload start from: ".concat(String.valueOf(length));
                }
                byte[] bArr = new byte[8192];
                while (true) {
                    int i4 = inputStreamG.read(bArr);
                    if (i4 < 0) {
                        try {
                            this.j.compareAndSet(0, 2);
                            No0 no4 = AbstractC4648tE.f5026a;
                            PK.j(c4568sMC.g());
                            nn2.f();
                            return;
                        } catch (Throwable th) {
                            th = th;
                            nn = nn2;
                            z = false;
                            PK.j(c4568sMC.g());
                            if (nn != null) {
                                nn.f();
                            }
                            if (z) {
                                d();
                                No0 no5 = AbstractC4648tE.f5026a;
                            }
                            throw th;
                        }
                    }
                    a();
                    if (i4 > 0) {
                        try {
                            ((RandomAccessFile) nn2.b).write(bArr, 0, i4);
                            i2 += i4;
                            if (this.h != null) {
                                synchronized (this.o) {
                                    this.o.notifyAll();
                                }
                            }
                            this.c.addAndGet(i4);
                            e(i3, i2);
                        } catch (IOException e) {
                            throw new C3433fS(e);
                        }
                    }
                    int i5 = this.m;
                    if (i5 > 0 && i2 >= i5) {
                        No0 no6 = AbstractC4648tE.f5026a;
                        PK.j(c4568sMC.g());
                        nn2.f();
                        d();
                        return;
                    }
                    a();
                }
            } catch (Throwable th2) {
                th = th2;
                nn = nn2;
                PK.j(c4568sMC.g());
                if (nn != null) {
                    nn.f();
                }
                if (z) {
                    d();
                    No0 no7 = AbstractC4648tE.f5026a;
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void i() throws MK {
        while (true) {
            Yo0 yo0 = this.i;
            if (!(yo0.d < yo0.e)) {
                return;
            }
            a();
            Xo0 xo0A = this.i.a();
            try {
                h(xo0A);
                return;
            } catch (LG e) {
                this.r = e;
                return;
            } catch (Oo0 unused) {
                Yo0.f.add(xo0A.f3996a);
                f();
            } catch (C3433fS e2) {
                this.q = e2;
                f();
                return;
            } catch (IOException e3) {
                if (e3 instanceof SocketTimeoutException) {
                    Yo0.g.add(xo0A.f3996a);
                }
                if (!b()) {
                    f();
                }
            } catch (Throwable unused2) {
                return;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3261a.f(this.g);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            i();
        } catch (Throwable unused) {
        }
        this.d.set(SystemClock.elapsedRealtime() - jElapsedRealtime);
        this.f3261a.e(this.g);
        GG gg = this.n;
        if (gg != null) {
            gg.d(this);
        }
    }
}
