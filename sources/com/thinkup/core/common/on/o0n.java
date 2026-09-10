package com.thinkup.core.common.on;

import android.text.TextUtils;
import com.smartdigimkt.w7.a;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.mg.api.MgAdInfo;
import com.thinkup.core.mg.api.MgPreLoadAdRequest;
import com.thinkup.core.mg.api.MgPreLoadCallbackRegister;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o0n extends mnm {
    public static final int m = 5;
    public static final String o = "send_count";
    public String m0;
    public String m00;
    public String m0m;
    public String m0n;
    public String m0o;
    public String mm;
    public String mm0;
    public String mmm;
    public String mmn;
    public String mmo;
    public String mn;
    public String mn0;
    public String mnm;
    public String mnn;
    public String mno;
    public String mo;
    public String mo0;
    public String mom;
    public String mon;
    public String moo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f42235n;
    public String n0;
    public JSONObject n00;
    public String n0o;
    private TUAdRequest nmo;
    public String nn;
    public String nom;
    public String non;
    public JSONObject noo;
    public String o0;
    public String o00;
    public String o0m;
    public String o0n;
    public String o0o;
    public String om;
    public String om0;
    public String omm;
    public String omn;
    public String omo;
    public String on;
    public String on0;
    public String onm;
    public String onn;
    public String ono;
    public String oo;
    public String oo0;
    public String oom;
    public String oon;
    public String ooo;
    public int no = -1;
    public int nm = -1;
    public int n0m = -1;
    public int n0n = -1;
    public int no0 = -1;
    public int nm0 = com.thinkup.core.common.n.o0n.m().m00();

    private o0n() {
    }

    public final void o(n0 n0Var) {
        if (n0Var != null) {
            this.o0 = n0Var.oon0();
            this.oo = n0Var.oomn();
            this.mn0 = n0Var.oono();
            this.nn = String.valueOf(n0Var.oomo());
            this.m0 = String.valueOf(n0Var.no0());
            this.n0 = String.valueOf(n0Var.mnn());
            this.no = n0Var.n00();
            this.nm = n0Var.n0o();
            this.mn = n0Var.oomm();
            this.mnm = n0Var.ooo0();
            this.mnn = n0Var.oooo();
            this.nom = n0Var.oo0m();
            this.non = n0Var.oonn();
            o(n0Var.o());
        }
    }

    public o0n(String str, String str2) {
        this.mn0 = str;
        this.mno = str2;
    }

    public final void o(oom oomVar) {
        if (oomVar != null) {
            this.o0 = oomVar.om;
            this.oo = oomVar.o;
            this.m0 = String.valueOf(oomVar.o0);
            this.nn = String.valueOf(oomVar.f42254n);
            this.nom = oomVar.m0;
            this.non = oomVar.on;
            this.nm0 = oomVar.no;
        }
    }

    public final void o(com.thinkup.core.oo.n0 n0Var) {
        if (n0Var != null) {
            o(n0Var.o0n());
        }
    }

    public final void o(TUAdRequest tUAdRequest) {
        if (tUAdRequest != null) {
            this.nm0 = tUAdRequest.getChannelSource();
        } else {
            this.nm0 = com.thinkup.core.common.n.o0n.m().m00();
        }
        this.nmo = tUAdRequest;
    }

    @Override // com.thinkup.core.common.on.mnm
    public final JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", this.f42235n);
            jSONObject.put("requestid", this.o0);
            jSONObject.put("unitid", this.oo);
            jSONObject.put("psid", this.om);
            jSONObject.put("sessionid", this.on);
            jSONObject.put("groupid", this.m0);
            jSONObject.put("unitgroupid", this.mo);
            jSONObject.put("timestamp", this.mm);
            jSONObject.put("asid", this.mn);
            jSONObject.put("refresh", this.n0);
            int i2 = this.no;
            if (i2 != -1) {
                jSONObject.put("refresh_v2", i2);
            }
            int i3 = this.nm;
            if (i3 != -1) {
                jSONObject.put("load_mode", i3);
            }
            int i4 = this.no0;
            if (i4 != -1) {
                jSONObject.put("is_s", i4);
            }
            jSONObject.put("traffic_group_id", this.nn);
            jSONObject.put("msg", this.o00);
            jSONObject.put("msg1", this.o0o);
            jSONObject.put("msg2", this.o0m);
            jSONObject.put("msg3", this.o0n);
            jSONObject.put("msg4", this.oo0);
            jSONObject.put("msg5", this.ooo);
            jSONObject.put("msg6", this.oom);
            jSONObject.put("msg7", this.oon);
            jSONObject.put("msg8", this.om0);
            jSONObject.put("msg9", this.omo);
            jSONObject.put("msg10", this.omm);
            jSONObject.put("msg11", this.omn);
            jSONObject.put("msg12", this.on0);
            jSONObject.put("msg13", this.ono);
            jSONObject.put("msg14", this.onm);
            jSONObject.put("msg15", this.onn);
            jSONObject.put("msg16", this.m00);
            jSONObject.put("msg17", this.m0o);
            jSONObject.put("msg18", this.m0m);
            jSONObject.put("msg19", this.m0n);
            jSONObject.put("msg20", this.mo0);
            jSONObject.put("msg21", this.moo);
            jSONObject.put("msg22", this.mom);
            jSONObject.put("msg23", this.mon);
            jSONObject.put("msg24", this.mm0);
            jSONObject.put("msg25", this.mmo);
            jSONObject.put("msg26", this.mmm);
            jSONObject.put("msg27", this.mmn);
            jSONObject.put(com.thinkup.core.oo.n0.o.mnm, this.mnm);
            jSONObject.put("cp_pl_id", this.mnn);
            JSONObject jSONObject2 = this.n00;
            if (jSONObject2 != null) {
                jSONObject.put("p_c", jSONObject2);
            }
            jSONObject.put("real_p", this.n0o);
            int i5 = this.n0m;
            if (i5 != -1) {
                jSONObject.put("real_g", i5);
            }
            int i6 = this.n0n;
            if (i6 != -1) {
                jSONObject.put("real_t", i6);
            }
            JSONObject jSONObject3 = this.noo;
            if (jSONObject3 != null) {
                jSONObject.put(a.p0, jSONObject3);
            }
            if (!TextUtils.isEmpty(this.nom)) {
                jSONObject.put("x_c", new JSONArray(this.nom));
            }
            if (!TextUtils.isEmpty(this.non)) {
                jSONObject.put("o_r", this.non);
            }
            jSONObject.put("channel_from", this.nm0);
            TUAdRequest tUAdRequest = this.nmo;
            MgPreLoadAdRequest preLoadInfo = (tUAdRequest == null || tUAdRequest.getPreLoadInfo() == null) ? null : this.nmo.getPreLoadInfo();
            if (preLoadInfo != null) {
                String placementId = preLoadInfo.getPlacementId();
                String psId = preLoadInfo.getPsId();
                String requestId = preLoadInfo.getRequestId();
                if (!TextUtils.isEmpty(placementId)) {
                    jSONObject.put("mmed_pl_id", placementId);
                }
                if (!TextUtils.isEmpty(psId)) {
                    jSONObject.put("mmed_psid", psId);
                }
                if (!TextUtils.isEmpty(requestId)) {
                    jSONObject.put("mmed_req_id", requestId);
                }
                jSONObject.put("mmed_wait_price_sw", preLoadInfo.getCpEcpmSwitch());
                jSONObject.put("mmed_wait_price_t", preLoadInfo.getCpEcpmTimeout());
                MgPreLoadCallbackRegister preLoadCallbackRegister = preLoadInfo.getPreLoadCallbackRegister();
                MgAdInfo mgAdInfo = preLoadCallbackRegister != null ? preLoadCallbackRegister.getMgAdInfo() : null;
                double uSDEcpm = mgAdInfo != null ? mgAdInfo.getUSDEcpm() : 0.0d;
                if (uSDEcpm > 0.0d) {
                    jSONObject.put("mmed_price", String.valueOf(uSDEcpm));
                    return jSONObject;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static o0n o(String str) {
        o0n o0nVar = new o0n();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("key")) {
                    o0nVar.f42235n = jSONObject.optString("key", "");
                }
                if (jSONObject.has("requestid")) {
                    o0nVar.o0 = jSONObject.optString("requestid", "");
                }
                if (jSONObject.has("unitid")) {
                    o0nVar.oo = jSONObject.optString("unitid", "");
                }
                if (jSONObject.has("psid")) {
                    o0nVar.om = jSONObject.optString("psid", "");
                }
                if (jSONObject.has("sessionid")) {
                    o0nVar.on = jSONObject.optString("sessionid", "");
                }
                if (jSONObject.has("groupid")) {
                    o0nVar.m0 = jSONObject.optString("groupid", "");
                }
                if (jSONObject.has("unitgroupid")) {
                    o0nVar.mo = jSONObject.optString("unitgroupid", "");
                }
                if (jSONObject.has("timestamp")) {
                    o0nVar.mm = jSONObject.optString("timestamp", "");
                }
                if (jSONObject.has("asid")) {
                    o0nVar.mn = jSONObject.optString("asid", "");
                }
                if (jSONObject.has("refresh")) {
                    o0nVar.n0 = jSONObject.optString("refresh", "");
                }
                if (jSONObject.has("is_s")) {
                    o0nVar.no0 = jSONObject.optInt("is_s", 0);
                }
                if (jSONObject.has("traffic_group_id")) {
                    o0nVar.nn = jSONObject.optString("traffic_group_id", "");
                }
                if (jSONObject.has("msg")) {
                    o0nVar.o00 = jSONObject.optString("msg", "");
                }
                if (jSONObject.has("msg1")) {
                    o0nVar.o0o = jSONObject.optString("msg1", "");
                }
                if (jSONObject.has("msg2")) {
                    o0nVar.o0m = jSONObject.optString("msg2", "");
                }
                if (jSONObject.has("msg3")) {
                    o0nVar.o0n = jSONObject.optString("msg3", "");
                }
                if (jSONObject.has("msg4")) {
                    o0nVar.oo0 = jSONObject.optString("msg4", "");
                }
                if (jSONObject.has("msg5")) {
                    o0nVar.ooo = jSONObject.optString("msg5", "");
                }
                if (jSONObject.has("msg6")) {
                    o0nVar.oom = jSONObject.optString("msg6", "");
                }
                if (jSONObject.has("msg7")) {
                    o0nVar.oon = jSONObject.optString("msg7", "");
                }
                if (jSONObject.has("msg8")) {
                    o0nVar.om0 = jSONObject.optString("msg8", "");
                }
                if (jSONObject.has("msg9")) {
                    o0nVar.omo = jSONObject.optString("msg9", "");
                }
                if (jSONObject.has("msg10")) {
                    o0nVar.omm = jSONObject.optString("msg10", "");
                }
                if (jSONObject.has("msg11")) {
                    o0nVar.omn = jSONObject.optString("msg11", "");
                }
                if (jSONObject.has("msg12")) {
                    o0nVar.on0 = jSONObject.optString("msg12", "");
                }
                if (jSONObject.has("msg13")) {
                    o0nVar.ono = jSONObject.optString("msg13", "");
                }
                if (jSONObject.has("msg14")) {
                    o0nVar.onm = jSONObject.optString("msg14", "");
                }
                if (jSONObject.has("msg15")) {
                    o0nVar.onn = jSONObject.optString("msg15", "");
                }
                if (jSONObject.has(com.thinkup.core.oo.n0.o.mnm)) {
                    o0nVar.mnm = jSONObject.optString(com.thinkup.core.oo.n0.o.mnm, "");
                }
                if (jSONObject.has("cp_pl_id")) {
                    o0nVar.mnn = jSONObject.optString("cp_pl_id", "");
                }
                if (jSONObject.has("p_c")) {
                    o0nVar.n00 = jSONObject.optJSONObject("p_c");
                }
                if (jSONObject.has(a.p0)) {
                    o0nVar.noo = jSONObject.optJSONObject(a.p0);
                }
                o0nVar.n0o = jSONObject.optString("real_p", "");
                o0nVar.n0m = jSONObject.optInt("real_g", -1);
                o0nVar.n0n = jSONObject.optInt("real_t", -1);
                if (jSONObject.has("x_c")) {
                    o0nVar.nom = jSONObject.optString("x_c");
                    return o0nVar;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return o0nVar;
    }

    public final void o(o0mm o0mmVar) {
        if (o0mmVar != null) {
            o(o0mmVar.omo);
        }
    }

    public final void o(ono onoVar) {
        if (onoVar != null) {
            o(onoVar.f42249n);
        }
    }
}
