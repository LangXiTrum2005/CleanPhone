package com.thinkup.core.common.n0.n;

import android.content.Context;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public final class oo extends o0 {
    private static final int oo = 5;
    private volatile m0 om;

    public oo(Context context) {
        super(context);
    }

    @Override // com.thinkup.core.common.n0.n.o0
    public final boolean m(com.thinkup.core.common.n0.m.o0 o0Var) {
        Context context = this.m;
        return context != null && o0Var != null && o00.o(context) && "get_cdn_domain".equals(o0Var.m());
    }

    @Override // com.thinkup.core.common.n0.n.o0
    public final String n(com.thinkup.core.common.n0.m.o0 o0Var) {
        return this.om != null ? m0.o(o0Var) : o0Var.m();
    }

    @Override // com.thinkup.core.common.n0.n.o0, com.thinkup.core.common.n0.n.mo
    public final com.thinkup.core.common.n0.m.om o(com.thinkup.core.common.n0.m.o0 o0Var) {
        if (!m(o0Var)) {
            return null;
        }
        if (this.om == null) {
            synchronized (this.o0) {
                try {
                    if (this.om == null) {
                        com.thinkup.core.common.om.n.o();
                        m0.o oVar = new m0.o(com.thinkup.core.common.om.n.n() ? com.thinkup.core.common.om.n.m : 86400000L);
                        oVar.f41948n = false;
                        this.om = new m0(this.m, this.f41949n, oVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.om.o(o0Var, super.o(o0Var));
    }

    @Override // com.thinkup.core.common.n0.n.mo
    public final void o(com.thinkup.core.common.n0.m.om omVar, com.thinkup.core.common.n0.m.o0 o0Var) {
        if (m(o0Var) && this.om != null) {
            this.om.o(omVar, o0Var);
        }
    }
}
