package com.thinkup.core.common.no.m;

import android.support.v4.media.a;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes6.dex */
public final class n0 {
    public static final n0 m;
    private static final mo[] mm;
    private static final mo[] mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n0 f42001n;
    public static final n0 o;
    public static final n0 o0;
    final String[] m0;
    final boolean om;
    final String[] on;
    final boolean oo;

    static {
        mo moVar = mo.ono0;
        mo moVar2 = mo.onoo;
        mo moVar3 = mo.onom;
        mo moVar4 = mo.omom;
        mo moVar5 = mo.ommm;
        mo moVar6 = mo.omon;
        mo moVar7 = mo.ommn;
        mo moVar8 = mo.on0o;
        mo moVar9 = mo.on00;
        mo[] moVarArr = {moVar, moVar2, moVar3, moVar4, moVar5, moVar6, moVar7, moVar8, moVar9};
        mo = moVarArr;
        mo[] moVarArr2 = {moVar, moVar2, moVar3, moVar4, moVar5, moVar6, moVar7, moVar8, moVar9, mo.ooon, mo.oom0, mo.nmn, mo.nn0, mo.onn, mo.m0n, mo.mo};
        mm = moVarArr2;
        o oVarO = new o(true).o(moVarArr);
        m0n m0nVar = m0n.TLS_1_3;
        m0n m0nVar2 = m0n.TLS_1_2;
        o = oVarO.o(m0nVar, m0nVar2).o().m();
        m = new o(true).o(moVarArr2).o(m0nVar, m0nVar2).o().m();
        f42001n = new o(true).o(moVarArr2).o(m0nVar, m0nVar2, m0n.TLS_1_1, m0n.TLS_1_0).o().m();
        o0 = new o(false).m();
    }

    public n0(o oVar) {
        this.oo = oVar.o;
        this.on = oVar.m;
        this.m0 = oVar.f42002n;
        this.om = oVar.o0;
    }

    private boolean m() {
        return this.oo;
    }

    private List<mo> n() {
        String[] strArr = this.on;
        if (strArr != null) {
            return mo.o(strArr);
        }
        return null;
    }

    private List<m0n> o0() {
        String[] strArr = this.m0;
        if (strArr != null) {
            return m0n.o(strArr);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        n0 n0Var = (n0) obj;
        boolean z2 = this.oo;
        if (z2 != n0Var.oo) {
            return false;
        }
        return !z2 || (Arrays.equals(this.on, n0Var.on) && Arrays.equals(this.m0, n0Var.m0) && this.om == n0Var.om);
    }

    public final int hashCode() {
        if (this.oo) {
            return ((((Arrays.hashCode(this.on) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.m0)) * 31) + (!this.om ? 1 : 0);
        }
        return 17;
    }

    public final boolean o() {
        return this.om;
    }

    public final String toString() {
        if (!this.oo) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        String[] strArr = this.on;
        sb.append(Objects.toString(strArr != null ? mo.o(strArr) : null, "[all enabled]"));
        sb.append(", tlsVersions=");
        String[] strArr2 = this.m0;
        sb.append(Objects.toString(strArr2 != null ? m0n.o(strArr2) : null, "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return a.t(sb, this.om, ")");
    }

    public static final class o {
        String[] m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String[] f42002n;
        boolean o;
        boolean o0;

        public o(boolean z2) {
            this.o = z2;
        }

        private o n() {
            if (!this.o) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            this.m = null;
            return this;
        }

        private o o0() {
            if (!this.o) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            this.f42002n = null;
            return this;
        }

        public final o m(String... strArr) {
            if (!this.o) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f42002n = (String[]) strArr.clone();
            return this;
        }

        public final o o(mo... moVarArr) {
            if (!this.o) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[moVarArr.length];
            for (int i2 = 0; i2 < moVarArr.length; i2++) {
                strArr[i2] = moVarArr[i2].onmo;
            }
            return o(strArr);
        }

        public o(n0 n0Var) {
            this.o = n0Var.oo;
            this.m = n0Var.on;
            this.f42002n = n0Var.m0;
            this.o0 = n0Var.om;
        }

        public final n0 m() {
            return new n0(this);
        }

        public final o o(String... strArr) {
            if (this.o) {
                if (strArr.length != 0) {
                    this.m = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public final o o(m0n... m0nVarArr) {
            if (this.o) {
                String[] strArr = new String[m0nVarArr.length];
                for (int i2 = 0; i2 < m0nVarArr.length; i2++) {
                    strArr[i2] = m0nVarArr[i2].om;
                }
                return m(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public final o o() {
            if (this.o) {
                this.o0 = true;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
    }

    private n0 m(SSLSocket sSLSocket, boolean z2) {
        String[] strArrO = this.on != null ? com.thinkup.core.common.no.m.o.n.o(mo.o, sSLSocket.getEnabledCipherSuites(), this.on) : sSLSocket.getEnabledCipherSuites();
        String[] strArrO2 = this.m0 != null ? com.thinkup.core.common.no.m.o.n.o(com.thinkup.core.common.no.m.o.n.on, sSLSocket.getEnabledProtocols(), this.m0) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iO = com.thinkup.core.common.no.m.o.n.o(mo.o, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z2 && iO != -1) {
            strArrO = com.thinkup.core.common.no.m.o.n.o(strArrO, supportedCipherSuites[iO]);
        }
        return new o(this).o(strArrO).m(strArrO2).m();
    }

    public final boolean o(SSLSocket sSLSocket) {
        if (!this.oo) {
            return false;
        }
        String[] strArr = this.m0;
        if (strArr != null && !com.thinkup.core.common.no.m.o.n.m(com.thinkup.core.common.no.m.o.n.on, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.on;
        return strArr2 == null || com.thinkup.core.common.no.m.o.n.m(mo.o, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    private void o(SSLSocket sSLSocket, boolean z2) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.on != null) {
            enabledCipherSuites = com.thinkup.core.common.no.m.o.n.o(mo.o, sSLSocket.getEnabledCipherSuites(), this.on);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.m0 != null) {
            enabledProtocols = com.thinkup.core.common.no.m.o.n.o(com.thinkup.core.common.no.m.o.n.on, sSLSocket.getEnabledProtocols(), this.m0);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iO = com.thinkup.core.common.no.m.o.n.o(mo.o, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z2 && iO != -1) {
            enabledCipherSuites = com.thinkup.core.common.no.m.o.n.o(enabledCipherSuites, supportedCipherSuites[iO]);
        }
        n0 n0VarM = new o(this).o(enabledCipherSuites).m(enabledProtocols).m();
        String[] strArr = n0VarM.m0;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = n0VarM.on;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }
}
