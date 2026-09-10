package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityRussianRouletteBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.x10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4979x10 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5204a;
    public /* synthetic */ Object b;
    public final /* synthetic */ RussianRouletteActivity c;
    public final /* synthetic */ SpineController d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4979x10(RussianRouletteActivity russianRouletteActivity, SpineController spineController, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = russianRouletteActivity;
        this.d = spineController;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C4979x10 c4979x10 = new C4979x10(this.c, this.d, interfaceC2857Wj);
        c4979x10.b = obj;
        return c4979x10;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4979x10) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f5204a;
        SpineController spineController = this.d;
        RussianRouletteActivity russianRouletteActivity = this.c;
        if (i != 0) {
            if (i == 1) {
                AbstractC3375el.b0(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) this.b;
        C4803v10 c4803v10 = new C4803v10(russianRouletteActivity, spineController, null);
        this.b = interfaceC4514rk;
        this.f5204a = 1;
        if (WD.X(c4803v10, AbstractC4437qp.b, this) == enumC4602sk) {
            return enumC4602sk;
        }
        if (AbstractC3197ck0.b) {
            ((ActivityRussianRouletteBinding) russianRouletteActivity.getMBinding()).groupReload.setVisibility(0);
            ((ActivityRussianRouletteBinding) russianRouletteActivity.getMBinding()).groupReloadDone.setVisibility(8);
            C4891w10 c4891w10 = new C4891w10(russianRouletteActivity, spineController, null);
            this.b = null;
            this.f5204a = 2;
            if (WD.X(c4891w10, AbstractC4437qp.b, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            int i2 = RussianRouletteActivity.t;
            russianRouletteActivity.o().f();
        }
        return C5033xf0.f5238a;
    }
}
