package com.thinkup.core.common.oom.o.o;

import android.content.Context;
import com.thinkup.core.common.on.m0m;
import com.thinkup.core.common.on.m0o;
import com.thinkup.core.oo.n0;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class oo implements com.thinkup.core.common.oom.o.m.oo {
    private static final String o = "oo";
    private final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.thinkup.core.common.oom.o.m.n f42306n;
    private final com.thinkup.core.common.oom.o.m.o0 o0;
    private boolean om;
    private long oo;

    public oo(String str, com.thinkup.core.common.oom.o.m.n nVar, com.thinkup.core.common.oom.o.m.o0 o0Var) {
        this.m = str;
        this.f42306n = nVar;
        this.o0 = o0Var;
    }

    @Override // com.thinkup.core.common.oom.o.m.m
    public final void m() {
        this.om = false;
        this.oo = 0L;
    }

    @Override // com.thinkup.core.common.oom.o.m.oo
    public final void o(final Context context, final n0 n0Var, final com.thinkup.core.common.oom.o.m.o oVar) {
        if (n0Var == null) {
            oVar.o();
            return;
        }
        final m0o m0oVarOnno = n0Var.onno();
        boolean z2 = m0oVarOnno == null || m0oVarOnno.o();
        boolean z3 = m0oVarOnno != null && m0oVarOnno.o(this.oo);
        if (z2 || z3) {
            if (z2 && this.om) {
                this.om = false;
                o0.o(this.m);
            }
            oVar.o();
            return;
        }
        this.om = true;
        this.oo = System.currentTimeMillis();
        com.thinkup.core.common.oom.o.m.n nVar = this.f42306n;
        if (nVar != null) {
            nVar.o(m0oVarOnno);
        }
        final boolean zN = m0oVarOnno.n();
        if (!zN) {
            oVar.o();
        }
        com.thinkup.core.common.ooo.m.m.o().n(new Runnable() { // from class: com.thinkup.core.common.oom.o.o.oo.1
            @Override // java.lang.Runnable
            public final void run() {
                oo.o(oo.this, context, n0Var, oVar, m0oVarOnno).o(zN);
            }
        }, 13);
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.oom.o.o.oo$2, reason: invalid class name */
    public class AnonymousClass2 implements com.thinkup.core.common.oom.o.n.o.InterfaceC0686o {
        final /* synthetic */ com.thinkup.core.common.oom.o.m.o m;
        final /* synthetic */ m0o o;

        public AnonymousClass2(m0o m0oVar, com.thinkup.core.common.oom.o.m.o oVar) {
            this.o = m0oVar;
            this.m = oVar;
        }

        @Override // com.thinkup.core.common.oom.o.n.o.InterfaceC0686o
        public final void o(List<m0m> list, boolean z2) {
            this.o.o(list);
            com.thinkup.core.common.oom.o.m.o oVar = this.m;
            if (oVar == null || !z2) {
                return;
            }
            oVar.o();
        }

        @Override // com.thinkup.core.common.oom.o.n.o.InterfaceC0686o
        public final void o(boolean z2) {
            com.thinkup.core.common.oom.o.m.o oVar = this.m;
            if (oVar == null || !z2) {
                return;
            }
            oVar.o();
        }
    }

    private com.thinkup.core.common.oom.o.n.o o(Context context, n0 n0Var, com.thinkup.core.common.oom.o.m.o oVar, m0o m0oVar) {
        com.thinkup.core.common.oom.o.n.o oVar2 = new com.thinkup.core.common.oom.o.n.o(context, n0Var, m0oVar, this.o0);
        oVar2.o(new AnonymousClass2(m0oVar, oVar));
        return oVar2;
    }

    public static /* synthetic */ com.thinkup.core.common.oom.o.n.o o(oo ooVar, Context context, n0 n0Var, com.thinkup.core.common.oom.o.m.o oVar, m0o m0oVar) {
        com.thinkup.core.common.oom.o.n.o oVar2 = new com.thinkup.core.common.oom.o.n.o(context, n0Var, m0oVar, ooVar.o0);
        oVar2.o(ooVar.new AnonymousClass2(m0oVar, oVar));
        return oVar2;
    }
}
