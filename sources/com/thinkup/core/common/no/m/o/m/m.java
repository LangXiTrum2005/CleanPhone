package com.thinkup.core.common.no.m.o.m;

import com.thinkup.core.common.no.m.n0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes6.dex */
final class m {
    private int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42007n;
    private final List<n0> o;
    private boolean o0;

    public m(List<n0> list) {
        this.o = list;
    }

    private boolean m(SSLSocket sSLSocket) {
        for (int i2 = this.m; i2 < this.o.size(); i2++) {
            if (this.o.get(i2).o(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final n0 o(SSLSocket sSLSocket) throws UnknownServiceException {
        n0 n0Var;
        int i2 = this.m;
        int size = this.o.size();
        while (true) {
            if (i2 >= size) {
                n0Var = null;
                break;
            }
            n0Var = this.o.get(i2);
            if (n0Var.o(sSLSocket)) {
                this.m = i2 + 1;
                break;
            }
            i2++;
        }
        if (n0Var != null) {
            this.f42007n = m(sSLSocket);
            com.thinkup.core.common.no.m.o.o.o.o(n0Var, sSLSocket, this.o0);
            return n0Var;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.o0 + ", modes=" + this.o + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public final boolean o(IOException iOException) {
        this.o0 = true;
        if (!this.f42007n || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return iOException instanceof SSLException;
    }
}
