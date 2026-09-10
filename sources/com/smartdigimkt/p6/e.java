package com.smartdigimkt.p6;

import android.text.TextUtils;
import com.p004ironsource.jn;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class e {
    public static com.smartdigimkt.w6.d a(String str, JSONObject jSONObject, String str2, int i2) {
        return a(str, jSONObject, str2, i2, false);
    }

    public static com.smartdigimkt.w6.d a(String str, JSONObject jSONObject, String str2, int i2, boolean z2) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.smartdigimkt.m6.a.e.f36736e);
            if (jSONObjectOptJSONObject != null) {
                jSONObject = jSONObjectOptJSONObject;
            } else if (!jSONObject.has("seatbid")) {
                return null;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONArray("seatbid").optJSONObject(0);
            com.smartdigimkt.w6.d dVar = new com.smartdigimkt.w6.d();
            if (TextUtils.isEmpty(str2)) {
                dVar.G(jSONObject.toString());
            } else {
                dVar.G(str2);
            }
            dVar.g0(str);
            dVar.C(jSONObjectOptJSONObject2.optString("oid"));
            dVar.i(jSONObjectOptJSONObject2.optString("c_id"));
            dVar.J(jSONObjectOptJSONObject2.optString(com.smartdigimkt.u3.b.a.f38806A));
            dVar.P(jSONObjectOptJSONObject2.optString("title"));
            dVar.m(jSONObjectOptJSONObject2.optString("desc"));
            dVar.k(jSONObjectOptJSONObject2.optInt("rating"));
            dVar.s(jSONObjectOptJSONObject2.optString("icon_u"));
            dVar.p(jSONObjectOptJSONObject2.optString("full_u"));
            dVar.m(jSONObjectOptJSONObject2.optInt("unit_type"));
            dVar.c(jSONObjectOptJSONObject2.optString("tp_logo_u"));
            dVar.j(jSONObjectOptJSONObject2.optString("cta"));
            dVar.Q(jSONObjectOptJSONObject2.optString("video_u"));
            dVar.e(jSONObjectOptJSONObject2.optInt("video_l"));
            dVar.f0(jSONObjectOptJSONObject2.optString("video_r"));
            dVar.d0(jSONObjectOptJSONObject2.optString("ec_u"));
            dVar.K(jSONObjectOptJSONObject2.optString("store_u"));
            dVar.b(jSONObjectOptJSONObject2.optInt("link_type"));
            dVar.h(jSONObjectOptJSONObject2.optString("click_u"));
            dVar.l(jSONObjectOptJSONObject2.optString(com.smartdigimkt.m6.a.r.j));
            dVar.q(jSONObjectOptJSONObject2.optInt("crt_type", 1));
            dVar.e0(jSONObjectOptJSONObject2.optString("img_list"));
            dVar.X(jSONObjectOptJSONObject2.optString("banner_xhtml"));
            dVar.g(jSONObjectOptJSONObject2.optInt("offer_firm_id"));
            dVar.w(jSONObjectOptJSONObject2.optString("jump_url"));
            try {
                String strOptString = jSONObjectOptJSONObject2.optString("sdk_resp");
                if (!TextUtils.isEmpty(strOptString)) {
                    dVar.h0(new JSONObject(strOptString).optString("data"));
                }
            } catch (Throwable unused) {
            }
            dVar.W(jSONObjectOptJSONObject2.optString("app_name"));
            dVar.M(jSONObjectOptJSONObject2.optString(jn.f25434b));
            dVar.g(jSONObjectOptJSONObject2.optString("app_version"));
            dVar.L(jSONObjectOptJSONObject2.optString("privacy"));
            dVar.I(jSONObjectOptJSONObject2.optString("permission"));
            dVar.r(jSONObjectOptJSONObject2.optString("app_desc"));
            dVar.O(jSONObjectOptJSONObject2.optString("mtr_ver"));
            dVar.u(jSONObjectOptJSONObject2.optInt("o_im_cap_sw", 2));
            dVar.t(jSONObjectOptJSONObject2.optInt("o_cl_cap_sw", 2));
            dVar.s(jSONObjectOptJSONObject2.optInt("c_im_cap_sw", 2));
            dVar.r(jSONObjectOptJSONObject2.optInt("c_cl_cap_sw", 2));
            if (i2 == 67) {
                dVar.x(2);
            } else {
                dVar.x(1);
            }
            dVar.b(com.smartdigimkt.w6.m.a(jSONObjectOptJSONObject2.optJSONObject("ctrl")));
            dVar.a(com.smartdigimkt.w6.n.a(jSONObjectOptJSONObject2.optJSONObject("tk")));
            try {
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("nw_info");
                if (jSONObjectOptJSONObject3 != null) {
                    dVar.Y(jSONObjectOptJSONObject3.optString("app_id"));
                    dVar.Z(jSONObjectOptJSONObject3.optString("app_key"));
                    dVar.c0(jSONObjectOptJSONObject3.optString("unit_id"));
                }
            } catch (Throwable unused2) {
            }
            dVar.a0(jSONObjectOptJSONObject2.optString("dsp_id", ""));
            dVar.b0(jSONObjectOptJSONObject2.optString("dsp_oid", ""));
            dVar.w(jSONObjectOptJSONObject2.optInt("fca", -1));
            dVar.v(jSONObjectOptJSONObject2.optInt("install_sw", -1));
            dVar.S(jSONObjectOptJSONObject2.optString("wv_ctrl"));
            dVar.j(jSONObjectOptJSONObject2.optInt("adp_type"));
            dVar.B(jSONObjectOptJSONObject2.optString("offer_html"));
            dVar.D(jSONObjectOptJSONObject2.optString("offer_url"));
            dVar.U(jSONObjectOptJSONObject2.optString("wx_username"));
            dVar.T(jSONObjectOptJSONObject2.optString("wx_path"));
            dVar.i(jSONObjectOptJSONObject2.optInt("o_w"));
            dVar.h(jSONObjectOptJSONObject2.optInt("o_h"));
            if (z2) {
                jSONObjectOptJSONObject2.put("return_flag", 1);
            }
            dVar.y(jSONObjectOptJSONObject2.optInt("return_flag"));
            dVar.A(jSONObjectOptJSONObject2.optString("mraid_u"));
            if (i2 == 66 && !TextUtils.isEmpty(dVar.q())) {
                String strOptString2 = jSONObjectOptJSONObject2.optString("dp_package", "");
                dVar.k(strOptString2);
                if (TextUtils.isEmpty(strOptString2)) {
                    dVar.d(3);
                } else {
                    dVar.d(com.smartdigimkt.n8.h.c(com.smartdigimkt.m6.b.p().k(), strOptString2) ? 1 : 2);
                }
            }
            dVar.f(jSONObjectOptJSONObject2.optString("adm"));
            dVar.c(jSONObjectOptJSONObject2.optInt("cr_m", 1));
            dVar.l(jSONObjectOptJSONObject2.optInt("scr_m", 1));
            dVar.f(jSONObjectOptJSONObject2.optInt("img_w", 0));
            dVar.e(jSONObjectOptJSONObject2.optInt("img_h", 0));
            dVar.o(jSONObjectOptJSONObject2.optInt("video_w", 0));
            dVar.n(jSONObjectOptJSONObject2.optInt("video_h", 0));
            dVar.u(jSONObjectOptJSONObject2.optString("a_info", ""));
            dVar.t(jSONObjectOptJSONObject2.optString("a_privacy", ""));
            dVar.v(jSONObjectOptJSONObject2.optString("a_info_url", ""));
            dVar.q(jSONObjectOptJSONObject2.optString("fast_u", ""));
            dVar.z(jSONObjectOptJSONObject2.optString("market_u", ""));
            dVar.x(jSONObjectOptJSONObject2.optString("d_c_u", ""));
            dVar.E(jSONObjectOptJSONObject2.optString("om_ids", ""));
            dVar.o(jSONObjectOptJSONObject2.optString("p_pkg", ""));
            return dVar;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
