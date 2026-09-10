package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.SurfaceTexture;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Message;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.badlogic.gdx.backends.android.SpineController;
import com.hjq.permissions.Permission;
import com.hjq.permissions.XXPermissions;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.MechanicalGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityGunBinding;
import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.My, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2612My extends AbstractC4340pk0 {
    public static final String[] K = {"GUN_SMOKE", "GUN_EFFECT", "GUN_EFFECT1", "GUN_EFFECT2", "GUN_EFFECT3"};
    public static final String[] L = {"GUN_BULLET", "GUN_BULLET1", "GUN_BULLET2", "GUN_BULLET3", "GUN_BULLET4", "GUN_BULLET5", "GUN_BULLET6", "GUN_BULLET7", "GUN_BULLET8", "GUN_BULLET9"};
    public boolean A;
    public final Object B;
    public final Ff0 C;
    public final RunnableC5149yy D;
    public boolean E;
    public final InterfaceC3069bH F;
    public float G;
    public float H;
    public MediaPlayer I;
    public Surface J;
    public final LifecycleOwner q;
    public final SpineController r;
    public final ActivityGunBinding s;
    public final LinkedHashMap t;
    public final LinkedHashMap u;
    public int v;
    public String w;
    public int x;
    public final LinkedHashMap y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2612My(WeaponUseActivity weaponUseActivity, Weapon weapon, LifecycleOwner lifecycleOwner, SpineController spineController, ActivityGunBinding activityGunBinding) {
        super(weaponUseActivity, weapon);
        AbstractC2995aW.q(weaponUseActivity, "mActivity");
        this.q = lifecycleOwner;
        this.r = spineController;
        this.s = activityGunBinding;
        this.t = new LinkedHashMap();
        this.u = new LinkedHashMap();
        this.w = "zidan1";
        this.y = new LinkedHashMap();
        this.z = "";
        this.B = new Object();
        this.C = new Ff0(27, weaponUseActivity, this);
        int i = 0;
        this.D = new RunnableC5149yy(this, i);
        this.F = AbstractC2340Cl.H(EnumC4124nH.c, new C2379Dy(weapon, weaponUseActivity, this, i));
    }

    public boolean A() {
        return this.E;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    public boolean B(View view, MotionEvent motionEvent) {
        LifecycleOwner lifecycleOwnerU;
        LifecycleCoroutineScope lifecycleScope;
        LifecycleOwner lifecycleOwnerU2;
        LifecycleCoroutineScope lifecycleScope2;
        AbstractC2995aW.q(motionEvent, "motionEvent");
        int action = motionEvent.getAction();
        Weapon weapon = this.b;
        WeaponUseActivity weaponUseActivity = this.f4847a;
        if (action == 0) {
            if ((weapon instanceof MechanicalGun) && (lifecycleOwnerU = u()) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerU)) != null) {
                WD.D(lifecycleScope, null, 0, new C2457Gy(this, null), 3);
            }
            if (this.j < 1 && !weaponUseActivity.e && this.l == null) {
                this.l = Float.valueOf(motionEvent.getRawY());
            }
            if (weapon.getCanConsecutive()) {
                p();
            } else {
                o();
            }
        } else if (action == 1) {
            if ((this.j <= 1 || weaponUseActivity.e) && (weapon instanceof MechanicalGun) && (lifecycleOwnerU2 = u()) != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerU2)) != null) {
                WD.D(lifecycleScope2, null, 0, new C2509Iy(this, null), 3);
            }
            if (this.g) {
                weaponUseActivity.o();
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
                    if (this.k < 1) {
                        weaponUseActivity.p();
                    } else {
                        this.g = true;
                        j(this.e);
                    }
                }
            }
        } else if (action == 3) {
            if (this.j <= 1) {
                WD.D(lifecycleScope2, null, 0, new C2509Iy(this, null), 3);
            } else {
                WD.D(lifecycleScope2, null, 0, new C2509Iy(this, null), 3);
            }
            if (this.g) {
                weaponUseActivity.o();
                this.g = false;
            }
            this.l = null;
            if (weapon.getCanConsecutive()) {
                q();
            }
        }
        return true;
    }

    public void C(String str) {
        AbstractC2995aW.q(str, "<set-?>");
        this.z = str;
    }

    public void D(boolean z) {
        this.E = z;
    }

    public void E(float f) {
        this.G = f;
    }

    public void F(float f) {
        this.H = f;
    }

    public void G() {
        w().a();
    }

    public void H() {
        C4370q40 c4370q40W = w();
        ((SensorManager) c4370q40W.g.getValue()).unregisterListener(c4370q40W);
    }

    public void I() {
        WD.D(LifecycleOwnerKt.getLifecycleScope(this.f4847a), null, 0, new C2586Ly(this, null), 3);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4340pk0
    public void f(boolean z) {
        LifecycleCoroutineScope lifecycleScope;
        WD.R(C2734Rq.f3684a, new C3462fk0(this, null));
        if (z) {
            D(true);
        }
        SpineController spineControllerR = r();
        if (spineControllerR != null) {
            C4991x70 skeleton = spineControllerR.getSkeleton("GUN");
            if (skeleton != null) {
                skeleton.a("TX_weizhi");
            }
            if (skeleton != null) {
                skeleton.a("zidan_weizhi");
            }
            String[] strArr = K;
            for (int i = 0; i < 5; i++) {
                String str = strArr[i];
                LinkedHashMap linkedHashMap = this.t;
                C4991x70 skeleton2 = spineControllerR.getSkeleton(str);
                linkedHashMap.put(str, skeleton2 != null ? skeleton2.a("root") : null);
            }
            String[] strArr2 = L;
            for (int i2 = 0; i2 < 10; i2++) {
                String str2 = strArr2[i2];
                LinkedHashMap linkedHashMap2 = this.u;
                C4991x70 skeleton3 = spineControllerR.getSkeleton(str2);
                linkedHashMap2.put(str2, skeleton3 != null ? skeleton3.a("root") : null);
            }
        }
        LifecycleOwner lifecycleOwnerU = u();
        if (lifecycleOwnerU == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerU)) == null) {
            return;
        }
        WD.D(lifecycleScope, AbstractC4437qp.b, 0, new C2405Ey(this, null), 2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4340pk0
    public final boolean g(Message message) {
        AbstractC2995aW.q(message, NotificationCompat.CATEGORY_MESSAGE);
        int i = message.what;
        if (i != 101 && (i != 102 || !this.b.getCanConsecutive())) {
            return false;
        }
        p();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o() {
        LifecycleCoroutineScope lifecycleScope;
        AbstractC3477fv abstractC3477fvA;
        SurfaceView surfaceView;
        LifecycleCoroutineScope lifecycleScope2;
        int i = 1;
        boolean zA = A();
        Weapon weapon = this.b;
        if (zA) {
            S3.b("machine_gun_use", weapon.getAnalyticsName());
            D(false);
        }
        if (!this.i) {
            this.i = true;
            LifecycleOwner lifecycleOwnerU = u();
            if (lifecycleOwnerU != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerU)) != null) {
                WD.D(lifecycleScope2, AbstractC4437qp.b, 0, new C5237zy(this, null), 2);
            }
        }
        WeaponUseActivity weaponUseActivity = this.f4847a;
        boolean z = weaponUseActivity.e;
        if (!z && this.j < 1) {
            n();
            j(this.f);
            return;
        }
        if (!z) {
            k(this.j - 1);
        }
        j(this.d);
        I();
        int nameId = weapon.getNameId();
        if (!AbstractC3197ck0.i.contains(Integer.valueOf(nameId))) {
            if (AbstractC2340Cl.K(Integer.valueOf(R.string.weapon_name_f1_grenade), Integer.valueOf(R.string.weapon_name_f1_gold), Integer.valueOf(R.string.weapon_name_m84), Integer.valueOf(R.string.weapon_name_he_grenade)).contains(Integer.valueOf(nameId))) {
                ActivityGunBinding activityGunBindingV = v();
                TextureView textureView = activityGunBindingV != null ? activityGunBindingV.tvVideo : null;
                if (textureView != null) {
                    ActivityGunBinding activityGunBindingV2 = v();
                    TextureView textureView2 = activityGunBindingV2 != null ? activityGunBindingV2.tvVideo : null;
                    if (textureView2 != null) {
                        textureView2.setVisibility(0);
                    }
                    ActivityGunBinding activityGunBindingV3 = v();
                    ImageView imageView = activityGunBindingV3 != null ? activityGunBindingV3.ivBoom : null;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    if (textureView.isAvailable()) {
                        z(R.raw.conventional_explosion, textureView.getSurfaceTexture());
                    } else {
                        textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC2535Jy(this));
                    }
                }
                b().postDelayed(new RunnableC5149yy(this, i), 3000L);
            } else if (weapon.getSwitchScreenFlash()) {
                if (((ActivityGunBinding) weaponUseActivity.getMBinding()).surfaceRoot.getVisibility() != 0) {
                    ((ActivityGunBinding) weaponUseActivity.getMBinding()).surfaceRoot.setVisibility(0);
                }
                SurfaceView surfaceView2 = weaponUseActivity.k;
                if ((surfaceView2 == null || surfaceView2.getVisibility() != 0) && (surfaceView = weaponUseActivity.k) != null) {
                    surfaceView.setVisibility(0);
                }
                Objects.toString(weaponUseActivity.k);
                R7 r7B = b();
                Ff0 ff0 = this.C;
                r7B.removeCallbacks(ff0);
                b().postDelayed(ff0, 30L);
            } else {
                b().postDelayed(this.D, 30L);
            }
        }
        if (weapon.getSwitchFlash() && weaponUseActivity.getPackageManager().hasSystemFeature("android.hardware.camera.flash") && ((Build.VERSION.SDK_INT >= 23 || XXPermissions.isGranted(weaponUseActivity, Permission.CAMERA)) && (abstractC3477fvA = a()) != null)) {
            abstractC3477fvA.d(true);
        }
        LifecycleOwner lifecycleOwnerU2 = u();
        if (lifecycleOwnerU2 == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerU2)) == null) {
            return;
        }
        WD.D(lifecycleScope, null, 0, new C2327By(this, null), 3);
    }

    public void p() {
        b().removeMessages(101);
        boolean z = this.f4847a.e;
        Weapon weapon = this.b;
        if (z) {
            o();
            b().sendEmptyMessageDelayed(101, weapon.getConsecutiveInterval());
        } else if (this.j < 1) {
            o();
            q();
        } else {
            o();
            b().sendEmptyMessageDelayed(101, weapon.getConsecutiveInterval());
        }
    }

    public void q() {
        n();
        b().removeMessages(101);
    }

    public SpineController r() {
        return this.r;
    }

    public String s() {
        return this.z;
    }

    public final String t() {
        int i = this.x % 4;
        if (i == 0) {
            return "GUN_EFFECT3";
        }
        if (i == 1) {
            return "GUN_EFFECT";
        }
        if (i != 2) {
            return i != 3 ? "GUN_EFFECT" : "GUN_EFFECT2";
        }
        return "GUN_EFFECT1";
    }

    public LifecycleOwner u() {
        return this.q;
    }

    public ActivityGunBinding v() {
        return this.s;
    }

    public C4370q40 w() {
        return (C4370q40) this.F.getValue();
    }

    public float x() {
        return this.G;
    }

    public float y() {
        return this.H;
    }

    public final void z(int i, SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null) {
            return;
        }
        this.J = new Surface(surfaceTexture);
        MediaPlayer mediaPlayerCreate = MediaPlayer.create(this.f4847a, i);
        this.I = mediaPlayerCreate;
        if (mediaPlayerCreate != null) {
            mediaPlayerCreate.setSurface(this.J);
            mediaPlayerCreate.setOnPreparedListener(new C2692Qa(this, 1));
            mediaPlayerCreate.setOnCompletionListener(new C4100n10(this, 2));
        }
    }
}
