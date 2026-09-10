package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity;

import android.content.Intent;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.badlogic.gdx.backends.android.AppActivity;
import com.badlogic.gdx.backends.android.SpineController;
import com.badlogic.gdx.backends.android.SpineData;
import com.badlogic.gdx.graphics.Color;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
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
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4340pk0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2498In;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2612My;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2734Rq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3022al0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3109bk0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3355eb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3376el0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3464fl0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3552gl0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3794jb0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3814jl0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4012m10;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4078ml0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4100n10;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4140nX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4166nl0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4213oI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4254ol0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4370q40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4763uc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4939wc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5027xc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5081y80;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ChoreographerFrameCallbackC4127nK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DialogC3094bd;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Dk0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3410f70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4124nH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gb0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gk0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lj0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lk0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ma0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mk0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Oh0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.P0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pk0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qj0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rj0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SurfaceHolderCallbackC3902kl0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Z90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zb0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zk0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class WeaponUseActivity extends AppActivity<ActivityGunBinding> {
    public static final Zb0 n = new Zb0();
    public static Weapon o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3069bH f2782a;
    public final InterfaceC3069bH b;
    public final InterfaceC3069bH c;
    public AbstractC4340pk0 d;
    public boolean e;
    public View f;
    public SpineController g;
    public int h;
    public final float i;
    public boolean j;
    public SurfaceView k;
    public final Ma0 l;
    public final C3552gl0 m;

    public WeaponUseActivity() {
        C3022al0 c3022al0 = new C3022al0(this, 2);
        EnumC4124nH enumC4124nH = EnumC4124nH.c;
        this.f2782a = AbstractC2340Cl.H(enumC4124nH, c3022al0);
        this.b = AbstractC2340Cl.H(enumC4124nH, new C3022al0(this, 0));
        this.c = AbstractC2340Cl.H(enumC4124nH, new C3022al0(this, 1));
        this.i = 1.0f;
        this.j = true;
        this.l = AbstractC2340Cl.I(new C3022al0(this, 3));
        this.m = new C3552gl0(this);
    }

    public static final void j(WeaponUseActivity weaponUseActivity, View view) {
        AbstractC4340pk0 abstractC4340pk0 = weaponUseActivity.d;
        if (abstractC4340pk0 == null || !(abstractC4340pk0 instanceof C5081y80) || view == null) {
            return;
        }
        view.setOnTouchListener(new Dk0(abstractC4340pk0, 0));
    }

    public static SpineData l(String str) {
        return new SpineData(AbstractC5044xl.f("toString(...)"), AbstractC3375el.F() / 2.0f, AbstractC3375el.E() / 2.0f, 1.0f, DM.h(str, ".atlas"), DM.h(str, ".json"), true, null, 128, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseSyncActivity
    public final ViewBinding getViewBinding() {
        ActivityGunBinding activityGunBindingInflate = ActivityGunBinding.inflate(getLayoutInflater());
        AbstractC2995aW.p(activityGunBindingInflate, "inflate(...)");
        return activityGunBindingInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity
    public final void initData() {
        Object next;
        Integer numI0;
        int i = 2;
        super.initData();
        if (n() == null) {
            return;
        }
        Weapon weaponN = n();
        if (weaponN instanceof LightSaber) {
            this.h = 1;
            Weapon weaponN2 = n();
            AbstractC2995aW.n(weaponN2);
            SpineController spineController = this.g;
            VB mBinding = getMBinding();
            AbstractC2995aW.p(mBinding, "<get-mBinding>(...)");
            this.d = new C4213oI(this, weaponN2, this, spineController, (ActivityGunBinding) mBinding);
            WD.D(LifecycleOwnerKt.getLifecycleScope(this), AbstractC4437qp.b, 0, new Lk0(this, null), 2);
        } else if (weaponN instanceof Taser) {
            this.h = 2;
            Weapon weaponN3 = n();
            AbstractC2995aW.n(weaponN3);
            this.d = new C3794jb0(this, weaponN3, this, this.g);
        } else if (weaponN instanceof Bomb) {
            this.h = 3;
            Weapon weaponN4 = n();
            AbstractC2995aW.n(weaponN4);
            this.d = new C3355eb(this, weaponN4, this);
            C3109bk0 c3109bk0M = m();
            if (c3109bk0M != null) {
                AbstractC4340pk0 abstractC4340pk0 = this.d;
                AbstractC2995aW.o(abstractC4340pk0, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.BombFireHelper");
                C3355eb c3355eb = (C3355eb) abstractC4340pk0;
                C5027xc0 c5027xc0 = c3109bk0M.l;
                if (c5027xc0 != null) {
                    c5027xc0.c = c3355eb;
                    c3355eb.G = new C4763uc0(c5027xc0, i);
                }
                if (c5027xc0 != null) {
                    c5027xc0.b = new Lj0(c3109bk0M);
                }
            }
        } else if (weaponN instanceof TechnologyGun) {
            this.h = 4;
            Weapon weaponN5 = n();
            AbstractC2995aW.n(weaponN5);
            this.d = new Gb0(this, weaponN5, this, this.g);
        } else {
            this.h = 0;
            List listK = AbstractC2340Cl.K(Integer.valueOf(R.string.weapon_name_m2_flamethrower), Integer.valueOf(R.string.weapon_name_rpg_7), Integer.valueOf(R.string.weapon_name_m84));
            Weapon weaponN6 = n();
            if (AbstractC2853Wf.d0(listK, weaponN6 != null ? Integer.valueOf(weaponN6.getNameId()) : null)) {
                Weapon weaponN7 = n();
                AbstractC2995aW.n(weaponN7);
                this.d = new C5081y80(this, weaponN7, this, this.g);
            } else {
                Weapon weaponN8 = n();
                AbstractC2995aW.n(weaponN8);
                this.d = new C2612My(this, weaponN8, this, this.g, (ActivityGunBinding) getMBinding());
                WD.D(LifecycleOwnerKt.getLifecycleScope(this), AbstractC4437qp.b, 0, new Mk0(this, null), 2);
            }
        }
        AbstractC4340pk0 abstractC4340pk1 = this.d;
        if (abstractC4340pk1 != null) {
            abstractC4340pk1.f(true);
        }
        int i2 = this.h;
        Weapon weaponN9 = n();
        AbstractC2995aW.n(weaponN9);
        WD.D(LifecycleOwnerKt.getLifecycleScope(this), AbstractC4437qp.b, 0, new C4166nl0(2, null), 2);
        if (i2 > -1 && i2 < App.r.size()) {
            boolean zRemove = App.s.remove(String.valueOf(i2));
            String str = (String) App.r.get(i2);
            Iterator it = AbstractC3089ba0.L0(str, new String[]{"//"}).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str2 = (String) next;
                if (str2.length() > 0 && Z90.i0(str2) != null && AbstractC2995aW.i(str2, String.valueOf(weaponN9.getNameId()))) {
                    break;
                }
            }
            String str3 = (String) next;
            int iIntValue = (str3 == null || (numI0 = Z90.i0(str3)) == null) ? 0 : numI0.intValue();
            if (iIntValue > 0) {
                App.r.set(i2, AbstractC3089ba0.H0(str, iIntValue + "//", ""));
                WD.D(LifecycleOwnerKt.getLifecycleScope(this), AbstractC4437qp.b, 0, new C4254ol0(this, zRemove, null), 2);
            }
        }
        t();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity
    public final void initListener() {
        super.initListener();
        C3109bk0 c3109bk0M = m();
        if (c3109bk0M != null) {
            c3109bk0M.n = new Pk0(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:122:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:125:0x0407  */
    /* JADX WARN: Code duplicated, block: B:128:0x0424  */
    /* JADX WARN: Code duplicated, block: B:131:0x0430  */
    /* JADX WARN: Code duplicated, block: B:134:0x043c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0448  */
    /* JADX WARN: Code duplicated, block: B:140:0x0454  */
    /* JADX WARN: Code duplicated, block: B:143:0x0460  */
    /* JADX WARN: Code duplicated, block: B:146:0x046d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity
    public final void initView() throws Throwable {
        TechnologyGun technologyGun;
        String name;
        C3109bk0 c3109bk0M;
        View viewInflate;
        boolean z;
        final C5027xc0 c5027xc0;
        TextView textView;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        LifecycleCoroutineScope lifecycleScope;
        final int i = 4;
        int i2 = 5;
        final int i3 = 1;
        final int i4 = 0;
        final int i5 = 3;
        final int i6 = 2;
        Weapon weaponN = n();
        Integer numValueOf = weaponN != null ? Integer.valueOf(weaponN.getNameId()) : null;
        if ((numValueOf != null && numValueOf.intValue() == R.string.weapon_name_f1_gold) || ((numValueOf != null && numValueOf.intValue() == R.string.weapon_name_f1_grenade) || (numValueOf != null && numValueOf.intValue() == R.string.weapon_name_he_grenade))) {
            Weapon weaponN2 = n();
            if (weaponN2 != null) {
                ((ActivityGunBinding) getMBinding()).ivBoom.setImageResource(weaponN2.getShowPicId());
            }
            ((ActivityGunBinding) getMBinding()).ivBoom.setOnTouchListener(new UK(this, i6));
        } else {
            Weapon weaponN3 = n();
            if (weaponN3 != null) {
                AbstractC2871Wx.e = AbstractC3375el.D(this).x / 1080.0f;
                AbstractC2871Wx.f = AbstractC3375el.D(this).y / 1725.0f;
                AbstractC2871Wx.r0(weaponN3.getName());
                LinkedHashMap linkedHashMapE0 = AbstractC2871Wx.e0(weaponN3);
                if ((weaponN3 instanceof TechnologyGun) && (name = (technologyGun = (TechnologyGun) weaponN3).getName()) != null) {
                    if (AbstractC3089ba0.l0(name, "laser gun")) {
                        linkedHashMapE0.put("GUN_SCIENCE_LASER_APPEAR", l("spine/science/Science fiction weapons -special effects"));
                        linkedHashMapE0.put("GUN_SCIENCE_LASER_VANISH", l("spine/science/Science fiction weapons -special effects"));
                    } else if (AbstractC3089ba0.l0(name, "arc")) {
                        linkedHashMapE0.put("GUN_SCIENCE_ARC_VANISH", l("spine/science/Science fiction weapons -special effects"));
                    }
                    linkedHashMapE0.put("GUN_SCIENCE", l("spine/science/" + technologyGun.getName()));
                }
                WD.R(C2734Rq.f3684a, new Zk0(this, linkedHashMapE0, null));
            }
        }
        ((ActivityGunBinding) getMBinding()).conWeaponBanner.post(new P0(this, i2));
        Weapon weaponN4 = n();
        if (weaponN4 != null && (c3109bk0M = m()) != null) {
            if (weaponN4 instanceof LightSaber) {
                ((LayoutWeaponActivityActionBinding) c3109bk0M.b).ivColorChoose.setVisibility(0);
                LifecycleOwner lifecycleOwner = c3109bk0M.g;
                if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                    WD.D(lifecycleScope, null, 0, new Qj0(c3109bk0M, null), 3);
                }
            } else if (weaponN4 instanceof MechanicalGun) {
                List listK = AbstractC2340Cl.K(Integer.valueOf(R.string.weapon_name_f1_gold), Integer.valueOf(R.string.weapon_name_f1_grenade), Integer.valueOf(R.string.weapon_name_m84), Integer.valueOf(R.string.weapon_name_he_grenade), Integer.valueOf(R.string.weapon_name_rpg_7), Integer.valueOf(R.string.weapon_name_m2_flamethrower));
                Weapon weapon = c3109bk0M.e;
                if (AbstractC2853Wf.d0(listK, weapon != null ? Integer.valueOf(weapon.getNameId()) : null)) {
                    ((LayoutWeaponActivityActionBinding) c3109bk0M.b).ivColorChoose.setVisibility(8);
                    ((LayoutWeaponActivityActionBinding) c3109bk0M.b).ivGunEffect.setVisibility(8);
                } else {
                    ((LayoutWeaponActivityActionBinding) c3109bk0M.b).ivColorChoose.setVisibility(8);
                    ((LayoutWeaponActivityActionBinding) c3109bk0M.b).ivGunEffect.setVisibility(0);
                    ((LayoutWeaponActivityActionBinding) c3109bk0M.b).ivGunEffect.setImageResource(R.drawable.icon_mechanical_fire_effect);
                    ((LayoutWeaponActivityActionBinding) c3109bk0M.b).ivShake.setVisibility(0);
                }
            } else if (weaponN4 instanceof Taser) {
                ((LayoutWeaponActivityActionBinding) c3109bk0M.b).ivColorChoose.setVisibility(8);
                ((LayoutWeaponActivityActionBinding) c3109bk0M.b).ivGunEffect.setVisibility(8);
            } else if (weaponN4 instanceof TechnologyGun) {
                ((LayoutWeaponActivityActionBinding) c3109bk0M.b).ivColorChoose.setVisibility(8);
                ((LayoutWeaponActivityActionBinding) c3109bk0M.b).ivGunEffect.setVisibility(8);
                ((LayoutWeaponActivityActionBinding) c3109bk0M.b).ivShake.setVisibility(0);
            } else if (weaponN4 instanceof TimeBomb) {
                int i7 = AbstractC2340Cl.h(Integer.valueOf(R.string.weapon_name_time_bomb_gas), Integer.valueOf(R.string.weapon_name_time_bomb_stone_age), Integer.valueOf(R.string.weapon_name_time_bomb_nuclear)).contains(Integer.valueOf(weaponN4.getNameId())) ? R.layout.layout_bomb_effect_video : R.layout.layout_bomb_effect;
                WeaponUseActivity weaponUseActivity = c3109bk0M.f;
                if (weaponUseActivity != null) {
                    ((ActivityGunBinding) weaponUseActivity.getMBinding()).vbBombEffect.setLayoutResource(i7);
                    weaponUseActivity.f = ((ActivityGunBinding) weaponUseActivity.getMBinding()).vbBombEffect.inflate();
                }
                ((LayoutWeaponActivityActionBinding) c3109bk0M.b).ivColorChoose.setVisibility(8);
                ((LayoutWeaponActivityActionBinding) c3109bk0M.b).ivGunEffect.setVisibility(8);
                ((LayoutWeaponActivityActionBinding) c3109bk0M.b).ivShake.setVisibility(8);
                c3109bk0M.l = new C5027xc0(c3109bk0M.f5044a);
                Rj0 rj0 = Rj0.f;
                int nameId = weaponN4.getNameId();
                final EnumC3410f70 enumC3410f70 = EnumC3410f70.BombBtn;
                ActivityGunBinding activityGunBinding = c3109bk0M.d;
                if (nameId == R.string.weapon_name_time_bomb_n) {
                    viewInflate = activityGunBinding.vbTimeBombN.inflate();
                    AbstractC2995aW.p(viewInflate, "inflate(...)");
                } else if (nameId == R.string.weapon_name_time_bomb_s) {
                    viewInflate = activityGunBinding.vbTimeBombS.inflate();
                    AbstractC2995aW.p(viewInflate, "inflate(...)");
                } else {
                    enumC3410f70 = EnumC3410f70.BombVirtualBtn;
                    if (nameId == R.string.weapon_name_time_bomb_c4) {
                        View viewInflate2 = activityGunBinding.vbTimeBombC4.inflate();
                        viewInflate = activityGunBinding.vbTimeBomb.inflate();
                        AbstractC2995aW.p(viewInflate, "inflate(...)");
                        LayoutTimeBombBinding layoutTimeBombBindingBind = LayoutTimeBombBinding.bind(viewInflate);
                        AbstractC2995aW.p(layoutTimeBombBindingBind, "bind(...)");
                        layoutTimeBombBindingBind.bgTime.setVisibility(4);
                        layoutTimeBombBindingBind.tvTimer.setVisibility(4);
                        rj0.invoke(layoutTimeBombBindingBind);
                        c3109bk0M.j(layoutTimeBombBindingBind);
                        C5027xc0 c5027xc1 = c3109bk0M.l;
                        if (c5027xc1 != null) {
                            AbstractC2995aW.n(viewInflate2);
                            c5027xc1.s = (TextView) viewInflate2.findViewById(R.id.tv_timer);
                            TextView textView2 = (TextView) viewInflate2.findViewById(R.id.tv_number_1);
                            if (textView2 != null) {
                                textView2.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tc0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view8) throws Throwable {
                                        int i8 = i4;
                                        EnumC3410f70 enumC3410f71 = EnumC3410f70.BombBtnC4;
                                        switch (i8) {
                                            case 0:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 1:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 2:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 3:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 4:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 5:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 6:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 7:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            default:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                        }
                                    }
                                });
                            }
                            TextView textView3 = (TextView) viewInflate2.findViewById(R.id.tv_number_2);
                            if (textView3 != null) {
                                textView3.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tc0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view8) throws Throwable {
                                        int i8 = i3;
                                        EnumC3410f70 enumC3410f71 = EnumC3410f70.BombBtnC4;
                                        switch (i8) {
                                            case 0:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 1:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 2:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 3:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 4:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 5:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 6:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 7:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            default:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                        }
                                    }
                                });
                            }
                            TextView textView4 = (TextView) viewInflate2.findViewById(R.id.tv_number_3);
                            if (textView4 != null) {
                                textView4.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tc0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view8) throws Throwable {
                                        int i8 = i6;
                                        EnumC3410f70 enumC3410f71 = EnumC3410f70.BombBtnC4;
                                        switch (i8) {
                                            case 0:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 1:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 2:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 3:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 4:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 5:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 6:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 7:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            default:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                        }
                                    }
                                });
                            }
                            TextView textView5 = (TextView) viewInflate2.findViewById(R.id.tv_number_4);
                            if (textView5 != null) {
                                textView5.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tc0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view8) throws Throwable {
                                        int i8 = i5;
                                        EnumC3410f70 enumC3410f71 = EnumC3410f70.BombBtnC4;
                                        switch (i8) {
                                            case 0:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 1:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 2:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 3:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 4:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 5:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 6:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 7:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            default:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                        }
                                    }
                                });
                            }
                            TextView textView6 = (TextView) viewInflate2.findViewById(R.id.tv_number_5);
                            if (textView6 != null) {
                                textView6.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tc0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view8) throws Throwable {
                                        int i8 = i;
                                        EnumC3410f70 enumC3410f71 = EnumC3410f70.BombBtnC4;
                                        switch (i8) {
                                            case 0:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 1:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 2:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 3:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 4:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 5:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 6:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 7:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            default:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                        }
                                    }
                                });
                            }
                            TextView textView7 = (TextView) viewInflate2.findViewById(R.id.tv_number_6);
                            if (textView7 != null) {
                                final int i8 = 5;
                                textView7.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tc0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view8) throws Throwable {
                                        int i9 = i8;
                                        EnumC3410f70 enumC3410f71 = EnumC3410f70.BombBtnC4;
                                        switch (i9) {
                                            case 0:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 1:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 2:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 3:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 4:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 5:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 6:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 7:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            default:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                        }
                                    }
                                });
                            }
                            TextView textView8 = (TextView) viewInflate2.findViewById(R.id.tv_number_7);
                            if (textView8 != null) {
                                final int i9 = 6;
                                textView8.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tc0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view8) throws Throwable {
                                        int i10 = i9;
                                        EnumC3410f70 enumC3410f71 = EnumC3410f70.BombBtnC4;
                                        switch (i10) {
                                            case 0:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 1:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 2:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 3:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 4:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 5:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 6:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 7:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            default:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                        }
                                    }
                                });
                            }
                            TextView textView9 = (TextView) viewInflate2.findViewById(R.id.tv_number_8);
                            if (textView9 != null) {
                                final int i10 = 7;
                                textView9.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tc0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view8) throws Throwable {
                                        int i11 = i10;
                                        EnumC3410f70 enumC3410f71 = EnumC3410f70.BombBtnC4;
                                        switch (i11) {
                                            case 0:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 1:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 2:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 3:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 4:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 5:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 6:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 7:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            default:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                        }
                                    }
                                });
                            }
                            TextView textView10 = (TextView) viewInflate2.findViewById(R.id.tv_number_9);
                            if (textView10 != null) {
                                final int i11 = 8;
                                textView10.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tc0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view8) throws Throwable {
                                        int i12 = i11;
                                        EnumC3410f70 enumC3410f71 = EnumC3410f70.BombBtnC4;
                                        switch (i12) {
                                            case 0:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 1:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 2:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 3:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 4:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 5:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 6:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            case 7:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            default:
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                        z = true;
                    } else {
                        viewInflate = activityGunBinding.vbTimeBomb.inflate();
                        AbstractC2995aW.p(viewInflate, "inflate(...)");
                        LayoutTimeBombBinding layoutTimeBombBindingBind2 = LayoutTimeBombBinding.bind(viewInflate);
                        AbstractC2995aW.p(layoutTimeBombBindingBind2, "bind(...)");
                        rj0.invoke(layoutTimeBombBindingBind2);
                        C5027xc0 c5027xc2 = c3109bk0M.l;
                        if (c5027xc2 != null) {
                            c5027xc2.u = true;
                        }
                        c3109bk0M.j(layoutTimeBombBindingBind2);
                    }
                    c5027xc0 = c3109bk0M.l;
                    if (c5027xc0 != null) {
                        c5027xc0.e = false;
                        c5027xc0.f = false;
                        c5027xc0.g = false;
                        c5027xc0.h = false;
                        c5027xc0.i = false;
                        c5027xc0.j = false;
                        c5027xc0.k = false;
                        c5027xc0.l = viewInflate.findViewById(R.id.iv_bg_start);
                        c5027xc0.m = viewInflate.findViewById(R.id.iv_bg_pause);
                        c5027xc0.n = viewInflate.findViewById(R.id.iv_bg_refresh);
                        c5027xc0.o = viewInflate.findViewById(R.id.iv_minus_one_min);
                        c5027xc0.p = viewInflate.findViewById(R.id.iv_add_one_min);
                        c5027xc0.q = viewInflate.findViewById(R.id.iv_minus_one_second);
                        c5027xc0.r = viewInflate.findViewById(R.id.iv_add_one_second);
                        if (!z) {
                            c5027xc0.s = (TextView) viewInflate.findViewById(R.id.tv_timer);
                        }
                        textView = c5027xc0.s;
                        if (textView != null) {
                            textView.post(new P0(c5027xc0, 15));
                        }
                        C2498In c2498In = App.n;
                        WD.D(C2498In.g(), null, 0, new C4939wc0(enumC3410f70, z, null), 3);
                        view = c5027xc0.l;
                        if (view != null) {
                            view.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sc0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view8) throws Throwable {
                                    int i12 = i4;
                                    EnumC3410f70 enumC3410f71 = enumC3410f70;
                                    C5027xc0 c5027xc3 = c5027xc0;
                                    switch (i12) {
                                        case 0:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.e) {
                                                S3.b("timer_click", "start");
                                                c5027xc3.e = true;
                                            }
                                            C3355eb c3355eb = c5027xc3.c;
                                            if ((c3355eb == null || !c3355eb.E) && !c5027xc3.y) {
                                                if (c3355eb != null && (c3355eb.j > 0 || c3355eb.f4847a.e)) {
                                                    c5027xc3.v = System.currentTimeMillis();
                                                    c5027xc3.w = 0;
                                                    C3355eb c3355eb2 = c5027xc3.c;
                                                    if (c3355eb2 != null) {
                                                        c3355eb2.E = true;
                                                    }
                                                    c5027xc3.c(false);
                                                    if (c5027xc3.t <= 0) {
                                                        C3355eb c3355eb3 = c5027xc3.c;
                                                        if (c3355eb3 != null) {
                                                            c3355eb3.p();
                                                        }
                                                    } else {
                                                        c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                    }
                                                    EnumC3410f70.c(enumC3410f71);
                                                } else if (c3355eb != null) {
                                                    c3355eb.p();
                                                }
                                                break;
                                            } else if (c5027xc3.x > 0 && c3355eb != null) {
                                                if (c3355eb.j > 0 || c3355eb.f4847a.e) {
                                                    c5027xc3.v = System.currentTimeMillis();
                                                    c5027xc3.t = c5027xc3.x;
                                                    c5027xc3.w = 0;
                                                    C3355eb c3355eb4 = c5027xc3.c;
                                                    if (c3355eb4 != null) {
                                                        c3355eb4.E = true;
                                                    }
                                                    c5027xc3.y = false;
                                                    c5027xc3.c(false);
                                                    c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                }
                                                break;
                                            }
                                            break;
                                        case 1:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.f) {
                                                S3.b("timer_click", ToolBar.REFRESH);
                                                c5027xc3.f = true;
                                            }
                                            c5027xc3.t = 0L;
                                            c5027xc3.d(0L);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 2:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.g) {
                                                S3.b("timer_click", "stop");
                                                c5027xc3.g = true;
                                            }
                                            C3355eb c3355eb5 = c5027xc3.c;
                                            if (c3355eb5 != null && c3355eb5.E) {
                                                c5027xc3.a().removeMessages(888);
                                                C3355eb c3355eb6 = c5027xc3.c;
                                                if (c3355eb6 != null) {
                                                    c3355eb6.q();
                                                }
                                                C3355eb c3355eb7 = c5027xc3.c;
                                                if (c3355eb7 != null) {
                                                    c3355eb7.E = false;
                                                }
                                                c5027xc3.c(true);
                                                c5027xc3.d(c5027xc3.t);
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            }
                                            break;
                                        case 3:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.h) {
                                                S3.b("timer_click", "minus_1m");
                                                c5027xc3.h = true;
                                            }
                                            long jB = C5027xc0.b(c5027xc3, c5027xc3.t, -60000L);
                                            c5027xc3.t = jB;
                                            c5027xc3.d(jB);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 4:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.i) {
                                                S3.b("timer_click", "add_1m");
                                                c5027xc3.i = true;
                                            }
                                            long jB2 = C5027xc0.b(c5027xc3, c5027xc3.t, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                                            c5027xc3.t = jB2;
                                            c5027xc3.d(jB2);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 5:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.j) {
                                                S3.b("timer_click", "minus_1s");
                                                c5027xc3.j = true;
                                            }
                                            long jB3 = C5027xc0.b(c5027xc3, c5027xc3.t, -1000L);
                                            c5027xc3.t = jB3;
                                            c5027xc3.d(jB3);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        default:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.k) {
                                                S3.b("timer_click", "add_1s");
                                                c5027xc3.k = true;
                                            }
                                            long jB4 = C5027xc0.b(c5027xc3, c5027xc3.t, 1000L);
                                            c5027xc3.t = jB4;
                                            c5027xc3.d(jB4);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                    }
                                }
                            });
                        }
                        view2 = c5027xc0.n;
                        if (view2 != null) {
                            view2.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sc0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view8) throws Throwable {
                                    int i12 = i3;
                                    EnumC3410f70 enumC3410f71 = enumC3410f70;
                                    C5027xc0 c5027xc3 = c5027xc0;
                                    switch (i12) {
                                        case 0:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.e) {
                                                S3.b("timer_click", "start");
                                                c5027xc3.e = true;
                                            }
                                            C3355eb c3355eb = c5027xc3.c;
                                            if ((c3355eb == null || !c3355eb.E) && !c5027xc3.y) {
                                                if (c3355eb != null && (c3355eb.j > 0 || c3355eb.f4847a.e)) {
                                                    c5027xc3.v = System.currentTimeMillis();
                                                    c5027xc3.w = 0;
                                                    C3355eb c3355eb2 = c5027xc3.c;
                                                    if (c3355eb2 != null) {
                                                        c3355eb2.E = true;
                                                    }
                                                    c5027xc3.c(false);
                                                    if (c5027xc3.t <= 0) {
                                                        C3355eb c3355eb3 = c5027xc3.c;
                                                        if (c3355eb3 != null) {
                                                            c3355eb3.p();
                                                        }
                                                    } else {
                                                        c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                    }
                                                    EnumC3410f70.c(enumC3410f71);
                                                } else if (c3355eb != null) {
                                                    c3355eb.p();
                                                }
                                                break;
                                            } else if (c5027xc3.x > 0 && c3355eb != null) {
                                                if (c3355eb.j > 0 || c3355eb.f4847a.e) {
                                                    c5027xc3.v = System.currentTimeMillis();
                                                    c5027xc3.t = c5027xc3.x;
                                                    c5027xc3.w = 0;
                                                    C3355eb c3355eb4 = c5027xc3.c;
                                                    if (c3355eb4 != null) {
                                                        c3355eb4.E = true;
                                                    }
                                                    c5027xc3.y = false;
                                                    c5027xc3.c(false);
                                                    c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                }
                                                break;
                                            }
                                            break;
                                        case 1:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.f) {
                                                S3.b("timer_click", ToolBar.REFRESH);
                                                c5027xc3.f = true;
                                            }
                                            c5027xc3.t = 0L;
                                            c5027xc3.d(0L);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 2:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.g) {
                                                S3.b("timer_click", "stop");
                                                c5027xc3.g = true;
                                            }
                                            C3355eb c3355eb5 = c5027xc3.c;
                                            if (c3355eb5 != null && c3355eb5.E) {
                                                c5027xc3.a().removeMessages(888);
                                                C3355eb c3355eb6 = c5027xc3.c;
                                                if (c3355eb6 != null) {
                                                    c3355eb6.q();
                                                }
                                                C3355eb c3355eb7 = c5027xc3.c;
                                                if (c3355eb7 != null) {
                                                    c3355eb7.E = false;
                                                }
                                                c5027xc3.c(true);
                                                c5027xc3.d(c5027xc3.t);
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            }
                                            break;
                                        case 3:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.h) {
                                                S3.b("timer_click", "minus_1m");
                                                c5027xc3.h = true;
                                            }
                                            long jB = C5027xc0.b(c5027xc3, c5027xc3.t, -60000L);
                                            c5027xc3.t = jB;
                                            c5027xc3.d(jB);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 4:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.i) {
                                                S3.b("timer_click", "add_1m");
                                                c5027xc3.i = true;
                                            }
                                            long jB2 = C5027xc0.b(c5027xc3, c5027xc3.t, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                                            c5027xc3.t = jB2;
                                            c5027xc3.d(jB2);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 5:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.j) {
                                                S3.b("timer_click", "minus_1s");
                                                c5027xc3.j = true;
                                            }
                                            long jB3 = C5027xc0.b(c5027xc3, c5027xc3.t, -1000L);
                                            c5027xc3.t = jB3;
                                            c5027xc3.d(jB3);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        default:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.k) {
                                                S3.b("timer_click", "add_1s");
                                                c5027xc3.k = true;
                                            }
                                            long jB4 = C5027xc0.b(c5027xc3, c5027xc3.t, 1000L);
                                            c5027xc3.t = jB4;
                                            c5027xc3.d(jB4);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                    }
                                }
                            });
                        }
                        view3 = c5027xc0.m;
                        if (view3 != null) {
                            view3.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sc0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view8) throws Throwable {
                                    int i12 = i6;
                                    EnumC3410f70 enumC3410f71 = enumC3410f70;
                                    C5027xc0 c5027xc3 = c5027xc0;
                                    switch (i12) {
                                        case 0:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.e) {
                                                S3.b("timer_click", "start");
                                                c5027xc3.e = true;
                                            }
                                            C3355eb c3355eb = c5027xc3.c;
                                            if ((c3355eb == null || !c3355eb.E) && !c5027xc3.y) {
                                                if (c3355eb != null && (c3355eb.j > 0 || c3355eb.f4847a.e)) {
                                                    c5027xc3.v = System.currentTimeMillis();
                                                    c5027xc3.w = 0;
                                                    C3355eb c3355eb2 = c5027xc3.c;
                                                    if (c3355eb2 != null) {
                                                        c3355eb2.E = true;
                                                    }
                                                    c5027xc3.c(false);
                                                    if (c5027xc3.t <= 0) {
                                                        C3355eb c3355eb3 = c5027xc3.c;
                                                        if (c3355eb3 != null) {
                                                            c3355eb3.p();
                                                        }
                                                    } else {
                                                        c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                    }
                                                    EnumC3410f70.c(enumC3410f71);
                                                } else if (c3355eb != null) {
                                                    c3355eb.p();
                                                }
                                                break;
                                            } else if (c5027xc3.x > 0 && c3355eb != null) {
                                                if (c3355eb.j > 0 || c3355eb.f4847a.e) {
                                                    c5027xc3.v = System.currentTimeMillis();
                                                    c5027xc3.t = c5027xc3.x;
                                                    c5027xc3.w = 0;
                                                    C3355eb c3355eb4 = c5027xc3.c;
                                                    if (c3355eb4 != null) {
                                                        c3355eb4.E = true;
                                                    }
                                                    c5027xc3.y = false;
                                                    c5027xc3.c(false);
                                                    c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                }
                                                break;
                                            }
                                            break;
                                        case 1:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.f) {
                                                S3.b("timer_click", ToolBar.REFRESH);
                                                c5027xc3.f = true;
                                            }
                                            c5027xc3.t = 0L;
                                            c5027xc3.d(0L);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 2:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.g) {
                                                S3.b("timer_click", "stop");
                                                c5027xc3.g = true;
                                            }
                                            C3355eb c3355eb5 = c5027xc3.c;
                                            if (c3355eb5 != null && c3355eb5.E) {
                                                c5027xc3.a().removeMessages(888);
                                                C3355eb c3355eb6 = c5027xc3.c;
                                                if (c3355eb6 != null) {
                                                    c3355eb6.q();
                                                }
                                                C3355eb c3355eb7 = c5027xc3.c;
                                                if (c3355eb7 != null) {
                                                    c3355eb7.E = false;
                                                }
                                                c5027xc3.c(true);
                                                c5027xc3.d(c5027xc3.t);
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            }
                                            break;
                                        case 3:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.h) {
                                                S3.b("timer_click", "minus_1m");
                                                c5027xc3.h = true;
                                            }
                                            long jB = C5027xc0.b(c5027xc3, c5027xc3.t, -60000L);
                                            c5027xc3.t = jB;
                                            c5027xc3.d(jB);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 4:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.i) {
                                                S3.b("timer_click", "add_1m");
                                                c5027xc3.i = true;
                                            }
                                            long jB2 = C5027xc0.b(c5027xc3, c5027xc3.t, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                                            c5027xc3.t = jB2;
                                            c5027xc3.d(jB2);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 5:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.j) {
                                                S3.b("timer_click", "minus_1s");
                                                c5027xc3.j = true;
                                            }
                                            long jB3 = C5027xc0.b(c5027xc3, c5027xc3.t, -1000L);
                                            c5027xc3.t = jB3;
                                            c5027xc3.d(jB3);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        default:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.k) {
                                                S3.b("timer_click", "add_1s");
                                                c5027xc3.k = true;
                                            }
                                            long jB4 = C5027xc0.b(c5027xc3, c5027xc3.t, 1000L);
                                            c5027xc3.t = jB4;
                                            c5027xc3.d(jB4);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                    }
                                }
                            });
                        }
                        view4 = c5027xc0.o;
                        if (view4 != null) {
                            view4.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sc0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view8) throws Throwable {
                                    int i12 = i5;
                                    EnumC3410f70 enumC3410f71 = enumC3410f70;
                                    C5027xc0 c5027xc3 = c5027xc0;
                                    switch (i12) {
                                        case 0:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.e) {
                                                S3.b("timer_click", "start");
                                                c5027xc3.e = true;
                                            }
                                            C3355eb c3355eb = c5027xc3.c;
                                            if ((c3355eb == null || !c3355eb.E) && !c5027xc3.y) {
                                                if (c3355eb != null && (c3355eb.j > 0 || c3355eb.f4847a.e)) {
                                                    c5027xc3.v = System.currentTimeMillis();
                                                    c5027xc3.w = 0;
                                                    C3355eb c3355eb2 = c5027xc3.c;
                                                    if (c3355eb2 != null) {
                                                        c3355eb2.E = true;
                                                    }
                                                    c5027xc3.c(false);
                                                    if (c5027xc3.t <= 0) {
                                                        C3355eb c3355eb3 = c5027xc3.c;
                                                        if (c3355eb3 != null) {
                                                            c3355eb3.p();
                                                        }
                                                    } else {
                                                        c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                    }
                                                    EnumC3410f70.c(enumC3410f71);
                                                } else if (c3355eb != null) {
                                                    c3355eb.p();
                                                }
                                                break;
                                            } else if (c5027xc3.x > 0 && c3355eb != null) {
                                                if (c3355eb.j > 0 || c3355eb.f4847a.e) {
                                                    c5027xc3.v = System.currentTimeMillis();
                                                    c5027xc3.t = c5027xc3.x;
                                                    c5027xc3.w = 0;
                                                    C3355eb c3355eb4 = c5027xc3.c;
                                                    if (c3355eb4 != null) {
                                                        c3355eb4.E = true;
                                                    }
                                                    c5027xc3.y = false;
                                                    c5027xc3.c(false);
                                                    c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                }
                                                break;
                                            }
                                            break;
                                        case 1:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.f) {
                                                S3.b("timer_click", ToolBar.REFRESH);
                                                c5027xc3.f = true;
                                            }
                                            c5027xc3.t = 0L;
                                            c5027xc3.d(0L);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 2:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.g) {
                                                S3.b("timer_click", "stop");
                                                c5027xc3.g = true;
                                            }
                                            C3355eb c3355eb5 = c5027xc3.c;
                                            if (c3355eb5 != null && c3355eb5.E) {
                                                c5027xc3.a().removeMessages(888);
                                                C3355eb c3355eb6 = c5027xc3.c;
                                                if (c3355eb6 != null) {
                                                    c3355eb6.q();
                                                }
                                                C3355eb c3355eb7 = c5027xc3.c;
                                                if (c3355eb7 != null) {
                                                    c3355eb7.E = false;
                                                }
                                                c5027xc3.c(true);
                                                c5027xc3.d(c5027xc3.t);
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            }
                                            break;
                                        case 3:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.h) {
                                                S3.b("timer_click", "minus_1m");
                                                c5027xc3.h = true;
                                            }
                                            long jB = C5027xc0.b(c5027xc3, c5027xc3.t, -60000L);
                                            c5027xc3.t = jB;
                                            c5027xc3.d(jB);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 4:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.i) {
                                                S3.b("timer_click", "add_1m");
                                                c5027xc3.i = true;
                                            }
                                            long jB2 = C5027xc0.b(c5027xc3, c5027xc3.t, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                                            c5027xc3.t = jB2;
                                            c5027xc3.d(jB2);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 5:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.j) {
                                                S3.b("timer_click", "minus_1s");
                                                c5027xc3.j = true;
                                            }
                                            long jB3 = C5027xc0.b(c5027xc3, c5027xc3.t, -1000L);
                                            c5027xc3.t = jB3;
                                            c5027xc3.d(jB3);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        default:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.k) {
                                                S3.b("timer_click", "add_1s");
                                                c5027xc3.k = true;
                                            }
                                            long jB4 = C5027xc0.b(c5027xc3, c5027xc3.t, 1000L);
                                            c5027xc3.t = jB4;
                                            c5027xc3.d(jB4);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                    }
                                }
                            });
                        }
                        view5 = c5027xc0.p;
                        if (view5 != null) {
                            view5.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sc0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view8) throws Throwable {
                                    int i12 = i;
                                    EnumC3410f70 enumC3410f71 = enumC3410f70;
                                    C5027xc0 c5027xc3 = c5027xc0;
                                    switch (i12) {
                                        case 0:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.e) {
                                                S3.b("timer_click", "start");
                                                c5027xc3.e = true;
                                            }
                                            C3355eb c3355eb = c5027xc3.c;
                                            if ((c3355eb == null || !c3355eb.E) && !c5027xc3.y) {
                                                if (c3355eb != null && (c3355eb.j > 0 || c3355eb.f4847a.e)) {
                                                    c5027xc3.v = System.currentTimeMillis();
                                                    c5027xc3.w = 0;
                                                    C3355eb c3355eb2 = c5027xc3.c;
                                                    if (c3355eb2 != null) {
                                                        c3355eb2.E = true;
                                                    }
                                                    c5027xc3.c(false);
                                                    if (c5027xc3.t <= 0) {
                                                        C3355eb c3355eb3 = c5027xc3.c;
                                                        if (c3355eb3 != null) {
                                                            c3355eb3.p();
                                                        }
                                                    } else {
                                                        c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                    }
                                                    EnumC3410f70.c(enumC3410f71);
                                                } else if (c3355eb != null) {
                                                    c3355eb.p();
                                                }
                                                break;
                                            } else if (c5027xc3.x > 0 && c3355eb != null) {
                                                if (c3355eb.j > 0 || c3355eb.f4847a.e) {
                                                    c5027xc3.v = System.currentTimeMillis();
                                                    c5027xc3.t = c5027xc3.x;
                                                    c5027xc3.w = 0;
                                                    C3355eb c3355eb4 = c5027xc3.c;
                                                    if (c3355eb4 != null) {
                                                        c3355eb4.E = true;
                                                    }
                                                    c5027xc3.y = false;
                                                    c5027xc3.c(false);
                                                    c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                }
                                                break;
                                            }
                                            break;
                                        case 1:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.f) {
                                                S3.b("timer_click", ToolBar.REFRESH);
                                                c5027xc3.f = true;
                                            }
                                            c5027xc3.t = 0L;
                                            c5027xc3.d(0L);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 2:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.g) {
                                                S3.b("timer_click", "stop");
                                                c5027xc3.g = true;
                                            }
                                            C3355eb c3355eb5 = c5027xc3.c;
                                            if (c3355eb5 != null && c3355eb5.E) {
                                                c5027xc3.a().removeMessages(888);
                                                C3355eb c3355eb6 = c5027xc3.c;
                                                if (c3355eb6 != null) {
                                                    c3355eb6.q();
                                                }
                                                C3355eb c3355eb7 = c5027xc3.c;
                                                if (c3355eb7 != null) {
                                                    c3355eb7.E = false;
                                                }
                                                c5027xc3.c(true);
                                                c5027xc3.d(c5027xc3.t);
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            }
                                            break;
                                        case 3:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.h) {
                                                S3.b("timer_click", "minus_1m");
                                                c5027xc3.h = true;
                                            }
                                            long jB = C5027xc0.b(c5027xc3, c5027xc3.t, -60000L);
                                            c5027xc3.t = jB;
                                            c5027xc3.d(jB);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 4:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.i) {
                                                S3.b("timer_click", "add_1m");
                                                c5027xc3.i = true;
                                            }
                                            long jB2 = C5027xc0.b(c5027xc3, c5027xc3.t, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                                            c5027xc3.t = jB2;
                                            c5027xc3.d(jB2);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 5:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.j) {
                                                S3.b("timer_click", "minus_1s");
                                                c5027xc3.j = true;
                                            }
                                            long jB3 = C5027xc0.b(c5027xc3, c5027xc3.t, -1000L);
                                            c5027xc3.t = jB3;
                                            c5027xc3.d(jB3);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        default:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.k) {
                                                S3.b("timer_click", "add_1s");
                                                c5027xc3.k = true;
                                            }
                                            long jB4 = C5027xc0.b(c5027xc3, c5027xc3.t, 1000L);
                                            c5027xc3.t = jB4;
                                            c5027xc3.d(jB4);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                    }
                                }
                            });
                        }
                        view6 = c5027xc0.q;
                        if (view6 != null) {
                            final int i12 = 5;
                            view6.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sc0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view8) throws Throwable {
                                    int i13 = i12;
                                    EnumC3410f70 enumC3410f71 = enumC3410f70;
                                    C5027xc0 c5027xc3 = c5027xc0;
                                    switch (i13) {
                                        case 0:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.e) {
                                                S3.b("timer_click", "start");
                                                c5027xc3.e = true;
                                            }
                                            C3355eb c3355eb = c5027xc3.c;
                                            if ((c3355eb == null || !c3355eb.E) && !c5027xc3.y) {
                                                if (c3355eb != null && (c3355eb.j > 0 || c3355eb.f4847a.e)) {
                                                    c5027xc3.v = System.currentTimeMillis();
                                                    c5027xc3.w = 0;
                                                    C3355eb c3355eb2 = c5027xc3.c;
                                                    if (c3355eb2 != null) {
                                                        c3355eb2.E = true;
                                                    }
                                                    c5027xc3.c(false);
                                                    if (c5027xc3.t <= 0) {
                                                        C3355eb c3355eb3 = c5027xc3.c;
                                                        if (c3355eb3 != null) {
                                                            c3355eb3.p();
                                                        }
                                                    } else {
                                                        c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                    }
                                                    EnumC3410f70.c(enumC3410f71);
                                                } else if (c3355eb != null) {
                                                    c3355eb.p();
                                                }
                                                break;
                                            } else if (c5027xc3.x > 0 && c3355eb != null) {
                                                if (c3355eb.j > 0 || c3355eb.f4847a.e) {
                                                    c5027xc3.v = System.currentTimeMillis();
                                                    c5027xc3.t = c5027xc3.x;
                                                    c5027xc3.w = 0;
                                                    C3355eb c3355eb4 = c5027xc3.c;
                                                    if (c3355eb4 != null) {
                                                        c3355eb4.E = true;
                                                    }
                                                    c5027xc3.y = false;
                                                    c5027xc3.c(false);
                                                    c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                }
                                                break;
                                            }
                                            break;
                                        case 1:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.f) {
                                                S3.b("timer_click", ToolBar.REFRESH);
                                                c5027xc3.f = true;
                                            }
                                            c5027xc3.t = 0L;
                                            c5027xc3.d(0L);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 2:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.g) {
                                                S3.b("timer_click", "stop");
                                                c5027xc3.g = true;
                                            }
                                            C3355eb c3355eb5 = c5027xc3.c;
                                            if (c3355eb5 != null && c3355eb5.E) {
                                                c5027xc3.a().removeMessages(888);
                                                C3355eb c3355eb6 = c5027xc3.c;
                                                if (c3355eb6 != null) {
                                                    c3355eb6.q();
                                                }
                                                C3355eb c3355eb7 = c5027xc3.c;
                                                if (c3355eb7 != null) {
                                                    c3355eb7.E = false;
                                                }
                                                c5027xc3.c(true);
                                                c5027xc3.d(c5027xc3.t);
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            }
                                            break;
                                        case 3:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.h) {
                                                S3.b("timer_click", "minus_1m");
                                                c5027xc3.h = true;
                                            }
                                            long jB = C5027xc0.b(c5027xc3, c5027xc3.t, -60000L);
                                            c5027xc3.t = jB;
                                            c5027xc3.d(jB);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 4:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.i) {
                                                S3.b("timer_click", "add_1m");
                                                c5027xc3.i = true;
                                            }
                                            long jB2 = C5027xc0.b(c5027xc3, c5027xc3.t, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                                            c5027xc3.t = jB2;
                                            c5027xc3.d(jB2);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 5:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.j) {
                                                S3.b("timer_click", "minus_1s");
                                                c5027xc3.j = true;
                                            }
                                            long jB3 = C5027xc0.b(c5027xc3, c5027xc3.t, -1000L);
                                            c5027xc3.t = jB3;
                                            c5027xc3.d(jB3);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        default:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.k) {
                                                S3.b("timer_click", "add_1s");
                                                c5027xc3.k = true;
                                            }
                                            long jB4 = C5027xc0.b(c5027xc3, c5027xc3.t, 1000L);
                                            c5027xc3.t = jB4;
                                            c5027xc3.d(jB4);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                    }
                                }
                            });
                        }
                        view7 = c5027xc0.r;
                        if (view7 != null) {
                            final int i13 = 6;
                            view7.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sc0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view8) throws Throwable {
                                    int i14 = i13;
                                    EnumC3410f70 enumC3410f71 = enumC3410f70;
                                    C5027xc0 c5027xc3 = c5027xc0;
                                    switch (i14) {
                                        case 0:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.e) {
                                                S3.b("timer_click", "start");
                                                c5027xc3.e = true;
                                            }
                                            C3355eb c3355eb = c5027xc3.c;
                                            if ((c3355eb == null || !c3355eb.E) && !c5027xc3.y) {
                                                if (c3355eb != null && (c3355eb.j > 0 || c3355eb.f4847a.e)) {
                                                    c5027xc3.v = System.currentTimeMillis();
                                                    c5027xc3.w = 0;
                                                    C3355eb c3355eb2 = c5027xc3.c;
                                                    if (c3355eb2 != null) {
                                                        c3355eb2.E = true;
                                                    }
                                                    c5027xc3.c(false);
                                                    if (c5027xc3.t <= 0) {
                                                        C3355eb c3355eb3 = c5027xc3.c;
                                                        if (c3355eb3 != null) {
                                                            c3355eb3.p();
                                                        }
                                                    } else {
                                                        c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                    }
                                                    EnumC3410f70.c(enumC3410f71);
                                                } else if (c3355eb != null) {
                                                    c3355eb.p();
                                                }
                                                break;
                                            } else if (c5027xc3.x > 0 && c3355eb != null) {
                                                if (c3355eb.j > 0 || c3355eb.f4847a.e) {
                                                    c5027xc3.v = System.currentTimeMillis();
                                                    c5027xc3.t = c5027xc3.x;
                                                    c5027xc3.w = 0;
                                                    C3355eb c3355eb4 = c5027xc3.c;
                                                    if (c3355eb4 != null) {
                                                        c3355eb4.E = true;
                                                    }
                                                    c5027xc3.y = false;
                                                    c5027xc3.c(false);
                                                    c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                }
                                                break;
                                            }
                                            break;
                                        case 1:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.f) {
                                                S3.b("timer_click", ToolBar.REFRESH);
                                                c5027xc3.f = true;
                                            }
                                            c5027xc3.t = 0L;
                                            c5027xc3.d(0L);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 2:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.g) {
                                                S3.b("timer_click", "stop");
                                                c5027xc3.g = true;
                                            }
                                            C3355eb c3355eb5 = c5027xc3.c;
                                            if (c3355eb5 != null && c3355eb5.E) {
                                                c5027xc3.a().removeMessages(888);
                                                C3355eb c3355eb6 = c5027xc3.c;
                                                if (c3355eb6 != null) {
                                                    c3355eb6.q();
                                                }
                                                C3355eb c3355eb7 = c5027xc3.c;
                                                if (c3355eb7 != null) {
                                                    c3355eb7.E = false;
                                                }
                                                c5027xc3.c(true);
                                                c5027xc3.d(c5027xc3.t);
                                                EnumC3410f70.c(enumC3410f71);
                                                break;
                                            }
                                            break;
                                        case 3:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.h) {
                                                S3.b("timer_click", "minus_1m");
                                                c5027xc3.h = true;
                                            }
                                            long jB = C5027xc0.b(c5027xc3, c5027xc3.t, -60000L);
                                            c5027xc3.t = jB;
                                            c5027xc3.d(jB);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 4:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.i) {
                                                S3.b("timer_click", "add_1m");
                                                c5027xc3.i = true;
                                            }
                                            long jB2 = C5027xc0.b(c5027xc3, c5027xc3.t, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                                            c5027xc3.t = jB2;
                                            c5027xc3.d(jB2);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        case 5:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.j) {
                                                S3.b("timer_click", "minus_1s");
                                                c5027xc3.j = true;
                                            }
                                            long jB3 = C5027xc0.b(c5027xc3, c5027xc3.t, -1000L);
                                            c5027xc3.t = jB3;
                                            c5027xc3.d(jB3);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        default:
                                            AbstractC2995aW.q(c5027xc3, "this$0");
                                            AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                            if (!c5027xc3.k) {
                                                S3.b("timer_click", "add_1s");
                                                c5027xc3.k = true;
                                            }
                                            long jB4 = C5027xc0.b(c5027xc3, c5027xc3.t, 1000L);
                                            c5027xc3.t = jB4;
                                            c5027xc3.d(jB4);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                    }
                                }
                            });
                        }
                    }
                }
                z = false;
                c5027xc0 = c3109bk0M.l;
                if (c5027xc0 != null) {
                    c5027xc0.e = false;
                    c5027xc0.f = false;
                    c5027xc0.g = false;
                    c5027xc0.h = false;
                    c5027xc0.i = false;
                    c5027xc0.j = false;
                    c5027xc0.k = false;
                    c5027xc0.l = viewInflate.findViewById(R.id.iv_bg_start);
                    c5027xc0.m = viewInflate.findViewById(R.id.iv_bg_pause);
                    c5027xc0.n = viewInflate.findViewById(R.id.iv_bg_refresh);
                    c5027xc0.o = viewInflate.findViewById(R.id.iv_minus_one_min);
                    c5027xc0.p = viewInflate.findViewById(R.id.iv_add_one_min);
                    c5027xc0.q = viewInflate.findViewById(R.id.iv_minus_one_second);
                    c5027xc0.r = viewInflate.findViewById(R.id.iv_add_one_second);
                    if (!z) {
                        c5027xc0.s = (TextView) viewInflate.findViewById(R.id.tv_timer);
                    }
                    textView = c5027xc0.s;
                    if (textView != null) {
                        textView.post(new P0(c5027xc0, 15));
                    }
                    C2498In c2498In2 = App.n;
                    WD.D(C2498In.g(), null, 0, new C4939wc0(enumC3410f70, z, null), 3);
                    view = c5027xc0.l;
                    if (view != null) {
                        view.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sc0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view8) throws Throwable {
                                int i14 = i4;
                                EnumC3410f70 enumC3410f71 = enumC3410f70;
                                C5027xc0 c5027xc3 = c5027xc0;
                                switch (i14) {
                                    case 0:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.e) {
                                            S3.b("timer_click", "start");
                                            c5027xc3.e = true;
                                        }
                                        C3355eb c3355eb = c5027xc3.c;
                                        if ((c3355eb == null || !c3355eb.E) && !c5027xc3.y) {
                                            if (c3355eb != null && (c3355eb.j > 0 || c3355eb.f4847a.e)) {
                                                c5027xc3.v = System.currentTimeMillis();
                                                c5027xc3.w = 0;
                                                C3355eb c3355eb2 = c5027xc3.c;
                                                if (c3355eb2 != null) {
                                                    c3355eb2.E = true;
                                                }
                                                c5027xc3.c(false);
                                                if (c5027xc3.t <= 0) {
                                                    C3355eb c3355eb3 = c5027xc3.c;
                                                    if (c3355eb3 != null) {
                                                        c3355eb3.p();
                                                    }
                                                } else {
                                                    c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                }
                                                EnumC3410f70.c(enumC3410f71);
                                            } else if (c3355eb != null) {
                                                c3355eb.p();
                                            }
                                            break;
                                        } else if (c5027xc3.x > 0 && c3355eb != null) {
                                            if (c3355eb.j > 0 || c3355eb.f4847a.e) {
                                                c5027xc3.v = System.currentTimeMillis();
                                                c5027xc3.t = c5027xc3.x;
                                                c5027xc3.w = 0;
                                                C3355eb c3355eb4 = c5027xc3.c;
                                                if (c3355eb4 != null) {
                                                    c3355eb4.E = true;
                                                }
                                                c5027xc3.y = false;
                                                c5027xc3.c(false);
                                                c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.f) {
                                            S3.b("timer_click", ToolBar.REFRESH);
                                            c5027xc3.f = true;
                                        }
                                        c5027xc3.t = 0L;
                                        c5027xc3.d(0L);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 2:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.g) {
                                            S3.b("timer_click", "stop");
                                            c5027xc3.g = true;
                                        }
                                        C3355eb c3355eb5 = c5027xc3.c;
                                        if (c3355eb5 != null && c3355eb5.E) {
                                            c5027xc3.a().removeMessages(888);
                                            C3355eb c3355eb6 = c5027xc3.c;
                                            if (c3355eb6 != null) {
                                                c3355eb6.q();
                                            }
                                            C3355eb c3355eb7 = c5027xc3.c;
                                            if (c3355eb7 != null) {
                                                c3355eb7.E = false;
                                            }
                                            c5027xc3.c(true);
                                            c5027xc3.d(c5027xc3.t);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.h) {
                                            S3.b("timer_click", "minus_1m");
                                            c5027xc3.h = true;
                                        }
                                        long jB = C5027xc0.b(c5027xc3, c5027xc3.t, -60000L);
                                        c5027xc3.t = jB;
                                        c5027xc3.d(jB);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 4:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.i) {
                                            S3.b("timer_click", "add_1m");
                                            c5027xc3.i = true;
                                        }
                                        long jB2 = C5027xc0.b(c5027xc3, c5027xc3.t, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                                        c5027xc3.t = jB2;
                                        c5027xc3.d(jB2);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 5:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.j) {
                                            S3.b("timer_click", "minus_1s");
                                            c5027xc3.j = true;
                                        }
                                        long jB3 = C5027xc0.b(c5027xc3, c5027xc3.t, -1000L);
                                        c5027xc3.t = jB3;
                                        c5027xc3.d(jB3);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    default:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.k) {
                                            S3.b("timer_click", "add_1s");
                                            c5027xc3.k = true;
                                        }
                                        long jB4 = C5027xc0.b(c5027xc3, c5027xc3.t, 1000L);
                                        c5027xc3.t = jB4;
                                        c5027xc3.d(jB4);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                }
                            }
                        });
                    }
                    view2 = c5027xc0.n;
                    if (view2 != null) {
                        view2.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sc0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view8) throws Throwable {
                                int i14 = i3;
                                EnumC3410f70 enumC3410f71 = enumC3410f70;
                                C5027xc0 c5027xc3 = c5027xc0;
                                switch (i14) {
                                    case 0:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.e) {
                                            S3.b("timer_click", "start");
                                            c5027xc3.e = true;
                                        }
                                        C3355eb c3355eb = c5027xc3.c;
                                        if ((c3355eb == null || !c3355eb.E) && !c5027xc3.y) {
                                            if (c3355eb != null && (c3355eb.j > 0 || c3355eb.f4847a.e)) {
                                                c5027xc3.v = System.currentTimeMillis();
                                                c5027xc3.w = 0;
                                                C3355eb c3355eb2 = c5027xc3.c;
                                                if (c3355eb2 != null) {
                                                    c3355eb2.E = true;
                                                }
                                                c5027xc3.c(false);
                                                if (c5027xc3.t <= 0) {
                                                    C3355eb c3355eb3 = c5027xc3.c;
                                                    if (c3355eb3 != null) {
                                                        c3355eb3.p();
                                                    }
                                                } else {
                                                    c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                }
                                                EnumC3410f70.c(enumC3410f71);
                                            } else if (c3355eb != null) {
                                                c3355eb.p();
                                            }
                                            break;
                                        } else if (c5027xc3.x > 0 && c3355eb != null) {
                                            if (c3355eb.j > 0 || c3355eb.f4847a.e) {
                                                c5027xc3.v = System.currentTimeMillis();
                                                c5027xc3.t = c5027xc3.x;
                                                c5027xc3.w = 0;
                                                C3355eb c3355eb4 = c5027xc3.c;
                                                if (c3355eb4 != null) {
                                                    c3355eb4.E = true;
                                                }
                                                c5027xc3.y = false;
                                                c5027xc3.c(false);
                                                c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.f) {
                                            S3.b("timer_click", ToolBar.REFRESH);
                                            c5027xc3.f = true;
                                        }
                                        c5027xc3.t = 0L;
                                        c5027xc3.d(0L);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 2:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.g) {
                                            S3.b("timer_click", "stop");
                                            c5027xc3.g = true;
                                        }
                                        C3355eb c3355eb5 = c5027xc3.c;
                                        if (c3355eb5 != null && c3355eb5.E) {
                                            c5027xc3.a().removeMessages(888);
                                            C3355eb c3355eb6 = c5027xc3.c;
                                            if (c3355eb6 != null) {
                                                c3355eb6.q();
                                            }
                                            C3355eb c3355eb7 = c5027xc3.c;
                                            if (c3355eb7 != null) {
                                                c3355eb7.E = false;
                                            }
                                            c5027xc3.c(true);
                                            c5027xc3.d(c5027xc3.t);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.h) {
                                            S3.b("timer_click", "minus_1m");
                                            c5027xc3.h = true;
                                        }
                                        long jB = C5027xc0.b(c5027xc3, c5027xc3.t, -60000L);
                                        c5027xc3.t = jB;
                                        c5027xc3.d(jB);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 4:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.i) {
                                            S3.b("timer_click", "add_1m");
                                            c5027xc3.i = true;
                                        }
                                        long jB2 = C5027xc0.b(c5027xc3, c5027xc3.t, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                                        c5027xc3.t = jB2;
                                        c5027xc3.d(jB2);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 5:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.j) {
                                            S3.b("timer_click", "minus_1s");
                                            c5027xc3.j = true;
                                        }
                                        long jB3 = C5027xc0.b(c5027xc3, c5027xc3.t, -1000L);
                                        c5027xc3.t = jB3;
                                        c5027xc3.d(jB3);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    default:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.k) {
                                            S3.b("timer_click", "add_1s");
                                            c5027xc3.k = true;
                                        }
                                        long jB4 = C5027xc0.b(c5027xc3, c5027xc3.t, 1000L);
                                        c5027xc3.t = jB4;
                                        c5027xc3.d(jB4);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                }
                            }
                        });
                    }
                    view3 = c5027xc0.m;
                    if (view3 != null) {
                        view3.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sc0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view8) throws Throwable {
                                int i14 = i6;
                                EnumC3410f70 enumC3410f71 = enumC3410f70;
                                C5027xc0 c5027xc3 = c5027xc0;
                                switch (i14) {
                                    case 0:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.e) {
                                            S3.b("timer_click", "start");
                                            c5027xc3.e = true;
                                        }
                                        C3355eb c3355eb = c5027xc3.c;
                                        if ((c3355eb == null || !c3355eb.E) && !c5027xc3.y) {
                                            if (c3355eb != null && (c3355eb.j > 0 || c3355eb.f4847a.e)) {
                                                c5027xc3.v = System.currentTimeMillis();
                                                c5027xc3.w = 0;
                                                C3355eb c3355eb2 = c5027xc3.c;
                                                if (c3355eb2 != null) {
                                                    c3355eb2.E = true;
                                                }
                                                c5027xc3.c(false);
                                                if (c5027xc3.t <= 0) {
                                                    C3355eb c3355eb3 = c5027xc3.c;
                                                    if (c3355eb3 != null) {
                                                        c3355eb3.p();
                                                    }
                                                } else {
                                                    c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                }
                                                EnumC3410f70.c(enumC3410f71);
                                            } else if (c3355eb != null) {
                                                c3355eb.p();
                                            }
                                            break;
                                        } else if (c5027xc3.x > 0 && c3355eb != null) {
                                            if (c3355eb.j > 0 || c3355eb.f4847a.e) {
                                                c5027xc3.v = System.currentTimeMillis();
                                                c5027xc3.t = c5027xc3.x;
                                                c5027xc3.w = 0;
                                                C3355eb c3355eb4 = c5027xc3.c;
                                                if (c3355eb4 != null) {
                                                    c3355eb4.E = true;
                                                }
                                                c5027xc3.y = false;
                                                c5027xc3.c(false);
                                                c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.f) {
                                            S3.b("timer_click", ToolBar.REFRESH);
                                            c5027xc3.f = true;
                                        }
                                        c5027xc3.t = 0L;
                                        c5027xc3.d(0L);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 2:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.g) {
                                            S3.b("timer_click", "stop");
                                            c5027xc3.g = true;
                                        }
                                        C3355eb c3355eb5 = c5027xc3.c;
                                        if (c3355eb5 != null && c3355eb5.E) {
                                            c5027xc3.a().removeMessages(888);
                                            C3355eb c3355eb6 = c5027xc3.c;
                                            if (c3355eb6 != null) {
                                                c3355eb6.q();
                                            }
                                            C3355eb c3355eb7 = c5027xc3.c;
                                            if (c3355eb7 != null) {
                                                c3355eb7.E = false;
                                            }
                                            c5027xc3.c(true);
                                            c5027xc3.d(c5027xc3.t);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.h) {
                                            S3.b("timer_click", "minus_1m");
                                            c5027xc3.h = true;
                                        }
                                        long jB = C5027xc0.b(c5027xc3, c5027xc3.t, -60000L);
                                        c5027xc3.t = jB;
                                        c5027xc3.d(jB);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 4:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.i) {
                                            S3.b("timer_click", "add_1m");
                                            c5027xc3.i = true;
                                        }
                                        long jB2 = C5027xc0.b(c5027xc3, c5027xc3.t, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                                        c5027xc3.t = jB2;
                                        c5027xc3.d(jB2);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 5:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.j) {
                                            S3.b("timer_click", "minus_1s");
                                            c5027xc3.j = true;
                                        }
                                        long jB3 = C5027xc0.b(c5027xc3, c5027xc3.t, -1000L);
                                        c5027xc3.t = jB3;
                                        c5027xc3.d(jB3);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    default:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.k) {
                                            S3.b("timer_click", "add_1s");
                                            c5027xc3.k = true;
                                        }
                                        long jB4 = C5027xc0.b(c5027xc3, c5027xc3.t, 1000L);
                                        c5027xc3.t = jB4;
                                        c5027xc3.d(jB4);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                }
                            }
                        });
                    }
                    view4 = c5027xc0.o;
                    if (view4 != null) {
                        view4.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sc0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view8) throws Throwable {
                                int i14 = i5;
                                EnumC3410f70 enumC3410f71 = enumC3410f70;
                                C5027xc0 c5027xc3 = c5027xc0;
                                switch (i14) {
                                    case 0:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.e) {
                                            S3.b("timer_click", "start");
                                            c5027xc3.e = true;
                                        }
                                        C3355eb c3355eb = c5027xc3.c;
                                        if ((c3355eb == null || !c3355eb.E) && !c5027xc3.y) {
                                            if (c3355eb != null && (c3355eb.j > 0 || c3355eb.f4847a.e)) {
                                                c5027xc3.v = System.currentTimeMillis();
                                                c5027xc3.w = 0;
                                                C3355eb c3355eb2 = c5027xc3.c;
                                                if (c3355eb2 != null) {
                                                    c3355eb2.E = true;
                                                }
                                                c5027xc3.c(false);
                                                if (c5027xc3.t <= 0) {
                                                    C3355eb c3355eb3 = c5027xc3.c;
                                                    if (c3355eb3 != null) {
                                                        c3355eb3.p();
                                                    }
                                                } else {
                                                    c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                }
                                                EnumC3410f70.c(enumC3410f71);
                                            } else if (c3355eb != null) {
                                                c3355eb.p();
                                            }
                                            break;
                                        } else if (c5027xc3.x > 0 && c3355eb != null) {
                                            if (c3355eb.j > 0 || c3355eb.f4847a.e) {
                                                c5027xc3.v = System.currentTimeMillis();
                                                c5027xc3.t = c5027xc3.x;
                                                c5027xc3.w = 0;
                                                C3355eb c3355eb4 = c5027xc3.c;
                                                if (c3355eb4 != null) {
                                                    c3355eb4.E = true;
                                                }
                                                c5027xc3.y = false;
                                                c5027xc3.c(false);
                                                c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.f) {
                                            S3.b("timer_click", ToolBar.REFRESH);
                                            c5027xc3.f = true;
                                        }
                                        c5027xc3.t = 0L;
                                        c5027xc3.d(0L);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 2:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.g) {
                                            S3.b("timer_click", "stop");
                                            c5027xc3.g = true;
                                        }
                                        C3355eb c3355eb5 = c5027xc3.c;
                                        if (c3355eb5 != null && c3355eb5.E) {
                                            c5027xc3.a().removeMessages(888);
                                            C3355eb c3355eb6 = c5027xc3.c;
                                            if (c3355eb6 != null) {
                                                c3355eb6.q();
                                            }
                                            C3355eb c3355eb7 = c5027xc3.c;
                                            if (c3355eb7 != null) {
                                                c3355eb7.E = false;
                                            }
                                            c5027xc3.c(true);
                                            c5027xc3.d(c5027xc3.t);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.h) {
                                            S3.b("timer_click", "minus_1m");
                                            c5027xc3.h = true;
                                        }
                                        long jB = C5027xc0.b(c5027xc3, c5027xc3.t, -60000L);
                                        c5027xc3.t = jB;
                                        c5027xc3.d(jB);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 4:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.i) {
                                            S3.b("timer_click", "add_1m");
                                            c5027xc3.i = true;
                                        }
                                        long jB2 = C5027xc0.b(c5027xc3, c5027xc3.t, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                                        c5027xc3.t = jB2;
                                        c5027xc3.d(jB2);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 5:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.j) {
                                            S3.b("timer_click", "minus_1s");
                                            c5027xc3.j = true;
                                        }
                                        long jB3 = C5027xc0.b(c5027xc3, c5027xc3.t, -1000L);
                                        c5027xc3.t = jB3;
                                        c5027xc3.d(jB3);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    default:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.k) {
                                            S3.b("timer_click", "add_1s");
                                            c5027xc3.k = true;
                                        }
                                        long jB4 = C5027xc0.b(c5027xc3, c5027xc3.t, 1000L);
                                        c5027xc3.t = jB4;
                                        c5027xc3.d(jB4);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                }
                            }
                        });
                    }
                    view5 = c5027xc0.p;
                    if (view5 != null) {
                        view5.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sc0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view8) throws Throwable {
                                int i14 = i;
                                EnumC3410f70 enumC3410f71 = enumC3410f70;
                                C5027xc0 c5027xc3 = c5027xc0;
                                switch (i14) {
                                    case 0:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.e) {
                                            S3.b("timer_click", "start");
                                            c5027xc3.e = true;
                                        }
                                        C3355eb c3355eb = c5027xc3.c;
                                        if ((c3355eb == null || !c3355eb.E) && !c5027xc3.y) {
                                            if (c3355eb != null && (c3355eb.j > 0 || c3355eb.f4847a.e)) {
                                                c5027xc3.v = System.currentTimeMillis();
                                                c5027xc3.w = 0;
                                                C3355eb c3355eb2 = c5027xc3.c;
                                                if (c3355eb2 != null) {
                                                    c3355eb2.E = true;
                                                }
                                                c5027xc3.c(false);
                                                if (c5027xc3.t <= 0) {
                                                    C3355eb c3355eb3 = c5027xc3.c;
                                                    if (c3355eb3 != null) {
                                                        c3355eb3.p();
                                                    }
                                                } else {
                                                    c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                }
                                                EnumC3410f70.c(enumC3410f71);
                                            } else if (c3355eb != null) {
                                                c3355eb.p();
                                            }
                                            break;
                                        } else if (c5027xc3.x > 0 && c3355eb != null) {
                                            if (c3355eb.j > 0 || c3355eb.f4847a.e) {
                                                c5027xc3.v = System.currentTimeMillis();
                                                c5027xc3.t = c5027xc3.x;
                                                c5027xc3.w = 0;
                                                C3355eb c3355eb4 = c5027xc3.c;
                                                if (c3355eb4 != null) {
                                                    c3355eb4.E = true;
                                                }
                                                c5027xc3.y = false;
                                                c5027xc3.c(false);
                                                c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.f) {
                                            S3.b("timer_click", ToolBar.REFRESH);
                                            c5027xc3.f = true;
                                        }
                                        c5027xc3.t = 0L;
                                        c5027xc3.d(0L);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 2:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.g) {
                                            S3.b("timer_click", "stop");
                                            c5027xc3.g = true;
                                        }
                                        C3355eb c3355eb5 = c5027xc3.c;
                                        if (c3355eb5 != null && c3355eb5.E) {
                                            c5027xc3.a().removeMessages(888);
                                            C3355eb c3355eb6 = c5027xc3.c;
                                            if (c3355eb6 != null) {
                                                c3355eb6.q();
                                            }
                                            C3355eb c3355eb7 = c5027xc3.c;
                                            if (c3355eb7 != null) {
                                                c3355eb7.E = false;
                                            }
                                            c5027xc3.c(true);
                                            c5027xc3.d(c5027xc3.t);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.h) {
                                            S3.b("timer_click", "minus_1m");
                                            c5027xc3.h = true;
                                        }
                                        long jB = C5027xc0.b(c5027xc3, c5027xc3.t, -60000L);
                                        c5027xc3.t = jB;
                                        c5027xc3.d(jB);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 4:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.i) {
                                            S3.b("timer_click", "add_1m");
                                            c5027xc3.i = true;
                                        }
                                        long jB2 = C5027xc0.b(c5027xc3, c5027xc3.t, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                                        c5027xc3.t = jB2;
                                        c5027xc3.d(jB2);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 5:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.j) {
                                            S3.b("timer_click", "minus_1s");
                                            c5027xc3.j = true;
                                        }
                                        long jB3 = C5027xc0.b(c5027xc3, c5027xc3.t, -1000L);
                                        c5027xc3.t = jB3;
                                        c5027xc3.d(jB3);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    default:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.k) {
                                            S3.b("timer_click", "add_1s");
                                            c5027xc3.k = true;
                                        }
                                        long jB4 = C5027xc0.b(c5027xc3, c5027xc3.t, 1000L);
                                        c5027xc3.t = jB4;
                                        c5027xc3.d(jB4);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                }
                            }
                        });
                    }
                    view6 = c5027xc0.q;
                    if (view6 != null) {
                        final int i14 = 5;
                        view6.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sc0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view8) throws Throwable {
                                int i15 = i14;
                                EnumC3410f70 enumC3410f71 = enumC3410f70;
                                C5027xc0 c5027xc3 = c5027xc0;
                                switch (i15) {
                                    case 0:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.e) {
                                            S3.b("timer_click", "start");
                                            c5027xc3.e = true;
                                        }
                                        C3355eb c3355eb = c5027xc3.c;
                                        if ((c3355eb == null || !c3355eb.E) && !c5027xc3.y) {
                                            if (c3355eb != null && (c3355eb.j > 0 || c3355eb.f4847a.e)) {
                                                c5027xc3.v = System.currentTimeMillis();
                                                c5027xc3.w = 0;
                                                C3355eb c3355eb2 = c5027xc3.c;
                                                if (c3355eb2 != null) {
                                                    c3355eb2.E = true;
                                                }
                                                c5027xc3.c(false);
                                                if (c5027xc3.t <= 0) {
                                                    C3355eb c3355eb3 = c5027xc3.c;
                                                    if (c3355eb3 != null) {
                                                        c3355eb3.p();
                                                    }
                                                } else {
                                                    c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                }
                                                EnumC3410f70.c(enumC3410f71);
                                            } else if (c3355eb != null) {
                                                c3355eb.p();
                                            }
                                            break;
                                        } else if (c5027xc3.x > 0 && c3355eb != null) {
                                            if (c3355eb.j > 0 || c3355eb.f4847a.e) {
                                                c5027xc3.v = System.currentTimeMillis();
                                                c5027xc3.t = c5027xc3.x;
                                                c5027xc3.w = 0;
                                                C3355eb c3355eb4 = c5027xc3.c;
                                                if (c3355eb4 != null) {
                                                    c3355eb4.E = true;
                                                }
                                                c5027xc3.y = false;
                                                c5027xc3.c(false);
                                                c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.f) {
                                            S3.b("timer_click", ToolBar.REFRESH);
                                            c5027xc3.f = true;
                                        }
                                        c5027xc3.t = 0L;
                                        c5027xc3.d(0L);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 2:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.g) {
                                            S3.b("timer_click", "stop");
                                            c5027xc3.g = true;
                                        }
                                        C3355eb c3355eb5 = c5027xc3.c;
                                        if (c3355eb5 != null && c3355eb5.E) {
                                            c5027xc3.a().removeMessages(888);
                                            C3355eb c3355eb6 = c5027xc3.c;
                                            if (c3355eb6 != null) {
                                                c3355eb6.q();
                                            }
                                            C3355eb c3355eb7 = c5027xc3.c;
                                            if (c3355eb7 != null) {
                                                c3355eb7.E = false;
                                            }
                                            c5027xc3.c(true);
                                            c5027xc3.d(c5027xc3.t);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.h) {
                                            S3.b("timer_click", "minus_1m");
                                            c5027xc3.h = true;
                                        }
                                        long jB = C5027xc0.b(c5027xc3, c5027xc3.t, -60000L);
                                        c5027xc3.t = jB;
                                        c5027xc3.d(jB);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 4:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.i) {
                                            S3.b("timer_click", "add_1m");
                                            c5027xc3.i = true;
                                        }
                                        long jB2 = C5027xc0.b(c5027xc3, c5027xc3.t, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                                        c5027xc3.t = jB2;
                                        c5027xc3.d(jB2);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 5:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.j) {
                                            S3.b("timer_click", "minus_1s");
                                            c5027xc3.j = true;
                                        }
                                        long jB3 = C5027xc0.b(c5027xc3, c5027xc3.t, -1000L);
                                        c5027xc3.t = jB3;
                                        c5027xc3.d(jB3);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    default:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.k) {
                                            S3.b("timer_click", "add_1s");
                                            c5027xc3.k = true;
                                        }
                                        long jB4 = C5027xc0.b(c5027xc3, c5027xc3.t, 1000L);
                                        c5027xc3.t = jB4;
                                        c5027xc3.d(jB4);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                }
                            }
                        });
                    }
                    view7 = c5027xc0.r;
                    if (view7 != null) {
                        final int i15 = 6;
                        view7.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sc0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view8) throws Throwable {
                                int i16 = i15;
                                EnumC3410f70 enumC3410f71 = enumC3410f70;
                                C5027xc0 c5027xc3 = c5027xc0;
                                switch (i16) {
                                    case 0:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.e) {
                                            S3.b("timer_click", "start");
                                            c5027xc3.e = true;
                                        }
                                        C3355eb c3355eb = c5027xc3.c;
                                        if ((c3355eb == null || !c3355eb.E) && !c5027xc3.y) {
                                            if (c3355eb != null && (c3355eb.j > 0 || c3355eb.f4847a.e)) {
                                                c5027xc3.v = System.currentTimeMillis();
                                                c5027xc3.w = 0;
                                                C3355eb c3355eb2 = c5027xc3.c;
                                                if (c3355eb2 != null) {
                                                    c3355eb2.E = true;
                                                }
                                                c5027xc3.c(false);
                                                if (c5027xc3.t <= 0) {
                                                    C3355eb c3355eb3 = c5027xc3.c;
                                                    if (c3355eb3 != null) {
                                                        c3355eb3.p();
                                                    }
                                                } else {
                                                    c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                                }
                                                EnumC3410f70.c(enumC3410f71);
                                            } else if (c3355eb != null) {
                                                c3355eb.p();
                                            }
                                            break;
                                        } else if (c5027xc3.x > 0 && c3355eb != null) {
                                            if (c3355eb.j > 0 || c3355eb.f4847a.e) {
                                                c5027xc3.v = System.currentTimeMillis();
                                                c5027xc3.t = c5027xc3.x;
                                                c5027xc3.w = 0;
                                                C3355eb c3355eb4 = c5027xc3.c;
                                                if (c3355eb4 != null) {
                                                    c3355eb4.E = true;
                                                }
                                                c5027xc3.y = false;
                                                c5027xc3.c(false);
                                                c5027xc3.a().sendEmptyMessageDelayed(888, 10L);
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.f) {
                                            S3.b("timer_click", ToolBar.REFRESH);
                                            c5027xc3.f = true;
                                        }
                                        c5027xc3.t = 0L;
                                        c5027xc3.d(0L);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 2:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.g) {
                                            S3.b("timer_click", "stop");
                                            c5027xc3.g = true;
                                        }
                                        C3355eb c3355eb5 = c5027xc3.c;
                                        if (c3355eb5 != null && c3355eb5.E) {
                                            c5027xc3.a().removeMessages(888);
                                            C3355eb c3355eb6 = c5027xc3.c;
                                            if (c3355eb6 != null) {
                                                c3355eb6.q();
                                            }
                                            C3355eb c3355eb7 = c5027xc3.c;
                                            if (c3355eb7 != null) {
                                                c3355eb7.E = false;
                                            }
                                            c5027xc3.c(true);
                                            c5027xc3.d(c5027xc3.t);
                                            EnumC3410f70.c(enumC3410f71);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.h) {
                                            S3.b("timer_click", "minus_1m");
                                            c5027xc3.h = true;
                                        }
                                        long jB = C5027xc0.b(c5027xc3, c5027xc3.t, -60000L);
                                        c5027xc3.t = jB;
                                        c5027xc3.d(jB);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 4:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.i) {
                                            S3.b("timer_click", "add_1m");
                                            c5027xc3.i = true;
                                        }
                                        long jB2 = C5027xc0.b(c5027xc3, c5027xc3.t, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                                        c5027xc3.t = jB2;
                                        c5027xc3.d(jB2);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    case 5:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.j) {
                                            S3.b("timer_click", "minus_1s");
                                            c5027xc3.j = true;
                                        }
                                        long jB3 = C5027xc0.b(c5027xc3, c5027xc3.t, -1000L);
                                        c5027xc3.t = jB3;
                                        c5027xc3.d(jB3);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                    default:
                                        AbstractC2995aW.q(c5027xc3, "this$0");
                                        AbstractC2995aW.q(enumC3410f71, "$btnSound");
                                        if (!c5027xc3.k) {
                                            S3.b("timer_click", "add_1s");
                                            c5027xc3.k = true;
                                        }
                                        long jB4 = C5027xc0.b(c5027xc3, c5027xc3.t, 1000L);
                                        c5027xc3.t = jB4;
                                        c5027xc3.d(jB4);
                                        EnumC3410f70.c(enumC3410f71);
                                        break;
                                }
                            }
                        });
                    }
                }
            }
            ((LayoutWeaponActivityActionBinding) c3109bk0M.b).tvBulletsNumberInCartridgeClip.setText(String.valueOf(weaponN4.getMagazineCapacity()));
            TextView textView11 = ((LayoutWeaponActivityActionBinding) c3109bk0M.b).tvBulletsNumberAll;
            int magazineCapacity = weaponN4.getMagazineCapacity() * (weaponN4.getCartridgeClip() - 1);
            if (magazineCapacity < 0) {
                magazineCapacity = 0;
            }
            textView11.setText(String.valueOf(magazineCapacity));
            ImageView imageView = ((LayoutWeaponActivityActionBinding) c3109bk0M.b).ivSetting;
            AbstractC2995aW.p(imageView, "ivSetting");
            Oh0.a(imageView, new C4140nX(c3109bk0M, i3));
        }
        WD.D(LifecycleOwnerKt.getLifecycleScope(this), null, 0, new C4078ml0(this, null), 3);
    }

    public final Object k(Color color, InterfaceC2857Wj interfaceC2857Wj) {
        Object objX = WD.X(new Gk0(this, color, null), AbstractC4437qp.b, interfaceC2857Wj);
        return objX == EnumC4602sk.f4993a ? objX : C5033xf0.f5238a;
    }

    public final C3109bk0 m() {
        return (C3109bk0) this.c.getValue();
    }

    public final Weapon n() {
        return (Weapon) this.f2782a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o() {
        Group group = ((ActivityGunBinding) getMBinding()).groupReloadBullets;
        AbstractC2995aW.p(group, "groupReloadBullets");
        SparseArray sparseArray = Oh0.f3515a;
        if (group.getVisibility() == 0) {
            AbstractC4340pk0 abstractC4340pk0 = this.d;
            if (abstractC4340pk0 != null) {
                abstractC4340pk0.l(abstractC4340pk0.k - 1);
                abstractC4340pk0.k(abstractC4340pk0.b.getMagazineCapacity());
            }
            ((ActivityGunBinding) getMBinding()).lavReloadBulletsCircle.e.b.removeListener(this.m);
            ((ActivityGunBinding) getMBinding()).lavReloadBulletsCircle.b();
            Group group2 = ((ActivityGunBinding) getMBinding()).groupReloadBullets;
            AbstractC2995aW.p(group2, "groupReloadBullets");
            AbstractC2340Cl.M(group2);
            ((ActivityGunBinding) getMBinding()).lavReloadBulletsHand.b();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C3109bk0 c3109bk0M;
        LayoutWeaponActivityActionBinding layoutWeaponActivityActionBinding;
        ConstraintLayout constraintLayout;
        setResult(-1, new Intent().putExtra("weaponSortIndex", this.h));
        super.onBackPressed();
        if (isInitedVB()) {
            if ((n() instanceof LightSaber) && (c3109bk0M = m()) != null && (layoutWeaponActivityActionBinding = (LayoutWeaponActivityActionBinding) c3109bk0M.b) != null && (constraintLayout = layoutWeaponActivityActionBinding.conColorChoose) != null) {
                SparseArray sparseArray = Oh0.f3515a;
                if (constraintLayout.getVisibility() == 0) {
                    AbstractC4340pk0 abstractC4340pk0 = this.d;
                    C4213oI c4213oI = abstractC4340pk0 instanceof C4213oI ? (C4213oI) abstractC4340pk0 : null;
                    if (c4213oI != null) {
                        c4213oI.q();
                    }
                }
            }
            AbstractC4340pk0 abstractC4340pk1 = this.d;
            if (abstractC4340pk1 != null) {
                abstractC4340pk1.h();
            }
            C2498In c2498In = App.n;
            WD.D(C2498In.g(), AbstractC4437qp.b, 0, new B8(this, null), 2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseSyncActivity, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Weapon weaponN = n();
        boolean z = weaponN instanceof MechanicalGun;
        int i = R.style.MechanicalGunTheme;
        if (!z) {
            if (weaponN instanceof LightSaber) {
                i = R.style.LightSaberTheme;
            } else if (weaponN instanceof Taser) {
                i = R.style.TaserTheme;
            } else if (weaponN instanceof TimeBomb) {
                i = R.style.TimeBombTheme;
            } else if (weaponN instanceof TechnologyGun) {
                i = R.style.TechnologyGunTheme;
            }
        }
        setTheme(i);
        super.onCreate(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.backends.android.SpineActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        SurfaceHolder holder;
        AbstractC2871Wx.g = 0.0f;
        AbstractC2871Wx.h = 0.0f;
        super.onDestroy();
        AbstractC4340pk0 abstractC4340pk0 = this.d;
        if (abstractC4340pk0 != null) {
            abstractC4340pk0.h();
        }
        SpineController spineController = this.g;
        if (spineController != null) {
            spineController.dispose();
        }
        this.g = null;
        if (isInitedVB()) {
            if (isFinishing()) {
                Q8.a().j(((ActivityGunBinding) getMBinding()).conWeaponBanner);
            }
            SurfaceView surfaceView = this.k;
            if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
                holder.removeCallback((SurfaceHolderCallbackC3902kl0) this.l.getValue());
            }
            ((ActivityGunBinding) getMBinding()).surfaceRoot.removeView(this.k);
            this.k = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.backends.android.SpineActivity, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        Weapon weaponN = n();
        if (weaponN instanceof MechanicalGun) {
            List listK = AbstractC2340Cl.K(Integer.valueOf(R.string.weapon_name_m2_flamethrower), Integer.valueOf(R.string.weapon_name_rpg_7), Integer.valueOf(R.string.weapon_name_m84));
            Weapon weaponN2 = n();
            if (AbstractC2853Wf.d0(listK, weaponN2 != null ? Integer.valueOf(weaponN2.getNameId()) : null)) {
                AbstractC4340pk0 abstractC4340pk0 = this.d;
                C5081y80 c5081y80 = abstractC4340pk0 instanceof C5081y80 ? (C5081y80) abstractC4340pk0 : null;
                if (c5081y80 != null) {
                    C4370q40 c4370q40 = (C4370q40) c5081y80.x.getValue();
                    ((SensorManager) c4370q40.g.getValue()).unregisterListener(c4370q40);
                }
            } else {
                AbstractC4340pk0 abstractC4340pk1 = this.d;
                C2612My c2612My = abstractC4340pk1 instanceof C2612My ? (C2612My) abstractC4340pk1 : null;
                if (c2612My != null) {
                    c2612My.H();
                }
            }
        } else {
            boolean z = weaponN instanceof Taser;
            if (z) {
                AbstractC4340pk0 abstractC4340pk2 = this.d;
                AbstractC2995aW.o(abstractC4340pk2, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.TaserFireHelper");
                ((C3794jb0) abstractC4340pk2).H();
            } else if (weaponN instanceof LightSaber) {
                AbstractC4340pk0 abstractC4340pk3 = this.d;
                C4213oI c4213oI = abstractC4340pk3 instanceof C4213oI ? (C4213oI) abstractC4340pk3 : null;
                if (c4213oI != null) {
                    c4213oI.H();
                }
            } else if (z) {
                AbstractC4340pk0 abstractC4340pk4 = this.d;
                C3794jb0 c3794jb0 = abstractC4340pk4 instanceof C3794jb0 ? (C3794jb0) abstractC4340pk4 : null;
                if (c3794jb0 != null) {
                    c3794jb0.H();
                }
            } else if (weaponN instanceof TechnologyGun) {
                AbstractC4340pk0 abstractC4340pk5 = this.d;
                Gb0 gb0 = abstractC4340pk5 instanceof Gb0 ? (Gb0) abstractC4340pk5 : null;
                if (gb0 != null) {
                    gb0.H();
                }
            }
        }
        if (isInitedVB()) {
            Q8.a().b(((ActivityGunBinding) getMBinding()).conWeaponBanner);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.backends.android.SpineActivity, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (isInitedVB()) {
            t();
            Q8.a().c(((ActivityGunBinding) getMBinding()).conWeaponBanner);
        }
    }

    public final void p() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        ((DialogC3094bd) this.b.getValue()).show();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(InterfaceC2857Wj interfaceC2857Wj) {
        C3376el0 c3376el0;
        WeaponUseActivity weaponUseActivity;
        if (interfaceC2857Wj instanceof C3376el0) {
            c3376el0 = (C3376el0) interfaceC2857Wj;
            int i = c3376el0.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3376el0.d = i - Integer.MIN_VALUE;
            } else {
                c3376el0 = new C3376el0(this, interfaceC2857Wj);
            }
        } else {
            c3376el0 = new C3376el0(this, interfaceC2857Wj);
        }
        Object obj = c3376el0.b;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c3376el0.d;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            C3464fl0 c3464fl0 = new C3464fl0(this, null);
            c3376el0.f4335a = this;
            c3376el0.d = 1;
            if (WD.X(c3464fl0, AbstractC4437qp.b, c3376el0) == enumC4602sk) {
                return enumC4602sk;
            }
            weaponUseActivity = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            weaponUseActivity = c3376el0.f4335a;
            AbstractC3375el.b0(obj);
        }
        AbstractC4340pk0 abstractC4340pk0 = weaponUseActivity.d;
        AbstractC2995aW.o(abstractC4340pk0, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.LightSaberFireHelper");
        ((C4213oI) abstractC4340pk0).p();
        return C5033xf0.f5238a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        if (((ActivityGunBinding) getMBinding()).lavReloadBulletsCircle.e.j()) {
            return;
        }
        ChoreographerFrameCallbackC4127nK choreographerFrameCallbackC4127nK = ((ActivityGunBinding) getMBinding()).lavReloadBulletsCircle.e.b;
        C3552gl0 c3552gl0 = this.m;
        choreographerFrameCallbackC4127nK.removeListener(c3552gl0);
        ((ActivityGunBinding) getMBinding()).lavReloadBulletsCircle.e();
        ((ActivityGunBinding) getMBinding()).lavReloadBulletsCircle.a(c3552gl0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(int i) {
        VideoView videoView = ((ActivityGunBinding) getMBinding()).videoView;
        if (videoView.isPlaying()) {
            videoView.stopPlayback();
        }
        C2498In c2498In = App.n;
        videoView.setVideoURI(Uri.parse("android.resource://" + C2498In.i().getPackageName() + "/" + i));
        videoView.setVisibility(0);
        videoView.setOnPreparedListener(new C4012m10(1));
        videoView.setOnCompletionListener(new C4100n10(videoView, 1));
    }

    public final void setMBombEffectView(View view) {
        this.f = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        this.j = true;
        SurfaceView surfaceView = this.k;
        if (surfaceView != null) {
            ((ActivityGunBinding) getMBinding()).surfaceRoot.removeView(surfaceView);
        }
        SurfaceView surfaceView2 = new SurfaceView(this);
        surfaceView2.getHolder().addCallback((SurfaceHolderCallbackC3902kl0) this.l.getValue());
        if (Build.VERSION.SDK_INT < 26) {
            surfaceView2.setZOrderOnTop(true);
            surfaceView2.setZOrderMediaOverlay(true);
        } else {
            surfaceView2.setZOrderOnTop(false);
        }
        this.k = surfaceView2;
        ((ActivityGunBinding) getMBinding()).surfaceRoot.addView(this.k, new ViewGroup.LayoutParams(-1, -1));
        SurfaceView surfaceView3 = this.k;
        if (surfaceView3 != null) {
            surfaceView3.setVisibility(8);
        }
        WD.D(LifecycleOwnerKt.getLifecycleScope(this), AbstractC4437qp.b, 0, new C3814jl0(this, null), 2);
        MediaPlayer mediaPlayer = BF.g;
        try {
            if (mediaPlayer != null) {
                try {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                    }
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                }
                mediaPlayer.release();
                BF.g = null;
            }
            BF.g = null;
            Weapon weaponN = n();
            if (weaponN instanceof MechanicalGun) {
                List listK = AbstractC2340Cl.K(Integer.valueOf(R.string.weapon_name_m2_flamethrower), Integer.valueOf(R.string.weapon_name_rpg_7), Integer.valueOf(R.string.weapon_name_m84));
                Weapon weaponN2 = n();
                if (AbstractC2853Wf.d0(listK, weaponN2 != null ? Integer.valueOf(weaponN2.getNameId()) : null)) {
                    AbstractC4340pk0 abstractC4340pk0 = this.d;
                    AbstractC2995aW.o(abstractC4340pk0, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.SpecialGunHelper");
                    ((C4370q40) ((C5081y80) abstractC4340pk0).x.getValue()).a();
                    return;
                } else {
                    AbstractC4340pk0 abstractC4340pk1 = this.d;
                    AbstractC2995aW.o(abstractC4340pk1, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.GunFireHelper");
                    ((C2612My) abstractC4340pk1).G();
                    return;
                }
            }
            if (weaponN instanceof Taser) {
                AbstractC4340pk0 abstractC4340pk2 = this.d;
                AbstractC2995aW.o(abstractC4340pk2, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.TaserFireHelper");
                ((C3794jb0) abstractC4340pk2).G();
            } else if (weaponN instanceof LightSaber) {
                AbstractC4340pk0 abstractC4340pk3 = this.d;
                AbstractC2995aW.o(abstractC4340pk3, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.LightSaberFireHelper");
                ((C4213oI) abstractC4340pk3).G();
            } else if (weaponN instanceof TechnologyGun) {
                AbstractC4340pk0 abstractC4340pk4 = this.d;
                AbstractC2995aW.o(abstractC4340pk4, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.TechnologyFireHelper");
                ((Gb0) abstractC4340pk4).G();
            }
        } catch (Throwable th) {
            mediaPlayer.release();
            BF.g = null;
            throw th;
        }
    }
}
