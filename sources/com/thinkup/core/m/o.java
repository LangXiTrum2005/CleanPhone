package com.thinkup.core.m;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.o00o;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.oo.o0o;
import com.thinkup.core.common.ooo;
import com.thinkup.core.oo.n0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    private static volatile o on;
    o0o o;
    Context o0;
    private final String om = getClass().getSimpleName();
    ConcurrentHashMap<String, o00o> oo = new ConcurrentHashMap<>(3);
    SimpleDateFormat m = new SimpleDateFormat("yyyyMMdd");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    SimpleDateFormat f42395n = new SimpleDateFormat("yyyyMMddHH");

    private o(Context context) {
        this.o = o0o.o(com.thinkup.core.common.oo.oo.o(context));
        this.o0 = context;
    }

    public static o o(Context context) {
        if (on == null) {
            synchronized (o.class) {
                try {
                    if (on == null) {
                        on = new o(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return on;
    }

    public final void o() {
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.m.o.1
            @Override // java.lang.Runnable
            public final void run() {
                o oVar = o.this;
                oVar.o.o(oVar.m.format(new Date(System.currentTimeMillis())));
            }
        }, 2);
    }

    public final int o(n0 n0Var, String str) {
        try {
            if (n0Var == null) {
                return m.nm;
            }
            int iO = m.o(o0n.m().on()).o(str, String.valueOf(n0Var.o00n()), n0Var.o0m0(), n0Var.o0mo());
            if (iO != m.nm) {
                return iO;
            }
            if (!o0n.m().oon()) {
                if (n0Var.o0m0() == -1 && n0Var.o0mo() == -1) {
                    return m.nm;
                }
                o00o o00oVarO = o(str, n0Var.o00n());
                int iIntValue = o00oVarO != null ? o00oVarO.f42227n : 0;
                int iIntValue2 = o00oVarO != null ? o00oVarO.o0 : 0;
                Date date = new Date();
                int i2 = Integer.parseInt(m.m(date));
                int i3 = Integer.parseInt(m.n(date));
                ConcurrentHashMap<String, Long> concurrentHashMap = m.o(o0n.m().on()).mm;
                if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                    Long l2 = concurrentHashMap.get("day_" + i2 + "_" + str);
                    if (l2 != null) {
                        iIntValue += l2.intValue();
                    }
                    Long l3 = concurrentHashMap.get("hour_" + i3 + "_" + str);
                    if (l3 != null) {
                        iIntValue2 += l3.intValue();
                    }
                }
                if (n0Var.o0m0() != -1 && iIntValue >= n0Var.o0m0()) {
                    return 2;
                }
                if (n0Var.o0mo() != -1 && iIntValue2 >= n0Var.o0mo()) {
                    return 2;
                }
            }
            return m.nm;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final int o(String str, o0mm o0mmVar, int i2) {
        try {
            int iNm = o0mmVar.nm();
            String strM0o = o0mmVar.m0o();
            m mVarO = m.o(o0n.m().on());
            String strValueOf = String.valueOf(iNm);
            String strValueOf2 = String.valueOf(i2);
            long jO00 = o0mmVar.o00();
            long jO0o = o0mmVar.o0o();
            o0mmVar.m00();
            int iO = mVarO.o(strValueOf, strM0o, strValueOf2, jO00, jO0o);
            if (iO != m.nm) {
                return iO;
            }
            if (!o0n.m().oon()) {
                if (o0mmVar.o0o() == -1 && o0mmVar.o00() == -1) {
                    return m.nm;
                }
                o00o.o oVarO = o(str, o0mmVar.m0o(), i2);
                if (oVarO == null) {
                    return m.nm;
                }
                int iIntValue = oVarO.o0;
                int iIntValue2 = oVarO.oo;
                Date date = new Date();
                int i3 = Integer.parseInt(m.m(date));
                int i4 = Integer.parseInt(m.n(date));
                ConcurrentHashMap<String, Long> concurrentHashMap = m.o(o0n.m().on()).no;
                if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                    Long l2 = concurrentHashMap.get("day_" + i3 + "_" + strM0o);
                    if (l2 != null) {
                        iIntValue += l2.intValue();
                    }
                    Long l3 = concurrentHashMap.get("hour_" + i4 + "_" + strM0o);
                    if (l3 != null) {
                        iIntValue2 += l3.intValue();
                    }
                }
                if (o0mmVar.o0o() != -1 && iIntValue2 >= o0mmVar.o0o()) {
                    return 2;
                }
                if (o0mmVar.o00() != -1 && iIntValue >= o0mmVar.o00()) {
                    return 2;
                }
            }
            return m.nm;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final o00o o(String str, int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = this.m.format(new Date(jCurrentTimeMillis));
        String str3 = this.f42395n.format(new Date(jCurrentTimeMillis));
        o00o o00oVarO = this.oo.get(str);
        if (o00oVarO != null) {
            if (!TextUtils.equals(o00oVarO.on, str2)) {
                o00oVarO.f42227n = 0;
                o00oVarO.on = str2;
                o00oVarO.o0 = 0;
                o00oVarO.om = str3;
            } else if (!TextUtils.equals(o00oVarO.om, str3)) {
                o00oVarO.o0 = 0;
                o00oVarO.om = str3;
            }
        }
        synchronized (ooo.o().o(str)) {
            if (o00oVarO == null) {
                try {
                    o00oVarO = this.o.o(str, str2, str3);
                    if (o00oVarO == null) {
                        o00oVarO = new o00o();
                        o00oVarO.m = str;
                        o00oVarO.o = i2;
                    }
                    o00oVarO.on = str2;
                    o00oVarO.om = str3;
                    this.oo.put(str, o00oVarO);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o00oVarO;
    }

    public final o00o.o o(String str, String str2, int i2) {
        o00o.o oVarO;
        o00o o00oVarO = o(str, i2);
        if (o00oVarO == null || (oVarO = o00oVarO.o(str2)) == null) {
            return null;
        }
        if (!TextUtils.equals(oVarO.f42228n, o00oVarO.on)) {
            oVarO.f42228n = o00oVarO.on;
            oVarO.o0 = 0;
            oVarO.m = o00oVarO.om;
            oVarO.oo = 0;
            return oVarO;
        }
        if (!TextUtils.equals(oVarO.m, o00oVarO.om)) {
            oVarO.m = o00oVarO.om;
            oVarO.oo = 0;
        }
        return oVarO;
    }

    public final int[] o(int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int[] iArrO = this.o.o(i2, this.m.format(new Date(jCurrentTimeMillis)), this.f42395n.format(new Date(jCurrentTimeMillis)));
        int i3 = iArrO[0];
        int i4 = iArrO[1];
        return iArrO;
    }

    public static void o(com.thinkup.core.common.on.n0 n0Var, String str, String str2, String str3) {
        m.o(o0n.m().on()).o(n0Var.n0n(), str, str2, str3);
    }
}
