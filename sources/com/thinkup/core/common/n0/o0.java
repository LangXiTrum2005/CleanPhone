package com.thinkup.core.common.n0;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.a;
import com.smartdigimkt.o0.b;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.on.mmo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 extends o {
    int m;
    int nm;
    List<String> no;
    Context o;
    boolean nn = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f41965n = com.thinkup.core.common.n.o0n.m().o00();
    String n0 = com.thinkup.core.common.n.o0n.m().o0o();

    public o0(Context context, int i2, List<String> list) {
        this.o = context;
        this.no = list;
        this.m = list.size();
        this.nm = i2;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String m() {
        com.thinkup.core.common.mo.o();
        return com.thinkup.core.common.mo.om();
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, Object> m0() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final JSONObject mm() {
        JSONObject jSONObjectMm = super.mm();
        if (jSONObjectMm != null) {
            try {
                jSONObjectMm.put("tcp_tk_da_type", this.nm);
            } catch (Exception unused) {
            }
        }
        return jSONObjectMm;
    }

    @Override // com.thinkup.core.common.n0.o
    public final JSONObject mo() {
        JSONObject jSONObjectMo = super.mo();
        if (jSONObjectMo != null) {
            try {
                jSONObjectMo.put("app_id", this.f41965n);
                jSONObjectMo.put("nw_ver", com.thinkup.core.common.ooo.n0.on());
                Map<String, Object> mapNo = com.thinkup.core.common.n.o0n.m().no();
                if (mapNo != null) {
                    try {
                        if (mapNo.size() > 0) {
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
                }
                JSONArray jSONArray = new JSONArray();
                List<String> list = this.no;
                if (list != null && list.size() > 0) {
                    for (String str2 : this.no) {
                        if (!TextUtils.isEmpty(str2)) {
                            jSONArray.put(new JSONObject(str2));
                        }
                    }
                }
                jSONObjectMo.put("data", jSONArray);
            } catch (Exception unused2) {
            }
        }
        return jSONObjectMo;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, String> n() {
        return a.t("Content-Encoding", b.d, "Content-Type", "application/json;charset=utf-8");
    }

    @Override // com.thinkup.core.common.n0.o
    public final void n0() {
        if (this.nn) {
            JSONObject jSONObject = new JSONObject();
            Map<String, String> mapN = n();
            if (mapN != null) {
                try {
                    for (String str : mapN.keySet()) {
                        jSONObject.put(str, mapN.get(str));
                    }
                } catch (Exception unused) {
                }
            }
            String string = jSONObject.toString();
            String strMn = mn();
            com.thinkup.core.common.mo.o();
            com.thinkup.core.common.oo0.o().o(1, com.thinkup.core.common.mo.om(), string, strMn, mmo.o(1001));
        }
    }

    @Override // com.thinkup.core.common.n0.o
    public final int nm() {
        return 4;
    }

    @Override // com.thinkup.core.common.n0.o
    public final int o() {
        return 1;
    }

    @Override // com.thinkup.core.common.n0.o
    public final byte[] o0() {
        return o.o(mn());
    }

    @Override // com.thinkup.core.common.n0.o
    public final boolean o0o() {
        return true;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Context om() {
        return this.o;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String on() {
        return this.n0;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String oo() {
        return this.f41965n;
    }

    public final void oo0() {
        this.nn = true;
    }

    private static String m(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(AdError adError) {
    }

    @Override // com.thinkup.core.common.n0.o
    public final Object o(Object obj) {
        return Integer.valueOf(this.m);
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(int i2, o0o o0oVar) {
        com.thinkup.core.common.mo.o();
        if (!TextUtils.isEmpty(com.thinkup.core.common.mo.om())) {
            super.o(i2, o0oVar);
        } else if (o0oVar != null) {
            o0oVar.onLoadFinish(i2, Integer.valueOf(this.m));
        }
    }
}
