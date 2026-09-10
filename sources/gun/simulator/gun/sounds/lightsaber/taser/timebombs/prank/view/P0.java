package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.SplashActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityGunBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityRussianRouletteBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.ColorSeekBarVertical;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class P0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3529a;
    public final /* synthetic */ Object b;

    public /* synthetic */ P0(Object obj, int i) {
        this.f3529a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01c4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        C3843k5 animationState;
        C3755j5 c3755j5L;
        C3843k5 animationState2;
        C3843k5 animationState3;
        int i = this.f3529a;
        int i2 = 0;
        int i3 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                E80 e80 = (E80) obj;
                if (e80 != null) {
                    SplashActivity splashActivity = e80.f3011a;
                    splashActivity.toAty(MainActivity.class);
                    splashActivity.finish();
                }
                break;
            case 1:
                SplashActivity splashActivity2 = (SplashActivity) ((InterfaceC3766jB) ((Activity) obj));
                splashActivity2.getClass();
                C3044b1.b.l(new E80(splashActivity2));
                break;
            case 2:
                C3927l3 c3927l3 = ((RunnableC3401f3) obj).b;
                if (c3927l3.k.get()) {
                    X0 x0 = X0.j;
                    if (x0.r().p != null && c3927l3.o != null) {
                        C3751j3 c3751j3 = x0.r().p;
                        c3751j3.a();
                    }
                    c3927l3.x = false;
                } else {
                    Qm0.D(new byte[]{-119, -127, -4, -24, 110, 73, 63, 57, -84, -47, -29, -55, 76, 73, 34, com.umeng.analytics.pro.cw.k, -91, -108, -51, -41, 110, -61, -19, -30, -24, -104, -1, -121, 120, 94, 62, 21, -24, -109, -19, -60, 117, 75, 35, 23, -67, -97, -24}, new byte[]{-56, -15, -116, -89, 30, 44, 81, 120});
                    X0 x1 = X0.j;
                    if (x1.r().h) {
                        String str3 = x1.r().e;
                        BS bs = x1.r().n;
                        if (c3927l3.Z()) {
                            c3927l3.Y((Activity) c3927l3.o.get(), new J5(x1.r().d, str3, null, 1000L, 0, false, x1.r().f), bs);
                        } else {
                            byte[] bArr = {-116, -21, 72, -93, -81, -65, -23, -86, -87, -69, 75, -124, -80, -83, -56, -101, -88, -11, 121, -120, -27, -6, -60, -98, -65, -23, 93, -126, -85, -101, -28, -97, -92, -19, 81, -104, -90, -6, -18, -104, -19, -11, 77, -128, -77, -6, -24, -103, -19, -14, 95, -126, -80, -88, -30, -113, -19, -6, 91, -104, -74, -84, -18, -97, -76};
                            byte[] bArr2 = {-51, -101, 56, -20, -33, -38, -121, -21};
                            int i4 = 0;
                            int i5 = 0;
                            while (i4 < 65) {
                                if (i5 >= 8) {
                                    i5 = 0;
                                }
                                bArr[i4] = (byte) (bArr[i4] ^ bArr2[i5]);
                                i4++;
                                i5++;
                            }
                            new String(bArr, StandardCharsets.UTF_8);
                            X0 x2 = X0.j;
                            if (x2.r().p != null && c3927l3.o != null) {
                                C3751j3 c3751j4 = x2.r().p;
                                c3751j4.a();
                            }
                            c3927l3.x = false;
                            if (bs != null) {
                                bs.d(null);
                                bs.h(false);
                            }
                        }
                    } else {
                        Qm0.D(new byte[]{96, 78, -119, -14, 57, 97, -85, 4, 69, 30, -106, -45, 27, 97, -74, 48, 76, 91, -72, -51, 57, -21, 121, -33, 1, 90, -106, -45, 110, 112, -27, 36, 84, 74, -106, -99, 58, 108, -86, 50, 1, 113, -119, -40, 39, 69, -95}, new byte[]{33, 62, -7, -67, 73, 4, -59, 69});
                        if (x1.r().p != null && c3927l3.o != null) {
                            C3751j3 c3751j5 = x1.r().p;
                            c3751j5.a();
                        }
                        c3927l3.x = false;
                    }
                }
                break;
            case 3:
                Object obj2 = ((C3751j3) obj).b;
                C3927l3 c3927l4 = (C3927l3) obj2;
                DialogC3665i3 dialogC3665i3 = c3927l4.v;
                if (dialogC3665i3 != null && dialogC3665i3.isShowing()) {
                    try {
                        ((C3927l3) obj2).v.dismiss();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    c3927l4.v = null;
                    break;
                }
                break;
            case 4:
                RussianRouletteActivity russianRouletteActivity = (RussianRouletteActivity) obj;
                int i6 = RussianRouletteActivity.t;
                AbstractC2995aW.q(russianRouletteActivity, "this$0");
                Q8.a().d(russianRouletteActivity, ((ActivityRussianRouletteBinding) russianRouletteActivity.getMBinding()).conWeaponBanner, AbstractC3485g1.e, "Adaptive_RussianRoulette", new M10(russianRouletteActivity, i2));
                break;
            case 5:
                WeaponUseActivity weaponUseActivity = (WeaponUseActivity) obj;
                Zb0 zb0 = WeaponUseActivity.n;
                AbstractC2995aW.q(weaponUseActivity, "this$0");
                Q8 q8A = Q8.a();
                ConstraintLayout constraintLayout = ((ActivityGunBinding) weaponUseActivity.getMBinding()).conWeaponBanner;
                C3491g4 c3491g4 = AbstractC3485g1.e;
                int i7 = weaponUseActivity.h;
                if (i7 == 0) {
                    str = "Adaptive_MachineGun";
                } else {
                    if (i7 == 1) {
                        str2 = "Adaptive_Lightsaber";
                    } else if (i7 == 2) {
                        str2 = "Adaptive_Taser";
                    } else if (i7 == 3) {
                        str2 = "Adaptive_TimeBomb";
                    } else if (i7 != 4) {
                        str = "Adaptive_MachineGun";
                    } else {
                        str2 = "Adaptive_SciFiGun";
                    }
                    str = str2;
                }
                q8A.d(weaponUseActivity, constraintLayout, c3491g4, str, new M10(weaponUseActivity, i3));
                break;
            case 6:
                DialogC5116yd dialogC5116yd = (DialogC5116yd) obj;
                int i8 = DialogC5116yd.e;
                AbstractC2995aW.q(dialogC5116yd, "this$0");
                C2498In c2498In = App.n;
                WD.D(C2498In.g(), null, 0, new C5028xd(dialogC5116yd, null), 3);
                break;
            case 7:
                DialogC2384Ed dialogC2384Ed = (DialogC2384Ed) obj;
                int i9 = DialogC2384Ed.d;
                AbstractC2995aW.q(dialogC2384Ed, "this$0");
                C2498In c2498In2 = App.n;
                WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C2358Dd(dialogC2384Ed, null), 2);
                break;
            case 8:
                DialogC2540Kd dialogC2540Kd = (DialogC2540Kd) obj;
                int i10 = DialogC2540Kd.e;
                AbstractC2995aW.q(dialogC2540Kd, "this$0");
                C2498In c2498In3 = App.n;
                WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C2514Jd(dialogC2540Kd, null), 2);
                break;
            case 9:
                DialogC2799Ud dialogC2799Ud = (DialogC2799Ud) obj;
                int i11 = DialogC2799Ud.e;
                AbstractC2995aW.q(dialogC2799Ud, "this$0");
                C2498In c2498In4 = App.n;
                WD.D(C2498In.g(), null, 0, new C2773Td(dialogC2799Ud, null), 3);
                break;
            case 10:
                C3355eb c3355eb = (C3355eb) obj;
                AbstractC2995aW.q(c3355eb, "this$0");
                Ch0.a(c3355eb.f4847a).b(c3355eb.b.getSwitchBoomBrokenScreen());
                break;
            case 11:
                C3794jb0 c3794jb0 = (C3794jb0) obj;
                AbstractC2995aW.q(c3794jb0, "this$0");
                SpineController spineController = c3794jb0.N;
                if (spineController != null && (animationState3 = spineController.getAnimationState("TASER")) != null) {
                    animationState3.q(0.0f, 2);
                }
                if (spineController != null && (animationState = spineController.getAnimationState("TASER")) != null && (c3755j5L = animationState.l(0)) != null && c3755j5L.b() && (animationState2 = spineController.getAnimationState("TASER")) != null) {
                    animationState2.q(0.0f, 0);
                    break;
                }
                break;
            case 12:
                AbstractC3477fv abstractC3477fv = (AbstractC3477fv) obj;
                AbstractC2995aW.q(abstractC3477fv, "this$0");
                abstractC3477fv.c();
                break;
            case 13:
                Ch0 ch0 = (Ch0) obj;
                ch0.getClass();
                try {
                    ch0.d.setUseController(false);
                    ch0.d.setResizeMode(2);
                    ch0.d.setPlayer(ch0.c);
                    C2736Rs c2736Rs = ch0.c;
                    Bh0 bh0 = new Bh0(ch0);
                    C4167nm c4167nm = (C4167nm) c2736Rs.q;
                    c4167nm.getClass();
                    c4167nm.f.a(bh0);
                    ch0.c.E(ch0.e);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
                break;
            case 14:
                C4402qV c4402qV = (C4402qV) obj;
                int i12 = C4402qV.f;
                AbstractC2995aW.q(c4402qV, "this$0");
                ViewParent parent = c4402qV.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(c4402qV);
                }
                break;
            case 15:
                C5027xc0 c5027xc0 = (C5027xc0) obj;
                AbstractC2995aW.q(c5027xc0, "this$0");
                c5027xc0.d(c5027xc0.t);
                break;
            case 16:
                ColorSeekBarVertical colorSeekBarVertical = (ColorSeekBarVertical) obj;
                int i13 = ColorSeekBarVertical.C;
                AbstractC2995aW.q(colorSeekBarVertical, "this$0");
                InterfaceC3011ag interfaceC3011ag = colorSeekBarVertical.r;
                if (interfaceC3011ag != null) {
                    ((Lj0) interfaceC3011ag).a(colorSeekBarVertical.getColor());
                }
                InterfaceC3011ag interfaceC3011ag2 = colorSeekBarVertical.r;
                if (interfaceC3011ag2 != null) {
                    int color = colorSeekBarVertical.getColor();
                    C3109bk0 c3109bk0 = ((Lj0) interfaceC3011ag2).f3368a;
                    Weapon weapon = c3109bk0.e;
                    if (weapon != null) {
                        c3109bk0.k(color, weapon);
                    }
                }
                break;
            case 17:
                AbstractApplicationC2673Ph abstractApplicationC2673Ph = (AbstractApplicationC2673Ph) obj;
                if (abstractApplicationC2673Ph.f == 0) {
                    abstractApplicationC2673Ph.g = true;
                    byte[] bArr3 = {76, 44, -66, 50, -48, -101, 117, 113, 127, 47, -71, 55, -40, -120, 93, 110, 97, 99, -65, 58, -23, -99, 65, 114, 106, 2, -96, 36};
                    byte[] bArr4 = {com.umeng.analytics.pro.cw.m, 67, -48, 84, -71, -4, 52, 1};
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < 28) {
                        if (i15 >= 8) {
                            i15 = 0;
                        }
                        bArr3[i14] = (byte) (bArr3[i14] ^ bArr4[i15]);
                        i14++;
                        i15++;
                    }
                    new String(bArr3, StandardCharsets.UTF_8);
                    for (L5 l5 : abstractApplicationC2673Ph.b) {
                        if (l5 != null) {
                            l5.c();
                        }
                    }
                    AbstractApplicationC2673Ph.l = 3;
                }
                abstractApplicationC2673Ph.b();
                abstractApplicationC2673Ph.a();
                break;
            default:
                C4068mg0 c4068mg0 = ((C3980lg0) obj).f;
                c4068mg0.getClass();
                c4068mg0.f4706a.set(false);
                break;
        }
    }
}
