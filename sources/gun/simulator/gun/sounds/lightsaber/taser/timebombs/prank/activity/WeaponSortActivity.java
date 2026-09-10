package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import com.bumptech.glide.a;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.SettingActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvGunDisplayAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseSyncActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.WeaponSorts;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityWeaponSortBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.model.MainModel;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2767Sx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2940Zo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2952a;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3197ck0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3485g1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bk0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2498In;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3491g4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4559sD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4955wk0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5043xk0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5219zk0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DialogC2411Fe;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DialogC4228oX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DialogC4476rI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ExecutorC4433qn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ma0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ND;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class WeaponSortActivity extends BaseSyncActivity<ActivityWeaponSortBinding> {
    public static boolean g;
    public static boolean h;
    public RvGunDisplayAdapter b;
    public DialogC2411Fe c;
    public WeaponSorts d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainModel f2781a = new MainModel(this);
    public final Ma0 e = AbstractC2340Cl.I(new C5043xk0(this, 0));
    public final Ma0 f = AbstractC2340Cl.I(new C5043xk0(this, 1));

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseSyncActivity
    public final ViewBinding getViewBinding() {
        ActivityWeaponSortBinding activityWeaponSortBindingInflate = ActivityWeaponSortBinding.inflate(getLayoutInflater());
        AbstractC2995aW.p(activityWeaponSortBindingInflate, "inflate(...)");
        return activityWeaponSortBindingInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity
    public final void initView() {
        String str;
        RvGunDisplayAdapter rvGunDisplayAdapter;
        String str2;
        VQ vqA = VQ.a();
        ConstraintLayout constraintLayout = ((ActivityWeaponSortBinding) getMBinding()).conNativeAdPlacement;
        C3491g4 c3491g4 = AbstractC3485g1.f;
        WeaponSorts weaponSorts = this.d;
        final int i = 1;
        WeaponSorts weaponSorts2 = null;
        int i2 = 2;
        if (weaponSorts != null) {
            int sortId = weaponSorts.getSortId();
            if (sortId == 0) {
                str2 = "NavLarge_CategoryMachineGun";
            } else if (sortId == 1) {
                str2 = "NavLarge_CategoryLightsaber";
            } else if (sortId == 2) {
                str2 = "NavLarge_CategoryTaser";
            } else if (sortId != 3) {
                str2 = sortId != 4 ? "" : "NavLarge_CategorySciFiGun";
            } else {
                str2 = "NavLarge_CategoryTimeBomb";
            }
            str = str2;
        } else {
            str = null;
        }
        vqA.g(this, constraintLayout, c3491g4, str, new C2498In(1), 1, new QL(this, i2));
        if (Build.VERSION.SDK_INT >= 33) {
            weaponSorts2 = (WeaponSorts) getIntent().getParcelableExtra("weaponSort", WeaponSorts.class);
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("weaponSort");
            if (parcelableExtra instanceof WeaponSorts) {
                weaponSorts2 = (WeaponSorts) parcelableExtra;
            }
        }
        this.d = weaponSorts2;
        this.c = new DialogC2411Fe(this);
        WeaponSorts weaponSorts3 = this.d;
        final int i3 = 0;
        if (weaponSorts3 != null) {
            PY py = (PY) ((PY) a.a(this).e.c(this).i(Drawable.class).y(Integer.valueOf(weaponSorts3.getSecondaryBackground())).n(false)).d(AbstractC2940Zo.c);
            py.getClass();
            ((PY) py.l(AbstractC2767Sx.b, Boolean.TRUE)).w(((ActivityWeaponSortBinding) getMBinding()).ivBg);
            this.b = new RvGunDisplayAdapter(weaponSorts3);
            ((ActivityWeaponSortBinding) getMBinding()).tvWeaponSort.setText(getResources().getString(weaponSorts3.getCategory()));
            ((ActivityWeaponSortBinding) getMBinding()).getRoot().setBackgroundResource(weaponSorts3.getSecondaryBackground());
            ((ActivityWeaponSortBinding) getMBinding()).rvWeapons.setLayoutManager(new GridLayoutManager(this, 2));
            int sortId2 = weaponSorts3.getSortId();
            MainModel mainModel = this.f2781a;
            if (sortId2 == 0) {
                RvGunDisplayAdapter rvGunDisplayAdapter2 = this.b;
                if (rvGunDisplayAdapter2 != null) {
                    mainModel.getClass();
                    rvGunDisplayAdapter2.f(AbstractC2853Wf.e0(AbstractC3197ck0.d));
                }
            } else if (sortId2 == 1) {
                ((ActivityWeaponSortBinding) getMBinding()).rvWeapons.setLayoutManager(new LinearLayoutManager(this, 1, false));
                RvGunDisplayAdapter rvGunDisplayAdapter3 = this.b;
                if (rvGunDisplayAdapter3 != null) {
                    mainModel.getClass();
                    rvGunDisplayAdapter3.f(AbstractC2853Wf.e0(AbstractC3197ck0.f));
                }
            } else if (sortId2 == 2) {
                RvGunDisplayAdapter rvGunDisplayAdapter4 = this.b;
                if (rvGunDisplayAdapter4 != null) {
                    mainModel.getClass();
                    rvGunDisplayAdapter4.f(AbstractC2853Wf.e0(AbstractC3197ck0.h));
                }
            } else if (sortId2 == 3) {
                RvGunDisplayAdapter rvGunDisplayAdapter5 = this.b;
                if (rvGunDisplayAdapter5 != null) {
                    mainModel.getClass();
                    rvGunDisplayAdapter5.f(AbstractC2853Wf.e0(AbstractC3197ck0.g));
                }
            } else if (sortId2 == 4 && (rvGunDisplayAdapter = this.b) != null) {
                mainModel.getClass();
                rvGunDisplayAdapter.f(AbstractC2853Wf.e0(AbstractC3197ck0.e));
            }
            ((ActivityWeaponSortBinding) getMBinding()).rvWeapons.setAdapter(this.b);
        }
        RvGunDisplayAdapter rvGunDisplayAdapter6 = this.b;
        if (rvGunDisplayAdapter6 != null) {
            rvGunDisplayAdapter6.d = new C4955wk0(this);
        }
        ((ActivityWeaponSortBinding) getMBinding()).ivBack.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qk0
            public final /* synthetic */ WeaponSortActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                WeaponSortActivity weaponSortActivity = this.b;
                switch (i4) {
                    case 0:
                        boolean z = WeaponSortActivity.g;
                        AbstractC2995aW.q(weaponSortActivity, "this$0");
                        C2498In c2498In = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(weaponSortActivity, "button_sound/button_sound.ogg", null), 2);
                        weaponSortActivity.onBackPressed();
                        break;
                    default:
                        boolean z2 = WeaponSortActivity.g;
                        AbstractC2995aW.q(weaponSortActivity, "this$0");
                        WeaponSorts weaponSorts4 = weaponSortActivity.d;
                        if (weaponSorts4 != null) {
                            int sortId3 = weaponSorts4.getSortId();
                            if (sortId3 == 0) {
                                S3.b("setting_page_display", "machine_gun");
                            } else if (sortId3 == 1) {
                                S3.b("setting_page_display", "lightsaber");
                            } else if (sortId3 == 2) {
                                S3.b("setting_page_display", "taser");
                            } else if (sortId3 == 3) {
                                S3.b("setting_page_display", "time_bomb");
                            } else if (sortId3 == 4) {
                                S3.b("setting_page_display", "sci_fi_gun");
                            }
                        }
                        C2498In c2498In2 = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(weaponSortActivity, "button_sound/button_sound.ogg", null), 2);
                        weaponSortActivity.toAty(SettingActivity.class);
                        break;
                }
            }
        });
        ((ActivityWeaponSortBinding) getMBinding()).ivSetting.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qk0
            public final /* synthetic */ WeaponSortActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                WeaponSortActivity weaponSortActivity = this.b;
                switch (i4) {
                    case 0:
                        boolean z = WeaponSortActivity.g;
                        AbstractC2995aW.q(weaponSortActivity, "this$0");
                        C2498In c2498In = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(weaponSortActivity, "button_sound/button_sound.ogg", null), 2);
                        weaponSortActivity.onBackPressed();
                        break;
                    default:
                        boolean z2 = WeaponSortActivity.g;
                        AbstractC2995aW.q(weaponSortActivity, "this$0");
                        WeaponSorts weaponSorts4 = weaponSortActivity.d;
                        if (weaponSorts4 != null) {
                            int sortId3 = weaponSorts4.getSortId();
                            if (sortId3 == 0) {
                                S3.b("setting_page_display", "machine_gun");
                            } else if (sortId3 == 1) {
                                S3.b("setting_page_display", "lightsaber");
                            } else if (sortId3 == 2) {
                                S3.b("setting_page_display", "taser");
                            } else if (sortId3 == 3) {
                                S3.b("setting_page_display", "time_bomb");
                            } else if (sortId3 == 4) {
                                S3.b("setting_page_display", "sci_fi_gun");
                            }
                        }
                        C2498In c2498In2 = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(weaponSortActivity, "button_sound/button_sound.ogg", null), 2);
                        weaponSortActivity.toAty(SettingActivity.class);
                        break;
                }
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 1111 && !isFinishing() && WeaponUseActivity.o == null) {
            ND ndB = ND.b();
            WeaponSorts weaponSorts = this.d;
            if (weaponSorts != null) {
                int sortId = weaponSorts.getSortId();
                List list = AbstractC2952a.f4102a;
                if (sortId == 0) {
                    str = "Inter_MachineGun";
                } else if (sortId == 1) {
                    str = "Inter_Lightsaber";
                } else if (sortId == 2) {
                    str = "Inter_Taser";
                } else if (sortId != 3) {
                    str = sortId != 4 ? "" : "Inter_SciFiGun";
                } else {
                    str = "Inter_TimeBomb";
                }
            } else {
                str = null;
            }
            ndB.h(this, str, 1, new C4559sD(this));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        if (isInitedVB()) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            ExecutorC4433qn executorC4433qn = AbstractC4437qp.b;
            WD.D(lifecycleScope, executorC4433qn, 0, new C5219zk0(2, null), 2);
            C2498In c2498In = App.n;
            WD.D(C2498In.g(), executorC4433qn, 0, new A8(2, null), 2);
            MediaPlayer mediaPlayer = BF.g;
            if (mediaPlayer != null) {
                MediaPlayer mediaPlayer2 = mediaPlayer.isPlaying() ^ true ? mediaPlayer : null;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.start();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        Ma0 ma0 = this.f;
        Ma0 ma1 = this.e;
        VQ.a().j(((ActivityWeaponSortBinding) getMBinding()).conNativeAdPlacement);
        try {
            DialogC2411Fe dialogC2411Fe = this.c;
            if (dialogC2411Fe != null) {
                dialogC2411Fe.dismiss();
            }
            this.c = null;
        } catch (Exception unused) {
        }
        try {
            if (((DialogC4476rI) ma1.getValue()).isShowing()) {
                ((DialogC4476rI) ma1.getValue()).dismiss();
            }
        } catch (Exception unused2) {
        }
        try {
            if (((DialogC4228oX) ma0.getValue()).isShowing()) {
                ((DialogC4228oX) ma0.getValue()).dismiss();
            }
        } catch (Exception unused3) {
        }
        super.onDestroy();
        isInitedVB();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (isInitedVB()) {
            VQ.a().b(((ActivityWeaponSortBinding) getMBinding()).conNativeAdPlacement);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (isInitedVB()) {
            VQ.a().c(((ActivityWeaponSortBinding) getMBinding()).conNativeAdPlacement);
            WD.D(LifecycleOwnerKt.getLifecycleScope(this), AbstractC4437qp.b, 0, new Bk0(this, null), 2);
            Weapon weapon = WeaponUseActivity.o;
            if (weapon != null) {
                RvGunDisplayAdapter rvGunDisplayAdapter = this.b;
                if (rvGunDisplayAdapter != null) {
                    int iIndexOf = rvGunDisplayAdapter.f212a.indexOf(weapon);
                    if (rvGunDisplayAdapter.a(iIndexOf)) {
                        rvGunDisplayAdapter.f212a.set(iIndexOf, weapon);
                        rvGunDisplayAdapter.notifyItemChanged(iIndexOf);
                    }
                }
                WeaponUseActivity.o = null;
            }
        }
    }
}
