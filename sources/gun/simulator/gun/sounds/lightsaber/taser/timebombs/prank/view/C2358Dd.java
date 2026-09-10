package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2358Dd extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2978a;
    public /* synthetic */ Object b;
    public final /* synthetic */ DialogC2384Ed c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2358Dd(DialogC2384Ed dialogC2384Ed, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = dialogC2384Ed;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C2358Dd c2358Dd = new C2358Dd(this.c, interfaceC2857Wj);
        c2358Dd.b = obj;
        return c2358Dd;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C2358Dd) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f2978a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            C2332Cd c2332Cd = new C2332Cd(this.c, ((Number) ((C2856Wi) AbstractC2934Zi.c.getValue()).a()).intValue(), null);
            this.f2978a = 1;
            if (AbstractC3651ht.d(c2332Cd, this) == enumC4602sk) {
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
