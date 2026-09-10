package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5212zh extends AbstractC3832k {
    public final int i;
    public final int j;
    public final int[] k;
    public final int[] l;
    public final Gc0[] m;
    public final Object[] n;
    public final HashMap o;

    public C5212zh(List list, D60 d60, boolean z) {
        super(z, d60);
        int size = list.size();
        this.k = new int[size];
        this.l = new int[size];
        this.m = new Gc0[size];
        this.n = new Object[size];
        this.o = new HashMap();
        Iterator it = list.iterator();
        int iP = 0;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            C2336Ch c2336Ch = (C2336Ch) it.next();
            Gc0[] gc0Arr = this.m;
            C4744uM c4744uM = c2336Ch.f2934a.o;
            gc0Arr[i2] = c4744uM;
            this.l[i2] = iP;
            this.k[i2] = i;
            iP += c4744uM.e.p();
            i += this.m[i2].i();
            Object[] objArr = this.n;
            Object obj = c2336Ch.b;
            objArr[i2] = obj;
            this.o.put(obj, Integer.valueOf(i2));
            i2++;
        }
        this.i = iP;
        this.j = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int i() {
        return this.j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int p() {
        return this.i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3832k
    public final int r(Object obj) {
        Integer num = (Integer) this.o.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3832k
    public final int s(int i) {
        return Ug0.e(this.k, i + 1, false, false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3832k
    public final int t(int i) {
        return Ug0.e(this.l, i + 1, false, false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3832k
    public final Object u(int i) {
        return this.n[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3832k
    public final int v(int i) {
        return this.k[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3832k
    public final int w(int i) {
        return this.l[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3832k
    public final Gc0 z(int i) {
        return this.m[i];
    }
}
