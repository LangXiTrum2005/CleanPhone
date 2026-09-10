package com.thinkup.core.common.no.m.o.o;

import com.smartdigimkt.o0.b;
import com.thinkup.core.common.no.m.m00;
import com.thinkup.core.common.no.m.m0o;
import com.thinkup.core.common.no.m.o.n.m0;
import com.thinkup.core.common.no.m.on0;
import com.thinkup.core.common.no.m.onm;
import com.thinkup.core.common.no.m.oon;
import com.thinkup.core.common.no.m.ooo;
import com.thinkup.core.common.no.n.nm;
import com.thinkup.core.common.no.n.om0;
import com.thinkup.core.common.no.n.oom;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements oon {
    final om o;

    /* JADX INFO: renamed from: com.thinkup.core.common.no.m.o.o.o$1, reason: invalid class name */
    public class AnonymousClass1 implements com.thinkup.core.common.no.n.oon {
        final /* synthetic */ com.thinkup.core.common.no.n.oo m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ m f42032n;
        boolean o;
        final /* synthetic */ com.thinkup.core.common.no.n.o0 o0;

        public AnonymousClass1(com.thinkup.core.common.no.n.oo ooVar, m mVar, com.thinkup.core.common.no.n.o0 o0Var) {
            this.m = ooVar;
            this.f42032n = mVar;
            this.o0 = o0Var;
        }

        @Override // com.thinkup.core.common.no.n.oon
        public final long a_(com.thinkup.core.common.no.n.n nVar, long j) throws IOException {
            try {
                long jA_ = this.m.a_(nVar, j);
                if (jA_ != -1) {
                    nVar.o(this.o0.n(), nVar.m() - jA_, jA_);
                    this.o0.omn();
                    return jA_;
                }
                if (!this.o) {
                    this.o = true;
                    this.o0.close();
                }
                return -1L;
            } catch (IOException e2) {
                if (this.o) {
                    throw e2;
                }
                this.o = true;
                this.f42032n.o();
                throw e2;
            }
        }

        @Override // com.thinkup.core.common.no.n.oon, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.o && !com.thinkup.core.common.no.m.o.n.o(this, TimeUnit.MILLISECONDS)) {
                this.o = true;
                this.f42032n.o();
            }
            this.m.close();
        }

        @Override // com.thinkup.core.common.no.n.oon
        public final om0 o() {
            return this.m.o();
        }
    }

    public o(om omVar) {
        this.o = omVar;
    }

    private static boolean m(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    @Override // com.thinkup.core.common.no.m.oon
    public final m00 o(oon.o oVar) {
        oom oomVarM;
        om omVar = this.o;
        m00 m00VarO = omVar != null ? omVar.o(oVar.o()) : null;
        n nVarO = new n.o(System.currentTimeMillis(), oVar.o(), m00VarO).o();
        onm onmVar = nVarO.o;
        m00 m00Var = nVarO.m;
        om omVar2 = this.o;
        if (omVar2 != null) {
            omVar2.o(nVarO);
        }
        if (m00VarO != null && m00Var == null) {
            com.thinkup.core.common.no.m.o.n.o(m00VarO.on());
        }
        if (onmVar == null && m00Var == null) {
            return new m00.o().o(oVar.o()).o(on0.HTTP_1_1).o(504).o("Unsatisfiable Request (only-if-cached)").o(com.thinkup.core.common.no.m.o.n.o0).o(-1L).m(System.currentTimeMillis()).o();
        }
        if (onmVar == null) {
            return m00Var.m0().m(o(m00Var)).o();
        }
        try {
            m00 m00VarO2 = oVar.o(onmVar);
            if (m00VarO2 == null && m00VarO != null) {
                com.thinkup.core.common.no.m.o.n.o(m00VarO.on());
            }
            if (m00Var != null) {
                if (m00VarO2.n() == 304) {
                    m00.o oVarM0 = m00Var.m0();
                    ooo oooVarOm = m00Var.om();
                    ooo oooVarOm2 = m00VarO2.om();
                    ooo.o oVar2 = new ooo.o();
                    int iO = oooVarOm.o();
                    for (int i2 = 0; i2 < iO; i2++) {
                        String strO = oooVarOm.o(i2);
                        String strM = oooVarOm.m(i2);
                        if ((!"Warning".equalsIgnoreCase(strO) || !strM.startsWith("1")) && (m(strO) || !o(strO) || oooVarOm2.o(strO) == null)) {
                            com.thinkup.core.common.no.m.o.o.o.o(oVar2, strO, strM);
                        }
                    }
                    int iO2 = oooVarOm2.o();
                    for (int i3 = 0; i3 < iO2; i3++) {
                        String strO2 = oooVarOm2.o(i3);
                        if (!m(strO2) && o(strO2)) {
                            com.thinkup.core.common.no.m.o.o.o.o(oVar2, strO2, oooVarOm2.m(i3));
                        }
                    }
                    m00 m00VarO3 = oVarM0.o(oVar2.o()).o(m00VarO2.n0()).m(m00VarO2.no()).m(o(m00Var)).o(o(m00VarO2)).o();
                    m00VarO2.on().close();
                    this.o.o();
                    this.o.o(m00Var, m00VarO3);
                    return m00VarO3;
                }
                com.thinkup.core.common.no.m.o.n.o(m00Var.on());
            }
            m00 m00VarO4 = m00VarO2.m0().m(o(m00Var)).o(o(m00VarO2)).o();
            if (this.o != null) {
                if (com.thinkup.core.common.no.m.o.n.oo.o0(m00VarO4) && n.o(m00VarO4, onmVar)) {
                    m mVarO = this.o.o(m00VarO4);
                    if (mVarO != null && (oomVarM = mVarO.m()) != null) {
                        return m00VarO4.m0().o(new m0(m00VarO4.o("Content-Type"), m00VarO4.on().m(), nm.o(new AnonymousClass1(m00VarO4.on().n(), mVarO, nm.o(oomVarM))))).o();
                    }
                } else if (com.thinkup.core.common.no.m.o.n.om.o(onmVar.m())) {
                    try {
                        this.o.m(onmVar);
                    } catch (IOException unused) {
                    }
                }
            }
            return m00VarO4;
        } catch (Throwable th) {
            if (m00VarO != null) {
                com.thinkup.core.common.no.m.o.n.o(m00VarO.on());
            }
            throw th;
        }
    }

    private static m00 o(m00 m00Var) {
        return (m00Var == null || m00Var.on() == null) ? m00Var : m00Var.m0().o((m0o) null).o();
    }

    private m00 o(m mVar, m00 m00Var) {
        oom oomVarM;
        if (mVar == null || (oomVarM = mVar.m()) == null) {
            return m00Var;
        }
        return m00Var.m0().o(new m0(m00Var.o("Content-Type"), m00Var.on().m(), nm.o(new AnonymousClass1(m00Var.on().n(), mVar, nm.o(oomVarM))))).o();
    }

    private static ooo o(ooo oooVar, ooo oooVar2) {
        ooo.o oVar = new ooo.o();
        int iO = oooVar.o();
        for (int i2 = 0; i2 < iO; i2++) {
            String strO = oooVar.o(i2);
            String strM = oooVar.m(i2);
            if ((!"Warning".equalsIgnoreCase(strO) || !strM.startsWith("1")) && (m(strO) || !o(strO) || oooVar2.o(strO) == null)) {
                com.thinkup.core.common.no.m.o.o.o.o(oVar, strO, strM);
            }
        }
        int iO2 = oooVar2.o();
        for (int i3 = 0; i3 < iO2; i3++) {
            String strO2 = oooVar2.o(i3);
            if (!m(strO2) && o(strO2)) {
                com.thinkup.core.common.no.m.o.o.o.o(oVar, strO2, oooVar2.m(i3));
            }
        }
        return oVar.o();
    }

    private static boolean o(String str) {
        return ("Connection".equalsIgnoreCase(str) || b.f37292c.equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
