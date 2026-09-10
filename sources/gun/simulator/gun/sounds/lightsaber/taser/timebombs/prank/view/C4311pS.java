package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4311pS extends AbstractC4883vw {
    final /* synthetic */ C4399qS this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4311pS(C4399qS c4399qS, InterfaceC2460Hb interfaceC2460Hb) {
        super(interfaceC2460Hb);
        this.this$0 = c4399qS;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4883vw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public long read(C4848vb c4848vb, long j) throws IOException {
        AbstractC2995aW.q(c4848vb, "sink");
        try {
            return super.read(c4848vb, j);
        } catch (IOException e) {
            this.this$0.setThrownException(e);
            throw e;
        }
    }
}
