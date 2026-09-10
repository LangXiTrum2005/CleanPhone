package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2350Cv implements InterfaceC4443qv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3567gx f2948a;
    public final /* synthetic */ InterfaceC4443qv b;

    public C2350Cv(InterfaceC3567gx interfaceC3567gx, InterfaceC4443qv interfaceC4443qv) {
        this.f2948a = interfaceC3567gx;
        this.b = interfaceC4443qv;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
    public final Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        C2324Bv c2324Bv;
        Throwable th;
        G20 g20;
        C2350Cv c2350Cv;
        InterfaceC4530rv interfaceC4530rv2;
        InterfaceC4443qv interfaceC4443qv;
        if (interfaceC2857Wj instanceof C2324Bv) {
            c2324Bv = (C2324Bv) interfaceC2857Wj;
            int i = c2324Bv.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2324Bv.b = i - Integer.MIN_VALUE;
            } else {
                c2324Bv = new C2324Bv(this, interfaceC2857Wj);
            }
        } else {
            c2324Bv = new C2324Bv(this, interfaceC2857Wj);
        }
        Object obj = c2324Bv.f2898a;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c2324Bv.b;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            G20 g21 = new G20(interfaceC4530rv, c2324Bv.getContext());
            try {
                InterfaceC3567gx interfaceC3567gx = this.f2948a;
                c2324Bv.d = this;
                c2324Bv.e = interfaceC4530rv;
                c2324Bv.f = g21;
                c2324Bv.b = 1;
                if (interfaceC3567gx.invoke(g21, c2324Bv) == enumC4602sk) {
                    return enumC4602sk;
                }
                c2350Cv = this;
                interfaceC4530rv2 = interfaceC4530rv;
                g20 = g21;
                g20.releaseIntercepted();
                interfaceC4443qv = c2350Cv.b;
                c2324Bv.d = null;
                c2324Bv.e = null;
                c2324Bv.f = null;
                c2324Bv.b = 2;
                if (interfaceC4443qv.collect(interfaceC4530rv2, c2324Bv) == enumC4602sk) {
                    return enumC4602sk;
                }
            } catch (Throwable th2) {
                th = th2;
                g20 = g21;
                g20.releaseIntercepted();
                throw th;
            }
        } else if (i2 == 1) {
            g20 = c2324Bv.f;
            interfaceC4530rv2 = c2324Bv.e;
            c2350Cv = c2324Bv.d;
            try {
                AbstractC3375el.b0(obj);
                g20.releaseIntercepted();
                interfaceC4443qv = c2350Cv.b;
                c2324Bv.d = null;
                c2324Bv.e = null;
                c2324Bv.f = null;
                c2324Bv.b = 2;
                if (interfaceC4443qv.collect(interfaceC4530rv2, c2324Bv) == enumC4602sk) {
                    return enumC4602sk;
                }
            } catch (Throwable th3) {
                th = th3;
                g20.releaseIntercepted();
                throw th;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return C5033xf0.f5238a;
    }
}
