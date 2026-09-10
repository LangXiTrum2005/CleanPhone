package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.LightSaber;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.MechanicalGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Taser;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TechnologyGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.LinerCustomSeekBar;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Y50 implements InterfaceC4740uI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z50 f4005a;

    public Y50(Z50 z50) {
        this.f4005a = z50;
    }

    public final void a(LinerCustomSeekBar linerCustomSeekBar) {
        LifecycleCoroutineScope lifecycleScope;
        AbstractC2995aW.q(linerCustomSeekBar, "seekBar");
        Z50 z50 = this.f4005a;
        int i = z50.d;
        int progress = linerCustomSeekBar.getProgress();
        WeaponUseActivity weaponUseActivity = z50.c;
        if (i != progress && weaponUseActivity.j) {
            int i2 = weaponUseActivity.h;
            if (i2 == 0) {
                S3.b("machine_gun_control_click", "shake_slider");
            } else if (i2 == 1) {
                S3.b("lightsaber_control_click", "shake_slider");
            } else if (i2 == 2) {
                S3.b("taser_control_click", "shake_slider");
            } else if (i2 == 4) {
                S3.b("sci_fi_control_click", "shake_slider");
            }
            weaponUseActivity.j = false;
        }
        LifecycleOwner lifecycleOwner = z50.b;
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            WD.D(lifecycleScope, null, 0, new X50(linerCustomSeekBar, null), 3);
        }
        Weapon weaponN = weaponUseActivity.n();
        if (weaponN instanceof MechanicalGun) {
            List listK = AbstractC2340Cl.K(Integer.valueOf(R.string.weapon_name_m2_flamethrower), Integer.valueOf(R.string.weapon_name_rpg_7), Integer.valueOf(R.string.weapon_name_m84));
            Weapon weaponN2 = weaponUseActivity.n();
            if (AbstractC2853Wf.d0(listK, weaponN2 != null ? Integer.valueOf(weaponN2.getNameId()) : null)) {
                AbstractC4340pk0 abstractC4340pk0 = weaponUseActivity.d;
                AbstractC2995aW.o(abstractC4340pk0, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.SpecialGunHelper");
                ((C4370q40) ((C5081y80) abstractC4340pk0).x.getValue()).c(linerCustomSeekBar.getProgress());
                return;
            } else {
                AbstractC4340pk0 abstractC4340pk1 = weaponUseActivity.d;
                AbstractC2995aW.o(abstractC4340pk1, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.GunFireHelper");
                ((C2612My) abstractC4340pk1).w().c(linerCustomSeekBar.getProgress());
                return;
            }
        }
        if (weaponN instanceof LightSaber) {
            AbstractC4340pk0 abstractC4340pk2 = weaponUseActivity.d;
            AbstractC2995aW.o(abstractC4340pk2, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.LightSaberFireHelper");
            ((C4213oI) abstractC4340pk2).w().c(linerCustomSeekBar.getProgress());
        } else if (weaponN instanceof Taser) {
            AbstractC4340pk0 abstractC4340pk3 = weaponUseActivity.d;
            AbstractC2995aW.o(abstractC4340pk3, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.TaserFireHelper");
            ((C3794jb0) abstractC4340pk3).w().c(linerCustomSeekBar.getProgress());
        } else if (weaponN instanceof TechnologyGun) {
            AbstractC4340pk0 abstractC4340pk4 = weaponUseActivity.d;
            AbstractC2995aW.o(abstractC4340pk4, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.TechnologyFireHelper");
            ((Gb0) abstractC4340pk4).w().c(linerCustomSeekBar.getProgress());
        }
    }
}
