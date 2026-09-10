package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4193o4 extends AbstractC3375el {
    public final X509TrustManager g;
    public final X509TrustManagerExtensions h;

    public C4193o4(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.g = x509TrustManager;
        this.h = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4193o4) && ((C4193o4) obj).g == this.g;
    }

    public final int hashCode() {
        return System.identityHashCode(this.g);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el
    public final List m(String str, List list) throws SSLPeerUnverifiedException {
        AbstractC2995aW.q(list, "chain");
        AbstractC2995aW.q(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        try {
            List<X509Certificate> listCheckServerTrusted = this.h.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            AbstractC2995aW.p(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
