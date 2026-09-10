package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.a70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2968a70 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4110a;
    public final /* synthetic */ EnumC3410f70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2968a70(EnumC3410f70 enumC3410f70, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = enumC3410f70;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C2968a70(this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C2968a70) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4110a;
        EnumC3410f70 enumC3410f70 = this.b;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            if (enumC3410f70.b <= 0) {
                this.f4110a = 1;
                if (enumC3410f70.a(this) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return new Integer(enumC3410f70.b);
    }
}
