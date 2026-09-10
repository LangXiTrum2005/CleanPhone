package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvGunDisplayAdapter;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4515rk0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeaponSortActivity f4941a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4515rk0(WeaponSortActivity weaponSortActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4941a = weaponSortActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4515rk0(this.f4941a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C4515rk0 c4515rk0 = (C4515rk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c4515rk0.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        RvGunDisplayAdapter rvGunDisplayAdapter = this.f4941a.b;
        if (rvGunDisplayAdapter != null) {
            rvGunDisplayAdapter.notifyDataSetChanged();
        }
        return C5033xf0.f5238a;
    }
}
