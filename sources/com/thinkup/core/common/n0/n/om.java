package com.thinkup.core.common.n0.n;

import android.content.Context;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public final class om extends o0 {
    private static final long om = 3600000;
    private static final int oo = 5;
    private volatile m0 on;

    public om(Context context) {
        super(context);
    }

    @Override // com.thinkup.core.common.n0.n.o0
    public final boolean m(com.thinkup.core.common.n0.m.o0 o0Var) {
        Context context = this.m;
        return context != null && o0Var != null && o00.o(context) && "eu_traffic".equals(o0Var.m());
    }

    @Override // com.thinkup.core.common.n0.n.o0
    public final String n(com.thinkup.core.common.n0.m.o0 o0Var) {
        return this.on != null ? m0.o(o0Var) : o0Var.m();
    }

    @Override // com.thinkup.core.common.n0.n.o0, com.thinkup.core.common.n0.n.mo
    public final com.thinkup.core.common.n0.m.om o(com.thinkup.core.common.n0.m.o0 o0Var) {
        if (!m(o0Var)) {
            return null;
        }
        if (this.on == null) {
            synchronized (this.o0) {
                try {
                    if (this.on == null) {
                        this.on = new m0(this.m, this.f41949n, new m0.o(3600000L));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.on.o(o0Var, super.o(o0Var));
    }

    @Override // com.thinkup.core.common.n0.n.mo
    public final void o(com.thinkup.core.common.n0.m.om omVar, com.thinkup.core.common.n0.m.o0 o0Var) {
        if (m(o0Var) && this.on != null) {
            this.on.o(omVar, o0Var);
        }
    }
}
