package ho;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends com.google.android.gms.internal.auth.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X509TrustManager f42464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X509TrustManagerExtensions f42465d;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f42464c = x509TrustManager;
        this.f42465d = x509TrustManagerExtensions;
    }

    @Override // com.google.android.gms.internal.auth.i
    public final List d(List chain, String hostname) throws SSLPeerUnverifiedException {
        n.f(chain, "chain");
        n.f(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f42465d.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            n.e(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f42464c == this.f42464c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f42464c);
    }
}
