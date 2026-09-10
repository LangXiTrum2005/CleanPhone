package com.thinkup.core.common.n0;

import android.content.Context;
import androidx.media3.extractor.text.ttml.a;
import com.smartdigimkt.o0.b;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.on.mom;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class n0 extends o {
    private static final String o = "n0";
    private final mom m;

    public n0(mom momVar) {
        this.m = momVar;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String m() {
        com.thinkup.core.common.mo.o();
        return com.thinkup.core.common.mo.mm();
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, Object> m0() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String mn() {
        String string = mo().toString();
        String string2 = mm().toString();
        HashMap map = new HashMap();
        String strO = com.thinkup.core.common.ooo.mm.o(string);
        String strO2 = com.thinkup.core.common.ooo.mm.o(string2);
        map.put("p", strO);
        map.put("p2", strO2);
        mom momVar = this.m;
        if (momVar != null) {
            JSONArray jSONArrayO0 = momVar.o0();
            if (jSONArrayO0 != null) {
                map.put("wf", com.thinkup.core.common.ooo.mm.o(jSONArrayO0.toString()));
            }
            map.put(com.thinkup.core.common.oo.o.C0684o.nn, this.m.oo());
        }
        Set<String> setKeySet = map.keySet();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : setKeySet) {
                jSONObject.put(str, map.get(str));
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
    }

    @Override // com.thinkup.core.common.n0.o
    public final JSONObject mo() {
        JSONObject jSONObjectMo = super.mo();
        try {
            mom momVar = this.m;
            if (momVar != null) {
                jSONObjectMo.put("app_id", momVar.m());
                jSONObjectMo.put("pl_id", this.m.n());
                jSONObjectMo.put("t_g_id", this.m.om());
                jSONObjectMo.put("gro_id", this.m.on());
            }
        } catch (Throwable unused) {
        }
        return jSONObjectMo;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, String> n() {
        return a.t("Accept-Encoding", b.d, "Content-Type", "application/json;charset=utf-8");
    }

    @Override // com.thinkup.core.common.n0.o
    public final void n0() {
    }

    @Override // com.thinkup.core.common.n0.o
    public final boolean no() {
        return true;
    }

    @Override // com.thinkup.core.common.n0.o
    public final int o() {
        return 1;
    }

    @Override // com.thinkup.core.common.n0.o
    public final byte[] o0() {
        try {
            return mn().getBytes("utf-8");
        } catch (Exception unused) {
            return mn().getBytes();
        }
    }

    @Override // com.thinkup.core.common.n0.o
    public final Context om() {
        mom momVar = this.m;
        if (momVar != null) {
            return momVar.o();
        }
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String on() {
        mom momVar = this.m;
        return momVar != null ? momVar.n() : "";
    }

    @Override // com.thinkup.core.common.n0.o
    public final String oo() {
        mom momVar = this.m;
        return momVar != null ? momVar.m() : "";
    }

    @Override // com.thinkup.core.common.n0.o
    public final Object o(Object obj) {
        return obj;
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(AdError adError) {
    }
}
