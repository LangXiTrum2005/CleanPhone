package com.smartdigimkt.y6;

import android.text.TextUtils;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.p004ironsource.m5;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.sdk.api.format.SDMLossInfo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b extends a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public SDMLossInfo f40238A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f40239B;
    public String C;
    public String D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public double f40240E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public double f40241F;
    public double G;
    public String H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private String f40242I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public double f40243J;
    public JSONObject K;
    public String L;
    public int M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f40244N;
    public String O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f40245P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f40246Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f40247R;
    public String S;
    public int T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public String f40248U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public JSONObject f40249V;
    private final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f40250p;
    public String q;
    public String r;
    public int s;
    public long t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f40251u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f40252w;
    private boolean x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f40253z;

    public b(boolean z2, double d, String str, String str2, String str3, String str4, String str5) {
        super(z2, d, str, str2, str3, str4, str5, SDMAdConst.CURRENCY.USD);
        this.o = getClass().getSimpleName().concat(":");
        this.f40243J = 0.0d;
        this.f40245P = -1;
        this.f40246Q = "";
        this.f40247R = 0;
    }

    public static b a(JSONObject jSONObject) {
        try {
            b bVar = new b(jSONObject.optInt("is_success") == 1, jSONObject.has("price") ? jSONObject.optDouble("price", 0.0d) : 0.0d, jSONObject.optString("bid_id"), jSONObject.optString(m5.f25674A), jSONObject.optString(m5.f25678z), jSONObject.optString(m5.y), jSONObject.optString("err_msg"));
            bVar.q = jSONObject.optString(BidResponsed.KEY_CUR);
            bVar.r = jSONObject.optString("unit_id");
            bVar.s = jSONObject.optInt("nw_firm_id");
            bVar.f40250p = jSONObject.optInt("err_code");
            bVar.t = jSONObject.optLong("expire");
            bVar.f40251u = jSONObject.optLong("out_data_time");
            bVar.x = jSONObject.optBoolean("is_send_winurl");
            bVar.f40239B = jSONObject.optString("offer_data");
            bVar.v = jSONObject.optString("tp_bid_id");
            bVar.C = jSONObject.optString("burl_win");
            bVar.D = jSONObject.optString("ad_source_id");
            bVar.f40240E = jSONObject.optDouble("cur_rate", 0.0d);
            bVar.f40241F = jSONObject.optDouble("ecpm_api", 0.0d);
            bVar.G = jSONObject.optDouble("cny_ecpm_api", 0.0d);
            bVar.H = jSONObject.optString("precision");
            bVar.f40252w = jSONObject.optString("req_url", "");
            bVar.k = jSONObject.optInt("bd_type", 1);
            double dOptDouble = jSONObject.optDouble("s_pty", bVar.f40232c);
            bVar.d = dOptDouble;
            bVar.f40231b = jSONObject.optDouble("origin_price", dOptDouble);
            bVar.f40237n = jSONObject.optDouble("cny_price", 0.0d);
            int i2 = bVar.s;
            if (i2 == 1) {
                double d = bVar.f40241F;
                if (d > 0.0d) {
                    bVar.f40232c = d;
                    bVar.d = d;
                }
                double d2 = bVar.G;
                if (d2 > 0.0d) {
                    bVar.f40237n = d2;
                }
            }
            if (i2 == 66) {
                bVar.f40243J = jSONObject.optDouble("a_r", 0.0d);
            }
            Object objOpt = jSONObject.opt("request_id");
            if (objOpt != null) {
                bVar.f40242I = objOpt.toString();
            }
            bVar.K = jSONObject.optJSONObject("adx_ctrl");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("e_key_data");
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                bVar.c(jSONObjectOptJSONObject.optString("e_c"));
                bVar.e(jSONObjectOptJSONObject.optString("cny_e_c"));
                bVar.b(jSONObjectOptJSONObject.optInt("id"));
            }
            byte b2 = -1;
            bVar.f40245P = jSONObject.optInt("adx_mtg_mix_type", -1);
            String strOptString = jSONObject.optString("deal_type", "");
            bVar.f40246Q = strOptString;
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
                bVar.f40247R = 3;
            } else if (b2 == 1) {
                bVar.f40247R = 2;
            } else if (b2 != 2) {
                bVar.f40247R = 0;
            } else {
                bVar.f40247R = 1;
            }
            bVar.S = jSONObject.optString("deal_id", "");
            bVar.T = jSONObject.optInt("deal_pri", 0);
            bVar.a(jSONObject.optString("origin_request_id", ""));
            bVar.f40248U = jSONObject.optString("x_c", "");
            bVar.f40249V = jSONObject.optJSONObject("offer_data");
            return bVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static b b(String str) {
        try {
            return a(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public void c(String str) {
        this.L = str;
    }

    public void d(String str) {
        this.f40242I = str;
    }

    public void e(String str) {
        this.O = str;
    }

    public double l() {
        return this.f40243J;
    }

    public String m() {
        return this.L;
    }

    public int n() {
        return this.M;
    }

    public String o() {
        return this.S;
    }

    public int p() {
        return this.T;
    }

    public int q() {
        return this.f40247R;
    }

    public String r() {
        return this.f40246Q;
    }

    public String s() {
        return this.f40242I;
    }

    public String t() {
        return this.O;
    }

    public String u() {
        return this.f40248U;
    }

    public boolean v() {
        return this.f40244N;
    }

    public boolean w() {
        return this.f40251u < System.currentTimeMillis();
    }

    public boolean x() {
        return this.f40247R != 0;
    }

    public String y() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bid_id", this.f40233e);
            jSONObject.put(BidResponsed.KEY_CUR, this.q);
            jSONObject.put("origin_price", this.f40231b);
            jSONObject.put("price", this.f40232c);
            jSONObject.put(m5.f25674A, this.g);
            jSONObject.put(m5.f25678z, this.f40234h);
            jSONObject.put("unit_id", this.r);
            jSONObject.put("nw_firm_id", this.s);
            jSONObject.put("is_success", this.f40230a ? 1 : 0);
            jSONObject.put("err_code", this.f40250p);
            jSONObject.put("err_msg", this.f);
            jSONObject.put("expire", this.t);
            jSONObject.put("out_data_time", this.f40251u);
            jSONObject.put("is_send_winurl", this.x);
            jSONObject.put("tp_bid_id", this.v);
            jSONObject.put(m5.y, this.f40235i);
            jSONObject.put("ad_source_id", this.D);
            jSONObject.put("cur_rate", this.f40240E);
            jSONObject.put("ecpm_api", this.f40241F);
            jSONObject.put("cny_ecpm_api", this.G);
            jSONObject.put("precision", this.H);
            jSONObject.put("req_url", this.f40252w);
            jSONObject.put("bd_type", this.k);
            jSONObject.put("s_pty", this.d);
            jSONObject.put("cny_price", this.f40237n);
            jSONObject.put("request_id", this.f40242I);
            jSONObject.put("a_r", this.f40243J);
            Object obj = this.K;
            if (obj != null) {
                jSONObject.put("adx_ctrl", obj);
            }
            if (!TextUtils.isEmpty(this.L)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("e_c", this.L);
                jSONObject2.put("id", this.M);
                if (!TextUtils.isEmpty(this.O)) {
                    jSONObject2.put("cny_e_c", this.O);
                }
                jSONObject.put("e_key_data", jSONObject2);
            }
            jSONObject.put("adx_mtg_mix_type", this.f40245P);
            jSONObject.put("deal_type", this.f40246Q);
            jSONObject.put("deal_id", this.S);
            jSONObject.put("deal_pri", this.T);
            jSONObject.put("origin_request_id", e());
            jSONObject.put("x_c", this.f40248U);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public void b(int i2) {
        this.M = i2;
    }

    public b(boolean z2, double d, double d2, String str, String str2, String str3, String str4, String str5) {
        super(z2, d2, str, str2, str3, str4, str5, SDMAdConst.CURRENCY.USD);
        this.o = getClass().getSimpleName().concat(":");
        this.f40243J = 0.0d;
        this.f40245P = -1;
        this.f40246Q = "";
        this.f40247R = 0;
        this.d = d;
    }

    public synchronized boolean a(boolean z2, SDMLossInfo sDMLossInfo) {
        try {
            if (this.x) {
                return true;
            }
            this.x = true;
            if (z2) {
                this.y = true;
            } else {
                this.f40253z = true;
                this.f40238A = sDMLossInfo;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(boolean z2) {
        this.f40244N = z2;
    }

    public int a(int i2) {
        int i3 = this.f40245P;
        if (i3 < 0 || i2 != 4) {
            return -1;
        }
        return i3 == 5 ? 3 : 4;
    }
}
