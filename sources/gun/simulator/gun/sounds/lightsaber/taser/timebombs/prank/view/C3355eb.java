package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.exoplayer2.ui.PlayerView;
import com.hjq.permissions.Permission;
import com.hjq.permissions.XXPermissions;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3355eb extends AbstractC4340pk0 {
    public final C2770Ta A;
    public MediaPlayer B;
    public Surface C;
    public boolean D;
    public boolean E;
    public boolean F;
    public InterfaceC2714Qw G;
    public final LifecycleOwner q;
    public Integer r;
    public Integer s;
    public Integer t;
    public Integer u;
    public boolean v;
    public boolean w;
    public EnumC3410f70 x;
    public EnumC3410f70 y;
    public AnimatorSet z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3355eb(WeaponUseActivity weaponUseActivity, Weapon weapon, LifecycleOwner lifecycleOwner) {
        super(weaponUseActivity, weapon);
        AbstractC2995aW.q(weaponUseActivity, "mActivity");
        this.q = lifecycleOwner;
        this.A = new C2770Ta(this);
    }

    public static final void o(C3355eb c3355eb) {
        c3355eb.s();
        c3355eb.j(c3355eb.r);
        WeaponUseActivity weaponUseActivity = c3355eb.f4847a;
        WD.D(LifecycleOwnerKt.getLifecycleScope(weaponUseActivity), null, 0, new C4252ok0(c3355eb, null), 3);
        if (c3355eb.b.getSwitchFlash()) {
            AbstractC2995aW.q(weaponUseActivity, com.umeng.analytics.pro.f.X);
            if (weaponUseActivity.getPackageManager().hasSystemFeature("android.hardware.camera.flash")) {
                if (Build.VERSION.SDK_INT < 23 && !XXPermissions.isGranted(weaponUseActivity, Permission.CAMERA)) {
                    return;
                }
                try {
                    AbstractC3477fv abstractC3477fvA = c3355eb.a();
                    if (abstractC3477fvA != null) {
                        abstractC3477fvA.d(true);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4340pk0
    public final void f(boolean z) throws Throwable {
        LifecycleCoroutineScope lifecycleScope;
        WD.R(C2734Rq.f3684a, new C3462fk0(this, null));
        if (z) {
            this.F = true;
        }
        LifecycleOwner lifecycleOwner = this.q;
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            WD.D(lifecycleScope, null, 0, new C2874Xa(this, null), 3);
        }
        C2770Ta c2770Ta = this.A;
        C3355eb c3355eb = c2770Ta.g;
        View view = c3355eb.f4847a.f;
        if (view != null) {
            c2770Ta.d = (PlayerView) view.findViewById(R.id.player_view);
            c2770Ta.e = (ImageView) view.findViewById(R.id.iv_effect);
            c2770Ta.f = (TextureView) view.findViewById(R.id.vv_effect);
        }
        int nameId = c3355eb.b.getNameId();
        if (nameId == R.string.weapon_name_time_bomb_stone_age) {
            c2770Ta.f3777a = R.raw.bomb_effect_stone_age;
            c2770Ta.b = R.raw.bomb_screen_effect_nuclear;
            c2770Ta.c = true;
        } else if (nameId == R.string.weapon_name_time_bomb_nuclear) {
            c2770Ta.f3777a = R.raw.bomb_effect_nuclear;
            c2770Ta.b = R.raw.bomb_screen_effect_nuclear;
            c2770Ta.c = true;
        } else if (nameId == R.string.weapon_name_time_bomb_frostbite) {
            c2770Ta.f3777a = R.raw.bomb_effect_frostbite;
            c2770Ta.b = R.drawable.bg_frostbite_screen;
            c2770Ta.c = false;
        } else if (nameId == R.string.weapon_name_time_bomb_gas) {
            c2770Ta.f3777a = R.raw.bomb_effect_gas;
            c2770Ta.b = R.raw.bomb_screen_effect_gas;
            c2770Ta.c = true;
        } else if (nameId == R.string.weapon_name_time_bomb_skibidi) {
            c2770Ta.f3777a = R.raw.bomb_effect_skibidi;
            c2770Ta.b = R.drawable.bg_skibidi_screen;
            c2770Ta.c = false;
        } else {
            c2770Ta.f3777a = R.raw.bomb_effect_normal;
            c2770Ta.b = R.drawable.bg_broken_screen;
            c2770Ta.c = false;
        }
        boolean z2 = c2770Ta.c;
        C3355eb c3355eb2 = c2770Ta.g;
        if (!z2) {
            TextureView textureView = c2770Ta.f;
            if (textureView != null) {
                textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC2744Sa(c3355eb2, c2770Ta));
            }
            ImageView imageView = c2770Ta.e;
            if (imageView != null) {
                imageView.setImageResource(c2770Ta.b);
            }
            ImageView imageView2 = c2770Ta.e;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new ViewOnClickListenerC3176ca(c2770Ta, 8));
                return;
            }
            return;
        }
        Ch0.a(c3355eb2.f4847a).d = c2770Ta.d;
        WeaponUseActivity weaponUseActivity = c3355eb2.f4847a;
        Ch0.a(weaponUseActivity).i = new C3285dk(19, c3355eb2, c2770Ta);
        final Ch0 ch0A = Ch0.a(weaponUseActivity);
        final int i = c2770Ta.f3777a;
        final int i2 = c2770Ta.b;
        ch0A.g = false;
        Runnable runnable = new Runnable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ah0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC2857Wj interfaceC2857Wj;
                C3341eO c3341eO;
                C3341eO c3341eO2;
                int i3 = i;
                Ch0 ch0 = ch0A;
                Context context = ch0.f2935a;
                try {
                    C2399Es c2399Es = new C2399Es(context);
                    FW.s(!c2399Es.t);
                    c2399Es.t = true;
                    ch0.c = new C2736Rs(c2399Es);
                    ch0.e = new C2388Eh(new G9[0]);
                    C2290An c2290An = new C2290An(context);
                    String str = "android.resource://" + context.getPackageName() + "/" + i3;
                    WN wn = new WN();
                    ZN zn = new ZN();
                    List listEmptyList = Collections.emptyList();
                    C3965lY c3965lY = C3965lY.e;
                    C3429fO c3429fO = C3429fO.d;
                    Uri uri = str == null ? null : Uri.parse(str);
                    FW.s(zn.b == null || zn.f4068a != null);
                    if (uri != null) {
                        interfaceC2857Wj = null;
                        c3341eO = new C3341eO(uri, null, zn.f4068a != null ? new C2987aO(zn) : null, listEmptyList, null, c3965lY, null);
                    } else {
                        interfaceC2857Wj = null;
                        c3341eO = null;
                    }
                    ch0.e.B(c2290An.c(new C3693iO("", new YN(wn), c3341eO, new C3164cO(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f), C3955lO.I, c3429fO)));
                    int i4 = i2;
                    if (i4 != -1) {
                        C2290An c2290An2 = new C2290An(context);
                        WN wn2 = new WN();
                        ZN zn2 = new ZN();
                        List listEmptyList2 = Collections.emptyList();
                        C3965lY c3965lY2 = C3965lY.e;
                        C3076bO c3076bO = new C3076bO();
                        C3429fO c3429fO2 = C3429fO.d;
                        String str2 = "android.resource://" + context.getPackageName() + "/" + i4;
                        Uri uri2 = str2 == null ? interfaceC2857Wj : Uri.parse(str2);
                        FW.s(zn2.b == null || zn2.f4068a != null);
                        if (uri2 != 0) {
                            c3341eO2 = new C3341eO(uri2, null, zn2.f4068a != null ? new C2987aO(zn2) : interfaceC2857Wj, listEmptyList2, null, c3965lY2, null);
                        } else {
                            c3341eO2 = interfaceC2857Wj;
                        }
                        G9 g9C = c2290An2.c(new C3693iO("LoopMediaId", new YN(wn2), c3341eO2, c3076bO.a(), C3955lO.I, c3429fO2));
                        ch0.f = g9C;
                        ch0.g = true;
                        ch0.e.B(g9C);
                    }
                    P0 p0 = new P0(ch0, 13);
                    C2498In c2498In = App.n;
                    InterfaceC4514rk interfaceC4514rkG = C2498In.g();
                    C2627Nn c2627Nn = AbstractC4437qp.f4904a;
                    WD.D(interfaceC4514rkG, TL.f3768a, 0, new C4283p5(p0, interfaceC2857Wj), 2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        C2498In c2498In = App.n;
        C2498In.j(runnable);
        PlayerView playerView = c2770Ta.d;
        if (playerView != null) {
            playerView.setOnClickListener(new Z9(5, c3355eb2, c2770Ta));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4340pk0
    public final void h() {
        AudioTrack audioTrack;
        super.h();
        Ch0 ch0A = Ch0.a(this.f4847a);
        C2736Rs c2736Rs = ch0A.c;
        if (c2736Rs != null) {
            Integer.toHexString(System.identityHashCode(c2736Rs));
            int i = Ug0.f3833a;
            HashSet hashSet = AbstractC2944Zs.f4097a;
            synchronized (AbstractC2944Zs.class) {
                HashSet hashSet2 = AbstractC2944Zs.f4097a;
            }
            AbstractC4038mJ.e();
            c2736Rs.Q();
            if (Ug0.f3833a < 21 && (audioTrack = c2736Rs.O) != null) {
                audioTrack.release();
                c2736Rs.O = null;
            }
            c2736Rs.y.i(false);
            N90 n90 = c2736Rs.A;
            C4024m70 c4024m70 = n90.e;
            if (c4024m70 != null) {
                try {
                    n90.f3444a.unregisterReceiver(c4024m70);
                } catch (RuntimeException e) {
                    AbstractC4038mJ.g("Error unregistering stream volume receiver", e);
                }
                n90.e = null;
            }
            c2736Rs.B.b(false);
            c2736Rs.C.b(false);
            C3409f7 c3409f7 = c2736Rs.z;
            c3409f7.c = null;
            c3409f7.a();
            if (!c2736Rs.k.y()) {
                c2736Rs.l.e(10, new Nd0(20));
            }
            c2736Rs.l.d();
            c2736Rs.i.f3608a.removeCallbacksAndMessages(null);
            ((C2419Fm) c2736Rs.s).b.w(c2736Rs.q);
            DU duE = c2736Rs.h0.e(1);
            c2736Rs.h0 = duE;
            DU duA = duE.a(duE.b);
            c2736Rs.h0 = duA;
            duA.p = duA.r;
            c2736Rs.h0.q = 0L;
            C4167nm c4167nm = (C4167nm) c2736Rs.q;
            Qa0 qa0 = c4167nm.h;
            FW.t(qa0);
            qa0.c(new RunnableC2928Zc(c4167nm, 7));
            c2736Rs.h.a();
            c2736Rs.G();
            Surface surface = c2736Rs.Q;
            if (surface != null) {
                surface.release();
                c2736Rs.Q = null;
            }
            c2736Rs.b0 = C2469Hk.c;
            ch0A.c = null;
        }
    }

    public final void p() {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        if (this.F) {
            S3.b("time_bomb_use", this.b.getAnalyticsName());
            this.F = false;
        }
        if (!this.i && (lifecycleOwner = this.q) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            WD.D(lifecycleScope, null, 0, new C2822Va(this, null), 3);
        }
        boolean z = this.f4847a.e;
        C2770Ta c2770Ta = this.A;
        if (z) {
            c2770Ta.b();
        } else if (this.j < 1) {
            k(0);
        } else {
            c2770Ta.b();
        }
    }

    public final void q() {
        this.w = false;
        C2498In c2498In = App.n;
        WD.D(C2498In.g(), null, 0, new C3090bb(this, null), 3);
    }

    public final void r(long j, boolean z) {
        C2770Ta c2770Ta = this.A;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c2770Ta.f, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setStartDelay(j);
        objectAnimatorOfFloat.setDuration(250L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c2770Ta.f, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat2.setStartDelay(((long) 1417) + j);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.addListener(new C3178cb(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        if (z) {
            animatorSet.start();
        }
        this.z = animatorSet;
    }

    public final void s() {
        LifecycleCoroutineScope lifecycleScope;
        if (this.t != null) {
            LifecycleOwner lifecycleOwner = this.q;
            if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                WD.D(lifecycleScope, AbstractC4437qp.b, 0, new C3267db(this, null), 2);
            }
            this.v = false;
        }
    }
}
