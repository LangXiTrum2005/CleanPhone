package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.constraintlayout.widget.Group;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityGunBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3552gl0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeaponUseActivity f4429a;

    public C3552gl0(WeaponUseActivity weaponUseActivity) {
        this.f4429a = weaponUseActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC2995aW.q(animator, "animation");
        WeaponUseActivity weaponUseActivity = this.f4429a;
        Group group = ((ActivityGunBinding) weaponUseActivity.getMBinding()).groupReloadBullets;
        AbstractC2995aW.p(group, "groupReloadBullets");
        AbstractC2340Cl.M(group);
        ((ActivityGunBinding) weaponUseActivity.getMBinding()).lavReloadBulletsHand.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC2995aW.q(animator, "animation");
        WeaponUseActivity weaponUseActivity = this.f4429a;
        AbstractC4340pk0 abstractC4340pk0 = weaponUseActivity.d;
        if (abstractC4340pk0 != null) {
            abstractC4340pk0.l(abstractC4340pk0.k - 1);
            abstractC4340pk0.k(abstractC4340pk0.b.getMagazineCapacity());
        }
        Group group = ((ActivityGunBinding) weaponUseActivity.getMBinding()).groupReloadBullets;
        AbstractC2995aW.p(group, "groupReloadBullets");
        AbstractC2340Cl.M(group);
        ((ActivityGunBinding) weaponUseActivity.getMBinding()).lavReloadBulletsHand.b();
    }
}
