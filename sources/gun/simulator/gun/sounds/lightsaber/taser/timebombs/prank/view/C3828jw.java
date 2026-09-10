package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3828jw implements InterfaceC4177nt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JT f4576a = new JT(4);
    public final JT b = new JT(9);
    public final JT c = new JT(11);
    public final JT d = new JT();
    public final C4192o30 e;
    public InterfaceC4353pt f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public C4814v7 o;
    public Jh0 p;

    public C3828jw() {
        C4192o30 c4192o30 = new C4192o30(new C4262oq(), 4);
        c4192o30.c = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        c4192o30.d = new long[0];
        c4192o30.e = new long[0];
        this.e = c4192o30;
        this.g = 1;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:86:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0009 A[SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) throws KT {
        long j;
        boolean zJ;
        boolean z;
        long j2;
        FW.t(this.f);
        while (true) {
            int i = this.g;
            if (i == 1) {
                JT jt = this.b;
                if (!interfaceC4265ot.readFully(jt.f3266a, 0, 9, true)) {
                    return -1;
                }
                jt.E(0);
                jt.F(4);
                int iT = jt.t();
                boolean z2 = (iT & 4) != 0;
                boolean z3 = (iT & 1) != 0;
                if (z2 && this.o == null) {
                    this.o = new C4814v7(this.f.track(8, 1), 4);
                }
                if (z3 && this.p == null) {
                    this.p = new Jh0(this.f.track(9, 2));
                }
                this.f.endTracks();
                this.j = jt.f() - 5;
                this.g = 2;
            } else if (i == 2) {
                interfaceC4265ot.skipFully(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i == 3) {
                JT jt2 = this.c;
                if (!interfaceC4265ot.readFully(jt2.f3266a, 0, 11, true)) {
                    return -1;
                }
                jt2.E(0);
                this.k = jt2.t();
                this.l = jt2.v();
                this.m = jt2.v();
                this.m = (((long) (jt2.t() << 24)) | this.m) * 1000;
                jt2.F(3);
                this.g = 4;
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                boolean z4 = this.h;
                C4192o30 c4192o30 = this.e;
                if (z4) {
                    j = this.i + this.m;
                } else {
                    j = c4192o30.c == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? 0L : this.m;
                }
                int i2 = this.k;
                if (i2 != 8 || this.o == null) {
                    if (i2 != 9 || this.p == null) {
                        if (i2 != 18 || this.n) {
                            interfaceC4265ot.skipFully(this.l);
                            zJ = false;
                            z = false;
                        } else {
                            JT jtC = c(interfaceC4265ot);
                            c4192o30.getClass();
                            c4192o30.i(j, jtC);
                            long j3 = c4192o30.c;
                            if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                this.f.a(new C2976aD(c4192o30.e, c4192o30.d, j3));
                                this.n = true;
                            }
                        }
                        if (!this.h && zJ) {
                            this.h = true;
                            if (c4192o30.c == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                j2 = -this.m;
                            } else {
                                j2 = 0;
                            }
                            this.i = j2;
                        }
                        this.j = 4;
                        this.g = 2;
                        if (z) {
                            return 0;
                        }
                    } else {
                        if (!this.n) {
                            this.f.a(new C2946Zu(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
                            this.n = true;
                        }
                        Jh0 jh0 = this.p;
                        JT jtC2 = c(interfaceC4265ot);
                        if (jh0.i(jtC2) && jh0.j(j, jtC2)) {
                            zJ = true;
                        }
                    }
                    zJ = false;
                } else {
                    if (!this.n) {
                        this.f.a(new C2946Zu(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
                        this.n = true;
                    }
                    C4814v7 c4814v7 = this.o;
                    JT jtC3 = c(interfaceC4265ot);
                    c4814v7.i(jtC3);
                    zJ = c4814v7.j(j, jtC3);
                }
                z = true;
                if (!this.h) {
                    this.h = true;
                    if (c4192o30.c == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        j2 = -this.m;
                    } else {
                        j2 = 0;
                    }
                    this.i = j2;
                }
                this.j = 4;
                this.g = 2;
                if (z) {
                    return 0;
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) throws EOFException, InterruptedIOException {
        JT jt = this.f4576a;
        C2938Zm c2938Zm = (C2938Zm) interfaceC4265ot;
        c2938Zm.peekFully(jt.f3266a, 0, 3, false);
        jt.E(0);
        if (jt.v() != 4607062) {
            return false;
        }
        c2938Zm.peekFully(jt.f3266a, 0, 2, false);
        jt.E(0);
        if ((jt.y() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        c2938Zm.peekFully(jt.f3266a, 0, 4, false);
        jt.E(0);
        int iF = jt.f();
        c2938Zm.f = 0;
        c2938Zm.advancePeekPosition(iF, false);
        c2938Zm.peekFully(jt.f3266a, 0, 4, false);
        jt.E(0);
        return jt.f() == 0;
    }

    public final JT c(InterfaceC4265ot interfaceC4265ot) {
        int i = this.l;
        JT jt = this.d;
        byte[] bArr = jt.f3266a;
        if (i > bArr.length) {
            jt.C(new byte[Math.max(bArr.length * 2, i)], 0);
        } else {
            jt.E(0);
        }
        jt.D(this.l);
        interfaceC4265ot.readFully(jt.f3266a, 0, this.l);
        return jt;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        this.f = interfaceC4353pt;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }
}
