package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class J3 implements InterfaceC4177nt {
    public final JT d;
    public final Uh0 e;
    public InterfaceC4353pt f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3251a = 0;
    public final K3 b = new K3(true, null);
    public final JT c = new JT(2048);
    public int i = -1;
    public long h = -1;

    public J3() {
        JT jt = new JT(10);
        this.d = jt;
        this.e = new Uh0(jt.f3266a, 2, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) throws KT {
        int i;
        boolean z;
        FW.t(this.f);
        long length = interfaceC4265ot.getLength();
        int i2 = this.f3251a;
        int i3 = i2 & 2;
        int i4 = 4;
        if (i3 == 0 && ((i2 & 1) == 0 || length == -1)) {
            i = -1;
        } else {
            Uh0 uh0 = this.e;
            JT jt = this.d;
            if (this.j) {
                i = -1;
            } else {
                this.i = -1;
                interfaceC4265ot.resetPeekPosition();
                long j = 0;
                if (interfaceC4265ot.getPosition() == 0) {
                    c(interfaceC4265ot);
                }
                int i5 = 0;
                while (interfaceC4265ot.peekFully(jt.f3266a, 0, 2, true)) {
                    try {
                        jt.E(0);
                        if ((jt.y() & 65526) != 65520) {
                            i5 = 0;
                            break;
                        }
                        if (!interfaceC4265ot.peekFully(jt.f3266a, 0, i4, true)) {
                            break;
                        }
                        uh0.p(14);
                        int i6 = uh0.i(13);
                        if (i6 <= 6) {
                            this.j = true;
                            throw KT.a("Malformed ADTS stream", null);
                        }
                        j += (long) i6;
                        i5++;
                        if (i5 == 1000 || !interfaceC4265ot.advancePeekPosition(i6 - 6, true)) {
                            break;
                            break;
                        }
                        i4 = 4;
                    } catch (EOFException unused) {
                    }
                }
                interfaceC4265ot.resetPeekPosition();
                if (i5 > 0) {
                    this.i = (int) (j / ((long) i5));
                    i = -1;
                } else {
                    i = -1;
                    this.i = -1;
                }
                this.j = true;
            }
        }
        JT jt2 = this.c;
        int i7 = interfaceC4265ot.read(jt2.f3266a, 0, 2048);
        boolean z2 = i7 == i;
        boolean z3 = this.l;
        K3 k3 = this.b;
        if (z3) {
            z = true;
        } else {
            boolean z4 = (i2 & 1) != 0 && this.i > 0;
            if (z4 && k3.q == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && !z2) {
                z = true;
            } else {
                if (z4) {
                    long j2 = k3.q;
                    if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        InterfaceC4353pt interfaceC4353pt = this.f;
                        boolean z5 = i3 != 0;
                        int i8 = this.i;
                        interfaceC4353pt.a(new C2338Cj(length, this.h, (int) ((((long) i8) * 8000000) / j2), i8, z5));
                    } else {
                        this.f.a(new C2946Zu(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
                    }
                } else {
                    this.f.a(new C2946Zu(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
                }
                z = true;
                this.l = true;
            }
        }
        if (z2) {
            return -1;
        }
        jt2.E(0);
        jt2.D(i7);
        if (!this.k) {
            k3.b(4, this.g);
            this.k = z;
        }
        k3.a(jt2);
        return 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) throws EOFException, InterruptedIOException {
        int iC = c(interfaceC4265ot);
        int i = iC;
        int i2 = 0;
        int i3 = 0;
        do {
            JT jt = this.d;
            C2938Zm c2938Zm = (C2938Zm) interfaceC4265ot;
            c2938Zm.peekFully(jt.f3266a, 0, 2, false);
            jt.E(0);
            if ((jt.y() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                c2938Zm.peekFully(jt.f3266a, 0, 4, false);
                Uh0 uh0 = this.e;
                uh0.p(14);
                int i4 = uh0.i(13);
                if (i4 <= 6) {
                    i++;
                    c2938Zm.f = 0;
                    c2938Zm.advancePeekPosition(i, false);
                } else {
                    c2938Zm.advancePeekPosition(i4 - 6, false);
                    i3 += i4;
                }
            } else {
                i++;
                c2938Zm.f = 0;
                c2938Zm.advancePeekPosition(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iC < 8192);
        return false;
    }

    public final int c(InterfaceC4265ot interfaceC4265ot) {
        int i = 0;
        while (true) {
            JT jt = this.d;
            interfaceC4265ot.peekFully(jt.f3266a, 0, 10);
            jt.E(0);
            if (jt.v() != 4801587) {
                break;
            }
            jt.F(3);
            int iS = jt.s();
            i += iS + 10;
            interfaceC4265ot.advancePeekPosition(iS);
        }
        interfaceC4265ot.resetPeekPosition();
        interfaceC4265ot.advancePeekPosition(i);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        this.f = interfaceC4353pt;
        this.b.c(interfaceC4353pt, new C4416qe0(0, 1));
        interfaceC4353pt.endTracks();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        this.k = false;
        this.b.seek();
        this.g = j2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }
}
