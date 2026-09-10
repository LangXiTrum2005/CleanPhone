package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2924Yy implements InterfaceC2656Oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3491g4 f4049a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public InterfaceC4326pd0 j;
    public C2898Xy k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final C4836vQ d = new C4836vQ(7);
    public final C4836vQ e = new C4836vQ(8);
    public final C4836vQ f = new C4836vQ(6);
    public long m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public final JT o = new JT();

    public C2924Yy(C3491g4 c3491g4, boolean z, boolean z2) {
        this.f4049a = c3491g4;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:81:0x0208  */
    /* JADX WARN: Code duplicated, block: B:82:0x020a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0221  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void a(JT jt) {
        int i;
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        long j;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        FW.t(this.j);
        int i11 = Ug0.f3833a;
        int i12 = jt.b;
        int i13 = jt.c;
        byte[] bArr2 = jt.f3266a;
        this.g += (long) jt.a();
        this.j.d(jt.a(), jt);
        while (true) {
            int iB = AbstractC5188zQ.b(bArr2, i12, i13, this.h);
            if (iB == i13) {
                d(bArr2, i12, i13);
                return;
            }
            int i14 = iB + 3;
            int i15 = bArr2[i14] & 31;
            int i16 = iB - i12;
            if (i16 > 0) {
                d(bArr2, i12, iB);
            }
            int i17 = i13 - iB;
            long j3 = this.g - ((long) i17);
            int i18 = i16 < 0 ? -i16 : 0;
            long j4 = this.m;
            boolean z2 = this.l;
            C4836vQ c4836vQ = this.e;
            C4836vQ c4836vQ2 = this.d;
            if (!z2 || this.k.c) {
                c4836vQ2.b(i18);
                c4836vQ.b(i18);
                if (this.l) {
                    i = i17;
                    i2 = i13;
                    bArr = bArr2;
                    i3 = i14;
                    i4 = i15;
                    if (c4836vQ2.c) {
                        C5100yQ c5100yQD = AbstractC5188zQ.d(c4836vQ2.d, 3, c4836vQ2.e);
                        this.k.d.append(c5100yQD.d, c5100yQD);
                        c4836vQ2.c();
                    } else if (c4836vQ.c) {
                        Uh0 uh0 = new Uh0(c4836vQ.d, 4, c4836vQ.e);
                        int iL = uh0.l();
                        int iL2 = uh0.l();
                        uh0.r();
                        this.k.e.append(iL, new C5012xQ(iL, iL2, uh0.h()));
                        c4836vQ.c();
                    }
                } else if (c4836vQ2.c && c4836vQ.c) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(c4836vQ2.d, c4836vQ2.e));
                    arrayList.add(Arrays.copyOf(c4836vQ.d, c4836vQ.e));
                    i2 = i13;
                    C5100yQ c5100yQD2 = AbstractC5188zQ.d(c4836vQ2.d, 3, c4836vQ2.e);
                    bArr = bArr2;
                    i3 = i14;
                    Uh0 uh1 = new Uh0(c4836vQ.d, 4, c4836vQ.e);
                    int iL3 = uh1.l();
                    int iL4 = uh1.l();
                    uh1.r();
                    C5012xQ c5012xQ = new C5012xQ(iL3, iL4, uh1.h());
                    i4 = i15;
                    String strD = FW.d(c5100yQD2.f5275a, c5100yQD2.b, c5100yQD2.c);
                    InterfaceC4326pd0 interfaceC4326pd0 = this.j;
                    C4531rw c4531rw = new C4531rw();
                    i = i17;
                    c4531rw.f4954a = this.i;
                    c4531rw.k = "video/avc";
                    c4531rw.h = strD;
                    c4531rw.p = c5100yQD2.e;
                    c4531rw.q = c5100yQD2.f;
                    c4531rw.t = c5100yQD2.g;
                    c4531rw.m = arrayList;
                    interfaceC4326pd0.e(new C4619sw(c4531rw));
                    this.l = true;
                    this.k.d.append(c5100yQD2.d, c5100yQD2);
                    this.k.e.append(iL3, c5012xQ);
                    c4836vQ2.c();
                    c4836vQ.c();
                } else {
                    i = i17;
                    i2 = i13;
                    bArr = bArr2;
                    i3 = i14;
                    i4 = i15;
                }
            } else {
                i = i17;
                i2 = i13;
                bArr = bArr2;
                i3 = i14;
                i4 = i15;
            }
            C4836vQ c4836vQ3 = this.f;
            if (c4836vQ3.b(i18)) {
                int iE = AbstractC5188zQ.e(c4836vQ3.d, c4836vQ3.e);
                byte[] bArr3 = c4836vQ3.d;
                JT jt2 = this.o;
                jt2.C(bArr3, iE);
                jt2.E(4);
                AbstractC2845Vx.Q(j4, jt2, (InterfaceC4326pd0[]) this.f4049a.c);
            }
            C2898Xy c2898Xy = this.k;
            boolean z3 = this.l;
            boolean z4 = this.n;
            if (c2898Xy.i == 9) {
                if (z3 && c2898Xy.o) {
                    j = c2898Xy.j;
                    i5 = i + ((int) (j3 - j));
                    j2 = c2898Xy.q;
                    if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        c2898Xy.f4001a.a(j2, c2898Xy.r ? 1 : 0, (int) (j - c2898Xy.p), i5, null);
                    }
                }
                c2898Xy.p = c2898Xy.j;
                c2898Xy.q = c2898Xy.l;
                c2898Xy.r = false;
                c2898Xy.o = true;
            } else if (c2898Xy.c) {
                C2872Wy c2872Wy = c2898Xy.n;
                C2872Wy c2872Wy2 = c2898Xy.m;
                if (c2872Wy.f3948a) {
                    if (c2872Wy2.f3948a) {
                        C5100yQ c5100yQ = c2872Wy.c;
                        FW.t(c5100yQ);
                        C5100yQ c5100yQ2 = c2872Wy2.c;
                        FW.t(c5100yQ2);
                        if (c2872Wy.f == c2872Wy2.f && c2872Wy.g == c2872Wy2.g && c2872Wy.h == c2872Wy2.h && ((!c2872Wy.i || !c2872Wy2.i || c2872Wy.j == c2872Wy2.j) && ((i9 = c2872Wy.d) == (i10 = c2872Wy2.d) || (i9 != 0 && i10 != 0)))) {
                            int i19 = c5100yQ2.k;
                            int i20 = c5100yQ.k;
                            if ((i20 == 0 && i19 == 0 && (c2872Wy.m != c2872Wy2.m || c2872Wy.n != c2872Wy2.n)) || ((i20 == 1 && i19 == 1 && (c2872Wy.o != c2872Wy2.o || c2872Wy.p != c2872Wy2.p)) || (z = c2872Wy.k) != c2872Wy2.k || (z && c2872Wy.l != c2872Wy2.l))) {
                                if (z3) {
                                    j = c2898Xy.j;
                                    i5 = i + ((int) (j3 - j));
                                    j2 = c2898Xy.q;
                                    if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                        c2898Xy.f4001a.a(j2, c2898Xy.r ? 1 : 0, (int) (j - c2898Xy.p), i5, null);
                                    }
                                }
                                c2898Xy.p = c2898Xy.j;
                                c2898Xy.q = c2898Xy.l;
                                c2898Xy.r = false;
                                c2898Xy.o = true;
                            }
                        } else {
                            if (z3) {
                                j = c2898Xy.j;
                                i5 = i + ((int) (j3 - j));
                                j2 = c2898Xy.q;
                                if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                    c2898Xy.f4001a.a(j2, c2898Xy.r ? 1 : 0, (int) (j - c2898Xy.p), i5, null);
                                }
                            }
                            c2898Xy.p = c2898Xy.j;
                            c2898Xy.q = c2898Xy.l;
                            c2898Xy.r = false;
                            c2898Xy.o = true;
                        }
                    } else {
                        if (z3) {
                            j = c2898Xy.j;
                            i5 = i + ((int) (j3 - j));
                            j2 = c2898Xy.q;
                            if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                c2898Xy.f4001a.a(j2, c2898Xy.r ? 1 : 0, (int) (j - c2898Xy.p), i5, null);
                            }
                        }
                        c2898Xy.p = c2898Xy.j;
                        c2898Xy.q = c2898Xy.l;
                        c2898Xy.r = false;
                        c2898Xy.o = true;
                    }
                }
            }
            if (c2898Xy.b) {
                C2872Wy c2872Wy3 = c2898Xy.n;
                z4 = c2872Wy3.b && ((i8 = c2872Wy3.e) == 7 || i8 == 2);
            }
            boolean z5 = c2898Xy.r;
            int i21 = c2898Xy.i;
            boolean z6 = z5 | (i21 == 5 || (z4 && i21 == 1));
            c2898Xy.r = z6;
            if (z6) {
                this.n = false;
            }
            long j5 = this.m;
            if (!this.l || this.k.c) {
                i6 = i4;
                c4836vQ2.d(i6);
                c4836vQ.d(i6);
            } else {
                i6 = i4;
            }
            c4836vQ3.d(i6);
            C2898Xy c2898Xy2 = this.k;
            c2898Xy2.i = i6;
            c2898Xy2.l = j5;
            c2898Xy2.j = j3;
            if (c2898Xy2.b) {
                i7 = 1;
                if (i6 == 1) {
                    C2872Wy c2872Wy4 = c2898Xy2.m;
                    c2898Xy2.m = c2898Xy2.n;
                    c2898Xy2.n = c2872Wy4;
                    c2872Wy4.b = false;
                    c2872Wy4.f3948a = false;
                    c2898Xy2.h = 0;
                    c2898Xy2.k = true;
                }
                i13 = i2;
                bArr2 = bArr;
                i12 = i3;
            } else {
                i7 = 1;
            }
            if (c2898Xy2.c && (i6 == 5 || i6 == i7 || i6 == 2)) {
                C2872Wy c2872Wy5 = c2898Xy2.m;
                c2898Xy2.m = c2898Xy2.n;
                c2898Xy2.n = c2872Wy5;
                c2872Wy5.b = false;
                c2872Wy5.f3948a = false;
                c2898Xy2.h = 0;
                c2898Xy2.k = true;
            }
            i13 = i2;
            bArr2 = bArr;
            i12 = i3;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void b(int i, long j) {
        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.m = j;
        }
        this.n = ((i & 2) != 0) | this.n;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void c(InterfaceC4353pt interfaceC4353pt, C4416qe0 c4416qe0) {
        c4416qe0.a();
        c4416qe0.b();
        this.i = c4416qe0.e;
        c4416qe0.b();
        InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(c4416qe0.d, 2);
        this.j = interfaceC4326pd0Track;
        this.k = new C2898Xy(interfaceC4326pd0Track, this.b, this.c);
        this.f4049a.t(interfaceC4353pt, c4416qe0);
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0100  */
    /* JADX WARN: Code duplicated, block: B:56:0x0102  */
    /* JADX WARN: Code duplicated, block: B:58:0x0105  */
    /* JADX WARN: Code duplicated, block: B:61:0x010d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0112  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x0123  */
    /* JADX WARN: Code duplicated, block: B:77:0x013e  */
    public final void d(byte[] bArr, int i, int i2) {
        boolean zH;
        boolean zH2;
        boolean z;
        boolean z2;
        int iL;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int iM;
        int iM2;
        int i6;
        if (!this.l || this.k.c) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        C2898Xy c2898Xy = this.k;
        if (c2898Xy.k) {
            int i7 = i2 - i;
            byte[] bArr2 = c2898Xy.g;
            int length = bArr2.length;
            int i8 = c2898Xy.h + i7;
            if (length < i8) {
                c2898Xy.g = Arrays.copyOf(bArr2, i8 * 2);
            }
            System.arraycopy(bArr, i, c2898Xy.g, c2898Xy.h, i7);
            int i9 = c2898Xy.h + i7;
            c2898Xy.h = i9;
            byte[] bArr3 = c2898Xy.g;
            Uh0 uh0 = c2898Xy.f;
            uh0.d = bArr3;
            uh0.c = 0;
            uh0.b = i9;
            uh0.e = 0;
            uh0.a();
            if (uh0.d(8)) {
                uh0.r();
                int i10 = uh0.i(2);
                uh0.s(5);
                if (uh0.e()) {
                    uh0.l();
                    if (uh0.e()) {
                        int iL2 = uh0.l();
                        if (!c2898Xy.c) {
                            c2898Xy.k = false;
                            C2872Wy c2872Wy = c2898Xy.n;
                            c2872Wy.e = iL2;
                            c2872Wy.b = true;
                            return;
                        }
                        if (uh0.e()) {
                            int iL3 = uh0.l();
                            SparseArray sparseArray = c2898Xy.e;
                            if (sparseArray.indexOfKey(iL3) < 0) {
                                c2898Xy.k = false;
                                return;
                            }
                            C5012xQ c5012xQ = (C5012xQ) sparseArray.get(iL3);
                            C5100yQ c5100yQ = (C5100yQ) c2898Xy.d.get(c5012xQ.f5223a);
                            if (c5100yQ.h) {
                                if (!uh0.d(2)) {
                                    return;
                                } else {
                                    uh0.s(2);
                                }
                            }
                            int i11 = c5100yQ.j;
                            if (uh0.d(i11)) {
                                int i12 = uh0.i(i11);
                                if (!c5100yQ.i) {
                                    if (uh0.d(1)) {
                                        zH = uh0.h();
                                        if (zH) {
                                            if (!uh0.d(1)) {
                                                return;
                                            }
                                            zH2 = uh0.h();
                                            z = true;
                                        }
                                        if (c2898Xy.i == 5) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            iL = 0;
                                        } else if (!uh0.e()) {
                                            return;
                                        } else {
                                            iL = uh0.l();
                                        }
                                        z3 = c5012xQ.b;
                                        i3 = c5100yQ.k;
                                        if (i3 == 0) {
                                            i6 = c5100yQ.l;
                                            if (!uh0.d(i6)) {
                                                return;
                                            }
                                            i4 = uh0.i(i6);
                                            if (z3 || zH) {
                                                i5 = 0;
                                                iM = 0;
                                                iM2 = 0;
                                            } else {
                                                if (!uh0.e()) {
                                                    return;
                                                }
                                                iM2 = uh0.m();
                                                i5 = 0;
                                                iM = 0;
                                            }
                                        } else if (i3 == 1 || c5100yQ.m) {
                                            i4 = 0;
                                            i5 = 0;
                                            iM = 0;
                                            iM2 = 0;
                                        } else {
                                            if (!uh0.e()) {
                                                return;
                                            }
                                            int iM3 = uh0.m();
                                            if (!z3 || zH) {
                                                i5 = iM3;
                                                i4 = 0;
                                                iM = 0;
                                                iM2 = 0;
                                            } else {
                                                if (!uh0.e()) {
                                                    return;
                                                }
                                                iM = uh0.m();
                                                iM2 = 0;
                                                i5 = iM3;
                                                i4 = 0;
                                            }
                                        }
                                        C2872Wy c2872Wy2 = c2898Xy.n;
                                        c2872Wy2.c = c5100yQ;
                                        c2872Wy2.d = i10;
                                        c2872Wy2.e = iL2;
                                        c2872Wy2.f = i12;
                                        c2872Wy2.g = iL3;
                                        c2872Wy2.h = zH;
                                        c2872Wy2.i = z;
                                        c2872Wy2.j = zH2;
                                        c2872Wy2.k = z2;
                                        c2872Wy2.l = iL;
                                        c2872Wy2.m = i4;
                                        c2872Wy2.n = iM2;
                                        c2872Wy2.o = i5;
                                        c2872Wy2.p = iM;
                                        c2872Wy2.f3948a = true;
                                        c2872Wy2.b = true;
                                        c2898Xy.k = false;
                                    }
                                    return;
                                }
                                zH = false;
                                zH2 = false;
                                z = false;
                                if (c2898Xy.i == 5) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    iL = 0;
                                } else if (!uh0.e()) {
                                    return;
                                } else {
                                    iL = uh0.l();
                                }
                                z3 = c5012xQ.b;
                                i3 = c5100yQ.k;
                                if (i3 == 0) {
                                    i6 = c5100yQ.l;
                                    if (!uh0.d(i6)) {
                                        return;
                                    }
                                    i4 = uh0.i(i6);
                                    if (z3) {
                                    }
                                    i5 = 0;
                                    iM = 0;
                                    iM2 = 0;
                                } else {
                                    if (i3 == 1) {
                                    }
                                    i4 = 0;
                                    i5 = 0;
                                    iM = 0;
                                    iM2 = 0;
                                }
                                C2872Wy c2872Wy3 = c2898Xy.n;
                                c2872Wy3.c = c5100yQ;
                                c2872Wy3.d = i10;
                                c2872Wy3.e = iL2;
                                c2872Wy3.f = i12;
                                c2872Wy3.g = iL3;
                                c2872Wy3.h = zH;
                                c2872Wy3.i = z;
                                c2872Wy3.j = zH2;
                                c2872Wy3.k = z2;
                                c2872Wy3.l = iL;
                                c2872Wy3.m = i4;
                                c2872Wy3.n = iM2;
                                c2872Wy3.o = i5;
                                c2872Wy3.p = iM;
                                c2872Wy3.f3948a = true;
                                c2872Wy3.b = true;
                                c2898Xy.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void seek() {
        this.g = 0L;
        this.n = false;
        this.m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        AbstractC5188zQ.a(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        C2898Xy c2898Xy = this.k;
        if (c2898Xy != null) {
            c2898Xy.k = false;
            c2898Xy.o = false;
            C2872Wy c2872Wy = c2898Xy.n;
            c2872Wy.b = false;
            c2872Wy.f3948a = false;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void packetFinished() {
    }
}
