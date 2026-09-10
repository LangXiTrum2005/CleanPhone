package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.LightSaber;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.MechanicalGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Taser;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TechnologyGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: loaded from: classes4.dex */
public final class Yk0 implements SpineController.SpineAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeaponUseActivity f4038a;

    public Yk0(WeaponUseActivity weaponUseActivity) {
        this.f4038a = weaponUseActivity;
    }

    @Override // com.badlogic.gdx.backends.android.SpineController.SpineAnimationCallback
    public final void onSpineAnimationChanged(SpineController spineController, View view) {
        Weapon weaponN;
        String name;
        AbstractC2995aW.q(spineController, "controller");
        WeaponUseActivity weaponUseActivity = this.f4038a;
        Weapon weaponN2 = weaponUseActivity.n();
        Weapon.CREATOR creator = Weapon.CREATOR;
        if (AbstractC2995aW.i(weaponN2, creator.getWeaponByNameResId(R.string.weapon_name_m2_flamethrower))) {
            spineController.showSlot("M2_FLAMETHROWER", "M2 Flamethrower");
            WeaponUseActivity.j(weaponUseActivity, view);
            return;
        }
        if (AbstractC2995aW.i(weaponN2, creator.getWeaponByNameResId(R.string.weapon_name_rpg_7))) {
            spineController.showSlot("RPG-7", "RPG-7_ canno barrel");
            spineController.showSlot("RPG-7", "bullet");
            WeaponUseActivity.j(weaponUseActivity, view);
            return;
        }
        if (AbstractC2995aW.i(weaponN2, creator.getWeaponByNameResId(R.string.weapon_name_m84))) {
            spineController.showSlot("M84", "M84");
            WeaponUseActivity.j(weaponUseActivity, view);
            return;
        }
        if (weaponN2 instanceof MechanicalGun) {
            WD.D(LifecycleOwnerKt.getLifecycleScope(weaponUseActivity), null, 0, new Sk0(weaponUseActivity, spineController, view, null), 3);
            return;
        }
        if (weaponN2 instanceof Taser) {
            WD.D(LifecycleOwnerKt.getLifecycleScope(weaponUseActivity), null, 0, new Vk0(weaponUseActivity, spineController, view, null), 3);
            return;
        }
        if (weaponN2 instanceof LightSaber) {
            WD.D(LifecycleOwnerKt.getLifecycleScope(weaponUseActivity), null, 0, new Ok0(weaponUseActivity, spineController, view, null), 3);
        } else {
            if (!(weaponN2 instanceof TechnologyGun) || (weaponN = weaponUseActivity.n()) == null || (name = weaponN.getName()) == null) {
                return;
            }
            WD.D(LifecycleOwnerKt.getLifecycleScope(weaponUseActivity), null, 0, new Xk0(weaponUseActivity, name, spineController, view, null), 3);
        }
    }
}
