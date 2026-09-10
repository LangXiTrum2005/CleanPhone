package com.thinkup.core.common.n0;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.smartdigimkt.o0.b;
import com.smartdigimkt.w7.a;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.basead.adx.api.TUAdxSetting;
import com.thinkup.core.common.on.nnn;
import com.thinkup.core.common.oon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class o0n extends o {
    public static final String m = "sdk_custom";
    private static final String nm = "YXBpdjQ=";
    private static final String o = "o0n";
    private final nnn m00;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Map<String, Object> f41975n;
    long n0;
    private String nn;
    long no;
    private String o00;
    private Context o0m;
    private String o0n;
    private String o0o;
    private int om0;
    private String omm;
    private JSONObject omn;
    private JSONObject omo;
    private final AtomicInteger on0 = new AtomicInteger(0);
    private String onm;
    private boolean onn;
    private TUAdRequest ono;
    private String oo0;
    private Map<String, Object> oom;
    private Map<String, String> oon;
    private String ooo;

    public o0n(Context context, nnn nnnVar) {
        this.omo = null;
        this.m00 = nnnVar;
        if (nnnVar != null) {
            this.o0n = nnnVar.m();
            this.oo0 = nnnVar.n();
            this.o0m = context;
            this.o0o = nnnVar.o0();
            this.nn = com.thinkup.core.common.n.o0n.m().o0m();
            this.o00 = com.thinkup.core.common.n.o0n.m().on(this.o0o);
            this.ooo = nnnVar.oo();
            this.f41975n = nnnVar.om();
            this.oom = nnnVar.on();
            this.om0 = nnnVar.m0();
            this.oon = nnnVar.mo();
            this.omo = nnnVar.mn();
            this.omm = nnnVar.n0();
            this.omn = nnnVar.no();
            this.ono = nnnVar.mm();
        }
    }

    private static boolean oom() {
        try {
            com.thinkup.core.common.n.o0n.m();
        } catch (Throwable unused) {
        }
        return false;
    }

    private synchronized void ooo() {
        try {
            m();
            oom();
        } catch (Throwable unused) {
        }
    }

    @Override // com.thinkup.core.common.n0.o
    public String m() {
        if (!TextUtils.isEmpty(this.onm)) {
            return this.onm;
        }
        com.thinkup.core.common.mo.o();
        return com.thinkup.core.common.mo.n();
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
    public JSONObject mo() {
        Object obj;
        Object obj2;
        JSONObject jSONObjectMo = super.mo();
        try {
            jSONObjectMo.put("app_id", this.o0n);
            jSONObjectMo.put("pl_id", this.o0o);
            jSONObjectMo.put("session_id", this.o00);
            jSONObjectMo.put("nw_ver", com.thinkup.core.common.ooo.n0.on());
            jSONObjectMo.put(a.H0, com.thinkup.core.common.o0m.o().o(this.o0m));
            if (com.thinkup.core.common.n.o0n.m().n0() != null) {
                jSONObjectMo.put("ecpoffer", com.thinkup.core.common.n.o0n.m().n0());
            }
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
            JSONObject jSONObjectO = oo.o(this.f41975n);
            if (jSONObjectO != null) {
                jSONObjectMo.put("custom", jSONObjectO);
            }
            jSONObjectMo.put(a.m0, com.thinkup.core.common.ooo.n0.nm(com.thinkup.core.common.n.o0n.m().on()));
            if (com.thinkup.core.common.n.o0n.m().omn()) {
                com.thinkup.core.common.n.o0n.m().on0().fillRequestParam(jSONObjectMo);
            }
            Map<String, Object> map = this.oom;
            if (map != null && (obj2 = map.get(TUAdConst.KEY.CP_PLACEMENT_ID)) != null) {
                jSONObjectMo.put("cp_pl_id", obj2.toString());
            }
            Map<String, String> map2 = this.oon;
            if (map2 != null && map2.size() != 0) {
                try {
                    jSONObjectMo.put("cached", new JSONObject(this.oon));
                } catch (Throwable unused) {
                }
            }
            jSONObjectMo.put("get_1st_rl", this.om0);
            JSONObject jSONObjectO2 = com.thinkup.core.o0.m.o().o(this.o0o);
            if (jSONObjectO2 != null) {
                jSONObjectMo.put("value_d", jSONObjectO2);
            }
            if (oon.o().o(this.o0o)) {
                jSONObjectMo.put("pl_type", 2);
            } else {
                jSONObjectMo.put("pl_type", 1);
            }
            if (TUAdxSetting.getInstance().isAdxNetworkMode(this.o0o)) {
                jSONObjectMo.put("is_s", 1);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = this.omo;
                if (jSONObject2 != null && jSONObject2.length() > 0) {
                    Iterator<String> itKeys = this.omo.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, this.omo.get(next));
                    }
                }
                if (jSONObject.length() > 0) {
                    jSONObjectMo.put("sdk_ext", jSONObject.toString());
                }
            } catch (Throwable unused2) {
            }
            jSONObjectMo.put("demand_ids", new JSONArray("[262]"));
            if (!TextUtils.isEmpty(this.omm)) {
                jSONObjectMo.put("debug_key", this.omm);
                JSONObject jSONObject3 = this.omn;
                if (jSONObject3 != null) {
                    jSONObjectMo.put("wf", jSONObject3);
                }
            }
            TUAdRequest tUAdRequest = this.ono;
            if (tUAdRequest != null) {
                jSONObjectMo.put("channel_from", tUAdRequest.getChannelSource());
            } else {
                jSONObjectMo.put("channel_from", com.thinkup.core.common.n.o0n.m().m00());
            }
            Pair<Integer, List<String>> pairMo0 = com.thinkup.core.common.n.o0n.m().mo0();
            if (pairMo0 != null && (obj = pairMo0.first) != null) {
                jSONObjectMo.put("is_fdevice", ((Integer) obj).intValue());
            }
            com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(com.thinkup.core.common.n.o0n.m().on()).m(com.thinkup.core.common.n.o0n.m().o00());
            if (mVarM != null) {
                String strOm = mVarM.om();
                if (!TextUtils.isEmpty(strOm)) {
                    jSONObjectMo.put("d_r_ls", strOm);
                }
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
    public final int nm() {
        return 191;
    }

    @Override // com.thinkup.core.common.n0.o
    public final com.thinkup.core.common.n0.m.o0 nn() {
        return com.thinkup.core.common.n0.m.o0.o("placement_strategy", this.o0o);
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
        return this.o0m;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String on() {
        return this.oo0;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String oo() {
        return this.o0n;
    }

    public final o0n oo0() {
        this.onn = true;
        return this;
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(int i2, o0o o0oVar) {
        this.n0 = System.currentTimeMillis();
        this.no = SystemClock.elapsedRealtime();
        super.o(i2, o0oVar);
    }

    @Override // com.thinkup.core.common.n0.o
    public final void m(int i2) {
        try {
            ooo();
            super.m(i2);
        } catch (Throwable unused) {
        }
    }

    private void o(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectO = com.thinkup.core.o0.m.o().o(this.o0o);
        if (jSONObjectO != null) {
            jSONObject.put("value_d", jSONObjectO);
        }
    }

    public final o0n m(String str) {
        this.onm = str;
        return this;
    }

    @Override // com.thinkup.core.common.n0.o
    public Object o(Object obj) {
        try {
            nnn nnnVar = this.m00;
            if (nnnVar != null) {
                nnnVar.m(this.onn);
            }
            com.thinkup.core.common.oo0.oo.o("placement", this.o0o, this.n0, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.no, this.ono);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (this.f41975n != null) {
                    jSONObject.put(m, new JSONObject(this.f41975n));
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return obj;
    }

    @Override // com.thinkup.core.common.n0.o
    public void o(AdError adError) {
        com.thinkup.core.common.oo0.oo.o("placement", adError.getPlatformCode(), adError.getPlatformMSG(), m(), this.o0o, "", "", this.ono);
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(int i2, int i3, String str, AdError adError) {
        if (this.mo != null) {
            oom();
            this.mo.onLoadError(i2, str, adError);
        }
        o(adError);
        m(i3);
    }
}
