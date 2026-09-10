package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.IControl;
import com.badlogic.gdx.backends.android.SpineController;

/* JADX INFO: loaded from: classes4.dex */
public final class Y10 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4003a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4629t20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y10(C4629t20 c4629t20, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = c4629t20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        Y10 y10 = new Y10(this.c, interfaceC2857Wj);
        y10.b = obj;
        return y10;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Y10) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4003a;
        C4629t20 c4629t20 = this.c;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            X10 x10 = new X10(c4629t20, null);
            this.f4003a = 1;
            if (WD.X(x10, AbstractC4437qp.b, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        SpineController spineController = c4629t20.c;
        if (spineController != null) {
            IControl.DefaultImpls.addAnimation$default(spineController, "reload", 5, "dancao", false, 0.0f, null, 48, null);
        }
        SpineController spineController2 = c4629t20.c;
        if (spineController2 != null) {
            IControl.DefaultImpls.addAnimation$default(spineController2, "gun", 6, "qiang", false, 0.0f, null, 48, null);
        }
        c4629t20.d().postDelayed(new P10(c4629t20, 3), 900L);
        return C5033xf0.f5238a;
    }
}
