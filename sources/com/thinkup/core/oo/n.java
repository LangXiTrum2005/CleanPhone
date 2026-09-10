package com.thinkup.core.oo;

import android.content.Context;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.a;
import com.thinkup.core.api.ErrorCode;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    private static final String o = "n";

    public static void m(Context context, com.thinkup.core.common.on.oo0 oo0Var, com.thinkup.core.common.n0.o0o o0oVar) {
        if (context == null) {
            return;
        }
        new com.thinkup.core.common.n0.mm(context, oo0Var).o(0, o0oVar);
    }

    public final void o(final Context context, final com.thinkup.core.common.on.oo0 oo0Var, com.thinkup.core.common.n0.o0o o0oVar) {
        if (context == null) {
            return;
        }
        com.thinkup.core.common.n.o0n.m().mnn();
        if (oo0Var.oo()) {
            com.thinkup.core.common.om.n.o();
            if (com.thinkup.core.common.om.n.n()) {
                final com.thinkup.core.common.n0.nm nmVar = new com.thinkup.core.common.n0.nm(o0oVar);
                com.thinkup.core.common.mo.o();
                String strM = com.thinkup.core.common.mo.m();
                final String strOo = com.thinkup.core.common.ooo.o00.oo(strM);
                new com.thinkup.core.common.n0.om(context, oo0Var).m(strM).o(0, (com.thinkup.core.common.n0.o0o) nmVar);
                com.thinkup.core.common.om.n.o().o(new com.thinkup.core.common.om.o0() { // from class: com.thinkup.core.oo.n.1
                    @Override // com.thinkup.core.common.om.o0
                    public final void o(String str) {
                        String unused = n.o;
                        if (TextUtils.isEmpty(str) || str.equals(strOo)) {
                            nmVar.onLoadError(0, a.n("The cdnDomain(", str, ") is not equal to curAppDomain(", strOo, ")."), ErrorCode.getErrorCode("10003", "", ""));
                            return;
                        }
                        boolean zO = nmVar.o();
                        String unused2 = n.o;
                        oo0Var.o();
                        if (zO) {
                            return;
                        }
                        com.thinkup.core.common.om.n.o();
                        com.thinkup.core.common.mo.o();
                        new com.thinkup.core.common.n0.om(context, oo0Var).m(com.thinkup.core.common.om.n.m(com.thinkup.core.common.mo.m(), str)).o(0, (com.thinkup.core.common.n0.o0o) nmVar);
                    }
                });
                return;
            }
        }
        new com.thinkup.core.common.n0.om(context, oo0Var).o(0, o0oVar);
    }
}
