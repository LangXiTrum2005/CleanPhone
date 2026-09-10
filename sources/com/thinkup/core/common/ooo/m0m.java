package com.thinkup.core.common.ooo;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.smartdigimkt.s8.a;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.basead.adx.api.TUAdxSetting;
import com.thinkup.core.common.on.mm0;
import com.thinkup.core.common.on.n0o;
import com.thinkup.core.common.on.o00o;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.oo00;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class m0m {
    private static final String o = "m0m";

    public static void m(com.thinkup.core.common.on.n0 n0Var, TUBaseAdAdapter tUBaseAdAdapter) {
        Map<String, Object> adExtraInfoMap;
        if (n0Var == null || n0Var.n0n() != 66 || (adExtraInfoMap = tUBaseAdAdapter.getAdExtraInfoMap()) == null || adExtraInfoMap.isEmpty()) {
            return;
        }
        n0Var.n00(o00.o(adExtraInfoMap, "imp_dp_package_install_state", 0));
        n0Var.n0m(o00.o(adExtraInfoMap, "imp_native_ad_render_template_id", 0));
        String strOono = n0Var.oono();
        strOono.getClass();
        if (strOono.equals("1")) {
            n0Var.oo0(o00.o(adExtraInfoMap, "imp_rv_player_render_type", 0));
            n0Var.nom(o00.o(adExtraInfoMap, "imp_ad_close_button_style", 0));
        } else if (strOono.equals("3")) {
            n0Var.nom(o00.o(adExtraInfoMap, "imp_ad_close_button_style", 0));
            n0Var.oo(o00.o(adExtraInfoMap, "imp_iv_close_button_type", 0));
            n0Var.noo(o00.o(adExtraInfoMap, "imp_iv_render_type", 0));
        }
        com.thinkup.core.common.o0o.o(com.thinkup.core.common.n.o0n.m().on()).o(adExtraInfoMap, n0Var, 4);
    }

    public static void n(com.thinkup.core.common.on.n0 n0Var, TUBaseAdAdapter tUBaseAdAdapter) {
        if (n0Var == null || tUBaseAdAdapter == null || n0Var.n0n() != 66) {
            return;
        }
        o(n0Var, tUBaseAdAdapter.getAdExtraInfoMap());
    }

    public static com.thinkup.core.common.on.n0 o(String str, String str2, com.thinkup.core.oo.n0 n0Var, int i2, int i3, Map<String, Object> map, com.thinkup.core.common.on.m mVar, int i4, TUAdRequest tUAdRequest) {
        com.thinkup.core.common.on.n0 n0Var2 = new com.thinkup.core.common.on.n0();
        n0Var2.mo0(str2);
        n0Var2.moo(str);
        n0Var2.ono(i2);
        n0Var2.onm(i2);
        n0Var2.onn(com.thinkup.core.common.ooo.o().oo(str2) ? 1 : 2);
        n0Var2.ooo = 0;
        n0Var2.oo0 = 2;
        n0Var2.oom = 0;
        o(n0Var2, n0Var);
        n0Var2.ooom();
        n0Var2.o00n(com.thinkup.core.common.n.o0n.m().mm());
        n0Var2.o0o0(i3);
        if (n0Var != null) {
            n0Var2.o00o(n0Var.o00());
        } else {
            n0Var2.o00o(2);
        }
        o(map, n0Var2);
        n0Var2.o(mVar);
        n0Var2.n(TUAdxSetting.getInstance().isAdxNetworkMode(str2));
        n0Var2.nmo(i4);
        n0Var2.o(tUAdRequest);
        return n0Var2;
    }

    private static void m(com.thinkup.core.common.on.n0 n0Var, o0mm o0mmVar) {
        mm0 mm0VarOmmn = o0mmVar.ommn();
        if (mm0VarOmmn == null) {
            return;
        }
        n0Var.on(mm0VarOmmn.m());
        n0Var.m0(mm0VarOmmn.om());
        if (o0mmVar.ommo()) {
            n0Var.nm(mm0VarOmmn.oo());
        } else {
            n0Var.nm(mm0VarOmmn.o0());
        }
        n0Var.mo(mm0VarOmmn.o());
        o0mmVar.m0o();
    }

    public static void o(Map<String, Object> map, com.thinkup.core.common.on.n0 n0Var) {
        if (map != null) {
            Object obj = map.get(TUAdConst.KEY.CP_PLACEMENT_ID);
            if (obj != null) {
                n0Var.m0o(obj.toString());
            }
            Object obj2 = map.get(TUAdConst.KEY.CP_LOAD_MODE);
            if (obj2 instanceof Integer) {
                n0Var.o00m(Integer.parseInt(obj2.toString()));
            }
            Object obj3 = map.get(com.thinkup.core.common.oo.m);
            if (obj3 != null) {
                n0Var.o(obj3);
            }
            JSONObject jSONObjectO = m0o.o(map);
            if (jSONObjectO != null) {
                n0Var.o(jSONObjectO);
            }
        }
    }

    public static void o(String str, com.thinkup.core.oo.n0 n0Var, com.thinkup.core.common.on.n0 n0Var2) {
        if (n0Var == null || n0Var2 == null) {
            return;
        }
        com.thinkup.core.common.on.m mVar = new com.thinkup.core.common.on.m();
        mVar.o(str, n0Var.o0mn(), n0Var.nmn());
        n0Var2.o(mVar);
    }

    public static void o(String str, com.thinkup.core.common.on.n0 n0Var) {
        com.thinkup.core.oo.n0 n0VarO;
        if (n0Var == null || TextUtils.isEmpty(str) || (n0VarO = com.thinkup.core.oo.nm.o(com.thinkup.core.common.n.o0n.m().on()).o(str)) == null || !n0VarO.on0m()) {
            return;
        }
        o(str, n0VarO, n0Var);
    }

    public static com.thinkup.core.common.on.n0 o(TUBaseAdAdapter tUBaseAdAdapter, com.thinkup.core.common.on.n0 n0Var, o0mm o0mmVar) {
        com.thinkup.core.common.on.on0 on0VarN0n;
        int i2;
        com.thinkup.core.common.on.on0 on0VarN0n2 = o0mmVar.n0n();
        if (on0VarN0n2 != null) {
            n0Var.n0(o0mmVar.omoo());
            n0Var.no(on0VarN0n2.originPrice);
        }
        tUBaseAdAdapter.setUnitGroupInfo(o0mmVar);
        tUBaseAdAdapter.setRefresh(n0Var.mnn() == 1);
        try {
            n0Var.om0 = tUBaseAdAdapter.getInternalNetworkSDKVersion();
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(n0Var.oom0())) {
            n0Var.m0m(tUBaseAdAdapter.getInternalNetworkName());
        }
        n0Var.mn(tUBaseAdAdapter.getClass().getName());
        if (o0mmVar.nm() == 66 && (on0VarN0n = o0mmVar.n0n()) != null) {
            try {
                i2 = Integer.parseInt(n0Var.oono());
            } catch (Throwable unused2) {
                i2 = -2;
            }
            n0Var.non(on0VarN0n.o(i2));
        }
        tUBaseAdAdapter.setTrackingInfo(n0Var);
        o0mmVar.o(tUBaseAdAdapter);
        return n0Var;
    }

    private static void o(com.thinkup.core.common.on.n0 n0Var, o0mm o0mmVar) {
        com.thinkup.core.common.on.on0 on0VarN0n;
        int i2;
        if (o0mmVar == null || n0Var == null || o0mmVar.nm() != 66 || (on0VarN0n = o0mmVar.n0n()) == null) {
            return;
        }
        try {
            i2 = Integer.parseInt(n0Var.oono());
        } catch (Throwable unused) {
            i2 = -2;
        }
        n0Var.non(on0VarN0n.o(i2));
    }

    public static void o(com.thinkup.core.common.on.n0 n0Var, TUBaseAdAdapter tUBaseAdAdapter) {
        Map<String, Object> adExtraInfoMap;
        if (n0Var == null || n0Var.n0n() != 66 || (adExtraInfoMap = tUBaseAdAdapter.getAdExtraInfoMap()) == null || adExtraInfoMap.isEmpty()) {
            return;
        }
        n0Var.mon(o00.o(adExtraInfoMap, "cached_ad_material_type", 0));
    }

    public static void o(com.thinkup.core.common.on.n0 n0Var, Map<String, Object> map) {
        if (n0Var == null || map == null || map.isEmpty() || n0Var.n0n() != 66 || map.isEmpty()) {
            return;
        }
        n0Var.m0n(o00.o(map, "click_click_type", 0));
        n0Var.mo0(o00.o(map, "click_click_area", 0));
        n0Var.n0m(o00.o(map, "imp_native_ad_render_template_id", 0));
        int iO = o00.o(map, "click_tk_type", 6);
        n0Var.o0(iO == 28);
        if (iO != 28) {
            com.thinkup.core.common.o0o.o(com.thinkup.core.common.n.o0n.m().on()).o(map, n0Var, 6);
        }
    }

    public static void o(com.thinkup.core.common.on.n0 n0Var, o0mm o0mmVar, int i2, boolean z2) {
        com.thinkup.core.common.on.on0 on0VarN0n;
        n0o n0oVarM;
        String str;
        o00o.o oVarO = z2 ? com.thinkup.core.m.o.o(com.thinkup.core.common.n.o0n.m().on()).o(n0Var.oomn(), o0mmVar.m0o(), Integer.parseInt(n0Var.oono())) : null;
        n0Var.mm(o0mmVar.mn());
        n0Var.mo(o0mmVar.om0());
        n0Var.m00(o0mmVar.nm());
        n0Var.o0m(o0mmVar.m0o());
        n0Var.ooo(o0mmVar.mmm());
        n0Var.oom(o0mmVar.mmn());
        n0Var.no(o0mmVar.nn0());
        n0Var.om0(i2);
        n0Var.oo0(o0mmVar.o0m());
        n0Var.omm(oVarO != null ? oVarO.oo : 0);
        n0Var.omn(oVarO != null ? oVarO.o0 : 0);
        if (o0mmVar.n0m()) {
            n0Var.mm(o0mmVar.moo());
            n0Var.om(o0mmVar.o0nm());
            n0Var.mn(o0mmVar.mm());
        } else {
            n0Var.mm(0.0d);
            n0Var.om(0.0d);
            n0Var.mn(0.0d);
        }
        n0Var.o(o0mmVar.oooo());
        if (o0mmVar.oom()) {
            if (o0mmVar.nno() != 2) {
                com.thinkup.core.common.on.on0 on0VarN0n2 = o0mmVar.n0n();
                if (on0VarN0n2 == null) {
                    str = "";
                } else if (on0VarN0n2.o0n() == 3) {
                    str = "ecpm_api";
                } else {
                    str = on0VarN0n2.o0o;
                }
                if (TextUtils.isEmpty(str)) {
                    str = "exact";
                }
                n0Var.nn(str);
                if (!o0mmVar.o0m0()) {
                    n0Var.on(n0Var.ooo() * o0mmVar.moo());
                    n0Var.m0(o0mmVar.mm());
                } else if (on0VarN0n2 != null) {
                    n0Var.on(n0Var.ooo() * on0VarN0n2.nn);
                    n0Var.m0(on0VarN0n2.getRmbPrice());
                }
            }
            n0Var.n(n0Var.ooo() * o0mmVar.o0n0());
        } else {
            n0Var.on(o0mmVar.n00());
            n0Var.m0(o0mmVar.mm());
            String strMno = o0mmVar.mno();
            if (TextUtils.isEmpty(strMno)) {
                strMno = "publisher_defined";
            }
            n0Var.nn(strMno);
        }
        n0Var.oon(o0mmVar.ooo());
        n0Var.n0(o0mmVar.mom());
        n0Var.om0m = o0mmVar.m0m();
        n0Var.om0n = o0mmVar.m0n();
        n0Var.omo0 = o0mmVar.mo0();
        n0Var.o0n(o0mmVar.mn0());
        n0Var.n0(o0mmVar.nno());
        try {
            Map<String, Object> mapO0n = o0mmVar.o0n();
            JSONObject jSONObject = new JSONObject();
            if (35 == o0mmVar.nm()) {
                String strO = o00.o(mapO0n, a.C0584a.f38219e);
                com.thinkup.core.oo.n0 n0VarO = com.thinkup.core.oo.nm.o(com.thinkup.core.common.n.o0n.m().on()).o(n0Var.oomn());
                if (n0VarO != null && (n0oVarM = n0VarO.m(strO)) != null) {
                    jSONObject.put("o_id", strO);
                    jSONObject.put("c_id", n0oVarM.mm());
                }
            }
            if ("0".equals(n0Var.oono()) && (3 == o0mmVar.om0() || 7 == o0mmVar.om0())) {
                String strO2 = o00.o(mapO0n, MBridgeConstans.PROPERTIES_LAYOUT_TYPE);
                if (TextUtils.isEmpty(strO2) || strO2.equals("0")) {
                    strO2 = "2";
                }
                jSONObject.put("tpl_type", strO2);
            }
            if (28 == o0mmVar.nm()) {
                com.thinkup.core.common.on.on0 on0VarN0n3 = o0mmVar.n0n();
                if (on0VarN0n3 != null) {
                    jSONObject.put("origin_price", on0VarN0n3.originPrice);
                }
            } else if (22 == o0mmVar.nm() && (on0VarN0n = o0mmVar.n0n()) != null) {
                jSONObject.put("en_p", on0VarN0n.getExtra());
            }
            n0Var.oom(jSONObject.toString());
            n0Var.n0n(o00.o(mapO0n, "render_type", 0));
            n0Var.no0(o00.o(mapO0n, "template_type", 0));
        } catch (Throwable unused) {
        }
        com.thinkup.core.common.on.on0 on0VarN0n4 = o0mmVar.n0n();
        n0Var.om(on0VarN0n4 != null ? on0VarN0n4.on : "");
        n0Var.m0m(o0mmVar.nnn());
        n0Var.m0m(o0mmVar.nn());
        n0Var.o0(o0mmVar.om0o());
        mm0 mm0VarOmmn = o0mmVar.ommn();
        if (mm0VarOmmn != null) {
            n0Var.on(mm0VarOmmn.m());
            n0Var.m0(mm0VarOmmn.om());
            if (o0mmVar.ommo()) {
                n0Var.nm(mm0VarOmmn.oo());
            } else {
                n0Var.nm(mm0VarOmmn.o0());
            }
            n0Var.mo(mm0VarOmmn.o());
            o0mmVar.m0o();
        }
        n0Var.o(o0mmVar.on00());
        n0Var.nmm(o0mmVar.ooo0());
        n0Var.nmn(o0mmVar.on0m());
        n0Var.nm(o0mmVar.onnm());
        n0Var.omm(o0mmVar.onnn());
        if (on0VarN0n4 != null) {
            if (on0VarN0n4.o0n() > 0) {
                n0Var.on0(on0VarN0n4.oo0());
            }
            n0Var.ono(on0VarN0n4.ooo());
            n0Var.onn(on0VarN0n4.oon());
            n0Var.mon(on0VarN0n4.getOriginRequestId());
        }
        n0Var.o000(o0mmVar.o0om());
    }

    public static void o(com.thinkup.core.common.on.n0 n0Var, com.thinkup.core.oo.n0 n0Var2) {
        if (n0Var == null || n0Var2 == null) {
            return;
        }
        if (n0Var2.o00n() == Integer.parseInt("1")) {
            n0Var.ooo("1");
        } else {
            n0Var.ooo("0");
        }
        n0Var.o0oo(n0Var2.nmn());
        n0Var.m0n(n0Var2.o000());
        n0Var.m0o(n0Var2.o0mn());
        n0Var.mom(String.valueOf(n0Var2.o00n()));
        n0Var.o00(n0Var2.non());
        n0Var.o0o(n0Var2.nom());
        n0Var.mo(n0Var2.mnm());
        n0Var.mm(n0Var2.mnn());
        n0Var.n(n0Var2.noo());
        n0Var.o(n0Var2.nm0());
        n0Var.o0(n0Var2.nmo());
        n0Var.on(n0Var2.m0o());
        n0Var.m0(n0Var2.m0m());
        n0Var.m00(n0Var2.omn());
        JSONObject jSONObjectOomn = n0Var2.oomn();
        if (jSONObjectOomn != null) {
            n0Var.m(jSONObjectOomn);
        }
        n0Var.o00o(n0Var2.o00());
        if (com.thinkup.core.common.oon.o().o(n0Var.oomn())) {
            n0Var.om(2);
        } else {
            n0Var.om(1);
        }
        n0Var.mn0(n0Var2.ommo());
        n0Var.nnn(n0Var2.m00o());
    }

    public static void o(com.thinkup.core.common.on.n0 n0Var, oo00 oo00Var) {
        if (n0Var != null) {
            n0Var.on(oo00Var.oo());
            n0Var.m0(oo00Var.om());
        }
    }

    public static void o(Context context, com.thinkup.core.common.on.n0 n0Var) {
        System.currentTimeMillis();
        int i2 = Integer.parseInt(n0Var.oono());
        int[] iArrO = com.thinkup.core.m.o.o(context).o(Integer.parseInt(n0Var.oono()));
        int i3 = iArrO[0];
        int i4 = iArrO[1];
        o00o o00oVarO = com.thinkup.core.m.o.o(context).o(n0Var.oomn(), i2);
        n0Var.nn(i3 + 1);
        n0Var.o00(i4 + 1);
        n0Var.o0o((o00oVarO != null ? o00oVarO.f42227n : 0) + 1);
        n0Var.o0m((o00oVarO != null ? o00oVarO.o0 : 0) + 1);
        System.currentTimeMillis();
    }

    public static void o(com.thinkup.core.common.on.n0 n0Var) {
        if (n0Var != null) {
            n0Var.mm(0.0d);
            n0Var.om(0.0d);
            n0Var.on(0.0d);
            n0Var.m0(0.0d);
        }
    }
}
