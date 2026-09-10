package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.ShootEffect;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4852vd extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5142a;
    public final /* synthetic */ DialogC5116yd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4852vd(String str, DialogC5116yd dialogC5116yd, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f5142a = str;
        this.b = dialogC5116yd;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4852vd(this.f5142a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C4852vd c4852vd = (C4852vd) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c4852vd.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        for (ShootEffect shootEffect : AbstractC4781ul0.e) {
            if (AbstractC2995aW.i(this.f5142a, shootEffect.getEffectName())) {
                this.b.d.g(shootEffect);
                break;
            }
        }
        return C5033xf0.f5238a;
    }
}
