package com.thinkup.core.common.n0.o.o;

import com.thinkup.core.common.n0.o.mo;
import com.thinkup.core.common.no.m.mn;
import com.thinkup.core.common.no.m.o00;
import com.thinkup.core.common.no.m.o0o;
import com.thinkup.core.common.no.m.omm;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class o0 {
    private static volatile o0 m = null;
    private static final String o = "o0";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile omm f41961n;
    private volatile omm o0;
    private final mn oo = new mn(10, TimeUnit.MINUTES);

    public static class o implements o0o {
        private final com.thinkup.core.common.n0.o.o0 m;

        public o(com.thinkup.core.common.n0.o.o0 o0Var) {
            this.m = o0Var;
        }

        @Override // com.thinkup.core.common.no.m.o0o
        public final List<InetAddress> o(String str) {
            com.thinkup.core.common.n0.o.o0 o0Var = this.m;
            return o0Var != null ? o0Var.o(str) : o0o.o.o(str);
        }
    }

    private o0() {
    }

    public static o0 o() {
        if (m == null) {
            synchronized (o0.class) {
                try {
                    if (m == null) {
                        m = new o0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public final synchronized omm o(com.thinkup.core.common.n0.o.om omVar, mo moVar) {
        omm ommVar;
        try {
            com.thinkup.core.common.n0.o.o0 o0Var = omVar.mo;
            if (o0Var != null) {
                if (this.o0 == null) {
                    this.o0 = new omm.o().n(omVar.f41963n, omVar.o0).m(omVar.o, omVar.m).o(omVar.oo, omVar.om).o(this.oo).o(new o00(omVar.on)).o(new o(o0Var)).o();
                } else {
                    this.o0 = this.o0.oo0().o(new o(o0Var)).o();
                }
                ommVar = this.o0;
                String str = moVar.o;
            } else {
                ommVar = null;
            }
            if (ommVar == null) {
                if (this.f41961n == null) {
                    this.f41961n = new omm.o().n(omVar.f41963n, omVar.o0).m(omVar.o, omVar.m).o(omVar.oo, omVar.om).o(this.oo).o(new o00(omVar.on)).o();
                }
                ommVar = this.f41961n;
                String str2 = moVar.o;
            }
        } catch (Throwable th) {
            throw th;
        }
        return ommVar;
    }
}
