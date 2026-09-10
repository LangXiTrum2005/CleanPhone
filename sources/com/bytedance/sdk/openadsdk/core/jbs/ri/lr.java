package com.bytedance.sdk.openadsdk.core.jbs.ri;

import android.text.TextUtils;
import com.bykv.vk.openvk.ri.ri.ri.ik.attabal;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.aw;
import com.bytedance.sdk.openadsdk.core.co.xha.ik;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.nr;
import com.bytedance.sdk.openadsdk.core.model.oh;
import com.bytedance.sdk.openadsdk.core.model.tan;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.qt;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.ironsource.L6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private static String lr = "";
    public static String ri = "https://pag_open_icon_id/appicon.png";

    public static boolean ik() {
        return true;
    }

    public static JSONObject lr() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("language", aw.lr());
            jSONObject.put("xSetting", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            dzy.lr(jSONObject3);
            jSONObject3.put(L6.H, "android");
            jSONObject.put("xAppInfo", jSONObject3);
            return jSONObject;
        } catch (Exception e) {
            ac.ik("TemplateUtils", e.getMessage());
            return jSONObject;
        }
    }

    public static String ri() {
        return lr;
    }

    private static JSONObject ik(wjv wjvVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            dzy.ri(jSONObject, wjvVar);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject ri(float f, float f2, boolean z, wjv wjvVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(L6.H, "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f);
            jSONObject2.put("height", f2);
            if (z) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put("creative", ri(false, wjvVar));
            jSONObject.put("template_Plugin", lr(wjvVar.sez()));
            jSONObject.put("diff_template_Plugin", ri(wjvVar.sez()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String lr(wjv.ri riVar) {
        com.bytedance.sdk.component.adexpress.ri.ik.lr lrVarIk;
        if (riVar != null) {
            String strXha = riVar.xha();
            return (!TextUtils.isEmpty(strXha) || (lrVarIk = com.bytedance.sdk.component.adexpress.ri.lr.lr.ik(riVar.ka())) == null) ? strXha : lrVarIk.fi();
        }
        return "";
    }

    public static JSONObject ri(wjv wjvVar) {
        return ri(wjvVar, false, (JSONObject) null);
    }

    public static JSONObject ri(wjv wjvVar, boolean z, JSONObject jSONObject) {
        JSONObject jSONObjectRi = null;
        if (wjvVar == null) {
            return null;
        }
        try {
            jSONObjectRi = ri(wjvVar, false, z);
            if (jSONObjectRi == null) {
                jSONObjectRi = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            dzy.lr(jSONObject2);
            jSONObject2.put(L6.H, "android");
            jSONObjectRi.put("xAppInfo", jSONObject2);
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectRi.put(next, jSONObject.get(next));
                }
            }
            JSONObject jSONObjectLr = dzy.lr(wjvVar);
            jSONObjectLr.put("language", aw.lr());
            jSONObjectRi.put("xSetting", jSONObjectLr);
            return jSONObjectRi;
        } catch (Throwable th) {
            th.getMessage();
            return jSONObjectRi;
        }
    }

    public static Map<String, String> lr(wjv wjvVar) {
        HashMap map = null;
        if (wjvVar == null) {
            return null;
        }
        List<nr> listRbz = wjvVar.rbz();
        if (listRbz != null && listRbz.size() > 0) {
            map = new HashMap();
            for (nr nrVar : listRbz) {
                if (nrVar != null) {
                    map.put(nrVar.ri(), nrVar.xha());
                }
            }
            nr nrVarFb = wjvVar.fb();
            if (nrVarFb != null) {
                map.put(nrVarFb.ri(), nrVarFb.xha());
            }
        }
        return map;
    }

    private static JSONObject ri(wjv wjvVar, boolean z, boolean z2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = null;
        if (wjvVar != null) {
            try {
                String strTt = wjvVar.tt();
                if (strTt != null) {
                    JSONObject jSONObject2 = new JSONObject(strTt);
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("creatives");
                    if (!z && !z2) {
                        jSONObject = new JSONObject();
                    } else {
                        JSONObject jSONObject3 = (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= wjvVar.ik() || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(wjvVar.ik())) == null) ? null : new JSONObject(jSONObjectOptJSONObject.toString());
                        if (jSONObject3 == null) {
                            return null;
                        }
                        jSONObject = jSONObject3;
                    }
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 1) {
                        jSONArrayOptJSONArray.remove(0);
                        jSONObject.put("xRestCreatives", jSONArrayOptJSONArray);
                    }
                    jSONObject2.remove("creatives");
                    jSONObject.put("xRestResponse", jSONObject2);
                }
            } catch (Throwable th) {
                ac.ri("TemplateUtils", "filterTemplateInfo", th);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static JSONObject ri(float f, float f2, boolean z, wjv wjvVar, String str, ik ikVar) {
        lr = "";
        if (wjvVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectRi = ri(f, f2, z, wjvVar, str);
            if (ikVar != null) {
                ikVar.ri("adv3");
            }
            oh ohVarZv = wjvVar.zv();
            if (ohVarZv != null) {
                String strKa = ohVarZv.ka();
                if (!TextUtils.isEmpty(strKa)) {
                    jSONObjectRi.put("xTemplate", new JSONObject(strKa));
                    lr = "getTemplate success by local data";
                    if (ikVar != null) {
                        ikVar.lr("local");
                        return jSONObjectRi;
                    }
                } else {
                    String strRi = com.bytedance.sdk.openadsdk.core.co.ri.lr.ri().ri("adv3", ohVarZv.ri(), ohVarZv.lr());
                    if (!TextUtils.isEmpty(strRi)) {
                        jSONObjectRi.put("xTemplate", new JSONObject(strRi));
                        lr = "getTemplate success by db data";
                        if (ikVar != null) {
                            ikVar.lr("local");
                            return jSONObjectRi;
                        }
                    } else {
                        String str2 = "local db data is null id is " + ohVarZv.ri() + " md5 is " + ohVarZv.lr();
                        lr = str2;
                        if (ikVar != null) {
                            ikVar.ri(3, str2, "net");
                        }
                    }
                }
            }
            return jSONObjectRi;
        } catch (Exception e) {
            String str3 = "load template exception " + e.getMessage();
            lr = str3;
            if (ikVar != null) {
                ikVar.ri(3, str3, "net");
            }
            return null;
        }
    }

    public static JSONObject ri(float f, float f2, boolean z, wjv wjvVar, String str) {
        if (wjvVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectRi = ri(wjvVar, true, true);
            if (jSONObjectRi == null) {
                return null;
            }
            try {
                ri(jSONObjectRi, wjvVar, str);
                JSONObject jSONObjectLr = dzy.lr(wjvVar);
                jSONObjectLr.put("language", aw.lr());
                jSONObjectRi.put("xSetting", jSONObjectLr);
                jSONObjectRi.put("xAdInfo", ri(str, ik(wjvVar), wjvVar));
                JSONObject jSONObject = new JSONObject();
                dzy.lr(jSONObject);
                jSONObject.put(L6.H, "android");
                jSONObjectRi.put("xAppInfo", jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", f);
                jSONObject2.put("height", f2);
                if (z) {
                    jSONObject2.put("isLandscape", true);
                }
                jSONObjectRi.put("xSize", jSONObject2);
                return jSONObjectRi;
            } catch (Throwable unused) {
                return jSONObjectRi;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static void ri(JSONObject jSONObject, wjv wjvVar, String str) {
        if (wjvVar == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("h265_video")) {
                jSONObject.remove("h265_video");
            }
            attabal attabalVarEu = wjvVar.eu();
            if (attabalVarEu != null) {
                JSONObject jSONObjectCord = attabalVarEu.cord();
                jSONObjectCord.put("video_duration", attabalVarEu.beachfront() * ((double) attabalVarEu.polder()));
                jSONObject.put("video", jSONObjectCord);
            } else if ("open_ad".equals(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("video_duration", com.bytedance.sdk.openadsdk.core.nr.ka().wjv(String.valueOf(wjvVar.ur())));
                jSONObject.put("video", jSONObject2);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static JSONObject ri(String str, JSONObject jSONObject, wjv wjvVar) {
        if (wjvVar != null) {
            try {
                if ("open_ad".equals(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("app_name", qt.lr().mj());
                    int iJbs = qt.lr().jbs();
                    if (iJbs != 0) {
                        int iHpn = wjvVar.hpn();
                        if (9 == iHpn) {
                            jSONObject2.put("app_icon", ri);
                        } else if (10 == iHpn) {
                            jSONObject2.put("app_icon", "@".concat(String.valueOf(iJbs)));
                        }
                    }
                    jSONObject.put("open_app_info", jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject ri(JSONObject jSONObject, JSONObject jSONObject2) {
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
                jSONObject3.put("dynamic_configs", jSONObject.opt("dynamic_configs"));
                jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                jSONObject3.put("xRestCreatives", jSONObject.opt("xRestCreatives"));
                jSONObject3.put("xRestResponse", jSONObject.opt("xRestResponse"));
                return jSONObject3;
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String ri(wjv.ri riVar) {
        if (riVar != null) {
            return riVar.mj();
        }
        return "";
    }

    public static JSONObject ri(boolean z, wjv wjvVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", wjvVar.skk());
            if (wjvVar.fb() != null) {
                if (wjvVar.fb() != null && !TextUtils.isEmpty(wjvVar.fb().ri())) {
                    jSONObject.put("icon", wjvVar.fb().ri());
                } else {
                    jSONObject.put("icon", "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (wjvVar.rbz() != null) {
                for (int i = 0; i < wjvVar.rbz().size(); i++) {
                    nr nrVar = wjvVar.rbz().get(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", nrVar.ik());
                    jSONObject2.put("width", nrVar.lr());
                    jSONObject2.put("url", nrVar.ri());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", wjvVar.vz());
            jSONObject.put("interaction_type", wjvVar.adz());
            jSONObject.put("interaction_method", wjvVar.zb());
            jSONObject.put("is_compliance_template", ik());
            jSONObject.put("title", wjvVar.xh());
            jSONObject.put(InMobiNetworkValues.DESCRIPTION, wjvVar.tq());
            jSONObject.put("source", wjvVar.tpb());
            JSONObject jSONObject3 = new JSONObject();
            tan tanVarSu = wjvVar.su();
            if (tanVarSu == null) {
                tanVarSu = new tan();
            }
            jSONObject3.put("ceiling_time", tanVarSu.ka());
            jSONObject3.put("ceiling_ratio", tanVarSu.fi());
            jSONObject3.put("expand_ratio", tanVarSu.di());
            jSONObject.put("interaction_params", jSONObject3);
            if (wjvVar.tyz() != null) {
                jSONObject.put("comment_num", wjvVar.tyz().fi());
                jSONObject.put("score", wjvVar.tyz().ka());
                jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, wjvVar.tyz().di());
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, wjvVar.tyz().mj());
            }
            attabal attabalVarEu = wjvVar.eu();
            if (attabalVarEu != null) {
                JSONObject jSONObjectCord = attabalVarEu.cord();
                jSONObjectCord.put("video_duration", attabalVarEu.beachfront() * ((double) attabalVarEu.polder()));
                jSONObject.put("video", jSONObjectCord);
            }
            if (wjvVar.sez() != null) {
                jSONObject.put("dynamic_creative", wjvVar.sez().jbs());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String ri(wjv wjvVar, String str) {
        List<nr> listRbz;
        if (wjvVar != null && (listRbz = wjvVar.rbz()) != null && listRbz.size() > 0) {
            for (nr nrVar : listRbz) {
                if (nrVar != null && TextUtils.equals(str, nrVar.ri())) {
                    return nrVar.xha();
                }
            }
        }
        return null;
    }
}
