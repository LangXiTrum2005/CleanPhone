package ho;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.n;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f42475a = new g();

    @Override // ho.m
    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List protocols) {
        n.f(protocols, "protocols");
        if (matchesSocket(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            go.m mVar = go.m.f42045a;
            parameters.setApplicationProtocols((String[]) com.bumptech.glide.d.a(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // ho.m
    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // ho.m
    public final boolean isSupported() {
        boolean z10 = go.d.f42029d;
        return go.d.f42029d;
    }

    @Override // ho.m
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return false;
    }
}
