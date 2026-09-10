package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Sv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2765Sv extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3742a;
    public /* synthetic */ Object b;
    public final /* synthetic */ InterfaceC4443qv c;
    public final /* synthetic */ InterfaceC3655hx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2765Sv(InterfaceC4443qv interfaceC4443qv, InterfaceC3655hx interfaceC3655hx, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = interfaceC4443qv;
        this.d = interfaceC3655hx;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C2765Sv c2765Sv = new C2765Sv(this.c, this.d, interfaceC2857Wj);
        c2765Sv.b = obj;
        return c2765Sv;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C2765Sv) create((InterfaceC4530rv) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        C2739Rv c2739Rv;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3742a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            InterfaceC4530rv interfaceC4530rv = (InterfaceC4530rv) this.b;
            InterfaceC4443qv interfaceC4443qv = this.c;
            C2739Rv c2739Rv2 = new C2739Rv(this.d, interfaceC4530rv);
            try {
                this.b = c2739Rv2;
                this.f3742a = 1;
                if (interfaceC4443qv.collect(c2739Rv2, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } catch (C3218d e) {
                e = e;
                c2739Rv = c2739Rv2;
                if (e.f4252a != c2739Rv) {
                    throw e;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2739Rv = (C2739Rv) this.b;
            try {
                AbstractC3375el.b0(obj);
            } catch (C3218d e2) {
                e = e2;
                if (e.f4252a != c2739Rv) {
                    throw e;
                }
            }
        }
        return C5033xf0.f5238a;
    }
}
