package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2929Zd implements InterfaceC4443qv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3549gk f4081a;
    public final int b;
    public final EnumC5024xb c;

    public AbstractC2929Zd(InterfaceC3549gk interfaceC3549gk, int i, EnumC5024xb enumC5024xb) {
        this.f4081a = interfaceC3549gk;
        this.b = i;
        this.c = enumC5024xb;
    }

    public abstract Object c(VV vv, InterfaceC2857Wj interfaceC2857Wj);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
    public Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
        Object objM = WD.m(new C2877Xd(null, interfaceC4530rv, this), interfaceC2857Wj);
        return objM == EnumC4602sk.f4993a ? objM : C5033xf0.f5238a;
    }

    public abstract AbstractC2929Zd d(InterfaceC3549gk interfaceC3549gk, int i, EnumC5024xb enumC5024xb);

    public InterfaceC4443qv e() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final InterfaceC4443qv f(InterfaceC3549gk interfaceC3549gk, int i, EnumC5024xb enumC5024xb) {
        InterfaceC3549gk interfaceC3549gk2 = this.f4081a;
        InterfaceC3549gk interfaceC3549gkPlus = interfaceC3549gk.plus(interfaceC3549gk2);
        EnumC5024xb enumC5024xb2 = EnumC5024xb.f5229a;
        EnumC5024xb enumC5024xb3 = this.c;
        int i2 = this.b;
        if (enumC5024xb == enumC5024xb2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            enumC5024xb = enumC5024xb3;
        }
        return (AbstractC2995aW.i(interfaceC3549gkPlus, interfaceC3549gk2) && i == i2 && enumC5024xb == enumC5024xb3) ? this : d(interfaceC3549gkPlus, i, enumC5024xb);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        C2734Rq c2734Rq = C2734Rq.f3684a;
        InterfaceC3549gk interfaceC3549gk = this.f4081a;
        if (interfaceC3549gk != c2734Rq) {
            arrayList.add("context=" + interfaceC3549gk);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        EnumC5024xb enumC5024xb = EnumC5024xb.f5229a;
        EnumC5024xb enumC5024xb2 = this.c;
        if (enumC5024xb2 != enumC5024xb) {
            arrayList.add("onBufferOverflow=" + enumC5024xb2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return DM.l(sb, AbstractC2853Wf.l0(arrayList, ", ", null, null, null, 62), ']');
    }
}
