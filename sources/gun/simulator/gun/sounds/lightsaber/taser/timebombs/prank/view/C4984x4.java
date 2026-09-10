package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.x4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4984x4 implements InterfaceC3714ie0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f5205a;
    public final Method b;

    public C4984x4(X509TrustManager x509TrustManager, Method method) {
        this.f5205a = x509TrustManager;
        this.b = method;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3714ie0
    public final X509Certificate a(X509Certificate x509Certificate) {
        AbstractC2995aW.q(x509Certificate, "cert");
        try {
            Object objInvoke = this.b.invoke(this.f5205a, x509Certificate);
            if (objInvoke != null) {
                return ((TrustAnchor) objInvoke).getTrustedCert();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4984x4)) {
            return false;
        }
        C4984x4 c4984x4 = (C4984x4) obj;
        return AbstractC2995aW.i(this.f5205a, c4984x4.f5205a) && AbstractC2995aW.i(this.b, c4984x4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5205a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f5205a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
    }
}
