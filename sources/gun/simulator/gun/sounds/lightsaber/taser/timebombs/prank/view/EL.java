package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class EL extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ int f;
    public final /* synthetic */ MainActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EL(MainActivity mainActivity, int i) {
        super(0);
        this.f = i;
        this.g = mainActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() {
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        int i = this.f;
        MainActivity mainActivity = this.g;
        switch (i) {
            case 0:
                return new DialogC4476rI(mainActivity, mainActivity, mainActivity);
            case 1:
                switch (i) {
                    case 1:
                        super/*androidx.activity.ComponentActivity*/.onBackPressed();
                        return c5033xf0;
                    default:
                        mainActivity.e = false;
                        return c5033xf0;
                }
            case 2:
                switch (i) {
                    case 1:
                        super/*androidx.activity.ComponentActivity*/.onBackPressed();
                        return c5033xf0;
                    default:
                        mainActivity.e = false;
                        return c5033xf0;
                }
            default:
                return new Ck0(mainActivity);
        }
    }
}
