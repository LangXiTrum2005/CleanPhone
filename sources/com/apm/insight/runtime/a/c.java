package com.apm.insight.runtime.a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.ICommonParams;
import com.apm.insight.l.m;
import com.apm.insight.l.n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected CrashType f10301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f10302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ICommonParams f10303c = com.apm.insight.e.a().c();
    private b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f10304e;

    public interface a {
        com.apm.insight.entity.a a(int i2, com.apm.insight.entity.a aVar);

        com.apm.insight.entity.a b(int i2, com.apm.insight.entity.a aVar);
    }

    public c(CrashType crashType, Context context, b bVar, d dVar) {
        this.f10301a = crashType;
        this.f10302b = context;
        this.d = bVar;
        this.f10304e = dVar;
    }

    public int a() {
        return 6;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    private com.apm.insight.entity.a b(com.apm.insight.entity.a aVar) {
        aVar.a(com.apm.insight.e.q(), com.apm.insight.e.r());
        if (com.apm.insight.e.n()) {
            aVar.a("is_mp", (Object) 1);
        }
        try {
            aVar.a(this.f10303c.getPluginInfo());
        } catch (Throwable th) {
            try {
                HashMap map = new HashMap();
                map.put("Data fetch failed since source misstake:\n" + m.a(th), 0);
                aVar.a(map);
            } catch (Throwable unused) {
            }
        }
        aVar.b(com.apm.insight.e.p());
        com.apm.insight.e.g();
        aVar.a("process_name", com.apm.insight.l.a.b());
        return aVar;
    }

    private com.apm.insight.entity.a c(com.apm.insight.entity.a aVar) {
        b bVar;
        if (!com.apm.insight.l.a.b(com.apm.insight.e.g())) {
            aVar.a("remote_process", (Object) 1);
        }
        aVar.a(com.smartdigimkt.o1.b.B0, Integer.valueOf(Process.myPid()));
        aVar.a(com.apm.insight.e.j());
        if (b() && (bVar = this.d) != null) {
            aVar.a(bVar);
        }
        try {
            aVar.a(this.f10303c.getPatchInfo());
        } catch (Throwable th) {
            try {
                aVar.a(Arrays.asList("Data fetch failed since source misstake:\n" + m.a(th)));
            } catch (Throwable unused) {
            }
        }
        String strK = com.apm.insight.e.k();
        if (strK != null) {
            aVar.a("business", (Object) strK);
        }
        aVar.a("is_background", Boolean.valueOf(!com.apm.insight.l.a.a()));
        return aVar;
    }

    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        return aVar;
    }

    public final com.apm.insight.entity.a a(com.apm.insight.entity.a aVar, a aVar2, boolean z2) {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        com.apm.insight.entity.a aVar3 = aVar;
        for (int i2 = 0; i2 < a(); i2++) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (aVar2 != null) {
                try {
                    aVar3 = aVar2.a(i2, aVar3);
                } catch (Throwable unused) {
                }
            }
            try {
                aVar3 = a(i2, aVar3);
            } catch (Throwable unused2) {
            }
            if (aVar2 != null) {
                try {
                    a();
                    aVar3 = aVar2.b(i2, aVar3);
                } catch (Throwable unused3) {
                }
                if (z2) {
                    if (i2 != 0) {
                        aVar.c(aVar3.c());
                    } else {
                        aVar = aVar3;
                    }
                    aVar3 = new com.apm.insight.entity.a();
                }
            }
            aVar.b("step_cost_".concat(String.valueOf(i2)), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
        }
        return a(aVar);
    }

    public com.apm.insight.entity.a a(int i2, com.apm.insight.entity.a aVar) {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        if (i2 == 0) {
            b(aVar);
            return aVar;
        }
        if (i2 == 1) {
            c(aVar);
            List<AttachUserData> listA = com.apm.insight.e.b().a(this.f10301a);
            HashMap map = new HashMap();
            JSONObject jSONObjectOptJSONObject = aVar.c().optJSONObject("custom");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
                aVar.a("custom", jSONObjectOptJSONObject);
            }
            if (listA != null) {
                for (int i3 = 0; i3 < listA.size(); i3++) {
                    try {
                        AttachUserData attachUserData = listA.get(i3);
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject, attachUserData.getUserData(this.f10301a));
                        map.put("custom_cost_" + attachUserData.getClass().getName() + "_" + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
                    } catch (Throwable th) {
                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject, th);
                    }
                }
            }
            try {
                jSONObjectOptJSONObject.put("fd_count", com.apm.insight.a.f());
            } catch (Throwable unused) {
            }
            List<AttachUserData> listB = com.apm.insight.e.b().b(this.f10301a);
            if (listB != null) {
                JSONObject jSONObjectOptJSONObject2 = aVar.c().optJSONObject("custom_long");
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new JSONObject();
                    aVar.a("custom_long", jSONObjectOptJSONObject2);
                }
                for (int i4 = 0; i4 < listB.size(); i4++) {
                    try {
                        AttachUserData attachUserData2 = listB.get(i4);
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, attachUserData2.getUserData(this.f10301a));
                        map.put("custom_cost_" + attachUserData2.getClass().getName() + "_" + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis2));
                    } catch (Throwable th2) {
                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, th2);
                    }
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                jSONObjectOptJSONObject.put((String) entry.getKey(), entry.getValue());
            }
        } else if (i2 != 2) {
            if (i2 == 5 && c()) {
                aVar.b(n.a());
                return aVar;
            }
        } else {
            d dVar = this.f10304e;
            aVar.a("battery", Integer.valueOf(dVar != null ? dVar.a() : 0));
            aVar.c(com.apm.insight.e.b().a());
            return aVar;
        }
        return aVar;
    }
}
