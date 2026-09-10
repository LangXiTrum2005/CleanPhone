package com.thinkup.core.common.n0.o0;

import android.text.TextUtils;
import com.p004ironsource.d9;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.mmo;
import com.thinkup.core.common.oo0;
import com.thinkup.core.common.ooo.mm;
import com.thinkup.core.common.ooo.n0;
import com.thinkup.core.common.ooo.nm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends o0 {
    int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f41967n;
    private final String n0 = "o";
    List<String> o;

    public o(List<String> list) {
        this.o = list;
        this.m = list.size();
    }

    private String mm() {
        JSONObject jSONObjectM0 = m0();
        JSONObject jSONObjectMo = mo();
        if (jSONObjectM0 != null) {
            try {
                jSONObjectM0.put("app_id", o0n.m().o00());
                jSONObjectM0.put("nw_ver", n0.on());
                JSONArray jSONArray = new JSONArray();
                List<String> list = this.o;
                if (list != null && list.size() > 0) {
                    for (String str : this.o) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONArray.put(new JSONObject(str));
                        }
                    }
                }
                jSONObjectM0.put("data", jSONArray);
            } catch (Exception unused) {
            }
        }
        if (jSONObjectMo != null) {
            try {
                jSONObjectMo.put("tcp_tk_da_type", this.mm);
                jSONObjectMo.put("tcp_rate", this.mn);
            } catch (Exception unused2) {
            }
        }
        HashMap map = new HashMap();
        String strO = mm.o(jSONObjectM0.toString());
        String strO2 = mm.o(jSONObjectMo.toString());
        map.put("api_ver", "1.0");
        map.put("p", strO);
        map.put("p2", strO2);
        ArrayList<String> arrayList = new ArrayList(map.size());
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String str2 : arrayList) {
            if (sb.length() > 0) {
                sb.append(d9.i.f24749c);
            }
            sb.append(str2);
            sb.append(d9.i.f24747b);
            sb.append(map.get(str2));
        }
        map.put("sign", nm.n(o0n.m().o0o() + sb.toString()));
        return new JSONObject(map).toString();
    }

    public final int m() {
        return this.m;
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final int n() {
        return 2;
    }

    public final void o() {
        this.f41967n = true;
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
    public final int on() {
        return 4;
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final byte[] oo() {
        return o0.o(mm());
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final void o(String str, String str2, String str3, int i2) {
        if (this.f41967n) {
            oo0.o().o(3, "", "", mm(), mmo.o(1001));
        }
    }
}
