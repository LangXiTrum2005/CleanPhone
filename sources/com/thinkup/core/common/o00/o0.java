package com.thinkup.core.common.o00;

import android.content.Context;
import androidx.media3.extractor.text.ttml.a;
import com.smartdigimkt.o0.b;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.common.mo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.ooo.mm;
import com.thinkup.core.common.ooo.nm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 extends com.thinkup.core.common.n0.o {
    private Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42137n;
    private String nm;
    private n0 nn;
    private com.thinkup.core.oo.n0 o00;
    private String o0m;
    private String o0o;
    boolean o = false;
    private String n0 = o0n.m().o00();
    private String no = o0n.m().o0o();

    public o0(Context context, int i2, String str, n0 n0Var, com.thinkup.core.oo.n0 n0Var2, String str2, String str3) {
        this.m = context;
        this.f42137n = i2;
        this.nn = n0Var;
        this.o00 = n0Var2;
        this.o0o = str2;
        this.o0m = str3;
        this.nm = str;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String m() {
        mo.o();
        return mo.o0();
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, Object> m0() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String mn() {
        JSONObject jSONObject = new JSONObject();
        String strO = mm.o(mo().toString());
        StringBuilder sb = new StringBuilder();
        a.C(sb, this.no, "api_ver=2.0&common=", strO, "&data=");
        sb.append(this.nm);
        sb.append("&ss_a=");
        sb.append(this.f42137n);
        String strN = nm.n(sb.toString());
        try {
            jSONObject.put("common", strO);
            jSONObject.put("ss_a", this.f42137n);
            jSONObject.put("data", this.nm);
            jSONObject.put("api_ver", "2.0");
            jSONObject.put("sign", strN);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.thinkup.core.common.n0.o
    public final JSONObject mo() throws JSONException {
        JSONObject jSONObjectMo = super.mo();
        JSONObject jSONObjectMm = super.mm();
        try {
            jSONObjectMo.put("app_id", this.n0);
            Iterator<String> itKeys = jSONObjectMm.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectMo.put(next, jSONObjectMm.opt(next));
            }
            Map<String, Object> mapNo = o0n.m().no();
            if (mapNo != null && mapNo.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                for (String str : mapNo.keySet()) {
                    Object obj = mapNo.get(str);
                    if (obj != null) {
                        jSONObject.put(str, obj.toString());
                    }
                }
                jSONObjectMo.put("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
        return jSONObjectMo;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, String> n() {
        return a.t("Content-Encoding", b.d, "Content-Type", "application/json;charset=utf-8");
    }

    @Override // com.thinkup.core.common.n0.o
    public final void n0() {
    }

    @Override // com.thinkup.core.common.n0.o
    public final com.thinkup.core.common.n0.m.o0 nn() {
        return com.thinkup.core.common.n0.m.o0.o("s2s_reward");
    }

    @Override // com.thinkup.core.common.n0.o
    public final int o() {
        return 1;
    }

    @Override // com.thinkup.core.common.n0.o
    public final byte[] o0() {
        return com.thinkup.core.common.n0.o.o(mn());
    }

    @Override // com.thinkup.core.common.n0.o
    public final String o00() {
        return "2.0";
    }

    @Override // com.thinkup.core.common.n0.o
    public final List<String> o0m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("anti");
        return arrayList;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Context om() {
        return this.m;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String on() {
        return this.no;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String oo() {
        return this.n0;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Object o(Object obj) {
        return obj;
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(AdError adError) {
        try {
            if (!ErrorCode.httpStatuException.equals(adError.getCode())) {
                if (this.o) {
                    com.thinkup.core.common.oo0.oo.o("1004658", this.o0o, this.o0m, this.nn, this.o00, adError.getPlatformCode(), adError.getPlatformMSG());
                    return;
                } else {
                    this.o = true;
                    com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.common.o00.o0.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            o0 o0Var = o0.this;
                            o0Var.o(0, ((com.thinkup.core.common.n0.o) o0Var).mo);
                        }
                    }, 5000L);
                    return;
                }
            }
            com.thinkup.core.common.oo0.oo.o("1004658", this.o0o, this.o0m, this.nn, this.o00, adError.getPlatformCode(), adError.getPlatformMSG());
        } catch (Throwable unused) {
        }
    }
}
