package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.lifecycle.LifecycleOwnerKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseRvAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.WeaponSorts;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5183zL extends WG implements InterfaceC3567gx {
    public final /* synthetic */ MainActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183zL(MainActivity mainActivity) {
        super(2);
        this.f = mainActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        WeaponSorts weaponSorts = (WeaponSorts) obj;
        BaseRvAdapter.ViewHolder viewHolder = (BaseRvAdapter.ViewHolder) obj2;
        AbstractC2995aW.q(weaponSorts, "data");
        AbstractC2995aW.q(viewHolder, "viewHolder");
        int i = MainActivity.j;
        MainActivity mainActivity = this.f;
        mainActivity.getClass();
        if (weaponSorts.getSortId() != 6) {
            WD.D(LifecycleOwnerKt.getLifecycleScope(mainActivity), null, 0, new C5007xL(mainActivity, viewHolder, weaponSorts, null), 3);
        }
        return C5033xf0.f5238a;
    }
}
