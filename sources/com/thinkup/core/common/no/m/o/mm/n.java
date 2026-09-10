package com.thinkup.core.common.no.m.o.mm;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n {
    private static n o(X509TrustManager x509TrustManager) {
        return com.thinkup.core.common.no.m.o.on.n.oo().o(x509TrustManager);
    }

    public abstract List<Certificate> o(List<Certificate> list, String str);

    private static n o(X509Certificate... x509CertificateArr) {
        return new o(new m(x509CertificateArr));
    }
}
