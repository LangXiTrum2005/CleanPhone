package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.ValueAnimator;
import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Hk0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3182a;
    public final /* synthetic */ WeaponUseActivity b;
    public final /* synthetic */ String c;

    public /* synthetic */ Hk0(WeaponUseActivity weaponUseActivity, String str, int i) {
        this.f3182a = i;
        this.b = weaponUseActivity;
        this.c = str;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C4991x70 skeleton;
        C4991x70 skeleton2;
        int i = this.f3182a;
        String str = this.c;
        WeaponUseActivity weaponUseActivity = this.b;
        switch (i) {
            case 0:
                Object animatedValue = valueAnimator.getAnimatedValue();
                AbstractC2995aW.o(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = (((Float) animatedValue).floatValue() * 0.05f) + weaponUseActivity.i;
                SpineController spineController = weaponUseActivity.g;
                if (spineController != null && (skeleton = spineController.getSkeleton(str)) != null) {
                    Weapon weaponN = weaponUseActivity.n();
                    C3443fb c3443fbA = skeleton.a(weaponN != null ? weaponN.getName() : null);
                    if (c3443fbA != null) {
                        c3443fbA.h = fFloatValue;
                        c3443fbA.i = fFloatValue;
                    }
                    break;
                }
                break;
            default:
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                AbstractC2995aW.o(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue2 = (weaponUseActivity.i + 0.05f) - (((Float) animatedValue2).floatValue() * 0.05f);
                SpineController spineController2 = weaponUseActivity.g;
                if (spineController2 != null && (skeleton2 = spineController2.getSkeleton(str)) != null) {
                    Weapon weaponN2 = weaponUseActivity.n();
                    C3443fb c3443fbA2 = skeleton2.a(weaponN2 != null ? weaponN2.getName() : null);
                    if (c3443fbA2 != null) {
                        c3443fbA2.h = fFloatValue2;
                        c3443fbA2.i = fFloatValue2;
                    }
                    break;
                }
                break;
        }
    }
}
