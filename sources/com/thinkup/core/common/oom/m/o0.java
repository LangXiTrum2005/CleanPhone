package com.thinkup.core.common.oom.m;

import com.thinkup.core.oo.n0;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 implements n {
    @Override // com.thinkup.core.common.oom.m.n
    public final void o(o oVar) {
        m0 m0VarO = oVar.o();
        n0 n0Var = m0VarO.f42294n;
        if (n0Var != null) {
            o(oVar, m0VarO, !n0Var.oonn() && n0Var.on0o());
        } else {
            o(oVar, m0VarO, true);
        }
    }

    private void o(final o oVar, final m0 m0Var, boolean z2) {
        com.thinkup.core.common.om.n.o().o(new com.thinkup.core.common.om.o0() { // from class: com.thinkup.core.common.oom.m.o0.1
            @Override // com.thinkup.core.common.om.o0
            public final void o(String str) {
                oVar.o(m0Var);
            }
        }, z2);
    }
}
