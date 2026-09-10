package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.s20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4541s20 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4959a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4629t20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4541s20(C4629t20 c4629t20, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = c4629t20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C4541s20 c4541s20 = new C4541s20(this.c, interfaceC2857Wj);
        c4541s20.b = obj;
        return c4541s20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4541s20) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4959a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            C4453r20 c4453r20 = new C4453r20(this.c, null);
            this.f4959a = 1;
            if (WD.X(c4453r20, AbstractC4437qp.b, this) == enumC4602sk) {
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
