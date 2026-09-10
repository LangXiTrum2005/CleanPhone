package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4352ps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LX f4855a;
    public final C3048b3 b;
    public final IX c;
    public final AbstractC2865Wr d;
    public C2329Ca e;
    public C4010m00 f;
    public int g;
    public int h;
    public int i;
    public C3834k00 j;

    public C4352ps(LX lx, C3048b3 c3048b3, IX ix, AbstractC2865Wr abstractC2865Wr) {
        AbstractC2995aW.q(lx, "connectionPool");
        AbstractC2995aW.q(abstractC2865Wr, "eventListener");
        this.f4855a = lx;
        this.b = c3048b3;
        this.c = ix;
        this.d = abstractC2865Wr;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:61:0x013b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0156  */
    public final KX a(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        C3834k00 c3834k00;
        C2329Ca c2329Ca;
        C4010m00 c4010m00;
        C2329Ca c2329CaB;
        List list;
        KX kx;
        C2329Ca c2329Ca2;
        C4010m00 c4010m01;
        Socket socketJ;
        while (!this.c.p) {
            KX kx2 = this.c.j;
            if (kx2 != null) {
                synchronized (kx2) {
                    try {
                        socketJ = (kx2.j || !b(kx2.b.f4578a.i)) ? this.c.j() : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.c.j == null) {
                    if (socketJ != null) {
                        Vg0.d(socketJ);
                    }
                    this.d.connectionReleased(this.c, kx2);
                    this.g = 0;
                    this.h = 0;
                    this.i = 0;
                    if (this.f4855a.a(this.b, this.c, null, false)) {
                        kx2 = this.c.j;
                        AbstractC2995aW.n(kx2);
                        this.d.connectionAcquired(this.c, kx2);
                    } else {
                        c3834k00 = this.j;
                        try {
                            if (c3834k00 != null) {
                                this.j = null;
                            } else {
                                c2329Ca = this.e;
                                if (c2329Ca == null && c2329Ca.g()) {
                                    C2329Ca c2329Ca3 = this.e;
                                    AbstractC2995aW.n(c2329Ca3);
                                    if (!c2329Ca3.g()) {
                                        throw new NoSuchElementException();
                                    }
                                    List list2 = (List) c2329Ca3.b;
                                    int i5 = c2329Ca3.f2927a;
                                    c2329Ca3.f2927a = i5 + 1;
                                    c3834k00 = (C3834k00) list2.get(i5);
                                } else {
                                    c4010m00 = this.f;
                                    if (c4010m00 == null) {
                                        C3048b3 c3048b3 = this.b;
                                        IX ix = this.c;
                                        c4010m00 = new C4010m00(c3048b3, ix.f3221a.D, ix, this.d);
                                        this.f = c4010m00;
                                    }
                                    c2329CaB = c4010m00.b();
                                    this.e = c2329CaB;
                                    list = (List) c2329CaB.b;
                                    if (!this.c.p) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.f4855a.a(this.b, this.c, list, false)) {
                                        kx2 = this.c.j;
                                        AbstractC2995aW.n(kx2);
                                        this.d.connectionAcquired(this.c, kx2);
                                    } else {
                                        if (c2329CaB.g()) {
                                            throw new NoSuchElementException();
                                        }
                                        List list3 = (List) c2329CaB.b;
                                        int i6 = c2329CaB.f2927a;
                                        c2329CaB.f2927a = i6 + 1;
                                        c3834k00 = (C3834k00) list3.get(i6);
                                        kx = new KX(this.f4855a, c3834k00);
                                        this.c.r = kx;
                                        kx.c(i, i2, i3, i4, z, this.c, this.d);
                                        this.c.r = null;
                                        this.c.f3221a.D.a(kx.b);
                                        if (this.f4855a.a(this.b, this.c, list, true)) {
                                            KX kx3 = this.c.j;
                                            AbstractC2995aW.n(kx3);
                                            this.j = c3834k00;
                                            Socket socket = kx.d;
                                            AbstractC2995aW.n(socket);
                                            Vg0.d(socket);
                                            this.d.connectionAcquired(this.c, kx3);
                                            kx2 = kx3;
                                        } else {
                                            synchronized (kx) {
                                                LX lx = this.f4855a;
                                                lx.getClass();
                                                byte[] bArr = Vg0.f3884a;
                                                lx.e.add(kx);
                                                lx.c.c(lx.d, 0L);
                                                this.c.b(kx);
                                            }
                                            this.d.connectionAcquired(this.c, kx);
                                            kx2 = kx;
                                        }
                                    }
                                }
                            }
                            kx.c(i, i2, i3, i4, z, this.c, this.d);
                            this.c.r = null;
                            this.c.f3221a.D.a(kx.b);
                            if (this.f4855a.a(this.b, this.c, list, true)) {
                                KX kx4 = this.c.j;
                                AbstractC2995aW.n(kx4);
                                this.j = c3834k00;
                                Socket socket2 = kx.d;
                                AbstractC2995aW.n(socket2);
                                Vg0.d(socket2);
                                this.d.connectionAcquired(this.c, kx4);
                                kx2 = kx4;
                            } else {
                                synchronized (kx) {
                                    LX lx2 = this.f4855a;
                                    lx2.getClass();
                                    byte[] bArr2 = Vg0.f3884a;
                                    lx2.e.add(kx);
                                    lx2.c.c(lx2.d, 0L);
                                    this.c.b(kx);
                                    this.d.connectionAcquired(this.c, kx);
                                    kx2 = kx;
                                }
                            }
                        } catch (Throwable th2) {
                            this.c.r = null;
                            throw th2;
                        }
                        list = null;
                        kx = new KX(this.f4855a, c3834k00);
                        this.c.r = kx;
                    }
                } else if (socketJ != null) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                this.g = 0;
                this.h = 0;
                this.i = 0;
                if (this.f4855a.a(this.b, this.c, null, false)) {
                    kx2 = this.c.j;
                    AbstractC2995aW.n(kx2);
                    this.d.connectionAcquired(this.c, kx2);
                } else {
                    c3834k00 = this.j;
                    if (c3834k00 != null) {
                        this.j = null;
                    } else {
                        c2329Ca = this.e;
                        if (c2329Ca == null) {
                        }
                        c4010m00 = this.f;
                        if (c4010m00 == null) {
                            C3048b3 c3048b4 = this.b;
                            IX ix2 = this.c;
                            c4010m00 = new C4010m00(c3048b4, ix2.f3221a.D, ix2, this.d);
                            this.f = c4010m00;
                        }
                        c2329CaB = c4010m00.b();
                        this.e = c2329CaB;
                        list = (List) c2329CaB.b;
                        if (!this.c.p) {
                            throw new IOException("Canceled");
                        }
                        if (this.f4855a.a(this.b, this.c, list, false)) {
                            kx2 = this.c.j;
                            AbstractC2995aW.n(kx2);
                            this.d.connectionAcquired(this.c, kx2);
                        } else {
                            if (c2329CaB.g()) {
                                throw new NoSuchElementException();
                            }
                            List list4 = (List) c2329CaB.b;
                            int i7 = c2329CaB.f2927a;
                            c2329CaB.f2927a = i7 + 1;
                            c3834k00 = (C3834k00) list4.get(i7);
                            kx = new KX(this.f4855a, c3834k00);
                            this.c.r = kx;
                            kx.c(i, i2, i3, i4, z, this.c, this.d);
                            this.c.r = null;
                            this.c.f3221a.D.a(kx.b);
                            if (this.f4855a.a(this.b, this.c, list, true)) {
                                KX kx5 = this.c.j;
                                AbstractC2995aW.n(kx5);
                                this.j = c3834k00;
                                Socket socket3 = kx.d;
                                AbstractC2995aW.n(socket3);
                                Vg0.d(socket3);
                                this.d.connectionAcquired(this.c, kx5);
                                kx2 = kx5;
                            } else {
                                synchronized (kx) {
                                    LX lx3 = this.f4855a;
                                    lx3.getClass();
                                    byte[] bArr3 = Vg0.f3884a;
                                    lx3.e.add(kx);
                                    lx3.c.c(lx3.d, 0L);
                                    this.c.b(kx);
                                    this.d.connectionAcquired(this.c, kx);
                                    kx2 = kx;
                                }
                            }
                        }
                    }
                    list = null;
                    kx = new KX(this.f4855a, c3834k00);
                    this.c.r = kx;
                    kx.c(i, i2, i3, i4, z, this.c, this.d);
                    this.c.r = null;
                    this.c.f3221a.D.a(kx.b);
                    if (this.f4855a.a(this.b, this.c, list, true)) {
                        KX kx6 = this.c.j;
                        AbstractC2995aW.n(kx6);
                        this.j = c3834k00;
                        Socket socket4 = kx.d;
                        AbstractC2995aW.n(socket4);
                        Vg0.d(socket4);
                        this.d.connectionAcquired(this.c, kx6);
                        kx2 = kx6;
                    } else {
                        synchronized (kx) {
                            LX lx4 = this.f4855a;
                            lx4.getClass();
                            byte[] bArr4 = Vg0.f3884a;
                            lx4.e.add(kx);
                            lx4.c.c(lx4.d, 0L);
                            this.c.b(kx);
                            this.d.connectionAcquired(this.c, kx);
                            kx2 = kx;
                        }
                    }
                }
            }
            if (kx2.j(z2)) {
                return kx2;
            }
            kx2.l();
            if (this.j == null && (c2329Ca2 = this.e) != null && !c2329Ca2.g() && (c4010m01 = this.f) != null && !c4010m01.a()) {
                throw new IOException("exhausted all routes");
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(ZA za) {
        AbstractC2995aW.q(za, "url");
        ZA za2 = this.b.i;
        return za.e == za2.e && AbstractC2995aW.i(za.d, za2.d);
    }

    public final void c(IOException iOException) {
        AbstractC2995aW.q(iOException, "e");
        this.j = null;
        if (iOException instanceof L90) {
            if (((L90) iOException).f3342a == EnumC2502Ir.REFUSED_STREAM) {
                this.g++;
                return;
            }
        }
        if (iOException instanceof C3809jj) {
            this.h++;
        } else {
            this.i++;
        }
    }
}
