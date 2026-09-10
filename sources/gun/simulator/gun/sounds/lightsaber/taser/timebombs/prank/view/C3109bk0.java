package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.transition.TransitionManager;
import androidx.viewbinding.ViewBinding;
import com.badlogic.gdx.backends.android.SpineData;
import com.mbridge.msdk.MBridgeConstans;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Bomb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.LightSaber;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.MechanicalGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Taser;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TechnologyGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TimeBomb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityGunBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutTimeBombBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutWeaponActivityActionBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.KnobProgressBar;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3109bk0 extends V9 {
    public final ActivityGunBinding d;
    public final Weapon e;
    public final WeaponUseActivity f;
    public final LifecycleOwner g;
    public final DialogC2540Kd h;
    public final DialogC2799Ud i;
    public final DialogC5116yd j;
    public final Z50 k;
    public C5027xc0 l;
    public Boolean m;
    public Pk0 n;
    public TextView o;
    public TextView p;
    public TextView q;
    public TextView r;
    public boolean s;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3109bk0(ActivityGunBinding activityGunBinding, Weapon weapon, WeaponUseActivity weaponUseActivity, WeaponUseActivity weaponUseActivity2) {
        ConstraintLayout root = activityGunBinding.getRoot();
        AbstractC2995aW.p(root, "getRoot(...)");
        super(root, weaponUseActivity);
        this.d = activityGunBinding;
        this.e = weapon;
        this.f = weaponUseActivity;
        this.g = weaponUseActivity2;
        this.h = new DialogC2540Kd(this.f5044a, weapon, weaponUseActivity);
        boolean z = weapon instanceof MechanicalGun;
        if (z) {
            this.i = new DialogC2799Ud(this.f5044a, weapon, new PL(this, 1));
        }
        if (weapon instanceof LightSaber) {
            this.j = new DialogC5116yd(this.f5044a, weapon, new Lj0(this));
        }
        if (z) {
            ((LayoutWeaponActivityActionBinding) this.b).ivBullets.setImageResource(((MechanicalGun) weapon).getIconCartridge());
        } else if (weapon instanceof Bomb) {
            ((LayoutWeaponActivityActionBinding) this.b).ivBullets.setImageResource(((Bomb) weapon).getIconCartridge());
        } else {
            ((LayoutWeaponActivityActionBinding) this.b).ivBullets.setVisibility(4);
            ((LayoutWeaponActivityActionBinding) this.b).kpbBulletsNumber.setVisibility(0);
            ((LayoutWeaponActivityActionBinding) this.b).kpbBulletsNumber.setProgressMax(weapon.getMagazineCapacity());
        }
        LayoutWeaponActivityActionBinding layoutWeaponActivityActionBinding = (LayoutWeaponActivityActionBinding) this.b;
        this.o = layoutWeaponActivityActionBinding.tvBulletsNumberInCartridgeClip;
        this.p = layoutWeaponActivityActionBinding.tvSeparatorBulletsNumber;
        this.q = layoutWeaponActivityActionBinding.tvBulletsNumberAll;
        this.r = layoutWeaponActivityActionBinding.tvUnlimited;
        this.k = new Z50(this.f5044a, weaponUseActivity2, weaponUseActivity);
    }

    public static final SpineData f(C3109bk0 c3109bk0, String str) {
        c3109bk0.getClass();
        return new SpineData(AbstractC5044xl.f("toString(...)"), 0.0f, 0.0f, 1.0f, DM.B("spine/effect/", str, ".atlas"), DM.B("spine/effect/", str, ".json"), true, null, 128, null);
    }

    public static final SpineData g(C3109bk0 c3109bk0) {
        c3109bk0.getClass();
        return new SpineData(AbstractC5044xl.f("toString(...)"), 0.0f, 0.0f, 1.0f, "spine/lightsaber/huoxing.atlas", "spine/lightsaber/huoxing.json", true, null, 128, null);
    }

    public static final SpineData h(C3109bk0 c3109bk0, String str) {
        c3109bk0.getClass();
        return new SpineData(AbstractC5044xl.f("toString(...)"), 0.0f, 0.0f, 1.0f, DM.B("spine/lightsaber/", str, ".atlas"), DM.B("spine/lightsaber/", str, ".json"), true, null, 128, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4681tf0, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2303Ba
    public final void a() {
        C5027xc0 c5027xc0 = this.l;
        if (c5027xc0 != null) {
            c5027xc0.a().removeMessages(888);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4681tf0
    public final View[] d() {
        LayoutWeaponActivityActionBinding layoutWeaponActivityActionBinding = (LayoutWeaponActivityActionBinding) this.b;
        return new ImageView[]{layoutWeaponActivityActionBinding.ivColorChoose, layoutWeaponActivityActionBinding.ivSceneMenu, layoutWeaponActivityActionBinding.ivShake, layoutWeaponActivityActionBinding.ivBack, layoutWeaponActivityActionBinding.ivImmersive, layoutWeaponActivityActionBinding.ivGunEffect, layoutWeaponActivityActionBinding.ivSetting, layoutWeaponActivityActionBinding.ivUnlimitedBullet, layoutWeaponActivityActionBinding.ivResetColorChoose};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4681tf0
    public final ViewBinding e(ConstraintLayout constraintLayout) {
        LayoutWeaponActivityActionBinding layoutWeaponActivityActionBindingBind = LayoutWeaponActivityActionBinding.bind(constraintLayout);
        AbstractC2995aW.p(layoutWeaponActivityActionBindingBind, "bind(...)");
        return layoutWeaponActivityActionBindingBind;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(boolean z) {
        WeaponUseActivity weaponUseActivity = this.f;
        int i = weaponUseActivity.h;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (z) {
                                S3.b("sci_fi_control_click", "unlimited_on");
                            } else {
                                S3.b("sci_fi_control_click", "unlimited_off");
                            }
                        }
                    } else if (z) {
                        S3.b("time_bomb_control_click", "unlimited_on");
                    } else {
                        S3.b("time_bomb_control_click", "unlimited_off");
                    }
                } else if (z) {
                    S3.b("taser_control_click", "unlimited_on");
                } else {
                    S3.b("taser_control_click", "unlimited_off");
                }
            } else if (z) {
                S3.b("lightsaber_control_click", "unlimited_on");
            } else {
                S3.b("lightsaber_control_click", "unlimited_off");
            }
        } else if (z) {
            S3.b("machine_gun_control_click", "unlimited_on");
        } else {
            S3.b("machine_gun_control_click", "unlimited_off");
        }
        this.m = Boolean.valueOf(z);
        Pk0 pk0 = this.n;
        if (pk0 != null) {
            pk0.f3570a.e = z;
        }
        ((LayoutWeaponActivityActionBinding) this.b).ivWatchAd.setVisibility(8);
        ((LayoutWeaponActivityActionBinding) this.b).ivUnlimitedBullet.setImageResource(z ? R.drawable.icon_unlimited_bullet_on : R.drawable.icon_unlimited_bullet);
        TextView textView = this.o;
        if (textView != null) {
            textView.setVisibility(z ? 4 : 0);
        }
        TextView textView2 = this.p;
        if (textView2 != null) {
            textView2.setVisibility(z ? 4 : 0);
        }
        TextView textView3 = this.q;
        if (textView3 != null) {
            textView3.setVisibility(z ? 4 : 0);
        }
        TextView textView4 = this.r;
        if (textView4 != null) {
            textView4.setVisibility(z ? 0 : 4);
        }
        if (z) {
            ((ActivityGunBinding) weaponUseActivity.getMBinding()).groupReloadBullets.setVisibility(8);
        } else if (Integer.parseInt(((LayoutWeaponActivityActionBinding) this.b).tvBulletsNumberInCartridgeClip.getText().toString()) == 0) {
            ((ActivityGunBinding) weaponUseActivity.getMBinding()).groupReloadBullets.setVisibility(0);
        }
    }

    public final void j(LayoutTimeBombBinding layoutTimeBombBinding) {
        ImageView imageView = ((LayoutWeaponActivityActionBinding) this.b).ivBullets;
        AbstractC2995aW.p(imageView, "ivBullets");
        AbstractC2340Cl.D(imageView);
        TextView textView = ((LayoutWeaponActivityActionBinding) this.b).tvBulletsNumberInCartridgeClip;
        AbstractC2995aW.p(textView, "tvBulletsNumberInCartridgeClip");
        AbstractC2340Cl.D(textView);
        TextView textView2 = ((LayoutWeaponActivityActionBinding) this.b).tvSeparatorBulletsNumber;
        AbstractC2995aW.p(textView2, "tvSeparatorBulletsNumber");
        AbstractC2340Cl.D(textView2);
        TextView textView3 = ((LayoutWeaponActivityActionBinding) this.b).tvBulletsNumberAll;
        AbstractC2995aW.p(textView3, "tvBulletsNumberAll");
        AbstractC2340Cl.D(textView3);
        TextView textView4 = ((LayoutWeaponActivityActionBinding) this.b).tvUnlimited;
        AbstractC2995aW.p(textView4, "tvUnlimited");
        AbstractC2340Cl.D(textView4);
        KnobProgressBar knobProgressBar = ((LayoutWeaponActivityActionBinding) this.b).kpbBulletsNumber;
        AbstractC2995aW.p(knobProgressBar, "kpbBulletsNumber");
        AbstractC2340Cl.D(knobProgressBar);
        this.o = layoutTimeBombBinding.tvBulletsNumberInCartridgeClip;
        this.p = layoutTimeBombBinding.tvSeparatorBulletsNumber;
        this.q = layoutTimeBombBinding.tvBulletsNumberAll;
        this.r = layoutTimeBombBinding.tvUnlimited;
    }

    public final void k(int i, Weapon weapon) {
        LifecycleCoroutineScope lifecycleScope;
        AbstractC2995aW.q(weapon, "weapon");
        LifecycleOwner lifecycleOwner = this.g;
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        WD.D(lifecycleScope, AbstractC4437qp.b, 0, new Xj0(weapon, i, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:79:0x0147  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4593sf0
    public final void onClickView(View view) {
        int i;
        LifecycleCoroutineScope lifecycleScope;
        LifecycleCoroutineScope lifecycleScope2;
        String str;
        LifecycleCoroutineScope lifecycleScope3;
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        LayoutWeaponActivityActionBinding layoutWeaponActivityActionBinding = (LayoutWeaponActivityActionBinding) this.b;
        boolean zI = AbstractC2995aW.i(view, layoutWeaponActivityActionBinding.ivColorChoose);
        LifecycleOwner lifecycleOwner = this.g;
        if (zI) {
            if (lifecycleOwner == null || (lifecycleScope3 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
                return;
            }
            WD.D(lifecycleScope3, null, 0, new Uj0(layoutWeaponActivityActionBinding, this, null), 3);
            return;
        }
        boolean zI2 = AbstractC2995aW.i(view, layoutWeaponActivityActionBinding.ivSceneMenu);
        WeaponUseActivity weaponUseActivity = this.f;
        if (zI2) {
            int i2 = weaponUseActivity.h;
            if (i2 == 0) {
                S3.b("machine_gun_control_click", "background");
            } else if (i2 == 1) {
                S3.b("lightsaber_control_click", "background");
            } else if (i2 == 2) {
                S3.b("taser_control_click", "background");
            } else if (i2 == 3) {
                S3.b("time_bomb_control_click", "background");
            } else if (i2 == 4) {
                S3.b("sci_fi_control_click", "background");
            }
            DialogC2540Kd dialogC2540Kd = this.h;
            if (dialogC2540Kd != null) {
                C2498In c2498In = App.n;
                WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C2514Jd(dialogC2540Kd, null), 2);
                dialogC2540Kd.show();
                return;
            }
            return;
        }
        if (AbstractC2995aW.i(view, layoutWeaponActivityActionBinding.ivShake)) {
            int i3 = weaponUseActivity.h;
            if (i3 == 0) {
                S3.b("machine_gun_control_click", "shake");
            } else if (i3 == 1) {
                S3.b("lightsaber_control_click", "shake");
            } else if (i3 == 2) {
                S3.b("taser_control_click", "shake");
            } else if (i3 == 4) {
                S3.b("sci_fi_control_click", "shake");
            }
            Z50 z50 = this.k;
            if (z50 != null) {
                z50.show();
                return;
            }
            return;
        }
        if (AbstractC2995aW.i(view, layoutWeaponActivityActionBinding.ivBack)) {
            Context context = this.f5044a;
            WeaponUseActivity weaponUseActivity2 = (WeaponUseActivity) (context instanceof WeaponUseActivity ? context : null);
            if (weaponUseActivity2 != null) {
                weaponUseActivity2.onBackPressed();
                return;
            }
            return;
        }
        boolean zI3 = AbstractC2995aW.i(view, layoutWeaponActivityActionBinding.ivImmersive);
        Weapon weapon = this.e;
        if (!zI3) {
            if (AbstractC2995aW.i(view, layoutWeaponActivityActionBinding.ivGunEffect)) {
                if (weapon instanceof LightSaber) {
                    S3.b("lightsaber_control_click", "firing_effect");
                    DialogC5116yd dialogC5116yd = this.j;
                    if (dialogC5116yd != null) {
                        C2498In c2498In2 = App.n;
                        WD.D(C2498In.g(), null, 0, new C5028xd(dialogC5116yd, null), 3);
                        dialogC5116yd.show();
                        return;
                    }
                    return;
                }
                if (weapon instanceof MechanicalGun) {
                    S3.b("machine_gun_control_click", "firing_effect");
                    DialogC2799Ud dialogC2799Ud = this.i;
                    if (dialogC2799Ud != null) {
                        C2498In c2498In3 = App.n;
                        WD.D(C2498In.g(), null, 0, new C2773Td(dialogC2799Ud, null), 3);
                        dialogC2799Ud.show();
                        return;
                    }
                    return;
                }
                return;
            }
            if (!AbstractC2995aW.i(view, layoutWeaponActivityActionBinding.ivUnlimitedBullet)) {
                if (AbstractC2995aW.i(view, layoutWeaponActivityActionBinding.ivResetColorChoose)) {
                    if (lifecycleOwner == null || (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
                        i = 0;
                    } else {
                        i = 0;
                        WD.D(lifecycleScope2, AbstractC4437qp.b, 0, new Vj0(2, null), 2);
                    }
                    ((LayoutWeaponActivityActionBinding) this.b).ivColorPicker.setVisibility(i);
                    ((LayoutWeaponActivityActionBinding) this.b).cvColorChoose.setVisibility(8);
                    if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
                        return;
                    }
                    WD.D(lifecycleScope, AbstractC4437qp.b, 0, new Wj0(this, null), 2);
                    return;
                }
                return;
            }
            Boolean bool = this.m;
            if (bool != null) {
                i(!bool.booleanValue());
                return;
            }
            int i4 = weaponUseActivity.h;
            if (i4 == 0) {
                S3.b("machine_gun_control_click", "unlimited_on_without");
            } else if (i4 == 1) {
                S3.b("lightsaber_control_click", "unlimited_on_without");
            } else if (i4 == 2) {
                S3.b("taser_control_click", "unlimited_on_without");
            } else if (i4 == 3) {
                S3.b("time_bomb_control_click", "unlimited_on_without");
            } else if (i4 == 4) {
                S3.b("sci_fi_control_click", "unlimited_on_without");
            }
            if (weapon instanceof MechanicalGun) {
                str = "Reward_MachineGunUnlimited";
            } else if (weapon instanceof LightSaber) {
                str = "Reward_LightsaberUnlimited";
            } else if (weapon instanceof Taser) {
                str = "Reward_TaserUnlimited";
            } else if (weapon instanceof TimeBomb) {
                str = "Reward_TimeBombUnlimited";
            } else {
                str = weapon instanceof TechnologyGun ? "Reward_SciFiGunUnlimited" : "";
            }
            SI si = new SI(weaponUseActivity, str, null);
            SI.e(si, new X9(this, 9));
            si.show();
            return;
        }
        ImageView imageView = layoutWeaponActivityActionBinding.ivImmersive;
        imageView.setSelected(!imageView.isSelected());
        int i5 = weaponUseActivity.h;
        boolean zIsSelected = layoutWeaponActivityActionBinding.ivImmersive.isSelected();
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            if (zIsSelected) {
                                S3.b("sci_fi_control_click", "hide_on");
                            } else {
                                S3.b("sci_fi_control_click", "hide_off");
                            }
                        }
                    } else if (zIsSelected) {
                        S3.b("time_bomb_control_click", "hide_on");
                    } else {
                        S3.b("time_bomb_control_click", "hide_off");
                    }
                } else if (zIsSelected) {
                    S3.b("taser_control_click", "hide_on");
                } else {
                    S3.b("taser_control_click", "hide_off");
                }
            } else if (zIsSelected) {
                S3.b("lightsaber_control_click", "hide_on");
            } else {
                S3.b("lightsaber_control_click", "hide_off");
            }
        } else if (zIsSelected) {
            S3.b("machine_gun_control_click", "hide_on");
        } else {
            S3.b("machine_gun_control_click", "hide_off");
        }
        TransitionManager.beginDelayedTransition(this.d.getRoot());
        String str2 = "GUN_SCIENCE";
        if (!layoutWeaponActivityActionBinding.ivImmersive.isSelected()) {
            if (weapon != null) {
                if (weapon instanceof MechanicalGun) {
                    str2 = "GUN";
                } else if (weapon instanceof Taser) {
                    str2 = "TASER";
                } else if (weapon instanceof LightSaber) {
                    str2 = "LIGHT_SABER";
                } else if (!(weapon instanceof TechnologyGun)) {
                    str2 = "GUN";
                }
                WD.D(LifecycleOwnerKt.getLifecycleScope(weaponUseActivity), null, 0, new C3288dl0(weaponUseActivity, str2, null), 3);
            }
            ViewGroup.LayoutParams layoutParams = layoutWeaponActivityActionBinding.ivBack.getLayoutParams();
            AbstractC2995aW.p(layoutParams, "getLayoutParams(...)");
            if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
                layoutParams = null;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.endToStart = -1;
                layoutParams2.startToStart = R.id.space_top_bar;
                layoutWeaponActivityActionBinding.ivBack.setLayoutParams(layoutParams2);
            }
            ViewGroup.LayoutParams layoutParams3 = layoutWeaponActivityActionBinding.ivSetting.getLayoutParams();
            AbstractC2995aW.p(layoutParams3, "getLayoutParams(...)");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) (!(layoutParams3 instanceof ConstraintLayout.LayoutParams) ? null : layoutParams3);
            if (layoutParams4 != null) {
                layoutParams4.startToEnd = -1;
                layoutParams4.endToEnd = R.id.space_top_bar;
                layoutWeaponActivityActionBinding.ivSetting.setLayoutParams(layoutParams4);
            }
            if (this.s) {
                layoutWeaponActivityActionBinding.conColorChoose.setVisibility(0);
                return;
            }
            return;
        }
        if (weapon != null) {
            if (weapon instanceof MechanicalGun) {
                str2 = "GUN";
            } else if (weapon instanceof Taser) {
                str2 = "TASER";
            } else if (weapon instanceof LightSaber) {
                str2 = "LIGHT_SABER";
            } else if (!(weapon instanceof TechnologyGun)) {
                str2 = "GUN";
            }
            WD.D(LifecycleOwnerKt.getLifecycleScope(weaponUseActivity), null, 0, new Kk0(weaponUseActivity, str2, null), 3);
        }
        ViewGroup.LayoutParams layoutParams5 = layoutWeaponActivityActionBinding.ivBack.getLayoutParams();
        AbstractC2995aW.p(layoutParams5, "getLayoutParams(...)");
        if (!(layoutParams5 instanceof ConstraintLayout.LayoutParams)) {
            layoutParams5 = null;
        }
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        if (layoutParams6 != null) {
            layoutParams6.endToStart = R.id.space_top_bar;
            layoutParams6.startToStart = -1;
            layoutWeaponActivityActionBinding.ivBack.setLayoutParams(layoutParams6);
        }
        ConstraintLayout constraintLayout = layoutWeaponActivityActionBinding.conColorChoose;
        AbstractC2995aW.p(constraintLayout, "conColorChoose");
        SparseArray sparseArray = Oh0.f3515a;
        if (constraintLayout.getVisibility() == 0) {
            this.s = true;
            layoutWeaponActivityActionBinding.conColorChoose.setVisibility(4);
        } else {
            this.s = false;
        }
        ViewGroup.LayoutParams layoutParams7 = layoutWeaponActivityActionBinding.ivSetting.getLayoutParams();
        AbstractC2995aW.p(layoutParams7, "getLayoutParams(...)");
        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) (!(layoutParams7 instanceof ConstraintLayout.LayoutParams) ? null : layoutParams7);
        if (layoutParams8 != null) {
            layoutParams8.startToEnd = R.id.space_top_bar;
            layoutParams8.endToEnd = -1;
            layoutWeaponActivityActionBinding.ivSetting.setLayoutParams(layoutParams8);
        }
    }
}
