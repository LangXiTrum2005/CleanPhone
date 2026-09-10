package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.ViewGroup;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.y10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5067y10 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f5256a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5067y10(ViewGroup viewGroup, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f5256a = viewGroup;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C5067y10(this.f5256a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C5067y10 c5067y10 = (C5067y10) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c5067y10.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        ViewGroup viewGroup = this.f5256a;
        viewGroup.setScaleX(1.0f);
        viewGroup.setScaleY(1.0f);
        return C5033xf0.f5238a;
    }
}
