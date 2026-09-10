package com.smartdigimkt.p6;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class i {
    private static String f = "i";
    private static i g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f37705a;
    private final String d = "rpr_";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f37708e = "bid_";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, a> f37706b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Long> f37707c = new ConcurrentHashMap(5);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f37709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f37710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f37711c;
    }

    private i(Context context) {
        this.f37705a = context.getApplicationContext();
    }

    public static i a(Context context) {
        if (g == null) {
            synchronized (i.class) {
                try {
                    if (g == null) {
                        g = new i(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    private String b(String str) {
        return android.support.v4.media.a.C("bid_", str);
    }

    public Boolean c(String str) {
        a aVar = this.f37706b.get(str);
        if (aVar == null) {
            return null;
        }
        long j = aVar.f37711c;
        if (j <= 0) {
            return Boolean.FALSE;
        }
        long jA = com.smartdigimkt.p6.a.a().a(str);
        if (jA <= 0) {
            return Boolean.FALSE;
        }
        return System.currentTimeMillis() - jA > j ? Boolean.FALSE : Boolean.TRUE;
    }

    public boolean d(String str) {
        Long l2;
        a aVar = this.f37706b.get(str);
        if (aVar == null) {
            return false;
        }
        long j = aVar.f37709a;
        return j > 0 && (l2 = this.f37707c.get(str)) != null && System.currentTimeMillis() - l2.longValue() <= j;
    }

    public void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f37706b.remove(str);
            com.smartdigimkt.n8.p.a(this.f37705a, com.smartdigimkt.g8.b.C0495b.o, a(str));
            com.smartdigimkt.n8.p.a(this.f37705a, com.smartdigimkt.g8.b.C0495b.o, b(str));
        } else {
            this.f37706b.put(str, a(jSONObject));
            com.smartdigimkt.n8.p.b(this.f37705a, com.smartdigimkt.g8.b.C0495b.o, a(str), jSONObject.toString());
        }
    }

    private String a(String str) {
        return android.support.v4.media.a.C("rpr_", str);
    }

    private a a(JSONObject jSONObject) {
        a aVar = new a();
        aVar.f37709a = jSONObject.optLong("bid_inr", 0L);
        aVar.f37710b = jSONObject.optInt("bid_pl_sw", 2);
        aVar.f37711c = jSONObject.optLong("bid_fail_interval", 0L);
        return aVar;
    }

    public void a() {
        try {
            Map<String, ?> mapB = com.smartdigimkt.n8.p.b(this.f37705a, com.smartdigimkt.g8.b.C0495b.o);
            if (mapB == null || mapB.size() <= 0) {
                return;
            }
            for (Map.Entry<String, ?> entry : mapB.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    if (key.startsWith("rpr_")) {
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            try {
                                a aVarA = a(new JSONObject((String) value));
                                this.f37706b.put(key.replace("rpr_", ""), aVarA);
                            } catch (Throwable unused) {
                            }
                        }
                    } else if (key.startsWith("bid_")) {
                        Object value2 = entry.getValue();
                        if (value2 instanceof Long) {
                            this.f37707c.put(key.replace("bid_", ""), (Long) value2);
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public void a(String str, long j) {
        this.f37707c.put(str, Long.valueOf(j));
        com.smartdigimkt.n8.p.b(this.f37705a, com.smartdigimkt.g8.b.C0495b.o, b(str), j);
    }

    public Boolean a(com.smartdigimkt.l8.f fVar) {
        a aVar = this.f37706b.get(fVar.h());
        if (aVar == null) {
            return null;
        }
        if (aVar.f37710b == 2) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
