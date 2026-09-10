package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.ArrowView;

/* JADX INFO: loaded from: classes4.dex */
public final class V5 extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrowView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V5(ArrowView arrowView, int i) {
        super(0);
        this.f = i;
        this.g = arrowView;
    }

    public final Float b() {
        int i = this.f;
        ArrowView arrowView = this.g;
        switch (i) {
            case 0:
                return Float.valueOf(arrowView.getSideLength() / 2.0f);
            default:
                return Float.valueOf((arrowView.h * 2) / ((float) Math.sqrt(3.0f)));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f) {
            case 0:
                break;
        }
        return b();
    }
}
