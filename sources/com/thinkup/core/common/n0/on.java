package com.thinkup.core.common.n0;

import android.content.Context;
import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.d9;
import com.smartdigimkt.o0.b;
import com.thinkup.core.api.AdError;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class on extends o {
    @Override // com.thinkup.core.common.n0.o
    public final String m() {
        com.thinkup.core.common.mo.o();
        return com.thinkup.core.common.om.n.o().o(com.thinkup.core.common.mo.mo() ? com.thinkup.core.common.n.mo.oo.m0n : com.thinkup.core.common.n.mo.oo.o0m);
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, Object> m0() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String mn() {
        HashMap map = new HashMap();
        String strO = com.thinkup.core.common.ooo.mm.o(mo().toString());
        map.put("api_ver", "1.0");
        map.put("p", strO);
        ArrayList<String> arrayList = new ArrayList(map.size());
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (sb.length() > 0) {
                sb.append(d9.i.f24749c);
            }
            sb.append(str);
            sb.append(d9.i.f24747b);
            sb.append(map.get(str));
        }
        try {
            map.put("sign", URLEncoder.encode(com.thinkup.core.common.ooo.nm.n(com.thinkup.core.common.n.o0n.m().o0o() + sb.toString()), "utf-8"));
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        return new JSONObject(map).toString();
    }

    @Override // com.thinkup.core.common.n0.o
    public final JSONObject mo() {
        JSONObject jSONObjectMo = super.mo();
        try {
            jSONObjectMo.put("app_id", com.thinkup.core.common.n.o0n.m().o00());
            jSONObjectMo.put("curr_ts", System.currentTimeMillis());
        } catch (Exception unused) {
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
        return com.thinkup.core.common.n0.m.o0.o("get_area");
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
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String on() {
        return com.thinkup.core.common.n.o0n.m().o0o();
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
}
