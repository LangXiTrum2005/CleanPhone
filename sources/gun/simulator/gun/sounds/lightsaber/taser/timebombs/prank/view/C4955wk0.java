package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.lifecycle.LifecycleOwnerKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseRvAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.WeaponSorts;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4955wk0 extends WG implements InterfaceC3567gx {
    public final /* synthetic */ WeaponSortActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4955wk0(WeaponSortActivity weaponSortActivity) {
        super(2);
        this.f = weaponSortActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        Weapon weapon = (Weapon) obj;
        AbstractC2995aW.q(weapon, "dataItem");
        AbstractC2995aW.q((BaseRvAdapter.ViewHolder) obj2, "viewHolder");
        WeaponSortActivity weaponSortActivity = this.f;
        WeaponSorts weaponSorts = weaponSortActivity.d;
        if (weaponSorts != null) {
            int sortId = weaponSorts.getSortId();
            String analyticsName = weapon.getAnalyticsName();
            AbstractC2995aW.q(analyticsName, "analyticName");
            if (sortId == 0) {
                S3.b("machine_gun_select", analyticsName);
            } else if (sortId == 1) {
                S3.b("lightsaber_select", analyticsName);
            } else if (sortId == 2) {
                S3.b("taser_select", analyticsName);
            } else if (sortId == 3) {
                S3.b("time_bomb_select", analyticsName);
            } else if (sortId == 4) {
                S3.b("sci_fi_gun_select", analyticsName);
            }
        }
        C2498In c2498In = App.n;
        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(weaponSortActivity, "button_sound/button_sound.ogg", null), 2);
        WD.D(LifecycleOwnerKt.getLifecycleScope(weaponSortActivity), null, 0, new C4867vk0(weaponSortActivity, weapon, null), 3);
        return C5033xf0.f5238a;
    }
}
