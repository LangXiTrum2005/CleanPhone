package com.thinkup.core.common.n0;

import android.content.Context;
import androidx.media3.extractor.text.ttml.a;
import com.smartdigimkt.o0.b;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.common.on.mmo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class oom extends o {
    public static final int m = 2;
    public static final int m00 = 26;
    public static final int m0m = 28;
    public static final int m0o = 27;
    private static final String mo0 = "oom";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f41978n = 3;
    public static final int n0 = 4;
    public static final int nm = 6;
    public static final int nn = 7;
    public static final int no = 5;
    public static final int o = 1;
    public static final int o00 = 8;
    public static final int o0m = 10;
    public static final int o0n = 11;
    public static final int o0o = 9;
    public static final int om0 = 18;
    public static final int omm = 20;
    public static final int omn = 21;
    public static final int omo = 19;
    public static final int on0 = 22;
    public static final int onm = 24;
    public static final int onn = 25;
    public static final int ono = 23;
    public static final int oo0 = 12;
    public static final int oom = 15;
    public static final int oon = 16;
    public static final int ooo = 13;
    private List<com.thinkup.core.common.on.no> mm0;
    private int mmm;
    private com.thinkup.core.common.on.no mmo;
    private Context moo;
    boolean m0n = false;
    private String mom = com.thinkup.core.common.n.o0n.m().o00();
    private String mon = com.thinkup.core.common.n.o0n.m().o0o();

    public oom(Context context, int i2, List<com.thinkup.core.common.on.no> list) {
        this.moo = context;
        this.mmm = i2;
        this.mm0 = list;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String m() {
        com.thinkup.core.common.on.no noVar = this.mmo;
        if (noVar != null) {
            return noVar.m.om0m;
        }
        com.thinkup.core.common.mo.o();
        return com.thinkup.core.common.mo.oo();
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, Object> m0() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String mn() {
        JSONObject jSONObject = new JSONObject();
        String strO = com.thinkup.core.common.ooo.mm.o(mo().toString());
        JSONArray jSONArray = new JSONArray();
        List<com.thinkup.core.common.on.no> list = this.mm0;
        if (list != null) {
            Iterator<com.thinkup.core.common.on.no> it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectO = it.next().o();
                o(jSONObjectO);
                jSONArray.put(jSONObjectO);
            }
        } else {
            com.thinkup.core.common.on.no noVar = this.mmo;
            if (noVar != null) {
                JSONObject jSONObjectO2 = noVar.o();
                o(jSONObjectO2);
                jSONArray.put(jSONObjectO2);
            }
        }
        String strO2 = com.thinkup.core.common.ooo.mm.o(jSONArray.toString());
        StringBuilder sb = new StringBuilder();
        a.C(sb, this.mon, "api_ver=1.0&common=", strO, "&data=");
        sb.append(strO2);
        String strN = com.thinkup.core.common.ooo.nm.n(sb.toString());
        try {
            jSONObject.put("common", strO);
            jSONObject.put("data", strO2);
            jSONObject.put("api_ver", "1.0");
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
            jSONObjectMo.put("app_id", this.mom);
            jSONObjectMo.put("tcp_tk_da_type", this.mmm);
            Iterator<String> itKeys = jSONObjectMm.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectMo.put(next, jSONObjectMm.opt(next));
            }
            Map<String, Object> mapNo = com.thinkup.core.common.n.o0n.m().no();
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
        this.m0n = true;
        String strMn = mn();
        this.m0n = false;
        com.thinkup.core.common.oo0.o().o(1, m(), string, strMn, mmo.o(1000));
    }

    @Override // com.thinkup.core.common.n0.o
    public final int nm() {
        return 6;
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
        return this.moo;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String on() {
        return this.mon;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String oo() {
        return this.mom;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Object o(Object obj) {
        return obj;
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(AdError adError) {
        List<com.thinkup.core.common.on.no> list = this.mm0;
        com.thinkup.core.common.oo0.oo.o("tk", adError.getPlatformCode(), adError.getPlatformMSG(), m(), (String) null, String.valueOf(list != null ? list.size() : 1), "0", (TUAdRequest) null);
    }

    private void o(JSONObject jSONObject) {
        if (!this.m0n || jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("ofl", 1);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
