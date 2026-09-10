package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ii0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3721ii0 extends NY {
    final /* synthetic */ C4848vb $output;
    final /* synthetic */ NY $requestBody;

    public C3721ii0(NY ny, C4848vb c4848vb) {
        this.$requestBody = ny;
        this.$output = c4848vb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NY
    public long contentLength() {
        return this.$output.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NY
    public RO contentType() {
        return this.$requestBody.contentType();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NY
    public void writeTo(InterfaceC2434Gb interfaceC2434Gb) throws IOException {
        AbstractC2995aW.q(interfaceC2434Gb, "sink");
        interfaceC2434Gb.I(this.$output.u());
    }
}
