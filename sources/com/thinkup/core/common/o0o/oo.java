package com.thinkup.core.common.o0o;

import android.os.Handler;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class oo {
    private static final String o = "oo";
    private final Map<String, Integer> m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<String, om> f42170n = new ConcurrentHashMap();
    private Handler o0;

    public final void o(m0 m0Var, Handler handler, o oVar) {
        try {
            this.o0 = handler;
            on onVar = m0Var != null ? m0Var.mm : null;
            if (onVar != null && onVar.o(16, m0Var.m)) {
                String str = m0Var.m;
                Integer num = this.m.get(str);
                Integer numValueOf = num != null ? Integer.valueOf(num.intValue() + 1) : 1;
                m0Var.mo = numValueOf.intValue();
                this.m.put(str, numValueOf);
                if (numValueOf.intValue() > onVar.on()) {
                    return;
                }
                long jM0 = onVar.m0() * ((long) numValueOf.intValue());
                om omVar = new om(m0Var, oVar);
                this.f42170n.put(str, omVar);
                handler.postDelayed(omVar, jM0);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final void o(m0 m0Var) {
        om omVarRemove;
        if (m0Var == null) {
            return;
        }
        String str = m0Var.m;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            m0Var.mo = 0;
            this.m.remove(str);
            if (this.o0 == null || (omVarRemove = this.f42170n.remove(str)) == null) {
                return;
            }
            this.o0.removeCallbacks(omVarRemove);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
