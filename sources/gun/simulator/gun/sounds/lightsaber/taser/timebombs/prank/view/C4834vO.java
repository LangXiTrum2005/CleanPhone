package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Pair;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4834vO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ec0 f5127a = new Ec0();
    public final Fc0 b = new Fc0();
    public final InterfaceC3050b4 c;
    public final InterfaceC3481fz d;
    public long e;
    public int f;
    public boolean g;
    public C4482rO h;
    public C4482rO i;
    public C4482rO j;
    public int k;
    public Object l;
    public long m;

    public C4834vO(InterfaceC3050b4 interfaceC3050b4, Qa0 qa0) {
        this.c = interfaceC3050b4;
        this.d = qa0;
    }

    public static C5186zO l(Gc0 gc0, Object obj, long j, long j2, Fc0 fc0, Ec0 ec0) {
        gc0.h(obj, ec0);
        gc0.o(ec0.c, fc0);
        int iB = gc0.b(obj);
        Object obj2 = obj;
        while (ec0.d == 0) {
            C2 c2 = ec0.g;
            if (c2.b <= 0 || !ec0.h(c2.e) || ec0.c(0L) != -1) {
                break;
            }
            int i = iB + 1;
            if (iB >= fc0.p) {
                break;
            }
            gc0.g(i, ec0, true);
            obj2 = ec0.b;
            obj2.getClass();
            iB = i;
        }
        gc0.h(obj2, ec0);
        int iC = ec0.c(j);
        return iC == -1 ? new C5186zO(obj2, j2, ec0.b(j)) : new C5186zO(obj2, iC, ec0.f(iC), j2, -1);
    }

    public final C4482rO a() {
        C4482rO c4482rO = this.h;
        if (c4482rO == null) {
            return null;
        }
        if (c4482rO == this.i) {
            this.i = c4482rO.l;
        }
        c4482rO.f();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            C4482rO c4482rO2 = this.h;
            this.l = c4482rO2.b;
            this.m = c4482rO2.f.f5033a.d;
        }
        this.h = this.h.l;
        j();
        return this.h;
    }

    public final void b() {
        if (this.k == 0) {
            return;
        }
        C4482rO c4482rO = this.h;
        FW.t(c4482rO);
        this.l = c4482rO.b;
        this.m = c4482rO.f.f5033a.d;
        while (c4482rO != null) {
            c4482rO.f();
            c4482rO = c4482rO.l;
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        j();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e2  */
    public final C4658tO c(Gc0 gc0, C4482rO c4482rO, long j) {
        boolean z;
        long jLongValue;
        C5186zO c5186zO;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        C4658tO c4658tO = c4482rO.f;
        long j8 = (c4482rO.o + c4658tO.e) - j;
        Ec0 ec0 = this.f5127a;
        boolean z2 = c4658tO.g;
        long j9 = c4658tO.c;
        C5186zO c5186zO2 = c4658tO.f5033a;
        if (!z2) {
            gc0.h(c5186zO2.f4977a, ec0);
            boolean zA = c5186zO2.a();
            Object obj = c5186zO2.f4977a;
            if (!zA) {
                int i = c5186zO2.e;
                int iF = ec0.f(i);
                z = ec0.h(i) && ec0.e(i, iF) == 3;
                if (iF != ec0.g.a(i).b && !z) {
                    return e(gc0, c5186zO2.f4977a, c5186zO2.e, iF, c4658tO.e, c5186zO2.d);
                }
                gc0.h(obj, ec0);
                long jD = ec0.d(i);
                return f(gc0, c5186zO2.f4977a, jD == Long.MIN_VALUE ? ec0.d : jD + ec0.g.a(i).g, c4658tO.e, c5186zO2.d);
            }
            C2 c2 = ec0.g;
            int i2 = c5186zO2.b;
            int i3 = c2.a(i2).b;
            if (i3 == -1) {
                return null;
            }
            int iA = ec0.g.a(i2).a(c5186zO2.c);
            if (iA < i3) {
                return e(gc0, c5186zO2.f4977a, i2, iA, c4658tO.c, c5186zO2.d);
            }
            if (j9 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                Pair pairK = gc0.k(this.b, ec0, ec0.c, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, Math.max(0L, j8));
                if (pairK == null) {
                    return null;
                }
                jLongValue = ((Long) pairK.second).longValue();
            } else {
                jLongValue = j9;
            }
            gc0.h(obj, ec0);
            int i4 = c5186zO2.b;
            long jD2 = ec0.d(i4);
            return f(gc0, c5186zO2.f4977a, Math.max(jD2 == Long.MIN_VALUE ? ec0.d : ec0.g.a(i4).g + jD2, jLongValue), c4658tO.c, c5186zO2.d);
        }
        int iD = gc0.d(gc0.b(c5186zO2.f4977a), this.f5127a, this.b, this.f, this.g);
        if (iD == -1) {
            return null;
        }
        int i5 = gc0.g(iD, ec0, true).c;
        Object obj2 = ec0.b;
        obj2.getClass();
        if (gc0.n(i5, this.b, 0L).o == iD) {
            Pair pairK2 = gc0.k(this.b, this.f5127a, i5, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, Math.max(0L, j8));
            if (pairK2 == null) {
                return null;
            }
            obj2 = pairK2.first;
            long jLongValue2 = ((Long) pairK2.second).longValue();
            C4482rO c4482rO2 = c4482rO.l;
            if (c4482rO2 == null || !c4482rO2.b.equals(obj2)) {
                j7 = this.e;
                this.e = 1 + j7;
            } else {
                j7 = c4482rO2.f.f5033a.d;
            }
            j2 = jLongValue2;
            c5186zO = c5186zO2;
            j4 = j7;
            j3 = -9223372036854775807L;
        } else {
            c5186zO = c5186zO2;
            j2 = 0;
            j3 = 0;
            j4 = c5186zO.d;
        }
        C5186zO c5186zOL = l(gc0, obj2, j2, j4, this.b, this.f5127a);
        if (j3 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || j9 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            j5 = j2;
            j6 = j3;
        } else {
            z = gc0.h(c5186zO.f4977a, ec0).g.b > 0 && ec0.h(ec0.g.e);
            if (c5186zOL.a() && z) {
                j5 = j2;
                j6 = j9;
            } else if (z) {
                j6 = j3;
                j5 = j9;
            } else {
                j5 = j2;
                j6 = j3;
            }
        }
        return d(gc0, c5186zOL, j6, j5);
    }

    public final C4658tO d(Gc0 gc0, C5186zO c5186zO, long j, long j2) {
        gc0.h(c5186zO.f4977a, this.f5127a);
        if (!c5186zO.a()) {
            return f(gc0, c5186zO.f4977a, j2, j, c5186zO.d);
        }
        return e(gc0, c5186zO.f4977a, c5186zO.b, c5186zO.c, j, c5186zO.d);
    }

    public final C4658tO e(Gc0 gc0, Object obj, int i, int i2, long j, long j2) {
        C5186zO c5186zO = new C5186zO(obj, i, i2, j2, -1);
        Ec0 ec0 = this.f5127a;
        long jA = gc0.h(obj, ec0).a(i, i2);
        long j3 = i2 == ec0.f(i) ? ec0.g.c : 0L;
        return new C4658tO(c5186zO, (jA == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || j3 < jA) ? j3 : Math.max(0L, jA - 1), j, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, jA, ec0.h(i), false, false, false);
    }

    public final C4658tO f(Gc0 gc0, Object obj, long j, long j2, long j3) {
        boolean z;
        boolean z2;
        long jD;
        long jMax = j;
        Ec0 ec0 = this.f5127a;
        gc0.h(obj, ec0);
        int iB = ec0.b(jMax);
        if (iB == -1) {
            C2 c2 = ec0.g;
            z2 = c2.b > 0 && ec0.h(c2.e);
        } else {
            if (ec0.h(iB) && ec0.d(iB) == ec0.d) {
                B2 b2A = ec0.g.a(iB);
                int i = b2A.b;
                if (i == -1) {
                    z = true;
                    break;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        z = false;
                        break;
                    }
                    int i3 = b2A.e[i2];
                    if (i3 == 0 || i3 == 1) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (!z) {
                    iB = -1;
                }
            }
        }
        C5186zO c5186zO = new C5186zO(obj, j3, iB);
        boolean z3 = !c5186zO.a() && iB == -1;
        boolean zI = i(gc0, c5186zO);
        boolean zH = h(gc0, c5186zO, z3);
        boolean z4 = iB != -1 && ec0.h(iB);
        if (iB != -1) {
            jD = ec0.d(iB);
        } else {
            jD = z2 ? ec0.d : -9223372036854775807L;
        }
        long j4 = (jD == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || jD == Long.MIN_VALUE) ? ec0.d : jD;
        if (j4 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && jMax >= j4) {
            jMax = Math.max(0L, j4 - ((long) ((zH || !z2) ? 1 : 0)));
        }
        return new C4658tO(c5186zO, jMax, j2, jD, j4, z4, z3, zI, zH);
    }

    public final C4658tO g(Gc0 gc0, C4658tO c4658tO) {
        long jA;
        boolean zH;
        C5186zO c5186zO = c4658tO.f5033a;
        boolean zA = c5186zO.a();
        int i = c5186zO.e;
        boolean z = !zA && i == -1;
        boolean zI = i(gc0, c5186zO);
        boolean zH2 = h(gc0, c5186zO, z);
        Object obj = c4658tO.f5033a.f4977a;
        Ec0 ec0 = this.f5127a;
        gc0.h(obj, ec0);
        long jD = (c5186zO.a() || i == -1) ? -9223372036854775807L : ec0.d(i);
        boolean zA2 = c5186zO.a();
        int i2 = c5186zO.b;
        if (zA2) {
            jA = ec0.a(i2, c5186zO.c);
        } else {
            jA = (jD == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || jD == Long.MIN_VALUE) ? ec0.d : jD;
        }
        if (c5186zO.a()) {
            zH = ec0.h(i2);
        } else {
            zH = i != -1 && ec0.h(i);
        }
        return new C4658tO(c5186zO, c4658tO.b, c4658tO.c, jD, jA, zH, z, zI, zH2);
    }

    public final boolean h(Gc0 gc0, C5186zO c5186zO, boolean z) {
        int iB = gc0.b(c5186zO.f4977a);
        if (gc0.n(gc0.g(iB, this.f5127a, false).c, this.b, 0L).i) {
            return false;
        }
        return gc0.d(iB, this.f5127a, this.b, this.f, this.g) == -1 && z;
    }

    public final boolean i(Gc0 gc0, C5186zO c5186zO) {
        if (!(!c5186zO.a() && c5186zO.e == -1)) {
            return false;
        }
        Object obj = c5186zO.f4977a;
        return gc0.n(gc0.h(obj, this.f5127a).c, this.b, 0L).p == gc0.b(obj);
    }

    public final void j() {
        C5086yC c5086yC = AC.b;
        C4998xC c4998xC = new C4998xC();
        for (C4482rO c4482rO = this.h; c4482rO != null; c4482rO = c4482rO.l) {
            c4998xC.H0(c4482rO.f.f5033a);
        }
        C4482rO c4482rO2 = this.i;
        ((Qa0) this.d).c(new RunnableC4746uO(this, c4998xC, c4482rO2 == null ? null : c4482rO2.f.f5033a, 0));
    }

    public final boolean k(C4482rO c4482rO) {
        boolean z = false;
        FW.s(c4482rO != null);
        if (c4482rO.equals(this.j)) {
            return false;
        }
        this.j = c4482rO;
        while (true) {
            c4482rO = c4482rO.l;
            if (c4482rO == null) {
                break;
            }
            if (c4482rO == this.i) {
                this.i = this.h;
                z = true;
            }
            c4482rO.f();
            this.k--;
        }
        C4482rO c4482rO2 = this.j;
        if (c4482rO2.l != null) {
            c4482rO2.b();
            c4482rO2.l = null;
            c4482rO2.c();
        }
        j();
        return z;
    }

    public final C5186zO m(Gc0 gc0, Object obj, long j) {
        long j2;
        int iB;
        Object obj2 = obj;
        Ec0 ec0 = this.f5127a;
        int i = gc0.h(obj2, ec0).c;
        Object obj3 = this.l;
        if (obj3 == null || (iB = gc0.b(obj3)) == -1 || gc0.g(iB, ec0, false).c != i) {
            C4482rO c4482rO = this.h;
            while (true) {
                if (c4482rO == null) {
                    C4482rO c4482rO2 = this.h;
                    while (true) {
                        if (c4482rO2 == null) {
                            j2 = this.e;
                            this.e = 1 + j2;
                            if (this.h != null) {
                                break;
                            }
                            this.l = obj2;
                            this.m = j2;
                            break;
                        }
                        int iB2 = gc0.b(c4482rO2.b);
                        if (iB2 != -1 && gc0.g(iB2, ec0, false).c == i) {
                            j2 = c4482rO2.f.f5033a.d;
                            break;
                        }
                        c4482rO2 = c4482rO2.l;
                    }
                } else {
                    if (c4482rO.b.equals(obj2)) {
                        j2 = c4482rO.f.f5033a.d;
                        break;
                    }
                    c4482rO = c4482rO.l;
                }
            }
        } else {
            j2 = this.m;
        }
        long j3 = j2;
        gc0.h(obj2, ec0);
        int i2 = ec0.c;
        Fc0 fc0 = this.b;
        gc0.o(i2, fc0);
        boolean z = false;
        for (int iB3 = gc0.b(obj); iB3 >= fc0.o; iB3--) {
            gc0.g(iB3, ec0, true);
            boolean z2 = ec0.g.b > 0;
            z |= z2;
            if (ec0.c(ec0.d) != -1) {
                obj2 = ec0.b;
                obj2.getClass();
            }
            if (z && (!z2 || ec0.d != 0)) {
                break;
            }
        }
        return l(gc0, obj2, j, j3, this.b, this.f5127a);
    }

    public final boolean n(Gc0 gc0) {
        C4482rO c4482rO;
        C4482rO c4482rO2 = this.h;
        if (c4482rO2 == null) {
            return true;
        }
        int iB = gc0.b(c4482rO2.b);
        while (true) {
            iB = gc0.d(iB, this.f5127a, this.b, this.f, this.g);
            while (true) {
                c4482rO = c4482rO2.l;
                if (c4482rO == null || c4482rO2.f.g) {
                    break;
                }
                c4482rO2 = c4482rO;
            }
            if (iB == -1 || c4482rO == null || gc0.b(c4482rO.b) != iB) {
                break;
            }
            c4482rO2 = c4482rO;
        }
        boolean zK = k(c4482rO2);
        c4482rO2.f = g(gc0, c4482rO2.f);
        return !zK;
    }

    public final boolean o(Gc0 gc0, long j, long j2) {
        C4658tO c4658tOG;
        C4482rO c4482rO = this.h;
        C4482rO c4482rO2 = null;
        while (c4482rO != null) {
            C4658tO c4658tO = c4482rO.f;
            if (c4482rO2 == null) {
                c4658tOG = g(gc0, c4658tO);
            } else {
                C4658tO c4658tOC = c(gc0, c4482rO2, j);
                if (c4658tOC == null) {
                    return !k(c4482rO2);
                }
                if (c4658tO.b != c4658tOC.b || !c4658tO.f5033a.equals(c4658tOC.f5033a)) {
                    return !k(c4482rO2);
                }
                c4658tOG = c4658tOC;
            }
            c4482rO.f = c4658tOG.a(c4658tO.c);
            long j3 = c4658tO.e;
            if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                long j4 = c4658tOG.e;
                if (j3 != j4) {
                    c4482rO.h();
                    return (k(c4482rO) || (c4482rO == this.i && !c4482rO.f.f && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j4 > com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? 1 : (j4 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : c4482rO.o + j4) ? 1 : (j2 == ((j4 > com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? 1 : (j4 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : c4482rO.o + j4) ? 0 : -1)) >= 0))) ? false : true;
                }
            }
            c4482rO2 = c4482rO;
            c4482rO = c4482rO.l;
        }
        return true;
    }
}
