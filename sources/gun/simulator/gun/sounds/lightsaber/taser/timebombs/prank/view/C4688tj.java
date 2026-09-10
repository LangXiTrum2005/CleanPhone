package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4688tj implements InterfaceC3236d80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3887ke f5047a = new C3887ke(28, 0);
    public static final C4600sj b = new C4600sj();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3236d80
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3236d80
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3236d80
    public final void c(SSLSocket sSLSocket, String str, List list) {
        AbstractC2995aW.q(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C5104yU c5104yU = C5104yU.f5278a;
            Object[] array = C3887ke.j(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3236d80
    public final boolean isSupported() {
        boolean z = C4512rj.d;
        return C4512rj.d;
    }
}
