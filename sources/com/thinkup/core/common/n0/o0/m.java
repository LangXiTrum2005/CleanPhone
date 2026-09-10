package com.thinkup.core.common.n0.o0;

import com.thinkup.core.common.mo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n0.m.m0;
import com.thinkup.core.common.n0.o0o;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends o0 {
    private static String m() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", o0n.m().o00());
            jSONObject.put("domain", com.thinkup.core.common.om.n.o().m());
            jSONObject.put("t_type", o0n.m().noo());
            jSONObject.put("sdk_ver", "UA_6.5.36");
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final m0 c_() {
        try {
            mo.o();
            return new m0(mo.n0(), mo.no());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final int n() {
        return 6;
    }

    public final void o(final o0o o0oVar) {
        o(new o0.o() { // from class: com.thinkup.core.common.n0.o0.m.1
            @Override // com.thinkup.core.common.n0.o0.o0.o
            public final void o(Object obj) {
                o0o o0oVar2 = o0oVar;
                if (o0oVar2 != null) {
                    o0oVar2.onLoadFinish(0, obj);
                }
            }

            @Override // com.thinkup.core.common.n0.o0.o0.o
            public final void o(Throwable th) {
                o0o o0oVar2 = o0oVar;
                if (o0oVar2 != null) {
                    o0oVar2.onLoadError(0, th.getMessage(), null);
                }
            }
        });
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final int o0() {
        return 3;
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final boolean om() {
        return false;
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final byte[] oo() {
        return o0.o(m());
    }
}
