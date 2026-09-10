package com.smartdigimkt.m8;

import android.text.TextUtils;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.smartdigimkt.l8.e;
import com.smartdigimkt.l8.f;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.q6.c;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.thinkup.core.oo.n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f36885a = {"unit_id", "unitid", "slot_id", "placement_id", "zone_id", "ad_place_id", "position_id", "pos_id", "placement_name", "spot_id", "ad_tag", "ad_id", "plid", "space_id", "location", "tagid", "adslot_id", "instance_id", com.smartdigimkt.o1.b.B0};

    private static void a(Map<String, Object> map, int i2) {
    }

    private static String a(String str, f fVar) {
        try {
            int iK = fVar.k();
            if (iK == 3 || iK == 7) {
                return str;
            }
            Map<String, Object> mapM = fVar.M();
            for (String str2 : f36885a) {
                String strA = h.a(mapM, str2, "");
                if (!TextUtils.isEmpty(strA)) {
                    return strA;
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static void a(e eVar, Map<String, f> map, List<f> list) {
        a(eVar, map, list, eVar.k(), 3, 4);
    }

    public static List<f> a(e eVar, JSONArray jSONArray) {
        return a(eVar, jSONArray, 3, 4);
    }

    private static void a(e eVar, Map<String, f> map, List<f> list, JSONArray jSONArray, int i2, int i3) {
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
                if (jSONObjectOptJSONObject != null) {
                    f fVarA = a(i3, i2, jSONObjectOptJSONObject, eVar);
                    map.put(fVarA.h(), fVarA);
                    if (fVarA.t0() == 35) {
                        list.add(fVarA);
                    }
                    a(eVar, fVarA);
                    if (eVar.y() == null && fVarA.m1() && fVarA.U() == 1) {
                        eVar.a(Boolean.TRUE);
                    }
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    private static void a(e eVar, f fVar) {
        if (fVar.q() > 0.0d || eVar == null) {
            return;
        }
        double dX = eVar.x();
        if (dX > 0.0d) {
            fVar.b(dX);
        }
    }

    public static List<f> a(e eVar) {
        return a(eVar, eVar.k(), 3, 4);
    }

    public static List<f> a(e eVar, JSONArray jSONArray, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i4);
                if (jSONObject != null) {
                    f fVarA = a(i3, i2, jSONObject, eVar);
                    a(eVar, fVarA);
                    arrayList.add(fVarA);
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private static f a(int i2, int i3, JSONObject jSONObject, e eVar) {
        JSONArray jSONArrayOptJSONArray;
        int i4 = (i3 == 0 || i3 == 4 || i3 == 8) ? 0 : 1;
        f fVar = new f(i2);
        fVar.b(i3);
        fVar.h(i4);
        if (jSONObject.isNull("adapter_class")) {
            fVar.a("");
        } else {
            fVar.a(jSONObject.optString("adapter_class"));
        }
        if (jSONObject.isNull("caps_d")) {
            fVar.k(-1);
        } else {
            fVar.k(jSONObject.optInt("caps_d"));
        }
        if (jSONObject.isNull("caps_h")) {
            fVar.l(-1);
        } else {
            fVar.l(jSONObject.optInt("caps_h"));
        }
        if (jSONObject.isNull("nw_firm_id")) {
            fVar.C(-1);
        } else {
            fVar.C(jSONObject.optInt("nw_firm_id"));
        }
        if (jSONObject.isNull("content")) {
            fVar.c("");
            fVar.a(new HashMap());
        } else {
            String strOptString = jSONObject.optString("content");
            Map<String, Object> mapF = h.f(strOptString);
            a(mapF, fVar.t0());
            fVar.c(strOptString);
            fVar.a(mapF);
            fVar.k(a(eVar.I(), fVar));
        }
        if (jSONObject.isNull("nw_firm_name")) {
            fVar.j("");
        } else {
            fVar.j(jSONObject.optString("nw_firm_name"));
        }
        if (jSONObject.isNull("ug_id")) {
            fVar.n("unknown");
        } else {
            fVar.n(jSONObject.optString("ug_id"));
        }
        if (jSONObject.isNull("nw_cache_time")) {
            fVar.o(0L);
        } else {
            fVar.o(jSONObject.optInt("nw_cache_time"));
        }
        if (jSONObject.isNull("nw_timeout")) {
            fVar.p(0L);
        } else {
            fVar.p(jSONObject.optInt("nw_timeout"));
        }
        if (jSONObject.isNull("nw_req_num")) {
            fVar.V(1);
        } else {
            fVar.V(jSONObject.optInt("nw_req_num"));
        }
        if (jSONObject.isNull("pacing")) {
            fVar.q(-1L);
        } else {
            fVar.q(jSONObject.optLong("pacing"));
        }
        if (jSONObject.isNull("unit_id")) {
            fVar.o("");
        } else {
            fVar.o(jSONObject.optString("unit_id"));
        }
        if (jSONObject.isNull("ecpm")) {
            fVar.d(0.0d);
        } else {
            fVar.d(jSONObject.optDouble("ecpm", 0.0d));
        }
        if (jSONObject.isNull("hb_timeout")) {
            fVar.j(2000L);
        } else {
            fVar.j(jSONObject.optInt("hb_timeout"));
        }
        if (jSONObject.isNull("t_c_u")) {
            fVar.b("");
        } else {
            fVar.b(jSONObject.optString("t_c_u"));
        }
        if (jSONObject.isNull("t_c_u_min_t")) {
            fVar.n(0);
        } else {
            fVar.n(jSONObject.optInt("t_c_u_min_t"));
        }
        if (jSONObject.isNull("t_c_u_max_t")) {
            fVar.m(3000);
        } else {
            fVar.m(jSONObject.optInt("t_c_u_max_t"));
        }
        if (jSONObject.isNull("payload")) {
            fVar.l("");
        } else {
            fVar.l(jSONObject.optString("payload"));
        }
        if (jSONObject.isNull("error")) {
            fVar.g("");
        } else {
            fVar.g(jSONObject.optString("error"));
        }
        if (jSONObject.isNull("l_s_t")) {
            fVar.r(1800000L);
        } else {
            fVar.r(jSONObject.optLong("l_s_t"));
        }
        if (jSONObject.isNull("n_d_t")) {
            fVar.l(-1L);
        } else {
            fVar.l(jSONObject.optLong("n_d_t"));
        }
        if (jSONObject.isNull("hb_t_c_t")) {
            fVar.e(1800000L);
        } else {
            fVar.e(jSONObject.optLong("hb_t_c_t"));
        }
        if (jSONObject.isNull("sort_type")) {
            fVar.R(i4 ^ 1);
        } else {
            fVar.R(jSONObject.optInt("sort_type"));
        }
        if (jSONObject.isNull("s_sw")) {
            fVar.Q(1);
        } else {
            fVar.Q(jSONObject.optInt("s_sw"));
        }
        if (jSONObject.isNull("c_sw")) {
            fVar.o(1);
        } else {
            fVar.o(jSONObject.optInt("c_sw"));
        }
        if (jSONObject.isNull("ecpm_level")) {
            fVar.s(-1);
        } else {
            fVar.s(jSONObject.optInt("ecpm_level"));
        }
        if (jSONObject.isNull("precision")) {
            fVar.f("publisher_defined");
        } else {
            fVar.f(jSONObject.optString("precision"));
        }
        if (jSONObject.isNull("nx_req_time")) {
            fVar.n(0L);
        } else {
            fVar.n(jSONObject.optLong("nx_req_time"));
        }
        if (jSONObject.isNull("bid_fail_interval")) {
            fVar.b(0L);
        } else {
            fVar.b(jSONObject.optLong("bid_fail_interval"));
        }
        if (jSONObject.isNull("cy_ecpm")) {
            fVar.a(0.0d);
        } else {
            fVar.a(jSONObject.optDouble("cy_ecpm", 0.0d));
        }
        if (jSONObject.isNull("irrf_sw")) {
            fVar.c(1);
        } else {
            fVar.c(jSONObject.optInt("irrf_sw"));
        }
        if (jSONObject.isNull("wfe_t_sw")) {
            fVar.a0(1);
        } else {
            fVar.a0(jSONObject.optInt("wfe_t_sw"));
        }
        if (jSONObject.isNull("ubp_sw")) {
            fVar.W(2);
        } else {
            fVar.W(jSONObject.optInt("ubp_sw"));
        }
        if (jSONObject.isNull("bid_pl_sw")) {
            fVar.f(1);
        } else {
            fVar.f(jSONObject.optInt("bid_pl_sw"));
        }
        if (jSONObject.isNull("s2s_sw")) {
            fVar.M(2);
        } else {
            fVar.M(jSONObject.optInt("s2s_sw"));
        }
        if (jSONObject.isNull("i_sw")) {
            fVar.q(2);
        } else {
            fVar.q(jSONObject.optInt("i_sw"));
        }
        if (jSONObject.isNull("sp_ps")) {
            fVar.b0(0);
        } else {
            fVar.b0(jSONObject.optInt("sp_ps"));
        }
        if (jSONObject.isNull("rtcb_hbecpm")) {
            fVar.L(1);
        } else {
            fVar.L(jSONObject.optInt("rtcb_hbecpm"));
        }
        if (jSONObject.isNull("oid")) {
            fVar.e("");
        } else {
            fVar.e(jSONObject.optString("oid"));
        }
        if (i3 == 7) {
            c.a(com.smartdigimkt.m6.b.p().k()).a(fVar.h(), fVar.S());
        }
        if (jSONObject.isNull("show_req")) {
            fVar.x(2);
        } else {
            fVar.x(jSONObject.optInt("show_req"));
        }
        if (jSONObject.isNull("hb_preq_sw")) {
            fVar.U(-1);
        } else {
            fVar.U(jSONObject.optInt("hb_preq_sw", -1));
        }
        fVar.a(SDMAdConst.CURRENCY.USD);
        if (jSONObject.isNull("show_delay")) {
            fVar.P(0);
        } else {
            fVar.P(jSONObject.optInt("show_delay", 0));
        }
        if (jSONObject.isNull("bid_floor")) {
            fVar.b(0.0d);
        } else {
            fVar.b(jSONObject.optDouble("bid_floor", 0.0d));
        }
        if (jSONObject.isNull("ntf_sl_sw")) {
            fVar.D(-1);
        } else {
            fVar.D(jSONObject.optInt("ntf_sl_sw", -1));
        }
        if (jSONObject.isNull("s_pty")) {
            fVar.h(fVar.V());
        } else {
            fVar.h(jSONObject.optDouble("s_pty", fVar.V()));
        }
        if (jSONObject.isNull("nw_cur")) {
            fVar.i("CNY");
        } else {
            fVar.i(jSONObject.optString("nw_cur", "CNY"));
        }
        if (jSONObject.isNull("wn_st_md_sw")) {
            fVar.c0(2);
        } else {
            fVar.c0(jSONObject.optInt("wn_st_md_sw", 2));
        }
        if (jSONObject.isNull("ads_max_cache_num")) {
            fVar.z(1);
        } else {
            fVar.z(jSONObject.optInt("ads_max_cache_num"));
        }
        if (jSONObject.isNull("ilrd_est_sw")) {
            fVar.v(2);
        } else {
            fVar.v(jSONObject.optInt("ilrd_est_sw", 2));
        }
        if (!jSONObject.has("g_ra_label")) {
            fVar.m("TopOn");
        } else {
            fVar.m(jSONObject.optString("g_ra_label"));
        }
        fVar.a(jSONObject.optLong("ad_auto_refresh_time", MBInterstitialActivity.WEB_LOAD_TIME));
        int[] iArr = null;
        if (!jSONObject.isNull(n0.o.o0om) && (jSONArrayOptJSONArray = jSONObject.optJSONArray(n0.o.o0om)) != null && jSONArrayOptJSONArray.length() > 0) {
            try {
                iArr = new int[jSONArrayOptJSONArray.length()];
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    iArr[i5] = jSONArrayOptJSONArray.getInt(i5);
                }
            } catch (Exception unused) {
            }
        }
        fVar.a(iArr);
        fVar.d0(jSONObject.optInt("w_nt_sw", 1));
        fVar.y(jSONObject.optInt("l_nt_sw", 1));
        if (!jSONObject.isNull("c_m_urls")) {
            fVar.a(jSONObject.optJSONArray("c_m_urls"));
        }
        if (!jSONObject.isNull("sys_sp")) {
            fVar.S(jSONObject.optInt("sys_sp"));
        }
        if (!jSONObject.isNull("ad_s_reqf_mode")) {
            fVar.a(jSONObject.optInt("ad_s_reqf_mode"));
        }
        fVar.i(jSONObject.optInt("unit_type", 0));
        fVar.u(jSONObject.optInt("hybrid_st_sw", 0));
        fVar.A(jSONObject.optInt("network_id"));
        fVar.O(jSONObject.optInt("wn_st_fl_sw", 2));
        fVar.c(jSONObject.optDouble("dd_dis_rate", 0.0d));
        fVar.f(jSONObject.optDouble("max_nw_price", 0.0d));
        fVar.a(jSONObject.optJSONObject("aps_price_points"));
        fVar.r(jSONObject.optInt("dy_bidfloor_sw"));
        fVar.T(jSONObject.optInt("gdt_stack_sw", 1));
        com.smartdigimkt.l8.c cVarU = eVar.u();
        if (cVarU != null) {
            com.smartdigimkt.l8.c cVarA = com.smartdigimkt.l8.c.a();
            cVarA.a(cVarU.b());
            cVarA.b(cVarU.c());
            cVarA.d(cVarU.g());
            String strOptString2 = jSONObject.optString("e_c");
            if (!TextUtils.isEmpty(strOptString2)) {
                cVarA.b(strOptString2);
            }
            String strOptString3 = jSONObject.optString("e_c_cny");
            if (!TextUtils.isEmpty(strOptString3)) {
                cVarA.c(strOptString3);
            }
            fVar.a(cVarA);
        }
        fVar.g(jSONObject.optDouble("ecpm_cny", 0.0d));
        fVar.B(jSONObject.optInt("bid_da_sw", 2));
        fVar.c(jSONObject.optLong("c2s_tmax", 500L));
        fVar.t(jSONObject.optInt("hw_splash_type", 0));
        fVar.k(jSONObject.optLong("splash_cache_time", 0L));
        fVar.E(eVar.v());
        fVar.G(jSONObject.optInt("req_cap"));
        fVar.m(jSONObject.optLong("req_cap_time"));
        fVar.i(jSONObject.optLong("bid_req_delay_t"));
        fVar.i(jSONObject.optDouble("p_coef", 0.0d));
        fVar.p(jSONObject.optInt("close_after_click", 2));
        fVar.K(jSONObject.optInt("rotation_sw", 2));
        fVar.J(jSONObject.optInt("rotation_spi_inter", 0));
        JSONObject jSONObjectH = eVar.h();
        if (jSONObjectH != null) {
            fVar.h(jSONObjectH.optString("imp_t", ""));
        }
        fVar.e(jSONObject.optInt("p_bf_sw", 2));
        fVar.F(jSONObject.optInt("w_f_l_p", 1));
        fVar.d(jSONObject.optInt("bd_i_t", 2));
        return fVar;
    }
}
