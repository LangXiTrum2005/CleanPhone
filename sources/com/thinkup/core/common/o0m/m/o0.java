package com.thinkup.core.common.o0m.m;

import com.thinkup.core.common.o0m.o.m0;

/* JADX INFO: loaded from: classes6.dex */
public class o0 {
    private static volatile boolean o = false;

    public static class o implements com.thinkup.core.common.o0m.o.o.n {
        @Override // com.thinkup.core.common.o0m.o.o.n
        public final void m(String str, Exception exc) {
            exc.getMessage();
        }

        @Override // com.thinkup.core.common.o0m.o.o.n
        public final void o(String str, String str2) {
        }

        @Override // com.thinkup.core.common.o0m.o.o.n
        public final void o(String str, Exception exc) {
            exc.getMessage();
        }
    }

    public static om m(com.thinkup.core.common.o0m.n nVar) {
        if (nVar != null) {
            return new om(nVar);
        }
        return null;
    }

    public static com.thinkup.core.common.o0m.o n(com.thinkup.core.common.o0m.n nVar) {
        if (nVar != null) {
            return new oo(nVar);
        }
        return null;
    }

    private static void o() {
        if (o) {
            return;
        }
        o = true;
        m0.o(com.thinkup.core.common.ooo.m.m.o().m());
        m0.o(new o());
    }

    public static n o(com.thinkup.core.common.o0m.n nVar) {
        if (nVar == null) {
            return null;
        }
        if (!o) {
            o = true;
            m0.o(com.thinkup.core.common.ooo.m.m.o().m());
            m0.o(new o());
        }
        return new n(nVar);
    }
}
