package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Log;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.j20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3750j20 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4629t20 f4532a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3750j20(C4629t20 c4629t20, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4532a = c4629t20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3750j20(this.f4532a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3750j20) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        C4629t20 c4629t20 = this.f4532a;
        AbstractC3375el.b0(obj);
        try {
            c4629t20.b0 = ((Boolean) AbstractC3194cj.b().a()).booleanValue();
            c4629t20.c0 = ((Boolean) ((C2856Wi) AbstractC3194cj.O.getValue()).a()).booleanValue();
            c4629t20.d0 = ((Boolean) ((C2856Wi) AbstractC3194cj.Q.getValue()).a()).booleanValue();
            c4629t20.e0 = ((Boolean) ((C2856Wi) AbstractC3194cj.R.getValue()).a()).booleanValue();
            c4629t20.f0 = ((Boolean) ((C2856Wi) AbstractC2934Zi.b.getValue()).a()).booleanValue();
            return C5033xf0.f5238a;
        } catch (Exception e) {
            return new Integer(Log.e("RussianRouletteHelper", "Failed to load config", e));
        }
    }
}
