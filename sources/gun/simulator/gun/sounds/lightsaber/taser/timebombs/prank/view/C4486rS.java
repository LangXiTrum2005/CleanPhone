package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4486rS extends CZ {
    private final long contentLength;
    private final RO contentType;

    public C4486rS(RO ro, long j) {
        this.contentType = ro;
        this.contentLength = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ
    public long contentLength() {
        return this.contentLength;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ
    public RO contentType() {
        return this.contentType;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ
    public InterfaceC2460Hb source() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
