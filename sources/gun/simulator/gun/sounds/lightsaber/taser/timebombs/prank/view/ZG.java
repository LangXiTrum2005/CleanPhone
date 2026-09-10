package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ZG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4062a;
    public final MJ b;
    public final String c;
    public final long d;
    public final int e;
    public final long f;
    public final String g;
    public final List h;
    public final M4 i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final F4 q;
    public final C3692iN r;
    public final G4 s;
    public final List t;
    public final int u;
    public final boolean v;
    public final NN w;
    public final L4 x;
    public final int y;

    public ZG(List list, MJ mj, String str, long j, int i, long j2, String str2, List list2, M4 m4, int i2, int i3, int i4, float f, float f2, float f3, float f4, F4 f5, C3692iN c3692iN, List list3, int i5, G4 g4, boolean z, NN nn, L4 l4, int i6) {
        this.f4062a = list;
        this.b = mj;
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = m4;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = f5;
        this.r = c3692iN;
        this.t = list3;
        this.u = i5;
        this.s = g4;
        this.v = z;
        this.w = nn;
        this.x = l4;
        this.y = i6;
    }

    public final String a(String str) {
        int i;
        StringBuilder sbO = DM.o(str);
        sbO.append(this.c);
        sbO.append("\n");
        MJ mj = this.b;
        ZG zg = (ZG) mj.i.get(this.f);
        if (zg != null) {
            sbO.append("\t\tParents: ");
            sbO.append(zg.c);
            for (ZG zg2 = (ZG) mj.i.get(zg.f); zg2 != null; zg2 = (ZG) mj.i.get(zg2.f)) {
                sbO.append("->");
                sbO.append(zg2.c);
            }
            sbO.append(str);
            sbO.append("\n");
        }
        List list = this.h;
        if (!list.isEmpty()) {
            sbO.append(str);
            sbO.append("\tMasks: ");
            sbO.append(list.size());
            sbO.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            sbO.append(str);
            sbO.append("\tBackground: ");
            sbO.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List list2 = this.f4062a;
        if (!list2.isEmpty()) {
            sbO.append(str);
            sbO.append("\tShapes:\n");
            for (Object obj : list2) {
                sbO.append(str);
                sbO.append("\t\t");
                sbO.append(obj);
                sbO.append("\n");
            }
        }
        return sbO.toString();
    }

    public final String toString() {
        return a("");
    }
}
