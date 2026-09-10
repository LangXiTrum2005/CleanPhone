package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.badlogic.gdx.backends.android.IControl;
import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityRussianRouletteBinding;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class B10 extends WG implements InterfaceC2766Sw {
    public final /* synthetic */ int f;
    public final /* synthetic */ RussianRouletteActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B10(RussianRouletteActivity russianRouletteActivity, int i) {
        super(1);
        this.f = i;
        this.g = russianRouletteActivity;
    }

    public final void a(View view) {
        int i = this.f;
        int i2 = 0;
        RussianRouletteActivity russianRouletteActivity = this.g;
        int i3 = 1;
        switch (i) {
            case 0:
                AbstractC2995aW.q(view, "it");
                S3.b("russian_roulette_click", "help");
                russianRouletteActivity.m();
                russianRouletteActivity.q();
                SpineController spineController = russianRouletteActivity.e;
                if (spineController != null) {
                    russianRouletteActivity.p(spineController, true);
                }
                break;
            case 1:
                AbstractC2995aW.q(view, "it");
                S3.b("russian_roulette_click", com.umeng.ccg.a.j);
                DialogC2384Ed dialogC2384Ed = russianRouletteActivity.c;
                if (dialogC2384Ed == null) {
                    DialogC2384Ed dialogC2384Ed2 = new DialogC2384Ed(russianRouletteActivity, russianRouletteActivity);
                    C2498In c2498In = App.n;
                    WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C2358Dd(dialogC2384Ed2, null), 2);
                    dialogC2384Ed2.show();
                    russianRouletteActivity.c = dialogC2384Ed2;
                } else {
                    C2498In c2498In2 = App.n;
                    WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C2358Dd(dialogC2384Ed, null), 2);
                    dialogC2384Ed.show();
                }
                break;
            case 2:
                AbstractC2995aW.q(view, "it");
                DialogC2799Ud dialogC2799Ud = (DialogC2799Ud) russianRouletteActivity.k.getValue();
                dialogC2799Ud.getClass();
                C2498In c2498In3 = App.n;
                WD.D(C2498In.g(), null, 0, new C2773Td(dialogC2799Ud, null), 3);
                dialogC2799Ud.show();
                break;
            case 3:
                AbstractC2995aW.q(view, "it");
                S3.b("russian_roulette_click", "reload");
                ND.b().h(russianRouletteActivity, "Inter_RussianRouletteReload", 2, new C10(russianRouletteActivity, i2));
                break;
            case 4:
                AbstractC2995aW.q(view, "it");
                if (!russianRouletteActivity.l) {
                    S3.b("russian_roulette_reload_click", "done");
                    russianRouletteActivity.l = true;
                }
                C4629t20 c4629t20O = russianRouletteActivity.o();
                if (!c4629t20O.w) {
                    c4629t20O.x = false;
                    c4629t20O.w = true;
                    ActivityRussianRouletteBinding activityRussianRouletteBinding = c4629t20O.d;
                    View view2 = activityRussianRouletteBinding.mask;
                    AbstractC2995aW.p(view2, "mask");
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(800L);
                    valueAnimatorOfFloat.addUpdateListener(new Tc0(view2, 3));
                    valueAnimatorOfFloat.start();
                    TextView textView = activityRussianRouletteBinding.tvReloadDone;
                    AbstractC2995aW.p(textView, "tvReloadDone");
                    TextView textView2 = activityRussianRouletteBinding.tvGuide;
                    AbstractC2995aW.p(textView2, "tvGuide");
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.95f, 1.0f);
                    valueAnimatorOfFloat2.setDuration(267L);
                    valueAnimatorOfFloat2.addUpdateListener(new Tc0(textView, 1));
                    valueAnimatorOfFloat2.addListener(new Uc0(textView2, textView));
                    valueAnimatorOfFloat2.start();
                    ZX zx = new ZX();
                    c4629t20O.J = false;
                    while (true) {
                        SpineController spineController2 = c4629t20O.c;
                        if (i2 >= 6) {
                            c4629t20O.k(Integer.valueOf(c4629t20O.n));
                            if (spineController2 != null) {
                                IControl.DefaultImpls.addAnimation$default(spineController2, "reload", 101, "dancao_shou", false, 0.0f, null, 48, null);
                            }
                            if (spineController2 != null) {
                                IControl.DefaultImpls.addAnimation$default(spineController2, "gun", 102, "qiang_shou", false, 0.0f, null, 48, null);
                            }
                            c4629t20O.i((new Random().nextInt(5) + 1) * 60);
                            c4629t20O.d().postDelayed(new P10(c4629t20O, i3), 460L);
                            c4629t20O.d().postDelayed(new Q10(c4629t20O, zx), 800L);
                            c4629t20O.d().postDelayed(new Q10(zx, c4629t20O), 1000L);
                        } else {
                            if (spineController2 != null) {
                                C3843k5 animationState = spineController2.getAnimationState("bullet" + (i2 + 1));
                                if (animationState != null) {
                                    animationState.j();
                                }
                            }
                            if (spineController2 != null) {
                                C3843k5 animationState2 = spineController2.getAnimationState("bullet" + (i2 + 1));
                                if (animationState2 != null) {
                                    animationState2.q(0.0f, i2 + 21);
                                }
                            }
                            if (spineController2 != null) {
                                spineController2.hideSlot("bullet" + (i2 + 1));
                            }
                            if (((Boolean) c4629t20O.r.get(i2)).booleanValue()) {
                                if (spineController2 != null) {
                                    spineController2.showSlot("reload", String.valueOf(i2 + 1));
                                }
                                if (spineController2 != null) {
                                    C4991x70 skeleton = spineController2.getSkeleton("bullet" + (i2 + 1));
                                    if (skeleton != null) {
                                        skeleton.h(3);
                                    }
                                }
                                c4629t20O.t.set(i2, Boolean.TRUE);
                                zx.f4074a++;
                            }
                            i2++;
                        }
                        break;
                    }
                }
                break;
            default:
                AbstractC2995aW.q(view, "it");
                ND.b().h(russianRouletteActivity, "Inter_RussianRoulette", 2, new C10(russianRouletteActivity, i3));
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        switch (this.f) {
            case 0:
                a((View) obj);
                break;
            case 1:
                a((View) obj);
                break;
            case 2:
                a((View) obj);
                break;
            case 3:
                a((View) obj);
                break;
            case 4:
                a((View) obj);
                break;
            default:
                a((View) obj);
                break;
        }
        return c5033xf0;
    }
}
