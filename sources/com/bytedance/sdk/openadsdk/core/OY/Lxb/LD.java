package com.bytedance.sdk.openadsdk.core.OY.Lxb;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.bytedance.sdk.openadsdk.core.JVA.JXs.lk;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.DY;
import com.bytedance.sdk.openadsdk.core.model.IeN;
import com.bytedance.sdk.openadsdk.core.model.VVE;
import com.bytedance.sdk.openadsdk.core.model.id;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.sLN;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private static String LD = "";
    public static String Lxb = "https://pag_open_icon_id/appicon.png";

    public static boolean LD() {
        return true;
    }

    public static String Lxb() {
        return LD;
    }

    private static JSONObject LD(tD tDVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            Ivz.Lxb(jSONObject, tDVar);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject Lxb(float f, float f2, boolean z, @NonNull tD tDVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f);
            jSONObject2.put("height", f2);
            if (z) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            if (!(tDVar instanceof DY) || !((DY) tDVar).JW()) {
                jSONObject.put("creative", Lxb(false, tDVar));
                jSONObject.put("template_Plugin", LD(tDVar.rW()));
                jSONObject.put("diff_template_Plugin", Lxb(tDVar.rW()));
                return jSONObject;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject.put("choose_ui_data", jSONObject3);
            com.bytedance.sdk.openadsdk.core.model.Lxb.C0108Lxb c0108LxbDm = ((DY) tDVar).dm();
            JSONObject jSONObjectLD = c0108LxbDm.LD();
            if (TextUtils.isEmpty(c0108LxbDm.QAg())) {
                jSONObjectLD.put("data", LD(c0108LxbDm));
            }
            jSONObject3.put("tpl_info", jSONObjectLD);
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("creatives", jSONArray);
            for (tD tDVar2 : ((DY) tDVar).cRD()) {
                JSONObject jSONObjectLxb = Lxb(false, tDVar2);
                if (jSONObjectLxb != null) {
                    jSONObjectLxb.put("template_Plugin", LD(tDVar2.rW()));
                    jSONObjectLxb.put("diff_template_Plugin", Lxb(tDVar2.rW()));
                    jSONArray.put(jSONObjectLxb);
                }
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String LD(tD.Lxb lxb) {
        com.bytedance.sdk.component.adexpress.Lxb.lk.LD ldLk;
        if (lxb != null) {
            String strQAg = lxb.QAg();
            return (!TextUtils.isEmpty(strQAg) || (ldLk = com.bytedance.sdk.component.adexpress.Lxb.LD.LD.lk(lxb.lc())) == null) ? strQAg : ldLk.JXs();
        }
        return "";
    }

    public static JSONObject Lxb(float f, float f2, boolean z, @NonNull tD tDVar, String str, lk lkVar) {
        LD = "";
        JSONObject jSONObjectJD = null;
        if (tDVar == null) {
            return null;
        }
        try {
            jSONObjectJD = tDVar.JD();
            Lxb(jSONObjectJD, tDVar, str);
            JSONObject jSONObjectLD = Ivz.LD(tDVar);
            jSONObjectLD.put(bc.N, sLN.LD());
            jSONObjectJD.put("xSetting", jSONObjectLD);
            jSONObjectJD.put("xAdInfo", Lxb(str, LD(tDVar), tDVar));
            JSONObject jSONObject = new JSONObject();
            Ivz.LD(jSONObject);
            jSONObject.put("platform", "android");
            jSONObjectJD.put("xAppInfo", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f);
            jSONObject2.put("height", f2);
            if (z) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObjectJD.put("xSize", jSONObject2);
            lkVar.Lxb("adv3");
            id idVarDR = tDVar.dR();
            if (idVarDR != null) {
                String strZU = idVarDR.ZU();
                if (!TextUtils.isEmpty(strZU)) {
                    jSONObjectJD.put("xTemplate", new JSONObject(strZU));
                    LD = "getTemplate success by local data";
                    lkVar.LD("local");
                } else {
                    String strLxb = com.bytedance.sdk.openadsdk.core.JVA.Lxb.LD.Lxb().Lxb("adv3", idVarDR.Lxb(), idVarDR.LD());
                    if (!TextUtils.isEmpty(strLxb)) {
                        jSONObjectJD.put("xTemplate", new JSONObject(strLxb));
                        LD = "getTemplate success by db data";
                        lkVar.LD("local");
                    } else {
                        String str2 = "local db data is null id is " + idVarDR.Lxb() + " md5 is " + idVarDR.LD();
                        LD = str2;
                        lkVar.Lxb(3, str2, "net");
                    }
                }
            }
        } catch (Exception e) {
            String str3 = "load template exception " + e.getMessage();
            LD = str3;
            lkVar.Lxb(3, str3, "net");
        }
        return jSONObjectJD;
    }

    private static void Lxb(JSONObject jSONObject, tD tDVar, String str) {
        KG kgJJ;
        if (tDVar == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("h265_video")) {
                jSONObject.remove("h265_video");
            }
            if (!jSONObject.has("video") || (kgJJ = tDVar.JJ()) == null) {
                return;
            }
            JSONObject jSONObjectC = kgJJ.c();
            if ("open_ad".equals(str)) {
                jSONObjectC.put("video_duration", kqm.ZU().eK(String.valueOf(tDVar.Td())));
            } else {
                jSONObjectC.put("video_duration", kgJJ.d * ((double) kgJJ.r));
            }
            jSONObject.put("video", jSONObjectC);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static JSONObject Lxb(String str, JSONObject jSONObject, tD tDVar) {
        if (tDVar == null) {
            return jSONObject;
        }
        try {
            if ("open_ad".equals(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("app_name", QAg.LD().lc());
                int iEbl = QAg.LD().ebl();
                if (iEbl != 0) {
                    int iId = tDVar.id();
                    if (9 == iId) {
                        jSONObject2.put("app_icon", Lxb);
                    } else if (10 == iId) {
                        jSONObject2.put("app_icon", "@".concat(String.valueOf(iEbl)));
                    }
                }
                jSONObject.put("open_app_info", jSONObject2);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject Lxb(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("keys");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    if (jSONObject.has(strOptString)) {
                        jSONObject3.put(strOptString, jSONObject.opt(strOptString));
                    }
                }
                jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                jSONObject3.put("xSize", jSONObject.opt("xSize"));
                jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                return jSONObject3;
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String Lxb(tD.Lxb lxb) {
        if (lxb != null) {
            return lxb.nBu();
        }
        return "";
    }

    public static JSONObject Lxb(boolean z, @NonNull tD tDVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", tDVar.xr());
            if (tDVar.Lpq() != null) {
                if (tDVar.Lpq() != null && !TextUtils.isEmpty(tDVar.Lpq().Lxb())) {
                    jSONObject.put(RewardPlus.ICON, tDVar.Lpq().Lxb());
                } else {
                    jSONObject.put(RewardPlus.ICON, "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (tDVar.uxf() != null) {
                for (int i = 0; i < tDVar.uxf().size(); i++) {
                    IeN ieN = tDVar.uxf().get(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", ieN.lk());
                    jSONObject2.put("width", ieN.LD());
                    jSONObject2.put("url", ieN.Lxb());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", tDVar.FGm());
            jSONObject.put("interaction_type", tDVar.sRq());
            jSONObject.put("interaction_method", tDVar.brP());
            jSONObject.put("is_compliance_template", LD());
            jSONObject.put(CampaignEx.JSON_KEY_TITLE, tDVar.FD());
            jSONObject.put("description", tDVar.ae());
            jSONObject.put("source", tDVar.VU());
            JSONObject jSONObject3 = new JSONObject();
            VVE vveNBu = tDVar.nBu();
            if (vveNBu == null) {
                vveNBu = new VVE();
            }
            jSONObject3.put("ceiling_time", vveNBu.Lxb());
            jSONObject3.put("ceiling_ratio", vveNBu.LD());
            jSONObject3.put("expand_ratio", vveNBu.lk());
            jSONObject.put("interaction_params", jSONObject3);
            if (tDVar.MGT() != null) {
                jSONObject.put("comment_num", tDVar.MGT().JXs());
                jSONObject.put("score", tDVar.MGT().ZU());
                jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, tDVar.MGT().lc());
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, tDVar.MGT().OY());
            }
            KG kgJJ = tDVar.JJ();
            if (kgJJ != null) {
                JSONObject jSONObjectC = kgJJ.c();
                jSONObjectC.put("video_duration", kgJJ.d * ((double) kgJJ.r));
                jSONObject.put("video", jSONObjectC);
            }
            if (tDVar.rW() != null) {
                jSONObject.put("dynamic_creative", tDVar.rW().JVA());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String Lxb(tD tDVar, String str) {
        List<IeN> listUxf;
        if (tDVar != null && (listUxf = tDVar.uxf()) != null && listUxf.size() > 0) {
            for (IeN ieN : listUxf) {
                if (ieN != null && TextUtils.equals(str, ieN.Lxb())) {
                    return ieN.ebl();
                }
            }
        }
        return null;
    }

    public static Map<String, String> Lxb(tD tDVar) {
        HashMap map = null;
        if (tDVar == null) {
            return null;
        }
        List<IeN> listUxf = tDVar.uxf();
        if (listUxf != null && listUxf.size() > 0) {
            map = new HashMap();
            for (IeN ieN : listUxf) {
                if (ieN != null) {
                    map.put(ieN.Lxb(), ieN.ebl());
                }
            }
            IeN ieNLpq = tDVar.Lpq();
            if (ieNLpq != null) {
                map.put(ieNLpq.Lxb(), ieNLpq.ebl());
            }
        }
        return map;
    }
}
