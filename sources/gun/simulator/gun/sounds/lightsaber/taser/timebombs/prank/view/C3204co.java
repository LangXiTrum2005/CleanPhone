package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Comparator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3204co extends AbstractC3381eo implements Comparable {
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;

    public C3204co(int i, C3974ld0 c3974ld0, int i2, C2939Zn c2939Zn, int i3, String str) {
        int iE;
        super(i, i2, c3974ld0);
        int i4 = 0;
        this.f = C3557go.f(i3, false);
        int i5 = this.d.d & (~c2939Zn.u);
        this.g = (i5 & 1) != 0;
        this.h = (i5 & 2) != 0;
        AC ac = c2939Zn.s;
        AC acP = ac.isEmpty() ? AC.p("") : ac;
        int i6 = 0;
        while (true) {
            if (i6 >= acP.size()) {
                i6 = Integer.MAX_VALUE;
                iE = 0;
                break;
            } else {
                iE = C3557go.e(this.d, (String) acP.get(i6), c2939Zn.v);
                if (iE > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.i = i6;
        this.j = iE;
        int iB = C3557go.b(this.d.e, c2939Zn.t);
        this.k = iB;
        this.m = (this.d.e & 1088) != 0;
        int iE2 = C3557go.e(this.d, str, C3557go.h(str) == null);
        this.l = iE2;
        boolean z = iE > 0 || (ac.isEmpty() && iB > 0) || this.g || (this.h && iE2 > 0);
        if (C3557go.f(i3, c2939Zn.k0) && z) {
            i4 = 1;
        }
        this.e = i4;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3381eo
    public final int a() {
        return this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3381eo
    public final /* bridge */ /* synthetic */ boolean b(AbstractC3381eo abstractC3381eo) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3204co c3204co) {
        AbstractC2802Ug abstractC2802UgD = AbstractC2802Ug.f3832a.d(this.f, c3204co.f);
        Integer numValueOf = Integer.valueOf(this.i);
        Integer numValueOf2 = Integer.valueOf(c3204co.i);
        Comparator comparator = C4222oR.f4790a;
        comparator.getClass();
        QZ qz = QZ.f3606a;
        AbstractC2802Ug abstractC2802UgC = abstractC2802UgD.c(numValueOf, numValueOf2, qz);
        int i = this.j;
        AbstractC2802Ug abstractC2802UgA = abstractC2802UgC.a(i, c3204co.j);
        int i2 = this.k;
        AbstractC2802Ug abstractC2802UgD2 = abstractC2802UgA.a(i2, c3204co.k).d(this.g, c3204co.g);
        Boolean boolValueOf = Boolean.valueOf(this.h);
        Boolean boolValueOf2 = Boolean.valueOf(c3204co.h);
        if (i != 0) {
            comparator = qz;
        }
        AbstractC2802Ug abstractC2802UgA2 = abstractC2802UgD2.c(boolValueOf, boolValueOf2, comparator).a(this.l, c3204co.l);
        if (i2 == 0) {
            abstractC2802UgA2 = abstractC2802UgA2.e(this.m, c3204co.m);
        }
        return abstractC2802UgA2.f();
    }
}
