package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.ShootEffect;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2643Od extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3510a;
    public /* synthetic */ Object b;
    public final /* synthetic */ DialogC2799Ud c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2643Od(DialogC2799Ud dialogC2799Ud, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = dialogC2799Ud;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C2643Od c2643Od = new C2643Od(this.c, interfaceC2857Wj);
        c2643Od.b = obj;
        return c2643Od;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C2643Od) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3510a;
        DialogC2799Ud dialogC2799Ud = this.c;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            C2617Nd c2617Nd = new C2617Nd(dialogC2799Ud, null);
            this.f3510a = 1;
            obj = WD.X(c2617Nd, AbstractC4437qp.b, this);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        String str = (String) obj;
        for (ShootEffect shootEffect : AbstractC4781ul0.d) {
            if (AbstractC2995aW.i(dialogC2799Ud.getContext().getResources().getString(shootEffect.getEffectNameId()), str)) {
                dialogC2799Ud.d.g(shootEffect);
                break;
            }
        }
        return C5033xf0.f5238a;
    }
}
