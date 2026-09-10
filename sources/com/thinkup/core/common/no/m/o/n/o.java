package com.thinkup.core.common.no.m.o.n;

import com.p004ironsource.dc;
import com.smartdigimkt.o0.b;
import com.thinkup.core.common.no.m.m00;
import com.thinkup.core.common.no.m.nm;
import com.thinkup.core.common.no.m.no;
import com.thinkup.core.common.no.m.om0;
import com.thinkup.core.common.no.m.onm;
import com.thinkup.core.common.no.m.onn;
import com.thinkup.core.common.no.m.oon;
import com.thinkup.core.common.no.n.n0;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements oon {
    private final nm o;

    public o(nm nmVar) {
        this.o = nmVar;
    }

    @Override // com.thinkup.core.common.no.m.oon
    public final m00 o(oon.o oVar) {
        onm onmVarO = oVar.o();
        onm.o oVarOo = onmVarO.oo();
        onn onnVarO0 = onmVarO.o0();
        if (onnVarO0 != null) {
            om0 om0VarO = onnVarO0.o();
            if (om0VarO != null) {
                oVarOo.o("Content-Type", om0VarO.toString());
            }
            long jM = onnVarO0.m();
            if (jM != -1) {
                oVarOo.o("Content-Length", Long.toString(jM));
                oVarOo.m("Transfer-Encoding");
            } else {
                oVarOo.o("Transfer-Encoding", "chunked");
                oVarOo.m("Content-Length");
            }
        }
        if (onmVarO.o("Host") == null) {
            oVarOo.o("Host", com.thinkup.core.common.no.m.o.n.o(onmVarO.o(), false));
        }
        if (onmVarO.o("Connection") == null) {
            oVarOo.o("Connection", b.f37292c);
        }
        nm nmVar = this.o;
        onmVarO.o();
        List<no> listM = nmVar.m();
        if (!listM.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = listM.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0) {
                    sb.append("; ");
                }
                no noVar = listM.get(i2);
                sb.append(noVar.o());
                sb.append(dc.T);
                sb.append(noVar.m());
            }
            oVarOo.o("Cookie", sb.toString());
        }
        m00 m00VarO = oVar.o(oVarOo.m());
        oo.o(this.o, onmVarO.o(), m00VarO.om());
        m00.o oVarO = m00VarO.m0().o(onmVarO);
        if (b.d.equalsIgnoreCase(m00VarO.o("Content-Encoding")) && oo.o0(m00VarO)) {
            n0 n0Var = new n0(m00VarO.on().n());
            oVarO.o(m00VarO.om().m().m("Content-Encoding").m("Content-Length").o());
            oVarO.o(new m0(m00VarO.o("Content-Type"), -1L, com.thinkup.core.common.no.n.nm.o(n0Var)));
        }
        return oVarO.o();
    }

    private static String o(List<no> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                sb.append("; ");
            }
            no noVar = list.get(i2);
            sb.append(noVar.o());
            sb.append(dc.T);
            sb.append(noVar.m());
        }
        return sb.toString();
    }
}
