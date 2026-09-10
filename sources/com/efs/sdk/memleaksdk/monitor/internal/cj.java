package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5073y40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5163z50;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2997aY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ZX;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class cj {
    public static final b e = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cs f638a;
    public final cs b;
    public final List<ap> c;
    public final cf d;
    private final int f;
    private final dc<String> g;
    private final da h;
    private final cs i;
    private final cs j;
    private final bs k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final boolean p;
    private final int q;

    public static final class a implements bq {
        private final int b;
        private final int c;
        private final int d;
        private final dc<String> e;
        private final da f;
        private final byte[] g;
        private int h;
        private final cu i;
        private final cu j;
        private final cu k;
        private final cu l;
        private final List<ap> m;
        private final int n;
        private final int o;
        private final int p;
        private final int q;
        private final int r;

        public a(boolean z, long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.n = i5;
            this.o = i6;
            this.p = i7;
            this.q = i8;
            this.r = i9;
            int i10 = z ? 8 : 4;
            this.b = i10;
            b bVar = cj.e;
            int iA = bVar.a(j);
            this.c = iA;
            int iA2 = bVar.a(i9);
            this.d = iA2;
            this.e = new dc<>();
            this.f = new da(i);
            this.g = new byte[i9];
            this.i = new cu(iA + i10 + 4 + i5 + iA2, z, i, 0.0d, 8);
            this.j = new cu(iA + i10 + i6, z, i2, 0.0d, 8);
            this.k = new cu(i10 + iA + i7, z, i3, 0.0d, 8);
            this.l = new cu(iA + 1 + i8, z, i4, 0.0d, 8);
            this.m = new ArrayList();
        }

        private final void a(bb bbVar, int i) {
            int i2 = 1;
            if (1 > i) {
                return;
            }
            while (true) {
                byte[] bArr = this.g;
                int i3 = this.h;
                this.h = i3 + 1;
                bArr[i3] = bbVar.I();
                if (i2 == i) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        private final short a() {
            byte[] bArr = this.g;
            int i = this.h;
            return (short) ((bArr[i - 1] & 255) | ((bArr[i - 2] & 255) << 8));
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.bq
        public void a(bc bcVar, long j, bb bbVar) throws IOException {
            AbstractC2995aW.q(bcVar, "tag");
            AbstractC2995aW.q(bbVar, "reader");
            switch (ck.f640a[bcVar.ordinal()]) {
                case 1:
                    this.e.a(bbVar.N(), bbVar.b(j - ((long) this.b)));
                    return;
                case 2:
                    br brVar = br.INT;
                    bbVar.a(brVar.j);
                    long jN = bbVar.N();
                    bbVar.a(brVar.j);
                    this.f.a(jN, bbVar.N());
                    return;
                case 3:
                    ap.n nVarA = bbVar.a();
                    if (nVarA.a() != 0) {
                        this.m.add(nVarA);
                        return;
                    }
                    return;
                case 4:
                    ap.e eVarB = bbVar.b();
                    if (eVarB.a() != 0) {
                        this.m.add(eVarB);
                        return;
                    }
                    return;
                case 5:
                    ap.f fVarC = bbVar.c();
                    if (fVarC.a() != 0) {
                        this.m.add(fVarC);
                        return;
                    }
                    return;
                case 6:
                    ap.d dVarD = bbVar.d();
                    if (dVarD.a() != 0) {
                        this.m.add(dVarD);
                        return;
                    }
                    return;
                case 7:
                    ap.i iVarE = bbVar.e();
                    if (iVarE.a() != 0) {
                        this.m.add(iVarE);
                        return;
                    }
                    return;
                case 8:
                    ap.k kVarF = bbVar.f();
                    if (kVarF.a() != 0) {
                        this.m.add(kVarF);
                        return;
                    }
                    return;
                case 9:
                    ap.l lVarG = bbVar.g();
                    if (lVarG.a() != 0) {
                        this.m.add(lVarG);
                        return;
                    }
                    return;
                case 10:
                    ap.h hVarH = bbVar.h();
                    if (hVarH.a() != 0) {
                        this.m.add(hVarH);
                        return;
                    }
                    return;
                case 11:
                    ap.m mVarI = bbVar.i();
                    if (mVarI.a() != 0) {
                        this.m.add(mVarI);
                        return;
                    }
                    return;
                case 12:
                    ap.c cVarJ = bbVar.j();
                    if (cVarJ.a() != 0) {
                        this.m.add(cVarJ);
                        return;
                    }
                    return;
                case 13:
                    ap.b bVarK = bbVar.k();
                    if (bVarK.a() != 0) {
                        this.m.add(bVarK);
                        return;
                    }
                    return;
                case 14:
                    ap.a aVarL = bbVar.l();
                    if (aVarL.a() != 0) {
                        this.m.add(aVarL);
                        return;
                    }
                    return;
                case 15:
                    ap.j jVarM = bbVar.m();
                    if (jVarM.a() != 0) {
                        this.m.add(jVarM);
                        return;
                    }
                    return;
                case 16:
                    ap.p pVarN = bbVar.n();
                    if (pVarN.a() != 0) {
                        this.m.add(pVarN);
                        return;
                    }
                    return;
                case 17:
                    ap.g gVarO = bbVar.o();
                    if (gVarO.a() != 0) {
                        this.m.add(gVarO);
                        return;
                    }
                    return;
                case 18:
                    ap.o oVarP = bbVar.p();
                    if (oVarP.a() != 0) {
                        this.m.add(oVarP);
                        return;
                    }
                    return;
                case 19:
                    long j2 = bbVar.f598a;
                    long jN2 = bbVar.N();
                    bbVar.a(br.INT.j);
                    long jN3 = bbVar.N();
                    bbVar.a(this.b * 5);
                    int iG = bbVar.G();
                    bbVar.v();
                    int i = this.h;
                    long j3 = bbVar.f598a;
                    int i2 = 2;
                    a(bbVar, 2);
                    int iA = a() & 65535;
                    int i3 = 0;
                    while (i3 < iA) {
                        a(bbVar, this.b);
                        a(bbVar, 1);
                        int i4 = iA;
                        int i5 = this.g[this.h - 1] & 255;
                        if (i5 == 2) {
                            a(bbVar, this.b);
                        } else {
                            a(bbVar, ((Number) U5.q0(br.m, Integer.valueOf(i5))).intValue());
                        }
                        i3++;
                        iA = i4;
                        i2 = 2;
                    }
                    a(bbVar, i2);
                    int iA2 = a() & 65535;
                    for (int i6 = 0; i6 < iA2; i6++) {
                        a(bbVar, this.b);
                        a(bbVar, 1);
                    }
                    long j4 = bbVar.f598a;
                    int i7 = (int) (j4 - j3);
                    cu.a aVarA = this.i.a(jN2);
                    aVarA.a(j2, this.c);
                    aVarA.a(jN3);
                    aVarA.a(iG);
                    aVarA.a(j4 - j2, this.n);
                    aVarA.a(i, this.d);
                    int i8 = i + i7;
                    if (i8 == this.h) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Expected ");
                    AbstractC3888ke0.t(sb, this.h, " to have moved by ", i7, " and be equal to ");
                    sb.append(i8);
                    throw new IllegalArgumentException(sb.toString().toString());
                case 20:
                    long j5 = bbVar.f598a;
                    long jN4 = bbVar.N();
                    bbVar.a(br.INT.j);
                    long jN5 = bbVar.N();
                    bbVar.a(bbVar.G());
                    long j6 = bbVar.f598a - j5;
                    cu.a aVarA2 = this.j.a(jN4);
                    aVarA2.a(j5, this.c);
                    aVarA2.a(jN5);
                    aVarA2.a(j6, this.o);
                    return;
                case 21:
                    long j7 = bbVar.f598a;
                    long jN6 = bbVar.N();
                    bbVar.a(br.INT.j);
                    int iG2 = bbVar.G();
                    long jN7 = bbVar.N();
                    bbVar.a(this.b * iG2);
                    long j8 = bbVar.f598a - j7;
                    cu.a aVarA3 = this.k.a(jN6);
                    aVarA3.a(j7, this.c);
                    aVarA3.a(jN7);
                    aVarA3.a(j8, this.p);
                    return;
                case 22:
                    long j9 = bbVar.f598a;
                    long jN8 = bbVar.N();
                    bbVar.a(br.INT.j);
                    int iG3 = bbVar.G();
                    br brVar2 = (br) U5.q0(br.n, Integer.valueOf(bbVar.E()));
                    bbVar.a(iG3 * brVar2.j);
                    long j10 = bbVar.f598a - j9;
                    cu.a aVarA4 = this.l.a(jN8);
                    aVarA4.a(j9, this.c);
                    aVarA4.a((byte) brVar2.ordinal());
                    aVarA4.a(j10, this.q);
                    return;
                default:
                    return;
            }
        }

        public final cj a(bs bsVar, ax axVar) {
            AbstractC2995aW.q(axVar, "hprofHeader");
            if (this.h == this.g.length) {
                return new cj(this.c, this.e, this.f, this.i.a(), this.j.a(), this.k.a(), this.l.a(), this.m, bsVar, this.n, this.o, this.p, this.q, axVar.b != bd.ANDROID, new cf(this.b, this.g), this.d, (byte) 0);
            }
            throw new IllegalArgumentException(("Read " + this.h + " into fields bytes instead of expected " + this.g.length).toString());
        }
    }

    public static final class b {

        public static final class a implements bq {
            final /* synthetic */ ZX b;
            final /* synthetic */ C2997aY c;
            final /* synthetic */ ZX d;
            final /* synthetic */ ZX e;
            final /* synthetic */ C2997aY f;
            final /* synthetic */ ZX g;
            final /* synthetic */ C2997aY h;
            final /* synthetic */ ZX i;
            final /* synthetic */ C2997aY j;

            public a(ZX zx, C2997aY c2997aY, ZX zx2, ZX zx3, C2997aY c2997aY2, ZX zx4, C2997aY c2997aY3, ZX zx5, C2997aY c2997aY4) {
                this.b = zx;
                this.c = c2997aY;
                this.d = zx2;
                this.e = zx3;
                this.f = c2997aY2;
                this.g = zx4;
                this.h = c2997aY3;
                this.i = zx5;
                this.j = c2997aY4;
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.bq
            public void a(bc bcVar, long j, bb bbVar) throws IOException {
                AbstractC2995aW.q(bcVar, "tag");
                AbstractC2995aW.q(bbVar, "reader");
                long j2 = bbVar.f598a;
                int i = cl.f641a[bcVar.ordinal()];
                if (i == 1) {
                    this.b.f4074a++;
                    bbVar.u();
                    long j3 = bbVar.f598a;
                    bbVar.w();
                    bbVar.x();
                    C2997aY c2997aY = this.c;
                    c2997aY.f4125a = Math.max(c2997aY.f4125a, bbVar.f598a - j2);
                    this.d.f4074a += (int) (bbVar.f598a - j3);
                    return;
                }
                if (i == 2) {
                    this.e.f4074a++;
                    bbVar.y();
                    C2997aY c2997aY2 = this.f;
                    c2997aY2.f4125a = Math.max(c2997aY2.f4125a, bbVar.f598a - j2);
                    return;
                }
                if (i == 3) {
                    this.g.f4074a++;
                    bbVar.A();
                    C2997aY c2997aY3 = this.h;
                    c2997aY3.f4125a = Math.max(c2997aY3.f4125a, bbVar.f598a - j2);
                    return;
                }
                if (i != 4) {
                    return;
                }
                this.i.f4074a++;
                bbVar.B();
                C2997aY c2997aY4 = this.j;
                c2997aY4.f4125a = Math.max(c2997aY4.f4125a, bbVar.f598a - j2);
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }

        public final int a(long j) {
            int i = 0;
            while (j != 0) {
                j >>= 8;
                i++;
            }
            return i;
        }

        public final cj a(bz bzVar, ax axVar, bs bsVar, Set<? extends bc> set) throws IllegalAccessException, IOException, InvocationTargetException {
            AbstractC2995aW.q(bzVar, "reader");
            AbstractC2995aW.q(axVar, "hprofHeader");
            AbstractC2995aW.q(set, "indexedGcRootTags");
            C2997aY c2997aY = new C2997aY();
            c2997aY.f4125a = 0L;
            C2997aY c2997aY2 = new C2997aY();
            c2997aY2.f4125a = 0L;
            C2997aY c2997aY3 = new C2997aY();
            c2997aY3.f4125a = 0L;
            C2997aY c2997aY4 = new C2997aY();
            c2997aY4.f4125a = 0L;
            ZX zx = new ZX();
            zx.f4074a = 0;
            ZX zx2 = new ZX();
            zx2.f4074a = 0;
            ZX zx3 = new ZX();
            zx3.f4074a = 0;
            ZX zx4 = new ZX();
            zx4.f4074a = 0;
            ZX zx5 = new ZX();
            zx5.f4074a = 0;
            bc bcVar = bc.CLASS_DUMP;
            bc bcVar2 = bc.INSTANCE_DUMP;
            bc bcVar3 = bc.OBJECT_ARRAY_DUMP;
            bc bcVar4 = bc.PRIMITIVE_ARRAY_DUMP;
            Set<? extends bc> setOf = EnumSet.of(bcVar, bcVar2, bcVar3, bcVar4);
            AbstractC2995aW.p(setOf, "EnumSet.of(CLASS_DUMP, I…MP, PRIMITIVE_ARRAY_DUMP)");
            bq.a aVar = bq.f620a;
            a aVar2 = new a(axVar.c == 8, bzVar.a(setOf, new a(zx, c2997aY, zx5, zx2, c2997aY2, zx3, c2997aY3, zx4, c2997aY4)), zx.f4074a, zx2.f4074a, zx3.f4074a, zx4.f4074a, a(c2997aY.f4125a), a(c2997aY2.f4125a), a(c2997aY3.f4125a), a(c2997aY4.f4125a), zx5.f4074a);
            EnumSet enumSetOf = EnumSet.of(bc.STRING_IN_UTF8, bc.LOAD_CLASS, bcVar, bcVar2, bcVar3, bcVar4);
            AbstractC2995aW.p(enumSetOf, "EnumSet.of(\n        STRI…MITIVE_ARRAY_DUMP\n      )");
            EnumSet enumSet = bc.N;
            AbstractC2995aW.q(enumSet, "<this>");
            Set setW0 = AbstractC2853Wf.w0(enumSet);
            setW0.retainAll(set);
            bzVar.a(AbstractC5163z50.G0(enumSetOf, setW0), aVar2);
            by.a aVar3 = by.f626a;
            return aVar2.a(bsVar, axVar);
        }
    }

    public static final class c extends WG implements InterfaceC2766Sw {
        public c() {
            super(1);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final db<cm.b> invoke(db<cd> dbVar) {
            AbstractC2995aW.q(dbVar, "it");
            long j = dbVar.f677a;
            cd cdVar = dbVar.b;
            return de.a(j, new cm.b(cdVar.a(cj.this.f), cdVar.b(), cdVar.a(cj.this.m)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private cj(int i, dc<String> dcVar, da daVar, cs csVar, cs csVar2, cs csVar3, cs csVar4, List<? extends ap> list, bs bsVar, int i2, int i3, int i4, int i5, boolean z, cf cfVar, int i6) {
        this.f = i;
        this.g = dcVar;
        this.h = daVar;
        this.f638a = csVar;
        this.b = csVar2;
        this.i = csVar3;
        this.j = csVar4;
        this.c = list;
        this.k = bsVar;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.p = z;
        this.d = cfVar;
        this.q = i6;
    }

    private final String d(long j) {
        String strA = this.g.a(j);
        if (strA != null) {
            return strA;
        }
        throw new IllegalArgumentException(AbstractC5044xl.i("Hprof string ", j, " not in cache"));
    }

    public final boolean c(long j) {
        return (this.f638a.a(j) == null && this.b.a(j) == null && this.i.a(j) == null && this.j.a(j) == null) ? false : true;
    }

    public /* synthetic */ cj(int i, dc dcVar, da daVar, cs csVar, cs csVar2, cs csVar3, cs csVar4, List list, bs bsVar, int i2, int i3, int i4, int i5, boolean z, cf cfVar, int i6, byte b2) {
        this(i, dcVar, daVar, csVar, csVar2, csVar3, csVar4, list, bsVar, i2, i3, i4, i5, z, cfVar, i6);
    }

    public final String a(long j, long j2) {
        String strD = d(j2);
        if (this.k == null) {
            return strD;
        }
        String strA = this.k.a(d(this.h.b(j)), strD);
        return strA != null ? strA : strD;
    }

    public final cy<cm> b(long j) {
        int iB = this.f638a.b(j);
        if (iB >= 0) {
            return de.a(iB, a(this.f638a.a(iB)));
        }
        int iB2 = this.b.b(j);
        if (iB2 >= 0) {
            cd cdVarA = this.b.a(iB2);
            return de.a(this.f638a.c + iB2, new cm.b(cdVarA.a(this.f), cdVarA.b(), cdVarA.a(this.m)));
        }
        int iB3 = this.i.b(j);
        if (iB3 >= 0) {
            cd cdVarA2 = this.i.a(iB3);
            return de.a(this.f638a.c + this.b.c + iB3, new cm.c(cdVarA2.a(this.f), cdVarA2.b(), cdVarA2.a(this.n)));
        }
        int iB4 = this.j.b(j);
        if (iB4 < 0) {
            return null;
        }
        cd cdVarA3 = this.j.a(iB4);
        return de.a(this.f638a.c + this.b.c + iB4 + this.j.c, new cm.d(cdVarA3.a(this.f), br.values()[cdVarA3.a()], cdVarA3.a(this.o)));
    }

    public final String a(long j) {
        String strA;
        String strD = d(this.h.b(j));
        bs bsVar = this.k;
        if (bsVar != null && (strA = bsVar.a(strD)) != null) {
            strD = strA;
        }
        return this.p ? AbstractC3089ba0.G0(strD, '/', '.') : strD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long a(String str) {
        Object next;
        Object next2;
        AbstractC2995aW.q(str, "className");
        if (this.p) {
            str = AbstractC3089ba0.G0(str, '.', '/');
        }
        Iterator it = this.g.b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC2995aW.i((String) ((db) next).b, str));
        db dbVar = (db) next;
        Long lValueOf = dbVar != null ? Long.valueOf(dbVar.f677a) : null;
        if (lValueOf == null) {
            return null;
        }
        long jLongValue = lValueOf.longValue();
        Iterator it2 = this.h.b().iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((cz) next2).b != jLongValue);
        cz czVar = (cz) next2;
        if (czVar != null) {
            return Long.valueOf(czVar.f672a);
        }
        return null;
    }

    public final InterfaceC4545s40 a() {
        return AbstractC5073y40.M0(this.b.a(), new c());
    }

    private final cm.a a(cd cdVar) {
        return new cm.a(cdVar.a(this.f), cdVar.b(), cdVar.c(), cdVar.a(this.l), (int) cdVar.a(this.q));
    }
}
