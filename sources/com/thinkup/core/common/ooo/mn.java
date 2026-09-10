package com.thinkup.core.common.ooo;

import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0nm;

/* JADX INFO: loaded from: classes6.dex */
public final class mn {
    public static int m(o0mm o0mmVar, o0mm o0mmVar2) {
        if (o0mmVar2 == null) {
            return -1;
        }
        if (o0mmVar == null) {
            return 1;
        }
        return o(o0mmVar.n0n(), nn.n(o0mmVar), o0mmVar2.n0n(), nn.n(o0mmVar2));
    }

    public static int o(o0mm o0mmVar, o0mm o0mmVar2) {
        if (o0mmVar2 == null) {
            return -1;
        }
        if (o0mmVar == null) {
            return 1;
        }
        return o(o0mmVar.n0n(), nn.o(o0mmVar), o0mmVar2.n0n(), nn.o(o0mmVar2));
    }

    public static int o(com.thinkup.core.common.on.on0 on0Var, com.thinkup.core.common.on.on0 on0Var2) {
        if (on0Var2 == null) {
            return -1;
        }
        return o(on0Var, on0Var.getSortPrice(), on0Var2, on0Var2.getSortPrice());
    }

    public static int o(o0nm.o oVar, o0nm.o oVar2) {
        if (oVar2 == null) {
            return -1;
        }
        if (oVar == null) {
            return 1;
        }
        return o(oVar.mm, oVar.o0, oVar2.mm, oVar2.o0);
    }

    private static int o(com.thinkup.core.common.on.on0 on0Var, double d, com.thinkup.core.common.on.on0 on0Var2, double d2) {
        int iOom;
        int iO0n;
        int iOom2;
        int iO0n2;
        if (on0Var == null || !on0Var.o0m()) {
            iOom = 0;
            iO0n = 0;
        } else {
            iO0n = on0Var.o0n();
            iOom = on0Var.oom();
        }
        if (on0Var2 == null || !on0Var2.o0m()) {
            iOom2 = 0;
            iO0n2 = 0;
        } else {
            iO0n2 = on0Var2.o0n();
            iOom2 = on0Var2.oom();
        }
        if (iO0n == 0 || iO0n2 == 0) {
            if (iO0n > 0) {
                return -1;
            }
            if (iO0n2 > 0) {
                return 1;
            }
            if (d > d2) {
                return -1;
            }
            return d == d2 ? 0 : 1;
        }
        if (iO0n != iO0n2) {
            return -(iO0n - iO0n2);
        }
        if (iO0n == 3) {
            return iOom - iOom2;
        }
        if (d > d2) {
            return -1;
        }
        return d == d2 ? 0 : 1;
    }
}
