package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.u8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4728u8 implements InterfaceC4177nt {
    public int c;
    public C4816v8 e;
    public long h;
    public C2670Pe i;
    public int m;
    public boolean n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JT f5067a = new JT(12);
    public final C4640t8 b = new C4640t8();
    public InterfaceC4353pt d = new C3336eJ(0);
    public C2670Pe[] g = new C2670Pe[0];
    public long k = -1;
    public long l = -1;
    public int j = -1;
    public long f = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    /* JADX WARN: Code duplicated, block: B:157:0x0382  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:62:0x010f  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) throws KT {
        boolean z;
        C2670Pe c2670Pe;
        long j;
        C2670Pe c2670Pe2;
        int i;
        if (this.h != -1) {
            long position = interfaceC4265ot.getPosition();
            long j2 = this.h;
            if (j2 < position || j2 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + position) {
                c2868Wu.b = j2;
                z = true;
            } else {
                interfaceC4265ot.skipFully((int) (j2 - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.h = -1L;
        if (z) {
            return 1;
        }
        int i2 = this.c;
        C2670Pe c2670Pe3 = null;
        C4640t8 c4640t8 = this.b;
        JT jt = this.f5067a;
        switch (i2) {
            case 0:
                if (!b(interfaceC4265ot)) {
                    throw KT.a("AVI Header List not found", null);
                }
                interfaceC4265ot.skipFully(12);
                this.c = 1;
                return 0;
            case 1:
                interfaceC4265ot.readFully(jt.f3266a, 0, 12);
                jt.E(0);
                c4640t8.getClass();
                c4640t8.f5019a = jt.h();
                c4640t8.b = jt.h();
                c4640t8.c = 0;
                if (c4640t8.f5019a != 1414744396) {
                    throw KT.a("LIST expected, found: " + c4640t8.f5019a, null);
                }
                int iH = jt.h();
                c4640t8.c = iH;
                if (iH == 1819436136) {
                    this.j = c4640t8.b;
                    this.c = 2;
                    return 0;
                }
                throw KT.a("hdrl expected, found: " + c4640t8.c, null);
            case 2:
                int i3 = this.j - 4;
                JT jt2 = new JT(i3);
                interfaceC4265ot.readFully(jt2.f3266a, 0, i3);
                C5004xI c5004xIB = C5004xI.b(1819436136, jt2);
                int i4 = c5004xIB.b;
                if (i4 != 1819436136) {
                    throw KT.a("Unexpected header list type " + i4, null);
                }
                C4816v8 c4816v8 = (C4816v8) c5004xIB.a(C4816v8.class);
                if (c4816v8 == null) {
                    throw KT.a("AviHeader not found", null);
                }
                this.e = c4816v8;
                this.f = ((long) c4816v8.c) * ((long) c4816v8.f5121a);
                ArrayList arrayList = new ArrayList();
                C5086yC c5086yCListIterator = c5004xIB.f5216a.listIterator(0);
                int i5 = 0;
                while (c5086yCListIterator.hasNext()) {
                    InterfaceC4552s8 interfaceC4552s8 = (InterfaceC4552s8) c5086yCListIterator.next();
                    if (interfaceC4552s8.getType() == 1819440243) {
                        C5004xI c5004xI = (C5004xI) interfaceC4552s8;
                        int i6 = i5 + 1;
                        C4904w8 c4904w8 = (C4904w8) c5004xI.a(C4904w8.class);
                        G90 g90 = (G90) c5004xI.a(G90.class);
                        if (c4904w8 == null || g90 == null) {
                            AbstractC4038mJ.f();
                        } else {
                            long jR = Ug0.R(c4904w8.d, ((long) c4904w8.b) * 1000000, c4904w8.c);
                            C4619sw c4619sw = g90.f3109a;
                            C4531rw c4531rwA = c4619sw.a();
                            c4531rwA.f4954a = Integer.toString(i5);
                            int i7 = c4904w8.e;
                            if (i7 != 0) {
                                c4531rwA.l = i7;
                            }
                            J90 j90 = (J90) c5004xI.a(J90.class);
                            if (j90 != null) {
                                c4531rwA.b = j90.f3257a;
                            }
                            int i8 = AbstractC5011xP.i(c4619sw.l);
                            if (i8 == 1 || i8 == 2) {
                                InterfaceC4326pd0 interfaceC4326pd0Track = this.d.track(i5, i8);
                                interfaceC4326pd0Track.e(new C4619sw(c4531rwA));
                                c2670Pe = new C2670Pe(i5, i8, jR, c4904w8.d, interfaceC4326pd0Track);
                                this.f = jR;
                            }
                            if (c2670Pe != null) {
                                arrayList.add(c2670Pe);
                            }
                            i5 = i6;
                        }
                        c2670Pe = null;
                        if (c2670Pe != null) {
                            arrayList.add(c2670Pe);
                        }
                        i5 = i6;
                    }
                }
                this.g = (C2670Pe[]) arrayList.toArray(new C2670Pe[0]);
                this.d.endTracks();
                this.c = 3;
                return 0;
            case 3:
                if (this.k != -1) {
                    long position2 = interfaceC4265ot.getPosition();
                    long j3 = this.k;
                    if (position2 != j3) {
                        this.h = j3;
                        return 0;
                    }
                }
                interfaceC4265ot.peekFully(jt.f3266a, 0, 12);
                interfaceC4265ot.resetPeekPosition();
                jt.E(0);
                c4640t8.getClass();
                c4640t8.f5019a = jt.h();
                c4640t8.b = jt.h();
                c4640t8.c = 0;
                int iH2 = jt.h();
                int i9 = c4640t8.f5019a;
                if (i9 == 1179011410) {
                    interfaceC4265ot.skipFully(12);
                    return 0;
                }
                if (i9 != 1414744396 || iH2 != 1769369453) {
                    this.h = interfaceC4265ot.getPosition() + ((long) c4640t8.b) + 8;
                    return 0;
                }
                long position3 = interfaceC4265ot.getPosition();
                this.k = position3;
                this.l = position3 + ((long) c4640t8.b) + 8;
                if (!this.n) {
                    C4816v8 c4816v9 = this.e;
                    c4816v9.getClass();
                    if ((c4816v9.b & 16) == 16) {
                        this.c = 4;
                        this.h = this.l;
                        return 0;
                    }
                    this.d.a(new C2946Zu(this.f));
                    this.n = true;
                }
                this.h = interfaceC4265ot.getPosition() + 12;
                this.c = 6;
                return 0;
            case 4:
                interfaceC4265ot.readFully(jt.f3266a, 0, 8);
                jt.E(0);
                int iH3 = jt.h();
                int iH4 = jt.h();
                if (iH3 != 829973609) {
                    this.h = interfaceC4265ot.getPosition() + ((long) iH4);
                    return 0;
                }
                this.c = 5;
                this.m = iH4;
                return 0;
            case 5:
                JT jt3 = new JT(this.m);
                interfaceC4265ot.readFully(jt3.f3266a, 0, this.m);
                if (jt3.a() < 16) {
                    j = 0;
                } else {
                    int i10 = jt3.b;
                    jt3.F(8);
                    long jH = jt3.h();
                    long j4 = this.k;
                    j = jH > j4 ? 0L : j4 + 8;
                    jt3.E(i10);
                }
                while (jt3.a() >= 16) {
                    int iH5 = jt3.h();
                    int iH6 = jt3.h();
                    long jH2 = ((long) jt3.h()) + j;
                    jt3.h();
                    C2670Pe[] c2670PeArr = this.g;
                    int length = c2670PeArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            C2670Pe c2670Pe4 = c2670PeArr[i11];
                            if (c2670Pe4.b == iH5 || c2670Pe4.c == iH5) {
                                c2670Pe2 = c2670Pe4;
                            } else {
                                i11++;
                            }
                        } else {
                            c2670Pe2 = null;
                        }
                    }
                    if (c2670Pe2 != null) {
                        if ((iH6 & 16) == 16) {
                            if (c2670Pe2.j == c2670Pe2.l.length) {
                                long[] jArr = c2670Pe2.k;
                                c2670Pe2.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = c2670Pe2.l;
                                c2670Pe2.l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = c2670Pe2.k;
                            int i12 = c2670Pe2.j;
                            jArr2[i12] = jH2;
                            c2670Pe2.l[i12] = c2670Pe2.i;
                            i = 1;
                            c2670Pe2.j = i12 + 1;
                        } else {
                            i = 1;
                        }
                        c2670Pe2.i += i;
                    }
                }
                for (C2670Pe c2670Pe5 : this.g) {
                    c2670Pe5.k = Arrays.copyOf(c2670Pe5.k, c2670Pe5.j);
                    c2670Pe5.l = Arrays.copyOf(c2670Pe5.l, c2670Pe5.j);
                }
                this.n = true;
                this.d.a(new C2946Zu(this, this.f, 2));
                this.c = 6;
                this.h = this.k;
                return 0;
            case 6:
                if (interfaceC4265ot.getPosition() >= this.l) {
                    return -1;
                }
                C2670Pe c2670Pe6 = this.i;
                if (c2670Pe6 != null) {
                    int i13 = c2670Pe6.g;
                    int iC = i13 - c2670Pe6.f3561a.c(interfaceC4265ot, i13, false);
                    c2670Pe6.g = iC;
                    boolean z2 = iC == 0;
                    if (z2) {
                        if (c2670Pe6.f > 0) {
                            int i14 = c2670Pe6.h;
                            c2670Pe6.f3561a.a((c2670Pe6.d * ((long) i14)) / ((long) c2670Pe6.e), Arrays.binarySearch(c2670Pe6.l, i14) >= 0 ? 1 : 0, c2670Pe6.f, 0, null);
                        }
                        c2670Pe6.h++;
                    }
                    if (!z2) {
                        return 0;
                    }
                    this.i = null;
                    return 0;
                }
                if ((interfaceC4265ot.getPosition() & 1) == 1) {
                    interfaceC4265ot.skipFully(1);
                }
                interfaceC4265ot.peekFully(jt.f3266a, 0, 12);
                jt.E(0);
                int iH7 = jt.h();
                if (iH7 == 1414744396) {
                    jt.E(8);
                    interfaceC4265ot.skipFully(jt.h() == 1769369453 ? 12 : 8);
                    interfaceC4265ot.resetPeekPosition();
                    return 0;
                }
                int iH8 = jt.h();
                if (iH7 == 1263424842) {
                    this.h = interfaceC4265ot.getPosition() + ((long) iH8) + 8;
                    return 0;
                }
                interfaceC4265ot.skipFully(8);
                interfaceC4265ot.resetPeekPosition();
                for (C2670Pe c2670Pe7 : this.g) {
                    if (c2670Pe7.b == iH7 || c2670Pe7.c == iH7) {
                        c2670Pe3 = c2670Pe7;
                        if (c2670Pe3 == null) {
                            this.h = interfaceC4265ot.getPosition() + ((long) iH8);
                            return 0;
                        }
                        c2670Pe3.f = iH8;
                        c2670Pe3.g = iH8;
                        this.i = c2670Pe3;
                        return 0;
                    }
                }
                if (c2670Pe3 == null) {
                    this.h = interfaceC4265ot.getPosition() + ((long) iH8);
                    return 0;
                }
                c2670Pe3.f = iH8;
                c2670Pe3.g = iH8;
                this.i = c2670Pe3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) {
        JT jt = this.f5067a;
        interfaceC4265ot.peekFully(jt.f3266a, 0, 12);
        jt.E(0);
        if (jt.h() != 1179011410) {
            return false;
        }
        jt.F(4);
        return jt.h() == 541677121;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        this.c = 0;
        this.d = interfaceC4353pt;
        this.h = -1L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        this.h = -1L;
        this.i = null;
        for (C2670Pe c2670Pe : this.g) {
            if (c2670Pe.j == 0) {
                c2670Pe.h = 0;
            } else {
                c2670Pe.h = c2670Pe.l[Ug0.f(c2670Pe.k, j, true)];
            }
        }
        if (j != 0) {
            this.c = 6;
        } else if (this.g.length == 0) {
            this.c = 0;
        } else {
            this.c = 3;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }
}
