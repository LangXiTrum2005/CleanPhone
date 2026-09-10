package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3469fo extends AbstractC3381eo {
    public final boolean e;
    public final C2939Zn f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final int r;

    /* JADX WARN: Code duplicated, block: B:31:0x004b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0079  */
    public C3469fo(int i, C3974ld0 c3974ld0, int i2, C2939Zn c2939Zn, int i3, int i4, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        C4619sw c4619sw;
        int i5;
        int i6;
        int i7;
        C4619sw c4619sw2;
        int i8;
        int i9;
        int i10;
        super(i, i2, c3974ld0);
        this.f = c2939Zn;
        int i11 = c2939Zn.c0 ? 24 : 16;
        int i12 = 1;
        int i13 = 0;
        this.n = c2939Zn.b0 && (i4 & i11) != 0;
        if (!z || (((i8 = (c4619sw2 = this.d).q) != -1 && i8 > c2939Zn.f5043a) || ((i9 = c4619sw2.r) != -1 && i9 > c2939Zn.b))) {
            z2 = false;
        } else {
            float f = c4619sw2.s;
            if ((f == -1.0f || f <= c2939Zn.c) && ((i10 = c4619sw2.h) == -1 || i10 <= c2939Zn.d)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.e = z2;
        if (!z || (((i5 = (c4619sw = this.d).q) != -1 && i5 < c2939Zn.e) || ((i6 = c4619sw.r) != -1 && i6 < c2939Zn.f))) {
            z3 = false;
        } else {
            float f2 = c4619sw.s;
            if ((f2 == -1.0f || f2 >= c2939Zn.g) && ((i7 = c4619sw.h) == -1 || i7 >= c2939Zn.h)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.g = z3;
        this.h = C3557go.f(i3, false);
        C4619sw c4619sw3 = this.d;
        this.i = c4619sw3.h;
        this.j = c4619sw3.b();
        this.l = C3557go.b(this.d.e, c2939Zn.m);
        int i14 = this.d.e;
        this.m = i14 == 0 || (i14 & 1) != 0;
        int i15 = 0;
        while (true) {
            AC ac = c2939Zn.l;
            if (i15 >= ac.size()) {
                i15 = Integer.MAX_VALUE;
                break;
            }
            String str = this.d.l;
            if (str != null && str.equals(ac.get(i15))) {
                break;
            } else {
                i15++;
            }
        }
        this.k = i15;
        this.p = AbstractC3950lJ.c(i3) == 128;
        this.q = AbstractC3950lJ.d(i3) == 64;
        this.r = C3557go.c(this.d.l);
        C4619sw c4619sw4 = this.d;
        if ((c4619sw4.e & 16384) == 0) {
            C2939Zn c2939Zn2 = this.f;
            if (C3557go.f(i3, c2939Zn2.k0) && ((z4 = this.e) || c2939Zn2.a0)) {
                if (C3557go.f(i3, false) && this.g && z4 && c4619sw4.h != -1 && !c2939Zn2.x && !c2939Zn2.w && (i11 & i3) != 0) {
                    i12 = 2;
                }
                i13 = i12;
            }
        }
        this.o = i13;
    }

    public static int c(C3469fo c3469fo, C3469fo c3469fo2) {
        AbstractC2992aT abstractC2992aTA = (c3469fo.e && c3469fo.h) ? C3557go.j : C3557go.j.a();
        C2750Sg c2750Sg = AbstractC2802Ug.f3832a;
        int i = c3469fo.i;
        return c2750Sg.c(Integer.valueOf(i), Integer.valueOf(c3469fo2.i), c3469fo.f.w ? C3557go.j.a() : C3557go.k).c(Integer.valueOf(c3469fo.j), Integer.valueOf(c3469fo2.j), abstractC2992aTA).c(Integer.valueOf(i), Integer.valueOf(c3469fo2.i), abstractC2992aTA).f();
    }

    public static int d(C3469fo c3469fo, C3469fo c3469fo2) {
        AbstractC2802Ug abstractC2802UgD = AbstractC2802Ug.f3832a.d(c3469fo.h, c3469fo2.h).a(c3469fo.l, c3469fo2.l).d(c3469fo.m, c3469fo2.m).d(c3469fo.e, c3469fo2.e).d(c3469fo.g, c3469fo2.g);
        Integer numValueOf = Integer.valueOf(c3469fo.k);
        Integer numValueOf2 = Integer.valueOf(c3469fo2.k);
        C4222oR.f4790a.getClass();
        AbstractC2802Ug abstractC2802UgC = abstractC2802UgD.c(numValueOf, numValueOf2, QZ.f3606a);
        boolean z = c3469fo2.p;
        boolean z2 = c3469fo.p;
        AbstractC2802Ug abstractC2802UgD2 = abstractC2802UgC.d(z2, z);
        boolean z3 = c3469fo2.q;
        boolean z4 = c3469fo.q;
        AbstractC2802Ug abstractC2802UgD3 = abstractC2802UgD2.d(z4, z3);
        if (z2 && z4) {
            abstractC2802UgD3 = abstractC2802UgD3.a(c3469fo.r, c3469fo2.r);
        }
        return abstractC2802UgD3.f();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3381eo
    public final int a() {
        return this.o;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3381eo
    public final boolean b(AbstractC3381eo abstractC3381eo) {
        C3469fo c3469fo = (C3469fo) abstractC3381eo;
        if (this.n || Ug0.a(this.d.l, c3469fo.d.l)) {
            if (!this.f.d0) {
                if (this.p != c3469fo.p || this.q != c3469fo.q) {
                }
            }
            return true;
        }
        return false;
    }
}
