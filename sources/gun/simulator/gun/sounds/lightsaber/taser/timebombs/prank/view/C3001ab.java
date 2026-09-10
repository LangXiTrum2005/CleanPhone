package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3001ab extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4127a;
    public final /* synthetic */ C3355eb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3001ab(C3355eb c3355eb, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = c3355eb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3001ab(this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3001ab) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4127a;
        C3355eb c3355eb = this.b;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            EnumC3410f70 enumC3410f70 = c3355eb.y;
            if (enumC3410f70 != null) {
                this.f4127a = 1;
                obj = EnumC3410f70.b(enumC3410f70, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
            }
            c3355eb.w = true;
            return C5033xf0.f5238a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC3375el.b0(obj);
        c3355eb.w = true;
        return C5033xf0.f5238a;
    }
}
