package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4233ob implements InterfaceC3907ko {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3907ko
    public final boolean a(SSLSocket sSLSocket) {
        return C4145nb.d.r() && (sSLSocket instanceof BCSSLSocket);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3907ko
    public final InterfaceC3236d80 b(SSLSocket sSLSocket) {
        return new C4321pb();
    }
}
