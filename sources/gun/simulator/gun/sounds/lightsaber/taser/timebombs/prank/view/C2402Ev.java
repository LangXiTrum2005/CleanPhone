package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2402Ev implements InterfaceC4443qv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4443qv f3045a;
    public final /* synthetic */ InterfaceC3655hx b;

    public C2402Ev(InterfaceC4443qv interfaceC4443qv, InterfaceC3655hx interfaceC3655hx) {
        this.f3045a = interfaceC4443qv;
        this.b = interfaceC3655hx;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
    public final Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        C2376Dv c2376Dv;
        C2402Ev c2402Ev;
        if (interfaceC2857Wj instanceof C2376Dv) {
            c2376Dv = (C2376Dv) interfaceC2857Wj;
            int i = c2376Dv.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2376Dv.b = i - Integer.MIN_VALUE;
            } else {
                c2376Dv = new C2376Dv(this, interfaceC2857Wj);
            }
        } else {
            c2376Dv = new C2376Dv(this, interfaceC2857Wj);
        }
        Object objK = c2376Dv.f2997a;
        Object obj = EnumC4602sk.f4993a;
        int i2 = c2376Dv.b;
        if (i2 != 0) {
            if (i2 == 1) {
                interfaceC4530rv = c2376Dv.e;
                c2402Ev = c2376Dv.d;
                AbstractC3375el.b0(objK);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(objK);
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(objK);
        c2376Dv.d = this;
        c2376Dv.e = interfaceC4530rv;
        c2376Dv.b = 1;
        objK = AbstractC3375el.k(c2376Dv, this.f3045a, interfaceC4530rv);
        if (objK == obj) {
            return obj;
        }
        c2402Ev = this;
        Throwable th = (Throwable) objK;
        if (th != null) {
            InterfaceC3655hx interfaceC3655hx = c2402Ev.b;
            c2376Dv.d = null;
            c2376Dv.e = null;
            c2376Dv.b = 2;
            if (interfaceC3655hx.invoke(interfaceC4530rv, th, c2376Dv) == obj) {
                return obj;
            }
        }
        return C5033xf0.f5238a;
    }
}
