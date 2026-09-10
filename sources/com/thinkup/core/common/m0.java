package com.thinkup.core.common;

import com.thinkup.core.common.on.o0mm;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 {
    private String m;
    private long m0;
    private boolean mm;
    private on mn;
    private long mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o0 f41869n;
    private boolean n0;
    private m o0;
    private boolean om;
    private long on;
    private boolean oo;
    private final String o = com.thinkup.core.n.m0.o;
    private final List<o> no = new CopyOnWriteArrayList();

    public interface m {
        void o(com.thinkup.core.n.o oVar, int i2);
    }

    public class n {
        public n(on onVar) {
            m0.this.mn = onVar;
            if (m0.this.om) {
                com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.common.m0.n.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        m0.this.o();
                    }
                }, m0.this.mo);
            } else {
                m0.this.o();
            }
        }
    }

    public class o {
        private boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private com.thinkup.core.n.o f41870n;
        private int o0;

        public o(com.thinkup.core.n.o oVar, int i2) {
            this.f41870n = oVar;
            this.o0 = i2;
            if (!m0.this.om) {
                o();
                return;
            }
            if (m0.this.n0) {
                synchronized (m0.this.no) {
                    try {
                        m0.this.no.add(this);
                    } catch (Throwable th) {
                        com.thinkup.core.common.oo0.oo.m("prepareBidLoadControllers add error", th.getMessage() + ", " + com.thinkup.core.common.ooo.o00.o(th.getStackTrace()), com.thinkup.core.common.n.o0n.m().o0m());
                    }
                }
            }
            String unused = m0.this.o;
            if (2 == i2) {
                long unused2 = m0.this.on;
            } else {
                long unused3 = m0.this.m0;
            }
            com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.common.m0.o.1
                @Override // java.lang.Runnable
                public final void run() {
                    o.this.o();
                }
            }, 2 == i2 ? m0.this.on : m0.this.m0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void o() {
            try {
                if (!this.m) {
                    this.m = true;
                    String unused = m0.this.o;
                    if (2 == this.o0) {
                        long unused2 = m0.this.on;
                    } else {
                        long unused3 = m0.this.m0;
                    }
                    if (m0.this.o0 != null) {
                        m0.this.o0.o(this.f41870n, this.o0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public interface o0 {
        void o(on onVar);
    }

    public m0(String str) {
        this.m = str;
    }

    public final void m() {
        if (!this.n0) {
            return;
        }
        synchronized (this.no) {
            try {
                try {
                    List<o> list = this.no;
                    if (list != null && !list.isEmpty()) {
                        for (o oVar : this.no) {
                            if (oVar != null) {
                                oVar.o();
                            }
                        }
                    }
                } catch (Throwable th) {
                    com.thinkup.core.common.oo0.oo.m("callAnotherBiddingByOnlyBid error", th.getMessage() + ", " + com.thinkup.core.common.ooo.o00.o(th.getStackTrace()), com.thinkup.core.common.n.o0n.m().o0m());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final long n() {
        if (this.om) {
            return Math.max(this.m0, this.on);
        }
        return 0L;
    }

    public final boolean o0() {
        return this.oo;
    }

    public final boolean oo() {
        return this.om;
    }

    public final void o(com.thinkup.core.oo.n0 n0Var, boolean z2) {
        if (n0Var == null) {
            this.om = false;
            return;
        }
        this.n0 = z2;
        this.om = n0Var.m() == 1;
        this.on = n0Var.oo();
        this.m0 = n0Var.om();
        this.mo = n0Var.o0();
        if (this.om) {
            return;
        }
        this.on = 0L;
        this.m0 = 0L;
        this.mo = 0L;
    }

    private static boolean o(List<o0mm> list, o0mm o0mmVar) {
        return list == null || list.isEmpty() || com.thinkup.core.common.ooo.mn.o(o0mmVar, list.get(0)) == -1;
    }

    public final void o(on onVar) {
        this.oo = true;
        new n(onVar);
    }

    public final synchronized void o() {
        try {
            o0 o0Var = this.f41869n;
            if (o0Var != null && !this.mm) {
                o0Var.o(this.mn);
            }
            this.mm = true;
            this.oo = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void o(com.thinkup.core.n.o oVar, int i2) {
        if (oVar != null) {
            new o(oVar, i2);
        }
    }

    public final void o(o0 o0Var) {
        this.f41869n = o0Var;
    }

    public final void o(m mVar) {
        this.o0 = mVar;
    }

    private void o(boolean z2) {
        this.om = z2;
    }
}
