package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2342Cn implements InterfaceC4047mS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3959lS f2941a;
    public final long b;
    public final long c;
    public final K90 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public C2342Cn(K90 k90, long j, long j2, long j3, long j4, boolean z) {
        FW.h(j >= 0 && j2 > j);
        this.d = k90;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.f2941a = new C3959lS();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4047mS
    public final O30 createSeekMap() {
        if (this.f != 0) {
            return new C2316Bn(this);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4047mS
    public final long l(InterfaceC4265ot interfaceC4265ot) throws IOException {
        long jK;
        long j;
        int i = this.e;
        long j2 = this.c;
        C3959lS c3959lS = this.f2941a;
        if (i == 0) {
            long position = interfaceC4265ot.getPosition();
            this.g = position;
            this.e = 1;
            long j3 = j2 - 65307;
            if (j3 > position) {
                return j3;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.i == this.j) {
                    c3959lS = c3959lS;
                    j = -1;
                    jK = -1;
                } else {
                    long position2 = interfaceC4265ot.getPosition();
                    if (c3959lS.b(interfaceC4265ot, this.j)) {
                        c3959lS.a(interfaceC4265ot, false);
                        interfaceC4265ot.resetPeekPosition();
                        long j4 = this.h;
                        long j5 = c3959lS.b;
                        long j6 = j4 - j5;
                        int i2 = c3959lS.d + c3959lS.e;
                        if (0 > j6 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.j = position2;
                                this.l = j5;
                            } else {
                                this.i = interfaceC4265ot.getPosition() + ((long) i2);
                                this.k = c3959lS.b;
                            }
                            long j7 = this.j;
                            long j8 = this.i;
                            if (j7 - j8 < 100000) {
                                this.j = j8;
                                jK = j8;
                            } else {
                                long position3 = interfaceC4265ot.getPosition() - (((long) i2) * (j6 <= 0 ? 2L : 1L));
                                long j9 = this.j;
                                long j10 = this.i;
                                jK = Ug0.k((((j9 - j10) * j6) / (this.l - this.k)) + position3, j10, j9 - 1);
                            }
                            j = -1;
                        } else {
                            c3959lS = c3959lS;
                            j = -1;
                            jK = -1;
                        }
                    } else {
                        long j11 = this.i;
                        if (j11 == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        jK = j11;
                    }
                    j = -1;
                }
                if (jK != j) {
                    return jK;
                }
                this.e = 3;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j = -1;
                c3959lS = c3959lS;
            }
            C3959lS c3959lS2 = c3959lS;
            while (true) {
                c3959lS2.b(interfaceC4265ot, j);
                c3959lS2.a(interfaceC4265ot, false);
                if (c3959lS2.b > this.h) {
                    interfaceC4265ot.resetPeekPosition();
                    this.e = 4;
                    return -(this.k + 2);
                }
                interfaceC4265ot.skipFully(c3959lS2.d + c3959lS2.e);
                this.i = interfaceC4265ot.getPosition();
                this.k = c3959lS2.b;
                j = -1;
            }
        }
        c3959lS.f4646a = 0;
        c3959lS.b = 0L;
        c3959lS.c = 0;
        c3959lS.d = 0;
        c3959lS.e = 0;
        if (!c3959lS.b(interfaceC4265ot, -1L)) {
            throw new EOFException();
        }
        c3959lS.a(interfaceC4265ot, false);
        interfaceC4265ot.skipFully(c3959lS.d + c3959lS.e);
        long j12 = c3959lS.b;
        while ((c3959lS.f4646a & 4) != 4 && c3959lS.b(interfaceC4265ot, -1L) && interfaceC4265ot.getPosition() < j2 && c3959lS.a(interfaceC4265ot, true)) {
            try {
                interfaceC4265ot.skipFully(c3959lS.d + c3959lS.e);
                j12 = c3959lS.b;
            } catch (EOFException unused) {
            }
        }
        this.f = j12;
        this.e = 4;
        return this.g;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4047mS
    public final void startSeek(long j) {
        this.h = Ug0.k(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}
