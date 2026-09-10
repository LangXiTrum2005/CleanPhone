package com.thinkup.core.m;

import android.content.Context;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.p004ironsource.dc;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n.oo0;
import com.thinkup.core.common.on.mo;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.ooo.onm;
import com.thinkup.core.oo.n0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    private static volatile n o0;
    final String o = dc.q;
    ConcurrentHashMap<String, com.thinkup.core.common.on.oo> m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ConcurrentHashMap<String, com.thinkup.core.common.on.oo> f42394n = new ConcurrentHashMap<>();

    public static void m(Context context, String str, n0 n0Var) {
        if (context == null || n0Var == null || TextUtils.isEmpty(str)) {
            return;
        }
        m.o(context).o(n0Var.oo0o(), n0Var.oo0m(), str, n0Var.o00n());
    }

    private static void n(Context context, o0mm o0mmVar, String str) {
        if (context == null || o0mmVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        m.o(context).o0(o0mmVar);
    }

    public static n o() {
        if (o0 == null) {
            synchronized (n.class) {
                try {
                    if (o0 == null) {
                        o0 = new n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o0;
    }

    public static void m(Context context, o0mm o0mmVar, String str) {
        if (context == null || o0mmVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        m.o(context).o(o0mmVar);
    }

    public static void m(Context context, o0mm o0mmVar) {
        if (context == null || o0mmVar == null) {
            return;
        }
        m.o(context).n(o0mmVar);
    }

    public static int o(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            int iO = m.o(context).o(str);
            int i2 = m.nm;
            return iO != i2 ? iO : i2;
        }
        return m.nm;
    }

    public final int o(Context context, String str, n0 n0Var) {
        if (context != null && n0Var != null && !TextUtils.isEmpty(str)) {
            int iOo0o = n0Var.oo0o();
            long jOo0m = n0Var.oo0m();
            int iO = m.o(context).o(iOo0o, jOo0m, str);
            if (iO != m.nm) {
                return iO;
            }
            if (o0n.m().oon() || !o(context, iOo0o, jOo0m, oo0.m.o0, o(str, ""), this.m, str, 0)) {
                return m.nm;
            }
            return 8;
        }
        return m.nm;
    }

    public final int o(Context context, o0mm o0mmVar, String str, int i2) {
        if (context != null && o0mmVar != null && !TextUtils.isEmpty(str)) {
            int iOnn0 = o0mmVar.onn0();
            long jOnno = o0mmVar.onno();
            String strM0o = o0mmVar.m0o();
            String strO = o(str, strM0o);
            int iO = m.o(context).o(iOnn0, jOnno, o0mmVar.nm(), strM0o, String.valueOf(i2));
            if (iO != m.nm) {
                return iO;
            }
            if (o0n.m().oon() || !o(context, iOnn0, jOnno, oo0.m.o0, strO, this.f42394n, strM0o, 1)) {
                return m.nm;
            }
            return 18;
        }
        return m.nm;
    }

    public static void o(Context context, o0mm o0mmVar, String str) {
        if (context == null || o0mmVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            m.o(context).o0(o0mmVar);
        }
        int iOnn0 = o0mmVar.onn0();
        long jOnno = o0mmVar.onno();
        String strM0o = o0mmVar.m0o();
        m.o(context).m(iOnn0, jOnno, o0mmVar.nm(), strM0o, String.valueOf(o0mmVar.ono0()));
    }

    private static String o(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : a.D(str, "_", str2);
    }

    private static boolean o(Context context, int i2, long j, String str, String str2, ConcurrentHashMap<String, com.thinkup.core.common.on.oo> concurrentHashMap, String str3, int i3) {
        ConcurrentHashMap<String, com.thinkup.core.common.on.o0> concurrentHashMap2;
        com.thinkup.core.common.on.o0 o0Var;
        int i4;
        com.thinkup.core.common.on.o0 o0Var2;
        boolean z2 = false;
        if (i2 > 0 && j > 0 && concurrentHashMap != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            com.thinkup.core.common.on.oo ooVar = concurrentHashMap.get(str2);
            if (ooVar == null) {
                ooVar = new com.thinkup.core.common.on.oo();
                String strN = onm.n(context, str, str2, "");
                if (!TextUtils.isEmpty(strN)) {
                    ooVar.o(strN);
                }
                concurrentHashMap.put(str2, ooVar);
            }
            int i5 = ooVar.o;
            long j2 = ooVar.m;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (i3 == 0) {
                ConcurrentHashMap<String, com.thinkup.core.common.on.o0> concurrentHashMap3 = m.o(o0n.m().on()).f42391n;
                if (concurrentHashMap3 != null && !TextUtils.isEmpty(str3) && (o0Var2 = concurrentHashMap3.get(str3)) != null && jCurrentTimeMillis - j2 <= j && jCurrentTimeMillis - o0Var2.mo() <= j) {
                    i4 = o0Var2.o;
                    i5 += i4;
                }
            } else if (i3 == 1 && (concurrentHashMap2 = m.o(o0n.m().on()).om) != null && !TextUtils.isEmpty(str3) && (o0Var = concurrentHashMap2.get(str3)) != null && jCurrentTimeMillis - j2 <= j && jCurrentTimeMillis - o0Var.mo() <= j) {
                i4 = o0Var.o;
                i5 += i4;
            }
            if (i5 >= i2 && System.currentTimeMillis() - j2 <= j) {
                z2 = true;
            }
            ooVar.toString();
        }
        return z2;
    }

    private static void o(Context context, int i2, long j, String str, String str2, ConcurrentHashMap<String, com.thinkup.core.common.on.oo> concurrentHashMap) {
        if (i2 <= 0 || j <= 0 || concurrentHashMap == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        com.thinkup.core.common.on.oo ooVar = concurrentHashMap.get(str2);
        if (ooVar == null) {
            String strN = onm.n(context, str, str2, "");
            com.thinkup.core.common.on.oo ooVar2 = new com.thinkup.core.common.on.oo();
            if (!TextUtils.isEmpty(strN)) {
                ooVar2.o(strN);
            }
            concurrentHashMap.put(str2, ooVar2);
            ooVar = ooVar2;
        }
        if (System.currentTimeMillis() - ooVar.m > j) {
            ooVar.m = System.currentTimeMillis();
            ooVar.o = 0;
        }
        ooVar.o++;
        ooVar.toString();
        onm.m(context, str, str2, ooVar.toString());
    }

    public static mo o(Context context, o0mm o0mmVar) {
        if (context == null || o0mmVar == null) {
            return null;
        }
        return m.o(context).m(o0mmVar);
    }
}
