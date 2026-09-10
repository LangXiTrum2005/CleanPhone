package com.thinkup.core.common.o;

import android.content.Context;
import com.thinkup.core.common.n.oo0;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.ooo.onm;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mo {
    private static mo m = null;
    private static String o = "mo";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f42114n;
    private final String om = "rpr_";
    private final String on = "bid_";
    private final Map<String, o> o0 = new ConcurrentHashMap();
    private final Map<String, Long> oo = new ConcurrentHashMap(5);

    public static class o {
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f42115n;
        public long o;
    }

    private mo(Context context) {
        this.f42114n = context.getApplicationContext();
    }

    private static String n(String str) {
        return "rpr_".concat(String.valueOf(str));
    }

    public static mo o(Context context) {
        if (m == null) {
            synchronized (mo.class) {
                try {
                    if (m == null) {
                        m = new mo(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    private static String o0(String str) {
        return "bid_".concat(String.valueOf(str));
    }

    public final Boolean m(String str) {
        o oVar = this.o0.get(str);
        if (oVar == null) {
            return null;
        }
        long j = oVar.f42115n;
        if (j <= 0) {
            return Boolean.FALSE;
        }
        long jO = com.thinkup.core.common.n.o().o(str);
        if (jO <= 0) {
            return Boolean.FALSE;
        }
        return System.currentTimeMillis() - jO > j ? Boolean.FALSE : Boolean.TRUE;
    }

    public final void o(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.o0.remove(str);
            onm.o(this.f42114n, oo0.m.o00, n(str));
            onm.o(this.f42114n, oo0.m.o00, o0(str));
        } else {
            this.o0.put(str, o(jSONObject));
            onm.m(this.f42114n, oo0.m.o00, n(str), jSONObject.toString());
        }
    }

    private static o o(JSONObject jSONObject) {
        o oVar = new o();
        oVar.o = jSONObject.optLong("bid_inr", 0L);
        oVar.m = jSONObject.optInt("bid_pl_sw", 2);
        oVar.f42115n = jSONObject.optLong("bid_fail_interval", 0L);
        return oVar;
    }

    public final void o() {
        try {
            Map<String, ?> mapM = onm.m(this.f42114n, oo0.m.o00);
            if (mapM == null || mapM.size() <= 0) {
                return;
            }
            for (Map.Entry<String, ?> entry : mapM.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    if (key.startsWith("rpr_")) {
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            try {
                                o oVarO = o(new JSONObject((String) value));
                                this.o0.put(key.replace("rpr_", ""), oVarO);
                            } catch (Throwable unused) {
                            }
                        }
                    } else if (key.startsWith("bid_")) {
                        Object value2 = entry.getValue();
                        if (value2 instanceof Long) {
                            this.oo.put(key.replace("bid_", ""), (Long) value2);
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public final void o(String str, long j) {
        this.oo.put(str, Long.valueOf(j));
        onm.o(this.f42114n, oo0.m.o00, o0(str), j);
    }

    public final boolean o(String str) {
        Long l2;
        o oVar = this.o0.get(str);
        if (oVar == null) {
            return false;
        }
        long j = oVar.o;
        return j > 0 && (l2 = this.oo.get(str)) != null && System.currentTimeMillis() - l2.longValue() <= j;
    }

    public final Boolean o(o0mm o0mmVar) {
        o oVar = this.o0.get(o0mmVar.m0o());
        if (oVar == null) {
            return null;
        }
        if (oVar.m == 2) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
