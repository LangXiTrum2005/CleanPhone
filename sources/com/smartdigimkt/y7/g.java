package com.smartdigimkt.y7;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.n8.p;
import com.thinkup.core.common.om.n;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class g {
    private static final String f = "HttpReqLimitInterceptor";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f40271a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f40272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Long> f40273c;
    private final a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f40274e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f40276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f40277c = true;

        public a(int i2, long j) {
            this.f40275a = i2;
            this.f40276b = j;
        }
    }

    public g(Context context, Map<String, Long> map, a aVar) {
        this.f40272b = context;
        this.f40273c = map;
        this.d = aVar;
    }

    private void b(com.smartdigimkt.x7.e eVar, com.smartdigimkt.x7.c cVar) {
        String strE = e(cVar);
        String strC = c(cVar);
        this.f40273c.put(strE, 0L);
        com.smartdigimkt.g8.a aVarC = p.c(this.f40272b, "sdm_app_pl_cl_retry");
        aVarC.a(strE, 0L);
        aVarC.a(strC, 0L);
    }

    private String c(com.smartdigimkt.x7.c cVar) {
        if (cVar == null) {
            return "";
        }
        return cVar.c() + "_req_count";
    }

    private String d(com.smartdigimkt.x7.c cVar) {
        if (cVar == null) {
            return "";
        }
        return cVar.c() + "_req_frist_timestamp";
    }

    public com.smartdigimkt.x7.e a(com.smartdigimkt.x7.c cVar, com.smartdigimkt.x7.e eVar) {
        long jLongValue;
        if (eVar == null) {
            return null;
        }
        try {
            String strE = e(cVar);
            String strD = d(cVar);
            String strC = c(cVar);
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this.f40271a) {
                try {
                    com.smartdigimkt.g8.a aVarC = p.c(this.f40272b, "sdm_app_pl_cl_retry");
                    a(eVar, cVar, aVarC);
                    if (!eVar.g()) {
                        long jA = a(aVarC, strD);
                        this.f40274e = jA;
                        if (jA <= 0 || jCurrentTimeMillis - jA >= a()) {
                            this.f40274e = jCurrentTimeMillis;
                            aVarC.a(strD, Long.valueOf(jCurrentTimeMillis));
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Long) aVarC.b(strC, 0L)).longValue();
                        }
                        if (jLongValue == b() - 1) {
                            if (this.f40274e == 0) {
                                this.f40274e = jCurrentTimeMillis;
                            }
                            long jA2 = this.f40274e + a();
                            Map<String, Long> map = this.f40273c;
                            if (map != null) {
                                map.put(strE, Long.valueOf(jA2));
                            }
                            aVarC.a(strE, Long.valueOf(jA2));
                        } else {
                            aVarC.a(strC, Long.valueOf(jLongValue + 1));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return eVar;
        } catch (Throwable th2) {
            th2.getMessage();
            return eVar;
        }
    }

    public String e(com.smartdigimkt.x7.c cVar) {
        if (cVar == null) {
            return "";
        }
        return cVar.c() + "_req_next_timestamp";
    }

    private String b(com.smartdigimkt.x7.c cVar) {
        if (cVar == null) {
            return "";
        }
        return cVar.c() + "_data_timestamp";
    }

    private int b() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.f40275a;
        }
        return 5;
    }

    public void a(com.smartdigimkt.x7.e eVar, com.smartdigimkt.x7.c cVar) {
        Object objC = eVar.c();
        try {
            synchronized (this.f40271a) {
                try {
                    a aVar = this.d;
                    if (aVar != null && aVar.f40277c && objC != null) {
                        p.b(this.f40272b, "sdm_app_pl_cl_retry", a(cVar), objC.toString());
                        p.b(this.f40272b, "sdm_app_pl_cl_retry", b(cVar), System.currentTimeMillis());
                    }
                    b(eVar, cVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(com.smartdigimkt.x7.e eVar, com.smartdigimkt.x7.c cVar, com.smartdigimkt.g8.a aVar) {
        a aVar2 = this.d;
        if (aVar2 == null || aVar2.f40277c) {
            long jLongValue = ((Long) aVar.b(b(cVar), 0L)).longValue();
            String jSONObject = (String) aVar.b(a(cVar), "");
            boolean z2 = jLongValue > 0 && System.currentTimeMillis() - jLongValue <= a();
            if (TextUtils.isEmpty(jSONObject) || !z2) {
                return;
            }
            try {
                jSONObject = new JSONObject(jSONObject);
            } catch (Throwable unused) {
            }
            try {
                eVar.a(jSONObject);
                eVar.b(200);
                eVar.a(true);
            } catch (Throwable unused2) {
            }
        }
    }

    private String a(com.smartdigimkt.x7.c cVar) {
        if (cVar == null) {
            return "";
        }
        return cVar.c() + "_data";
    }

    private long a(com.smartdigimkt.g8.a aVar, String str) {
        long j = this.f40274e;
        return j <= 0 ? ((Long) aVar.b(str, 0L)).longValue() : j;
    }

    private long a() {
        a aVar = this.d;
        return aVar != null ? aVar.f40276b : n.m;
    }
}
