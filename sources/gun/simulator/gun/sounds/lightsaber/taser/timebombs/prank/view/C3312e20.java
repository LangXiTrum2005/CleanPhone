package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityRussianRouletteBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.e20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3312e20 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4303a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4629t20 c;
    public final /* synthetic */ ZX d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3312e20(C4629t20 c4629t20, ZX zx, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = c4629t20;
        this.d = zx;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C3312e20 c3312e20 = new C3312e20(this.c, this.d, interfaceC2857Wj);
        c3312e20.b = obj;
        return c3312e20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3312e20) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4303a;
        C4629t20 c4629t20 = this.c;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            c4629t20.f5012a.j(R.drawable.bg_scene_russain_roulette);
            ActivityRussianRouletteBinding activityRussianRouletteBinding = c4629t20.d;
            activityRussianRouletteBinding.groupReload.setVisibility(0);
            activityRussianRouletteBinding.groupReloadDone.setVisibility(8);
            C3224d20 c3224d20 = new C3224d20(c4629t20, null);
            this.f4303a = 1;
            if (WD.X(c3224d20, AbstractC4437qp.b, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        RussianRouletteActivity russianRouletteActivity = c4629t20.f5012a;
        int i2 = this.d.f4074a;
        russianRouletteActivity.d = i2;
        ((ActivityRussianRouletteBinding) russianRouletteActivity.getMBinding()).tvBullet.setText(String.valueOf(i2));
        RussianRouletteActivity russianRouletteActivity2 = c4629t20.f5012a;
        russianRouletteActivity2.s(russianRouletteActivity2.b);
        return C5033xf0.f5238a;
    }
}
