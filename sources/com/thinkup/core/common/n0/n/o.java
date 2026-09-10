package com.thinkup.core.common.n0.n;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.common.ooo.onm;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class o extends o0 {
    public o(Context context) {
        super(context);
    }

    @Override // com.thinkup.core.common.n0.n.o0
    public final boolean m(com.thinkup.core.common.n0.m.o0 o0Var) {
        if (this.m != null && o0Var != null) {
            String strM = o0Var.m();
            String strO = o0Var.o();
            if (("app_strategy".equals(strM) || "placement_strategy".equals(strM) || "get_plugin".equals(strM)) && !TextUtils.isEmpty(strO)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.thinkup.core.common.n0.n.o0, com.thinkup.core.common.n0.n.mo
    public final com.thinkup.core.common.n0.m.om o(com.thinkup.core.common.n0.m.o0 o0Var) {
        if (!m(o0Var)) {
            return null;
        }
        com.thinkup.core.common.n0.m.om omVarO = super.o(o0Var);
        if (omVarO != null && omVarO.oo()) {
            omVarO.m(699);
        }
        return omVarO;
    }

    @Override // com.thinkup.core.common.n0.n.mo
    public final void o(com.thinkup.core.common.n0.m.om omVar, com.thinkup.core.common.n0.m.o0 o0Var) {
        if (!m(o0Var) || omVar == null) {
            return;
        }
        int iN = omVar.n();
        String strM = omVar.m();
        long jO0 = omVar.o0();
        if (iN != 699 || jO0 <= 0) {
            return;
        }
        synchronized (this.o0) {
            try {
                Map<String, Long> map = this.f41949n;
                if (map != null) {
                    map.put(strM, Long.valueOf(jO0));
                }
                onm.o(this.m, "thinkup_app_pl_cl_retry", strM, jO0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void o(String str, long j) {
        Map<String, Long> map = this.f41949n;
        if (map != null) {
            map.put(str, Long.valueOf(j));
        }
        onm.o(this.m, "thinkup_app_pl_cl_retry", str, j);
    }
}
