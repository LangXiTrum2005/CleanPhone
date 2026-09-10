package ho;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements k {
    @Override // ho.k
    public final m create(SSLSocket sSLSocket) {
        return new j();
    }

    @Override // ho.k
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return go.g.f42032d && Conscrypt.isConscrypt(sSLSocket);
    }
}
