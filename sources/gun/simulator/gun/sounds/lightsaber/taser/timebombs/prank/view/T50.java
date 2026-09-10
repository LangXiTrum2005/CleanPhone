package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogShakeSensitivityBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.LinerCustomSeekBar;

/* JADX INFO: loaded from: classes4.dex */
public final class T50 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z50 f3753a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T50(Z50 z50, int i, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3753a = z50;
        this.b = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new T50(this.f3753a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        T50 t50 = (T50) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        t50.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        int i = Z50.e;
        Z50 z50 = this.f3753a;
        LinerCustomSeekBar linerCustomSeekBar = ((DialogShakeSensitivityBinding) z50.a()).ivShakeSensitivitySeekbar;
        int i2 = this.b;
        linerCustomSeekBar.setProgress(i2);
        ((DialogShakeSensitivityBinding) z50.a()).tvMaxSensitivity.setText(String.valueOf(i2));
        ((DialogShakeSensitivityBinding) z50.a()).ivShake.setSelected(i2 == 0);
        return C5033xf0.f5238a;
    }
}
