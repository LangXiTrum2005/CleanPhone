package com.thinkup.core.oo;

import android.content.Context;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Log;
import com.thinkup.core.common.ooo.onm;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o00 {
    private static final String o = "PlaceStrategySaver";
    private final Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConcurrentHashMap<String, n0> f42469n = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, n0> o0 = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, n0> oo = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Integer> om = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Integer> on = new ConcurrentHashMap<>();

    public o00(Context context) {
        this.m = context;
    }

    private boolean om(String str, String str2) {
        return o(str, str2, 0) != null;
    }

    public final void m(String str, String str2, int i2) {
        String strM = a.m(str, str2);
        if (i2 == 1) {
            this.oo.remove(strM);
            return;
        }
        if (i2 == 2) {
            this.f42469n.remove(strM);
        }
        if (i2 == 0) {
            this.o0.remove(strM);
        }
        onm.o(this.m, com.thinkup.core.common.n.oo0.m.o, m(strM, i2 == 2));
    }

    public final n0 n(String str, String str2) {
        n0 n0VarO;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        Integer num = this.on.get(str2);
        int iIntValue = num == null ? 0 : num.intValue();
        return (iIntValue != 1 || (n0VarO = o(str, str2, 0)) == null) ? o(str, str2, iIntValue) : n0VarO;
    }

    public final n0 o(String str, String str2) {
        int i2 = this.om.get(a.m(str, str2)) == null ? 2 : 0;
        n0 n0VarO = o(str, str2, i2);
        if (n0VarO == null && i2 == 2) {
            return o(str, str2, 0);
        }
        return n0VarO == null ? o(str, str2, 2) : n0VarO;
    }

    public final void o0(String str, String str2) {
        String strM = a.m(str, str2);
        Integer num = this.om.get(strM);
        if (num == null) {
            this.om.put(strM, 1);
        } else {
            this.om.put(strM, Integer.valueOf(num.intValue() + 1));
        }
    }

    public final int oo(String str, String str2) {
        String strM = a.m(str, str2);
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.om;
        Integer num = concurrentHashMap != null ? concurrentHashMap.get(strM) : null;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final boolean m(String str, String str2) {
        return this.om.get(a.m(str, str2)) == null;
    }

    public final n0 o(String str, String str2, int i2) {
        ConcurrentHashMap<String, n0> concurrentHashMap;
        while (true) {
            String strM = a.m(str, str2);
            if (i2 == 1) {
                concurrentHashMap = this.oo;
            } else if (i2 == 2) {
                concurrentHashMap = this.f42469n;
            } else {
                concurrentHashMap = this.o0;
            }
            n0 n0Var = concurrentHashMap.get(strM);
            if (n0Var != null) {
                return n0Var;
            }
            if (i2 == 1) {
                return null;
            }
            boolean z2 = i2 == 2;
            String strN = onm.n(this.m, com.thinkup.core.common.n.oo0.m.o, m(strM, z2), "");
            if (!TextUtils.isEmpty(strN)) {
                try {
                    n0 n0VarO = n0.o(str2, new JSONObject(strN));
                    if (n0VarO != null) {
                        n0VarO.o(i2);
                        concurrentHashMap.put(strM, n0VarO);
                        return n0VarO;
                    }
                } catch (Throwable unused) {
                }
            } else if (z2) {
                i2 = 0;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m(String str, boolean z2) {
        return a.D(str, "_", z2 ? "PL_SY_COLD_START" : "PL_SY");
    }

    public final void o(String str, String str2, n0 n0Var, final JSONObject jSONObject, int i2) {
        final boolean z2;
        if (this.m == null || n0Var == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        final String strM = a.m(str, str2);
        if (i2 == 1) {
            this.oo.put(strM, n0Var);
            return;
        }
        if (i2 == 2) {
            this.f42469n.put(strM, n0Var);
            z2 = true;
        } else {
            this.o0.put(strM, n0Var);
            z2 = false;
        }
        if (n0Var.onm() != 1 && !n0Var.onom()) {
            com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.oo.o00.1
                @Override // java.lang.Runnable
                public final void run() {
                    JSONObject jSONObject2 = jSONObject;
                    onm.m(o00.this.m, com.thinkup.core.common.n.oo0.m.o, o00.m(strM, z2), jSONObject2 == null ? "" : jSONObject2.toString());
                }
            });
        } else if (com.thinkup.core.common.n.o0n.m().mmn()) {
            Log.e(com.thinkup.core.common.n.mo.oo0, "PreInitNetwork may affect DebuggerMode.It is recommended to disable PreInitNetwork first and then setDebuggerMode.");
        }
    }

    public final void o(String str, int i2) {
        this.on.put(str, Integer.valueOf(i2));
    }
}
