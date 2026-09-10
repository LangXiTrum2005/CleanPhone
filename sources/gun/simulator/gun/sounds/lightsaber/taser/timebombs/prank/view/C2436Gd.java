package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvSceneChangeAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.LightSaber;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.MechanicalGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Taser;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TechnologyGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TimeBomb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2436Gd extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogC2540Kd f3129a;
    public final /* synthetic */ RvSceneChangeAdapter.SceneViewHolder b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2436Gd(DialogC2540Kd dialogC2540Kd, RvSceneChangeAdapter.SceneViewHolder sceneViewHolder, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3129a = dialogC2540Kd;
        this.b = sceneViewHolder;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C2436Gd(this.f3129a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C2436Gd c2436Gd = (C2436Gd) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c2436Gd.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC3375el.b0(obj);
        int adapterPosition = this.b.getAdapterPosition();
        DialogC2540Kd dialogC2540Kd = this.f3129a;
        int iE = DialogC2540Kd.e(dialogC2540Kd, adapterPosition);
        Weapon weapon = dialogC2540Kd.b;
        if (weapon instanceof MechanicalGun) {
            ((C2856Wi) AbstractC3194cj.c.getValue()).b(Integer.valueOf(iE));
        } else if (weapon instanceof LightSaber) {
            ((C2856Wi) AbstractC3194cj.d.getValue()).b(Integer.valueOf(iE));
        } else if (weapon instanceof Taser) {
            ((C2856Wi) AbstractC3194cj.e.getValue()).b(Integer.valueOf(iE));
        } else if (weapon instanceof TimeBomb) {
            ((C2856Wi) AbstractC3194cj.g.getValue()).b(Integer.valueOf(iE));
        } else if (weapon instanceof TechnologyGun) {
            ((C2856Wi) AbstractC3194cj.f.getValue()).b(Integer.valueOf(iE));
        }
        return C5033xf0.f5238a;
    }
}
