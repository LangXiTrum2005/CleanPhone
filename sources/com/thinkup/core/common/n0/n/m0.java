package com.thinkup.core.common.n0.n;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.common.ooo.onm;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 {
    private static final String o = "HttpReqLimitInterceptor";
    private final Object m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f41947n;
    private final Map<String, Long> o0;
    private long om;
    private final o oo;

    public static class o {
        public long m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f41948n = true;
        public int o = 5;

        public o(long j) {
            this.m = j;
        }
    }

    public m0(Context context, Map<String, Long> map, o oVar) {
        this.f41947n = context;
        this.o0 = map;
        this.oo = oVar;
    }

    private void m(com.thinkup.core.common.n0.m.o0 o0Var) {
        String strO = o(o0Var);
        String strO0 = o0(o0Var);
        this.o0.put(strO, 0L);
        com.thinkup.core.common.o0m.o oVarN = onm.n(this.f41947n, "thinkup_app_pl_cl_retry");
        oVarN.o(strO, 0L);
        oVarN.o(strO0, 0L);
    }

    private static String n(com.thinkup.core.common.n0.m.o0 o0Var) {
        if (o0Var == null) {
            return "";
        }
        return o0Var.m() + "_req_frist_timestamp";
    }

    private static String o0(com.thinkup.core.common.n0.m.o0 o0Var) {
        if (o0Var == null) {
            return "";
        }
        return o0Var.m() + "_req_count";
    }

    private static String om(com.thinkup.core.common.n0.m.o0 o0Var) {
        if (o0Var == null) {
            return "";
        }
        return o0Var.m() + "_data_timestamp";
    }

    private static String oo(com.thinkup.core.common.n0.m.o0 o0Var) {
        if (o0Var == null) {
            return "";
        }
        return o0Var.m() + "_data";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.thinkup.core.common.n0.m.om o(com.thinkup.core.common.n0.m.o0 o0Var, com.thinkup.core.common.n0.m.om omVar) {
        String str;
        long jLongValue;
        if (omVar == null) {
            return null;
        }
        try {
            String strO = o(o0Var);
            if (o0Var != null) {
                str = o0Var.m() + "_req_frist_timestamp";
            } else {
                str = "";
            }
            String strO0 = o0(o0Var);
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this.m) {
                try {
                    com.thinkup.core.common.o0m.o oVarN = onm.n(this.f41947n, "thinkup_app_pl_cl_retry");
                    o oVar = this.oo;
                    if (oVar == null || oVar.f41948n) {
                        long jLongValue2 = ((Long) oVarN.m(om(o0Var), 0L)).longValue();
                        String jSONObject = (String) oVarN.m(oo(o0Var), "");
                        boolean z2 = jLongValue2 > 0 && System.currentTimeMillis() - jLongValue2 <= o();
                        if (!TextUtils.isEmpty(jSONObject) && z2) {
                            jSONObject = new JSONObject(jSONObject);
                            try {
                                omVar.o(jSONObject);
                                omVar.m(200);
                                omVar.o(true);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    if (!omVar.oo()) {
                        long jLongValue3 = this.om;
                        if (jLongValue3 <= 0) {
                            jLongValue3 = ((Long) oVarN.m(str, 0L)).longValue();
                        }
                        this.om = jLongValue3;
                        if (jLongValue3 <= 0 || jCurrentTimeMillis - jLongValue3 >= o()) {
                            this.om = jCurrentTimeMillis;
                            oVarN.o(str, Long.valueOf(jCurrentTimeMillis));
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Long) oVarN.m(strO0, 0L)).longValue();
                        }
                        o oVar2 = this.oo;
                        if (jLongValue == (oVar2 != null ? oVar2.o : 5) - 1) {
                            if (this.om == 0) {
                                this.om = jCurrentTimeMillis;
                            }
                            long jO = this.om + o();
                            Map<String, Long> map = this.o0;
                            if (map != null) {
                                map.put(strO, Long.valueOf(jO));
                            }
                            oVarN.o(strO, Long.valueOf(jO));
                        } else {
                            oVarN.o(strO0, Long.valueOf(jLongValue + 1));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
        return omVar;
    }

    private int m() {
        o oVar = this.oo;
        if (oVar != null) {
            return oVar.o;
        }
        return 5;
    }

    public final void o(com.thinkup.core.common.n0.m.om omVar, com.thinkup.core.common.n0.m.o0 o0Var) {
        Object objOn = omVar.on();
        try {
            synchronized (this.m) {
                try {
                    o oVar = this.oo;
                    if (oVar != null && oVar.f41948n && objOn != null) {
                        onm.m(this.f41947n, "thinkup_app_pl_cl_retry", oo(o0Var), objOn.toString());
                        onm.o(this.f41947n, "thinkup_app_pl_cl_retry", om(o0Var), System.currentTimeMillis());
                    }
                    String strO = o(o0Var);
                    String strO0 = o0(o0Var);
                    this.o0.put(strO, 0L);
                    com.thinkup.core.common.o0m.o oVarN = onm.n(this.f41947n, "thinkup_app_pl_cl_retry");
                    oVarN.o(strO, 0L);
                    oVarN.o(strO0, 0L);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public static String o(com.thinkup.core.common.n0.m.o0 o0Var) {
        if (o0Var == null) {
            return "";
        }
        return o0Var.m() + "_req_next_timestamp";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void o(com.thinkup.core.common.n0.m.om omVar, com.thinkup.core.common.n0.m.o0 o0Var, com.thinkup.core.common.o0m.o oVar) {
        o oVar2 = this.oo;
        if (oVar2 == null || oVar2.f41948n) {
            long jLongValue = ((Long) oVar.m(om(o0Var), 0L)).longValue();
            String jSONObject = (String) oVar.m(oo(o0Var), "");
            boolean z2 = jLongValue > 0 && System.currentTimeMillis() - jLongValue <= o();
            if (TextUtils.isEmpty(jSONObject) || !z2) {
                return;
            }
            try {
                jSONObject = new JSONObject(jSONObject);
            } catch (Throwable unused) {
            }
            try {
                omVar.o(jSONObject);
                omVar.m(200);
                omVar.o(true);
            } catch (Throwable unused2) {
            }
        }
    }

    private long o(com.thinkup.core.common.o0m.o oVar, String str) {
        long j = this.om;
        return j <= 0 ? ((Long) oVar.m(str, 0L)).longValue() : j;
    }

    private long o() {
        o oVar = this.oo;
        return oVar != null ? oVar.m : com.thinkup.core.common.om.n.m;
    }
}
