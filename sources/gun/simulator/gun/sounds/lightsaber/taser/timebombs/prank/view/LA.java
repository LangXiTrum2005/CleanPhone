package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class LA implements InterfaceC3588h80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3343a;
    public boolean b;
    public final C4848vb c;
    public final C4848vb d;
    public boolean e;
    public final /* synthetic */ MA f;

    public LA(MA ma, long j, boolean z) {
        AbstractC2995aW.q(ma, "this$0");
        this.f = ma;
        this.f3343a = j;
        this.b = z;
        this.c = new C4848vb();
        this.d = new C4848vb();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        MA ma = this.f;
        synchronized (ma) {
            this.e = true;
            C4848vb c4848vb = this.d;
            j = c4848vb.b;
            c4848vb.skip(j);
            ma.notifyAll();
        }
        if (j > 0) {
            f(j);
        }
        this.f.a();
    }

    public final void f(long j) {
        byte[] bArr = Vg0.f3884a;
        this.f.b.i(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final long read(C4848vb c4848vb, long j) throws Throwable {
        Throwable l90;
        boolean z;
        long j2;
        AbstractC2995aW.q(c4848vb, "sink");
        long j3 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "byteCount < 0: ").toString());
        }
        while (true) {
            MA ma = this.f;
            synchronized (ma) {
                ma.k.h();
                try {
                    if (ma.f() != null) {
                        l90 = ma.n;
                        if (l90 == null) {
                            EnumC2502Ir enumC2502IrF = ma.f();
                            AbstractC2995aW.n(enumC2502IrF);
                            l90 = new L90(enumC2502IrF);
                        }
                    } else {
                        l90 = null;
                    }
                    if (this.e) {
                        throw new IOException("stream closed");
                    }
                    C4848vb c4848vb2 = this.d;
                    long j4 = c4848vb2.b;
                    z = false;
                    if (j4 > j3) {
                        j2 = c4848vb2.read(c4848vb, Math.min(j, j4));
                        long j5 = ma.c + j2;
                        ma.c = j5;
                        long j6 = j5 - ma.d;
                        if (l90 == null && j6 >= ma.b.r.a() / 2) {
                            ma.b.n(ma.f3396a, j6);
                            ma.d = ma.c;
                        }
                    } else {
                        if (!this.b && l90 == null) {
                            ma.l();
                            z = true;
                        }
                        j2 = -1;
                    }
                    ma.k.l();
                } catch (Throwable th) {
                    ma.k.l();
                    throw th;
                }
                throw th;
            }
            if (!z) {
                if (j2 != -1) {
                    f(j2);
                    return j2;
                }
                if (l90 == null) {
                    return -1L;
                }
                throw l90;
            }
            j3 = 0;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final Ic0 timeout() {
        return this.f.k;
    }
}
