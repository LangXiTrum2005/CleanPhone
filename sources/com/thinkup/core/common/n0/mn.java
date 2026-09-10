package com.thinkup.core.common.n0;

import android.content.Context;
import com.thinkup.core.api.AdError;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class mn extends o {
    private static String oo0() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", com.thinkup.core.common.n.o0n.m().o00());
            jSONObject.put("domain", com.thinkup.core.common.om.n.o().m());
            jSONObject.put("t_type", com.thinkup.core.common.n.o0n.m().noo());
            jSONObject.put("sdk_ver", "UA_6.5.36");
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.thinkup.core.common.n0.o
    public final String m() {
        com.thinkup.core.common.mo.o();
        return com.thinkup.core.common.mo.mn();
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, Object> m0() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, String> n() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final void n0() {
    }

    @Override // com.thinkup.core.common.n0.o
    public final com.thinkup.core.common.n0.m.o0 nn() {
        return com.thinkup.core.common.n0.m.o0.o("get_cdn_domain");
    }

    @Override // com.thinkup.core.common.n0.o
    public final int o() {
        return 1;
    }

    @Override // com.thinkup.core.common.n0.o
    public final byte[] o0() {
        return oo0().getBytes();
    }

    @Override // com.thinkup.core.common.n0.o
    public final Context om() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String on() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String oo() {
        return com.thinkup.core.common.n.o0n.m().o00();
    }

    @Override // com.thinkup.core.common.n0.o
    public final Object o(Object obj) {
        return obj;
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(AdError adError) {
    }

    @Override // com.thinkup.core.common.n0.o
    public final boolean o(int i2) {
        return false;
    }
}
