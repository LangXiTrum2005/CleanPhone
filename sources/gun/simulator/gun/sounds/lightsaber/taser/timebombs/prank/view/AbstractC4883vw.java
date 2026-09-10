package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4883vw implements InterfaceC3588h80 {
    private final InterfaceC3588h80 delegate;

    public AbstractC4883vw(InterfaceC3588h80 interfaceC3588h80) {
        AbstractC2995aW.q(interfaceC3588h80, "delegate");
        this.delegate = interfaceC3588h80;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final InterfaceC3588h80 m282deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final InterfaceC3588h80 delegate() {
        return this.delegate;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public long read(C4848vb c4848vb, long j) {
        AbstractC2995aW.q(c4848vb, "sink");
        return this.delegate.read(c4848vb, j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public Ic0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('(');
        sb.append(this.delegate);
        sb.append(')');
        return sb.toString();
    }
}
