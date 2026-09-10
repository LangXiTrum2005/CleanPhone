package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.badlogic.gdx.backends.android.IControl;
import com.badlogic.gdx.backends.android.SpineController;
import com.hjq.permissions.Permission;
import com.hjq.permissions.XXPermissions;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutWeaponActivityActionBinding;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3794jb0 extends C2612My {
    public final LifecycleOwner M;
    public final SpineController N;
    public int O;
    public boolean P;
    public boolean Q;
    public final AtomicBoolean R;
    public boolean S;
    public final ValueAnimator T;
    public final InterfaceC3069bH U;
    public int V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3794jb0(WeaponUseActivity weaponUseActivity, Weapon weapon, LifecycleOwner lifecycleOwner, SpineController spineController) {
        super(weaponUseActivity, weapon, null, null, null);
        AbstractC2995aW.q(weaponUseActivity, "mActivity");
        this.M = lifecycleOwner;
        this.N = spineController;
        this.R = new AtomicBoolean(false);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, TypedValue.applyDimension(1, -2.0f, Resources.getSystem().getDisplayMetrics()), 0.0f);
        valueAnimatorOfFloat.setDuration(weapon.getConsecutiveInterval());
        valueAnimatorOfFloat.addListener(new C3511gI(this, weapon, weaponUseActivity, 1));
        this.T = valueAnimatorOfFloat;
        this.U = AbstractC2340Cl.H(EnumC4124nH.c, new C2379Dy(weaponUseActivity, weapon, (AbstractC4340pk0) this, 3));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final boolean A() {
        return this.S;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final boolean B(View view, MotionEvent motionEvent) {
        AbstractC2995aW.q(motionEvent, "motionEvent");
        int action = motionEvent.getAction();
        AtomicBoolean atomicBoolean = this.R;
        WeaponUseActivity weaponUseActivity = this.f4847a;
        Weapon weapon = this.b;
        if (action == 0) {
            atomicBoolean.set(true);
            SpineController spineController = this.N;
            if (spineController != null) {
                spineController.showSlot("TASER_EFFECT");
            }
            if ((AbstractC2995aW.i(weapon.getName(), "taser03") && this.j > 0) || (AbstractC2995aW.i(weapon.getName(), "taser03") && weaponUseActivity.e)) {
                C3843k5 animationState = spineController != null ? spineController.getAnimationState("TASER") : null;
                if (animationState != null) {
                    animationState.q(0.0f, 2);
                    animationState.q(0.0f, 0);
                    if (spineController != null) {
                        IControl.DefaultImpls.setAnimation$default(spineController, "TASER", 0, DM.h(weapon.getName(), "_appear"), false, 0.0f, null, 56, null);
                    }
                }
            }
            if (AbstractC2995aW.i(weapon.getName(), "taser03") || AbstractC2995aW.i(weapon.getName(), "taser05") || AbstractC2995aW.i(weapon.getName(), "taser07")) {
                j(Integer.valueOf(this.V));
            }
        } else if (action == 1) {
            atomicBoolean.set(false);
            if (this.g) {
                this.g = false;
            }
            this.l = null;
            if (weapon.getCanConsecutive()) {
                q();
            }
        } else if (action == 2) {
            Float f = this.l;
            if (f != null) {
                if (motionEvent.getRawY() - f.floatValue() > 100.0f) {
                    this.l = null;
                    b().removeMessages(102);
                    b().removeMessages(101);
                    weaponUseActivity.r();
                    int i = this.k;
                    if (i < 1) {
                        weaponUseActivity.p();
                    } else {
                        l(i - 1);
                        k(weapon.getMagazineCapacity());
                        this.g = true;
                        j(this.e);
                    }
                }
            }
        } else if (action == 3) {
            atomicBoolean.set(false);
            if (this.g) {
                this.g = false;
            }
            this.l = null;
            if (weapon.getCanConsecutive()) {
                q();
            }
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
    public final void I() {
        WD.D(LifecycleOwnerKt.getLifecycleScope(this.f4847a), null, 0, new C3708ib0(this, null), 3);
    }

    public final boolean J() {
        AbstractC3477fv abstractC3477fvA;
        String name;
        String name2;
        AbstractC3477fv abstractC3477fvA2;
        LifecycleCoroutineScope lifecycleScope;
        boolean z = this.S;
        Weapon weapon = this.b;
        if (z) {
            S3.b("taser_use", weapon.getAnalyticsName());
            this.E = false;
            this.S = false;
        }
        if (!this.i) {
            this.i = true;
            LifecycleOwner lifecycleOwner = this.M;
            if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                WD.D(lifecycleScope, null, 0, new C3002ab0(this, null), 3);
            }
        }
        WeaponUseActivity weaponUseActivity = this.f4847a;
        boolean z2 = weaponUseActivity.e;
        SpineController spineController = this.N;
        if (z2) {
            if (weapon.getSwitchFlash() && weaponUseActivity.getPackageManager().hasSystemFeature("android.hardware.camera.flash") && ((Build.VERSION.SDK_INT >= 23 || XXPermissions.isGranted(weaponUseActivity, Permission.CAMERA)) && (abstractC3477fvA2 = a()) != null)) {
                abstractC3477fvA2.d(false);
            }
            Weapon weaponN = weaponUseActivity.n();
            if (weaponN != null && (name2 = weaponN.getName()) != null && spineController != null) {
                K(spineController, name2);
            }
            return true;
        }
        if (this.j < 1) {
            j(this.f);
            q();
            return false;
        }
        Weapon weaponN2 = weaponUseActivity.n();
        if (weaponN2 != null && (name = weaponN2.getName()) != null && spineController != null) {
            K(spineController, name);
        }
        k(this.j - 1);
        if (weapon.getSwitchFlash() && weaponUseActivity.getPackageManager().hasSystemFeature("android.hardware.camera.flash") && ((Build.VERSION.SDK_INT >= 23 || XXPermissions.isGranted(weaponUseActivity, Permission.CAMERA)) && (abstractC3477fvA = a()) != null)) {
            abstractC3477fvA.d(false);
        }
        return true;
    }

    public final void K(SpineController spineController, String str) {
        C3443fb c3443fbA;
        C4991x70 skeleton;
        C3443fb c3443fbA2;
        LayoutWeaponActivityActionBinding layoutWeaponActivityActionBinding;
        ImageView imageView;
        if (!App.q) {
            S3.a("weapon_use");
            App.q = true;
        }
        WeaponUseActivity weaponUseActivity = this.f4847a;
        C3109bk0 c3109bk0M = weaponUseActivity.m();
        float f = AbstractC2995aW.i((c3109bk0M == null || (layoutWeaponActivityActionBinding = (LayoutWeaponActivityActionBinding) c3109bk0M.b) == null || (imageView = layoutWeaponActivityActionBinding.ivImmersive) == null) ? null : Boolean.valueOf(imageView.isSelected()), Boolean.TRUE) ? weaponUseActivity.i + 0.05f : weaponUseActivity.i;
        C3843k5 animationState = spineController.getAnimationState("TASER_EFFECT");
        if ((animationState != null ? animationState.l(1) : null) == null) {
            IControl.DefaultImpls.setAnimation$default(spineController, "TASER_EFFECT", 1, "General effect", false, 0.0f, null, 48, null);
            IControl.DefaultImpls.addAnimation$default(spineController, "TASER_EFFECT", 1, "General effect", false, 0.0f, null, 48, null);
        } else {
            IControl.DefaultImpls.addAnimation$default(spineController, "TASER_EFFECT", 1, "General effect", false, 0.0f, null, 48, null);
        }
        C4991x70 skeleton2 = spineController.getSkeleton("TASER");
        if (skeleton2 == null || (c3443fbA = skeleton2.a("special effects-".concat(str))) == null || (skeleton = spineController.getSkeleton("TASER_EFFECT")) == null || (c3443fbA2 = skeleton.a("root")) == null) {
            return;
        }
        c3443fbA2.e = c3443fbA.e * f;
        c3443fbA2.f = c3443fbA.f * f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4340pk0
    public final void f(boolean z) {
        LifecycleCoroutineScope lifecycleScope;
        if (z) {
            this.E = true;
            this.S = true;
        }
        LifecycleOwner lifecycleOwner = this.M;
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            WD.D(lifecycleScope, null, 0, new C3532gb0(this, null), 3);
        }
        Weapon weapon = this.b;
        k(weapon.getMagazineCapacity());
        if (weapon.getCartridgeClip() > 0) {
            l(weapon.getCartridgeClip());
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4340pk0
    public final void h() {
        try {
            q();
        } catch (Throwable unused) {
        }
        try {
            this.T.cancel();
        } catch (Throwable unused2) {
        }
        this.Q = false;
        this.R.set(false);
        if (Build.VERSION.SDK_INT >= 23) {
            Object systemService = this.f4847a.getSystemService("camera");
            CameraManager cameraManager = systemService instanceof CameraManager ? (CameraManager) systemService : null;
            if (cameraManager != null) {
                try {
                    String[] cameraIdList = cameraManager.getCameraIdList();
                    AbstractC2995aW.p(cameraIdList, "getCameraIdList(...)");
                    for (String str : cameraIdList) {
                        try {
                            cameraManager.setTorchMode(str, false);
                        } catch (Throwable unused3) {
                        }
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        try {
            super.h();
        } catch (Throwable unused5) {
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final void p() {
        if (J()) {
            this.P = true;
            Weapon weapon = this.b;
            if (!AbstractC2995aW.i(weapon.getName(), "taser03")) {
                SpineController spineController = this.N;
                C3843k5 animationState = spineController != null ? spineController.getAnimationState("TASER") : null;
                if (animationState != null) {
                    animationState.q(0.0f, 0);
                }
                if (animationState != null) {
                    animationState.q(0.0f, 2);
                }
                String name = weapon.getName();
                if (AbstractC2995aW.i(name, "taser04")) {
                    if (spineController != null) {
                        IControl.DefaultImpls.setAnimation$default(spineController, "TASER", 0, DM.h(weapon.getName(), "_appear"), false, 0.0f, null, 56, null);
                    }
                    if (spineController != null) {
                        IControl.DefaultImpls.setAnimation$default(spineController, "TASER", 2, DM.h(weapon.getName(), "_circulation"), true, 0.0f, null, 48, null);
                    }
                } else if (AbstractC2995aW.i(name, "taser08")) {
                    if (spineController != null) {
                        IControl.DefaultImpls.setAnimation$default(spineController, "TASER", 0, DM.h(weapon.getName(), "_circulation"), true, 0.0f, null, 48, null);
                    }
                } else if (spineController != null) {
                    IControl.DefaultImpls.setAnimation$default(spineController, "TASER", 0, weapon.getName(), false, 0.0f, null, 56, null);
                }
            }
            ValueAnimator valueAnimator = this.T;
            valueAnimator.cancel();
            valueAnimator.setRepeatCount(-1);
            valueAnimator.start();
            I();
            i(Integer.valueOf(this.O));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final void q() {
        C3843k5 animationState;
        C3843k5 animationState2;
        C3843k5 animationState3;
        C3843k5 animationState4;
        super.q();
        SpineController spineController = this.N;
        if (spineController != null) {
            spineController.hideSlot("TASER_EFFECT");
        }
        if (this.P) {
            Weapon weapon = this.b;
            if (AbstractC2995aW.i(weapon.getName(), "taser03")) {
                if (spineController != null) {
                    IControl.DefaultImpls.setAnimation$default(spineController, "TASER", 2, "taser03_vanish", false, 0.0f, null, 56, null);
                }
                if (spineController != null && (animationState4 = spineController.getAnimationState("TASER_EFFECT")) != null) {
                    animationState4.q(0.0f, 1);
                }
                b().postDelayed(new P0(this, 11), 400L);
            } else {
                if (spineController != null && (animationState3 = spineController.getAnimationState("TASER_EFFECT")) != null) {
                    animationState3.q(0.0f, 1);
                }
                if (AbstractC2995aW.i(weapon.getName(), "taser04") || AbstractC2995aW.i(weapon.getName(), "taser08")) {
                    if (spineController != null && (animationState2 = spineController.getAnimationState("TASER")) != null) {
                        animationState2.q(0.0f, 2);
                    }
                    if (spineController != null && (animationState = spineController.getAnimationState("TASER")) != null) {
                        animationState.q(0.0f, 0);
                    }
                }
            }
            this.P = false;
            n();
        }
        this.T.cancel();
        m(Integer.valueOf(this.O));
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
}
