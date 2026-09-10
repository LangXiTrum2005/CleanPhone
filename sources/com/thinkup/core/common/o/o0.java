package com.thinkup.core.common.o;

import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.o00;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class o0 {
    private static volatile o0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.thinkup.core.common.oo.mo f42125n;
    final String o = o0.class.getName();
    private com.thinkup.core.common.oo.m0 o0;

    private o0() {
        if (o0n.m().on() != null) {
            this.f42125n = com.thinkup.core.common.oo.mo.o(com.thinkup.core.common.oo.oo.o(o0n.m().on()));
            this.o0 = com.thinkup.core.common.oo.m0.o(com.thinkup.core.common.oo.oo.o(o0n.m().on()));
        }
    }

    private void n(final o00 o00Var) {
        if (o00Var.mnm() != 1) {
            o00Var.mnm();
        } else if (o00Var.oom() != 1 && o00Var.oom() != 4) {
            o00Var.oom();
        } else {
            o0n.m();
            o0n.n(new Runnable() { // from class: com.thinkup.core.common.o.o0.4
                @Override // java.lang.Runnable
                public final void run() {
                    o00Var.mn0();
                    mn mnVar = new mn();
                    mnVar.o = o00Var.mmn();
                    mnVar.m = o00Var.mn0();
                    mnVar.f42113n = o00Var.oo0();
                    o0.this.o0.o(mnVar);
                }
            });
        }
    }

    private void m(final o00 o00Var) {
        o00Var.mn0();
        o0n.m();
        o0n.n(new Runnable() { // from class: com.thinkup.core.common.o.o0.2
            @Override // java.lang.Runnable
            public final void run() {
                n0 n0Var = new n0();
                n0Var.o = o00Var.mmn();
                n0Var.m = o00Var.mn0();
                n0Var.f42118n = o00Var.mno();
                n0Var.o0 = 1;
                o0.this.f42125n.m(n0Var);
            }
        });
    }

    private static o0 o() {
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

    private void m() {
        o0n.m();
        o0n.n(new Runnable() { // from class: com.thinkup.core.common.o.o0.3
            @Override // java.lang.Runnable
            public final void run() {
                o0.this.f42125n.o();
            }
        });
    }

    private List<mm> m(int i2) {
        return this.o0.o(i2);
    }

    private void o(final o00 o00Var) {
        o00Var.mn0();
        o0n.m();
        o0n.n(new Runnable() { // from class: com.thinkup.core.common.o.o0.1
            @Override // java.lang.Runnable
            public final void run() {
                n0 n0Var = new n0();
                n0Var.o = o00Var.mmn();
                n0Var.m = o00Var.mn0();
                n0Var.f42118n = o00Var.mno();
                n0Var.o0 = 0;
                o0.this.f42125n.o(n0Var);
            }
        });
    }

    private List<mm> o(int i2) {
        return this.f42125n.o(i2);
    }
}
