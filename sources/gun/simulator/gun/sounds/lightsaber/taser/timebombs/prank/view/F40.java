package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class F40 implements D40, InterfaceC2331Cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3052a;
    public final L40 b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final D40[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final D40[] k;
    public final Ma0 l;

    public F40(String str, L40 l40, int i, List list, C3275df c3275df) {
        AbstractC2995aW.q(str, "serialName");
        this.f3052a = str;
        this.b = l40;
        this.c = i;
        this.d = c3275df.f4282a;
        ArrayList arrayList = c3275df.b;
        AbstractC2995aW.q(arrayList, "<this>");
        HashSet hashSet = new HashSet(AbstractC3375el.N(AbstractC2749Sf.Y(12, arrayList)));
        AbstractC2853Wf.t0(arrayList, hashSet);
        this.e = hashSet;
        int i2 = 0;
        Object[] array = arrayList.toArray(new String[0]);
        AbstractC2995aW.o(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f = (String[]) array;
        this.g = AbstractC2871Wx.W(c3275df.d);
        Object[] array2 = c3275df.e.toArray(new List[0]);
        AbstractC2995aW.o(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.h = (List[]) array2;
        ArrayList arrayList2 = c3275df.f;
        AbstractC2995aW.q(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.i = zArr;
        String[] strArr = this.f;
        AbstractC2995aW.q(strArr, "<this>");
        C3242dD<C3153cD> c3242dD = new C3242dD(new X9(strArr, 10));
        ArrayList arrayList3 = new ArrayList(AbstractC2749Sf.Y(10, c3242dD));
        for (C3153cD c3153cD : c3242dD) {
            arrayList3.add(new C4839vT(c3153cD.b, Integer.valueOf(c3153cD.f4212a)));
        }
        this.j = U5.A0(arrayList3);
        this.k = AbstractC2871Wx.W(list);
        this.l = AbstractC2340Cl.I(new X9(this, 13));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2331Cc
    public final Set a() {
        return this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean b() {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final int c(String str) {
        AbstractC2995aW.q(str, "name");
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final int d() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final String e(int i) {
        return this.f[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F40) {
            D40 d40 = (D40) obj;
            if (AbstractC2995aW.i(h(), d40.h()) && Arrays.equals(this.k, ((F40) obj).k) && d() == d40.d()) {
                int iD = d();
                for (int i = 0; i < iD; i++) {
                    if (AbstractC2995aW.i(g(i).h(), d40.g(i).h()) && AbstractC2995aW.i(g(i).getKind(), d40.g(i).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final List f(int i) {
        return this.h[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final D40 g(int i) {
        return this.g[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final List getAnnotations() {
        return this.d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final L40 getKind() {
        return this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final String h() {
        return this.f3052a;
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean i(int i) {
        return this.i[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return AbstractC2853Wf.l0(AbstractC3375el.f0(0, this.c), ", ", DM.l(new StringBuilder(), this.f3052a, '('), ")", new C4140nX(this, 14), 24);
    }
}
