package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.widget.ImageView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityGunBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3640hl0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeaponUseActivity f4468a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3640hl0(WeaponUseActivity weaponUseActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4468a = weaponUseActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3640hl0(this.f4468a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3640hl0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        ImageView imageView;
        AbstractC3375el.b0(obj);
        WeaponUseActivity weaponUseActivity = this.f4468a;
        Weapon weaponN = weaponUseActivity.n();
        if (weaponN == null) {
            return null;
        }
        int showPicId = weaponN.getShowPicId();
        ActivityGunBinding activityGunBinding = (ActivityGunBinding) weaponUseActivity.getMBinding();
        if (activityGunBinding == null || (imageView = activityGunBinding.ivBoom) == null) {
            return null;
        }
        imageView.setImageResource(showPicId);
        return C5033xf0.f5238a;
    }
}
