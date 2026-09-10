package com.thinkup.core.common.o;

import android.content.Context;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n.oo0;
import com.thinkup.core.common.on.nmo;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.on.onm;
import com.thinkup.core.common.oo.o00;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    private static volatile o m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o00 f42123n;
    ConcurrentHashMap<String, onm> o;

    private o() {
        if (o0n.m().on() != null) {
            this.f42123n = o00.o(com.thinkup.core.common.oo.oo.o(o0n.m().on()));
        }
        this.o = new ConcurrentHashMap<>(3);
    }

    private nmo m(Context context, String str) {
        if (this.f42123n == null) {
            this.f42123n = o00.o(com.thinkup.core.common.oo.oo.o(context.getApplicationContext()));
        }
        return this.f42123n.n(str);
    }

    private static void n(Context context, String str) {
        com.thinkup.core.common.ooo.onm.o(context, oo0.m.mo, str + "_win_notice", 1);
    }

    private static boolean o0(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_win_notice");
        return com.thinkup.core.common.ooo.onm.m(context, oo0.m.mo, sb.toString(), 0) == 1;
    }

    private String oo(Context context, String str) {
        if (this.f42123n == null) {
            this.f42123n = o00.o(com.thinkup.core.common.oo.oo.o(context.getApplicationContext()));
        }
        return this.f42123n.o0(str);
    }

    public static o o() {
        if (m == null) {
            synchronized (o.class) {
                try {
                    if (m == null) {
                        m = new o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public final on0 o(String str, String str2) {
        onm onmVarM = this.o.get(str);
        if (onmVarM == null) {
            onmVarM = this.f42123n.m(str);
            this.o.put(str, onmVarM);
        }
        return onmVarM.o(str2);
    }

    public final void o(String str, on0 on0Var) {
        if (this.f42123n == null) {
            this.f42123n = o00.o(com.thinkup.core.common.oo.oo.o(o0n.m().on()));
        }
        this.f42123n.o(str, on0Var);
    }

    public final void o(final on0 on0Var) {
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.o.o.1
            @Override // java.lang.Runnable
            public final void run() {
                if (o.this.f42123n == null) {
                    o.this.f42123n = o00.o(com.thinkup.core.common.oo.oo.o(o0n.m().on()));
                }
                o.this.f42123n.o(on0Var);
            }
        }, 2);
    }

    private void o(Context context, String str, String str2, String str3) {
        if (this.f42123n == null) {
            this.f42123n = o00.o(com.thinkup.core.common.oo.oo.o(context.getApplicationContext()));
        }
        this.f42123n.o(str, str2, str3);
    }

    public final void o(final Context context, final String str) {
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.o.o.2
            @Override // java.lang.Runnable
            public final void run() {
                if (o.this.f42123n == null) {
                    o.this.f42123n = o00.o(com.thinkup.core.common.oo.oo.o(context.getApplicationContext()));
                }
                o.this.f42123n.o(str);
            }
        }, 2);
        com.thinkup.core.common.ooo.onm.o(context, oo0.m.mo, str + "_win_notice");
    }

    private void o(Context context, String str, String str2) {
        if (this.f42123n == null) {
            this.f42123n = o00.o(com.thinkup.core.common.oo.oo.o(context.getApplicationContext()));
        }
        this.f42123n.o(str, str2);
    }
}
