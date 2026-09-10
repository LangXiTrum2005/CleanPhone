package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.badlogic.gdx.backends.android.IControl;
import com.badlogic.gdx.backends.android.SpineController;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityGunBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutWeaponActivityActionBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4213oI extends C2612My {
    public final LifecycleOwner M;
    public final SpineController N;
    public final ActivityGunBinding O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public final Object Z;
    public boolean a0;
    public String b0;
    public final InterfaceC3069bH c0;
    public final ValueAnimator d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4213oI(WeaponUseActivity weaponUseActivity, Weapon weapon, LifecycleOwner lifecycleOwner, SpineController spineController, ActivityGunBinding activityGunBinding) {
        super(weaponUseActivity, weapon, null, null, null);
        AbstractC2995aW.q(weaponUseActivity, "mActivity");
        this.M = lifecycleOwner;
        this.N = spineController;
        this.O = activityGunBinding;
        this.T = 100;
        this.U = 200;
        this.V = 300;
        this.Z = new Object();
        this.b0 = "";
        this.c0 = AbstractC2340Cl.H(EnumC4124nH.c, new C2379Dy(weaponUseActivity, weapon, (AbstractC4340pk0) this, 1));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, TypedValue.applyDimension(1, -2.0f, Resources.getSystem().getDisplayMetrics()), 0.0f);
        valueAnimatorOfFloat.setDuration(weapon.getConsecutiveInterval());
        valueAnimatorOfFloat.addListener(new C3511gI(this, weapon, weaponUseActivity, 0));
        this.d0 = valueAnimatorOfFloat;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final boolean A() {
        return this.X;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final boolean B(View view, MotionEvent motionEvent) {
        LifecycleCoroutineScope lifecycleScope;
        LayoutWeaponActivityActionBinding layoutWeaponActivityActionBinding;
        ConstraintLayout constraintLayout;
        LayoutWeaponActivityActionBinding layoutWeaponActivityActionBinding2;
        AbstractC2995aW.q(motionEvent, "motionEvent");
        if (motionEvent.getAction() == 0) {
            int i = this.j;
            WeaponUseActivity weaponUseActivity = this.f4847a;
            if (i > 0 || weaponUseActivity.e) {
                C3109bk0 c3109bk0M = weaponUseActivity.m();
                if (c3109bk0M != null && (layoutWeaponActivityActionBinding = (LayoutWeaponActivityActionBinding) c3109bk0M.b) != null && (constraintLayout = layoutWeaponActivityActionBinding.conColorChoose) != null) {
                    SparseArray sparseArray = Oh0.f3515a;
                    if (constraintLayout.getVisibility() == 0) {
                        C3109bk0 c3109bk0M2 = weaponUseActivity.m();
                        ConstraintLayout constraintLayout2 = (c3109bk0M2 == null || (layoutWeaponActivityActionBinding2 = (LayoutWeaponActivityActionBinding) c3109bk0M2.b) == null) ? null : layoutWeaponActivityActionBinding2.conColorChoose;
                        if (constraintLayout2 != null) {
                            constraintLayout2.setVisibility(4);
                        }
                    }
                }
                LifecycleOwner lifecycleOwner = this.M;
                if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                    WD.D(lifecycleScope, null, 0, new C3949lI(this, null), 3);
                }
            }
        }
        super.B(view, motionEvent);
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final void C(String str) {
        LifecycleCoroutineScope lifecycleScope;
        C3843k5 animationState;
        C3843k5 animationState2;
        C3843k5 animationState3;
        AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.b0 = str;
        this.T++;
        this.U++;
        this.V++;
        SpineController spineController = this.N;
        if (spineController != null && (animationState3 = spineController.getAnimationState("LIGHT_SABER_EFFECT")) != null) {
            animationState3.q(0.0f, this.T - 1);
        }
        if (spineController != null && (animationState2 = spineController.getAnimationState("LIGHT_SABER_EFFECT1")) != null) {
            animationState2.q(0.0f, this.U - 1);
        }
        if (spineController != null && (animationState = spineController.getAnimationState("LIGHT_SABER_EFFECT2")) != null) {
            animationState.q(0.0f, this.V - 1);
        }
        if (this.a0) {
            C3109bk0 c3109bk0M = this.f4847a.m();
            if (c3109bk0M != null) {
                String str2 = this.b0;
                AbstractC2995aW.q(str2, "effectName");
                WD.R(C2734Rq.f3684a, new Zj0(c3109bk0M, str2, null));
            }
            this.a0 = false;
        }
        LifecycleOwner lifecycleOwner = this.M;
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        WD.D(lifecycleScope, null, 0, new HH(this, null), 3);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final void D(boolean z) {
        this.E = z;
        this.X = z;
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
        WD.D(LifecycleOwnerKt.getLifecycleScope(this.f4847a), null, 0, new C4125nI(this, null), 3);
    }

    public final boolean K() {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleCoroutineScope lifecycleScope2;
        LifecycleCoroutineScope lifecycleScope3;
        if (this.X) {
            S3.b("lightsaber_use", this.b.getAnalyticsName());
            this.E = false;
            this.X = false;
        }
        boolean z = this.i;
        LifecycleOwner lifecycleOwner = this.M;
        if (!z) {
            this.i = true;
            if (lifecycleOwner != null && (lifecycleScope3 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                WD.D(lifecycleScope3, null, 0, new BH(this, null), 3);
            }
        }
        if (this.f4847a.e) {
            if (lifecycleOwner != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                WD.D(lifecycleScope2, null, 0, new CH(this, null), 3);
            }
            return true;
        }
        if (this.j < 1) {
            j(this.f);
            q();
            return false;
        }
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            WD.D(lifecycleScope, null, 0, new DH(this, null), 3);
        }
        k(this.j - 1);
        return true;
    }

    public final AnimatorSet L() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C5179zH(this, 4));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setDuration(300L);
        valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new C5179zH(this, 1));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.addListener(new C4967ws(this, 3));
        return animatorSet;
    }

    public final AnimatorSet M() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C5179zH(this, 2));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setDuration(300L);
        valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new C5179zH(this, 3));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.addListener(new FH(0));
        return animatorSet;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x012b  */
    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0157  */
    /* JADX WARN: Code duplicated, block: B:73:0x0169  */
    /* JADX WARN: Code duplicated, block: B:75:0x017b  */
    /* JADX WARN: Code duplicated, block: B:77:0x018d  */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0040. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void N(String str) {
        C3843k5 animationState;
        C3755j5 c3755j5L;
        AbstractC2995aW.q(str, "weaponName");
        j(Integer.valueOf(this.Q));
        SpineController spineController = this.N;
        if (spineController == null || (animationState = spineController.getAnimationState("HUO_XING")) == null || (c3755j5L = animationState.l(13)) == null || c3755j5L.b()) {
            switch (str.hashCode()) {
                case -1012121824:
                    spineController = spineController;
                    if (!str.equals("LightSaber-B")) {
                        if (AbstractC2995aW.i(this.b0, "xunhuan_huoxing") && spineController != null) {
                            IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING", 13, "huoxing", false, 0.0f, null, 56, null);
                        }
                    } else if (AbstractC2995aW.i(this.b0, "xunhuan_huoxing")) {
                        if (spineController != null) {
                            IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING", 13, "huoxing", false, 0.0f, null, 56, null);
                        }
                        if (spineController != null) {
                            IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING1", 14, "huoxing", false, 0.0f, null, 56, null);
                        }
                        if (spineController != null) {
                            IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING2", 15, "huoxing", false, 0.0f, null, 56, null);
                        }
                    }
                    break;
                case -1012121822:
                    if (!str.equals("LightSaber-D")) {
                        spineController = spineController;
                        if (AbstractC2995aW.i(this.b0, "xunhuan_huoxing")) {
                            IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING", 13, "huoxing", false, 0.0f, null, 56, null);
                        }
                    } else if (!AbstractC2995aW.i(this.b0, "xunhuan_huoxing")) {
                        spineController = spineController;
                    } else {
                        if (spineController != null) {
                            IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING", 13, "huoxing", false, 0.0f, null, 56, null);
                        }
                        if (spineController != 0) {
                            IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING1", 14, "huoxing", false, 0.0f, null, 56, null);
                        }
                    }
                    break;
                case -1012121819:
                    if (!str.equals("LightSaber-G")) {
                        spineController = spineController;
                        if (AbstractC2995aW.i(this.b0, "xunhuan_huoxing")) {
                            IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING", 13, "huoxing", false, 0.0f, null, 56, null);
                        }
                    } else {
                        spineController = spineController;
                        if (AbstractC2995aW.i(this.b0, "xunhuan_huoxing")) {
                            if (spineController != null) {
                                IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING", 13, "huoxing", false, 0.0f, null, 56, null);
                            }
                            if (spineController != null) {
                                IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING1", 14, "huoxing", false, 0.0f, null, 56, null);
                            }
                            if (spineController != null) {
                                IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING2", 15, "huoxing", false, 0.0f, null, 56, null);
                            }
                        }
                    }
                    break;
                case -1012121817:
                    if (!str.equals("LightSaber-I")) {
                        spineController = spineController;
                        if (AbstractC2995aW.i(this.b0, "xunhuan_huoxing")) {
                            IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING", 13, "huoxing", false, 0.0f, null, 56, null);
                        }
                    } else if (!AbstractC2995aW.i(this.b0, "xunhuan_huoxing")) {
                        spineController = spineController;
                    } else {
                        if (spineController != null) {
                            IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING", 13, "huoxing", false, 0.0f, null, 56, null);
                        }
                        if (spineController != 0) {
                            IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING1", 14, "huoxing", false, 0.0f, null, 56, null);
                        }
                    }
                    break;
                case -1012121815:
                    if (!str.equals("LightSaber-K")) {
                        spineController = spineController;
                        if (AbstractC2995aW.i(this.b0, "xunhuan_huoxing")) {
                            IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING", 13, "huoxing", false, 0.0f, null, 56, null);
                        }
                    } else if (!AbstractC2995aW.i(this.b0, "xunhuan_huoxing")) {
                        spineController = spineController;
                    } else {
                        if (spineController != null) {
                            IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING", 13, "huoxing", false, 0.0f, null, 56, null);
                        }
                        if (spineController != 0) {
                            IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING1", 14, "huoxing", false, 0.0f, null, 56, null);
                        }
                    }
                    break;
                default:
                    spineController = spineController;
                    if (AbstractC2995aW.i(this.b0, "xunhuan_huoxing")) {
                        IControl.DefaultImpls.addAnimation$default(spineController, "HUO_XING", 13, "huoxing", false, 0.0f, null, 56, null);
                    }
                    break;
            }
        } else {
            spineController = spineController;
        }
        switch (str.hashCode()) {
            case -1012121824:
                if (!str.equals("LightSaber-B")) {
                }
                if (spineController != null) {
                    IControl.DefaultImpls.addAnimation$default(spineController, "LIGHT_RECTANGLE1", 5, "guangyun_chuxian", false, 0.0f, null, 56, null);
                }
                if (spineController != null) {
                    IControl.DefaultImpls.addAnimation$default(spineController, "LIGHT_RECTANGLE1", 6, "guangzhu_chuxian", false, 0.0f, null, 56, null);
                }
                if (spineController != null) {
                    IControl.DefaultImpls.addAnimation$default(spineController, "LIGHT_RECTANGLE2", 5, "guangyun_chuxian", false, 0.0f, null, 56, null);
                }
                if (spineController != null) {
                    IControl.DefaultImpls.addAnimation$default(spineController, "LIGHT_RECTANGLE2", 6, "guangzhu_chuxian", false, 0.0f, null, 56, null);
                }
                break;
            case -1012121822:
                if (!str.equals("LightSaber-D")) {
                }
                if (spineController != null) {
                    IControl.DefaultImpls.addAnimation$default(spineController, "LIGHT_RECTANGLE1", 5, "guangyun_chuxian", false, 0.0f, null, 56, null);
                }
                if (spineController != null) {
                    IControl.DefaultImpls.addAnimation$default(spineController, "LIGHT_RECTANGLE1", 6, "guangzhu_chuxian", false, 0.0f, null, 56, null);
                }
                break;
            case -1012121819:
                if (!str.equals("LightSaber-G")) {
                }
                if (spineController != null) {
                    IControl.DefaultImpls.addAnimation$default(spineController, "LIGHT_RECTANGLE1", 5, "guangyun_chuxian", false, 0.0f, null, 56, null);
                }
                if (spineController != null) {
                    IControl.DefaultImpls.addAnimation$default(spineController, "LIGHT_RECTANGLE1", 6, "guangzhu_chuxian", false, 0.0f, null, 56, null);
                }
                if (spineController != null) {
                    IControl.DefaultImpls.addAnimation$default(spineController, "LIGHT_RECTANGLE2", 5, "guangyun_chuxian", false, 0.0f, null, 56, null);
                }
                if (spineController != null) {
                    IControl.DefaultImpls.addAnimation$default(spineController, "LIGHT_RECTANGLE2", 6, "guangzhu_chuxian", false, 0.0f, null, 56, null);
                }
                break;
            case -1012121817:
                if (!str.equals("LightSaber-I")) {
                }
                if (spineController != null) {
                    IControl.DefaultImpls.addAnimation$default(spineController, "LIGHT_RECTANGLE1", 5, "guangyun_chuxian", false, 0.0f, null, 56, null);
                }
                if (spineController != null) {
                    IControl.DefaultImpls.addAnimation$default(spineController, "LIGHT_RECTANGLE1", 6, "guangzhu_chuxian", false, 0.0f, null, 56, null);
                }
                break;
            case -1012121815:
                if (!str.equals("LightSaber-K")) {
                }
                if (spineController != null) {
                    IControl.DefaultImpls.addAnimation$default(spineController, "LIGHT_RECTANGLE1", 5, "guangyun_chuxian", false, 0.0f, null, 56, null);
                }
                if (spineController != null) {
                    IControl.DefaultImpls.addAnimation$default(spineController, "LIGHT_RECTANGLE1", 6, "guangzhu_chuxian", false, 0.0f, null, 56, null);
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4340pk0
    public final void f(boolean z) throws Throwable {
        WD.R(C2734Rq.f3684a, new C3773jI(this, z, null));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final void o() {
        if (this.Y) {
            j(Integer.valueOf(this.R));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final void p() {
        if (K()) {
            this.W = true;
            ValueAnimator valueAnimator = this.d0;
            valueAnimator.cancel();
            valueAnimator.setRepeatCount(-1);
            valueAnimator.start();
            I();
            i(Integer.valueOf(this.P));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final void q() {
        int i = 0;
        super.q();
        if (this.W) {
            String name = this.b.getName();
            j(Integer.valueOf(this.S));
            switch (name) {
                case "LightSaber-B":
                    AnimatorSet animatorSet = new AnimatorSet();
                    Animator animatorL = L();
                    Animator animatorM = M();
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat.setDuration(300L);
                    valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                    valueAnimatorOfFloat.addUpdateListener(new C5179zH(this, i));
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat2.setDuration(300L);
                    valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
                    valueAnimatorOfFloat2.addUpdateListener(new C5179zH(this, 5));
                    animatorSet2.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                    animatorSet2.addListener(new FH(1));
                    animatorSet.playTogether(animatorL, animatorM, animatorSet2);
                    animatorSet.start();
                    break;
                case "LightSaber-D":
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.playTogether(L(), M());
                    animatorSet3.start();
                    break;
                case "LightSaber-G":
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    Animator animatorL2 = L();
                    Animator animatorM2 = M();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat3.setDuration(300L);
                    valueAnimatorOfFloat3.setInterpolator(new DecelerateInterpolator());
                    valueAnimatorOfFloat3.addUpdateListener(new C5179zH(this, i));
                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat4.setDuration(300L);
                    valueAnimatorOfFloat4.setInterpolator(new DecelerateInterpolator());
                    valueAnimatorOfFloat4.addUpdateListener(new C5179zH(this, 5));
                    animatorSet5.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
                    animatorSet5.addListener(new FH(1));
                    animatorSet4.playTogether(animatorL2, animatorM2, animatorSet5);
                    animatorSet4.start();
                    break;
                case "LightSaber-I":
                case "LightSaber-K":
                    AnimatorSet animatorSet6 = new AnimatorSet();
                    animatorSet6.playTogether(L(), M());
                    animatorSet6.start();
                    break;
                default:
                    L().start();
                    break;
            }
            this.W = false;
            n();
        }
        this.d0.cancel();
        m(Integer.valueOf(this.P));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final SpineController r() {
        return this.N;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final String s() {
        return this.b0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final LifecycleOwner u() {
        return this.M;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final ActivityGunBinding v() {
        return this.O;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My
    public final C4370q40 w() {
        return (C4370q40) this.c0.getValue();
    }
}
