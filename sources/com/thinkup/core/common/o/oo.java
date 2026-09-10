package com.thinkup.core.common.o;

import android.text.TextUtils;
import com.p004ironsource.jn;
import com.smartdigimkt.m6.a;
import com.smartdigimkt.u3.b;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.nnm;
import com.thinkup.core.common.on.nno;
import com.thinkup.core.common.on.o00;
import com.thinkup.core.common.on.oon;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class oo {
    private static o00 m(String str, JSONObject jSONObject, int i2) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.thinkup.core.common.n.mo.oo.oo);
            if (jSONObjectOptJSONObject != null) {
                jSONObject = jSONObjectOptJSONObject;
            } else if (!jSONObject.has("seatbid")) {
                return null;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONArray("seatbid").optJSONObject(0);
            o00 o00Var = new o00();
            o00Var.m0n(jSONObjectOptJSONObject2.toString());
            o00Var.mmn(jSONObject.toString());
            o00Var.m(str);
            o00Var.mm(jSONObjectOptJSONObject2.optString("oid"));
            o00Var.mn(jSONObjectOptJSONObject2.optString("c_id"));
            o00Var.oon(jSONObjectOptJSONObject2.optString(b.a.f38806A));
            o00Var.n0(jSONObjectOptJSONObject2.optString("title"));
            o00Var.no(jSONObjectOptJSONObject2.optString("desc"));
            o00Var.mo(jSONObjectOptJSONObject2.optInt("rating"));
            o00Var.nm(jSONObjectOptJSONObject2.optString("icon_u"));
            o00Var.o00(jSONObjectOptJSONObject2.optString("full_u"));
            o00Var.on(jSONObjectOptJSONObject2.optInt("unit_type"));
            o00Var.o0o(jSONObjectOptJSONObject2.optString("tp_logo_u"));
            o00Var.o0m(jSONObjectOptJSONObject2.optString("cta"));
            o00Var.o0n(jSONObjectOptJSONObject2.optString("video_u"));
            o00Var.o(jSONObjectOptJSONObject2.optInt("video_l"));
            o00Var.n0m(jSONObjectOptJSONObject2.optString("video_r"));
            o00Var.n0n(jSONObjectOptJSONObject2.optString("ec_u"));
            o00Var.oo0(jSONObjectOptJSONObject2.optString("store_u"));
            o00Var.m0(jSONObjectOptJSONObject2.optInt("link_type"));
            o00Var.oom(jSONObjectOptJSONObject2.optString("click_u"));
            o00Var.ooo(jSONObjectOptJSONObject2.optString(a.r.j));
            o00Var.o0n(jSONObjectOptJSONObject2.optInt("crt_type", 1));
            o00Var.no0(jSONObjectOptJSONObject2.optString("img_list"));
            o00Var.noo(jSONObjectOptJSONObject2.optString("banner_xhtml"));
            o00Var.om(jSONObjectOptJSONObject2.optInt("offer_firm_id"));
            o00Var.mo(jSONObjectOptJSONObject2.optString("jump_url"));
            try {
                String strOptString = jSONObjectOptJSONObject2.optString("sdk_resp");
                if (!TextUtils.isEmpty(strOptString)) {
                    o00Var.o(new JSONObject(strOptString).optString("data"));
                }
            } catch (Throwable unused) {
            }
            o00Var.nom(jSONObjectOptJSONObject2.optString("app_name"));
            o00Var.om0(jSONObjectOptJSONObject2.optString(jn.f25434b));
            o00Var.omo(jSONObjectOptJSONObject2.optString("app_version"));
            o00Var.omm(jSONObjectOptJSONObject2.optString("privacy"));
            o00Var.omn(jSONObjectOptJSONObject2.optString("permission"));
            o00Var.n(jSONObjectOptJSONObject2.optString("app_desc"));
            o00Var.m0(jSONObjectOptJSONObject2.optString("mtr_ver"));
            int i3 = 2;
            o00Var.oo0(jSONObjectOptJSONObject2.optInt("o_im_cap_sw", 2));
            o00Var.ooo(jSONObjectOptJSONObject2.optInt("o_cl_cap_sw", 2));
            o00Var.oom(jSONObjectOptJSONObject2.optInt("c_im_cap_sw", 2));
            o00Var.oon(jSONObjectOptJSONObject2.optInt("c_cl_cap_sw", 2));
            if (i2 == 67) {
                o00Var.o(2);
            } else {
                o00Var.o(1);
            }
            o00Var.o((oon) nno.ooo(jSONObjectOptJSONObject2.optString("ctrl")));
            o00Var.o(nnm.o(jSONObjectOptJSONObject2.optString("tk")));
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject2.optString("nw_info"));
                o00Var.mno(jSONObject2.optString("app_id"));
                o00Var.mnm(jSONObject2.optString("app_key"));
                o00Var.mnn(jSONObject2.optString("unit_id"));
            } catch (Throwable unused2) {
            }
            o00Var.n00(jSONObjectOptJSONObject2.optString("dsp_id", ""));
            o00Var.n0o(jSONObjectOptJSONObject2.optString("dsp_oid", ""));
            o00Var.o0o(jSONObjectOptJSONObject2.optInt("fca", -1));
            o00Var.o0m(jSONObjectOptJSONObject2.optInt("install_sw", -1));
            o00Var.m00(jSONObjectOptJSONObject2.optString("wv_ctrl"));
            o00Var.oo(jSONObjectOptJSONObject2.optInt("adp_type"));
            o00Var.om(jSONObjectOptJSONObject2.optString("offer_html"));
            o00Var.on(jSONObjectOptJSONObject2.optString("offer_url"));
            o00Var.o0(jSONObjectOptJSONObject2.optString("wx_username"));
            o00Var.oo(jSONObjectOptJSONObject2.optString("wx_path"));
            o00Var.n(jSONObjectOptJSONObject2.optInt("o_w"));
            o00Var.o0(jSONObjectOptJSONObject2.optInt("o_h"));
            o00Var.m(jSONObjectOptJSONObject2.optInt("return_flag"));
            o00Var.m0o(jSONObjectOptJSONObject2.optString("mraid_u"));
            if (i2 == 66 && !TextUtils.isEmpty(o00Var.o0m())) {
                String strOptString2 = jSONObjectOptJSONObject2.optString("dp_package", "");
                o00Var.on0(strOptString2);
                if (TextUtils.isEmpty(strOptString2)) {
                    i3 = 3;
                } else if (com.thinkup.core.common.ooo.o00.m(o0n.m().on(), strOptString2)) {
                    i3 = 1;
                }
                o00Var.mm(i3);
            }
            o00Var.m0m(jSONObjectOptJSONObject2.optString("adm"));
            o00Var.nn(jSONObjectOptJSONObject2.optInt("cr_m", 1));
            o00Var.o00(jSONObjectOptJSONObject2.optInt("scr_m", 1));
            o00Var.no(jSONObjectOptJSONObject2.optInt("img_w", 0));
            o00Var.nm(jSONObjectOptJSONObject2.optInt("img_h", 0));
            o00Var.mn(jSONObjectOptJSONObject2.optInt("video_w", 0));
            o00Var.n0(jSONObjectOptJSONObject2.optInt("video_h", 0));
            o00Var.moo(jSONObjectOptJSONObject2.optString("a_info", ""));
            o00Var.mom(jSONObjectOptJSONObject2.optString("a_privacy", ""));
            o00Var.mo0(jSONObjectOptJSONObject2.optString("a_info_url", ""));
            o00Var.mm0(jSONObjectOptJSONObject2.optString("fast_u", ""));
            o00Var.mon(jSONObjectOptJSONObject2.optString("market_u", ""));
            o00Var.mmo(jSONObjectOptJSONObject2.optString("d_c_u", ""));
            o00Var.mmm(jSONObjectOptJSONObject2.optString("om_ids", ""));
            o00Var.mn0(jSONObjectOptJSONObject2.optString("p_pkg", ""));
            return o00Var;
        } catch (Throwable unused3) {
            return null;
        }
    }

    private static o00 o(String str, JSONObject jSONObject, int i2) {
        return m(str, jSONObject, i2);
    }
}
