package com.thinkup.core.common.res.m;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    private static volatile n o;
    private final Map<String, o> m = new HashMap();

    private n() {
    }

    private synchronized o m(String str) {
        o oVar = this.m.get(str);
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(str);
        this.m.put(str, oVar2);
        return oVar2;
    }

    private synchronized void n(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        o oVar = this.m.get(str);
        if (oVar != null) {
            oVar.oo();
        }
    }

    public static n o() {
        if (o == null) {
            synchronized (n.class) {
                try {
                    if (o == null) {
                        o = new n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    private synchronized void o0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        o oVar = this.m.get(str);
        if (oVar != null) {
            oVar.om();
        }
    }

    public final synchronized void o(String str) {
        if (this.m != null && !TextUtils.isEmpty(str)) {
            this.m.remove(str);
        }
    }
}
