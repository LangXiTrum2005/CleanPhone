package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3184ce extends AbstractC2929Zd {
    public final InterfaceC4443qv d;

    public AbstractC3184ce(int i, InterfaceC3549gk interfaceC3549gk, EnumC5024xb enumC5024xb, InterfaceC4443qv interfaceC4443qv) {
        super(interfaceC3549gk, i, enumC5024xb);
        this.d = interfaceC4443qv;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2929Zd
    public final Object c(VV vv, InterfaceC2857Wj interfaceC2857Wj) {
        Object objG = g(new C3930l40(vv), interfaceC2857Wj);
        return objG == EnumC4602sk.f4993a ? objG : C5033xf0.f5238a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2929Zd, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
    public final Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
        Object objCollect;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (this.b == -3) {
            InterfaceC3549gk context = interfaceC2857Wj.getContext();
            InterfaceC3549gk interfaceC3549gkPlus = context.plus(this.f4081a);
            if (AbstractC2995aW.i(interfaceC3549gkPlus, context)) {
                objCollect = g(interfaceC4530rv, interfaceC2857Wj);
                if (objCollect != EnumC4602sk.f4993a) {
                    return c5033xf0;
                }
            } else {
                G7 g7 = G7.d;
                if (AbstractC2995aW.i(interfaceC3549gkPlus.get(g7), context.get(g7))) {
                    InterfaceC3549gk context2 = interfaceC2857Wj.getContext();
                    if (!(interfaceC4530rv instanceof C3930l40) && !(interfaceC4530rv instanceof PR)) {
                        interfaceC4530rv = new C4964wp(interfaceC4530rv, context2);
                    }
                    objCollect = AbstractC3375el.g0(interfaceC3549gkPlus, interfaceC4530rv, AbstractC3181cc0.b(interfaceC3549gkPlus), new C3096be(this, null), interfaceC2857Wj);
                    EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                    if (objCollect != enumC4602sk) {
                        objCollect = c5033xf0;
                    }
                    if (objCollect != enumC4602sk) {
                        return c5033xf0;
                    }
                } else {
                    objCollect = super.collect(interfaceC4530rv, interfaceC2857Wj);
                    if (objCollect != EnumC4602sk.f4993a) {
                        return c5033xf0;
                    }
                }
            }
        } else {
            objCollect = super.collect(interfaceC4530rv, interfaceC2857Wj);
            if (objCollect != EnumC4602sk.f4993a) {
                return c5033xf0;
            }
        }
        return objCollect;
    }

    public abstract Object g(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2929Zd
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
