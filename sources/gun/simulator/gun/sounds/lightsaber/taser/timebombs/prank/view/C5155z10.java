package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.ViewGroup;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5155z10 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f5311a;
    public final /* synthetic */ YX b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5155z10(ViewGroup viewGroup, YX yx, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f5311a = viewGroup;
        this.b = yx;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C5155z10(this.f5311a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C5155z10 c5155z10 = (C5155z10) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c5155z10.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        YX yx = this.b;
        float f = yx.f4021a;
        ViewGroup viewGroup = this.f5311a;
        viewGroup.setScaleX(f);
        viewGroup.setScaleY(yx.f4021a);
        return C5033xf0.f5238a;
    }
}
