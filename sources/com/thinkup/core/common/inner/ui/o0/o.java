package com.thinkup.core.common.inner.ui.o0;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    private static volatile o o;
    private Map<String, com.thinkup.core.basead.m.o> m = new HashMap();

    private o() {
    }

    public static o o() {
        if (o == null) {
            synchronized (o.class) {
                try {
                    if (o == null) {
                        o = new o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    public final void o(String str, com.thinkup.core.basead.m.o oVar) {
        if (TextUtils.isEmpty(str) || oVar == null) {
            return;
        }
        this.m.put(str, oVar);
    }

    public final com.thinkup.core.basead.m.o o(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.m.remove(str);
    }
}
