package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4399qS extends CZ {
    private final CZ delegate;
    private final InterfaceC2460Hb delegateSource;
    private IOException thrownException;

    public C4399qS(CZ cz) {
        AbstractC2995aW.q(cz, "delegate");
        this.delegate = cz;
        this.delegateSource = AbstractC4496rb.f(new C4311pS(this, cz.source()));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ
    public long contentLength() {
        return this.delegate.contentLength();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ
    public RO contentType() {
        return this.delegate.contentType();
    }

    public final IOException getThrownException() {
        return this.thrownException;
    }

    public final void setThrownException(IOException iOException) {
        this.thrownException = iOException;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ
    public InterfaceC2460Hb source() {
        return this.delegateSource;
    }

    public final void throwIfCaught() throws IOException {
        IOException iOException = this.thrownException;
        if (iOException != null) {
            throw iOException;
        }
    }
}
