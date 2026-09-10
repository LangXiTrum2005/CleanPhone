package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.widget.TextView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutWeaponActivityActionBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.KnobProgressBar;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ak0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3020ak0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3109bk0 f4138a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3020ak0(C3109bk0 c3109bk0, int i, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4138a = c3109bk0;
        this.b = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3020ak0(this.f4138a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C3020ak0 c3020ak0 = (C3020ak0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c3020ak0.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        C3109bk0 c3109bk0 = this.f4138a;
        KnobProgressBar knobProgressBar = ((LayoutWeaponActivityActionBinding) c3109bk0.b).kpbBulletsNumber;
        AbstractC2995aW.p(knobProgressBar, "kpbBulletsNumber");
        int progressMax = ((LayoutWeaponActivityActionBinding) c3109bk0.b).kpbBulletsNumber.getProgressMax();
        int i = this.b;
        KnobProgressBar.b(knobProgressBar, progressMax - i);
        TextView textView = c3109bk0.o;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
        return C5033xf0.f5238a;
    }
}
