package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4088ms extends AbstractC4795uw {
    public final long b;
    public boolean c;
    public long d;
    public boolean e;
    public final /* synthetic */ C4813v60 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4088ms(C4813v60 c4813v60, InterfaceC4463r70 interfaceC4463r70, long j) {
        super(interfaceC4463r70);
        AbstractC2995aW.q(c4813v60, "this$0");
        AbstractC2995aW.q(interfaceC4463r70, "delegate");
        this.f = c4813v60;
        this.b = j;
    }

    public final IOException a(IOException iOException) {
        if (this.c) {
            return iOException;
        }
        this.c = true;
        return this.f.a(this.d, false, true, iOException);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4795uw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.e) {
            return;
        }
        this.e = true;
        long j = this.b;
        if (j != -1 && this.d != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4795uw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70
    public final void d(C4848vb c4848vb, long j) throws IOException {
        AbstractC2995aW.q(c4848vb, "source");
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        long j2 = this.b;
        if (j2 != -1 && this.d + j > j2) {
            StringBuilder sbP = DM.p("expected ", j2, " bytes but received ");
            sbP.append(this.d + j);
            throw new ProtocolException(sbP.toString());
        }
        try {
            super.d(c4848vb, j);
            this.d += j;
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4795uw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            throw a(e);
        }
    }
}
