package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ok0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4252ok0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4804a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AbstractC4340pk0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4252ok0(AbstractC4340pk0 abstractC4340pk0, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = abstractC4340pk0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C4252ok0 c4252ok0 = new C4252ok0(this.c, interfaceC2857Wj);
        c4252ok0.b = obj;
        return c4252ok0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4252ok0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4804a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            C4164nk0 c4164nk0 = new C4164nk0(this.c, null);
            this.f4804a = 1;
            if (WD.X(c4164nk0, AbstractC4437qp.b, this) == enumC4602sk) {
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
