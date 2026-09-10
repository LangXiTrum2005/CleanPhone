package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4468rA extends AbstractC4029mA {
    public boolean d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (!this.d) {
            h();
        }
        this.b = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4029mA, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final long read(C4848vb c4848vb, long j) {
        AbstractC2995aW.q(c4848vb, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "byteCount < 0: ").toString());
        }
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.d) {
            return -1L;
        }
        long j2 = super.read(c4848vb, j);
        if (j2 != -1) {
            return j2;
        }
        this.d = true;
        h();
        return -1L;
    }
}
