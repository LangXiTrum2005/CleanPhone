package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.ironsource.C0375hc;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.s;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f36359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.thrid.okhttp.internal.connection.g f36361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f36362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f36363e;

    public j(v vVar, boolean z10) {
        this.f36359a = vVar;
        this.f36360b = z10;
    }

    public void a() {
        this.f36363e = true;
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f36361c;
        if (gVar != null) {
            gVar.a();
        }
    }

    public boolean b() {
        return this.f36363e;
    }

    public void a(Object obj) {
        this.f36362d = obj;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) throws IOException {
        y yVarD = aVar.d();
        g gVar = (g) aVar;
        com.mbridge.msdk.thrid.okhttp.d dVarE = gVar.e();
        o oVarG = gVar.g();
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar2 = new com.mbridge.msdk.thrid.okhttp.internal.connection.g(this.f36359a.f(), a(yVarD.g()), dVarE, oVarG, this.f36362d);
        this.f36361c = gVar2;
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar3 = gVar2;
        int i10 = 0;
        a0 a0VarA = null;
        y yVar = yVarD;
        while (!this.f36363e) {
            try {
                try {
                    try {
                        a0VarA = gVar.a(yVar, gVar3, null, null);
                        if (a0VarA != null) {
                            a0VarA = a0VarA.p().d(a0VarA.p().a((b0) null).a()).a();
                        }
                        try {
                            y yVarA = a(a0VarA, gVar3.h());
                            if (yVarA == null) {
                                gVar3.f();
                                return a0VarA;
                            }
                            com.mbridge.msdk.thrid.okhttp.internal.c.a(a0VarA.d());
                            int i11 = i10 + 1;
                            if (i11 <= 20) {
                                yVarA.a();
                                if (!a(a0VarA, yVarA.g())) {
                                    gVar3.f();
                                    com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar4 = new com.mbridge.msdk.thrid.okhttp.internal.connection.g(this.f36359a.f(), a(yVarA.g()), dVarE, oVarG, this.f36362d);
                                    this.f36361c = gVar4;
                                    gVar3 = gVar4;
                                } else if (gVar3.b() != null) {
                                    throw new IllegalStateException("Closing the body of " + a0VarA + " didn't close its backing stream. Bad interceptor?");
                                }
                                yVar = yVarA;
                                i10 = i11;
                            } else {
                                gVar3.f();
                                throw new ProtocolException(l1.d.e(i11, "Too many follow-up requests: "));
                            }
                        } catch (IOException e10) {
                            gVar3.f();
                            throw e10;
                        }
                    } catch (IOException e11) {
                        if (!a(e11, gVar3, !(e11 instanceof com.mbridge.msdk.thrid.okhttp.internal.http2.a), yVar)) {
                            throw e11;
                        }
                    }
                } catch (com.mbridge.msdk.thrid.okhttp.internal.connection.e e12) {
                    if (!a(e12.g(), gVar3, false, yVar)) {
                        throw e12.d();
                    }
                }
            } catch (Throwable th2) {
                gVar3.a((IOException) null);
                gVar3.f();
                throw th2;
            }
        }
        gVar3.f();
        throw new IOException("Canceled");
    }

    private com.mbridge.msdk.thrid.okhttp.a a(s sVar) {
        SSLSocketFactory sSLSocketFactoryB;
        HostnameVerifier hostnameVerifierO;
        com.mbridge.msdk.thrid.okhttp.f fVarC;
        if (sVar.h()) {
            sSLSocketFactoryB = this.f36359a.B();
            hostnameVerifierO = this.f36359a.o();
            fVarC = this.f36359a.c();
        } else {
            sSLSocketFactoryB = null;
            hostnameVerifierO = null;
            fVarC = null;
        }
        return new com.mbridge.msdk.thrid.okhttp.a(sVar.g(), sVar.j(), this.f36359a.k(), this.f36359a.A(), sSLSocketFactoryB, hostnameVerifierO, fVarC, this.f36359a.w(), this.f36359a.v(), this.f36359a.u(), this.f36359a.g(), this.f36359a.x());
    }

    private boolean a(IOException iOException, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, boolean z10, y yVar) {
        gVar.a(iOException);
        if (this.f36359a.z()) {
            return !(z10 && a(iOException, yVar)) && a(iOException, z10) && gVar.d();
        }
        return false;
    }

    private boolean a(IOException iOException, y yVar) {
        yVar.a();
        return iOException instanceof FileNotFoundException;
    }

    private boolean a(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return (iOException instanceof SocketTimeoutException) && !z10;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private y a(a0 a0Var, c0 c0Var) throws IOException {
        String strB;
        s sVarE;
        if (a0Var != null) {
            int iK = a0Var.k();
            String strE = a0Var.s().e();
            if (iK == 307 || iK == 308) {
                if (!strE.equals(C0375hc.f28788a) && !strE.equals("HEAD")) {
                    return null;
                }
            } else {
                if (iK == 401) {
                    return this.f36359a.a().a(c0Var, a0Var);
                }
                if (iK == 503) {
                    if ((a0Var.q() == null || a0Var.q().k() != 503) && a(a0Var, Integer.MAX_VALUE) == 0) {
                        return a0Var.s();
                    }
                    return null;
                }
                if (iK == 407) {
                    if (c0Var.b().type() == Proxy.Type.HTTP) {
                        return this.f36359a.w().a(c0Var, a0Var);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (iK == 408) {
                    if (!this.f36359a.z()) {
                        return null;
                    }
                    a0Var.s().a();
                    if ((a0Var.q() == null || a0Var.q().k() != 408) && a(a0Var, 0) <= 0) {
                        return a0Var.s();
                    }
                    return null;
                }
                switch (iK) {
                    case 300:
                    case 301:
                    case 302:
                    case 303:
                        break;
                    default:
                        return null;
                }
            }
            if (!this.f36359a.m() || (strB = a0Var.b("Location")) == null || (sVarE = a0Var.s().g().e(strB)) == null) {
                return null;
            }
            if (!sVarE.m().equals(a0Var.s().g().m()) && !this.f36359a.n()) {
                return null;
            }
            y.a aVarF = a0Var.s().f();
            if (f.a(strE)) {
                boolean zC = f.c(strE);
                if (f.b(strE)) {
                    aVarF.a(C0375hc.f28788a, (z) null);
                } else {
                    aVarF.a(strE, zC ? a0Var.s().a() : null);
                }
                if (!zC) {
                    aVarF.a("Transfer-Encoding");
                    aVarF.a("Content-Length");
                    aVarF.a("Content-Type");
                }
            }
            if (!a(a0Var, sVarE)) {
                aVarF.a("Authorization");
            }
            return aVarF.a(sVarE).a();
        }
        throw new IllegalStateException();
    }

    private int a(a0 a0Var, int i10) {
        String strB = a0Var.b(CommonGatewayClient.HEADER_RETRY_AFTER);
        if (strB == null) {
            return i10;
        }
        if (strB.matches("\\d+")) {
            return Integer.valueOf(strB).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean a(a0 a0Var, s sVar) {
        s sVarG = a0Var.s().g();
        return sVarG.g().equals(sVar.g()) && sVarG.j() == sVar.j() && sVarG.m().equals(sVar.m());
    }
}
