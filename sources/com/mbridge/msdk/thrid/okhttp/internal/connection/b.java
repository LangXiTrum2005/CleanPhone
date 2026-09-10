package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.j;
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
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<j> f36292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36293b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36295d;

    public b(List<j> list) {
        this.f36292a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i10 = this.f36293b; i10 < this.f36292a.size(); i10++) {
            if (this.f36292a.get(i10).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public j a(SSLSocket sSLSocket) throws IOException {
        j jVar;
        int i10 = this.f36293b;
        int size = this.f36292a.size();
        while (true) {
            if (i10 >= size) {
                jVar = null;
                break;
            }
            jVar = this.f36292a.get(i10);
            if (jVar.a(sSLSocket)) {
                this.f36293b = i10 + 1;
                break;
            }
            i10++;
        }
        if (jVar != null) {
            this.f36294c = b(sSLSocket);
            com.mbridge.msdk.thrid.okhttp.internal.a.f36256a.a(jVar, sSLSocket, this.f36295d);
            return jVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f36295d + ", modes=" + this.f36292a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean a(IOException iOException) {
        this.f36295d = true;
        if (!this.f36294c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z10 = iOException instanceof SSLHandshakeException;
        if ((z10 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z10 || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
