package com.thinkup.core.common.on;

import android.text.TextUtils;
import com.p004ironsource.dc;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class nno extends oon {
    private int nn;
    private int o00;
    private int o0o;

    private int nmm() {
        return this.o00;
    }

    private int nmn() {
        return this.nn;
    }

    private int nn0() {
        return this.o0o;
    }

    public static nno ooo(String str) {
        int i2;
        nno nnoVar = new nno();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                nnoVar.o0m(jSONObject.optInt("f_t"));
                int iOptInt = jSONObject.optInt("v_c");
                if (iOptInt == 1) {
                    iOptInt = 0;
                } else if (iOptInt == 2) {
                    iOptInt = 1;
                }
                nnoVar.o0n(iOptInt);
                nnoVar.oo0(jSONObject.optInt("s_b_t"));
                if (jSONObject.has("s_b_d")) {
                    nnoVar.ooo(jSONObject.optInt("s_b_d"));
                }
                int iOptInt2 = jSONObject.optInt("e_c_a");
                if (iOptInt2 == 1) {
                    iOptInt2 = 0;
                } else if (iOptInt2 == 2) {
                    iOptInt2 = 1;
                } else if (iOptInt2 == 3) {
                    iOptInt2 = 2;
                }
                nnoVar.oom(iOptInt2);
                int iOptInt3 = jSONObject.optInt("ak_cfm");
                if (iOptInt3 == 1) {
                    iOptInt3 = 0;
                } else if (iOptInt3 == 2) {
                    iOptInt3 = 1;
                }
                nnoVar.nm(iOptInt3);
                nnoVar.no(jSONObject.optInt("m_t"));
                int iOptInt4 = jSONObject.optInt("cm");
                if (iOptInt4 == 1) {
                    iOptInt4 = 0;
                } else if (iOptInt4 == 2) {
                    iOptInt4 = 1;
                }
                nnoVar.nn = iOptInt4;
                nnoVar.o0(jSONObject.optInt("ipua"));
                nnoVar.oo(jSONObject.optInt("clua"));
                nnoVar.n0(jSONObject.optInt("dp_cm"));
                nnoVar.o00 = jSONObject.optInt("l_o_num");
                nnoVar.mn(jSONObject.optInt("ld_t"));
                nnoVar.omo(jSONObject.optInt("ec_r"));
                nnoVar.omm(jSONObject.optInt("ec_s_t"));
                nnoVar.omn(jSONObject.optInt("ec_l_t"));
                nnoVar.o(jSONObject.optLong("or_t"));
                nnoVar.om(jSONObject.optInt("rv_fail_reward"));
                nnoVar.on(jSONObject.optInt("cl_sz"));
                nnoVar.mm(jSONObject.optInt("si_fit"));
                if (jSONObject.has("at_cl_sw")) {
                    nnoVar.on0(jSONObject.optInt("at_cl_sw"));
                }
                if (jSONObject.has("at_ct_ti")) {
                    nnoVar.ono(jSONObject.optInt("at_ct_ti"));
                }
                if (jSONObject.has("int_cl_sw")) {
                    nnoVar.onm(jSONObject.optInt("int_cl_sw"));
                }
                if (jSONObject.has("int_cl_ti")) {
                    nnoVar.onn(jSONObject.optInt("int_cl_ti"));
                }
                if (jSONObject.has("sh_ec")) {
                    nnoVar.m00(jSONObject.optInt("sh_ec"));
                }
                if (jSONObject.has("ap_arpt")) {
                    nnoVar.m0o(jSONObject.optInt("ap_arpt"));
                }
                if (jSONObject.has("ap_pasbl")) {
                    nnoVar.m0m(jSONObject.optInt("ap_pasbl"));
                }
                if (jSONObject.has("inter_type")) {
                    nnoVar.om(jSONObject.optString("inter_type"));
                }
                if (jSONObject.has("shk_sw")) {
                    nnoVar.m0n(jSONObject.optInt("shk_sw"));
                }
                if (jSONObject.has("shk_strength_and")) {
                    nnoVar.mo0(jSONObject.optInt("shk_strength_and"));
                }
                if (jSONObject.has("shk_time")) {
                    nnoVar.o0(jSONObject.optLong("shk_time"));
                }
                if (jSONObject.has("click_cache_time")) {
                    nnoVar.moo(jSONObject.optInt("click_cache_time"));
                }
                if (jSONObject.has("click_nt_sw")) {
                    nnoVar.mom(jSONObject.optInt("click_nt_sw"));
                }
                if (jSONObject.has("ft_cl_sz")) {
                    nnoVar.m0(jSONObject.optInt("ft_cl_sz"));
                } else {
                    nnoVar.m0(1);
                }
                if (jSONObject.has("sh_cl_itp")) {
                    nnoVar.mo(jSONObject.optInt("sh_cl_itp"));
                } else {
                    nnoVar.mo(2);
                }
                nnoVar.mon(jSONObject.optInt("shm_t", -1));
                if (jSONObject.has("ready_rate")) {
                    nnoVar.mm0(jSONObject.optInt("ready_rate"));
                } else {
                    nnoVar.mm0(100);
                }
                if (jSONObject.has("rsdl_rate")) {
                    nnoVar.mmo(jSONObject.optInt("rsdl_rate"));
                } else {
                    nnoVar.mmo(0);
                }
                if (jSONObject.has("video_ctn_type")) {
                    nnoVar.mmm(jSONObject.optInt("video_ctn_type"));
                } else {
                    nnoVar.mmm(2);
                }
                if (jSONObject.has("preload_offer_html")) {
                    nnoVar.o(jSONObject.optInt("preload_offer_html") == 1);
                } else {
                    nnoVar.o(true);
                }
                if (jSONObject.has("re_monitor")) {
                    nnoVar.m(jSONObject.optInt("re_monitor") == 1);
                    i2 = 0;
                } else {
                    i2 = 0;
                    nnoVar.m(false);
                }
                nnoVar.o0o = jSONObject.optInt("wn_st_md_sw", i2);
                nnoVar.n(jSONObject.optInt("at_cl_img", 2) == 1);
                nnoVar.o0(jSONObject.optInt("at_cl_video", 2) == 1);
                nnoVar.oo(jSONObject.optInt("at_cl_ec", 2) == 1);
                nnoVar.oo(jSONObject.optLong("at_cl_pt", 5000L));
                nnoVar.om(jSONObject.optLong("at_cl_pct", 5000L));
                nnoVar.on(jSONObject.optLong("at_cl_ec_pt", 5000L));
                nnoVar.m0(jSONObject.optLong("at_cl_ec_pct", 5000L));
                nnoVar.mo(jSONObject.optLong("or_img_t", 5000L));
                nnoVar.mn0(jSONObject.optInt("animate_type", -1));
                nnoVar.mmn(jSONObject.optInt("render_wv_ld", 2));
                nnoVar.mno(jSONObject.optInt("cl_invalid_sw", 2));
                nnoVar.mnm(jSONObject.optInt("stc_sw", 1));
                nnoVar.mnn(jSONObject.optInt("close_button_m", 0));
                nnoVar.n00(jSONObject.optInt("cgf_sw", 1));
                nnoVar.mm(jSONObject.optLong("cgf_t", 0L));
                nnoVar.on(jSONObject.optString("cgf_list", ""));
                nnoVar.m0(jSONObject.optString("qa_po", ""));
                nnoVar.n(jSONObject.optInt("lp_pop", 2));
                try {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("shk_obj");
                    if (jSONObjectOptJSONObject != null) {
                        nnoVar.m(jSONObjectOptJSONObject.optInt("shk_type", 3));
                        nnoVar.o(jSONObjectOptJSONObject.optString("shk_icon", ""));
                        nnoVar.m(jSONObjectOptJSONObject.optString("shk_text_l", ""));
                        nnoVar.n(jSONObjectOptJSONObject.optString("shk_text_m", ""));
                        nnoVar.o0(jSONObjectOptJSONObject.optString("shk_text_s", ""));
                    }
                } catch (Throwable unused) {
                }
                nnoVar.om0(jSONObject.optInt("s_c_t", 0));
                nnoVar.no0(jSONObject.optInt("v_cls", 1));
                nnoVar.mn(jSONObject.optLong("sub_splash_time", 0L));
                nnoVar.n0(jSONObject.optLong("s_b_t_top", 2000L));
                nnoVar.no(jSONObject.optLong("s_b_d_top", 5000L));
                nnoVar.non(jSONObject.optInt("cd_play_sw", 2));
                nnoVar.n0o(jSONObject.optInt("apk_verify", 1));
                nnoVar.n0m(jSONObject.optInt("apk_redown", 2));
                nnoVar.n0n(jSONObject.optInt("install_bg", 1));
                nnoVar.n(jSONObject.optInt("adx_cache_time", 604800000));
                nnoVar.noo(jSONObject.optInt("click_close", 2));
                nnoVar.nom(jSONObject.optInt("cta_type", 1));
                nnoVar.nm0(jSONObject.optInt("a_s_way", 1));
                nnoVar.nmo(jSONObject.optInt("s_m_t", 800));
                ArrayList arrayList = new ArrayList();
                try {
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("s_m_a");
                    if (jSONArrayOptJSONArray != null) {
                        for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                            arrayList.add(Double.valueOf(jSONArrayOptJSONArray.getDouble(i3)));
                        }
                    } else {
                        arrayList.add(Double.valueOf(15.0d));
                        arrayList.add(Double.valueOf(10.0d));
                    }
                } catch (Throwable unused2) {
                    arrayList.clear();
                    arrayList.add(Double.valueOf(15.0d));
                    arrayList.add(Double.valueOf(10.0d));
                }
                nnoVar.o(arrayList);
                nnoVar.nmm(jSONObject.optInt("s_s_a", 10));
                nnoVar.om(jSONObject.optInt("cta_pause", 2) == 1);
                if (nnoVar.mo0()) {
                    nnoVar.m0m(1);
                }
                nnoVar.o00o(jSONObject.optInt("nv_tmpt", -1));
                nnoVar.nmn(jSONObject.optInt("cta_style", 1));
                try {
                    String string = jSONObject.getString("dcta_txt");
                    if (!TextUtils.isEmpty(string)) {
                        nnoVar.no(new JSONObject(string).optString("lb_txt", ""));
                    }
                } catch (Throwable unused3) {
                }
                nnoVar.nn0(jSONObject.optInt("ec_style", 1));
                int iMoo = nnoVar.moo();
                int i4 = iMoo != 2 ? (iMoo == 3 || iMoo == 4) ? 5 : 0 : 3;
                nnoVar.nm(jSONObject.optInt("ec_cd_n", i4));
                nnoVar.nno(jSONObject.optInt("ec_rp_style", 1));
                nnoVar.nnm(jSONObject.optInt("ec_rp_ca", 0));
                try {
                    String string2 = jSONObject.getString("ec_rp_txt");
                    if (!TextUtils.isEmpty(string2)) {
                        JSONObject jSONObject2 = new JSONObject(string2);
                        nnoVar.mo(jSONObject2.optString("rp_t", ""));
                        nnoVar.mm(jSONObject2.optString("rp_g", ""));
                        nnoVar.mn(jSONObject2.optString("dl", ""));
                        nnoVar.n0(jSONObject2.optString(dc.q, ""));
                    }
                } catch (Throwable unused4) {
                }
                nnoVar.nn(jSONObject.optInt("sec_cd", i4));
                nnoVar.nnn(jSONObject.optInt("sec_ca", 1));
                nnoVar.o000(jSONObject.optInt("ec_wd_ca", 1));
                try {
                    String string3 = jSONObject.getString("ec_wd_txt");
                    if (!TextUtils.isEmpty(string3)) {
                        JSONObject jSONObject3 = new JSONObject(string3);
                        nnoVar.nm(jSONObject3.optString("wd_v", ""));
                        nnoVar.nn(jSONObject3.optString("wd_i", ""));
                        nnoVar.o00(jSONObject3.optString("wd_c_t", ""));
                        nnoVar.o0o(jSONObject3.optString("wd_c_i", ""));
                        nnoVar.o0m(jSONObject3.optString("wd_c_b_t", ""));
                    }
                } catch (Throwable unused5) {
                }
                nnoVar.o00m(jSONObject.optInt("cls_style", 1));
                nnoVar.o0n(jSONObject.optString("cls_style_cw", ""));
                nnoVar.o0o(jSONObject.optLong("v_cd_style", 1L));
                nnoVar.o00(jSONObject.optLong("rv_reward_tip", 0L));
                nnoVar.o00n(jSONObject.optInt("wf_dl_sw", 1));
                nnoVar.o0o0(jSONObject.optInt("dp_b_sw", 2));
                nnoVar.o0oo(jSONObject.optInt("ac_b", 1));
                nnoVar.o0om(jSONObject.optInt("it_cfg_type", 1));
                nnoVar.o0m(jSONObject.optLong("it_cfg_d_t", 5000L));
                nnoVar.o0n(jSONObject.optLong("it_cfg_r_t", 10000L));
                nnoVar.oo0(jSONObject.optLong("it_cfg_h_t", 5000L));
                nnoVar.o0on(jSONObject.optInt("p_a_style", 1));
                nnoVar.o0m0(jSONObject.optInt("s_style", 1));
                nnoVar.o0mo(jSONObject.optInt("s_cta_style", 1));
                nnoVar.o0mm(jSONObject.optInt("ins_m_sw", 1));
                nnoVar.o(jSONObject.optDouble("o_c_b", 1.0d));
                nnoVar.ooo(jSONObject.optLong("s_d_t", 50L));
                nnoVar.o0mn(jSONObject.optInt("deeplink_c_sw", 2));
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ic_link_list");
                    ArrayList arrayList2 = new ArrayList();
                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                        for (int i5 = 0; i5 < jSONArrayOptJSONArray2.length(); i5++) {
                            arrayList2.add(jSONArrayOptJSONArray2.getString(i5));
                        }
                    }
                    nnoVar.m(arrayList2);
                } catch (Throwable unused6) {
                }
                nnoVar.o0n0(jSONObject.optInt("h5_ad_sw", 2));
                nnoVar.o0nm(jSONObject.optInt("h5_n_f", 2));
                nnoVar.o0no(jSONObject.optInt("h5_ad_pre", 2));
                try {
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("h5_ad_t");
                    if (jSONObjectOptJSONObject2 != null) {
                        nnoVar.oo0(jSONObjectOptJSONObject2.optString("t_url"));
                        nnoVar.o0nn(jSONObjectOptJSONObject2.optInt("id"));
                    }
                } catch (Throwable unused7) {
                }
                nnoVar.oo00(jSONObject.optInt("x_cl", 0));
                nnoVar.non();
                nnoVar.oo0o(jSONObject.optInt("o_h_w_load_sw", 2));
                nnoVar.oom(jSONObject.optLong("h5_l_l", 5000L));
                nnoVar.oon(jSONObject.optLong("h5_r_t", com.smartdigimkt.u2.m.D0));
                nnoVar.oo0m(jSONObject.optInt("offer_d_c", 1));
                nnoVar.oo0n(jSONObject.optInt("check_w_f", 1));
                nnoVar.ooo0(jSONObject.optInt("s_full", 2));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return nnoVar;
    }

    private void ooom(int i2) {
        this.nn = i2;
    }

    private void ooon(int i2) {
        this.o0o = i2;
    }

    private void oooo(int i2) {
        this.o00 = i2;
    }
}
