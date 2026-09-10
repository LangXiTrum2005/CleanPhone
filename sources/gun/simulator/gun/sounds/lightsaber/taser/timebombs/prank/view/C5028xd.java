package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5028xd extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5233a;
    public /* synthetic */ Object b;
    public final /* synthetic */ DialogC5116yd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5028xd(DialogC5116yd dialogC5116yd, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = dialogC5116yd;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C5028xd c5028xd = new C5028xd(this.c, interfaceC2857Wj);
        c5028xd.b = obj;
        return c5028xd;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C5028xd) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f5233a;
        DialogC5116yd dialogC5116yd = this.c;
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
        InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) this.b;
        C4940wd c4940wd = new C4940wd(dialogC5116yd, null);
        this.b = interfaceC4514rk;
        this.f5233a = 1;
        obj = WD.X(c4940wd, AbstractC4437qp.b, this);
        if (obj == enumC4602sk) {
            return enumC4602sk;
        }
        C4852vd c4852vd = new C4852vd((String) obj, dialogC5116yd, null);
        this.b = null;
        this.f5233a = 2;
        if (AbstractC3651ht.d(c4852vd, this) == enumC4602sk) {
            return enumC4602sk;
        }
        return C5033xf0.f5238a;
    }
}
