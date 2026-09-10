package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3995lo implements InterfaceC3236d80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3907ko f4667a;
    public InterfaceC3236d80 b;

    public C3995lo(InterfaceC3907ko interfaceC3907ko) {
        this.f4667a = interfaceC3907ko;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3236d80
    public final boolean a(SSLSocket sSLSocket) {
        return this.f4667a.a(sSLSocket);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3236d80
    public final String b(SSLSocket sSLSocket) {
        InterfaceC3236d80 interfaceC3236d80D = d(sSLSocket);
        if (interfaceC3236d80D == null) {
            return null;
        }
        return interfaceC3236d80D.b(sSLSocket);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3236d80
    public final void c(SSLSocket sSLSocket, String str, List list) {
        AbstractC2995aW.q(list, "protocols");
        InterfaceC3236d80 interfaceC3236d80D = d(sSLSocket);
        if (interfaceC3236d80D == null) {
            return;
        }
        interfaceC3236d80D.c(sSLSocket, str, list);
    }

    public final synchronized InterfaceC3236d80 d(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.f4667a.a(sSLSocket)) {
                this.b = this.f4667a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3236d80
    public final boolean isSupported() {
        return true;
    }
}
