package com.thinkup.core.common;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.common.on.o00n;
import com.thinkup.core.common.ooo.onm;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class oom {
    private static final String m = "oom";
    private static volatile oom om;
    Context o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<String, Integer> f42292n = new ConcurrentHashMap(8);
    private final Map<String, o00n> o0 = new ConcurrentHashMap(8);
    private final Map<String, Boolean> oo = new ConcurrentHashMap(8);

    private oom(Context context) {
        this.o = context.getApplicationContext();
    }

    private boolean n(String str) {
        Boolean bool = this.oo.get(str);
        if (bool == null) {
            boolean zN = onm.n(this.o, com.thinkup.core.common.n.oo0.m.no, str);
            Boolean boolValueOf = Boolean.valueOf(zN);
            if (zN) {
                onm.m(this.o, com.thinkup.core.common.n.oo0.m.no, str);
            }
            this.oo.put(str, Boolean.FALSE);
            bool = boolValueOf;
        }
        return bool.booleanValue();
    }

    public static oom o(Context context) {
        if (om == null) {
            synchronized (oom.class) {
                try {
                    if (om == null) {
                        om = new oom(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return om;
    }

    public final int m(String str) {
        Integer num = this.f42292n.get(str);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final void o(String str, String str2, boolean z2) {
        o00n o00nVar;
        if (TextUtils.isEmpty(str) || (o00nVar = this.o0.get(str)) == null || !TextUtils.equals(str2, o00nVar.o())) {
            return;
        }
        o00nVar.o(z2);
    }

    public final void o(String str) {
        Integer num = this.f42292n.get(str);
        if (num == null) {
            this.f42292n.put(str, 1);
        } else {
            this.f42292n.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public final o00n o(String str, String str2) {
        Boolean bool = this.oo.get(str);
        if (bool == null) {
            boolean zN = onm.n(this.o, com.thinkup.core.common.n.oo0.m.no, str);
            Boolean boolValueOf = Boolean.valueOf(zN);
            if (zN) {
                onm.m(this.o, com.thinkup.core.common.n.oo0.m.no, str);
            }
            this.oo.put(str, Boolean.FALSE);
            bool = boolValueOf;
        }
        boolean zBooleanValue = bool.booleanValue();
        o00n o00nVarRemove = this.o0.remove(str);
        if (o00nVarRemove == null) {
            o00nVarRemove = new o00n("", zBooleanValue);
        }
        this.o0.put(str, new o00n(str2, false));
        return o00nVarRemove;
    }
}
