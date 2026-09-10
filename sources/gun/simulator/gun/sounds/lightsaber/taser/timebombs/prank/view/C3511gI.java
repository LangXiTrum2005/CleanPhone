package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import com.hjq.permissions.Permission;
import com.hjq.permissions.XXPermissions;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3511gI extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4410a;
    public final /* synthetic */ Weapon b;
    public final /* synthetic */ WeaponUseActivity c;
    public final /* synthetic */ C2612My d;

    public /* synthetic */ C3511gI(C2612My c2612My, Weapon weapon, WeaponUseActivity weaponUseActivity, int i) {
        this.f4410a = i;
        this.d = c2612My;
        this.b = weapon;
        this.c = weaponUseActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) throws Throwable {
        AbstractC3477fv abstractC3477fvA;
        AbstractC3477fv abstractC3477fvA2;
        AbstractC3477fv abstractC3477fvA3;
        int i = this.f4410a;
        WeaponUseActivity weaponUseActivity = this.c;
        Weapon weapon = this.b;
        C2612My c2612My = this.d;
        switch (i) {
            case 0:
                AbstractC2995aW.q(animator, "animation");
                C4213oI c4213oI = (C4213oI) c2612My;
                if (!c4213oI.W) {
                    if (weapon.getSwitchFlash()) {
                        AbstractC2995aW.q(weaponUseActivity, com.umeng.analytics.pro.f.X);
                        if (weaponUseActivity.getPackageManager().hasSystemFeature("android.hardware.camera.flash")) {
                            if ((Build.VERSION.SDK_INT >= 23 || XXPermissions.isGranted(weaponUseActivity, Permission.CAMERA)) && (abstractC3477fvA = c4213oI.a()) != null) {
                                abstractC3477fvA.d(false);
                                break;
                            }
                        }
                    }
                } else {
                    c4213oI.K();
                    break;
                }
                break;
            case 1:
                AbstractC2995aW.q(animator, "animation");
                C3794jb0 c3794jb0 = (C3794jb0) c2612My;
                if (!c3794jb0.P || !c3794jb0.R.get()) {
                    if (weapon.getSwitchFlash()) {
                        AbstractC2995aW.q(weaponUseActivity, com.umeng.analytics.pro.f.X);
                        if (weaponUseActivity.getPackageManager().hasSystemFeature("android.hardware.camera.flash")) {
                            if ((Build.VERSION.SDK_INT >= 23 || XXPermissions.isGranted(weaponUseActivity, Permission.CAMERA)) && (abstractC3477fvA2 = c3794jb0.a()) != null) {
                                abstractC3477fvA2.d(false);
                                break;
                            }
                        }
                    }
                } else {
                    c3794jb0.J();
                    break;
                }
                break;
            default:
                AbstractC2995aW.q(animator, "animation");
                Gb0 gb0 = (Gb0) c2612My;
                if (!gb0.Q) {
                    if (weapon.getSwitchFlash()) {
                        AbstractC2995aW.q(weaponUseActivity, com.umeng.analytics.pro.f.X);
                        if (weaponUseActivity.getPackageManager().hasSystemFeature("android.hardware.camera.flash")) {
                            if ((Build.VERSION.SDK_INT >= 23 || XXPermissions.isGranted(weaponUseActivity, Permission.CAMERA)) && (abstractC3477fvA3 = gb0.a()) != null) {
                                abstractC3477fvA3.d(false);
                                break;
                            }
                        }
                    }
                } else {
                    gb0.L();
                    break;
                }
                break;
        }
    }
}
