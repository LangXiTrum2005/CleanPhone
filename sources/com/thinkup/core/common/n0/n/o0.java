package com.thinkup.core.common.n0.n;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.common.ooo.onm;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o0 implements mo {
    public static final String o = "thinkup_app_pl_cl_retry";
    protected final Context m;
    protected final Object o0 = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final Map<String, Long> f41949n = new ConcurrentHashMap(1);

    public o0(Context context) {
        this.m = context;
    }

    public boolean m(com.thinkup.core.common.n0.m.o0 o0Var) {
        return false;
    }

    public String n(com.thinkup.core.common.n0.m.o0 o0Var) {
        return o0Var != null ? o0Var.o() : "";
    }

    @Override // com.thinkup.core.common.n0.n.mo
    public com.thinkup.core.common.n0.m.om o(com.thinkup.core.common.n0.m.o0 o0Var) {
        String strN = n(o0Var);
        if (this.f41949n == null || TextUtils.isEmpty(strN)) {
            return null;
        }
        com.thinkup.core.common.n0.m.om omVarO = com.thinkup.core.common.n0.m.om.o();
        synchronized (this.o0) {
            try {
                Long lValueOf = this.f41949n.get(strN);
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(onm.m(this.m, "thinkup_app_pl_cl_retry", strN, 0L));
                    this.f41949n.put(strN, lValueOf);
                }
                if (lValueOf.longValue() == 0) {
                    omVarO.o(false);
                } else if (lValueOf.longValue() == -1) {
                    omVarO.o(true);
                    omVarO.m(700);
                } else {
                    boolean z2 = System.currentTimeMillis() - lValueOf.longValue() < 0;
                    if (z2) {
                        omVarO.m(700);
                    }
                    omVarO.o(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return omVarO;
    }
}
