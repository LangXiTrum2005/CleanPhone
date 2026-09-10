package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class IA implements InterfaceC3588h80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2460Hb f3206a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public IA(InterfaceC2460Hb interfaceC2460Hb) {
        this.f3206a = interfaceC2460Hb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final long read(C4848vb c4848vb, long j) throws IOException {
        int i;
        int i2;
        AbstractC2995aW.q(c4848vb, "sink");
        do {
            int i3 = this.e;
            InterfaceC2460Hb interfaceC2460Hb = this.f3206a;
            if (i3 != 0) {
                long j2 = interfaceC2460Hb.read(c4848vb, Math.min(j, i3));
                if (j2 == -1) {
                    return -1L;
                }
                this.e -= (int) j2;
                return j2;
            }
            interfaceC2460Hb.skip(this.f);
            this.f = 0;
            if ((this.c & 4) != 0) {
                return -1L;
            }
            i = this.d;
            int iS = Vg0.s(interfaceC2460Hb);
            this.e = iS;
            this.b = iS;
            int i4 = interfaceC2460Hb.readByte() & 255;
            this.c = interfaceC2460Hb.readByte() & 255;
            Logger logger = JA.e;
            if (logger.isLoggable(Level.FINE)) {
                C3971lc c3971lc = AbstractC4644tA.f5023a;
                logger.fine(AbstractC4644tA.a(this.d, this.b, i4, this.c, true));
            }
            i2 = interfaceC2460Hb.readInt() & Integer.MAX_VALUE;
            this.d = i2;
            if (i4 != 9) {
                throw new IOException(AbstractC3950lJ.n(i4, " != TYPE_CONTINUATION"));
            }
        } while (i2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final Ic0 timeout() {
        return this.f3206a.timeout();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
