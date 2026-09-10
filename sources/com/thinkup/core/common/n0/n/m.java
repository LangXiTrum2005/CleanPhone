package com.thinkup.core.common.n0.n;

import android.content.Context;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.onm;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends o0 {
    private static final long om = 24;
    private static final long on = 86400000;
    private static final String oo = "AppReqCapInterceptor";
    private volatile boolean m0;
    private volatile long mm;
    private volatile long mo;

    public m(Context context) {
        super(context);
        this.m0 = false;
        this.mo = 0L;
        this.mm = 0L;
    }

    private void m(com.thinkup.core.common.n0.m.om omVar, com.thinkup.core.common.n0.m.o0 o0Var) {
        omVar.m();
        omVar.o0();
        omVar.n();
        try {
            com.thinkup.core.common.o0m.o oVarN = onm.n(this.m, "thinkup_app_pl_cl_retry");
            String strO = o0Var.o();
            String strN = n(o0Var);
            String strN2 = n(strO);
            String strM = m(strO);
            this.f41949n.put(strN, 0L);
            oVarN.o(strN, 0L);
            oVarN.o(strN2, Long.valueOf(om));
            oVarN.o(strM, 0L);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static String o0(String str) {
        return a.m(str, "_req_first_timestamp");
    }

    private static String oo(String str) {
        return a.m(str, "_agent_event");
    }

    @Override // com.thinkup.core.common.n0.n.o0
    public final String n(com.thinkup.core.common.n0.m.o0 o0Var) {
        if (o0Var == null) {
            return "";
        }
        return o0Var.o() + "_req_next_time";
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009c A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:11:0x002a, B:13:0x004c, B:15:0x0054, B:18:0x0066, B:20:0x006e, B:22:0x0079, B:25:0x0094, B:27:0x009c, B:29:0x00a4, B:30:0x00ab, B:34:0x00b6, B:41:0x0102, B:35:0x00c5, B:24:0x008b, B:36:0x00d0, B:38:0x00d4, B:40:0x00f6), top: B:50:0x002a, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:11:0x002a, B:13:0x004c, B:15:0x0054, B:18:0x0066, B:20:0x006e, B:22:0x0079, B:25:0x0094, B:27:0x009c, B:29:0x00a4, B:30:0x00ab, B:34:0x00b6, B:41:0x0102, B:35:0x00c5, B:24:0x008b, B:36:0x00d0, B:38:0x00d4, B:40:0x00f6), top: B:50:0x002a, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:11:0x002a, B:13:0x004c, B:15:0x0054, B:18:0x0066, B:20:0x006e, B:22:0x0079, B:25:0x0094, B:27:0x009c, B:29:0x00a4, B:30:0x00ab, B:34:0x00b6, B:41:0x0102, B:35:0x00c5, B:24:0x008b, B:36:0x00d0, B:38:0x00d4, B:40:0x00f6), top: B:50:0x002a, outer: #1 }] */
    @Override // com.thinkup.core.common.n0.n.o0, com.thinkup.core.common.n0.n.mo
    public final com.thinkup.core.common.n0.m.om o(com.thinkup.core.common.n0.m.o0 o0Var) {
        long j;
        long jLongValue;
        long j2;
        long j3;
        Map<String, Long> map;
        long j4;
        com.thinkup.core.common.n0.m.om omVar = null;
        if (!m(o0Var)) {
            return null;
        }
        String strO = o0Var.o();
        String strN = n(o0Var);
        String strM = m(strO);
        String strN2 = n(strO);
        String strM2 = a.m(strO, "_req_first_timestamp");
        try {
            com.thinkup.core.common.n0.m.om omVarO = super.o(o0Var);
            if (omVarO == null) {
                return null;
            }
            try {
                synchronized (this.o0) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        com.thinkup.core.common.o0m.o oVarN = onm.n(this.m, "thinkup_app_pl_cl_retry");
                        long jLongValue2 = ((Long) oVarN.m(strN2, Long.valueOf(om))).longValue();
                        if (!omVarO.oo()) {
                            long jLongValue3 = this.mo;
                            if (jLongValue3 <= 0) {
                                jLongValue3 = ((Long) oVarN.m(strM2, 0L)).longValue();
                            }
                            this.mo = jLongValue3;
                            if (this.mo > 0) {
                                j = 86400000;
                                jLongValue = jCurrentTimeMillis - this.mo < 86400000 ? ((Long) oVarN.m(strM, 0L)).longValue() : 0L;
                                j2 = 1;
                                if (jLongValue >= jLongValue2 - 1) {
                                    j3 = this.mo + j;
                                    map = this.f41949n;
                                    if (map != null) {
                                        map.put(strN, Long.valueOf(j3));
                                    }
                                    j4 = jLongValue2 / 4;
                                    if (j4 <= 1) {
                                        j2 = j4;
                                    }
                                    oVarN.o(strN2, Long.valueOf(j2));
                                    oVarN.o(strN, Long.valueOf(j3));
                                } else {
                                    long j5 = jLongValue + 1;
                                    this.mm = j5;
                                    oVarN.o(strM, Long.valueOf(j5));
                                }
                            } else {
                                j = 86400000;
                            }
                            this.mo = jCurrentTimeMillis;
                            oVarN.o(strM2, Long.valueOf(jCurrentTimeMillis));
                            j2 = 1;
                            if (jLongValue >= jLongValue2 - 1) {
                                j3 = this.mo + j;
                                map = this.f41949n;
                                if (map != null) {
                                    map.put(strN, Long.valueOf(j3));
                                }
                                j4 = jLongValue2 / 4;
                                if (j4 <= 1) {
                                    j2 = j4;
                                }
                                oVarN.o(strN2, Long.valueOf(j2));
                                oVarN.o(strN, Long.valueOf(j3));
                            } else {
                                long j6 = jLongValue + 1;
                                this.mm = j6;
                                oVarN.o(strM, Long.valueOf(j6));
                            }
                        } else if (!this.m0) {
                            this.m0 = true;
                            String str = strO + "_agent_event";
                            if (!((Boolean) oVarN.m(str, Boolean.FALSE)).booleanValue()) {
                                com.thinkup.core.common.oo0.oo.o(this.mo, this.mm, jLongValue2);
                                oVarN.o(str, Boolean.TRUE);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return omVarO;
            } catch (Throwable th2) {
                th = th2;
                omVar = omVarO;
                th.getMessage();
                return omVar;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static String n(String str) {
        return a.m(str, "_req_count_limit");
    }

    @Override // com.thinkup.core.common.n0.n.o0
    public final boolean m(com.thinkup.core.common.n0.m.o0 o0Var) {
        return this.m != null && o0Var != null && "app_strategy".equals(o0Var.m()) && o(o0Var.o());
    }

    private static String m(String str) {
        return a.m(str, "_req_count");
    }

    @Override // com.thinkup.core.common.n0.n.mo
    public final void o(com.thinkup.core.common.n0.m.om omVar, com.thinkup.core.common.n0.m.o0 o0Var) {
        if (!m(o0Var) || omVar == null) {
            return;
        }
        synchronized (this.o0) {
            omVar.m();
            omVar.o0();
            omVar.n();
            try {
                com.thinkup.core.common.o0m.o oVarN = onm.n(this.m, "thinkup_app_pl_cl_retry");
                String strO = o0Var.o();
                String strN = n(o0Var);
                String strN2 = n(strO);
                String strM = m(strO);
                this.f41949n.put(strN, 0L);
                oVarN.o(strN, 0L);
                oVarN.o(strN2, Long.valueOf(om));
                oVarN.o(strM, 0L);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private boolean o(String str) {
        com.thinkup.core.oo.m mVarH = com.google.firebase.crashlytics.internal.model.a.h(com.thinkup.core.oo.o0.o(this.m));
        if (this.m == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return (mVarH == null || !mVarH.mn()) && o00.o(this.m);
    }

    private long o(com.thinkup.core.common.o0m.o oVar, String str) {
        long j = this.mo;
        return j <= 0 ? ((Long) oVar.m(str, 0L)).longValue() : j;
    }
}
