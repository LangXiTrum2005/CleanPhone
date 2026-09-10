package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.SplashActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivitySplashBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class QL implements IS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3599a;
    public final /* synthetic */ Object b;

    public /* synthetic */ QL(Object obj, int i) {
        this.f3599a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final void a(A70 a70) {
        switch (this.f3599a) {
            case 1:
                ((ActivitySplashBinding) ((SplashActivity) this.b).getMBinding()).ivAdPlacementSplash.setVisibility(0);
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final /* bridge */ /* synthetic */ void b(InterfaceC3240dB interfaceC3240dB) {
        switch (this.f3599a) {
            case 0:
                d();
                break;
            case 1:
                d();
                break;
            case 2:
                d();
                break;
            default:
                d();
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EB
    public final GB c() {
        int i = this.f3599a;
        int i2 = 2;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new PL((MainActivity) obj, 0);
            case 1:
                return new C3887ke(i2);
            case 2:
                return new PL((WeaponSortActivity) obj, i2);
            default:
                return new PL((DialogC3094bd) obj, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        switch (this.f3599a) {
            case 1:
                ((ActivitySplashBinding) ((SplashActivity) this.b).getMBinding()).ivAdPlacementSplash.setVisibility(8);
                break;
        }
    }

    public final C3887ke e() {
        switch (this.f3599a) {
            case 0:
                return new C3887ke(0);
            case 1:
                return new C3887ke(1);
            case 2:
                return new C3887ke(3);
            default:
                return new C3887ke(4);
        }
    }
}
