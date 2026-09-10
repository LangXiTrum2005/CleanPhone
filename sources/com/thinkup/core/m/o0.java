package com.thinkup.core.m;

import android.content.Context;
import android.support.v4.media.a;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n.oo0;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.ooo.onm;
import com.thinkup.core.oo.n0;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 {
    private static o0 o;
    private final String m = "pacing_";

    private static void m() {
    }

    private static void n() {
    }

    public static o0 o() {
        if (o == null) {
            o = new o0();
        }
        return o;
    }

    public static int o(String str, n0 n0Var) {
        if (n0Var == null) {
            return 3;
        }
        int iO = m.o(o0n.m().on()).o(str, String.valueOf(n0Var.o00n()), n0Var.o0mm());
        if (iO != m.nm) {
            return iO;
        }
        if (!o0n.m().oon()) {
            if (n0Var.o0mm() == -1) {
                return m.nm;
            }
            long jM = onm.m(o0n.m().on(), oo0.m.o, "pacing_".concat(String.valueOf(str)), 0L);
            if (System.currentTimeMillis() - jM < 0) {
                return m.nm;
            }
            if (System.currentTimeMillis() - jM < n0Var.o0mm()) {
                return 3;
            }
        }
        return m.nm;
    }

    public static int o(String str, o0mm o0mmVar) {
        if (o0mmVar == null) {
            return 3;
        }
        int iO = m.o(o0n.m().on()).o(String.valueOf(o0mmVar.nm()), o0mmVar.m0o(), String.valueOf(o0mmVar.ono0()), o0mmVar.m00());
        if (iO != m.nm) {
            return iO;
        }
        if (!o0n.m().oon()) {
            if (o0mmVar.m00() == -1) {
                return m.nm;
            }
            Context contextOn = o0n.m().on();
            StringBuilder sbY = a.y("pacing_", str, "_");
            sbY.append(o0mmVar.m0o());
            long jM = onm.m(contextOn, oo0.m.o, sbY.toString(), 0L);
            if (System.currentTimeMillis() - jM < 0) {
                o0mmVar.m0o();
                return m.nm;
            }
            if (System.currentTimeMillis() - jM < o0mmVar.m00()) {
                return 3;
            }
        }
        return m.nm;
    }
}
