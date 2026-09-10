package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3841k4 implements InterfaceC3236d80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3336eJ f4582a = new C3336eJ(25, 0);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3236d80
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3236d80
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || AbstractC2995aW.i(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3236d80
    public final void c(SSLSocket sSLSocket, String str, List list) throws IOException {
        AbstractC2995aW.q(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C5104yU c5104yU = C5104yU.f5278a;
            Object[] array = C3887ke.j(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3236d80
    public final boolean isSupported() {
        return f4582a.n();
    }
}
