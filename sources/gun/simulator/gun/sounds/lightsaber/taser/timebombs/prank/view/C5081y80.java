package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Message;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.badlogic.gdx.backends.android.IControl;
import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.y80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5081y80 extends AbstractC4340pk0 {
    public final LifecycleOwner q;
    public final SpineController r;
    public int s;
    public int t;
    public boolean u;
    public final ArrayList v;
    public boolean w;
    public final InterfaceC3069bH x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5081y80(WeaponUseActivity weaponUseActivity, Weapon weapon, LifecycleOwner lifecycleOwner, SpineController spineController) {
        super(weaponUseActivity, weapon);
        AbstractC2995aW.q(weaponUseActivity, "mActivity");
        this.q = lifecycleOwner;
        this.r = spineController;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(-2.0f);
        Float fValueOf3 = Float.valueOf(-4.0f);
        Float fValueOf4 = Float.valueOf(-8.0f);
        Float fValueOf5 = Float.valueOf(1.0f);
        Float fValueOf6 = Float.valueOf(2.0f);
        Float fValueOf7 = Float.valueOf(4.0f);
        this.v = AbstractC2340Cl.L(fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf3, fValueOf2, fValueOf, fValueOf5, fValueOf6, fValueOf7, Float.valueOf(8.0f), fValueOf7, fValueOf6, fValueOf5, fValueOf, fValueOf2, fValueOf3, Float.valueOf(-6.0f), fValueOf4, fValueOf3, fValueOf2, Float.valueOf(-1.0f), fValueOf, fValueOf5, fValueOf6, fValueOf7, Float.valueOf(6.0f));
        this.x = AbstractC2340Cl.H(EnumC4124nH.c, new C2379Dy(weaponUseActivity, weapon, (AbstractC4340pk0) this, 2));
    }

    public static final void o(C5081y80 c5081y80, boolean z) throws Throwable {
        c5081y80.getClass();
        WD.R(C2734Rq.f3684a, new C3462fk0(c5081y80, null));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4340pk0
    public final void f(boolean z) throws Throwable {
        WD.R(C2734Rq.f3684a, new C4641t80(this, z, null));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4340pk0
    public final boolean g(Message message) {
        AbstractC2995aW.q(message, NotificationCompat.CATEGORY_MESSAGE);
        int i = message.what;
        if (i != 101 && (i != 102 || !this.b.getCanConsecutive())) {
            return false;
        }
        q();
        return true;
    }

    public final void p() {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleCoroutineScope lifecycleScope2;
        LifecycleCoroutineScope lifecycleScope3;
        Weapon weapon = this.b;
        String name = weapon.getName();
        WeaponUseActivity weaponUseActivity = this.f4847a;
        if (AbstractC2995aW.i(name, weaponUseActivity.getString(R.string.weapon_name_m84)) && this.u) {
            return;
        }
        if (this.w) {
            S3.b("machine_gun_use", weapon.getAnalyticsName());
            this.w = false;
        }
        boolean z = this.i;
        LifecycleOwner lifecycleOwner = this.q;
        if (!z) {
            this.i = true;
            if (lifecycleOwner != null && (lifecycleScope3 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                WD.D(lifecycleScope3, null, 0, new C4378q80(this, null), 3);
            }
        }
        boolean z2 = weaponUseActivity.e;
        SpineController spineController = this.r;
        if (z2) {
            j(this.d);
            if (lifecycleOwner != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                WD.D(lifecycleScope2, null, 0, new C4817v80(this, null), 3);
            }
            if (spineController != null) {
                r(spineController, weapon.getName());
                return;
            }
            return;
        }
        if (this.j < 1) {
            n();
            j(this.f);
            return;
        }
        if (spineController != null) {
            r(spineController, weapon.getName());
        }
        k(this.j - 1);
        j(this.d);
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        WD.D(lifecycleScope, null, 0, new C4817v80(this, null), 3);
    }

    public final void q() {
        b().removeMessages(101);
        if (this.f4847a.e) {
            s();
        } else {
            if (this.j >= 1) {
                s();
                return;
            }
            p();
            n();
            b().removeMessages(101);
        }
    }

    public final void r(final SpineController spineController, String str) {
        C3443fb c3443fbA;
        C3443fb c3443fbA2;
        ValueAnimator valueAnimatorOfFloat;
        C3443fb c3443fbA3;
        WeaponUseActivity weaponUseActivity = this.f4847a;
        if (!AbstractC2995aW.i(str, weaponUseActivity.getString(R.string.weapon_name_m2_flamethrower))) {
            if (AbstractC2995aW.i(str, weaponUseActivity.getString(R.string.weapon_name_m84))) {
                this.u = true;
                IControl.DefaultImpls.addAnimation$default(spineController, "M84", 1, "M84", false, 0.0f, null, 56, null);
                C3843k5 animationState = spineController.getAnimationState("M84");
                if (animationState != null) {
                    animationState.b(new C4465r80(this, spineController));
                    return;
                }
                return;
            }
            if (AbstractC2995aW.i(str, weaponUseActivity.getString(R.string.weapon_name_rpg_7))) {
                IControl.DefaultImpls.addAnimation$default(spineController, "RPG-7", 1, "RPG-7", false, 0.0f, null, 56, null);
                IControl.DefaultImpls.addAnimation$default(spineController, "SMOG", 2, "smog", false, 0.0f, null, 56, null);
                C4991x70 skeleton = spineController.getSkeleton("RPG-7");
                if (skeleton == null || (c3443fbA = skeleton.a("smog")) == null) {
                    return;
                }
                C4991x70 skeleton2 = spineController.getSkeleton("SMOG");
                C3443fb c3443fbA4 = skeleton2 != null ? skeleton2.a("root") : null;
                if (c3443fbA4 != null) {
                    c3443fbA4.e = c3443fbA.e;
                }
                C4991x70 skeleton3 = spineController.getSkeleton("SMOG");
                C3443fb c3443fbA5 = skeleton3 != null ? skeleton3.a("root") : null;
                if (c3443fbA5 == null) {
                    return;
                }
                c3443fbA5.f = c3443fbA.f;
                return;
            }
            return;
        }
        int i = this.s + 1;
        this.s = i;
        if (i > 50) {
            this.s = 1;
        }
        final String strValueOf = String.valueOf(this.s);
        IControl.DefaultImpls.addAnimation$default(spineController, AbstractC3888ke0.i("FIRE", strValueOf), Integer.parseInt(strValueOf), Integer.parseInt(strValueOf) % 2 == 0 ? "fire2" : "fire", false, 0.0f, null, 32, null);
        C4991x70 skeleton4 = spineController.getSkeleton("M2_FLAMETHROWER");
        if (skeleton4 != null && (c3443fbA3 = skeleton4.a("fire")) != null) {
            C4991x70 skeleton5 = spineController.getSkeleton("FIRE" + strValueOf);
            C3443fb c3443fbA6 = skeleton5 != null ? skeleton5.a("root") : null;
            if (c3443fbA6 != null) {
                c3443fbA6.e = c3443fbA3.e;
            }
            C4991x70 skeleton6 = spineController.getSkeleton("FIRE" + strValueOf);
            C3443fb c3443fbA7 = skeleton6 != null ? skeleton6.a("root") : null;
            if (c3443fbA7 != null) {
                c3443fbA7.f = c3443fbA3.f;
            }
        }
        C4991x70 skeleton7 = spineController.getSkeleton("FIRE" + strValueOf);
        if (skeleton7 == null || (c3443fbA2 = skeleton7.a("root")) == null || (valueAnimatorOfFloat = ValueAnimator.ofFloat(c3443fbA2.f, AbstractC3375el.E() + 20.0f)) == null) {
            return;
        }
        int i2 = this.t + 1;
        this.t = i2;
        ArrayList arrayList = this.v;
        if (i2 >= arrayList.size()) {
            this.t = 0;
        }
        int i3 = this.t;
        Float f = (Float) ((i3 < 0 || i3 > AbstractC2340Cl.y(arrayList)) ? null : arrayList.get(i3));
        float fFloatValue = f != null ? f.floatValue() * 50 : 0.0f;
        float f2 = c3443fbA2.e;
        final int i4 = 0;
        final int i5 = 1;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f2, fFloatValue + f2);
        if (valueAnimatorOfFloat2 == null) {
            return;
        }
        valueAnimatorOfFloat.setDuration(1800L);
        valueAnimatorOfFloat2.setDuration(1800L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.o80
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3443fb c3443fbA8;
                C3443fb c3443fbA9;
                int i6 = i4;
                String str2 = strValueOf;
                SpineController spineController2 = spineController;
                switch (i6) {
                    case 0:
                        AbstractC2995aW.q(spineController2, "$controller");
                        AbstractC2995aW.q(str2, "$i");
                        AbstractC2995aW.q(valueAnimator, "animation");
                        C4991x70 skeleton8 = spineController2.getSkeleton("FIRE".concat(str2));
                        if (skeleton8 != null && (c3443fbA8 = skeleton8.a("root")) != null) {
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            AbstractC2995aW.o(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            c3443fbA8.f = ((Float) animatedValue).floatValue();
                            break;
                        }
                        break;
                    default:
                        AbstractC2995aW.q(spineController2, "$controller");
                        AbstractC2995aW.q(str2, "$i");
                        AbstractC2995aW.q(valueAnimator, "animation");
                        C4991x70 skeleton9 = spineController2.getSkeleton("FIRE".concat(str2));
                        if (skeleton9 != null && (c3443fbA9 = skeleton9.a("root")) != null) {
                            Object animatedValue2 = valueAnimator.getAnimatedValue();
                            AbstractC2995aW.o(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                            c3443fbA9.e = ((Float) animatedValue2).floatValue();
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.o80
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3443fb c3443fbA8;
                C3443fb c3443fbA9;
                int i6 = i5;
                String str2 = strValueOf;
                SpineController spineController2 = spineController;
                switch (i6) {
                    case 0:
                        AbstractC2995aW.q(spineController2, "$controller");
                        AbstractC2995aW.q(str2, "$i");
                        AbstractC2995aW.q(valueAnimator, "animation");
                        C4991x70 skeleton8 = spineController2.getSkeleton("FIRE".concat(str2));
                        if (skeleton8 != null && (c3443fbA8 = skeleton8.a("root")) != null) {
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            AbstractC2995aW.o(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            c3443fbA8.f = ((Float) animatedValue).floatValue();
                            break;
                        }
                        break;
                    default:
                        AbstractC2995aW.q(spineController2, "$controller");
                        AbstractC2995aW.q(str2, "$i");
                        AbstractC2995aW.q(valueAnimator, "animation");
                        C4991x70 skeleton9 = spineController2.getSkeleton("FIRE".concat(str2));
                        if (skeleton9 != null && (c3443fbA9 = skeleton9.a("root")) != null) {
                            Object animatedValue2 = valueAnimator.getAnimatedValue();
                            AbstractC2995aW.o(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                            c3443fbA9.e = ((Float) animatedValue2).floatValue();
                            break;
                        }
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.start();
    }

    public final void s() {
        p();
        b().sendEmptyMessageDelayed(101, this.b.getConsecutiveInterval());
        C2498In c2498In = App.n;
        WD.D(C2498In.g(), null, 0, new C4993x80(this, null), 3);
    }
}
