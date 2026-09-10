package com.thinkup.core.common.n0.o0.o;

import com.thinkup.core.common.n0.o0.o0;

/* JADX INFO: loaded from: classes6.dex */
public class o extends n {
    private static final String m = "o";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f41971n = 1;

    @Override // com.thinkup.core.common.n0.o0.o.n
    public final synchronized void o(o0 o0Var, o0.o oVar) {
        try {
            int iO = o(this.o.getInputStream());
            if (iO != 1) {
                throw new Exception("Response Error Code:".concat(String.valueOf(iO)));
            }
            if (oVar != null) {
                oVar.o(o0Var);
            }
            o0Var.toString();
        } catch (Throwable th) {
            throw th;
        }
    }
}
