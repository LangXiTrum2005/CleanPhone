package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.scenes.scene2d.Stage;

/* JADX INFO: loaded from: classes4.dex */
public final class G10 extends Ea0 implements InterfaceC3567gx {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new G10(2, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        G10 g10 = (G10) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        g10.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        Stage stage = AbstractC3197ck0.f4241a;
        String str = (String) ((C2856Wi) AbstractC2934Zi.f4086a.getValue()).a();
        AbstractC2995aW.q(str, "<set-?>");
        AbstractC3197ck0.c = str;
        return C5033xf0.f5238a;
    }
}
