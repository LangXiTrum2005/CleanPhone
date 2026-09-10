package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2406Ez extends T9 {
    public int g;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final void c(long j, long j2, long j3, List list, InterfaceC3954lN[] interfaceC3954lNArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.g, jElapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!a(i, jElapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int getSelectedIndex() {
        return this.g;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final Object getSelectionData() {
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int getSelectionReason() {
        return 0;
    }
}
