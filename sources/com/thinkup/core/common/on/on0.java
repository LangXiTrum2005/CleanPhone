package com.thinkup.core.common.on;

import android.text.TextUtils;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.p004ironsource.m5;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.basead.adx.api.ITUAdxHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class on0 extends om0 implements Comparable<on0> {
    public static final String om0 = "";
    public static final String omm = "PD";
    public static final String omn = "PA";
    public static final String omo = "PDB";
    public static final int on0 = 0;
    public static final int onm = 2;
    public static final int onn = 3;
    public static final int ono = 1;
    public String m;
    public String m0;
    private final String m00;
    private o0mm m0m;
    private String m0n;
    private boolean m0o;
    public String mm;
    private int mm0;
    private String mmm;
    private int mmn;
    private boolean mmo;
    public String mn;
    private String mn0;
    private int mnm;
    private String mnn;
    private String mno;
    public String mo;
    private o mo0;
    private double mom;
    private String mon;
    private ITUAdxHandler moo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f42247n;
    public double n0;
    private int n00;
    private boolean n0m;
    private String n0o;
    public int nm;
    public double nn;
    public String no;
    public int o;
    public int o0;
    public double o00;
    public double o0m;
    public com.thinkup.core.n.n.m o0n;
    public String o0o;
    public long om;
    public String on;
    public long oo;
    public boolean oo0;
    public oo0m oom;
    public JSONObject oon;
    public List<omn> ooo;

    public interface o {
        void m();

        void o();
    }

    public on0(boolean z2, double d, String str, String str2, String str3, String str4, String str5) {
        super(z2, d, str, str2, str3, str4, str5, TUAdConst.CURRENCY.USD);
        this.m00 = "on0:";
        this.mom = 0.0d;
        this.mmn = -1;
        this.mno = "";
        this.mnm = 0;
    }

    private oo0m omn() {
        return this.oom;
    }

    private o on0() {
        return this.mo0;
    }

    private List<omn> ono() {
        return this.ooo;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(on0 on0Var) {
        return com.thinkup.core.common.ooo.mn.o(this, on0Var);
    }

    public final String m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bid_id", this.token);
            jSONObject.put(BidResponsed.KEY_CUR, this.m);
            jSONObject.put("origin_price", this.originPrice);
            jSONObject.put("price", this.price);
            jSONObject.put(m5.f25674A, this.winNoticeUrl);
            jSONObject.put(m5.f25678z, this.loseNoticeUrl);
            jSONObject.put("unit_id", this.f42247n);
            jSONObject.put("nw_firm_id", this.o0);
            jSONObject.put("is_success", this.isSuccess ? 1 : 0);
            jSONObject.put("err_code", this.o);
            jSONObject.put("err_msg", this.errorMsg);
            jSONObject.put("expire", this.oo);
            jSONObject.put("out_data_time", this.om);
            jSONObject.put("is_send_winurl", this.m0o);
            jSONObject.put("tp_bid_id", this.on);
            jSONObject.put(m5.y, this.displayNoticeUrl);
            jSONObject.put("ad_source_id", this.mn);
            jSONObject.put("cur_rate", this.n0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("hb_preq_sw", this.nm);
            jSONObject.put("ctrl", jSONObject2);
            if (!TextUtils.isEmpty(this.no)) {
                jSONObject.put("bid_response", this.no);
            }
            jSONObject.put("ecpm_api", this.nn);
            jSONObject.put("cny_ecpm_api", this.o00);
            jSONObject.put("precision", this.o0o);
            jSONObject.put("second_price", this.o0m);
            jSONObject.put("req_url", this.m0);
            jSONObject.put("bd_type", this.useType);
            jSONObject.put("s_pty", this.sortPrice);
            jSONObject.put("cny_price", this.rmbPrice);
            jSONObject.put("request_id", this.m0n);
            jSONObject.put("a_r", this.mom);
            Object obj = this.oon;
            if (obj != null) {
                jSONObject.put("adx_ctrl", obj);
            }
            if (!TextUtils.isEmpty(this.mon)) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("e_c", this.mon);
                jSONObject3.put("id", this.mm0);
                if (!TextUtils.isEmpty(this.mmm)) {
                    jSONObject3.put("cny_e_c", this.mmm);
                }
                jSONObject.put("e_key_data", jSONObject3);
            }
            jSONObject.put("adx_mtg_mix_type", this.mmn);
            jSONObject.put("deal_type", this.mno);
            jSONObject.put("deal_id", this.mnn);
            jSONObject.put("deal_pri", this.n00);
            jSONObject.put("origin_request_id", getOriginRequestId());
            jSONObject.put("x_c", this.n0o);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized void m0() {
        List<omn> list = this.ooo;
        if (list != null) {
            list.clear();
        }
    }

    public final double mm() {
        return this.mom;
    }

    public final o0mm mn() {
        return this.m0m;
    }

    public final ITUAdxHandler mo() {
        return this.moo;
    }

    public final String n() {
        return this.m0n;
    }

    public final String n0() {
        return this.mon;
    }

    public final int nm() {
        return this.mm0;
    }

    public final boolean nn() {
        return this.mmo;
    }

    public final String no() {
        return this.mmm;
    }

    public final boolean o() {
        return this.om < System.currentTimeMillis();
    }

    public final synchronized boolean o0() {
        if (this.m0o) {
            return true;
        }
        this.m0o = true;
        return false;
    }

    public final void o00() {
        this.mmo = true;
    }

    public final boolean o0m() {
        return this.mnm != 0;
    }

    public final int o0n() {
        return this.mnm;
    }

    public final String o0o() {
        return this.mn0;
    }

    public final synchronized o0mm om() {
        o0mm o0mmVar;
        List<omn> list = this.ooo;
        o0mmVar = null;
        if (list != null) {
            Iterator<omn> it = list.iterator();
            while (it.hasNext()) {
                o0mm o0mmVarO = it.next().o();
                if (o0mmVarO != null && com.thinkup.core.common.ooo.mn.o(o0mmVarO, o0mmVar) < 0) {
                    o0mmVar = o0mmVarO;
                }
            }
        }
        return o0mmVar;
    }

    public final void om0() {
        this.n0m = true;
    }

    public final com.thinkup.core.o.o.n omm() {
        com.thinkup.core.o.o.n nVar = new com.thinkup.core.o.o.n();
        nVar.o = this.isSuccess;
        nVar.m = this.token;
        nVar.f42431n = Double.valueOf(this.price);
        nVar.o0 = this.winNoticeUrl;
        nVar.oo = this.loseNoticeUrl;
        nVar.on = this.errorMsg;
        nVar.m0 = this.m;
        nVar.mo = this.f42247n;
        nVar.mm = this.o0;
        nVar.mn = this.o;
        nVar.n0 = this.oo;
        nVar.no = this.om;
        nVar.nm = this.m0o;
        nVar.nn = this.mo;
        nVar.o00 = this.on;
        nVar.o0o = this.mm;
        nVar.o0m = this.mn;
        nVar.o0n = this.n0;
        nVar.oo0 = this.nn;
        nVar.ooo = this.o00;
        nVar.oom = this.o0o;
        nVar.oon = this.m0;
        nVar.om0 = this.useType;
        nVar.omo = this.sortPrice;
        nVar.omm = this.originPrice;
        nVar.omn = this.rmbPrice;
        nVar.on0 = this.mom;
        nVar.ono = this.m0n;
        nVar.onm = this.mmn;
        nVar.onn = this.mno;
        nVar.m00 = this.mnm;
        nVar.m0o = this.mnn;
        nVar.m0m = this.n00;
        nVar.m0n = this.originRequestId;
        nVar.mo0 = this.n0o;
        nVar.moo = this.mon;
        nVar.mom = this.mmm;
        nVar.mon = this.mm0;
        return nVar;
    }

    public final boolean omo() {
        return this.n0m;
    }

    public final synchronized o0mm on() {
        o0mm o0mmVar;
        List<omn> list = this.ooo;
        o0mmVar = null;
        if (list != null) {
            Iterator<omn> it = list.iterator();
            while (it.hasNext()) {
                o0mm o0mmVarM = it.next().m();
                if (o0mmVarM != null && com.thinkup.core.common.ooo.mn.o(o0mmVarM, o0mmVar) < 0) {
                    o0mmVar = o0mmVarM;
                }
            }
        }
        return o0mmVar;
    }

    public final synchronized void oo() {
        this.biddingNotice = null;
    }

    public final String oo0() {
        return this.mno;
    }

    public final int oom() {
        return this.n00;
    }

    public final String oon() {
        return this.n0o;
    }

    public final String ooo() {
        return this.mnn;
    }

    public static on0 o(String str) {
        try {
            return o(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void n(String str) {
        this.mn0 = str;
    }

    public static on0 o(JSONObject jSONObject) {
        try {
            on0 on0Var = new on0(jSONObject.optInt("is_success") == 1, jSONObject.has("price") ? jSONObject.optDouble("price", 0.0d) : 0.0d, jSONObject.optString("bid_id"), jSONObject.optString(m5.f25674A), jSONObject.optString(m5.f25678z), jSONObject.optString(m5.y), jSONObject.optString("err_msg"));
            on0Var.m = jSONObject.optString(BidResponsed.KEY_CUR);
            on0Var.f42247n = jSONObject.optString("unit_id");
            on0Var.o0 = jSONObject.optInt("nw_firm_id");
            on0Var.o = jSONObject.optInt("err_code");
            on0Var.oo = jSONObject.optLong("expire");
            on0Var.om = jSONObject.optLong("out_data_time");
            on0Var.m0o = jSONObject.optBoolean("is_send_winurl");
            on0Var.mo = jSONObject.optString("offer_data");
            on0Var.on = jSONObject.optString("tp_bid_id");
            on0Var.mm = jSONObject.optString("burl_win");
            on0Var.mn = jSONObject.optString("ad_source_id");
            on0Var.n0 = jSONObject.optDouble("cur_rate", 0.0d);
            on0Var.no = jSONObject.optString("bid_response");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ctrl");
            if (jSONObjectOptJSONObject != null) {
                on0Var.nm = jSONObjectOptJSONObject.optInt("hb_preq_sw");
            }
            on0Var.nn = jSONObject.optDouble("ecpm_api", 0.0d);
            on0Var.o00 = jSONObject.optDouble("cny_ecpm_api", 0.0d);
            on0Var.o0o = jSONObject.optString("precision");
            on0Var.o0m = jSONObject.optDouble("second_price", 0.0d);
            on0Var.m0 = jSONObject.optString("req_url", "");
            on0Var.useType = jSONObject.optInt("bd_type", 1);
            double dOptDouble = jSONObject.optDouble("s_pty", on0Var.price);
            on0Var.sortPrice = dOptDouble;
            on0Var.originPrice = jSONObject.optDouble("origin_price", dOptDouble);
            on0Var.rmbPrice = jSONObject.optDouble("cny_price", 0.0d);
            int i2 = on0Var.o0;
            if (i2 == 1) {
                double d = on0Var.nn;
                if (d > 0.0d) {
                    on0Var.price = d;
                    on0Var.sortPrice = d;
                }
                double d2 = on0Var.o00;
                if (d2 > 0.0d) {
                    on0Var.rmbPrice = d2;
                }
            }
            if (i2 == 66) {
                on0Var.mom = jSONObject.optDouble("a_r", 0.0d);
            }
            Object objOpt = jSONObject.opt("request_id");
            if (objOpt != null) {
                on0Var.m0n = objOpt.toString();
            }
            on0Var.oon = jSONObject.optJSONObject("adx_ctrl");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("e_key_data");
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                on0Var.mon = jSONObjectOptJSONObject2.optString("e_c");
                on0Var.mmm = jSONObjectOptJSONObject2.optString("cny_e_c");
                on0Var.mm0 = jSONObjectOptJSONObject2.optInt("id");
            }
            byte b2 = -1;
            on0Var.mmn = jSONObject.optInt("adx_mtg_mix_type", -1);
            String strOptString = jSONObject.optString("deal_type", "");
            on0Var.mno = strOptString;
            int iHashCode = strOptString.hashCode();
            if (iHashCode != 0) {
                if (iHashCode != 2545) {
                    if (iHashCode != 2548) {
                        if (iHashCode == 79054 && strOptString.equals("PDB")) {
                            b2 = 0;
                        }
                    } else if (strOptString.equals("PD")) {
                        b2 = 1;
                    }
                } else if (strOptString.equals("PA")) {
                    b2 = 2;
                }
            } else if (strOptString.equals("")) {
                b2 = 3;
            }
            if (b2 == 0) {
                on0Var.mnm = 3;
            } else if (b2 == 1) {
                on0Var.mnm = 2;
            } else if (b2 != 2) {
                on0Var.mnm = 0;
            } else {
                on0Var.mnm = 1;
            }
            on0Var.mnn = jSONObject.optString("deal_id", "");
            on0Var.n00 = jSONObject.optInt("deal_pri", 0);
            on0Var.setOriginRequestId(jSONObject.optString("origin_request_id", ""));
            on0Var.n0o = jSONObject.optString("x_c", "");
            return on0Var;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void oo(String str) {
        this.mmm = str;
    }

    private void o0(String str) {
        this.mon = str;
    }

    public on0(boolean z2, double d, double d2, String str, String str2, String str3, String str4, String str5) {
        super(z2, d2, str, str2, str3, str4, str5, TUAdConst.CURRENCY.USD);
        this.m00 = "on0:";
        this.mom = 0.0d;
        this.mmn = -1;
        this.mno = "";
        this.mnm = 0;
        this.sortPrice = d;
    }

    public final void m(String str) {
        this.m0n = str;
    }

    private void m(int i2) {
        this.mm0 = i2;
    }

    private int o(on0 on0Var) {
        return com.thinkup.core.common.ooo.mn.o(this, on0Var);
    }

    public final synchronized void o(omn omnVar) {
        if (omnVar == null) {
            return;
        }
        try {
            if (this.ooo == null) {
                this.ooo = Collections.synchronizedList(new ArrayList(4));
            }
            if (!this.ooo.contains(omnVar)) {
                this.ooo.add(omnVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void o(oo0m oo0mVar) {
        this.oom = oo0mVar;
    }

    public final void o(ITUAdxHandler iTUAdxHandler) {
        this.moo = iTUAdxHandler;
    }

    private void o(o oVar) {
        this.mo0 = oVar;
    }

    public final void o(o0mm o0mmVar, double d) {
        this.m0m = o0mmVar;
        this.o0m = d;
    }

    public final int o(int i2) {
        int i3 = this.mmn;
        if (i3 < 0 || i2 != 4) {
            return -1;
        }
        return i3 == 5 ? 3 : 4;
    }
}
