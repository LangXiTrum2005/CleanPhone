package com.thinkup.core.common.no.m;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class omo extends onn {
    private final om0 mm;
    private final om0 mn;
    private final com.thinkup.core.common.no.n.om mo;
    private final List<m> n0;
    private long no = -1;
    public static final om0 o = om0.o("multipart/mixed");
    public static final om0 m = om0.o("multipart/alternative");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final om0 f42071n = om0.o("multipart/digest");
    public static final om0 o0 = om0.o("multipart/parallel");
    public static final om0 oo = om0.o("multipart/form-data");
    private static final byte[] om = {58, 32};
    private static final byte[] on = {13, 10};
    private static final byte[] m0 = {45, 45};

    public static final class m {
        final onn m;
        final ooo o;

        private m(ooo oooVar, onn onnVar) {
            this.o = oooVar;
            this.m = onnVar;
        }

        private onn m() {
            return this.m;
        }

        private static m o(onn onnVar) {
            return o((ooo) null, onnVar);
        }

        public static m o(ooo oooVar, onn onnVar) {
            if (onnVar == null) {
                throw new NullPointerException("body == null");
            }
            if (oooVar != null && oooVar.o("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (oooVar == null || oooVar.o("Content-Length") == null) {
                return new m(oooVar, onnVar);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }

        public static m o(String str, String str2, onn onnVar) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                omo.o(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    omo.o(sb, str2);
                }
                return o(new ooo.o().m("Content-Disposition", sb.toString()).o(), onnVar);
            }
            throw new NullPointerException("name == null");
        }

        private ooo o() {
            return this.o;
        }

        private static m o(String str, String str2) {
            return o(str, null, onn.o((om0) null, str2.getBytes(StandardCharsets.UTF_8)));
        }
    }

    public static final class o {
        private om0 m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List<m> f42072n;
        private final com.thinkup.core.common.no.n.om o;

        public o() {
            this(UUID.randomUUID().toString());
        }

        private o o(om0 om0Var) {
            if (om0Var == null) {
                throw new NullPointerException("type == null");
            }
            if (!om0Var.o().equals("multipart")) {
                throw new IllegalArgumentException("multipart != ".concat(String.valueOf(om0Var)));
            }
            this.m = om0Var;
            return this;
        }

        private o(String str) {
            this.m = omo.o;
            this.f42072n = new ArrayList();
            this.o = com.thinkup.core.common.no.n.om.o(str);
        }

        private o o(ooo oooVar, onn onnVar) {
            return o(m.o(oooVar, onnVar));
        }

        private o o(String str, String str2, onn onnVar) {
            return o(m.o(str, str2, onnVar));
        }

        private o o(m mVar) {
            if (mVar != null) {
                this.f42072n.add(mVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        private omo o() {
            if (!this.f42072n.isEmpty()) {
                return new omo(this.o, this.m, this.f42072n);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        private o o(onn onnVar) {
            return o(m.o((ooo) null, onnVar));
        }

        private o o(String str, String str2) {
            return o(m.o(str, null, onn.o((om0) null, str2.getBytes(StandardCharsets.UTF_8))));
        }
    }

    public omo(com.thinkup.core.common.no.n.om omVar, om0 om0Var, List<m> list) {
        this.mo = omVar;
        this.mm = om0Var;
        this.mn = om0.o(om0Var + "; boundary=" + omVar.o());
        this.n0 = com.thinkup.core.common.no.m.o.n.o(list);
    }

    private om0 n() {
        return this.mm;
    }

    private m o(int i2) {
        return this.n0.get(i2);
    }

    private String o0() {
        return this.mo.o();
    }

    private List<m> om() {
        return this.n0;
    }

    private int oo() {
        return this.n0.size();
    }

    @Override // com.thinkup.core.common.no.m.onn
    public final long m() {
        long j = this.no;
        if (j != -1) {
            return j;
        }
        long jO = o((com.thinkup.core.common.no.n.o0) null, true);
        this.no = jO;
        return jO;
    }

    @Override // com.thinkup.core.common.no.m.onn
    public final om0 o() {
        return this.mn;
    }

    @Override // com.thinkup.core.common.no.m.onn
    public final void o(com.thinkup.core.common.no.n.o0 o0Var) {
        o(o0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long o(com.thinkup.core.common.no.n.o0 o0Var, boolean z2) {
        com.thinkup.core.common.no.n.n nVar;
        if (z2) {
            o0Var = new com.thinkup.core.common.no.n.n();
            nVar = o0Var;
        } else {
            nVar = 0;
        }
        int size = this.n0.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.n0.get(i2);
            ooo oooVar = mVar.o;
            onn onnVar = mVar.m;
            o0Var.o0(m0);
            o0Var.o0(this.mo);
            o0Var.o0(on);
            if (oooVar != null) {
                int iO = oooVar.o();
                for (int i3 = 0; i3 < iO; i3++) {
                    o0Var.m(oooVar.o(i3)).o0(om).m(oooVar.m(i3)).o0(on);
                }
            }
            om0 om0VarO = onnVar.o();
            if (om0VarO != null) {
                o0Var.m("Content-Type: ").m(om0VarO.toString()).o0(on);
            }
            long jM = onnVar.m();
            if (jM != -1) {
                o0Var.m("Content-Length: ").nn(jM).o0(on);
            } else if (z2) {
                nVar.omm();
                return -1L;
            }
            byte[] bArr = on;
            o0Var.o0(bArr);
            if (z2) {
                j += jM;
            } else {
                onnVar.o(o0Var);
            }
            o0Var.o0(bArr);
        }
        byte[] bArr2 = m0;
        o0Var.o0(bArr2);
        o0Var.o0(this.mo);
        o0Var.o0(bArr2);
        o0Var.o0(on);
        if (!z2) {
            return j;
        }
        long jM2 = nVar.m() + j;
        nVar.omm();
        return jM2;
    }

    public static void o(StringBuilder sb, String str) {
        sb.append(AbstractJsonLexerKt.STRING);
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt != '\"') {
                sb.append(cCharAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append(AbstractJsonLexerKt.STRING);
    }
}
