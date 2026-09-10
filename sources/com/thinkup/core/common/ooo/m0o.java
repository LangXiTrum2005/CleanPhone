package com.thinkup.core.common.ooo;

import com.thinkup.core.api.TUAdConst;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class m0o {
    public static JSONObject o(Map<String, Object> map) {
        Object obj = map.get(TUAdConst.KEY.M_S);
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).optJSONObject(com.thinkup.core.oo.m0.m.o);
        }
        return null;
    }
}
