package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5114yc implements InterfaceC3588h80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5284a;
    public final /* synthetic */ InterfaceC2460Hb b;
    public final /* synthetic */ InterfaceC2279Ac c;
    public final /* synthetic */ InterfaceC2434Gb d;

    public C5114yc(InterfaceC2460Hb interfaceC2460Hb, C4762uc c4762uc, DX dx) {
        this.b = interfaceC2460Hb;
        this.c = c4762uc;
        this.d = dx;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f5284a && !Vg0.g(this, TimeUnit.MILLISECONDS)) {
            this.f5284a = true;
            ((C4762uc) this.c).a();
        }
        this.b.close();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final long read(C4848vb c4848vb, long j) throws IOException {
        AbstractC2995aW.q(c4848vb, "sink");
        try {
            long j2 = this.b.read(c4848vb, j);
            InterfaceC2434Gb interfaceC2434Gb = this.d;
            if (j2 != -1) {
                c4848vb.m(interfaceC2434Gb.getBuffer(), c4848vb.b - j2, j2);
                interfaceC2434Gb.z();
                return j2;
            }
            if (!this.f5284a) {
                this.f5284a = true;
                interfaceC2434Gb.close();
            }
            return -1L;
        } catch (IOException e) {
            if (!this.f5284a) {
                this.f5284a = true;
                ((C4762uc) this.c).a();
            }
            throw e;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final Ic0 timeout() {
        return this.b.timeout();
    }
}
