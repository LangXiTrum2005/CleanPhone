package com.smartdigimkt.w6;

import android.text.TextUtils;
import com.p004ironsource.dc;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class m extends g {
    private int T1;
    private int U1;
    private int V1;

    public static m a(JSONObject jSONObject) {
        int i2;
        m mVar = new m();
        if (jSONObject != null) {
            try {
                mVar.M(jSONObject.optInt("f_t"));
                int iOptInt = jSONObject.optInt("v_c");
                if (iOptInt == 1) {
                    iOptInt = 0;
                } else if (iOptInt == 2) {
                    iOptInt = 1;
                }
                mVar.I0(iOptInt);
                mVar.y0(jSONObject.optInt("s_b_t"));
                if (jSONObject.has("s_b_d")) {
                    mVar.k(jSONObject.optInt("s_b_d"));
                }
                int iOptInt2 = jSONObject.optInt("e_c_a");
                if (iOptInt2 == 1) {
                    iOptInt2 = 0;
                } else if (iOptInt2 == 2) {
                    iOptInt2 = 1;
                } else if (iOptInt2 == 3) {
                    iOptInt2 = 2;
                }
                mVar.H(iOptInt2);
                int iOptInt3 = jSONObject.optInt("ak_cfm");
                if (iOptInt3 == 1) {
                    iOptInt3 = 0;
                } else if (iOptInt3 == 2) {
                    iOptInt3 = 1;
                }
                mVar.c(iOptInt3);
                try {
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ak_cfm_c");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        int i3 = 0;
                        while (i3 < jSONArrayOptJSONArray.length()) {
                            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                            int iOptInt4 = jSONObject2.optInt("link_type");
                            int i4 = i3;
                            int iOptInt5 = jSONObject2.optInt("scene");
                            if (iOptInt4 == 4) {
                                mVar.d(iOptInt5);
                            }
                            if (iOptInt4 == 1) {
                                mVar.b0(iOptInt5);
                            }
                            i3 = i4 + 1;
                        }
                    }
                } catch (Throwable unused) {
                }
                mVar.h0(jSONObject.optInt("m_t"));
                int iOptInt6 = jSONObject.optInt("cm");
                if (iOptInt6 == 1) {
                    iOptInt6 = 0;
                } else if (iOptInt6 == 2) {
                    iOptInt6 = 1;
                }
                mVar.N0(iOptInt6);
                mVar.X(jSONObject.optInt("ipua"));
                mVar.y(jSONObject.optInt("clua"));
                mVar.F(jSONObject.optInt("dp_cm"));
                mVar.O0(jSONObject.optInt("l_o_num"));
                mVar.a0(jSONObject.optInt("ld_t"));
                mVar.j0(jSONObject.optInt("ec_r"));
                mVar.d0(jSONObject.optInt("ec_s_t"));
                mVar.c0(jSONObject.optInt("ec_l_t"));
                mVar.j(jSONObject.optLong("or_t"));
                mVar.Y(jSONObject.optInt("rv_fail_reward"));
                mVar.x(jSONObject.optInt("cl_sz"));
                mVar.D0(jSONObject.optInt("si_fit"));
                if (jSONObject.has("at_cl_sw")) {
                    mVar.i(jSONObject.optInt("at_cl_sw"));
                }
                if (jSONObject.has("at_ct_ti")) {
                    mVar.j(jSONObject.optInt("at_ct_ti"));
                }
                if (jSONObject.has("int_cl_sw")) {
                    mVar.U(jSONObject.optInt("int_cl_sw"));
                }
                if (jSONObject.has("int_cl_ti")) {
                    mVar.V(jSONObject.optInt("int_cl_ti"));
                }
                if (jSONObject.has("sh_ec")) {
                    mVar.I(jSONObject.optInt("sh_ec"));
                }
                if (jSONObject.has("ap_arpt")) {
                    mVar.g0(jSONObject.optInt("ap_arpt"));
                }
                if (jSONObject.has("ap_pasbl")) {
                    mVar.G(jSONObject.optInt("ap_pasbl"));
                }
                if (jSONObject.has("inter_type")) {
                    mVar.g(jSONObject.optString("inter_type"));
                }
                if (jSONObject.has("shk_sw")) {
                    mVar.w0(jSONObject.optInt("shk_sw"));
                }
                if (jSONObject.has("shk_strength_and")) {
                    mVar.v0(jSONObject.optInt("shk_strength_and"));
                }
                if (jSONObject.has("shk_time")) {
                    mVar.n(jSONObject.optLong("shk_time"));
                }
                if (jSONObject.has("click_cache_time")) {
                    mVar.r(jSONObject.optInt("click_cache_time"));
                }
                if (jSONObject.has("click_nt_sw")) {
                    mVar.u(jSONObject.optInt("click_nt_sw"));
                }
                if (jSONObject.has("ft_cl_sz")) {
                    mVar.L(jSONObject.optInt("ft_cl_sz"));
                } else {
                    mVar.L(1);
                }
                if (jSONObject.has("sh_cl_itp")) {
                    mVar.A0(jSONObject.optInt("sh_cl_itp"));
                } else {
                    mVar.A0(2);
                }
                mVar.S(jSONObject.optInt("shm_t", -1));
                if (jSONObject.has("ready_rate")) {
                    mVar.k0(jSONObject.optInt("ready_rate"));
                } else {
                    mVar.k0(100);
                }
                if (jSONObject.has("rsdl_rate")) {
                    mVar.o(jSONObject.optInt("rsdl_rate"));
                } else {
                    mVar.o(0);
                }
                if (jSONObject.has("video_ctn_type")) {
                    mVar.J0(jSONObject.optInt("video_ctn_type"));
                } else {
                    mVar.J0(2);
                }
                if (jSONObject.has("preload_offer_html")) {
                    mVar.b(jSONObject.optInt("preload_offer_html") == 1);
                } else {
                    mVar.b(true);
                }
                if (jSONObject.has("re_monitor")) {
                    mVar.c(jSONObject.optInt("re_monitor") == 1);
                    i2 = 0;
                } else {
                    i2 = 0;
                    mVar.c(false);
                }
                mVar.P0(jSONObject.optInt("wn_st_md_sw", i2));
                mVar.e(jSONObject.optInt("at_cl_img", 2) == 1);
                mVar.f(jSONObject.optInt("at_cl_video", 2) == 1);
                mVar.d(jSONObject.optInt("at_cl_ec", 2) == 1);
                mVar.t(jSONObject.optLong("at_cl_pt", 5000L));
                mVar.s(jSONObject.optLong("at_cl_pct", 5000L));
                mVar.r(jSONObject.optLong("at_cl_ec_pt", 5000L));
                mVar.q(jSONObject.optLong("at_cl_ec_pct", 5000L));
                mVar.l(jSONObject.optLong("or_img_t", 5000L));
                mVar.o0(jSONObject.optInt("animate_type", -1));
                mVar.p0(jSONObject.optInt("render_wv_ld", 2));
                mVar.q(jSONObject.optInt("cl_invalid_sw", 2));
                mVar.q0(jSONObject.optInt("stc_sw", 1));
                mVar.v(jSONObject.optInt("close_button_m", 0));
                mVar.p(jSONObject.optInt("cgf_sw", 1));
                mVar.a(jSONObject.optLong("cgf_t", 0L));
                mVar.c(jSONObject.optString("cgf_list", ""));
                mVar.d(jSONObject.optString("qa_po", ""));
                mVar.M0(jSONObject.optInt("lp_pop", 2));
                try {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("shk_obj");
                    if (jSONObjectOptJSONObject != null) {
                        mVar.s0(jSONObjectOptJSONObject.optInt("shk_type", 3));
                        mVar.r(jSONObjectOptJSONObject.optString("shk_icon", ""));
                        mVar.s(jSONObjectOptJSONObject.optString("shk_text_l", ""));
                        mVar.t(jSONObjectOptJSONObject.optString("shk_text_m", ""));
                        mVar.u(jSONObjectOptJSONObject.optString("shk_text_s", ""));
                    }
                } catch (Throwable unused2) {
                }
                mVar.z0(jSONObject.optInt("s_c_t", 0));
                mVar.i0(jSONObject.optInt("v_cls", 1));
                mVar.v(jSONObject.optLong("sub_splash_time", 0L));
                mVar.p(jSONObject.optLong("s_b_t_top", 2000L));
                mVar.w(jSONObject.optLong("s_b_d_top", 5000L));
                mVar.F0(jSONObject.optInt("cd_play_sw", 2));
                mVar.g(jSONObject.optInt("apk_verify", 1));
                mVar.f(jSONObject.optInt("apk_redown", 2));
                mVar.b(jSONObject.optInt("install_bg", 1));
                mVar.t(jSONObject.optInt("click_close", 2));
                mVar.A(jSONObject.optInt("cta_type", 1));
                mVar.x0(jSONObject.optInt("a_s_way", 1));
                mVar.t0(jSONObject.optInt("s_m_t", 800));
                ArrayList arrayList = new ArrayList();
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("s_m_a");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i5 = 0; i5 < jSONArrayOptJSONArray2.length(); i5++) {
                            arrayList.add(Double.valueOf(jSONArrayOptJSONArray2.getDouble(i5)));
                        }
                    } else {
                        arrayList.add(Double.valueOf(15.0d));
                        arrayList.add(Double.valueOf(10.0d));
                    }
                } catch (Throwable unused3) {
                    arrayList.clear();
                    arrayList.add(Double.valueOf(15.0d));
                    arrayList.add(Double.valueOf(10.0d));
                }
                mVar.b(arrayList);
                mVar.u0(jSONObject.optInt("s_s_a", 10));
                mVar.a(jSONObject.optInt("cta_pause", 2) == 1);
                if (mVar.P1()) {
                    mVar.G(1);
                }
                mVar.f0(jSONObject.optInt("nv_tmpt", -1));
                mVar.z(jSONObject.optInt("cta_style", 1));
                try {
                    String string = jSONObject.getString("dcta_txt");
                    if (!TextUtils.isEmpty(string)) {
                        mVar.e(new JSONObject(string).optString("lb_txt", ""));
                    }
                } catch (Throwable unused4) {
                }
                mVar.J(jSONObject.optInt("ec_style", 1));
                int iV = mVar.V();
                int i6 = iV != 2 ? (iV == 3 || iV == 4) ? 5 : 0 : 3;
                mVar.c(jSONObject.optInt("ec_cd_n", i6));
                mVar.n0(jSONObject.optInt("ec_rp_style", 1));
                mVar.m0(jSONObject.optInt("ec_rp_ca", 0));
                try {
                    String string2 = jSONObject.getString("ec_rp_txt");
                    if (!TextUtils.isEmpty(string2)) {
                        JSONObject jSONObject3 = new JSONObject(string2);
                        mVar.m(jSONObject3.optString("rp_t", ""));
                        mVar.i(jSONObject3.optString("rp_g", ""));
                        mVar.k(jSONObject3.optString("dl", ""));
                        mVar.l(jSONObject3.optString(dc.q, ""));
                    }
                } catch (Throwable unused5) {
                }
                mVar.m(jSONObject.optInt("sec_cd", i6));
                mVar.r0(jSONObject.optInt("sec_ca", 1));
                mVar.l0(jSONObject.optInt("ec_wd_ca", 1));
                try {
                    String string3 = jSONObject.getString("ec_wd_txt");
                    if (!TextUtils.isEmpty(string3)) {
                        JSONObject jSONObject4 = new JSONObject(string3);
                        mVar.h(jSONObject4.optString("wd_v", ""));
                        mVar.o(jSONObject4.optString("wd_i", ""));
                        mVar.q(jSONObject4.optString("wd_c_t", ""));
                        mVar.p(jSONObject4.optString("wd_c_i", ""));
                        mVar.n(jSONObject4.optString("wd_c_b_t", ""));
                    }
                } catch (Throwable unused6) {
                }
                mVar.w(jSONObject.optInt("cls_style", 1));
                mVar.v(jSONObject.optString("cls_style_cw", ""));
                mVar.b(jSONObject.optLong("v_cd_style", 1L));
                mVar.k(jSONObject.optLong("rv_reward_tip", 0L));
                mVar.W(jSONObject.optInt("wf_dl_sw", 1));
                mVar.D(jSONObject.optInt("dp_b_sw", 2));
                mVar.l(jSONObject.optInt("ac_b", 1));
                mVar.T(jSONObject.optInt("it_cfg_type", 1));
                mVar.g(jSONObject.optLong("it_cfg_d_t", 5000L));
                mVar.h(jSONObject.optLong("it_cfg_r_t", 10000L));
                mVar.f(jSONObject.optLong("it_cfg_h_t", 5000L));
                mVar.a(jSONObject.optInt("p_a_style", 1));
                mVar.h(jSONObject.optInt("s_style", 1));
                mVar.B0(jSONObject.optInt("s_cta_style", 1));
                mVar.e(jSONObject.optInt("ins_m_sw", 1));
                mVar.a(jSONObject.optDouble("o_c_b", 1.0d));
                mVar.o(jSONObject.optLong("s_d_t", 50L));
                mVar.E(jSONObject.optInt("deeplink_c_sw", 2));
                try {
                    JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("ic_link_list");
                    ArrayList arrayList2 = new ArrayList();
                    if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                        for (int i7 = 0; i7 < jSONArrayOptJSONArray3.length(); i7++) {
                            arrayList2.add(jSONArrayOptJSONArray3.getString(i7));
                        }
                    }
                    mVar.a(arrayList2);
                } catch (Throwable unused7) {
                }
                mVar.P(jSONObject.optInt("h5_ad_sw", 2));
                mVar.Q(jSONObject.optInt("h5_n_f", 2));
                mVar.O(jSONObject.optInt("h5_ad_pre", 2));
                try {
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("h5_ad_t");
                    if (jSONObjectOptJSONObject2 != null) {
                        mVar.f(jSONObjectOptJSONObject2.optString("t_url"));
                        mVar.N(jSONObjectOptJSONObject2.optInt("id"));
                    }
                } catch (Throwable unused8) {
                }
                mVar.K(jSONObject.optInt("x_cl", 0));
                mVar.C0(1);
                mVar.e0(jSONObject.optInt("o_h_w_load_sw", 2));
                mVar.d(jSONObject.optLong("h5_l_l", 5000L));
                mVar.e(jSONObject.optLong("h5_r_t", com.smartdigimkt.u2.m.D0));
                mVar.s(jSONObject.optInt("offer_d_c", 1));
                mVar.L0(jSONObject.optInt("check_w_f", 1));
                mVar.R(jSONObject.optInt("s_full", 2));
                mVar.G0(jSONObject.optInt("dps_tk_up", 2));
                mVar.i(jSONObject.optInt("apk_o_m_e", 86400000));
                mVar.H0(jSONObject.optInt("apk_i_c_u", 2));
                mVar.m(jSONObject.optInt("b_dp_i", 2));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return mVar;
    }

    public final void N0(int i2) {
        this.T1 = i2;
    }

    public void O0(int i2) {
        this.U1 = i2;
    }

    public void P0(int i2) {
        this.V1 = i2;
    }

    public final int S1() {
        return this.T1;
    }

    public int T1() {
        return this.U1;
    }

    public int U1() {
        return this.V1;
    }
}
