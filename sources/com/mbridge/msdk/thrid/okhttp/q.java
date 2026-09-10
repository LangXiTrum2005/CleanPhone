package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f36651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f36652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Certificate> f36653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Certificate> f36654d;

    private q(d0 d0Var, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.f36651a = d0Var;
        this.f36652b = gVar;
        this.f36653c = list;
        this.f36654d = list2;
    }

    public static q a(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        g gVarA = g.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        d0 d0VarA = d0.a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listA = peerCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new q(d0VarA, gVarA, listA, localCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(localCertificates) : Collections.EMPTY_LIST);
    }

    public List<Certificate> b() {
        return this.f36653c;
    }

    public d0 c() {
        return this.f36651a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f36651a.equals(qVar.f36651a) && this.f36652b.equals(qVar.f36652b) && this.f36653c.equals(qVar.f36653c) && this.f36654d.equals(qVar.f36654d);
    }

    public int hashCode() {
        return this.f36654d.hashCode() + ((this.f36653c.hashCode() + ((this.f36652b.hashCode() + ((this.f36651a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }

    public g a() {
        return this.f36652b;
    }
}
