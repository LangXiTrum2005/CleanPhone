package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.badlogic.gdx.backends.android.IControl;
import com.badlogic.gdx.backends.android.SpineController;
import com.hjq.permissions.Permission;
import com.hjq.permissions.XXPermissions;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityGunBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class Gb0 extends C2612My {
    public final LifecycleOwner M;
    public final SpineController N;
    public int O;
    public final Ma0 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final ValueAnimator T;
    public final InterfaceC3069bH U;
    public float V;
    public float W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gb0(WeaponUseActivity weaponUseActivity, Weapon weapon, LifecycleOwner lifecycleOwner, SpineController spineController) {
        super(weaponUseActivity, weapon, null, null, null);
        AbstractC2995aW.q(weaponUseActivity, "mActivity");
        this.M = lifecycleOwner;
        this.N = spineController;
        this.P = AbstractC2340Cl.I(C3488g20.i);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, TypedValue.applyDimension(1, -2.0f, Resources.getSystem().getDisplayMetrics()), 0.0f);
        valueAnimatorOfFloat.setDuration(weapon.getConsecutiveInterval());
        valueAnimatorOfFloat.addListener(new C3511gI(this, weapon, weaponUseActivity, 2));
        this.T = valueAnimatorOfFloat;
        this.U = AbstractC2340Cl.H(EnumC4124nH.c, new C2379Dy(weaponUseActivity, weapon, (AbstractC4340pk0) this, 4));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0032 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0050 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0070 A[ORIG_RETURN, RETURN] */
    public static String M(String str) {
        AbstractC2995aW.q(str, "weaponName");
        switch (str) {
            case "laser gun 1":
            case "laser gun 2":
            case "laser gun 5":
                return "special effects _laser";
            case "arc torch 1":
            case "arc torch 2":
            case "arc torch 3":
                return "special effects _arc torch";
            case "energy gun 1":
            case "energy gun 2":
            case "energy gun 3":
            case "energy gun 4":
                return "special effects _energy cannon";
            default:
                return "";
        }
    }

    public static /* synthetic */ C5033xf0 O(Gb0 gb0, String str, int i, String str2) {
        gb0.N(str, i, str2, false);
        return C5033xf0.f5238a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final boolean A() {
        return this.S;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final boolean B(View view, MotionEvent motionEvent) {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        AbstractC2995aW.q(motionEvent, "motionEvent");
        if (motionEvent.getAction() == 0 && (lifecycleOwner = this.M) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            AbstractC3651ht.c(lifecycleScope, new Db0(this, null));
        }
        super.B(view, motionEvent);
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final void D(boolean z) {
        this.E = z;
        this.S = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final void E(float f) {
        this.V = f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final void F(float f) {
        this.W = f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final void G() {
        w().a();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final void H() {
        C4370q40 c4370q40W = w();
        ((SensorManager) c4370q40W.g.getValue()).unregisterListener(c4370q40W);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final void I() {
        WD.D(LifecycleOwnerKt.getLifecycleScope(this.f4847a), null, 0, new Fb0(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean L() throws Throwable {
        AbstractC3477fv abstractC3477fvA;
        LifecycleCoroutineScope lifecycleScope;
        LifecycleCoroutineScope lifecycleScope2;
        AbstractC3477fv abstractC3477fvA2;
        LifecycleCoroutineScope lifecycleScope3;
        boolean z = this.S;
        int i = 0;
        Weapon weapon = this.b;
        if (z) {
            S3.b("sci_fi_gun_use", weapon.getAnalyticsName());
            this.E = false;
            this.S = false;
        }
        boolean z2 = this.i;
        LifecycleOwner lifecycleOwner = this.M;
        if (!z2) {
            this.i = true;
            if (lifecycleOwner != null && (lifecycleScope3 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                WD.D(lifecycleScope3, null, 0, new C4849vb0(this, null), 3);
            }
        }
        boolean switchScreenFlash = weapon.getSwitchScreenFlash();
        WeaponUseActivity weaponUseActivity = this.f4847a;
        if (switchScreenFlash && !AbstractC3197ck0.i.contains(Integer.valueOf(weapon.getNameId()))) {
            FrameLayout frameLayout = ((ActivityGunBinding) weaponUseActivity.getMBinding()).surfaceRoot;
            AbstractC2995aW.p(frameLayout, "surfaceRoot");
            Oh0.e(frameLayout);
            b().postDelayed(new RunnableC4673tb0(this, i), 30L);
        }
        if (weaponUseActivity.e) {
            if (weapon.getSwitchFlash() && weaponUseActivity.getPackageManager().hasSystemFeature("android.hardware.camera.flash") && ((Build.VERSION.SDK_INT >= 23 || XXPermissions.isGranted(weaponUseActivity, Permission.CAMERA)) && (abstractC3477fvA2 = a()) != null)) {
                abstractC3477fvA2.d(false);
            }
            if (lifecycleOwner != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                WD.D(lifecycleScope2, null, 0, new C4937wb0(this, null), 3);
            }
            return true;
        }
        if (this.j < 1) {
            j(this.f);
            q();
            return false;
        }
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            WD.D(lifecycleScope, null, 0, new C5025xb0(this, null), 3);
        }
        k(this.j - 1);
        if (weapon.getSwitchFlash() && weaponUseActivity.getPackageManager().hasSystemFeature("android.hardware.camera.flash") && ((Build.VERSION.SDK_INT >= 23 || XXPermissions.isGranted(weaponUseActivity, Permission.CAMERA)) && (abstractC3477fvA = a()) != null)) {
            abstractC3477fvA.d(false);
        }
        return true;
    }

    public final C5033xf0 N(String str, int i, String str2, boolean z) {
        C4991x70 skeleton;
        D70 d70;
        SpineController spineController = this.N;
        C3493g5 c3493g5A = (spineController == null || (skeleton = spineController.getSkeleton(str)) == null || (d70 = skeleton.f5208a) == null) ? null : d70.a(str2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (c3493g5A == null) {
            return c5033xf0;
        }
        C3843k5 animationState = spineController != null ? spineController.getAnimationState(str) : null;
        if (animationState == null) {
            return c5033xf0;
        }
        animationState.s(0.0f);
        if (i < animationState.b.size) {
            animationState.q(0.0f, i);
        }
        if (spineController != null) {
            IControl.DefaultImpls.setAnimation$default(spineController, str, i, str2, z, 0.0f, null, 48, null);
        }
        if (spineController != null) {
            spineController.showSlot(str);
        }
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4340pk0
    public final void f(boolean z) throws Throwable {
        WD.R(C2734Rq.f3684a, new Cb0(this, z, null));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final void o() throws Throwable {
        if (this.j > 0) {
            L();
            i(Integer.valueOf(this.O));
            b().postDelayed(new RunnableC4673tb0(this, 1), 500L);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final void p() {
        if (L()) {
            this.Q = true;
            ValueAnimator valueAnimator = this.T;
            valueAnimator.cancel();
            valueAnimator.setRepeatCount(-1);
            valueAnimator.start();
            I();
            i(Integer.valueOf(this.O));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final void q() throws Throwable {
        WD.R(C2734Rq.f3684a, new Ab0(this, null));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final SpineController r() {
        return this.N;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final LifecycleOwner u() {
        return this.M;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final C4370q40 w() {
        return (C4370q40) this.U.getValue();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final float x() {
        return this.V;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final float y() {
        return this.W;
    }
}
