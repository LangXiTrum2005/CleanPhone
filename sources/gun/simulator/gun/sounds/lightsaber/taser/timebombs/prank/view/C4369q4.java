package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Looper;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4369q4 implements SL {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SL
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SL
    public RL b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C3217cz(AbstractC3305dz.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SL
    public int c() {
        return 1073741823;
    }
}
