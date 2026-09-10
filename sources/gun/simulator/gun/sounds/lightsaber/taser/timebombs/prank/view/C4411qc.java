package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4411qc extends AbstractC4883vw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4498rc f4889a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4411qc(InterfaceC3588h80 interfaceC3588h80, C4498rc c4498rc) {
        super(interfaceC3588h80);
        this.f4889a = c4498rc;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4883vw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4889a.c.close();
        super.close();
    }
}
