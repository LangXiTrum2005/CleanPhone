package com.thinkup.core.common.no.m;

import com.smartdigimkt.o0.b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class o0n extends onn {
    private static final om0 o = om0.o(b.f37293e);
    private final List<String> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<String> f42066n;

    public static final class o {
        private final List<String> m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Charset f42067n;
        private final List<String> o;

        public o() {
            this(null);
        }

        private o m(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.o.add(oom.o(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, this.f42067n));
            this.m.add(oom.o(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, this.f42067n));
            return this;
        }

        private o o(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.o.add(oom.o(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, this.f42067n));
            this.m.add(oom.o(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, this.f42067n));
            return this;
        }

        private o(Charset charset) {
            this.o = new ArrayList();
            this.m = new ArrayList();
            this.f42067n = charset;
        }

        private o0n o() {
            return new o0n(this.o, this.m);
        }
    }

    public o0n(List<String> list, List<String> list2) {
        this.m = com.thinkup.core.common.no.m.o.n.o(list);
        this.f42066n = com.thinkup.core.common.no.m.o.n.o(list2);
    }

    private int n() {
        return this.m.size();
    }

    private String o(int i2) {
        return this.m.get(i2);
    }

    private String o0(int i2) {
        return oom.o(this.f42066n.get(i2), true);
    }

    @Override // com.thinkup.core.common.no.m.onn
    public final long m() {
        return o((com.thinkup.core.common.no.n.o0) null, true);
    }

    private String m(int i2) {
        return oom.o(this.m.get(i2), true);
    }

    private String n(int i2) {
        return this.f42066n.get(i2);
    }

    @Override // com.thinkup.core.common.no.m.onn
    public final om0 o() {
        return o;
    }

    @Override // com.thinkup.core.common.no.m.onn
    public final void o(com.thinkup.core.common.no.n.o0 o0Var) {
        o(o0Var, false);
    }

    private long o(com.thinkup.core.common.no.n.o0 o0Var, boolean z2) {
        com.thinkup.core.common.no.n.n nVarN;
        if (z2) {
            nVarN = new com.thinkup.core.common.no.n.n();
        } else {
            nVarN = o0Var.n();
        }
        int size = this.m.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                nVarN.n0(38);
            }
            nVarN.m(this.m.get(i2));
            nVarN.n0(61);
            nVarN.m(this.f42066n.get(i2));
        }
        if (!z2) {
            return 0L;
        }
        long jM = nVarN.m();
        nVarN.omm();
        return jM;
    }
}
