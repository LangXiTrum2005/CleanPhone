package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.o90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4204o90 implements InterfaceC4265ot {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4265ot f4782a;
    public final long b;

    public C4204o90(InterfaceC4265ot interfaceC4265ot, long j) {
        this.f4782a = interfaceC4265ot;
        FW.h(interfaceC4265ot.getPosition() >= j);
        this.b = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final boolean advancePeekPosition(int i, boolean z) {
        return this.f4782a.advancePeekPosition(i, z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final int f(byte[] bArr, int i, int i2) {
        return this.f4782a.f(bArr, i, i2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final long getLength() {
        return this.f4782a.getLength() - this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final long getPeekPosition() {
        return this.f4782a.getPeekPosition() - this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final long getPosition() {
        return this.f4782a.getPosition() - this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final boolean peekFully(byte[] bArr, int i, int i2, boolean z) {
        return this.f4782a.peekFully(bArr, i, i2, z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3813jl
    public final int read(byte[] bArr, int i, int i2) {
        return this.f4782a.read(bArr, i, i2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final boolean readFully(byte[] bArr, int i, int i2, boolean z) {
        return this.f4782a.readFully(bArr, i, i2, z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final void resetPeekPosition() {
        this.f4782a.resetPeekPosition();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final int skip(int i) {
        return this.f4782a.skip(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final void skipFully(int i) {
        this.f4782a.skipFully(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final void advancePeekPosition(int i) {
        this.f4782a.advancePeekPosition(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final void peekFully(byte[] bArr, int i, int i2) {
        this.f4782a.peekFully(bArr, i, i2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final void readFully(byte[] bArr, int i, int i2) {
        this.f4782a.readFully(bArr, i, i2);
    }
}
