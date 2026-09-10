package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class Jj0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3277a;
    public final /* synthetic */ C3109bk0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jj0(C3109bk0 c3109bk0, String str, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = c3109bk0;
        this.c = str;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new Jj0(this.b, this.c, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Jj0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3277a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            this.f3277a = 1;
            C3109bk0 c3109bk0 = this.b;
            c3109bk0.getClass();
            if (WD.X(new Oj0(c3109bk0, this.c, null), AbstractC4437qp.b, this) == enumC4602sk) {
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
