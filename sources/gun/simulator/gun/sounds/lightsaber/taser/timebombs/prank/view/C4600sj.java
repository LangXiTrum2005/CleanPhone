package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4600sj implements InterfaceC3907ko {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3907ko
    public final boolean a(SSLSocket sSLSocket) {
        boolean z = C4512rj.d;
        return AbstractC4337pj.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3907ko
    public final InterfaceC3236d80 b(SSLSocket sSLSocket) {
        return new C4688tj();
    }
}
