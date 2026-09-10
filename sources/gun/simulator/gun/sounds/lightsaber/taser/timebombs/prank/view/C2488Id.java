package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.LightSaber;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.MechanicalGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Taser;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TechnologyGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TimeBomb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2488Id extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogC2540Kd f3229a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2488Id(DialogC2540Kd dialogC2540Kd, int i, int i2, int i3, int i4, int i5, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3229a = dialogC2540Kd;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C2488Id(this.f3229a, this.b, this.c, this.d, this.e, this.f, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C2488Id c2488Id = (C2488Id) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c2488Id.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        DialogC2540Kd dialogC2540Kd = this.f3229a;
        Weapon weapon = dialogC2540Kd.b;
        if (weapon instanceof MechanicalGun) {
            dialogC2540Kd.d.g(new Integer(DialogC2540Kd.d(dialogC2540Kd, this.b)));
        } else if (weapon instanceof LightSaber) {
            dialogC2540Kd.d.g(new Integer(DialogC2540Kd.d(dialogC2540Kd, this.c)));
        } else if (weapon instanceof Taser) {
            dialogC2540Kd.d.g(new Integer(DialogC2540Kd.d(dialogC2540Kd, this.d)));
        } else if (weapon instanceof TimeBomb) {
            dialogC2540Kd.d.g(new Integer(DialogC2540Kd.d(dialogC2540Kd, this.e)));
        } else if (weapon instanceof TechnologyGun) {
            dialogC2540Kd.d.g(new Integer(DialogC2540Kd.d(dialogC2540Kd, this.f)));
        }
        return C5033xf0.f5238a;
    }
}
