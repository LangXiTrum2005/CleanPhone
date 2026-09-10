package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class M10 implements DS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3386a;
    public final /* synthetic */ SpineActivity b;

    public /* synthetic */ M10(SpineActivity spineActivity, int i) {
        this.f3386a = i;
        this.b = spineActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final /* bridge */ /* synthetic */ void b(InterfaceC3240dB interfaceC3240dB) {
        switch (this.f3386a) {
            case 0:
                break;
            default:
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EB
    public final GB c() {
        int i = this.f3386a;
        SpineActivity spineActivity = this.b;
        switch (i) {
            case 0:
                return new PL((RussianRouletteActivity) spineActivity, 1);
            default:
                return new PL((WeaponUseActivity) spineActivity, 3);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final void a(A70 a70) {
    }
}
