package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3949lI extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4642a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4213oI c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3949lI(C4213oI c4213oI, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = c4213oI;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C3949lI c3949lI = new C3949lI(this.c, interfaceC2857Wj);
        c3949lI.b = obj;
        return c3949lI;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3949lI) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4642a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            C3861kI c3861kI = new C3861kI(this.c, null);
            this.f4642a = 1;
            if (WD.X(c3861kI, AbstractC4437qp.b, this) == enumC4602sk) {
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
