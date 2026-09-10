package com.thinkup.core.common.no.m.o.n;

import android.support.v4.media.a;
import com.thinkup.core.common.no.m.m00;
import com.thinkup.core.common.no.m.onm;
import com.thinkup.core.common.no.m.oon;
import com.thinkup.core.common.no.n.nm;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements oon {
    private final boolean o;

    public m(boolean z2) {
        this.o = z2;
    }

    @Override // com.thinkup.core.common.no.m.oon
    public final m00 o(oon.o oVar) throws IOException {
        on onVar = (on) oVar;
        com.thinkup.core.common.no.m.o.m.n nVarM0 = onVar.m0();
        onm onmVarO = onVar.o();
        long jCurrentTimeMillis = System.currentTimeMillis();
        nVarM0.o(onmVarO);
        m00.o oVarO = null;
        if (!om.n(onmVarO.m()) || onmVarO.o0() == null) {
            nVarM0.mm();
        } else {
            if ("100-continue".equalsIgnoreCase(onmVarO.o("Expect"))) {
                nVarM0.n();
                oVarO = nVarM0.o(true);
            }
            if (oVarO == null) {
                onmVarO.o0();
                com.thinkup.core.common.no.n.o0 o0VarO = nm.o(nVarM0.m(onmVarO));
                onmVarO.o0().o(o0VarO);
                o0VarO.close();
            } else {
                nVarM0.mm();
                if (!nVarM0.o().on()) {
                    nVarM0.m0();
                }
            }
        }
        if (onmVarO.o0() != null) {
            onmVarO.o0();
        }
        nVarM0.o0();
        if (oVarO == null) {
            oVarO = nVarM0.o(false);
        }
        m00 m00VarO = oVarO.o(onmVarO).o(nVarM0.o().n()).o(jCurrentTimeMillis).m(System.currentTimeMillis()).o();
        int iN = m00VarO.n();
        if (iN == 100) {
            m00VarO = nVarM0.o(false).o(onmVarO).o(nVarM0.o().n()).o(jCurrentTimeMillis).m(System.currentTimeMillis()).o();
            iN = m00VarO.n();
        }
        m00 m00VarO2 = (this.o && iN == 101) ? m00VarO.m0().o(com.thinkup.core.common.no.m.o.n.o0).o() : m00VarO.m0().o(nVarM0.o(m00VarO)).o();
        if ("close".equalsIgnoreCase(m00VarO2.o().o("Connection")) || "close".equalsIgnoreCase(m00VarO2.o("Connection"))) {
            nVarM0.m0();
        }
        if ((iN != 204 && iN != 205) || m00VarO2.on().m() <= 0) {
            return m00VarO2;
        }
        StringBuilder sbU = a.u(iN, "HTTP ", " had non-zero Content-Length: ");
        sbU.append(m00VarO2.on().m());
        throw new ProtocolException(sbU.toString());
    }
}
