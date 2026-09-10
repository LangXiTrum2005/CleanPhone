package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.EOFException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3959lS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4646a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final JT g = new JT(255);

    public final boolean a(InterfaceC4265ot interfaceC4265ot, boolean z) throws KT, EOFException {
        this.f4646a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        JT jt = this.g;
        jt.B(27);
        try {
            if (interfaceC4265ot.peekFully(jt.f3266a, 0, 27, z) && jt.u() == 1332176723) {
                if (jt.t() != 0) {
                    if (z) {
                        return false;
                    }
                    throw KT.c("unsupported bit stream revision");
                }
                this.f4646a = jt.t();
                this.b = jt.i();
                jt.k();
                jt.k();
                jt.k();
                int iT = jt.t();
                this.c = iT;
                this.d = iT + 27;
                jt.B(iT);
                try {
                    if (interfaceC4265ot.peekFully(jt.f3266a, 0, this.c, z)) {
                        for (int i = 0; i < this.c; i++) {
                            int iT2 = jt.t();
                            this.f[i] = iT2;
                            this.e += iT2;
                        }
                        return true;
                    }
                } catch (EOFException e) {
                    if (!z) {
                        throw e;
                    }
                }
                return false;
            }
        } catch (EOFException e2) {
            if (!z) {
                throw e2;
            }
        }
        return false;
    }

    public final boolean b(InterfaceC4265ot interfaceC4265ot, long j) {
        FW.h(interfaceC4265ot.getPosition() == interfaceC4265ot.getPeekPosition());
        JT jt = this.g;
        jt.B(4);
        while (true) {
            if (j != -1 && interfaceC4265ot.getPosition() + 4 >= j) {
                break;
            }
            try {
                if (!interfaceC4265ot.peekFully(jt.f3266a, 0, 4, true)) {
                    break;
                }
                jt.E(0);
                if (jt.u() == 1332176723) {
                    interfaceC4265ot.resetPeekPosition();
                    return true;
                }
                interfaceC4265ot.skipFully(1);
            } catch (EOFException unused) {
            }
        }
        do {
            if (j != -1 && interfaceC4265ot.getPosition() >= j) {
                break;
            }
        } while (interfaceC4265ot.skip(1) != -1);
        return false;
    }
}
