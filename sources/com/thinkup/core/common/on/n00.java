package com.thinkup.core.common.on;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class n00 extends nnn {
    JSONObject o;

    public n00(String str, String str2, String str3, Map<String, Object> map, JSONObject jSONObject) {
        super(str, str2, str3, "", map, null, null, null);
        this.o = jSONObject;
        o(2);
    }

    public final JSONObject o() {
        return this.o;
    }
}
