package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Y9 extends AbstractC3375el {
    public final InterfaceC3714ie0 g;

    public Y9(InterfaceC3714ie0 interfaceC3714ie0) {
        AbstractC2995aW.q(interfaceC3714ie0, "trustRootIndex");
        this.g = interfaceC3714ie0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Y9) && AbstractC2995aW.i(((Y9) obj).g, this.g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el
    public final List m(String str, List list) throws SSLPeerUnverifiedException {
        AbstractC2995aW.q(list, "chain");
        AbstractC2995aW.q(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        AbstractC2995aW.p(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        int i = 0;
        boolean z = false;
        while (i < 9) {
            i++;
            X509Certificate x509Certificate = (X509Certificate) DM.e(arrayList, 1);
            X509Certificate x509CertificateA = this.g.a(x509Certificate);
            if (x509CertificateA != null) {
                if (arrayList.size() > 1 || !AbstractC2995aW.i(x509Certificate, x509CertificateA)) {
                    arrayList.add(x509CertificateA);
                }
                if (AbstractC2995aW.i(x509CertificateA.getIssuerDN(), x509CertificateA.getSubjectDN())) {
                    try {
                        x509CertificateA.verify(x509CertificateA.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                AbstractC2995aW.p(it, "queue.iterator()");
                while (true) {
                    if (!it.hasNext()) {
                        if (z) {
                            return arrayList;
                        }
                        throw new SSLPeerUnverifiedException(AbstractC2995aW.v0(x509Certificate, "Failed to find a trusted cert that signed "));
                    }
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (AbstractC2995aW.i(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                            break;
                        } catch (GeneralSecurityException unused2) {
                        }
                    }
                }
            }
        }
        throw new SSLPeerUnverifiedException(AbstractC2995aW.v0(arrayList, "Certificate chain too long: "));
    }
}
