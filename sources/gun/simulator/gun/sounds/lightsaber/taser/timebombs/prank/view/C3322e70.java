package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.e70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3322e70 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4308a;
    public /* synthetic */ Object b;
    public final /* synthetic */ EnumC3410f70 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3322e70(EnumC3410f70 enumC3410f70, int i, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = enumC3410f70;
        this.d = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C3322e70 c3322e70 = new C3322e70(this.c, this.d, interfaceC2857Wj);
        c3322e70.b = obj;
        return c3322e70;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3322e70) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4308a;
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
        C3234d70 c3234d70 = new C3234d70(2, null);
        this.f4308a = 1;
        obj = WD.X(c3234d70, AbstractC4437qp.b, this);
        if (obj == enumC4602sk) {
            return enumC4602sk;
        }
        if (((Boolean) obj).booleanValue()) {
            this.f4308a = 2;
            EnumC3410f70 enumC3410f70 = this.c;
            enumC3410f70.getClass();
            if (WD.X(new C3145c70(enumC3410f70, this.d, null), AbstractC4437qp.b, this) == enumC4602sk) {
                return enumC4602sk;
            }
        }
        return C5033xf0.f5238a;
    }
}
