package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Vibrator;
import android.view.VelocityTracker;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.badlogic.gdx.backends.android.IControl;
import com.badlogic.gdx.backends.android.SpineController;
import com.badlogic.gdx.utils.Array;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityRussianRouletteBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.RussianRouletteFireHelper$verticesPool$1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.t20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4629t20 {
    public VelocityTracker A;
    public boolean B;
    public float C;
    public ValueAnimator D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public boolean J;
    public String K;
    public boolean L;
    public String M;
    public boolean N;
    public final InterfaceC3069bH O;
    public final InterfaceC3069bH P;
    public final InterfaceC3069bH Q;
    public final InterfaceC3069bH R;
    public final C4366q20 S;
    public final W10 T;
    public final W10 U;
    public final W10 V;
    public final W10 W;
    public final C4102n20 X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RussianRouletteActivity f5012a;
    public boolean a0;
    public final LifecycleOwner b;
    public boolean b0;
    public final SpineController c;
    public boolean c0;
    public final ActivityRussianRouletteBinding d;
    public boolean d0;
    public final InterfaceC3069bH e;
    public boolean e0;
    public final P10 f;
    public boolean f0;
    public int g;
    public final RussianRouletteFireHelper$verticesPool$1 g0;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public final int q;
    public final ArrayList r;
    public final ArrayList s;
    public final ArrayList t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public C4629t20(RussianRouletteActivity russianRouletteActivity, RussianRouletteActivity russianRouletteActivity2, SpineController spineController, ActivityRussianRouletteBinding activityRussianRouletteBinding) {
        AbstractC2995aW.q(russianRouletteActivity, "mActivity");
        AbstractC2995aW.q(activityRussianRouletteBinding, "mActivityBinding");
        this.f5012a = russianRouletteActivity;
        this.b = russianRouletteActivity2;
        this.c = spineController;
        this.d = activityRussianRouletteBinding;
        int i = 1;
        C3400f20 c3400f20 = new C3400f20(this, i);
        EnumC4124nH enumC4124nH = EnumC4124nH.c;
        this.e = AbstractC2340Cl.H(enumC4124nH, c3400f20);
        int i2 = 0;
        this.f = new P10(this, i2);
        int i3 = 3;
        this.q = 3;
        ArrayList arrayList = new ArrayList(6);
        for (int i4 = 0; i4 < 6; i4++) {
            arrayList.add(Boolean.FALSE);
        }
        this.r = arrayList;
        ArrayList arrayList2 = new ArrayList(6);
        for (int i5 = 0; i5 < 6; i5++) {
            arrayList2.add(Boolean.FALSE);
        }
        this.s = arrayList2;
        ArrayList arrayList3 = new ArrayList(6);
        for (int i6 = 0; i6 < 6; i6++) {
            arrayList3.add(Boolean.FALSE);
        }
        this.t = arrayList3;
        this.x = true;
        this.K = "";
        this.M = "dancao";
        this.O = AbstractC2340Cl.H(enumC4124nH, new C3400f20(this, i2));
        int i7 = 2;
        this.P = AbstractC2340Cl.H(enumC4124nH, new C3400f20(this, i7));
        this.Q = AbstractC2340Cl.H(enumC4124nH, C3488g20.h);
        this.R = AbstractC2340Cl.H(enumC4124nH, C3488g20.g);
        this.S = new C4366q20(this, i);
        this.T = new W10(this, i);
        this.U = new W10(this, i3);
        this.V = new W10(this, i7);
        this.W = new W10(this, i2);
        this.X = new C4102n20(this);
        this.g0 = new RussianRouletteFireHelper$verticesPool$1();
    }

    public static boolean h(float f, float f2, float[] fArr) {
        int length = fArr.length - 2;
        C4999xD c4999xDA0 = AbstractC3375el.a0(AbstractC3375el.f0(0, fArr.length), 2);
        int i = c4999xDA0.f5212a;
        int i2 = c4999xDA0.b;
        int i3 = c4999xDA0.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return false;
        }
        boolean z = false;
        while (true) {
            int i4 = i;
            int i5 = length;
            length = i4;
            float f3 = fArr[length];
            float f4 = fArr[length + 1];
            float f5 = fArr[i5];
            float f6 = fArr[i5 + 1];
            if ((f4 > f2) != (f6 > f2)) {
                if (f < (((f2 - f4) * (f5 - f3)) / (f6 - f4)) + f3) {
                    z = !z;
                }
            }
            if (length == i2) {
                return z;
            }
            i = length + i3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleCoroutineScope lifecycleScope2;
        LifecycleCoroutineScope lifecycleScope3;
        ArrayList arrayList = this.s;
        int i = this.q;
        boolean zBooleanValue = ((Boolean) arrayList.get(i)).booleanValue();
        LifecycleOwner lifecycleOwner = this.b;
        if (zBooleanValue) {
            arrayList.set(i, Boolean.FALSE);
            if (lifecycleOwner != null && (lifecycleScope3 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                WD.D(lifecycleScope3, null, 0, new C4190o20(this, null), 3);
            }
            if (lifecycleOwner != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                WD.D(lifecycleScope2, null, 0, new U10(this, null), 3);
            }
            RussianRouletteActivity russianRouletteActivity = this.f5012a;
            int i2 = russianRouletteActivity.d - 1;
            russianRouletteActivity.d = i2;
            ((ActivityRussianRouletteBinding) russianRouletteActivity.getMBinding()).tvBullet.setText(String.valueOf(i2));
        } else {
            if (!this.a0) {
                S3.b("russian_roulette_click", "fire_empty");
                this.a0 = true;
            }
            k(Integer.valueOf(this.j));
        }
        i(60);
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        AbstractC3651ht.c(lifecycleScope, new V10(2, null));
    }

    public final void b() {
        SpineController spineController = this.c;
        C3843k5 animationState = spineController != null ? spineController.getAnimationState("dancao") : null;
        C3843k5 animationState2 = spineController != null ? spineController.getAnimationState("banji") : null;
        C3843k5 animationState3 = spineController != null ? spineController.getAnimationState("jichui") : null;
        C3843k5 animationState4 = spineController != null ? spineController.getAnimationState("qiang") : null;
        if (animationState != null) {
            animationState.j();
        }
        if (animationState2 != null) {
            animationState2.j();
        }
        if (animationState3 != null) {
            animationState3.j();
        }
        if (animationState4 != null) {
            animationState4.j();
        }
    }

    public final float c() {
        C3843k5 animationState;
        C3755j5 c3755j5L;
        SpineController spineController = this.c;
        if (spineController == null || (animationState = spineController.getAnimationState("dancao")) == null || (c3755j5L = animationState.l(2)) == null) {
            return 0.0f;
        }
        float f = c3755j5L.k / c3755j5L.f4535a.d;
        return c3755j5L.o > 0.0f ? f % 1.0f : 1.0f - (f % 1.0f);
    }

    public final R7 d() {
        return (R7) this.e.getValue();
    }

    public final Vibrator e() {
        if (Build.VERSION.SDK_INT >= 23) {
            C2498In c2498In = App.n;
            if (C2498In.i().checkSelfPermission("android.permission.VIBRATE") != 0) {
                return null;
            }
        }
        return (Vibrator) this.P.getValue();
    }

    public final void f() {
        LifecycleCoroutineScope lifecycleScope;
        C3843k5 animationState;
        C3843k5 animationState2;
        C3843k5 animationState3;
        C3843k5 animationState4;
        C3843k5 animationState5;
        C3843k5 animationState6;
        C3843k5 animationState7;
        C3843k5 animationState8;
        b();
        int i = 0;
        SpineController spineController = this.c;
        if (spineController != null && (animationState8 = spineController.getAnimationState("banji")) != null) {
            animationState8.q(0.0f, 0);
        }
        if (spineController != null && (animationState7 = spineController.getAnimationState("banji")) != null) {
            animationState7.q(0.0f, 500);
        }
        if (spineController != null && (animationState6 = spineController.getAnimationState("jichui")) != null) {
            animationState6.q(0.0f, 1);
        }
        if (spineController != null && (animationState5 = spineController.getAnimationState("jichui")) != null) {
            animationState5.q(0.0f, 501);
        }
        if (spineController != null && (animationState4 = spineController.getAnimationState("dancao")) != null) {
            animationState4.q(0.0f, 2);
        }
        if (spineController != null && (animationState3 = spineController.getAnimationState("dancao")) != null) {
            animationState3.q(0.0f, 502);
        }
        if (spineController != null && (animationState2 = spineController.getAnimationState("qiang")) != null) {
            animationState2.q(0.0f, 3);
        }
        if (spineController != null && (animationState = spineController.getAnimationState("qiang")) != null) {
            animationState.q(0.0f, 504);
        }
        this.y = true;
        ActivityRussianRouletteBinding activityRussianRouletteBinding = this.d;
        TextView textView = activityRussianRouletteBinding.tvReloadDone;
        AbstractC2995aW.p(textView, "tvReloadDone");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.addUpdateListener(new Tc0(textView, i));
        valueAnimatorOfFloat.start();
        TextView textView2 = activityRussianRouletteBinding.tvGuide;
        AbstractC2995aW.p(textView2, "tvGuide");
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(800L);
        valueAnimatorOfFloat2.addUpdateListener(new Tc0(textView2, i));
        valueAnimatorOfFloat2.start();
        activityRussianRouletteBinding.groupReloadDone.setVisibility(0);
        this.w = false;
        k(Integer.valueOf(this.o));
        this.J = true;
        this.f5012a.m();
        activityRussianRouletteBinding.groupReload.setVisibility(4);
        LifecycleOwner lifecycleOwner = this.b;
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        WD.D(lifecycleScope, null, 0, new Y10(this, null), 3);
    }

    public final void g(N70 n70) {
        C4991x70 skeleton;
        C3443fb c3443fbA;
        C3443fb c3443fbA2;
        C4991x70 skeleton2;
        C3843k5 animationState;
        C3843k5 animationState2;
        SpineController spineController = this.c;
        if (spineController != null && (animationState2 = spineController.getAnimationState("reload")) != null) {
            animationState2.q(0.0f, 8);
        }
        if (spineController != null && (animationState = spineController.getAnimationState("reload")) != null) {
            animationState.q(0.0f, 9);
        }
        if (spineController != null) {
            spineController.hideSlot("reload", "hong");
        }
        if (spineController != null) {
            spineController.hideSlot("reload", "finger");
        }
        C3443fb c3443fb = n70.b;
        if (c3443fb.f4371a.b.length() == 1) {
            String str = c3443fb.f4371a.b;
            AbstractC2995aW.p(str, "getName(...)");
            this.K = str;
            if (spineController != null && (skeleton2 = spineController.getSkeleton("reload")) != null) {
                skeleton2.h(1);
            }
            for (int i = 1; i < 7; i++) {
                if (spineController != null && (skeleton = spineController.getSkeleton("reload")) != null && (c3443fbA = skeleton.a(String.valueOf(i))) != null) {
                    C4991x70 skeleton3 = spineController.getSkeleton("bullet" + i);
                    if (skeleton3 != null && (c3443fbA2 = skeleton3.a("root")) != null) {
                        float f = c3443fbA.e;
                        float f2 = this.f5012a.f2778a;
                        c3443fbA2.e = f * f2;
                        c3443fbA2.f = c3443fbA.f * f2;
                    }
                }
            }
            int i2 = Integer.parseInt(this.K) - 1;
            if (spineController != null) {
                C3843k5 animationState3 = spineController.getAnimationState("bullet" + this.K);
                if (animationState3 != null) {
                    animationState3.j();
                }
            }
            ArrayList arrayList = this.r;
            boolean zBooleanValue = ((Boolean) arrayList.get(i2)).booleanValue();
            ArrayList arrayList2 = this.s;
            if (!zBooleanValue) {
                if (!this.Y) {
                    S3.b("russian_roulette_reload_click", "load");
                    this.Y = true;
                }
                k(Integer.valueOf(this.k));
                if (spineController != null) {
                    IControl.DefaultImpls.addAnimation$default(spineController, AbstractC3888ke0.i("bullet", this.K), Integer.parseInt(this.K) + 20, "shangdan", false, 0.0f, null, 48, null);
                }
                Boolean bool = Boolean.TRUE;
                arrayList2.set(i2, bool);
                arrayList.set(i2, bool);
                return;
            }
            if (!this.Z) {
                S3.b("russian_roulette_reload_click", "unload");
                this.Z = true;
            }
            k(Integer.valueOf(this.l));
            if (spineController != null) {
                IControl.DefaultImpls.addAnimation$default(spineController, AbstractC3888ke0.i("bullet", this.K), Integer.parseInt(this.K) + 30, "xiadan", false, 0.0f, null, 48, null);
            }
            if (((Boolean) this.t.get(i2)).booleanValue() && spineController != null) {
                spineController.hideSlot("reload", this.K);
            }
            Boolean bool2 = Boolean.FALSE;
            arrayList2.set(i2, bool2);
            arrayList.set(i2, bool2);
        }
    }

    public final void i(int i) {
        int i2 = (i / 60) % 6;
        if (i2 == 0) {
            return;
        }
        if (i2 < 0) {
            i2 = (i2 + 6) % 6;
        }
        ArrayList arrayList = this.r;
        List listU0 = AbstractC2853Wf.u0(arrayList);
        ArrayList arrayList2 = this.t;
        List listU1 = AbstractC2853Wf.u0(arrayList2);
        ArrayList arrayList3 = this.s;
        List listU2 = AbstractC2853Wf.u0(arrayList3);
        for (int i3 = 0; i3 < 6; i3++) {
            int i4 = (i3 + i2) % 6;
            arrayList.set(i4, listU0.get(i3));
            arrayList2.set(i4, listU1.get(i3));
            arrayList3.set(i4, listU2.get(i3));
        }
    }

    public final void j() {
        C3843k5 animationState;
        Array array;
        C3843k5 animationState2;
        C3843k5 animationState3;
        C3843k5 animationState4;
        Array array2;
        C3843k5 animationState5;
        C3843k5 animationState6;
        C3843k5 animationState7;
        Array array3;
        C3843k5 animationState8;
        C3843k5 animationState9;
        C3843k5 animationState10;
        Array array4;
        C3843k5 animationState11;
        C3843k5 animationState12;
        C3843k5 animationState13;
        if (((Boolean) this.s.get(this.q)).booleanValue()) {
            SpineController spineController = this.c;
            if (spineController != null && (animationState13 = spineController.getAnimationState("qiang")) != null) {
                animationState13.g();
            }
            if (spineController != null && (animationState12 = spineController.getAnimationState("banji")) != null) {
                animationState12.i(500);
            }
            if (spineController != null && (animationState11 = spineController.getAnimationState("banji")) != null) {
                animationState11.q(0.1f, 500);
            }
            if (spineController != null) {
                IControl.DefaultImpls.addAnimation$default(spineController, "banji", 500, "banji_kaihuo_hou", false, 0.0f, null, 32, null);
            }
            C3755j5 c3755j5 = null;
            C3755j5 c3755j6 = (spineController == null || (animationState10 = spineController.getAnimationState("banji")) == null || (array4 = animationState10.b) == null) ? null : (C3755j5) array4.get(500);
            if (c3755j6 != null) {
                c3755j6.k = 0.0f;
            }
            if (spineController != null && (animationState9 = spineController.getAnimationState("jichui")) != null) {
                animationState9.i(501);
            }
            if (spineController != null && (animationState8 = spineController.getAnimationState("jichui")) != null) {
                animationState8.q(0.1f, 501);
            }
            if (spineController != null) {
                IControl.DefaultImpls.addAnimation$default(spineController, "jichui", 501, "jichui_kauhuo_hou", false, 0.0f, null, 32, null);
            }
            C3755j5 c3755j7 = (spineController == null || (animationState7 = spineController.getAnimationState("jichui")) == null || (array3 = animationState7.b) == null) ? null : (C3755j5) array3.get(501);
            if (c3755j7 != null) {
                c3755j7.k = 0.0f;
            }
            if (spineController != null && (animationState6 = spineController.getAnimationState("dancao")) != null) {
                animationState6.i(502);
            }
            if (spineController != null && (animationState5 = spineController.getAnimationState("dancao")) != null) {
                animationState5.q(0.1f, 502);
            }
            if (spineController != null) {
                IControl.DefaultImpls.addAnimation$default(spineController, "dancao", 502, "dancao_kaihuo_hou", false, 0.0f, null, 32, null);
            }
            C3755j5 c3755j8 = (spineController == null || (animationState4 = spineController.getAnimationState("dancao")) == null || (array2 = animationState4.b) == null) ? null : (C3755j5) array2.get(502);
            if (c3755j8 != null) {
                c3755j8.k = 0.0f;
            }
            if (spineController != null && (animationState3 = spineController.getAnimationState("qiang")) != null) {
                animationState3.i(504);
            }
            if (spineController != null && (animationState2 = spineController.getAnimationState("qiang")) != null) {
                animationState2.q(0.1f, 504);
            }
            if (spineController != null) {
                spineController.addAnimation("qiang", 504, "qiang_kaihuo_hou", false, 0.0f, this.V);
            }
            if (spineController != null && (animationState = spineController.getAnimationState("qiang")) != null && (array = animationState.b) != null) {
                c3755j5 = (C3755j5) array.get(504);
            }
            C3755j5 c3755j9 = c3755j5;
            if (c3755j9 != null) {
                c3755j9.k = 0.0f;
            }
        } else {
            o(0.0f);
        }
        a();
    }

    public final void k(Integer num) {
        LifecycleCoroutineScope lifecycleScope;
        int iIntValue = num.intValue();
        LifecycleOwner lifecycleOwner = this.b;
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        WD.D(lifecycleScope, AbstractC4437qp.b, 0, new C4014m20(this, iIntValue, null), 2);
    }

    public final void l(String str, float f) {
        C3843k5 animationState;
        C3493g5 c3493g5;
        SpineController spineController = this.c;
        if (spineController == null || (animationState = spineController.getAnimationState("dancao")) == null) {
            return;
        }
        C3755j5 c3755j5L = animationState.l(2);
        if (AbstractC2995aW.i((c3755j5L == null || (c3493g5 = c3755j5L.f4535a) == null) ? null : c3493g5.f4402a, str)) {
            float f2 = c3755j5L.f4535a.d;
            float f3 = (f * f2) + c3755j5L.k;
            while (f3 < 0.0f) {
                f3 += f2;
            }
            c3755j5L.k = f3 % f2;
            C4991x70 skeleton = spineController.getSkeleton("dancao");
            if (skeleton != null) {
                skeleton.h(3);
            }
        }
    }

    public final void m(float f) {
        C3843k5 animationState;
        C3493g5 c3493g5;
        SpineController spineController = this.c;
        if (spineController == null || (animationState = spineController.getAnimationState("dancao")) == null) {
            return;
        }
        C3755j5 c3755j5L = animationState.l(2);
        if (!AbstractC2995aW.i((c3755j5L == null || (c3493g5 = c3755j5L.f4535a) == null) ? null : c3493g5.f4402a, "dancao_kaihuo_qian")) {
            animationState.o(2, "dancao_kaihuo_qian", false);
        }
        C3755j5 c3755j5L2 = animationState.l(2);
        if (c3755j5L2 != null) {
            c3755j5L2.o = 0.0f;
            c3755j5L2.k = c3755j5L2.f4535a.d * f;
        }
        C4991x70 skeleton = spineController.getSkeleton("dancao");
        if (skeleton != null) {
            skeleton.h(3);
        }
    }

    public final void n(float f) {
        C3843k5 animationState;
        C3493g5 c3493g5;
        SpineController spineController = this.c;
        if (spineController == null || (animationState = spineController.getAnimationState("banji")) == null) {
            return;
        }
        C3755j5 c3755j5L = animationState.l(0);
        if (!AbstractC2995aW.i((c3755j5L == null || (c3493g5 = c3755j5L.f4535a) == null) ? null : c3493g5.f4402a, "banji_kaihuo_qian")) {
            animationState.o(0, "banji_kaihuo_qian", false);
        }
        C3755j5 c3755j5L2 = animationState.l(0);
        if (c3755j5L2 != null) {
            c3755j5L2.o = 0.0f;
            c3755j5L2.k = c3755j5L2.f4535a.d * f;
        }
        C4991x70 skeleton = spineController.getSkeleton("banji");
        if (skeleton != null) {
            skeleton.h(3);
        }
    }

    public final void o(float f) {
        C3843k5 animationState;
        C3493g5 c3493g5;
        SpineController spineController = this.c;
        if (spineController == null || (animationState = spineController.getAnimationState("jichui")) == null) {
            return;
        }
        C3755j5 c3755j5L = animationState.l(1);
        if (!AbstractC2995aW.i((c3755j5L == null || (c3493g5 = c3755j5L.f4535a) == null) ? null : c3493g5.f4402a, "jichui_kauhuo_qian")) {
            animationState.o(1, "jichui_kauhuo_qian", false);
        }
        C3755j5 c3755j5L2 = animationState.l(1);
        if (c3755j5L2 != null) {
            c3755j5L2.o = 0.0f;
            c3755j5L2.k = c3755j5L2.f4535a.d * f;
        }
        C4991x70 skeleton = spineController.getSkeleton("jichui");
        if (skeleton != null) {
            skeleton.h(3);
        }
    }

    public final void p(float f) {
        if (this.u) {
            return;
        }
        float f2 = 1.0f / 6;
        int iC = ((int) (c() / f2)) % 6;
        if (f > 0.0f) {
            iC = (iC + 1) % 6;
        } else if (f < 0.0f) {
            iC = (iC + 5) % 6;
        }
        float f3 = iC * f2;
        float fMax = Math.max((f * f) / (Math.abs(-500) * 2), 0.1f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c(), f3);
        valueAnimatorOfFloat.setDuration((long) fMax);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new VJ(this, 4));
        valueAnimatorOfFloat.addListener(new C4278p20(f, this, f3, valueAnimatorOfFloat));
        valueAnimatorOfFloat.start();
    }
}
