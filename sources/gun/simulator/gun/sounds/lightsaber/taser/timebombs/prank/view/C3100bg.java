package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.ColorSeekBarVertical;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3100bg extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ColorSeekBarVertical f4181a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3100bg(ColorSeekBarVertical colorSeekBarVertical, float f, int i, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4181a = colorSeekBarVertical;
        this.b = f;
        this.c = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3100bg(this.f4181a, this.b, this.c, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3100bg) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        float f = this.b * 100;
        ColorSeekBarVertical colorSeekBarVertical = this.f4181a;
        colorSeekBarVertical.setPositionPercentageColorNotListener(f);
        InterfaceC3011ag interfaceC3011ag = colorSeekBarVertical.r;
        if (interfaceC3011ag == null) {
            return null;
        }
        C3109bk0 c3109bk0 = ((Lj0) interfaceC3011ag).f3368a;
        Weapon weapon = c3109bk0.e;
        if (weapon != null) {
            c3109bk0.k(this.c, weapon);
        }
        return C5033xf0.f5238a;
    }
}
