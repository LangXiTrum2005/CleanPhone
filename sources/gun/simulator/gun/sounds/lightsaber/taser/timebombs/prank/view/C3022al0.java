package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityGunBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.al0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3022al0 extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ int f;
    public final /* synthetic */ WeaponUseActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3022al0(WeaponUseActivity weaponUseActivity, int i) {
        super(0);
        this.f = i;
        this.g = weaponUseActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() {
        int i = this.f;
        WeaponUseActivity weaponUseActivity = this.g;
        switch (i) {
            case 0:
                DialogC3094bd dialogC3094bd = new DialogC3094bd(weaponUseActivity, weaponUseActivity.n(), weaponUseActivity);
                dialogC3094bd.d = new D10(1, weaponUseActivity, dialogC3094bd);
                return dialogC3094bd;
            case 1:
                Weapon weaponN = weaponUseActivity.n();
                if (weaponN == null) {
                    return null;
                }
                VB mBinding = weaponUseActivity.getMBinding();
                AbstractC2995aW.p(mBinding, "<get-mBinding>(...)");
                return new C3109bk0((ActivityGunBinding) mBinding, weaponN, weaponUseActivity, weaponUseActivity);
            case 2:
                Zb0 zb0 = WeaponUseActivity.n;
                Intent intent = weaponUseActivity.getIntent();
                AbstractC2995aW.p(intent, "getIntent(...)");
                if (Build.VERSION.SDK_INT >= 33) {
                    return (Weapon) intent.getParcelableExtra("weapon", Weapon.class);
                }
                Parcelable parcelableExtra = intent.getParcelableExtra("weapon");
                if (parcelableExtra instanceof Weapon) {
                    return (Weapon) parcelableExtra;
                }
                return null;
            default:
                return new SurfaceHolderCallbackC3902kl0(weaponUseActivity);
        }
    }
}
