package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class LY extends NY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RO f3356a;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;

    public LY(RO ro, byte[] bArr, int i, int i2) {
        this.f3356a = ro;
        this.b = i;
        this.c = bArr;
        this.d = i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NY
    public final long contentLength() {
        return this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NY
    public final RO contentType() {
        return this.f3356a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NY
    public final void writeTo(InterfaceC2434Gb interfaceC2434Gb) {
        interfaceC2434Gb.write(this.c, this.d, this.b);
    }
}
