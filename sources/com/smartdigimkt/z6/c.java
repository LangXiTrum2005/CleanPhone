package com.smartdigimkt.z6;

import android.text.TextUtils;
import com.smartdigimkt.w6.g;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class c extends g {
    protected int T1;

    public static c w(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        c cVar = new c();
        try {
            JSONObject jSONObject = new JSONObject(str);
            cVar.M(jSONObject.optInt("f_t"));
            cVar.I0(jSONObject.optInt("v_c"));
            cVar.y0(jSONObject.optInt("s_b_t"));
            cVar.H(jSONObject.optInt("e_c_a"));
            cVar.K0(jSONObject.optInt("v_m"));
            cVar.z0(jSONObject.optInt("s_c_t"));
            cVar.h0(jSONObject.optInt("m_t"));
            cVar.i(jSONObject.optLong("o_c_t", 86400000L));
            cVar.c(jSONObject.optInt("ak_cfm"));
            cVar.u(jSONObject.optLong("ctdown_time"));
            cVar.n(jSONObject.optInt("sk_able"));
            cVar.E0(jSONObject.optInt("orient"));
            cVar.b(jSONObject.optString("size"));
            cVar.Z(jSONObject.optInt("cl_btn"));
            cVar.j0(jSONObject.optInt("ec_r"));
            cVar.d0(jSONObject.optInt("ec_s_t"));
            cVar.c0(jSONObject.optInt("ec_l_t"));
            cVar.g(jSONObject.optString("inter_type"));
            cVar.N0(jSONObject.optInt("spl_type"));
            cVar.j(jSONObject.optLong("or_t"));
            cVar.Y(jSONObject.optInt("rv_fail_reward"));
            cVar.x(jSONObject.optInt("cl_sz"));
            cVar.D0(jSONObject.optInt("si_fit"));
            if (jSONObject.has("at_cl_sw")) {
                cVar.i(jSONObject.optInt("at_cl_sw"));
            }
            if (jSONObject.has("at_ct_ti")) {
                cVar.j(jSONObject.optInt("at_ct_ti"));
            }
            if (jSONObject.has("int_cl_sw")) {
                cVar.U(jSONObject.optInt("int_cl_sw"));
            }
            if (jSONObject.has("int_cl_ti")) {
                cVar.V(jSONObject.optInt("int_cl_ti"));
            }
            if (jSONObject.has("sh_ec")) {
                cVar.I(jSONObject.optInt("sh_ec"));
            }
            if (jSONObject.has("ipua")) {
                cVar.X(jSONObject.optInt("ipua"));
            }
            if (jSONObject.has("clua")) {
                cVar.y(jSONObject.optInt("clua"));
            }
            if (jSONObject.has("ap_arpt")) {
                cVar.g0(jSONObject.optInt("ap_arpt"));
            }
            if (jSONObject.has("ap_pasbl")) {
                cVar.G(jSONObject.optInt("ap_pasbl"));
            }
            if (jSONObject.has("shk_sw")) {
                cVar.w0(jSONObject.optInt("shk_sw"));
            }
            if (jSONObject.has("shk_strength_and")) {
                cVar.v0(jSONObject.optInt("shk_strength_and"));
            }
            if (jSONObject.has("shk_time")) {
                cVar.n(jSONObject.optLong("shk_time"));
            }
            if (jSONObject.has("click_cache_time")) {
                cVar.r(jSONObject.optInt("click_cache_time"));
            } else {
                cVar.r(3600000);
            }
            if (jSONObject.has("click_nt_sw")) {
                cVar.u(jSONObject.optInt("click_nt_sw"));
            } else {
                cVar.u(1);
            }
            if (jSONObject.has("ft_cl_sz")) {
                cVar.L(jSONObject.optInt("ft_cl_sz"));
            } else {
                cVar.L(1);
            }
            if (jSONObject.has("sh_cl_itp")) {
                cVar.A0(jSONObject.optInt("sh_cl_itp"));
            } else {
                cVar.A0(2);
            }
            cVar.S(jSONObject.optInt("shm_t", -1));
            if (jSONObject.has("ready_rate")) {
                cVar.k0(jSONObject.optInt("ready_rate"));
            } else {
                cVar.k0(100);
            }
            if (jSONObject.has("rsdl_rate")) {
                cVar.o(jSONObject.optInt("rsdl_rate"));
            } else {
                cVar.o(0);
            }
            if (jSONObject.has("video_ctn_type")) {
                cVar.J0(jSONObject.optInt("video_ctn_type"));
            } else {
                cVar.J0(2);
            }
            cVar.e(jSONObject.optInt("at_cl_img", 2) == 1);
            cVar.f(jSONObject.optInt("at_cl_video", 2) == 1);
            cVar.d(jSONObject.optInt("at_cl_ec", 2) == 1);
            cVar.t(jSONObject.optLong("at_cl_pt", 5000L));
            cVar.s(jSONObject.optLong("at_cl_pct", 5000L));
            cVar.r(jSONObject.optLong("at_cl_ec_pt", 5000L));
            cVar.q(jSONObject.optLong("at_cl_ec_pct", 5000L));
            cVar.v(jSONObject.optLong("sub_splash_time", 0L));
            cVar.p(jSONObject.optLong("s_b_t_top", 2000L));
            cVar.w(jSONObject.optLong("s_b_d_top", 5000L));
            cVar.g(jSONObject.optInt("apk_verify", 1));
            cVar.f(jSONObject.optInt("apk_redown", 2));
            cVar.b(jSONObject.optInt("install_bg", 1));
            cVar.t(jSONObject.optInt("click_close", 2));
            cVar.A(jSONObject.optInt("cta_type", 1));
            cVar.F0(jSONObject.optInt("cd_play_sw", 2));
            cVar.x0(2);
            cVar.u0(cVar.k1());
            cVar.t0(800);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Double.valueOf(15.0d));
            arrayList.add(Double.valueOf(10.0d));
            cVar.b(arrayList);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return cVar;
    }

    public void N0(int i2) {
        this.T1 = i2;
    }

    public int S1() {
        return this.T1;
    }
}
