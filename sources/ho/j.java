package ho;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.n;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f42476a = new i();

    @Override // ho.m
    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List protocols) {
        n.f(protocols, "protocols");
        if (matchesSocket(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            go.m mVar = go.m.f42045a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) com.bumptech.glide.d.a(protocols).toArray(new String[0]));
        }
    }

    @Override // ho.m
    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        if (matchesSocket(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // ho.m
    public final boolean isSupported() {
        boolean z10 = go.g.f42032d;
        return go.g.f42032d;
    }

    @Override // ho.m
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }
}
