package com.thinkup.core.common.no.m.o.n;

import com.p004ironsource.ko;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import com.thinkup.core.common.no.m.m00;
import com.thinkup.core.common.no.m.m0m;
import com.thinkup.core.common.no.m.m0o;
import com.thinkup.core.common.no.m.omm;
import com.thinkup.core.common.no.m.onm;
import com.thinkup.core.common.no.m.onn;
import com.thinkup.core.common.no.m.oom;
import com.thinkup.core.common.no.m.oon;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes6.dex */
public final class mm implements oon {
    private static final int o = 20;
    private final omm m;

    public mm(omm ommVar) {
        this.m = ommVar;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    @Override // com.thinkup.core.common.no.m.oon
    public final m00 o(oon.o oVar) throws IOException {
        onm onmVarM;
        String strO;
        oom oomVarN;
        onm onmVarO = oVar.o();
        on onVar = (on) oVar;
        com.thinkup.core.common.no.m.o.m.mm mmVarOn = onVar.on();
        int i2 = 0;
        m00 m00Var = null;
        while (true) {
            mmVarOn.o(onmVarO);
            if (mmVarOn.mm()) {
                throw new IOException("Canceled");
            }
            try {
                try {
                    m00 m00VarO = onVar.o(onmVarO, mmVarOn, null);
                    if (m00Var != null) {
                        m00VarO = m00VarO.m0().n(m00Var.m0().o((m0o) null).o()).o();
                    }
                    m00Var = m00VarO;
                    com.thinkup.core.common.no.m.o.m.n nVarO = com.thinkup.core.common.no.m.o.o.o.o(m00Var);
                    m0m m0mVarO = nVarO != null ? nVarO.o().o() : null;
                    if (m00Var == null) {
                        throw new IllegalStateException();
                    }
                    int iN = m00Var.n();
                    String strM = m00Var.o().m();
                    if (iN == 307 || iN == 308) {
                        if (!strM.equals(ko.f25534a) && !strM.equals("HEAD")) {
                            onmVarM = null;
                        } else if (!this.m.nn() || (strO = m00Var.o("Location")) == null || (oomVarN = m00Var.o().o().n(strO)) == null) {
                            onmVarM = null;
                        } else if (oomVarN.m().equals(m00Var.o().o().m()) || this.m.nm()) {
                            onm.o oVarOo = m00Var.o().oo();
                            if (om.n(strM)) {
                                boolean zEquals = strM.equals("PROPFIND");
                                if (strM.equals("PROPFIND")) {
                                    oVarOo.o(strM, zEquals ? m00Var.o().o0() : null);
                                } else {
                                    oVarOo.o(ko.f25534a, (onn) null);
                                }
                                if (!zEquals) {
                                    oVarOo.m("Transfer-Encoding");
                                    oVarOo.m("Content-Length");
                                    oVarOo.m("Content-Type");
                                }
                            }
                            if (!com.thinkup.core.common.no.m.o.n.o(m00Var.o().o(), oomVarN)) {
                                oVarOo.m("Authorization");
                            }
                            onmVarM = oVarOo.o(oomVarN).m();
                        } else {
                            onmVarM = null;
                        }
                    } else if (iN == 401) {
                        onmVarM = this.m.mn().o();
                    } else if (iN == 503) {
                        onmVarM = ((m00Var.mm() == null || m00Var.mm().n() != 503) && o(m00Var, Integer.MAX_VALUE) == 0) ? m00Var.o() : null;
                    } else if (iN == 407) {
                        if ((m0mVarO != null ? m0mVarO.m() : this.m.n()).type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        onmVarM = this.m.n0().o();
                    } else if (iN != 408) {
                        switch (iN) {
                            case 300:
                            case 301:
                            case 302:
                            case BaseATView.g.f38290N /* 303 */:
                                if (!this.m.nn()) {
                                }
                                break;
                            default:
                                onmVarM = null;
                                break;
                        }
                    } else if (this.m.o00()) {
                        m00Var.o().o0();
                        onmVarM = ((m00Var.mm() == null || m00Var.mm().n() != 408) && o(m00Var, 0) <= 0) ? m00Var.o() : null;
                    } else {
                        onmVarM = null;
                    }
                    if (onmVarM == null) {
                        if (nVarO != null && nVarO.m()) {
                            mmVarOn.n();
                        }
                        return m00Var;
                    }
                    onmVarM.o0();
                    com.thinkup.core.common.no.m.o.n.o(m00Var.on());
                    if (mmVarOn.m0()) {
                        nVarO.mo();
                    }
                    i2++;
                    if (i2 > 20) {
                        throw new ProtocolException("Too many follow-up requests: ".concat(String.valueOf(i2)));
                    }
                    onmVarO = onmVarM;
                } catch (com.thinkup.core.common.no.m.o.m.m0 e2) {
                    if (!o(e2.m(), mmVarOn, false, onmVarO)) {
                        throw e2.o();
                    }
                    mmVarOn.om();
                } catch (IOException e3) {
                    if (!o(e3, mmVarOn, !(e3 instanceof com.thinkup.core.common.no.m.o.oo.o), onmVarO)) {
                        throw e3;
                    }
                    mmVarOn.om();
                }
            } catch (Throwable th) {
                mmVarOn.om();
                throw th;
            }
        }
    }

    private boolean o(IOException iOException, com.thinkup.core.common.no.m.o.m.mm mmVar, boolean z2, onm onmVar) {
        if (this.m.o00()) {
            return !(z2 && o(iOException, onmVar)) && o(iOException, z2) && mmVar.on();
        }
        return false;
    }

    private static boolean o(IOException iOException, onm onmVar) {
        onmVar.o0();
        return iOException instanceof FileNotFoundException;
    }

    private static boolean o(IOException iOException, boolean z2) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return (iOException instanceof SocketTimeoutException) && !z2;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private onm o(m00 m00Var, m0m m0mVar) throws ProtocolException {
        String strO;
        oom oomVarN;
        Proxy proxyN;
        if (m00Var != null) {
            int iN = m00Var.n();
            String strM = m00Var.o().m();
            if (iN == 307 || iN == 308) {
                if (!strM.equals(ko.f25534a) && !strM.equals("HEAD")) {
                    return null;
                }
            } else {
                if (iN == 401) {
                    return this.m.mn().o();
                }
                if (iN == 503) {
                    if ((m00Var.mm() == null || m00Var.mm().n() != 503) && o(m00Var, Integer.MAX_VALUE) == 0) {
                        return m00Var.o();
                    }
                    return null;
                }
                if (iN == 407) {
                    if (m0mVar != null) {
                        proxyN = m0mVar.m();
                    } else {
                        proxyN = this.m.n();
                    }
                    if (proxyN.type() == Proxy.Type.HTTP) {
                        return this.m.n0().o();
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (iN == 408) {
                    if (!this.m.o00()) {
                        return null;
                    }
                    m00Var.o().o0();
                    if ((m00Var.mm() == null || m00Var.mm().n() != 408) && o(m00Var, 0) <= 0) {
                        return m00Var.o();
                    }
                    return null;
                }
                switch (iN) {
                    case 300:
                    case 301:
                    case 302:
                    case BaseATView.g.f38290N /* 303 */:
                        break;
                    default:
                        return null;
                }
            }
            if (!this.m.nn() || (strO = m00Var.o("Location")) == null || (oomVarN = m00Var.o().o().n(strO)) == null) {
                return null;
            }
            if (!oomVarN.m().equals(m00Var.o().o().m()) && !this.m.nm()) {
                return null;
            }
            onm.o oVarOo = m00Var.o().oo();
            if (om.n(strM)) {
                boolean zEquals = strM.equals("PROPFIND");
                if (!strM.equals("PROPFIND")) {
                    oVarOo.o(ko.f25534a, (onn) null);
                } else {
                    oVarOo.o(strM, zEquals ? m00Var.o().o0() : null);
                }
                if (!zEquals) {
                    oVarOo.m("Transfer-Encoding");
                    oVarOo.m("Content-Length");
                    oVarOo.m("Content-Type");
                }
            }
            if (!com.thinkup.core.common.no.m.o.n.o(m00Var.o().o(), oomVarN)) {
                oVarOo.m("Authorization");
            }
            return oVarOo.o(oomVarN).m();
        }
        throw new IllegalStateException();
    }

    private static int o(m00 m00Var, int i2) {
        String strO = m00Var.o(CommonGatewayClient.HEADER_RETRY_AFTER);
        if (strO == null) {
            return i2;
        }
        if (strO.matches("\\d+")) {
            return Integer.valueOf(strO).intValue();
        }
        return Integer.MAX_VALUE;
    }
}
