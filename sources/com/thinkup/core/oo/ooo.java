package com.thinkup.core.oo;

import android.text.TextUtils;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.smartdigimkt.o1.b;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUCustomAdapterConfig;
import com.thinkup.core.common.on.mm0;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.omo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ooo {
    private static final String[] o = {"unit_id", "unitid", "slot_id", "placement_id", "zone_id", "ad_place_id", "position_id", "pos_id", "placement_name", "spot_id", "ad_tag", "ad_id", "plid", "space_id", "location", "tagid", "adslot_id", "instance_id", b.B0};

    public static List<o0mm> m(n0 n0Var) {
        List<o0mm> listO = o(n0Var, n0Var.o0n0(), 0, 1);
        listO.addAll(o(n0Var, n0Var.o0no(), 4, 6));
        Collections.sort(listO);
        return listO;
    }

    public static List<o0mm> n(n0 n0Var) {
        return o(n0Var, n0Var.mo0(), 8, 10);
    }

    private static String o(String str, o0mm o0mmVar) {
        try {
            int iOm0 = o0mmVar.om0();
            if (iOm0 != 3 && iOm0 != 7 && o0mmVar.nm() != 35) {
                Map<String, Object> mapO0n = o0mmVar.o0n();
                for (String str2 : o) {
                    String strO = com.thinkup.core.common.ooo.o00.o(mapO0n, str2, "");
                    if (!TextUtils.isEmpty(strO)) {
                        return strO;
                    }
                }
                return "";
            }
            return str;
        } catch (Throwable unused) {
        }
    }

    public static List<o0mm> o0(n0 n0Var) {
        return o(n0Var, n0Var.onm0(), 2, 12);
    }

    public static List<o0mm> oo(n0 n0Var) {
        return o(n0Var, n0Var.onmo(), 1, 13);
    }

    public static void o(n0 n0Var, Map<String, o0mm> map, List<o0mm> list) {
        o(n0Var, map, list, n0Var.o0n0(), 0, 1);
        o(n0Var, map, list, n0Var.o0no(), 0, 6);
        o(n0Var, map, list, n0Var.o0nm(), 1, 3);
        o(n0Var, map, list, n0Var.n0n(), 3, 4);
        o(n0Var, map, list, n0Var.o0nn(), 2, 2);
        o(n0Var, map, list, n0Var.n0o(), 5, 7);
        o(n0Var, map, list, n0Var.mmo(), 6, 11);
        o(n0Var, map, list, n0Var.oooo(), 7, 8);
        o(n0Var, map, list, n0Var.ooom(), 3, 5);
        o(n0Var, map, list, n0Var.mo0(), 8, 10);
        o(n0Var, map, list, n0Var.onm0(), 2, 12);
        o(n0Var, map, list, n0Var.onmo(), 1, 13);
    }

    private static void o(n0 n0Var, Map<String, o0mm> map, List<o0mm> list, JSONArray jSONArray, int i2, int i3) {
        try {
            com.thinkup.core.common.on.nn nnVarOmmn = n0Var.ommn();
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
                if (jSONObjectOptJSONObject != null) {
                    o0mm o0mmVarO = o(i3, i2, jSONObjectOptJSONObject, n0Var);
                    map.put(o0mmVarO.m0o(), o0mmVarO);
                    if (o0mmVarO.nm() == 35) {
                        list.add(o0mmVarO);
                    }
                    o(n0Var, o0mmVarO);
                    if (nnVarOmmn != null && o0mmVarO.nm() == 2) {
                        if (i2 == 0) {
                            nnVarOmmn.o = true;
                        }
                        if (i2 == 1) {
                            nnVarOmmn.m = true;
                        }
                    }
                    if (n0Var.on0n() == null && o0mmVarO.oom() && o0mmVarO.omon() == 1) {
                        n0Var.o(Boolean.TRUE);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void o(n0 n0Var, o0mm o0mmVar) {
        if (o0mmVar.o0n0() > 0.0d || n0Var == null) {
            return;
        }
        double dOomo = n0Var.oomo();
        if (dOomo > 0.0d) {
            o0mmVar.o0(dOomo);
        }
    }

    public static List<o0mm> o(n0 n0Var) {
        List<o0mm> listO = o(n0Var, n0Var.o0nm(), 1, 3);
        List<o0mm> listO2 = o(n0Var, n0Var.n0n(), 3, 4);
        List<o0mm> listO3 = o(n0Var, n0Var.o0nn(), 2, 2);
        List<o0mm> listO4 = o(n0Var, n0Var.n0o(), 5, 7);
        List<o0mm> listO5 = o(n0Var, n0Var.mmo(), 6, 11);
        List<o0mm> listO6 = o(n0Var, n0Var.oooo(), 7, 8);
        List<o0mm> listO7 = o(n0Var, n0Var.ooom(), 3, 5);
        listO.addAll(listO2);
        listO.addAll(listO3);
        listO.addAll(listO4);
        listO.addAll(listO5);
        listO.addAll(listO6);
        listO.addAll(listO7);
        return listO;
    }

    public static List<o0mm> o(n0 n0Var, JSONArray jSONArray) {
        return o(n0Var, jSONArray, 3, 4);
    }

    private static List<o0mm> o(n0 n0Var, JSONArray jSONArray, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i4);
                if (jSONObject != null) {
                    o0mm o0mmVarO = o(i3, i2, jSONObject, n0Var);
                    o(n0Var, o0mmVarO);
                    arrayList.add(o0mmVarO);
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private static o0mm o(int i2, int i3, JSONObject jSONObject, n0 n0Var) {
        long j;
        int i4;
        omo omoVarO;
        TUCustomAdapterConfig tUCustomAdapterConfigM;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        int i5 = (i3 == 0 || i3 == 4 || i3 == 8) ? 0 : 1;
        o0mm o0mmVar = new o0mm(i2);
        o0mmVar.mo(i3);
        o0mmVar.m0(i5);
        if (jSONObject.isNull("adapter_class")) {
            o0mmVar.n("");
        } else {
            o0mmVar.n(jSONObject.optString("adapter_class"));
        }
        if (jSONObject.isNull("caps_d")) {
            o0mmVar.om(-1);
        } else {
            o0mmVar.om(jSONObject.optInt("caps_d"));
        }
        if (jSONObject.isNull("caps_h")) {
            o0mmVar.on(-1);
        } else {
            o0mmVar.on(jSONObject.optInt("caps_h"));
        }
        if (jSONObject.isNull("nw_firm_id")) {
            o0mmVar.oo(-1);
        } else {
            o0mmVar.oo(jSONObject.optInt("nw_firm_id"));
        }
        if (jSONObject.isNull("content")) {
            o0mmVar.m("");
            o0mmVar.o(new HashMap());
        } else {
            String strOptString = jSONObject.optString("content");
            Map<String, Object> mapN = com.thinkup.core.common.ooo.o00.n(strOptString);
            if (o0mmVar.nm() == 22 && com.thinkup.core.common.ooo.o00.o(mapN, "unit_type", 0) == 1) {
                mapN.put("render_type", 1);
            }
            o0mmVar.m(strOptString);
            o0mmVar.o(mapN);
            o0mmVar.mm(o(n0Var.mo(), o0mmVar));
        }
        if (jSONObject.isNull("nw_firm_name")) {
            o0mmVar.o("");
        } else {
            o0mmVar.o(jSONObject.optString("nw_firm_name"));
        }
        if (jSONObject.isNull("ug_id")) {
            o0mmVar.o0("unknown");
        } else {
            o0mmVar.o0(jSONObject.optString("ug_id"));
        }
        if (jSONObject.isNull("nw_cache_time")) {
            o0mmVar.on(0L);
        } else {
            o0mmVar.on(jSONObject.optInt("nw_cache_time"));
        }
        if (jSONObject.isNull("nw_timeout")) {
            o0mmVar.m0(0L);
        } else {
            o0mmVar.m0(jSONObject.optInt("nw_timeout"));
        }
        if (jSONObject.isNull("nw_req_num")) {
            o0mmVar.n0(1);
        } else {
            o0mmVar.n0(jSONObject.optInt("nw_req_num"));
        }
        if (jSONObject.isNull("pacing")) {
            o0mmVar.mo(-1L);
        } else {
            o0mmVar.mo(jSONObject.optLong("pacing"));
        }
        if (jSONObject.isNull("unit_id")) {
            o0mmVar.oo("");
        } else {
            o0mmVar.oo(jSONObject.optString("unit_id"));
        }
        if (jSONObject.isNull("ecpm")) {
            o0mmVar.m(0.0d);
        } else {
            o0mmVar.m(jSONObject.optDouble("ecpm", 0.0d));
        }
        if (jSONObject.isNull("hb_timeout")) {
            o0mmVar.mm(2000L);
        } else {
            o0mmVar.mm(jSONObject.optInt("hb_timeout"));
        }
        if (jSONObject.isNull("t_c_u")) {
            o0mmVar.om("");
        } else {
            o0mmVar.om(jSONObject.optString("t_c_u"));
        }
        if (jSONObject.isNull("t_c_u_min_t")) {
            o0mmVar.no(0);
        } else {
            o0mmVar.no(jSONObject.optInt("t_c_u_min_t"));
        }
        if (jSONObject.isNull("t_c_u_max_t")) {
            o0mmVar.nm(3000);
        } else {
            o0mmVar.nm(jSONObject.optInt("t_c_u_max_t"));
        }
        if (jSONObject.isNull("payload")) {
            o0mmVar.on("");
        } else {
            o0mmVar.on(jSONObject.optString("payload"));
        }
        if (jSONObject.isNull("error")) {
            o0mmVar.m0("");
        } else {
            o0mmVar.m0(jSONObject.optString("error"));
        }
        if (jSONObject.isNull("l_s_t")) {
            o0mmVar.mn(1800000L);
        } else {
            o0mmVar.mn(jSONObject.optLong("l_s_t"));
        }
        if (jSONObject.isNull("n_d_t")) {
            o0mmVar.n0(-1L);
        } else {
            o0mmVar.n0(jSONObject.optLong("n_d_t"));
        }
        if (jSONObject.isNull("hb_t_c_t")) {
            o0mmVar.om(1800000L);
        } else {
            o0mmVar.om(jSONObject.optLong("hb_t_c_t"));
        }
        if (jSONObject.isNull("sort_type")) {
            o0mmVar.mn(i5 ^ 1);
        } else {
            o0mmVar.mn(jSONObject.optInt("sort_type"));
        }
        if (jSONObject.isNull("s_sw")) {
            o0mmVar.nn(1);
        } else {
            o0mmVar.nn(jSONObject.optInt("s_sw"));
        }
        if (jSONObject.isNull("c_sw")) {
            o0mmVar.o00(1);
        } else {
            o0mmVar.o00(jSONObject.optInt("c_sw"));
        }
        if (jSONObject.isNull("ecpm_level")) {
            o0mmVar.o0o(-1);
        } else {
            o0mmVar.o0o(jSONObject.optInt("ecpm_level"));
        }
        if (jSONObject.isNull("precision")) {
            o0mmVar.mo("publisher_defined");
        } else {
            o0mmVar.mo(jSONObject.optString("precision"));
        }
        if (jSONObject.isNull("nx_req_time")) {
            j = 0;
            o0mmVar.no(0L);
        } else {
            j = 0;
            o0mmVar.no(jSONObject.optLong("nx_req_time"));
        }
        if (jSONObject.isNull("bid_fail_interval")) {
            o0mmVar.nm(j);
        } else {
            o0mmVar.nm(jSONObject.optLong("bid_fail_interval"));
        }
        if (jSONObject.isNull("cy_ecpm")) {
            o0mmVar.n(0.0d);
        } else {
            o0mmVar.n(jSONObject.optDouble("cy_ecpm", 0.0d));
        }
        if (jSONObject.isNull("irrf_sw")) {
            o0mmVar.o0m(1);
        } else {
            o0mmVar.o0m(jSONObject.optInt("irrf_sw"));
        }
        if (jSONObject.isNull("wfe_t_sw")) {
            o0mmVar.o0n(1);
        } else {
            o0mmVar.o0n(jSONObject.optInt("wfe_t_sw"));
        }
        if (jSONObject.isNull("ubp_sw")) {
            o0mmVar.oo0(2);
        } else {
            o0mmVar.oo0(jSONObject.optInt("ubp_sw"));
        }
        if (jSONObject.isNull("bid_pl_sw")) {
            o0mmVar.mm(1);
        } else {
            o0mmVar.mm(jSONObject.optInt("bid_pl_sw"));
        }
        if (jSONObject.isNull("s2s_sw")) {
            o0mmVar.ooo(2);
        } else {
            o0mmVar.ooo(jSONObject.optInt("s2s_sw"));
        }
        if (jSONObject.isNull("i_sw")) {
            o0mmVar.oon(2);
        } else {
            o0mmVar.oon(jSONObject.optInt("i_sw"));
        }
        if (jSONObject.isNull("sp_ps")) {
            o0mmVar.oom(0);
        } else {
            o0mmVar.oom(jSONObject.optInt("sp_ps"));
        }
        if (jSONObject.isNull("rtcb_hbecpm")) {
            o0mmVar.om0(1);
        } else {
            o0mmVar.om0(jSONObject.optInt("rtcb_hbecpm"));
        }
        if (jSONObject.isNull("oid")) {
            o0mmVar.mn("");
        } else {
            o0mmVar.mn(jSONObject.optString("oid"));
        }
        if (jSONObject.isNull("show_req")) {
            o0mmVar.omo(2);
        } else {
            o0mmVar.omo(jSONObject.optInt("show_req"));
        }
        if (jSONObject.isNull("ad_type")) {
            i4 = -1;
            o0mmVar.omm(-1);
        } else {
            i4 = -1;
            o0mmVar.omm(jSONObject.optInt("ad_type", -1));
        }
        if (jSONObject.isNull("hb_preq_sw")) {
            o0mmVar.omn(i4);
        } else {
            o0mmVar.omn(jSONObject.optInt("hb_preq_sw", i4));
        }
        if (o0mmVar.om0() == 2 && o0mmVar.nm() == 22) {
            o0mmVar.o(TUAdConst.CURRENCY.RMB_CENT);
        } else {
            o0mmVar.o(TUAdConst.CURRENCY.USD);
        }
        if (jSONObject.isNull("show_delay")) {
            o0mmVar.m0m(0);
        } else {
            o0mmVar.m0m(jSONObject.optInt("show_delay", 0));
        }
        if (jSONObject.isNull("bid_floor")) {
            o0mmVar.o0(0.0d);
        } else {
            o0mmVar.o0(jSONObject.optDouble("bid_floor", 0.0d));
        }
        if (jSONObject.isNull("ntf_sl_sw")) {
            o0mmVar.m0n(-1);
        } else {
            o0mmVar.m0n(jSONObject.optInt("ntf_sl_sw", -1));
        }
        if (jSONObject.isNull("s_pty")) {
            o0mmVar.oo(o0mmVar.moo());
        } else {
            o0mmVar.oo(jSONObject.optDouble("s_pty", o0mmVar.moo()));
        }
        if (jSONObject.isNull("nw_cur")) {
            o0mmVar.no("CNY");
        } else {
            o0mmVar.no(jSONObject.optString("nw_cur", "CNY"));
        }
        if (jSONObject.isNull("wn_st_md_sw")) {
            o0mmVar.mo0(2);
        } else {
            o0mmVar.mo0(jSONObject.optInt("wn_st_md_sw", 2));
        }
        if (jSONObject.isNull("ads_max_cache_num")) {
            o0mmVar.mon(1);
        } else {
            o0mmVar.mon(jSONObject.optInt("ads_max_cache_num"));
        }
        if (jSONObject.isNull("ilrd_est_sw")) {
            o0mmVar.mm0(2);
        } else {
            o0mmVar.mm0(jSONObject.optInt("ilrd_est_sw", 2));
        }
        if (!jSONObject.has("g_ra_label")) {
            o0mmVar.nm("TopOn");
        } else {
            o0mmVar.nm(jSONObject.optString("g_ra_label"));
        }
        o0mmVar.o00(jSONObject.optLong("ad_auto_refresh_time", MBInterstitialActivity.WEB_LOAD_TIME));
        int[] iArr = null;
        if (!jSONObject.isNull(n0.o.o0om) && (jSONArrayOptJSONArray = jSONObject.optJSONArray(n0.o.o0om)) != null && jSONArrayOptJSONArray.length() > 0) {
            try {
                iArr = new int[jSONArrayOptJSONArray.length()];
                for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
                    iArr[i6] = jSONArrayOptJSONArray.getInt(i6);
                }
            } catch (Exception unused) {
            }
        }
        o0mmVar.o(iArr);
        o0mmVar.mmo(jSONObject.optInt("w_nt_sw", 1));
        o0mmVar.mmm(jSONObject.optInt("l_nt_sw", 1));
        if (!jSONObject.isNull("c_m_urls")) {
            o0mmVar.o(jSONObject.optJSONArray("c_m_urls"));
        }
        if (!jSONObject.isNull("sys_sp")) {
            o0mmVar.mmn(jSONObject.optInt("sys_sp"));
        }
        if (!jSONObject.isNull("ad_s_reqf_mode")) {
            o0mmVar.mn0(jSONObject.optInt("ad_s_reqf_mode"));
        }
        o0mmVar.mnm(jSONObject.optInt("unit_type", 0));
        o0mmVar.mnn(jSONObject.optInt("hybrid_st_sw", 0));
        o0mmVar.mno(jSONObject.optInt("network_id"));
        o0mmVar.n00(jSONObject.optInt("wn_st_fl_sw", 2));
        o0mmVar.m0(jSONObject.optDouble("dd_dis_rate", 0.0d));
        o0mmVar.on(jSONObject.optDouble("max_nw_price", 0.0d));
        o0mmVar.o(jSONObject.optJSONObject("aps_price_points"));
        o0mmVar.n0o(jSONObject.optInt("dy_bidfloor_sw"));
        o0mmVar.n0m(jSONObject.optInt("gdt_stack_sw", 1));
        mm0 mm0VarOmnm = n0Var.omnm();
        if (mm0VarOmnm != null) {
            mm0 mm0Var = new mm0();
            mm0Var.m(mm0VarOmnm.oo());
            mm0Var.o(mm0VarOmnm.o0());
            mm0Var.o(mm0VarOmnm.o());
            String strOptString2 = jSONObject.optString("e_c");
            if (!TextUtils.isEmpty(strOptString2)) {
                mm0Var.m(strOptString2);
            }
            String strOptString3 = jSONObject.optString("e_c_cny");
            if (!TextUtils.isEmpty(strOptString3)) {
                mm0Var.o0(strOptString3);
            }
            o0mmVar.o(mm0Var);
        }
        o0mmVar.o(jSONObject.optDouble("ecpm_cny", 0.0d));
        o0mmVar.n0n(jSONObject.optInt("bid_da_sw", 2));
        o0mmVar.no0(jSONObject.optInt("nurl_abtw_type", 1));
        o0mmVar.o0o(jSONObject.optLong("c2s_tmax", 500L));
        String strOptString4 = jSONObject.optString("bp_cb_type");
        if (!TextUtils.isEmpty(strOptString4)) {
            try {
                omoVarO = omo.o(strOptString4);
            } catch (Throwable unused2) {
            }
        } else {
            omoVarO = o0mmVar.nm() == 2 ? omo.o() : null;
        }
        o0mmVar.o(omoVarO);
        o0mmVar.noo(jSONObject.optInt("hw_splash_type", 0));
        o0mmVar.o0m(jSONObject.optLong("splash_cache_time", 0L));
        o0mmVar.nom(n0Var.o00n());
        JSONObject jSONObjectOnnn = n0Var.onnn();
        if (jSONObjectOnnn != null && (jSONObjectOptJSONObject = jSONObjectOnnn.optJSONObject(String.valueOf(o0mmVar.nm()))) != null) {
            o0mmVar.non(jSONObjectOptJSONObject.optInt("vf_sw", 2));
            o0mmVar.nn(jSONObjectOptJSONObject.optString("vf_sk", ""));
            o0mmVar.om(jSONObjectOptJSONObject.optJSONArray("vf_sks"));
            o0mmVar.m(jSONObjectOptJSONObject.optJSONArray("hb_vf_types"));
            o0mmVar.n(jSONObjectOptJSONObject.optJSONArray("wf_vf_types"));
            o0mmVar.nm0(jSONObjectOptJSONObject.optInt("vf_sw_rv", 2));
            o0mmVar.o0(jSONObjectOptJSONObject.optJSONArray("hb_vf_types_rv"));
            o0mmVar.oo(jSONObjectOptJSONObject.optJSONArray("wf_vf_types_rv"));
        }
        o0mmVar.nmo(jSONObject.optInt("req_cap"));
        o0mmVar.o0n(jSONObject.optLong("req_cap_time"));
        o0mmVar.oo0(jSONObject.optLong("bid_req_delay_t"));
        o0mmVar.mo(jSONObject.optDouble("p_coef", 0.0d));
        o0mmVar.on0(jSONObject.optInt("close_after_click", 2));
        o0mmVar.ono(jSONObject.optInt("rotation_sw", 2));
        o0mmVar.onm(jSONObject.optInt("rotation_spi_inter", 0));
        JSONObject jSONObjectM0o0 = n0Var.m0o0();
        if (jSONObjectM0o0 != null) {
            o0mmVar.n0(jSONObjectM0o0.optString("imp_t", ""));
        }
        o0mmVar.onn(jSONObject.optInt("p_bf_sw", 2));
        o0mmVar.nmm(jSONObject.optInt("w_f_l_p", 1));
        o0mmVar.m00(jSONObject.optInt("bd_i_t", 2));
        TUAdRequest tUAdRequest = n0Var.mo;
        if (tUAdRequest != null) {
            o0mmVar.o(tUAdRequest);
        }
        o0mmVar.o(com.thinkup.core.common.on.mm.o(jSONObject.optJSONObject("req_filter_rule")));
        o0mmVar.n(jSONObject.optInt(com.thinkup.core.common.mn.onnm, 2));
        o0mmVar.m(jSONObject.optInt(com.thinkup.core.common.mn.onnn, 2));
        o0mmVar.o0(jSONObject.optLong(com.thinkup.core.common.mn.m000, 0L));
        o0mmVar.o0(jSONObject.optInt(com.thinkup.core.common.mn.m00o, 2));
        o0mmVar.o(jSONObject.optInt(com.thinkup.core.common.mn.m00m, 0));
        if (o0mmVar.nm() >= 100000 && (tUCustomAdapterConfigM = com.thinkup.core.common.n.o0n.m().m(o0mmVar.oo0())) != null) {
            o0mmVar.mm(tUCustomAdapterConfigM.isRealTimeBidSwitch() ? 2 : 1);
            o0mmVar.on(tUCustomAdapterConfigM.getAdCacheTime());
            if (tUCustomAdapterConfigM.getLossNoticePostion() > 0) {
                o0mmVar.m0n(tUCustomAdapterConfigM.getLossNoticePostion());
            }
        }
        return o0mmVar;
    }

    private static void o(Map<String, Object> map, int i2) {
        if (map != null && i2 == 22 && com.thinkup.core.common.ooo.o00.o(map, "unit_type", 0) == 1) {
            map.put("render_type", 1);
        }
    }
}
