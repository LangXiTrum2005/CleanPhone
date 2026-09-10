package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.lifecycle.Lifecycle;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5003xH implements InterfaceC4827vH {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f5215a;
    public final /* synthetic */ C5091yH b;

    public C5003xH(C5091yH c5091yH, Lifecycle lifecycle) {
        this.b = c5091yH;
        this.f5215a = lifecycle;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH
    public final void onDestroy() {
        ((Map) this.b.f5270a).remove(this.f5215a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH
    public final void onStart() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH
    public final void onStop() {
    }
}
