package com.thinkup.core.common.no.m.o.oo;

import com.thinkup.core.common.no.m.m00;
import com.thinkup.core.common.no.m.omm;
import com.thinkup.core.common.no.m.on0;
import com.thinkup.core.common.no.m.onm;
import com.thinkup.core.common.no.m.oon;
import com.thinkup.core.common.no.m.ooo;
import com.thinkup.core.common.no.n.oom;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class on implements com.thinkup.core.common.no.m.o.n.n {
    private final oon.o n0;
    private final om nm;
    private volatile mo nn;
    private final com.thinkup.core.common.no.m.o.m.oo no;
    private final on0 o00;
    private volatile boolean o0o;
    private static final String m = "connection";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42061n = "host";
    private static final String o0 = "keep-alive";
    private static final String oo = "proxy-connection";
    private static final String on = "te";
    private static final String om = "transfer-encoding";
    private static final String m0 = "encoding";
    private static final String mo = "upgrade";
    private static final List<String> mm = com.thinkup.core.common.no.m.o.n.o(m, f42061n, o0, oo, on, om, m0, mo, ":method", ":path", ":scheme", ":authority");
    private static final List<String> mn = com.thinkup.core.common.no.m.o.n.o(m, f42061n, o0, oo, on, om, m0, mo);

    public on(omm ommVar, com.thinkup.core.common.no.m.o.m.oo ooVar, oon.o oVar, om omVar) {
        this.no = ooVar;
        this.n0 = oVar;
        this.nm = omVar;
        List<on0> listO0o = ommVar.o0o();
        on0 on0Var = on0.H2_PRIOR_KNOWLEDGE;
        this.o00 = listO0o.contains(on0Var) ? on0Var : on0.HTTP_2;
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final void m() {
        this.nm.o0m.m();
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final void n() {
        this.nn.om().close();
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final com.thinkup.core.common.no.m.o.m.oo o() {
        return this.no;
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final ooo o0() {
        return this.nn.o0();
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final void oo() {
        this.o0o = true;
        if (this.nn != null) {
            this.nn.o(m.CANCEL);
        }
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final oom o(onm onmVar, long j) {
        return this.nn.om();
    }

    private static List<n> m(onm onmVar) {
        ooo oooVarN = onmVar.n();
        ArrayList arrayList = new ArrayList(oooVarN.o() + 4);
        arrayList.add(new n(n.m0, onmVar.m()));
        arrayList.add(new n(n.mo, com.thinkup.core.common.no.m.o.n.mo.o(onmVar.o())));
        String strO = onmVar.o("Host");
        if (strO != null) {
            arrayList.add(new n(n.mn, strO));
        }
        arrayList.add(new n(n.mm, onmVar.o().m()));
        int iO = oooVarN.o();
        for (int i2 = 0; i2 < iO; i2++) {
            String lowerCase = oooVarN.o(i2).toLowerCase(Locale.US);
            if (!mm.contains(lowerCase) || (lowerCase.equals(on) && oooVarN.m(i2).equals("trailers"))) {
                arrayList.add(new n(lowerCase, oooVarN.m(i2)));
            }
        }
        return arrayList;
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final void o(onm onmVar) throws IOException {
        if (this.nn != null) {
            return;
        }
        boolean z2 = onmVar.o0() != null;
        ooo oooVarN = onmVar.n();
        ArrayList arrayList = new ArrayList(oooVarN.o() + 4);
        arrayList.add(new n(n.m0, onmVar.m()));
        arrayList.add(new n(n.mo, com.thinkup.core.common.no.m.o.n.mo.o(onmVar.o())));
        String strO = onmVar.o("Host");
        if (strO != null) {
            arrayList.add(new n(n.mn, strO));
        }
        arrayList.add(new n(n.mm, onmVar.o().m()));
        int iO = oooVarN.o();
        for (int i2 = 0; i2 < iO; i2++) {
            String lowerCase = oooVarN.o(i2).toLowerCase(Locale.US);
            if (!mm.contains(lowerCase) || (lowerCase.equals(on) && oooVarN.m(i2).equals("trailers"))) {
                arrayList.add(new n(lowerCase, oooVarN.m(i2)));
            }
        }
        this.nn = this.nm.o(arrayList, z2);
        if (!this.o0o) {
            mo.n nVar = this.nn.om;
            long jOo = this.n0.oo();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            nVar.o(jOo, timeUnit);
            this.nn.on.o(this.n0.om(), timeUnit);
            return;
        }
        this.nn.o(m.CANCEL);
        throw new IOException("Canceled");
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final com.thinkup.core.common.no.n.oon m(m00 m00Var) {
        return this.nn.oo();
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final m00.o o(boolean z2) throws IOException {
        ooo oooVarN = this.nn.n();
        on0 on0Var = this.o00;
        ooo.o oVar = new ooo.o();
        int iO = oooVarN.o();
        com.thinkup.core.common.no.m.o.n.mn mnVarO = null;
        for (int i2 = 0; i2 < iO; i2++) {
            String strO = oooVarN.o(i2);
            String strM = oooVarN.m(i2);
            if (strO.equals(":status")) {
                mnVarO = com.thinkup.core.common.no.m.o.n.mn.o("HTTP/1.1 ".concat(String.valueOf(strM)));
            } else if (!mn.contains(strO)) {
                com.thinkup.core.common.no.m.o.o.o.o(oVar, strO, strM);
            }
        }
        if (mnVarO != null) {
            m00.o oVarO = new m00.o().o(on0Var).o(mnVarO.oo).o(mnVarO.om).o(oVar.o());
            if (z2 && com.thinkup.core.common.no.m.o.o.o.o(oVarO) == 100) {
                return null;
            }
            return oVarO;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    private static m00.o o(ooo oooVar, on0 on0Var) throws ProtocolException {
        ooo.o oVar = new ooo.o();
        int iO = oooVar.o();
        com.thinkup.core.common.no.m.o.n.mn mnVarO = null;
        for (int i2 = 0; i2 < iO; i2++) {
            String strO = oooVar.o(i2);
            String strM = oooVar.m(i2);
            if (strO.equals(":status")) {
                mnVarO = com.thinkup.core.common.no.m.o.n.mn.o("HTTP/1.1 ".concat(String.valueOf(strM)));
            } else if (!mn.contains(strO)) {
                com.thinkup.core.common.no.m.o.o.o.o(oVar, strO, strM);
            }
        }
        if (mnVarO != null) {
            return new m00.o().o(on0Var).o(mnVarO.oo).o(mnVarO.om).o(oVar.o());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // com.thinkup.core.common.no.m.o.n.n
    public final long o(m00 m00Var) {
        return com.thinkup.core.common.no.m.o.n.oo.o(m00Var);
    }
}
