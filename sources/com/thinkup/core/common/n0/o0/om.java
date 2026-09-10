package com.thinkup.core.common.n0.o0;

import androidx.datastore.preferences.protobuf.a;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.mmo;
import com.thinkup.core.common.on.no;
import com.thinkup.core.common.oo0;
import com.thinkup.core.common.ooo.mm;
import com.thinkup.core.common.ooo.nm;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class om extends o0 {
    boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f41972n = "om";
    List<no> o;

    public om(List<no> list) {
        this.o = list;
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final int n() {
        return 1;
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final void o(String str, String str2, String str3, int i2) {
        if (this.m) {
            return;
        }
        String strM = a.m(str3, ":", i2);
        List<no> list = this.o;
        com.thinkup.core.common.oo0.oo.o("tk", str, str2, strM, (String) null, String.valueOf(list != null ? list.size() : 0), "1", (TUAdRequest) null);
        oo0.o().o(3, "", "", o(true), mmo.o(1000));
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final int o0() {
        return 3;
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final boolean om() {
        return this.m;
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final int on() {
        return 6;
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final byte[] oo() {
        List<no> list = this.o;
        return (list == null || list.size() <= 0) ? new byte[0] : o0.o(o(false));
    }

    private String o(boolean z2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectM0 = m0();
        JSONObject jSONObjectMo = mo();
        try {
            jSONObjectM0.put("app_id", o0n.m().o00());
            jSONObjectM0.put("tcp_tk_da_type", this.mm);
            jSONObjectM0.put("tcp_rate", this.mn);
            Iterator<String> itKeys = jSONObjectMo.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectM0.put(next, jSONObjectMo.opt(next));
            }
            Map<String, Object> mapNo = o0n.m().no();
            if (mapNo != null && mapNo.size() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                for (String str : mapNo.keySet()) {
                    Object obj = mapNo.get(str);
                    if (obj != null) {
                        jSONObject2.put(str, obj.toString());
                    }
                }
                jSONObjectM0.put("custom", jSONObject2);
            }
        } catch (Throwable unused) {
        }
        String strO = mm.o(jSONObjectM0.toString());
        JSONArray jSONArray = new JSONArray();
        List<no> list = this.o;
        if (list != null) {
            Iterator<no> it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectO = it.next().o();
                if (z2 && jSONObjectO != null) {
                    try {
                        jSONObjectO.put("ofl", 1);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                jSONArray.put(jSONObjectO);
            }
        }
        String strO2 = mm.o(jSONArray.toString());
        String strN = nm.n(o0n.m().o0o() + "api_ver=1.0&common=" + strO + "&data=" + strO2);
        try {
            jSONObject.put("common", strO);
            jSONObject.put("data", strO2);
            jSONObject.put("api_ver", "1.0");
            jSONObject.put("sign", strN);
        } catch (Exception unused2) {
        }
        return jSONObject.toString();
    }
}
