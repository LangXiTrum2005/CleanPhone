package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4939wc0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5187a;
    public final /* synthetic */ EnumC3410f70 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4939wc0(EnumC3410f70 enumC3410f70, boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = enumC3410f70;
        this.c = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4939wc0(this.b, this.c, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4939wc0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f5187a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3375el.b0(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        this.f5187a = 1;
        if (this.b.a(this) == enumC4602sk) {
            return enumC4602sk;
        }
        if (this.c) {
            EnumC3410f70 enumC3410f70 = EnumC3410f70.BombBtnC4;
            this.f5187a = 2;
            if (enumC3410f70.a(this) == enumC4602sk) {
                return enumC4602sk;
            }
        }
        return C5033xf0.f5238a;
    }
}
