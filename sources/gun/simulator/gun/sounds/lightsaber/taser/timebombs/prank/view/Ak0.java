package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class Ak0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeaponSortActivity f2832a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ak0(WeaponSortActivity weaponSortActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f2832a = weaponSortActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new Ak0(this.f2832a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        Ak0 ak0 = (Ak0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        ak0.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        WeaponSortActivity weaponSortActivity = this.f2832a;
        DialogC2411Fe dialogC2411Fe = weaponSortActivity.c;
        if (dialogC2411Fe == null || !dialogC2411Fe.isShowing()) {
            WeaponSortActivity.h = true;
            DialogC2411Fe dialogC2411Fe2 = weaponSortActivity.c;
            if (dialogC2411Fe2 != null) {
                dialogC2411Fe2.b = false;
                dialogC2411Fe2.show();
            }
        }
        return C5033xf0.f5238a;
    }
}
