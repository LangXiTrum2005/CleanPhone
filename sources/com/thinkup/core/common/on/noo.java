package com.thinkup.core.common.on;

import com.thinkup.core.api.TUAdConst;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class noo {
    boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42220n;
    int o;
    boolean o0;
    String om;
    String oo;

    private noo() {
    }

    public static noo o(boolean z2, String str, boolean z3, Map<String, Object> map) {
        noo nooVar = new noo();
        nooVar.o = 1;
        nooVar.m = z2;
        nooVar.f42220n = str;
        nooVar.o0 = z3;
        if (map != null) {
            try {
                Object obj = map.get(TUAdConst.REWARD_EXTRA.REWARD_INFO);
                if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    nooVar.oo = String.valueOf(map2.get(TUAdConst.REWARD_EXTRA.REWARD_INFO_ERROR_CODE));
                    nooVar.om = String.valueOf(map2.get(TUAdConst.REWARD_EXTRA.REWARD_INFO_ERROR_MSG));
                }
            } catch (Throwable unused) {
            }
        }
        return nooVar;
    }

    public final String m() {
        return this.oo;
    }

    public final String n() {
        return this.om;
    }

    public final JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.o);
            jSONObject.put("is_playend", this.m ? 1 : 2);
            jSONObject.put("url", this.f42220n);
            jSONObject.put("status", this.o0 ? 1 : 2);
            jSONObject.put("e_code", this.oo);
            jSONObject.put("e_reason", this.om);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
