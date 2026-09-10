package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3537ge extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4423a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3625he c;
    public final /* synthetic */ InterfaceC4530rv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3537ge(C3625he c3625he, InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = c3625he;
        this.d = interfaceC4530rv;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C3537ge c3537ge = new C3537ge(this.c, this.d, interfaceC2857Wj);
        c3537ge.b = obj;
        return c3537ge;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3537ge) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4423a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) this.b;
            C3086bY c3086bY = new C3086bY();
            C3625he c3625he = this.c;
            InterfaceC4443qv interfaceC4443qv = c3625he.d;
            C3449fe c3449fe = new C3449fe(c3086bY, interfaceC4514rk, c3625he, this.d);
            this.f4423a = 1;
            if (interfaceC4443qv.collect(c3449fe, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return C5033xf0.f5238a;
    }
}
