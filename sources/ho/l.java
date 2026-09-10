package ho;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f42477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f42478b;

    public l(k kVar) {
        this.f42477a = kVar;
    }

    public final synchronized m a(SSLSocket sSLSocket) {
        try {
            if (this.f42478b == null && this.f42477a.matchesSocket(sSLSocket)) {
                this.f42478b = this.f42477a.create(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f42478b;
    }

    @Override // ho.m
    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List protocols) {
        n.f(protocols, "protocols");
        m mVarA = a(sSLSocket);
        if (mVarA != null) {
            mVarA.configureTlsExtensions(sSLSocket, str, protocols);
        }
    }

    @Override // ho.m
    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        m mVarA = a(sSLSocket);
        if (mVarA != null) {
            return mVarA.getSelectedProtocol(sSLSocket);
        }
        return null;
    }

    @Override // ho.m
    public final boolean isSupported() {
        return true;
    }

    @Override // ho.m
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return this.f42477a.matchesSocket(sSLSocket);
    }
}
