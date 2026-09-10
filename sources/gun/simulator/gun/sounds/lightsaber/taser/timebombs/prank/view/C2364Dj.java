package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2364Dj extends C2338Cj implements S30 {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S30
    public final long c() {
        return -1L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S30
    public final long getTimeUs(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / ((long) this.e);
    }
}
