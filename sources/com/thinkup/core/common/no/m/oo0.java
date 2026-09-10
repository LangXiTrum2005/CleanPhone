package com.thinkup.core.common.no.m;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class oo0 {
    private final mo m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<Certificate> f42080n;
    private final m0n o;
    private final List<Certificate> o0;

    private oo0(m0n m0nVar, mo moVar, List<Certificate> list, List<Certificate> list2) {
        this.o = m0nVar;
        this.m = moVar;
        this.f42080n = list;
        this.o0 = list2;
    }

    public static oo0 o(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        mo moVarO = mo.o(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        m0n m0nVarO = m0n.o(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listO = peerCertificates != null ? com.thinkup.core.common.no.m.o.n.o(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new oo0(m0nVarO, moVarO, listO, localCertificates != null ? com.thinkup.core.common.no.m.o.n.o(localCertificates) : Collections.EMPTY_LIST);
    }

    private Principal om() {
        if (this.o0.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.o0.get(0)).getSubjectX500Principal();
    }

    private Principal oo() {
        if (this.f42080n.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.f42080n.get(0)).getSubjectX500Principal();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oo0)) {
            return false;
        }
        oo0 oo0Var = (oo0) obj;
        return this.o.equals(oo0Var.o) && this.m.equals(oo0Var.m) && this.f42080n.equals(oo0Var.f42080n) && this.o0.equals(oo0Var.o0);
    }

    public final int hashCode() {
        return this.o0.hashCode() + ((this.f42080n.hashCode() + ((this.m.hashCode() + ((this.o.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }

    public final mo m() {
        return this.m;
    }

    public final List<Certificate> n() {
        return this.f42080n;
    }

    public final List<Certificate> o0() {
        return this.o0;
    }

    public final String toString() {
        return "Handshake{tlsVersion=" + this.o + " cipherSuite=" + this.m + " peerCertificates=" + o(this.f42080n) + " localCertificates=" + o(this.o0) + AbstractJsonLexerKt.END_OBJ;
    }

    public static oo0 o(m0n m0nVar, mo moVar, List<Certificate> list, List<Certificate> list2) {
        if (m0nVar == null) {
            throw new NullPointerException("tlsVersion == null");
        }
        if (moVar != null) {
            return new oo0(m0nVar, moVar, com.thinkup.core.common.no.m.o.n.o(list), com.thinkup.core.common.no.m.o.n.o(list2));
        }
        throw new NullPointerException("cipherSuite == null");
    }

    public final m0n o() {
        return this.o;
    }

    private static List<String> o(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : list) {
            if (certificate instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) certificate).getSubjectDN()));
            } else {
                arrayList.add(certificate.getType());
            }
        }
        return arrayList;
    }
}
