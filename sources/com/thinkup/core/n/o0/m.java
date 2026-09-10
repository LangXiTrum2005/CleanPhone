package com.thinkup.core.n.o0;

import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0om;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class m {
    public static void o(JSONObject jSONObject, String str, o0mm o0mmVar, o0om o0omVar) {
        if (jSONObject != null) {
            try {
                if (o0mmVar.nnn() == -1) {
                    jSONObject.put("ad_format", str);
                } else {
                    jSONObject.put("ad_format", String.valueOf(o0mmVar.nnn()));
                }
                jSONObject.put("ad_source_id", o0mmVar.m0o());
                jSONObject.put("nw_firm_id", o0mmVar.nm());
                jSONObject.put("bidfloor", o(o0omVar, o0mmVar));
                if (o0n.m().omm()) {
                    jSONObject.put("test", 1);
                }
                jSONObject.put("p_bidfloor", o0mmVar.o0oo());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static double o(o0om o0omVar, o0mm o0mmVar) {
        double dDoubleValue = 0.0d;
        if (o0omVar.oo0 == 8) {
            Map<String, Double> map = o0omVar.ooo;
            Double d = map != null ? map.get(o0mmVar.m0o()) : null;
            if (d != null) {
                dDoubleValue = d.doubleValue();
                o0mmVar.o0(dDoubleValue);
            }
            o0mmVar.m0o();
            return dDoubleValue;
        }
        double dO0n0 = o0mmVar.o0n0();
        if (o0omVar.ono > 0.0d && o0mmVar.omon() == 1) {
            double dMax = Math.max(dO0n0, o0omVar.ono);
            o0mmVar.o0(dMax);
            o0mmVar.toString();
            return dMax;
        }
        o0mmVar.toString();
        return dO0n0;
    }
}
