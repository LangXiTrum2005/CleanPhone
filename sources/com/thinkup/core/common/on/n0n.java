package com.thinkup.core.common.on;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class n0n extends oon {
    protected int nn;

    private int nmm() {
        return this.nn;
    }

    private static n0n o(JSONObject jSONObject) {
        n0n n0nVar = new n0n();
        try {
            n0nVar.o0m(jSONObject.optInt("f_t"));
            n0nVar.o0n(jSONObject.optInt("v_c"));
            n0nVar.oo0(jSONObject.optInt("s_b_t"));
            n0nVar.oom(jSONObject.optInt("e_c_a"));
            n0nVar.oon(jSONObject.optInt("v_m"));
            n0nVar.om0(jSONObject.optInt("s_c_t"));
            n0nVar.no(jSONObject.optInt("m_t"));
            n0nVar.n(jSONObject.optLong("o_c_t", com.thinkup.core.oo.m0.om));
            n0nVar.nm(jSONObject.optInt("ak_cfm"));
            n0nVar.m(jSONObject.optLong("ctdown_time"));
            n0nVar.nn(jSONObject.optInt("sk_able"));
            n0nVar.o00(jSONObject.optInt("orient"));
            n0nVar.oo(jSONObject.optString("size"));
            n0nVar.o0o(jSONObject.optInt("cl_btn"));
            n0nVar.omo(jSONObject.optInt("ec_r"));
            n0nVar.omm(jSONObject.optInt("ec_s_t"));
            n0nVar.omn(jSONObject.optInt("ec_l_t"));
            n0nVar.om(jSONObject.optString("inter_type"));
            n0nVar.nn = jSONObject.optInt("spl_type");
            n0nVar.o(jSONObject.optLong("or_t"));
            n0nVar.om(jSONObject.optInt("rv_fail_reward"));
            n0nVar.on(jSONObject.optInt("cl_sz"));
            n0nVar.mm(jSONObject.optInt("si_fit"));
            if (jSONObject.has("at_cl_sw")) {
                n0nVar.on0(jSONObject.optInt("at_cl_sw"));
            }
            if (jSONObject.has("at_ct_ti")) {
                n0nVar.ono(jSONObject.optInt("at_ct_ti"));
            }
            if (jSONObject.has("int_cl_sw")) {
                n0nVar.onm(jSONObject.optInt("int_cl_sw"));
            }
            if (jSONObject.has("int_cl_ti")) {
                n0nVar.onn(jSONObject.optInt("int_cl_ti"));
            }
            if (jSONObject.has("sh_ec")) {
                n0nVar.m00(jSONObject.optInt("sh_ec"));
            }
            if (jSONObject.has("ipua")) {
                n0nVar.o0(jSONObject.optInt("ipua"));
            }
            if (jSONObject.has("clua")) {
                n0nVar.oo(jSONObject.optInt("clua"));
            }
            if (jSONObject.has("ap_arpt")) {
                n0nVar.m0o(jSONObject.optInt("ap_arpt"));
            }
            if (jSONObject.has("ap_pasbl")) {
                n0nVar.m0m(jSONObject.optInt("ap_pasbl"));
            }
            if (jSONObject.has("shk_sw")) {
                n0nVar.m0n(jSONObject.optInt("shk_sw"));
            }
            if (jSONObject.has("shk_strength_and")) {
                n0nVar.mo0(jSONObject.optInt("shk_strength_and"));
            }
            if (jSONObject.has("shk_time")) {
                n0nVar.o0(jSONObject.optLong("shk_time"));
            }
            if (jSONObject.has("click_cache_time")) {
                n0nVar.moo(jSONObject.optInt("click_cache_time"));
            } else {
                n0nVar.moo(3600000);
            }
            if (jSONObject.has("click_nt_sw")) {
                n0nVar.mom(jSONObject.optInt("click_nt_sw"));
            } else {
                n0nVar.mom(1);
            }
            if (jSONObject.has("ft_cl_sz")) {
                n0nVar.m0(jSONObject.optInt("ft_cl_sz"));
            } else {
                n0nVar.m0(1);
            }
            if (jSONObject.has("sh_cl_itp")) {
                n0nVar.mo(jSONObject.optInt("sh_cl_itp"));
            } else {
                n0nVar.mo(2);
            }
            n0nVar.mon(jSONObject.optInt("shm_t", -1));
            if (jSONObject.has("ready_rate")) {
                n0nVar.mm0(jSONObject.optInt("ready_rate"));
            } else {
                n0nVar.mm0(100);
            }
            if (jSONObject.has("rsdl_rate")) {
                n0nVar.mmo(jSONObject.optInt("rsdl_rate"));
            } else {
                n0nVar.mmo(0);
            }
            if (jSONObject.has("video_ctn_type")) {
                n0nVar.mmm(jSONObject.optInt("video_ctn_type"));
            } else {
                n0nVar.mmm(2);
            }
            n0nVar.n(jSONObject.optInt("at_cl_img", 2) == 1);
            n0nVar.o0(jSONObject.optInt("at_cl_video", 2) == 1);
            n0nVar.oo(jSONObject.optInt("at_cl_ec", 2) == 1);
            n0nVar.oo(jSONObject.optLong("at_cl_pt", 5000L));
            n0nVar.om(jSONObject.optLong("at_cl_pct", 5000L));
            n0nVar.on(jSONObject.optLong("at_cl_ec_pt", 5000L));
            n0nVar.m0(jSONObject.optLong("at_cl_ec_pct", 5000L));
            n0nVar.mn(jSONObject.optLong("sub_splash_time", 0L));
            n0nVar.n0(jSONObject.optLong("s_b_t_top", 2000L));
            n0nVar.no(jSONObject.optLong("s_b_d_top", 5000L));
            n0nVar.n0o(jSONObject.optInt("apk_verify", 1));
            n0nVar.n0m(jSONObject.optInt("apk_redown", 2));
            n0nVar.n0n(jSONObject.optInt("install_bg", 1));
            n0nVar.noo(jSONObject.optInt("click_close", 2));
            n0nVar.nom(jSONObject.optInt("cta_type", 1));
            n0nVar.non(jSONObject.optInt("cd_play_sw", 2));
            n0nVar.nm0(2);
            n0nVar.nmm(n0nVar.oon());
            n0nVar.nmo(800);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Double.valueOf(15.0d));
            arrayList.add(Double.valueOf(10.0d));
            n0nVar.o(arrayList);
            return n0nVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return n0nVar;
        }
    }

    public static n0n ooo(String str) {
        n0n n0nVar = new n0n();
        if (!TextUtils.isEmpty(str)) {
            try {
                return o(new JSONObject(str));
            } catch (Throwable unused) {
            }
        }
        return n0nVar;
    }

    private void oooo(int i2) {
        this.nn = i2;
    }
}
