package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.LightSaber;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.MechanicalGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Taser;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TechnologyGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TimeBomb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityRussianRouletteBinding;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class D10 extends WG implements InterfaceC2766Sw {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D10(int i, Object obj, Object obj2) {
        super(1);
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final Object invoke(Object obj) {
        String str;
        int i = this.f;
        String str2 = null;
        switch (i) {
            case 0:
                View view = (View) obj;
                AbstractC2995aW.q(view, "it");
                view.setSelected(!view.isSelected());
                RussianRouletteActivity russianRouletteActivity = (RussianRouletteActivity) this.g;
                boolean zIsSelected = view.isSelected();
                FrameLayout frameLayout = ((ActivityRussianRouletteBinding) russianRouletteActivity.getMBinding()).flSpine;
                AbstractC2995aW.p(frameLayout, "flSpine");
                C3678i90 c3678i90 = russianRouletteActivity.m;
                if (c3678i90 != null) {
                    c3678i90.a(null);
                }
                russianRouletteActivity.m = AbstractC3651ht.c(LifecycleOwnerKt.getLifecycleScope(russianRouletteActivity), new A10(zIsSelected, frameLayout, null));
                boolean zIsSelected2 = view.isSelected();
                Object obj2 = this.h;
                if (zIsSelected2) {
                    S3.b("russian_roulette_click", "hide_on");
                    ActivityRussianRouletteBinding activityRussianRouletteBinding = (ActivityRussianRouletteBinding) obj2;
                    ImageView imageView = activityRussianRouletteBinding.ivBack;
                    AbstractC2995aW.p(imageView, "ivBack");
                    ImageView imageView2 = activityRussianRouletteBinding.ivSetting;
                    AbstractC2995aW.p(imageView2, "ivSetting");
                    ImageView imageView3 = activityRussianRouletteBinding.ivHelp;
                    AbstractC2995aW.p(imageView3, "ivHelp");
                    ImageView imageView4 = activityRussianRouletteBinding.ivScene;
                    AbstractC2995aW.p(imageView4, "ivScene");
                    TextView textView = activityRussianRouletteBinding.tvReload;
                    AbstractC2995aW.p(textView, "tvReload");
                    ImageView imageView5 = activityRussianRouletteBinding.ivFiringEffect;
                    AbstractC2995aW.p(imageView5, "ivFiringEffect");
                    View[] viewArr = {imageView, imageView2, imageView3, imageView4, textView, imageView5};
                    for (int i2 = 0; i2 < 6; i2++) {
                        View view2 = viewArr[i2];
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, "translationX", 0.0f, (-view2.getWidth()) - 50.0f);
                        objectAnimatorOfFloat.setDuration(300L);
                        objectAnimatorOfFloat.start();
                    }
                } else {
                    S3.b("russian_roulette_click", "hide_off");
                    ActivityRussianRouletteBinding activityRussianRouletteBinding2 = (ActivityRussianRouletteBinding) obj2;
                    ImageView imageView6 = activityRussianRouletteBinding2.ivBack;
                    AbstractC2995aW.p(imageView6, "ivBack");
                    ImageView imageView7 = activityRussianRouletteBinding2.ivSetting;
                    AbstractC2995aW.p(imageView7, "ivSetting");
                    ImageView imageView8 = activityRussianRouletteBinding2.ivHelp;
                    AbstractC2995aW.p(imageView8, "ivHelp");
                    ImageView imageView9 = activityRussianRouletteBinding2.ivScene;
                    AbstractC2995aW.p(imageView9, "ivScene");
                    TextView textView2 = activityRussianRouletteBinding2.tvReload;
                    AbstractC2995aW.p(textView2, "tvReload");
                    ImageView imageView10 = activityRussianRouletteBinding2.ivFiringEffect;
                    AbstractC2995aW.p(imageView10, "ivFiringEffect");
                    View[] viewArr2 = {imageView6, imageView7, imageView8, imageView9, textView2, imageView10};
                    for (int i3 = 0; i3 < 6; i3++) {
                        View view3 = viewArr2[i3];
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view3, "translationX", (-view3.getWidth()) - 50.0f, 0.0f);
                        objectAnimatorOfFloat2.setDuration(300L);
                        objectAnimatorOfFloat2.start();
                    }
                }
                return C5033xf0.f5238a;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    WeaponUseActivity weaponUseActivity = (WeaponUseActivity) this.g;
                    AbstractC4340pk0 abstractC4340pk0 = weaponUseActivity.d;
                    if (abstractC4340pk0 != null) {
                        abstractC4340pk0.f(false);
                    }
                    ND ndB = ND.b();
                    Weapon weapon = ((DialogC3094bd) this.h).b;
                    if (weapon != null) {
                        List list = AbstractC2952a.f4102a;
                        if (weapon instanceof LightSaber) {
                            str = "Inter_LightsaberReload";
                        } else if (weapon instanceof MechanicalGun) {
                            str = "Inter_MachineGunReload";
                        } else if (weapon instanceof TechnologyGun) {
                            str = "Inter_SciFiGunReload";
                        } else if (weapon instanceof Taser) {
                            str = "Inter_TaserReload";
                        } else {
                            str = weapon instanceof TimeBomb ? "Inter_TimeBombReload" : "";
                        }
                        str2 = str;
                    }
                    ndB.h(weaponUseActivity, str2, 1, new C2297Au());
                }
                return C5033xf0.f5238a;
            case 2:
                Object obj3 = this.h;
                Object obj4 = this.g;
                switch (i) {
                    case 2:
                        ((C3217cz) obj4).f4251a.removeCallbacks((Runnable) obj3);
                        break;
                    default:
                        ((C4660tQ) obj4).e(obj3);
                        break;
                }
                return C5033xf0.f5238a;
            case 3:
                Object obj5 = this.h;
                Object obj6 = this.g;
                switch (i) {
                    case 2:
                        ((C3217cz) obj6).f4251a.removeCallbacks((Runnable) obj5);
                        break;
                    default:
                        ((C4660tQ) obj6).e(obj5);
                        break;
                }
                return C5033xf0.f5238a;
            default:
                AbstractC2995aW.q((IOException) obj, "it");
                C3821jp c3821jp = (C3821jp) this.g;
                C3877kY c3877kY = (C3877kY) this.h;
                synchronized (c3821jp) {
                    c3877kY.g();
                }
                return C5033xf0.f5238a;
        }
    }
}
