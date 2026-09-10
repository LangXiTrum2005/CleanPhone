package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3247dI extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f4264a;
    public int b;
    public final /* synthetic */ C4213oI c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3247dI(C4213oI c4213oI, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = c4213oI;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3247dI(this.c, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3247dI) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.b;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            Object objA = ((C2856Wi) AbstractC3194cj.I.getValue()).a();
            C2627Nn c2627Nn = AbstractC4437qp.f4904a;
            RL rl = TL.f3768a;
            C3158cI c3158cI = new C3158cI(this.c, (String) objA, null);
            this.f4264a = objA;
            this.b = 1;
            if (WD.X(c3158cI, rl, this) == enumC4602sk) {
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
