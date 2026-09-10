package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Av, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2298Av implements InterfaceC4443qv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4443qv f2843a;
    public final /* synthetic */ InterfaceC3655hx b;

    public C2298Av(C2350Cv c2350Cv, InterfaceC3655hx interfaceC3655hx) {
        this.f2843a = c2350Cv;
        this.b = interfaceC3655hx;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
    public final Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        C5234zv c5234zv;
        C2298Av c2298Av;
        C3710ic0 c3710ic0;
        InterfaceC3655hx interfaceC3655hx;
        G20 g20;
        Throwable th;
        G20 g21;
        InterfaceC3655hx interfaceC3655hx2;
        if (interfaceC2857Wj instanceof C5234zv) {
            c5234zv = (C5234zv) interfaceC2857Wj;
            int i = c5234zv.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5234zv.b = i - Integer.MIN_VALUE;
            } else {
                c5234zv = new C5234zv(this, interfaceC2857Wj);
            }
        } else {
            c5234zv = new C5234zv(this, interfaceC2857Wj);
        }
        Object obj = c5234zv.f5351a;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c5234zv.b;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            try {
                InterfaceC4443qv interfaceC4443qv = this.f2843a;
                c5234zv.d = this;
                c5234zv.e = interfaceC4530rv;
                c5234zv.b = 1;
                if (interfaceC4443qv.collect(interfaceC4530rv, c5234zv) == enumC4602sk) {
                    return enumC4602sk;
                }
                c2298Av = this;
                g20 = new G20(interfaceC4530rv, c5234zv.getContext());
                interfaceC3655hx2 = c2298Av.b;
                c5234zv.d = g20;
                c5234zv.e = null;
                c5234zv.b = 3;
                if (interfaceC3655hx2.invoke(g20, null, c5234zv) == enumC4602sk) {
                    return enumC4602sk;
                }
                g21 = g20;
                g21.releaseIntercepted();
                return C5033xf0.f5238a;
            } catch (Throwable th2) {
                th = th2;
                c2298Av = this;
                c3710ic0 = new C3710ic0(th);
                interfaceC3655hx = c2298Av.b;
                c5234zv.d = th;
                c5234zv.e = null;
                c5234zv.b = 2;
                if (WD.e(c3710ic0, interfaceC3655hx, th, c5234zv) == enumC4602sk) {
                    return enumC4602sk;
                }
                throw th;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                Throwable th3 = (Throwable) c5234zv.d;
                AbstractC3375el.b0(obj);
                throw th3;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g21 = (G20) c5234zv.d;
            try {
                AbstractC3375el.b0(obj);
                g21.releaseIntercepted();
                return C5033xf0.f5238a;
            } catch (Throwable th4) {
                th = th4;
                g21.releaseIntercepted();
                throw th;
            }
        }
        interfaceC4530rv = c5234zv.e;
        c2298Av = (C2298Av) c5234zv.d;
        try {
            AbstractC3375el.b0(obj);
            g20 = new G20(interfaceC4530rv, c5234zv.getContext());
            try {
                interfaceC3655hx2 = c2298Av.b;
                c5234zv.d = g20;
                c5234zv.e = null;
                c5234zv.b = 3;
                if (interfaceC3655hx2.invoke(g20, null, c5234zv) == enumC4602sk) {
                    return enumC4602sk;
                }
                g21 = g20;
                g21.releaseIntercepted();
                return C5033xf0.f5238a;
            } catch (Throwable th5) {
                th = th5;
                g21 = g20;
                g21.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            c3710ic0 = new C3710ic0(th);
            interfaceC3655hx = c2298Av.b;
            c5234zv.d = th;
            c5234zv.e = null;
            c5234zv.b = 2;
            if (WD.e(c3710ic0, interfaceC3655hx, th, c5234zv) == enumC4602sk) {
                return enumC4602sk;
            }
            throw th;
        }
    }
}
