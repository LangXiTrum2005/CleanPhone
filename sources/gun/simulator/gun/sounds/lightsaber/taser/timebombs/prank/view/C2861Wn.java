package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2861Wn extends AbstractC3381eo implements Comparable {
    public final int e;
    public final boolean f;
    public final String g;
    public final C2939Zn h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    public final int n;
    public final int o;
    public final boolean p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public final boolean v;

    public C2861Wn(int i, C3974ld0 c3974ld0, int i2, C2939Zn c2939Zn, int i3, boolean z, C2835Vn c2835Vn) {
        int i4;
        int iE;
        int iE2;
        boolean z2;
        super(i, i2, c3974ld0);
        this.h = c2939Zn;
        this.g = C3557go.h(this.d.c);
        int i5 = 0;
        this.i = C3557go.f(i3, false);
        int i6 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i6 >= c2939Zn.n.size()) {
                i6 = Integer.MAX_VALUE;
                iE = 0;
                break;
            } else {
                iE = C3557go.e(this.d, (String) c2939Zn.n.get(i6), false);
                if (iE > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.k = i6;
        this.j = iE;
        this.l = C3557go.b(this.d.e, c2939Zn.o);
        C4619sw c4619sw = this.d;
        int i7 = c4619sw.e;
        this.m = i7 == 0 || (i7 & 1) != 0;
        this.p = (c4619sw.d & 1) != 0;
        int i8 = c4619sw.y;
        this.q = i8;
        this.r = c4619sw.z;
        int i9 = c4619sw.h;
        this.s = i9;
        this.f = (i9 == -1 || i9 <= c2939Zn.q) && (i8 == -1 || i8 <= c2939Zn.p) && c2835Vn.apply(c4619sw);
        String[] strArrD = Ug0.D();
        int i10 = 0;
        while (true) {
            if (i10 >= strArrD.length) {
                i10 = Integer.MAX_VALUE;
                iE2 = 0;
                break;
            } else {
                iE2 = C3557go.e(this.d, strArrD[i10], false);
                if (iE2 > 0) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.n = i10;
        this.o = iE2;
        int i11 = 0;
        while (true) {
            AC ac = c2939Zn.r;
            if (i11 < ac.size()) {
                String str = this.d.l;
                if (str != null && str.equals(ac.get(i11))) {
                    i4 = i11;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        this.t = i4;
        this.u = AbstractC3950lJ.c(i3) == 128;
        this.v = AbstractC3950lJ.d(i3) == 64;
        C2939Zn c2939Zn2 = this.h;
        if (C3557go.f(i3, c2939Zn2.k0) && ((z2 = this.f) || c2939Zn2.e0)) {
            i5 = (!C3557go.f(i3, false) || !z2 || this.d.h == -1 || c2939Zn2.x || c2939Zn2.w || (!c2939Zn2.m0 && z)) ? 1 : 2;
        }
        this.e = i5;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3381eo
    public final int a() {
        return this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3381eo
    public final boolean b(AbstractC3381eo abstractC3381eo) {
        int i;
        String str;
        int i2;
        C2861Wn c2861Wn = (C2861Wn) abstractC3381eo;
        C2939Zn c2939Zn = this.h;
        boolean z = c2939Zn.h0;
        C4619sw c4619sw = c2861Wn.d;
        C4619sw c4619sw2 = this.d;
        if ((z || ((i2 = c4619sw2.y) != -1 && i2 == c4619sw.y)) && ((c2939Zn.f0 || ((str = c4619sw2.l) != null && TextUtils.equals(str, c4619sw.l))) && (c2939Zn.g0 || ((i = c4619sw2.z) != -1 && i == c4619sw.z)))) {
            if (!c2939Zn.i0) {
                if (this.u != c2861Wn.u || this.v != c2861Wn.v) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2861Wn c2861Wn) {
        boolean z = this.i;
        boolean z2 = this.f;
        AbstractC2992aT abstractC2992aTA = (z2 && z) ? C3557go.j : C3557go.j.a();
        AbstractC2802Ug abstractC2802UgD = AbstractC2802Ug.f3832a.d(z, c2861Wn.i);
        Integer numValueOf = Integer.valueOf(this.k);
        Integer numValueOf2 = Integer.valueOf(c2861Wn.k);
        C4222oR.f4790a.getClass();
        QZ qz = QZ.f3606a;
        AbstractC2802Ug abstractC2802UgC = abstractC2802UgD.c(numValueOf, numValueOf2, qz).a(this.j, c2861Wn.j).a(this.l, c2861Wn.l).d(this.p, c2861Wn.p).d(this.m, c2861Wn.m).c(Integer.valueOf(this.n), Integer.valueOf(c2861Wn.n), qz).a(this.o, c2861Wn.o).d(z2, c2861Wn.f).c(Integer.valueOf(this.t), Integer.valueOf(c2861Wn.t), qz);
        int i = this.s;
        Integer numValueOf3 = Integer.valueOf(i);
        int i2 = c2861Wn.s;
        AbstractC2802Ug abstractC2802UgC2 = abstractC2802UgC.c(numValueOf3, Integer.valueOf(i2), this.h.w ? C3557go.j.a() : C3557go.k).d(this.u, c2861Wn.u).d(this.v, c2861Wn.v).c(Integer.valueOf(this.q), Integer.valueOf(c2861Wn.q), abstractC2992aTA).c(Integer.valueOf(this.r), Integer.valueOf(c2861Wn.r), abstractC2992aTA);
        Integer numValueOf4 = Integer.valueOf(i);
        Integer numValueOf5 = Integer.valueOf(i2);
        if (!Ug0.a(this.g, c2861Wn.g)) {
            abstractC2992aTA = C3557go.k;
        }
        return abstractC2802UgC2.c(numValueOf4, numValueOf5, abstractC2992aTA).f();
    }
}
