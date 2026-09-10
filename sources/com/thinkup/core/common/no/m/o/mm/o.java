package com.thinkup.core.common.no.m.o.mm;

import android.support.v4.media.a;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends n {
    private static final int o = 9;
    private final om m;

    public o(om omVar) {
        this.m = omVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof o) && ((o) obj).m.equals(this.m);
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // com.thinkup.core.common.no.m.o.mm.n
    public final List<Certificate> o(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((Certificate) arrayDeque.removeFirst());
        boolean z2 = false;
        for (int i2 = 0; i2 < 9; i2++) {
            X509Certificate x509Certificate2 = (X509Certificate) a.d(1, arrayList);
            X509Certificate x509CertificateO = this.m.o(x509Certificate2);
            if (x509CertificateO != null) {
                if (arrayList.size() > 1 || !x509Certificate2.equals(x509CertificateO)) {
                    arrayList.add(x509CertificateO);
                }
                if (o(x509CertificateO, x509CertificateO)) {
                    return arrayList;
                }
                z2 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                do {
                    if (!it.hasNext()) {
                        if (!z2) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed ".concat(String.valueOf(x509Certificate2)));
                        }
                        return arrayList;
                    }
                    x509Certificate = (X509Certificate) it.next();
                } while (!o(x509Certificate2, x509Certificate));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: ".concat(String.valueOf(arrayList)));
    }

    private static boolean o(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
