package com.thinkup.core.common.oo0;

import android.text.TextUtils;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.nmm;
import com.thinkup.core.common.on.o0n;
import com.thinkup.core.common.on.oom;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    private static volatile m m = null;
    private static final String o = "m";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f42282n = 0;
    private long o0 = 0;
    private final Map<String, Long> oo = new ConcurrentHashMap();
    private final Map<String, nmm> om = new ConcurrentHashMap();

    private m() {
    }

    private static boolean n(n0 n0Var) {
        return n0Var == null || TextUtils.isEmpty(n0Var.oomn()) || TextUtils.isEmpty(n0Var.omm());
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

    private boolean o0(n0 n0Var) {
        try {
            String strOono = n0Var.oono();
            return !TextUtils.isEmpty(strOono) && strOono.equals("0");
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private void om(String str, long j) {
        o(str).om = j;
    }

    private void on(String str, long j) {
        o(str).on = j;
    }

    private static boolean oo(n0 n0Var) {
        return n0Var.n0n() == 66;
    }

    public final long m() {
        long j = this.o0;
        if (j != 0) {
            long j2 = this.f42282n;
            if (j2 != 0) {
                return j2 - j;
            }
        }
        return 0L;
    }

    public static long m(n0 n0Var) {
        return n0Var.n() - n0Var.m();
    }

    private void oo(String str, long j) {
        o(str).oo = j;
    }

    private void m(String str, long j) {
        o(str).m = j;
    }

    private void n(String str, long j) {
        o(str).f42211n = j;
    }

    private void o0(String str, long j) {
        o(str).o0 = j;
    }

    private void m(String str) {
        this.om.remove(str);
    }

    public final void o(int i2, n0 n0Var) {
        if (n(n0Var)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i2 != 4) {
            if (i2 != 6) {
                return;
            }
            n0Var.nn(jCurrentTimeMillis);
        } else {
            if (!o0(n0Var)) {
                this.f42282n = jCurrentTimeMillis;
            }
            n0Var.nm(jCurrentTimeMillis);
        }
    }

    public final void o(o0n o0nVar, n0 n0Var) {
        if (n(n0Var)) {
            return;
        }
        String str = o0nVar.f42235n;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!str.equals("1004634") || o0(n0Var)) {
            return;
        }
        this.o0 = jCurrentTimeMillis;
        this.oo.put(n0Var.oomn(), Long.valueOf(jCurrentTimeMillis));
    }

    public final long o(n0 n0Var) {
        if (TextUtils.isEmpty(n0Var.oomn())) {
            return 0L;
        }
        long jM = n0Var.m();
        Long l2 = this.oo.get(n0Var.oomn());
        if (l2 == null || l2.longValue() == 0 || jM == 0) {
            return 0L;
        }
        return jM - l2.longValue();
    }

    private static String o(oom oomVar) {
        return oomVar.om + "_ " + oomVar.oo;
    }

    private nmm o(String str) {
        nmm nmmVar = this.om.get(str);
        if (nmmVar != null) {
            return nmmVar;
        }
        synchronized (this.om) {
            if (nmmVar == null) {
                try {
                    nmmVar = new nmm();
                    this.om.put(str, nmmVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return nmmVar;
    }

    private void o(String str, long j) {
        o(str).o = j;
    }
}
