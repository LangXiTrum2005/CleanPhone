package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4706tv implements InterfaceC4443qv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5056a;
    public final Object b;

    public C4706tv() {
        EnumC4901w60 enumC4901w60 = EnumC4901w60.f5168a;
        this.f5056a = 0;
        this.b = enumC4901w60;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
    public final Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        C4184o c4184o;
        Throwable th;
        G20 g20;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f5056a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object objEmit = interfaceC4530rv.emit(obj, interfaceC2857Wj);
                return objEmit == enumC4602sk ? objEmit : c5033xf0;
            default:
                if (interfaceC2857Wj instanceof C4184o) {
                    c4184o = (C4184o) interfaceC2857Wj;
                    int i2 = c4184o.d;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c4184o.d = i2 - Integer.MIN_VALUE;
                    } else {
                        c4184o = new C4184o(this, interfaceC2857Wj);
                    }
                } else {
                    c4184o = new C4184o(this, interfaceC2857Wj);
                }
                Object obj2 = c4184o.b;
                int i3 = c4184o.d;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g20 = c4184o.f4770a;
                    try {
                        AbstractC3375el.b0(obj2);
                        g20.releaseIntercepted();
                        return c5033xf0;
                    } catch (Throwable th2) {
                        th = th2;
                        g20.releaseIntercepted();
                        throw th;
                    }
                }
                AbstractC3375el.b0(obj2);
                G20 g21 = new G20(interfaceC4530rv, c4184o.getContext());
                try {
                    c4184o.f4770a = g21;
                    c4184o.d = 1;
                    Object objInvoke = ((InterfaceC3567gx) obj).invoke(g21, c4184o);
                    if (objInvoke != enumC4602sk) {
                        objInvoke = c5033xf0;
                    }
                    if (objInvoke == enumC4602sk) {
                        return enumC4602sk;
                    }
                    g20 = g21;
                    g20.releaseIntercepted();
                    return c5033xf0;
                } catch (Throwable th3) {
                    th = th3;
                    g20 = g21;
                    g20.releaseIntercepted();
                    throw th;
                }
        }
    }

    public C4706tv(InterfaceC3567gx interfaceC3567gx) {
        this.f5056a = 1;
        this.b = interfaceC3567gx;
    }
}
