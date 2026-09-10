package com.thinkup.core.common.n0;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.p004ironsource.d9;
import com.smartdigimkt.o0.b;
import com.smartdigimkt.w7.a;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends o {
    private long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f41946n;
    private final com.thinkup.core.common.on.o0m o;

    public n(com.thinkup.core.common.on.o0m o0mVar) {
        this.o = o0mVar;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String m() {
        com.thinkup.core.common.mo.o();
        return com.thinkup.core.common.mo.nm();
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, Object> m0() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String mn() {
        try {
            HashMap map = new HashMap();
            String strO = com.thinkup.core.common.ooo.mm.o(mo().toString());
            String strO2 = com.thinkup.core.common.ooo.mm.o(mm().toString());
            map.put("api_ver", o00());
            map.put("p", strO);
            map.put("p2", strO2);
            com.thinkup.core.common.on.o0m o0mVar = this.o;
            byte[] bArrO = o0mVar != null ? o0mVar.o() : null;
            if (bArrO != null && bArrO.length > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("enc_d", new String(bArrO));
                map.put("p3", com.thinkup.core.common.ooo.mm.o(jSONObject.toString()));
            }
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
            map.put("sign", com.thinkup.core.common.ooo.nm.n(on() + sb.toString()));
            return new JSONObject(map).toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.thinkup.core.common.n0.o
    public final JSONObject mo() {
        Object obj;
        JSONObject jSONObjectMo = super.mo();
        try {
            com.thinkup.core.common.on.o0m o0mVar = this.o;
            jSONObjectMo.put("app_id", o0mVar != null ? o0mVar.m() : "");
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
            try {
                JSONObject jSONObject = new JSONObject();
                com.thinkup.core.common.mo.n.o().o(jSONObject);
                if (jSONObject.length() > 0) {
                    jSONObjectMo.put("sdk_ext", jSONObject.toString());
                }
            } catch (Throwable unused) {
            }
            jSONObjectMo.putOpt("pil_s_fu", 1);
            jSONObjectMo.put("channel_from", com.thinkup.core.common.n.o0n.m().m00());
            Pair<Integer, List<String>> pairMo0 = com.thinkup.core.common.n.o0n.m().mo0();
            if (pairMo0 != null && (obj = pairMo0.first) != null) {
                jSONObjectMo.put("is_fdevice", ((Integer) obj).intValue());
            }
        } catch (Throwable unused2) {
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
        return 187;
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
        return arrayList;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Context om() {
        return com.thinkup.core.common.n.o0n.m().on();
    }

    @Override // com.thinkup.core.common.n0.o
    public final String on() {
        com.thinkup.core.common.on.o0m o0mVar = this.o;
        return o0mVar != null ? o0mVar.n() : "";
    }

    @Override // com.thinkup.core.common.n0.o
    public final String oo() {
        com.thinkup.core.common.on.o0m o0mVar = this.o;
        return o0mVar != null ? o0mVar.m() : "";
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(AdError adError) {
        String platformCode = adError.getPlatformCode();
        String platformMSG = adError.getPlatformMSG();
        com.thinkup.core.common.mo.o();
        com.thinkup.core.common.oo0.oo.o("dna", platformCode, platformMSG, com.thinkup.core.common.mo.nm(), "", "", "", (TUAdRequest) null);
    }

    @Override // com.thinkup.core.common.n0.o
    public final Object o(Object obj) {
        com.thinkup.core.common.oo0.oo.o("dna", (String) null, this.m, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f41946n, (TUAdRequest) null);
        return obj;
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(int i2, o0o o0oVar) {
        this.m = System.currentTimeMillis();
        this.f41946n = SystemClock.elapsedRealtime();
        super.o(i2, o0oVar);
    }
}
