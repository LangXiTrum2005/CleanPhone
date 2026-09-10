package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.v10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4803v10 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RussianRouletteActivity f5114a;
    public final /* synthetic */ SpineController b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4803v10(RussianRouletteActivity russianRouletteActivity, SpineController spineController, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f5114a = russianRouletteActivity;
        this.b = spineController;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4803v10(this.f5114a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C4803v10 c4803v10 = (C4803v10) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c4803v10.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        C3443fb c3443fbA;
        C3443fb c3443fbA2;
        C3443fb c3443fbA3;
        C3443fb c3443fbA4;
        C3443fb c3443fbA5;
        C3443fb c3443fbA6;
        C3443fb c3443fbA7;
        C3443fb c3443fbA8;
        C3443fb c3443fbA9;
        C3443fb c3443fbA10;
        C3443fb c3443fbA11;
        C3443fb c3443fbA12;
        C3443fb c3443fbA13;
        C3443fb c3443fbA14;
        AbstractC3375el.b0(obj);
        int i = RussianRouletteActivity.t;
        RussianRouletteActivity russianRouletteActivity = this.f5114a;
        russianRouletteActivity.getClass();
        SpineController spineController = this.b;
        C4991x70 skeleton = spineController.getSkeleton("banji");
        if (skeleton != null && (c3443fbA14 = skeleton.a("root")) != null) {
            float f = russianRouletteActivity.f2778a;
            c3443fbA14.h = f;
            c3443fbA14.i = f;
        }
        C4991x70 skeleton2 = spineController.getSkeleton("qiang");
        if (skeleton2 != null && (c3443fbA13 = skeleton2.a("root")) != null) {
            float f2 = russianRouletteActivity.f2778a;
            c3443fbA13.h = f2;
            c3443fbA13.i = f2;
        }
        C4991x70 skeleton3 = spineController.getSkeleton("dancao");
        if (skeleton3 != null && (c3443fbA12 = skeleton3.a("root")) != null) {
            float f3 = russianRouletteActivity.f2778a;
            c3443fbA12.h = f3;
            c3443fbA12.i = f3;
        }
        C4991x70 skeleton4 = spineController.getSkeleton("jichui");
        if (skeleton4 != null && (c3443fbA11 = skeleton4.a("root")) != null) {
            float f4 = russianRouletteActivity.f2778a;
            c3443fbA11.h = f4;
            c3443fbA11.i = f4;
        }
        C4991x70 skeleton5 = spineController.getSkeleton("reload");
        if (skeleton5 != null && (c3443fbA10 = skeleton5.a("root")) != null) {
            float f5 = russianRouletteActivity.f2778a;
            c3443fbA10.h = f5;
            c3443fbA10.i = f5;
        }
        C4991x70 skeleton6 = spineController.getSkeleton("bullet1");
        if (skeleton6 != null && (c3443fbA9 = skeleton6.a("root")) != null) {
            float f6 = russianRouletteActivity.f2778a;
            c3443fbA9.h = f6;
            c3443fbA9.i = f6;
        }
        C4991x70 skeleton7 = spineController.getSkeleton("bullet2");
        if (skeleton7 != null && (c3443fbA8 = skeleton7.a("root")) != null) {
            float f7 = russianRouletteActivity.f2778a;
            c3443fbA8.h = f7;
            c3443fbA8.i = f7;
        }
        C4991x70 skeleton8 = spineController.getSkeleton("bullet3");
        if (skeleton8 != null && (c3443fbA7 = skeleton8.a("root")) != null) {
            float f8 = russianRouletteActivity.f2778a;
            c3443fbA7.h = f8;
            c3443fbA7.i = f8;
        }
        C4991x70 skeleton9 = spineController.getSkeleton("bullet4");
        if (skeleton9 != null && (c3443fbA6 = skeleton9.a("root")) != null) {
            float f9 = russianRouletteActivity.f2778a;
            c3443fbA6.h = f9;
            c3443fbA6.i = f9;
        }
        C4991x70 skeleton10 = spineController.getSkeleton("bullet5");
        if (skeleton10 != null && (c3443fbA5 = skeleton10.a("root")) != null) {
            float f10 = russianRouletteActivity.f2778a;
            c3443fbA5.h = f10;
            c3443fbA5.i = f10;
        }
        C4991x70 skeleton11 = spineController.getSkeleton("bullet6");
        if (skeleton11 != null && (c3443fbA4 = skeleton11.a("root")) != null) {
            float f11 = russianRouletteActivity.f2778a;
            c3443fbA4.h = f11;
            c3443fbA4.i = f11;
        }
        C4991x70 skeleton12 = spineController.getSkeleton("gun");
        if (skeleton12 != null && (c3443fbA3 = skeleton12.a("root")) != null) {
            float f12 = russianRouletteActivity.f2778a;
            c3443fbA3.h = f12;
            c3443fbA3.i = f12;
        }
        C4991x70 skeleton13 = spineController.getSkeleton("effect");
        if (skeleton13 != null && (c3443fbA2 = skeleton13.a("root")) != null) {
            float f13 = russianRouletteActivity.f2778a;
            c3443fbA2.h = f13;
            c3443fbA2.i = f13;
        }
        C4991x70 skeleton14 = spineController.getSkeleton("smoke");
        if (skeleton14 != null && (c3443fbA = skeleton14.a("root")) != null) {
            float f14 = russianRouletteActivity.f2778a;
            c3443fbA.h = f14;
            c3443fbA.i = f14;
        }
        spineController.hideAllSlot();
        spineController.showSlot("effect");
        spineController.showSlot("smoke");
        return C5033xf0.f5238a;
    }
}
