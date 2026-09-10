package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3348eV implements D40, InterfaceC2331Cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4321a;
    public final InterfaceC5060xx b;
    public final int c;
    public int d;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final InterfaceC3069bH i;
    public final InterfaceC3069bH j;
    public final InterfaceC3069bH k;

    public C3348eV(String str, InterfaceC5060xx interfaceC5060xx, int i) {
        AbstractC2995aW.q(str, "serialName");
        this.f4321a = str;
        this.b = interfaceC5060xx;
        this.c = i;
        this.d = -1;
        String[] strArr = new String[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.g = new boolean[i4];
        this.h = C2838Vq.f3896a;
        EnumC4124nH enumC4124nH = EnumC4124nH.b;
        this.i = AbstractC2340Cl.H(enumC4124nH, new C3260dV(this, 1));
        this.j = AbstractC2340Cl.H(enumC4124nH, new C3260dV(this, 2));
        this.k = AbstractC2340Cl.H(enumC4124nH, new C3260dV(this, i2));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2331Cc
    public final Set a() {
        return this.h.keySet();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean b() {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final int c(String str) {
        AbstractC2995aW.q(str, "name");
        Integer num = (Integer) this.h.get(str);
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
        return this.e[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3348eV) {
            D40 d40 = (D40) obj;
            if (AbstractC2995aW.i(this.f4321a, d40.h()) && Arrays.equals((D40[]) this.j.getValue(), (D40[]) ((C3348eV) obj).j.getValue())) {
                int iD = d40.d();
                int i = this.c;
                if (i == iD) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (AbstractC2995aW.i(g(i2).h(), d40.g(i2).h()) && AbstractC2995aW.i(g(i2).getKind(), d40.g(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final List f(int i) {
        List list = this.f[i];
        return list == null ? C2812Uq.f3846a : list;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public D40 g(int i) {
        return ((InterfaceC4123nG[]) this.i.getValue())[i].getDescriptor();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final List getAnnotations() {
        return C2812Uq.f3846a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public L40 getKind() {
        return C3442fa0.f4370a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final String h() {
        return this.f4321a;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean i(int i) {
        return this.g[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public boolean isInline() {
        return false;
    }

    public final void j(String str, boolean z) {
        AbstractC2995aW.q(str, "name");
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public String toString() {
        return AbstractC2853Wf.l0(AbstractC3375el.f0(0, this.c), ", ", DM.l(new StringBuilder(), this.f4321a, '('), ")", new C4140nX(this, 16), 24);
    }
}
