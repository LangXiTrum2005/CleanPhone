package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2739Rv implements InterfaceC4530rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3655hx f3688a;
    public final /* synthetic */ InterfaceC4530rv b;

    public C2739Rv(InterfaceC3655hx interfaceC3655hx, InterfaceC4530rv interfaceC4530rv) {
        this.f3688a = interfaceC3655hx;
        this.b = interfaceC4530rv;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
    public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C2713Qv c2713Qv;
        C2739Rv c2739Rv;
        if (interfaceC2857Wj instanceof C2713Qv) {
            c2713Qv = (C2713Qv) interfaceC2857Wj;
            int i = c2713Qv.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2713Qv.c = i - Integer.MIN_VALUE;
            } else {
                c2713Qv = new C2713Qv(this, interfaceC2857Wj);
            }
        } else {
            c2713Qv = new C2713Qv(this, interfaceC2857Wj);
        }
        Object objInvoke = c2713Qv.b;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c2713Qv.c;
        if (i2 == 0) {
            AbstractC3375el.b0(objInvoke);
            c2713Qv.f3633a = this;
            c2713Qv.c = 1;
            objInvoke = this.f3688a.invoke(this.b, obj, c2713Qv);
            if (objInvoke == enumC4602sk) {
                return enumC4602sk;
            }
            c2739Rv = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2739Rv = c2713Qv.f3633a;
            AbstractC3375el.b0(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            return C5033xf0.f5238a;
        }
        throw new C3218d(c2739Rv);
    }
}
