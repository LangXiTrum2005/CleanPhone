package com.thinkup.core.common.n0;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.smartdigimkt.o0.b;
import com.smartdigimkt.w7.a;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class om extends o {
    private static final String m = "om";
    public static final String o = "custom";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f41976n;
    private String n0;
    private Context nm;
    private long nn;
    private String no;
    private long o00;
    private Map<String, String> o0m;
    private String o0n;
    private Map<String, Object> o0o;

    public om(Context context, com.thinkup.core.common.on.oo0 oo0Var) {
        if (oo0Var == null) {
            return;
        }
        this.o0o = com.thinkup.core.common.n.o0n.m().no();
        this.f41976n = oo0Var.o();
        this.n0 = oo0Var.m();
        this.nm = context;
        this.o0m = oo0Var.o0();
        this.no = oo0Var.n();
    }

    @Override // com.thinkup.core.common.n0.o
    public final String m() {
        if (!TextUtils.isEmpty(this.o0n)) {
            return this.o0n;
        }
        com.thinkup.core.common.mo.o();
        return com.thinkup.core.common.mo.m();
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, Object> m0() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final JSONObject mm() {
        return super.mm();
    }

    @Override // com.thinkup.core.common.n0.o
    public final JSONObject mo() {
        Object obj;
        JSONObject jSONObjectMo = super.mo();
        try {
            jSONObjectMo.put("app_id", this.f41976n);
            jSONObjectMo.put("nw_ver", com.thinkup.core.common.ooo.n0.on());
            String strOnm = com.thinkup.core.common.n.o0n.m().onm();
            if (!TextUtils.isEmpty(strOnm)) {
                jSONObjectMo.put(a.h0, strOnm);
            }
            String strOnn = com.thinkup.core.common.n.o0n.m().onn();
            if (TextUtils.isEmpty(strOnn)) {
                com.thinkup.core.common.n.o0n.m().mn(com.thinkup.core.common.n.o0n.m().ono());
                jSONObjectMo.put(a.i0, com.thinkup.core.common.n.o0n.m().ono());
            } else {
                jSONObjectMo.put(a.i0, strOnn);
            }
            JSONObject jSONObjectO = oo.o();
            if (jSONObjectO != null) {
                jSONObjectMo.put("custom", jSONObjectO);
            }
            jSONObjectMo.put(a.m0, com.thinkup.core.common.ooo.n0.nm(com.thinkup.core.common.n.o0n.m().on()));
            if (com.thinkup.core.common.n.o0n.m().omn()) {
                jSONObjectMo.put("is_test", 1);
            }
            Map<String, String> map = this.o0m;
            if (map != null && map.size() != 0) {
                try {
                    jSONObjectMo.put("cached", new JSONObject(this.o0m));
                } catch (Throwable unused) {
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                com.thinkup.core.common.mo.n.o().o(jSONObject);
                if (jSONObject.length() > 0) {
                    jSONObjectMo.put("sdk_ext", jSONObject.toString());
                }
            } catch (Throwable unused2) {
            }
            jSONObjectMo.putOpt("pil_s_fu", 1);
            if (!TextUtils.isEmpty(this.no)) {
                jSONObjectMo.put("debug_key", this.no);
            }
            jSONObjectMo.put("channel_from", com.thinkup.core.common.n.o0n.m().m00());
            Pair<Integer, List<String>> pairMo0 = com.thinkup.core.common.n.o0n.m().mo0();
            if (pairMo0 != null && (obj = pairMo0.first) != null) {
                jSONObjectMo.put("is_fdevice", ((Integer) obj).intValue());
            }
        } catch (JSONException unused3) {
        }
        return jSONObjectMo;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, String> n() {
        return androidx.media3.extractor.text.ttml.a.t("Accept-Encoding", b.d, "Content-Type", "application/json;charset=utf-8");
    }

    @Override // com.thinkup.core.common.n0.o
    public final void n0() {
    }

    @Override // com.thinkup.core.common.n0.o
    public int nm() {
        return 187;
    }

    @Override // com.thinkup.core.common.n0.o
    public final com.thinkup.core.common.n0.m.o0 nn() {
        return com.thinkup.core.common.n0.m.o0.o("app_strategy", this.f41976n);
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
    public final List<String> o0m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("anti");
        arrayList.add("http_type");
        return arrayList;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Context om() {
        return this.nm;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String on() {
        return this.n0;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String oo() {
        return this.f41976n;
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(int i2, o0o o0oVar) {
        this.nn = System.currentTimeMillis();
        this.o00 = SystemClock.elapsedRealtime();
        super.o(i2, o0oVar);
    }

    public final om m(String str) {
        this.o0n = str;
        return this;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Object o(Object obj) {
        try {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (this.o0o != null) {
                    jSONObject.put("custom", new JSONObject(this.o0o));
                }
            }
        } catch (Exception unused) {
        }
        com.thinkup.core.common.oo0.oo.o("app", (String) null, this.nn, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.o00, (TUAdRequest) null);
        return obj;
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(AdError adError) {
        com.thinkup.core.common.oo0.oo.o("app", adError.getPlatformCode(), adError.getPlatformMSG(), m(), "", "", "", (TUAdRequest) null);
    }
}
