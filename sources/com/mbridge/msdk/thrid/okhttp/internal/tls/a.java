package com.mbridge.msdk.thrid.okhttp.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f36605a;

    public a(e eVar) {
        this.f36605a = eVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.tls.c
    public List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            X509Certificate x509Certificate2 = (X509Certificate) l1.d.d(arrayList, 1);
            X509Certificate x509CertificateA = this.f36605a.a(x509Certificate2);
            if (x509CertificateA != null) {
                if (arrayList.size() > 1 || !x509Certificate2.equals(x509CertificateA)) {
                    arrayList.add(x509CertificateA);
                }
                if (a(x509CertificateA, x509CertificateA)) {
                    return arrayList;
                }
                z10 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                do {
                    if (!it.hasNext()) {
                        if (!z10) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate2);
                        }
                        return arrayList;
                    }
                    x509Certificate = (X509Certificate) it.next();
                } while (!a(x509Certificate2, x509Certificate));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && ((a) obj).f36605a.equals(this.f36605a);
    }

    public int hashCode() {
        return this.f36605a.hashCode();
    }

    private boolean a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
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
