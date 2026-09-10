package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2452Gt extends AbstractC4795uw {
    public final InterfaceC2766Sw b;
    public boolean c;

    public C2452Gt(C5076y6 c5076y6, InterfaceC2766Sw interfaceC2766Sw) {
        super(c5076y6);
        this.b = interfaceC2766Sw;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4795uw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4795uw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70
    public final void d(C4848vb c4848vb, long j) throws EOFException {
        AbstractC2995aW.q(c4848vb, "source");
        if (this.c) {
            c4848vb.skip(j);
            return;
        }
        try {
            super.d(c4848vb, j);
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4795uw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Flushable
    public final void flush() {
        if (this.c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }
}
