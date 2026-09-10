package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ma0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4056ma0 implements InterfaceC4530rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4530rv f4700a;
    public final InterfaceC3567gx b;

    public C4056ma0(InterfaceC4530rv interfaceC4530rv, InterfaceC3567gx interfaceC3567gx) {
        this.f4700a = interfaceC4530rv;
        this.b = interfaceC3567gx;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G20] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public final Object c(InterfaceC2857Wj interfaceC2857Wj) {
        C3968la0 c3968la0;
        G20 g20;
        C4056ma0 c4056ma0;
        if (interfaceC2857Wj instanceof C3968la0) {
            c3968la0 = (C3968la0) interfaceC2857Wj;
            int i = c3968la0.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3968la0.e = i - Integer.MIN_VALUE;
            } else {
                c3968la0 = new C3968la0(this, interfaceC2857Wj);
            }
        } else {
            c3968la0 = new C3968la0(this, interfaceC2857Wj);
        }
        Object obj = c3968la0.c;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        ?? r2 = c3968la0.e;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        try {
            if (r2 != 0) {
                if (r2 == 1) {
                    g20 = c3968la0.b;
                    c4056ma0 = c3968la0.f4650a;
                    AbstractC3375el.b0(obj);
                } else {
                    if (r2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj);
                }
                return c5033xf0;
            }
            AbstractC3375el.b0(obj);
            g20 = new G20(this.f4700a, c3968la0.getContext());
            InterfaceC3567gx interfaceC3567gx = this.b;
            c3968la0.f4650a = this;
            c3968la0.b = g20;
            c3968la0.e = 1;
            if (interfaceC3567gx.invoke(g20, c3968la0) == enumC4602sk) {
                return enumC4602sk;
            }
            c4056ma0 = this;
            g20.releaseIntercepted();
            InterfaceC4530rv interfaceC4530rv = c4056ma0.f4700a;
            r2 = interfaceC4530rv instanceof C4056ma0;
            if (r2 != 0) {
                c3968la0.f4650a = null;
                c3968la0.b = null;
                c3968la0.e = 2;
                if (((C4056ma0) interfaceC4530rv).c(c3968la0) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
            return c5033xf0;
        } catch (Throwable th) {
            r2.releaseIntercepted();
            throw th;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
    public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return this.f4700a.emit(obj, interfaceC2857Wj);
    }
}
