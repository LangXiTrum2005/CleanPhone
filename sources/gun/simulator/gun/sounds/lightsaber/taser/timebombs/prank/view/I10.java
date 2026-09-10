package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityRussianRouletteBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class I10 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3197a;
    public /* synthetic */ Object b;
    public final /* synthetic */ RussianRouletteActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I10(RussianRouletteActivity russianRouletteActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = russianRouletteActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        I10 i10 = new I10(this.c, interfaceC2857Wj);
        i10.b = obj;
        return i10;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((I10) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:28:0x026f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0270  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        float f;
        Object objBuild$default;
        RussianRouletteActivity russianRouletteActivity;
        C4629t20 c4629t20O;
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        int i = 4;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = this.f3197a;
        RussianRouletteActivity russianRouletteActivity2 = this.c;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC3375el.b0(obj);
            } else if (i2 == 2) {
                AbstractC3375el.b0(obj);
                russianRouletteActivity2.s(russianRouletteActivity2.b);
                if (!AbstractC3197ck0.b) {
                    russianRouletteActivity2.m();
                    ((ActivityRussianRouletteBinding) russianRouletteActivity2.getMBinding()).groupReload.setVisibility(4);
                    ((ActivityRussianRouletteBinding) russianRouletteActivity2.getMBinding()).groupReloadDone.setVisibility(8);
                }
                SpineController.Builder builder = new SpineController.Builder(U5.t0(new C4839vT("effect", russianRouletteActivity2.l(DM.B("spine/effect/", AbstractC3197ck0.c, ".atlas"), "spine/effect/" + AbstractC3197ck0.c + ".json")), new C4839vT("smoke", russianRouletteActivity2.l(DM.B("spine/effect/", AbstractC3197ck0.c, "_smoke.atlas"), "spine/effect/" + AbstractC3197ck0.c + "_smoke.json")), new C4839vT("dancao", russianRouletteActivity2.l("spine/russian_roulette/zuolun_dancao.atlas", "spine/russian_roulette/zuolun_dancao.skel")), new C4839vT("banji", russianRouletteActivity2.l("spine/russian_roulette/zuolun_banji.atlas", "spine/russian_roulette/zuolun_banji.skel")), new C4839vT("jichui", russianRouletteActivity2.l("spine/russian_roulette/zuolun_jichui.atlas", "spine/russian_roulette/zuolun_jichui.skel")), new C4839vT("qiang", russianRouletteActivity2.l("spine/russian_roulette/zuolun_qiang.atlas", "spine/russian_roulette/zuolun_qiang.skel")), new C4839vT("reload", russianRouletteActivity2.l("spine/russian_roulette/zuolun_huandan.atlas", "spine/russian_roulette/zuolun_huandan.json")), new C4839vT("bullet1", russianRouletteActivity2.l("spine/russian_roulette/zidan.atlas", "spine/russian_roulette/zidan.skel")), new C4839vT("bullet2", russianRouletteActivity2.l("spine/russian_roulette/zidan.atlas", "spine/russian_roulette/zidan.skel")), new C4839vT("bullet3", russianRouletteActivity2.l("spine/russian_roulette/zidan.atlas", "spine/russian_roulette/zidan.skel")), new C4839vT("bullet4", russianRouletteActivity2.l("spine/russian_roulette/zidan.atlas", "spine/russian_roulette/zidan.skel")), new C4839vT("bullet5", russianRouletteActivity2.l("spine/russian_roulette/zidan.atlas", "spine/russian_roulette/zidan.skel")), new C4839vT("bullet6", russianRouletteActivity2.l("spine/russian_roulette/zidan.atlas", "spine/russian_roulette/zidan.skel")), new C4839vT("gun", russianRouletteActivity2.l("spine/russian_roulette/zuolun_huandan.atlas", "spine/russian_roulette/zuolun_huandan.json"))));
                FrameLayout frameLayout = ((ActivityRussianRouletteBinding) russianRouletteActivity2.getMBinding()).flSpine;
                AbstractC2995aW.p(frameLayout, "flSpine");
                SpineController.Builder spineAnimationCallback = SpineController.Builder.addSpineView$default(builder, frameLayout, null, 2, null).setSpineAnimationCallback(new H10(russianRouletteActivity2));
                this.b = russianRouletteActivity2;
                this.f3197a = 3;
                objBuild$default = SpineController.Builder.build$default(spineAnimationCallback, this.c, null, this, 2, null);
                if (objBuild$default == enumC4602sk) {
                    return enumC4602sk;
                }
                russianRouletteActivity = russianRouletteActivity2;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RussianRouletteActivity russianRouletteActivity3 = (RussianRouletteActivity) this.b;
                AbstractC3375el.b0(obj);
                russianRouletteActivity = russianRouletteActivity3;
                objBuild$default = obj;
            }
            russianRouletteActivity.e = (SpineController) objBuild$default;
            c4629t20O = russianRouletteActivity2.o();
            lifecycleOwner = c4629t20O.b;
            if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                WD.D(lifecycleScope, null, 0, new C3926l20(c4629t20O, null), 3);
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) this.b;
        int i3 = RussianRouletteActivity.t;
        ((ActivityRussianRouletteBinding) russianRouletteActivity2.getMBinding()).conWeaponBanner.post(new P0(russianRouletteActivity2, i));
        AbstractC3197ck0.b = false;
        AbstractC3197ck0.j.set(0, AbstractC3197ck0.l.get(0));
        F10 f10 = new F10(2, null);
        this.b = interfaceC4514rk;
        this.f3197a = 1;
        if (WD.X(f10, AbstractC4437qp.b, this) == enumC4602sk) {
            return enumC4602sk;
        }
        String string = AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_russian_roulette);
        AbstractC2995aW.p(string, "getString(...)");
        AbstractC2871Wx.r0(string);
        int i4 = RussianRouletteActivity.t;
        russianRouletteActivity2.getClass();
        float f2 = 1080.0f;
        AbstractC2871Wx.e = AbstractC3375el.D(russianRouletteActivity2).x / 1080.0f;
        AbstractC2871Wx.f = AbstractC3375el.D(russianRouletteActivity2).y / 1725.0f;
        if (AbstractC3375el.B(russianRouletteActivity2.getApplicationContext()).y / AbstractC3375el.B(russianRouletteActivity2.getApplicationContext()).x >= 1.7777778f) {
            f = AbstractC3375el.B(russianRouletteActivity2.getApplicationContext()).x;
        } else {
            f = AbstractC3375el.B(russianRouletteActivity2.getApplicationContext()).y;
            f2 = 1920.0f;
        }
        russianRouletteActivity2.f2778a = f / f2;
        G10 g10 = new G10(2, null);
        this.b = null;
        this.f3197a = 2;
        if (WD.X(g10, AbstractC4437qp.b, this) == enumC4602sk) {
            return enumC4602sk;
        }
        russianRouletteActivity2.s(russianRouletteActivity2.b);
        if (!AbstractC3197ck0.b) {
            russianRouletteActivity2.m();
            ((ActivityRussianRouletteBinding) russianRouletteActivity2.getMBinding()).groupReload.setVisibility(4);
            ((ActivityRussianRouletteBinding) russianRouletteActivity2.getMBinding()).groupReloadDone.setVisibility(8);
        }
        SpineController.Builder builder2 = new SpineController.Builder(U5.t0(new C4839vT("effect", russianRouletteActivity2.l(DM.B("spine/effect/", AbstractC3197ck0.c, ".atlas"), "spine/effect/" + AbstractC3197ck0.c + ".json")), new C4839vT("smoke", russianRouletteActivity2.l(DM.B("spine/effect/", AbstractC3197ck0.c, "_smoke.atlas"), "spine/effect/" + AbstractC3197ck0.c + "_smoke.json")), new C4839vT("dancao", russianRouletteActivity2.l("spine/russian_roulette/zuolun_dancao.atlas", "spine/russian_roulette/zuolun_dancao.skel")), new C4839vT("banji", russianRouletteActivity2.l("spine/russian_roulette/zuolun_banji.atlas", "spine/russian_roulette/zuolun_banji.skel")), new C4839vT("jichui", russianRouletteActivity2.l("spine/russian_roulette/zuolun_jichui.atlas", "spine/russian_roulette/zuolun_jichui.skel")), new C4839vT("qiang", russianRouletteActivity2.l("spine/russian_roulette/zuolun_qiang.atlas", "spine/russian_roulette/zuolun_qiang.skel")), new C4839vT("reload", russianRouletteActivity2.l("spine/russian_roulette/zuolun_huandan.atlas", "spine/russian_roulette/zuolun_huandan.json")), new C4839vT("bullet1", russianRouletteActivity2.l("spine/russian_roulette/zidan.atlas", "spine/russian_roulette/zidan.skel")), new C4839vT("bullet2", russianRouletteActivity2.l("spine/russian_roulette/zidan.atlas", "spine/russian_roulette/zidan.skel")), new C4839vT("bullet3", russianRouletteActivity2.l("spine/russian_roulette/zidan.atlas", "spine/russian_roulette/zidan.skel")), new C4839vT("bullet4", russianRouletteActivity2.l("spine/russian_roulette/zidan.atlas", "spine/russian_roulette/zidan.skel")), new C4839vT("bullet5", russianRouletteActivity2.l("spine/russian_roulette/zidan.atlas", "spine/russian_roulette/zidan.skel")), new C4839vT("bullet6", russianRouletteActivity2.l("spine/russian_roulette/zidan.atlas", "spine/russian_roulette/zidan.skel")), new C4839vT("gun", russianRouletteActivity2.l("spine/russian_roulette/zuolun_huandan.atlas", "spine/russian_roulette/zuolun_huandan.json"))));
        FrameLayout frameLayout2 = ((ActivityRussianRouletteBinding) russianRouletteActivity2.getMBinding()).flSpine;
        AbstractC2995aW.p(frameLayout2, "flSpine");
        SpineController.Builder spineAnimationCallback2 = SpineController.Builder.addSpineView$default(builder2, frameLayout2, null, 2, null).setSpineAnimationCallback(new H10(russianRouletteActivity2));
        this.b = russianRouletteActivity2;
        this.f3197a = 3;
        objBuild$default = SpineController.Builder.build$default(spineAnimationCallback2, this.c, null, this, 2, null);
        if (objBuild$default == enumC4602sk) {
            return enumC4602sk;
        }
        russianRouletteActivity = russianRouletteActivity2;
        russianRouletteActivity.e = (SpineController) objBuild$default;
        c4629t20O = russianRouletteActivity2.o();
        lifecycleOwner = c4629t20O.b;
        if (lifecycleOwner != null) {
            WD.D(lifecycleScope, null, 0, new C3926l20(c4629t20O, null), 3);
        }
        return C5033xf0.f5238a;
    }
}
