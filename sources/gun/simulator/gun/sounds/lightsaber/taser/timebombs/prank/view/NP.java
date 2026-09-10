package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.Input;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class NP implements InterfaceC4177nt {
    public static final C2953a0 u = new C2953a0(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3456a;
    public final long b;
    public final JT c;
    public final C3219d0 d;
    public final C4884vx e;
    public final Wm0 f;
    public final C4262oq g;
    public InterfaceC4353pt h;
    public InterfaceC4326pd0 i;
    public InterfaceC4326pd0 j;
    public int k;
    public Metadata l;
    public long m;
    public long n;
    public long o;
    public int p;
    public S30 q;
    public boolean r;
    public boolean s;
    public long t;

    public NP() {
        this(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
    }

    public static long e(Metadata metadata) {
        if (metadata == null) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        int iF = metadata.f();
        for (int i = 0; i < iF; i++) {
            Metadata.Entry entryE = metadata.e(i);
            if (entryE instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entryE;
                if (textInformationFrame.id.equals("TLEN")) {
                    return Ug0.L(Long.parseLong((String) textInformationFrame.values.get(0)));
                }
            }
        }
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0353  */
    /* JADX WARN: Code duplicated, block: B:187:0x0409  */
    /* JADX WARN: Code duplicated, block: B:190:0x0411  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) throws KT {
        NP np;
        int i;
        int i2;
        InterfaceC4265ot interfaceC4265ot2;
        JT jt;
        int iC;
        int i3;
        int i4;
        int i5;
        int iF;
        S30 s30C;
        JT jt2;
        C4884vx c4884vx;
        int iW;
        C4884vx c4884vx2;
        CP cp;
        long jE;
        long j;
        C4884vx c4884vx3;
        JT jt3;
        int iT;
        FW.t(this.i);
        int i6 = Ug0.f3833a;
        int i7 = this.k;
        C3219d0 c3219d0 = this.d;
        if (i7 == 0) {
            try {
                g(interfaceC4265ot, false);
            } catch (EOFException unused) {
                np = this;
                i = -1;
                i2 = -1;
            }
        }
        S30 s30 = this.q;
        JT jt4 = this.c;
        if (s30 == null) {
            JT jt5 = new JT(c3219d0.c);
            interfaceC4265ot.peekFully(jt5.f3266a, 0, c3219d0.c);
            if ((c3219d0.f4253a & 1) != 0) {
                if (c3219d0.e != 1) {
                    i5 = 36;
                } else {
                    i5 = 21;
                }
            } else if (c3219d0.e != 1) {
                i5 = 21;
            } else {
                i5 = 13;
            }
            if (jt5.c >= i5 + 4) {
                jt5.E(i5);
                iF = jt5.f();
                if (iF != 1483304551 && iF != 1231971951) {
                    if (jt5.c >= 40) {
                        jt5.E(36);
                        if (jt5.f() == 1447187017) {
                            iF = 1447187017;
                        } else {
                            iF = 0;
                        }
                    } else {
                        iF = 0;
                    }
                }
            } else if (jt5.c >= 40) {
                jt5.E(36);
                if (jt5.f() == 1447187017) {
                    iF = 1447187017;
                } else {
                    iF = 0;
                }
            } else {
                iF = 0;
            }
            C4884vx c4884vx4 = this.e;
            long jC = -1;
            if (iF == 1483304551 || iF == 1231971951) {
                interfaceC4265ot2 = interfaceC4265ot;
                long length = interfaceC4265ot.getLength();
                long position = interfaceC4265ot.getPosition();
                int i8 = c3219d0.g;
                int i9 = c3219d0.d;
                int iF2 = jt5.f();
                if ((iF2 & 1) != 1 || (iW = jt5.w()) == 0) {
                    s30C = null;
                } else {
                    long jR = Ug0.R(iW, ((long) i8) * 1000000, i9);
                    if ((iF2 & 6) != 6) {
                        s30C = new C3729im0(position, c3219d0.c, jR, -1L, null);
                    } else {
                        long jU = jt5.u();
                        long[] jArr = new long[100];
                        for (int i10 = 0; i10 < 100; i10++) {
                            jArr[i10] = jt5.t();
                        }
                        if (length != -1 && length != position + jU) {
                            AbstractC4038mJ.f();
                        }
                        s30C = new C3729im0(position, c3219d0.c, jR, jU, jArr);
                    }
                }
                if (s30C != null) {
                    c4884vx = c4884vx4;
                    if (c4884vx.f5162a == -1 || c4884vx.b == -1) {
                        interfaceC4265ot.resetPeekPosition();
                        interfaceC4265ot2.advancePeekPosition(i5 + Input.Keys.F11);
                        jt2 = jt4;
                        interfaceC4265ot2.peekFully(jt2.f3266a, 0, 3);
                        jt2.E(0);
                        int iV = jt2.v();
                        int i11 = iV >> 12;
                        int i12 = iV & 4095;
                        if (i11 > 0 || i12 > 0) {
                            c4884vx.f5162a = i11;
                            c4884vx.b = i12;
                        }
                    } else {
                        jt2 = jt4;
                    }
                } else {
                    jt2 = jt4;
                    c4884vx = c4884vx4;
                }
                interfaceC4265ot2.skipFully(c3219d0.c);
                if (s30C == null || s30C.isSeekable() || iF != 1231971951) {
                    np = this;
                } else {
                    np = this;
                    s30C = np.c(interfaceC4265ot2, false);
                }
            } else if (iF == 1447187017) {
                long length2 = interfaceC4265ot.getLength();
                long position2 = interfaceC4265ot.getPosition();
                jt5.F(10);
                int iF3 = jt5.f();
                if (iF3 <= 0) {
                    c4884vx3 = c4884vx4;
                    jt3 = jt4;
                } else {
                    int i13 = c3219d0.d;
                    c4884vx3 = c4884vx4;
                    jt3 = jt4;
                    long jR2 = Ug0.R(iF3, ((long) (i13 >= 32000 ? 1152 : 576)) * 1000000, i13);
                    int iY = jt5.y();
                    int iY2 = jt5.y();
                    int iY3 = jt5.y();
                    jt5.F(2);
                    long j2 = position2 + ((long) c3219d0.c);
                    long[] jArr2 = new long[iY];
                    long[] jArr3 = new long[iY];
                    long j3 = position2;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= iY) {
                            long j4 = length2;
                            if (j4 != -1 && j4 != j3) {
                                AbstractC4038mJ.f();
                            }
                            s30C = new C3544gh0(jArr2, jArr3, jR2, j3);
                            break;
                        }
                        long j5 = length2;
                        jArr2[i14] = (((long) i14) * jR2) / ((long) iY);
                        jArr3[i14] = Math.max(j3, j2);
                        if (iY3 == 1) {
                            iT = jt5.t();
                        } else if (iY3 == 2) {
                            iT = jt5.y();
                        } else if (iY3 == 3) {
                            iT = jt5.v();
                        } else if (iY3 == 4) {
                            iT = jt5.w();
                        }
                        j3 += ((long) iT) * ((long) iY2);
                        i14++;
                        length2 = j5;
                    }
                    interfaceC4265ot2 = interfaceC4265ot;
                    interfaceC4265ot2.skipFully(c3219d0.c);
                    np = this;
                    jt2 = jt3;
                    c4884vx = c4884vx3;
                }
                s30C = null;
                interfaceC4265ot2 = interfaceC4265ot;
                interfaceC4265ot2.skipFully(c3219d0.c);
                np = this;
                jt2 = jt3;
                c4884vx = c4884vx3;
            } else {
                interfaceC4265ot2 = interfaceC4265ot;
                interfaceC4265ot.resetPeekPosition();
                np = this;
                jt2 = jt4;
                c4884vx = c4884vx4;
                s30C = null;
            }
            Metadata metadata = np.l;
            long position3 = interfaceC4265ot.getPosition();
            if (metadata == null) {
                c4884vx2 = c4884vx;
                jt = jt2;
                cp = null;
                break;
            }
            int iF4 = metadata.f();
            int i15 = 0;
            while (true) {
                if (i15 >= iF4) {
                    c4884vx2 = c4884vx;
                    jt = jt2;
                    cp = null;
                    break;
                }
                Metadata.Entry entryE = metadata.e(i15);
                if (entryE instanceof MlltFrame) {
                    MlltFrame mlltFrame = (MlltFrame) entryE;
                    long jE2 = e(metadata);
                    int length3 = mlltFrame.bytesDeviations.length;
                    int i16 = length3 + 1;
                    long[] jArr4 = new long[i16];
                    long[] jArr5 = new long[i16];
                    jArr4[0] = position3;
                    jArr5[0] = 0;
                    long j6 = position3;
                    int i17 = 1;
                    long j7 = 0;
                    while (i17 <= length3) {
                        int i18 = i17 - 1;
                        j6 += (long) (mlltFrame.bytesBetweenReference + mlltFrame.bytesDeviations[i18]);
                        j7 += (long) (mlltFrame.millisecondsBetweenReference + mlltFrame.millisecondsDeviations[i18]);
                        jArr4[i17] = j6;
                        jArr5[i17] = j7;
                        i17++;
                        length3 = length3;
                        jt2 = jt2;
                        c4884vx = c4884vx;
                    }
                    c4884vx2 = c4884vx;
                    jt = jt2;
                    cp = new CP(jArr4, jArr5, jE2);
                    break;
                }
                i15++;
            }
            boolean z = np.r;
            int i19 = np.f3456a;
            if (z) {
                s30C = new R30(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
            } else {
                if ((i19 & 4) != 0) {
                    if (cp != null) {
                        jE = cp.c;
                    } else {
                        if (s30C != null) {
                            long durationUs = s30C.getDurationUs();
                            jC = s30C.c();
                            j = durationUs;
                        } else {
                            jE = e(np.l);
                        }
                        s30C = new C3065bD(j, interfaceC4265ot.getPosition(), jC);
                    }
                    j = jE;
                    s30C = new C3065bD(j, interfaceC4265ot.getPosition(), jC);
                } else if (cp != null) {
                    s30C = cp;
                } else if (s30C == null) {
                    s30C = null;
                }
                if (s30C == null || (!s30C.isSeekable() && (i19 & 1) != 0)) {
                    s30C = np.c(interfaceC4265ot2, (i19 & 2) != 0);
                }
            }
            np.q = s30C;
            np.h.a(s30C);
            InterfaceC4326pd0 interfaceC4326pd0 = np.j;
            C4531rw c4531rw = new C4531rw();
            c4531rw.k = (String) c3219d0.b;
            c4531rw.l = 4096;
            c4531rw.x = c3219d0.e;
            c4531rw.y = c3219d0.d;
            C4884vx c4884vx5 = c4884vx2;
            c4531rw.A = c4884vx5.f5162a;
            c4531rw.B = c4884vx5.b;
            c4531rw.i = (i19 & 8) != 0 ? null : np.l;
            interfaceC4326pd0.e(new C4619sw(c4531rw));
            np.o = interfaceC4265ot.getPosition();
        } else {
            np = this;
            interfaceC4265ot2 = interfaceC4265ot;
            jt = jt4;
            if (np.o != 0) {
                long position4 = interfaceC4265ot.getPosition();
                long j8 = np.o;
                if (position4 < j8) {
                    interfaceC4265ot2.skipFully((int) (j8 - position4));
                }
            }
        }
        if (np.p == 0) {
            interfaceC4265ot.resetPeekPosition();
            if (f(interfaceC4265ot)) {
                i4 = -1;
            } else {
                JT jt6 = jt;
                jt6.E(0);
                int iF5 = jt6.f();
                if (((-128000) & iF5) != (((long) np.k) & (-128000)) || AbstractC4496rb.q(iF5) == -1) {
                    interfaceC4265ot2.skipFully(1);
                    np.k = 0;
                } else {
                    c3219d0.a(iF5);
                    if (np.m == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        np.m = np.q.getTimeUs(interfaceC4265ot.getPosition());
                        long j9 = np.b;
                        if (j9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            np.m = (j9 - np.q.getTimeUs(0L)) + np.m;
                        }
                    }
                    np.p = c3219d0.c;
                    S30 s31 = np.q;
                    if (s31 instanceof C3065bD) {
                        C3065bD c3065bD = (C3065bD) s31;
                        long j10 = (((np.n + ((long) c3219d0.g)) * 1000000) / ((long) c3219d0.d)) + np.m;
                        long position5 = interfaceC4265ot.getPosition() + ((long) c3219d0.c);
                        if (!c3065bD.a(j10)) {
                            c3065bD.b.a(j10);
                            c3065bD.c.a(position5);
                        }
                        if (np.s && c3065bD.a(np.t)) {
                            np.s = false;
                            np.j = np.i;
                        }
                    }
                    iC = np.j.c(interfaceC4265ot2, np.p, true);
                    if (iC == -1) {
                        i4 = -1;
                    } else {
                        i3 = np.p - iC;
                        np.p = i3;
                        if (i3 <= 0) {
                            np.j.a(((np.n * 1000000) / ((long) c3219d0.d)) + np.m, 1, c3219d0.c, 0, null);
                            np.n += (long) c3219d0.g;
                            np.p = 0;
                        }
                    }
                }
                i4 = 0;
            }
            i2 = i4;
            i = -1;
        } else {
            iC = np.j.c(interfaceC4265ot2, np.p, true);
            if (iC == -1) {
                i4 = -1;
            } else {
                i3 = np.p - iC;
                np.p = i3;
                if (i3 <= 0) {
                    np.j.a(((np.n * 1000000) / ((long) c3219d0.d)) + np.m, 1, c3219d0.c, 0, null);
                    np.n += (long) c3219d0.g;
                    np.p = 0;
                }
                i4 = 0;
            }
            i2 = i4;
            i = -1;
        }
        if (i2 == i) {
            S30 s32 = np.q;
            if (s32 instanceof C3065bD) {
                long j11 = ((np.n * 1000000) / ((long) c3219d0.d)) + np.m;
                if (s32.getDurationUs() != j11) {
                    S30 s33 = np.q;
                    ((C3065bD) s33).d = j11;
                    np.h.a(s33);
                }
            }
        }
        return i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) {
        return g(interfaceC4265ot, true);
    }

    public final C2364Dj c(InterfaceC4265ot interfaceC4265ot, boolean z) {
        JT jt = this.c;
        interfaceC4265ot.peekFully(jt.f3266a, 0, 4);
        jt.E(0);
        int iF = jt.f();
        C3219d0 c3219d0 = this.d;
        c3219d0.a(iF);
        return new C2364Dj(interfaceC4265ot.getLength(), interfaceC4265ot.getPosition(), c3219d0.f, c3219d0.c, z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        this.h = interfaceC4353pt;
        InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(0, 1);
        this.i = interfaceC4326pd0Track;
        this.j = interfaceC4326pd0Track;
        this.h.endTracks();
    }

    public final boolean f(InterfaceC4265ot interfaceC4265ot) {
        S30 s30 = this.q;
        if (s30 != null) {
            long jC = s30.c();
            if (jC != -1 && interfaceC4265ot.getPeekPosition() > jC - 4) {
                return true;
            }
        }
        try {
            return !interfaceC4265ot.peekFully(this.c.f3266a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean g(InterfaceC4265ot interfaceC4265ot, boolean z) throws KT, EOFException {
        int i;
        int peekPosition;
        int iQ;
        int i2 = z ? 32768 : 131072;
        interfaceC4265ot.resetPeekPosition();
        if (interfaceC4265ot.getPosition() == 0) {
            Metadata metadataE = this.f.E(interfaceC4265ot, (this.f3456a & 8) == 0 ? null : u);
            this.l = metadataE;
            if (metadataE != null) {
                this.e.b(metadataE);
            }
            peekPosition = (int) interfaceC4265ot.getPeekPosition();
            if (!z) {
                interfaceC4265ot.skipFully(peekPosition);
            }
            i = 0;
        } else {
            i = 0;
            peekPosition = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (f(interfaceC4265ot)) {
                if (i3 > 0) {
                    break;
                }
                throw new EOFException();
            }
            JT jt = this.c;
            jt.E(0);
            int iF = jt.f();
            if ((i == 0 || ((-128000) & iF) == (((long) i) & (-128000))) && (iQ = AbstractC4496rb.q(iF)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.d.a(iF);
                    i = iF;
                }
                interfaceC4265ot.advancePeekPosition(iQ - 4);
            } else {
                int i5 = i4 + 1;
                if (i4 == i2) {
                    if (z) {
                        return false;
                    }
                    throw KT.a("Searched too many bytes.", null);
                }
                if (z) {
                    interfaceC4265ot.resetPeekPosition();
                    interfaceC4265ot.advancePeekPosition(peekPosition + i5);
                } else {
                    interfaceC4265ot.skipFully(1);
                }
                i4 = i5;
                i = 0;
                i3 = 0;
            }
        }
        if (z) {
            interfaceC4265ot.skipFully(peekPosition + i4);
        } else {
            interfaceC4265ot.resetPeekPosition();
        }
        this.k = i;
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        this.k = 0;
        this.m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.n = 0L;
        this.p = 0;
        this.t = j2;
        S30 s30 = this.q;
        if (!(s30 instanceof C3065bD) || ((C3065bD) s30).a(j2)) {
            return;
        }
        this.s = true;
        this.j = this.g;
    }

    public NP(long j) {
        this.f3456a = 0;
        this.b = j;
        this.c = new JT(10);
        this.d = new C3219d0();
        this.e = new C4884vx();
        this.m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f = new Wm0(22);
        C4262oq c4262oq = new C4262oq();
        this.g = c4262oq;
        this.j = c4262oq;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }
}
