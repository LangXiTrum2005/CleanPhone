package com.smartdigimkt.y7;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.n8.p;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class b extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f40260h = "AppReqCapInterceptor";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f40261i = 24;
    private static final long j = 86400000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f40262e;
    private volatile long f;
    private volatile long g;

    public b(Context context) {
        super(context);
        this.f40262e = false;
        this.f = 0L;
        this.g = 0L;
    }

    private void b(com.smartdigimkt.x7.e eVar, com.smartdigimkt.x7.c cVar) {
        eVar.f();
        eVar.e();
        eVar.b();
        try {
            com.smartdigimkt.g8.a aVarC = p.c(this.f40264a, "sdm_app_pl_cl_retry");
            String strB = cVar.b();
            String strB2 = b(cVar);
            String strB3 = b(strB);
            String strC = c(strB);
            this.f40265b.put(strB2, 0L);
            aVarC.a(strB2, 0L);
            aVarC.a(strB3, Long.valueOf(f40261i));
            aVarC.a(strC, 0L);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private String d(String str) {
        return android.support.v4.media.a.m(str, "_req_first_timestamp");
    }

    private boolean e(String str) {
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        if (this.f40264a == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return (aVarB == null || !aVarB.K0()) && com.smartdigimkt.n8.h.h(this.f40264a);
    }

    @Override // com.smartdigimkt.y7.d, com.smartdigimkt.y7.h
    public com.smartdigimkt.x7.e a(com.smartdigimkt.x7.c cVar) {
        long j2;
        com.smartdigimkt.x7.e eVar = null;
        if (!c(cVar)) {
            return null;
        }
        String strB = cVar.b();
        String strB2 = b(cVar);
        String strC = c(strB);
        String strB3 = b(strB);
        String strD = d(strB);
        try {
            com.smartdigimkt.x7.e eVarA = super.a(cVar);
            if (eVarA == null) {
                return null;
            }
            try {
                synchronized (this.f40266c) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        com.smartdigimkt.g8.a aVarC = p.c(this.f40264a, "sdm_app_pl_cl_retry");
                        long jLongValue = ((Long) aVarC.b(strB3, Long.valueOf(f40261i))).longValue();
                        if (!eVarA.g()) {
                            this.f = a(aVarC, strD);
                            long jLongValue2 = 0;
                            if (this.f > 0) {
                                j2 = 86400000;
                                if (jCurrentTimeMillis - this.f >= 86400000) {
                                    this.f = jCurrentTimeMillis;
                                    aVarC.a(strD, Long.valueOf(jCurrentTimeMillis));
                                } else {
                                    jLongValue2 = ((Long) aVarC.b(strC, 0L)).longValue();
                                }
                            } else {
                                j2 = 86400000;
                                this.f = jCurrentTimeMillis;
                                aVarC.a(strD, Long.valueOf(jCurrentTimeMillis));
                            }
                            long j3 = 1;
                            if (jLongValue2 >= jLongValue - 1) {
                                long j4 = this.f + j2;
                                Map<String, Long> map = this.f40265b;
                                if (map != null) {
                                    map.put(strB2, Long.valueOf(j4));
                                }
                                long j5 = jLongValue / 4;
                                if (j5 > 1) {
                                    j3 = j5;
                                }
                                aVarC.a(strB3, Long.valueOf(j3));
                                aVarC.a(strB2, Long.valueOf(j4));
                            } else {
                                long j6 = jLongValue2 + 1;
                                this.g = j6;
                                aVarC.a(strC, Long.valueOf(j6));
                            }
                        } else if (!this.f40262e) {
                            this.f40262e = true;
                            String strA = a(strB);
                            if (!((Boolean) aVarC.b(strA, Boolean.FALSE)).booleanValue()) {
                                com.smartdigimkt.i7.d.a(this.f, this.g, jLongValue);
                                aVarC.a(strA, Boolean.TRUE);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return eVarA;
            } catch (Throwable th2) {
                th = th2;
                eVar = eVarA;
                th.getMessage();
                return eVar;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.smartdigimkt.y7.d
    public boolean c(com.smartdigimkt.x7.c cVar) {
        return this.f40264a != null && cVar != null && "app_strategy".equals(cVar.c()) && e(cVar.b());
    }

    private String c(String str) {
        return android.support.v4.media.a.m(str, "_req_count");
    }

    @Override // com.smartdigimkt.y7.d
    public String b(com.smartdigimkt.x7.c cVar) {
        if (cVar == null) {
            return "";
        }
        return cVar.b() + "_req_next_time";
    }

    private String b(String str) {
        return android.support.v4.media.a.m(str, "_req_count_limit");
    }

    @Override // com.smartdigimkt.y7.h
    public void a(com.smartdigimkt.x7.e eVar, com.smartdigimkt.x7.c cVar) {
        if (!c(cVar) || eVar == null) {
            return;
        }
        synchronized (this.f40266c) {
            b(eVar, cVar);
        }
    }

    private String a(String str) {
        return android.support.v4.media.a.m(str, "_agent_event");
    }

    private long a(com.smartdigimkt.g8.a aVar, String str) {
        long j2 = this.f;
        return j2 <= 0 ? ((Long) aVar.b(str, 0L)).longValue() : j2;
    }
}
