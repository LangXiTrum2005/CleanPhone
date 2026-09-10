package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2999aa implements InterfaceC3714ie0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4126a;

    public C2999aa(X509Certificate... x509CertificateArr) {
        AbstractC2995aW.q(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = x509CertificateArr.length;
        int i = 0;
        while (i < length) {
            X509Certificate x509Certificate = x509CertificateArr[i];
            i++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            AbstractC2995aW.p(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f4126a = linkedHashMap;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3714ie0
    public final X509Certificate a(X509Certificate x509Certificate) {
        AbstractC2995aW.q(x509Certificate, "cert");
        Set set = (Set) this.f4126a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        for (Object obj2 : set) {
            try {
                x509Certificate.verify(((X509Certificate) obj2).getPublicKey());
                obj = obj2;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C2999aa) && AbstractC2995aW.i(((C2999aa) obj).f4126a, this.f4126a));
    }

    public final int hashCode() {
        return this.f4126a.hashCode();
    }
}
