package com.thinkup.core.common.inner.o;

import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.ooo.nm;
import com.thinkup.core.common.res.o0;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    private static volatile m m = null;
    public static final String o = "m";

    private m() {
    }

    public static m o() {
        if (m == null) {
            synchronized (m.class) {
                try {
                    if (m == null) {
                        m = new m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public static String o(String str) {
        return o0.o(o0n.m().on()).m(2, nm.o(str));
    }
}
