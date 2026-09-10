package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2435Gc {
    void cancel();

    void enqueue(InterfaceC2565Lc interfaceC2565Lc);

    C5109yZ execute() throws IOException;

    boolean isCanceled();
}
