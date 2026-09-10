package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bykv.vk.openvk.ri.ri.ri.ik.attabal;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.ads.mediation.pangle.PangleRequestHelper;
import com.ironsource.C3414a2;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr {

    public static class ri {
        public int lr;
        public String ri;

        public ri(String str, int i) {
            this.ri = str;
            this.lr = i;
        }
    }

    private static com.bytedance.sdk.openadsdk.core.model.ihz di(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.ihz ihzVar = new com.bytedance.sdk.openadsdk.core.model.ihz();
        if (jSONObject == null) {
            ihzVar.ri(10L);
            ihzVar.lr(20L);
            ihzVar.ik(10L);
            ihzVar.ka(20L);
            ihzVar.ri("");
            return ihzVar;
        }
        ihzVar.ri(jSONObject.optLong("onlylp_loading_maxtime", 10L));
        ihzVar.lr(jSONObject.optLong("straight_lp_showtime", 20L));
        ihzVar.ik(jSONObject.optLong("onlyagg_loading_maxtime", 10L));
        ihzVar.ka(jSONObject.optLong("straight_agg_showtime", 20L));
        ihzVar.ri(jSONObject.optString("loading_text", ""));
        return ihzVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.di fi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.di diVar = new com.bytedance.sdk.openadsdk.core.model.di();
        diVar.lr(jSONObject.optString("app_name"));
        diVar.ik(jSONObject.optString("package_name"));
        diVar.ri(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
        diVar.ri(jSONObject.optDouble("score", -1.0d));
        diVar.ri(jSONObject.optInt("comment_num", -1));
        diVar.lr(jSONObject.optInt(CampaignEx.JSON_KEY_APP_SIZE, 0));
        diVar.ka(jSONObject.optString("app_category"));
        return diVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.xha ik(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("splash_clickarea", 2);
        int iOptInt2 = jSONObject.optInt("splash_layout_id", 1);
        long jOptLong = jSONObject.optLong("load_wait_time", 0L);
        long j = jOptLong >= 0 ? jOptLong : 0L;
        int iOptInt3 = jSONObject.optInt("skip_time", -1);
        com.bytedance.sdk.openadsdk.core.model.xha xhaVar = new com.bytedance.sdk.openadsdk.core.model.xha();
        xhaVar.lr(iOptInt);
        xhaVar.ik(iOptInt2);
        xhaVar.ri(j);
        xhaVar.ri(iOptInt3);
        return xhaVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.bgr jbs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.bgr bgrVar = new com.bytedance.sdk.openadsdk.core.model.bgr();
        bgrVar.ri(jSONObject.optInt("if_send_click", 0));
        return bgrVar;
    }

    private static FilterWord ka(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    FilterWord filterWordKa = ka(jSONArrayOptJSONArray.optJSONObject(i));
                    if (filterWordKa != null && filterWordKa.isValid()) {
                        filterWord.addOption(filterWordKa);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static com.bytedance.sdk.openadsdk.core.co.mj.ri lr(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.co.mj.ri riVar = new com.bytedance.sdk.openadsdk.core.co.mj.ri();
        riVar.ri(jSONObject.optString("id"));
        riVar.lr(jSONObject.optString("md5"));
        riVar.ik(jSONObject.optString("url"));
        return riVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.mj mj(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.mj mjVar = new com.bytedance.sdk.openadsdk.core.model.mj();
        if (jSONObject == null) {
            mjVar.ik(0);
            mjVar.ka(0);
            mjVar.lr(new ArrayList());
            mjVar.fi(0);
            mjVar.ri(new ArrayList());
            mjVar.lr(0);
            mjVar.ri(0);
            return mjVar;
        }
        mjVar.ik(jSONObject.optInt("interceptor_x", 0));
        mjVar.ka(jSONObject.optInt("interceptor_y", 0));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("interceptor_page");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i)));
            }
        }
        mjVar.lr(arrayList);
        mjVar.fi(jSONObject.optInt("interceptor_interval_time", 0));
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("url_regular");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList2.add(jSONArrayOptJSONArray2.optString(i2));
            }
        }
        mjVar.ri(arrayList2);
        mjVar.lr(jSONObject.optInt("boc_index", 0));
        mjVar.ri(jSONObject.optInt("is_act", 0));
        return mjVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.aw qt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.aw awVar = new com.bytedance.sdk.openadsdk.core.model.aw();
        awVar.ri(jSONObject.optString("deeplink_url"));
        awVar.lr(jSONObject.optString("fallback_url"));
        awVar.ri(jSONObject.optInt("fallback_type"));
        return awVar;
    }

    private static boolean ri(int i) {
        return i == 2 || i == 3 || i == 8;
    }

    private static Map<String, Object> sf(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                map.put(next, jSONObject.opt(next));
            }
        }
        return map;
    }

    private static com.bytedance.sdk.openadsdk.core.model.tan xha(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.tan tanVar = new com.bytedance.sdk.openadsdk.core.model.tan();
        if (jSONObject == null) {
            tanVar.ka(5);
            tanVar.fi(30);
            tanVar.di(70);
            tanVar.xha(1);
            tanVar.mj(com.bytedance.sdk.openadsdk.core.model.tan.ri);
            tanVar.ik(0);
            tanVar.lr(0);
            tanVar.ri(3);
            return tanVar;
        }
        tanVar.ka(jSONObject.optInt("ceiling_time", 5));
        tanVar.fi(jSONObject.optInt("ceiling_ratio", 30));
        tanVar.di(jSONObject.optInt("expand_ratio", 70));
        tanVar.xha(jSONObject.optInt("back_type", 1));
        tanVar.mj(jSONObject.optInt("boc_return_type", com.bytedance.sdk.openadsdk.core.model.tan.ri));
        tanVar.ik(jSONObject.optInt("pre_render_status", 0));
        tanVar.lr(jSONObject.optInt("pre_render_use_gecko", 0));
        tanVar.ri(jSONObject.optInt("pre_render_add_type", 3));
        return tanVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [android.util.Pair<com.bytedance.sdk.openadsdk.core.model.ri, java.util.ArrayList<java.lang.Integer>>] */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static Pair<com.bytedance.sdk.openadsdk.core.model.ri, ArrayList<Integer>> ri(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.igq igqVar) {
        ?? r17;
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar;
        ?? r9;
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2;
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar3 = null;
        wjvVar3 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.ri riVar = new com.bytedance.sdk.openadsdk.core.model.ri();
            riVar.ri(jSONObject.optString("request_id"));
            riVar.ri(jSONObject.optInt("ret"));
            riVar.lr(jSONObject.optInt("multi_ad_style", 0));
            riVar.lr(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            String strOptString = jSONObject.optString("gdid_encrypted");
            riVar.ri(com.bytedance.sdk.openadsdk.core.model.uq.ri(jSONObject.optJSONObject("loop_config")));
            String strOptString2 = jSONObject.optString("auction_price");
            if (riVar.ik() != 0) {
                return null;
            }
            riVar.ri(com.bytedance.sdk.openadsdk.core.model.fr.ri(jSONObject.optString("multi_ad_config")));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                jSONArrayOptJSONArray.length();
                int i = 0;
                ?? arrayList2 = riVar.mj() ? new ArrayList() : null;
                while (i < jSONArrayOptJSONArray.length()) {
                    com.bytedance.sdk.openadsdk.core.model.wjv wjvVarRi = ri(jSONArrayOptJSONArray.optJSONObject(i), adSlot, igqVar, riVar, i);
                    if (!riVar.mj()) {
                        r9 = arrayList2;
                        r9 = wjvVar3;
                    }
                    r9 = arrayList2;
                    int iRi = ri(wjvVarRi);
                    if (iRi != 200) {
                        if (wjvVarRi != null) {
                            com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVarRi, com.bytedance.sdk.openadsdk.utils.ig.ik(wjvVarRi.go()), iRi);
                        } else {
                            com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar3, "", iRi);
                        }
                        arrayList.add(Integer.valueOf(iRi));
                        if (r9 == 0 || wjvVarRi == null) {
                            wjvVar2 = wjvVar3;
                        } else {
                            wjvVar = wjvVar3;
                            try {
                                r9.add(new ri(wjvVarRi.fe(), iRi));
                                wjvVar2 = wjvVar;
                            } catch (Throwable th) {
                                th = th;
                                r17 = wjvVar;
                            }
                        }
                        if (wjvVarRi != null && (wjvVarRi.nd() == 39 || wjvVarRi.nd() == 41)) {
                            riVar.lr(0);
                        }
                        jSONArrayOptJSONArray.remove(i);
                        i--;
                    } else {
                        wjvVar2 = wjvVar3;
                        wjvVarRi.bgr(strOptString2);
                        if (!TextUtils.isEmpty(strOptString)) {
                            wjvVarRi.jbs(strOptString);
                        }
                        riVar.ri(wjvVarRi);
                    }
                    i++;
                    wjvVar3 = wjvVar2;
                    arrayList2 = r9;
                }
                wjvVar = wjvVar3;
                List<com.bytedance.sdk.openadsdk.core.model.wjv> listKa = riVar.ka();
                ri(listKa, riVar);
                if (listKa != null) {
                    if (riVar.mj() && listKa.size() == 1) {
                        riVar.lr(0);
                        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar4 = listKa.get(0);
                        if (wjvVar4 != null) {
                            wjvVar4.sf(false);
                        }
                    }
                    int size = listKa.size();
                    jSONObject.put("creatives", jSONArrayOptJSONArray);
                    for (int i2 = 0; i2 < size; i2++) {
                        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar5 = listKa.get(i2);
                        if (wjvVar5 != null) {
                            if (i2 > 0) {
                                wjvVar5.zp();
                            }
                            wjvVar5.xd(jSONObject.toString());
                        }
                    }
                }
                if (arrayList2 != 0 && !arrayList2.isEmpty()) {
                    ri((ArrayList<ri>) arrayList2);
                }
            } else {
                wjvVar = null;
            }
            return new Pair<>(riVar, arrayList);
        } catch (Throwable th2) {
            th = th2;
            r17 = wjvVar3;
        }
        com.bytedance.sdk.component.utils.ac.ik("TTAD.AdInfoFactory", th.getMessage());
        return r17;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    private static int lr(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        int iRi;
        String strIk = com.bytedance.sdk.openadsdk.utils.ig.ik(wjvVar.go());
        if (wjvVar.yv() == 0) {
            iRi = ri(wjvVar.lau());
            com.bytedance.sdk.openadsdk.ka.ik.ik(wjvVar, strIk, iRi);
        } else {
            iRi = 200;
        }
        int iAdz = wjvVar.adz();
        if (iAdz == 2 || iAdz == 3) {
            if (ka(wjvVar) && TextUtils.isEmpty(wjvVar.smj())) {
                com.bytedance.sdk.openadsdk.ka.ik.ik(wjvVar, strIk, 406);
                iRi = 406;
            }
        } else if (iAdz == 4) {
            com.bytedance.sdk.openadsdk.core.model.di diVarTyz = wjvVar.tyz();
            if (diVarTyz == null) {
                com.bytedance.sdk.openadsdk.ka.ik.ik(wjvVar, strIk, 407);
                iRi = 407;
            } else if (TextUtils.isEmpty(diVarTyz.ik()) && TextUtils.isEmpty(diVarTyz.ri())) {
                com.bytedance.sdk.openadsdk.ka.ik.ik(wjvVar, strIk, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME);
                iRi = 417;
            } else if (TextUtils.isEmpty(diVarTyz.ik())) {
                iRi = TTAdConstant.PACKAGE_NAME_CODE;
                com.bytedance.sdk.openadsdk.ka.ik.ik(wjvVar, strIk, TTAdConstant.PACKAGE_NAME_CODE);
            } else if (TextUtils.isEmpty(diVarTyz.ri())) {
                iRi = 408;
                com.bytedance.sdk.openadsdk.ka.ik.ik(wjvVar, strIk, 408);
            }
        } else if (iAdz == 8) {
            if (ka(wjvVar)) {
                com.bytedance.sdk.openadsdk.ka.ik.ik(wjvVar, strIk, 406);
                iRi = 406;
            }
        }
        if (iRi == 417 || iRi == 407 || iRi == 406) {
            return iRi;
        }
        if (iRi != 200) {
            com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, strIk, iRi);
        }
        return 200;
    }

    private static int ik(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        int iRi;
        String strIk = com.bytedance.sdk.openadsdk.utils.ig.ik(wjvVar.go());
        if (wjvVar.yv() == 0) {
            iRi = ri(wjvVar.lau());
            if (iRi != 200) {
                com.bytedance.sdk.openadsdk.ka.ik.ik(wjvVar, strIk, iRi);
                return iRi;
            }
        } else {
            iRi = 200;
        }
        int iAdz = wjvVar.adz();
        if (iAdz != 2 && iAdz != 3) {
            if (iAdz == 4) {
                int iRi2 = ri(wjvVar.tyz());
                if (iRi2 != 200) {
                    com.bytedance.sdk.openadsdk.ka.ik.ik(wjvVar, strIk, iRi2);
                }
                return iRi2;
            }
            if (iAdz != 8) {
                return iRi;
            }
        }
        if (!ka(wjvVar) || !TextUtils.isEmpty(wjvVar.smj())) {
            return iRi;
        }
        com.bytedance.sdk.openadsdk.ka.ik.ik(wjvVar, strIk, 406);
        return 406;
    }

    private static boolean ka(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        return (wjvVar.zz() || wjvVar.zyu()) ? false : true;
    }

    private static void ri(List<com.bytedance.sdk.openadsdk.core.model.wjv> list, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = list.get(0);
        if (!riVar.mj() || wjvVar == null || !wjvVar.biu() || com.bytedance.sdk.openadsdk.utils.ig.ory() == 0) {
            return;
        }
        riVar.lr(0);
        wjvVar.sf(false);
    }

    /* JADX WARN: Code duplicated, block: B:181:0x06d4 A[PHI: r0
  0x06d4: PHI (r0v88 int) = (r0v87 int), (r0v137 int) binds: [B:174:0x06c0, B:179:0x06d1] A[DONT_GENERATE, DONT_INLINE]] */
    public static com.bytedance.sdk.openadsdk.core.model.wjv ri(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.igq igqVar, com.bytedance.sdk.openadsdk.core.model.ri riVar, int i) {
        attabal attabalVarRi;
        attabal attabalVarRi2;
        int i2;
        String str;
        com.bytedance.sdk.openadsdk.core.aw.ri riVar2;
        com.bytedance.sdk.openadsdk.core.aw.ri.lr.ri riVar3;
        com.bytedance.sdk.openadsdk.core.aw.ri riVarRi;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = new com.bytedance.sdk.openadsdk.core.model.wjv();
        if (riVar != null) {
            wjvVar.ri(riVar);
            if (riVar.mj()) {
                int iOptInt = jSONObject.optInt("interaction_method");
                if (iOptInt != 30 && iOptInt != 39 && iOptInt != 40 && iOptInt != 41 && iOptInt != 43 && iOptInt != 44) {
                    riVar.lr(0);
                    wjvVar.sf(false);
                } else {
                    wjvVar.sf(true);
                }
            }
        }
        wjvVar.ri(i);
        ri(jSONObject, wjvVar);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("multi_ad_scene");
        if (jSONObjectOptJSONObject4 != null) {
            wjvVar.ri(com.bytedance.sdk.openadsdk.core.model.su.ri(jSONObjectOptJSONObject4));
        }
        if (jSONObject.has("raw_response_info")) {
            wjvVar.xd(jSONObject.optString("raw_response_info"));
        }
        wjvVar.bgr(jSONObject.optInt("proportion_watching", -1));
        wjvVar.bu(jSONObject.optBoolean("mate_disable_cache", false));
        wjvVar.ory(jSONObject.optInt("interaction_type"));
        wjvVar.dw(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.wjv.ik, 0));
        wjvVar.hcw(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.wjv.lr, 0));
        wjvVar.oh(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.wjv.ka, 0));
        wjvVar.nr(jSONObject.optString("target_url"));
        wjvVar.wjv(jSONObject.optString("ad_id"));
        wjvVar.ay(jSONObject.optString("app_log_url"));
        wjvVar.fr(jSONObject.optString("settings_url"));
        wjvVar.slm(jSONObject.optString("source"));
        wjvVar.bu(jSONObject.optString("app_name"));
        wjvVar.ig(jSONObject.optInt("dislike_control", 0));
        wjvVar.ay(jSONObject.optInt("play_bar_show_time", AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES));
        wjvVar.igq(jSONObject.optString("gecko_id"));
        wjvVar.lr(jSONObject.optInt("lp_cache_count", 0));
        if (jSONObject.has("set_click_type")) {
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("set_click_type");
            wjvVar.lr(jSONObjectOptJSONObject5.optDouble("cta", 2.0d));
            wjvVar.ri(jSONObjectOptJSONObject5.optDouble(C3414a2.d, 1.0d));
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("extension");
        wjvVar.di(jSONObjectOptJSONObject6);
        if (jSONObjectOptJSONObject6 != null) {
            wjvVar.ri(new com.bytedance.sdk.openadsdk.core.model.bu(jSONObjectOptJSONObject6));
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("icon");
        wjvVar.co(jSONObject.optBoolean("screenshot", false));
        wjvVar.uq(jSONObject.optInt("play_bar_style", 0));
        wjvVar.zf(jSONObject.optString("market_url", ""));
        wjvVar.ac(jSONObject.optInt("video_adaptation", 0));
        wjvVar.bu(jSONObject.optInt("feed_video_opentype", 0));
        wjvVar.ik(jSONObject.optJSONObject("session_params"));
        JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("dynamic_configs");
        wjvVar.ka(jSONObjectOptJSONObject8);
        if (jSONObjectOptJSONObject8 != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject8.optJSONObject("speed_config")) != null) {
            com.bytedance.sdk.openadsdk.core.model.ory oryVar = new com.bytedance.sdk.openadsdk.core.model.ory();
            oryVar.ri((float) jSONObjectOptJSONObject3.optDouble("speed", 1.0d));
            oryVar.ri(jSONObjectOptJSONObject3.optInt("type", 0));
            wjvVar.ri(oryVar);
        }
        wjvVar.bgr(jSONObject.optString("auction_price", ""));
        wjvVar.zyn(jSONObject.optInt("mrc_report", 0));
        if (jSONObject.optBoolean("isMrcReportFinish", false)) {
            wjvVar.ar();
        }
        JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject("render");
        if (jSONObjectOptJSONObject9 != null) {
            wjvVar.nr(jSONObjectOptJSONObject9.optInt("render_sequence", 0));
            wjvVar.tan(jSONObjectOptJSONObject9.optInt("backup_render_control", 1));
            wjvVar.tnn(jSONObjectOptJSONObject9.optInt("reserve_time", 100));
            wjvVar.fe(jSONObjectOptJSONObject9.optInt("render_thread", 0));
        }
        wjvVar.vr(jSONObject.optInt("render_control", igqVar != null ? igqVar.jbs : 1));
        if (jSONObjectOptJSONObject7 != null) {
            com.bytedance.sdk.openadsdk.core.model.nr nrVar = new com.bytedance.sdk.openadsdk.core.model.nr();
            nrVar.ri(jSONObjectOptJSONObject7.optString("url"));
            nrVar.lr(jSONObjectOptJSONObject7.optInt("height"));
            nrVar.ri(jSONObjectOptJSONObject7.optInt("width"));
            wjvVar.ri(nrVar);
        }
        JSONObject jSONObjectOptJSONObject10 = jSONObject.optJSONObject("reward_data");
        if (jSONObjectOptJSONObject10 != null) {
            wjvVar.aw(jSONObjectOptJSONObject10.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT, 0));
            wjvVar.co(jSONObjectOptJSONObject10.optString(CampaignEx.JSON_KEY_REWARD_NAME, ""));
        }
        JSONObject jSONObjectOptJSONObject11 = jSONObject.optJSONObject("cover_image");
        if (jSONObjectOptJSONObject11 != null) {
            com.bytedance.sdk.openadsdk.core.model.nr nrVar2 = new com.bytedance.sdk.openadsdk.core.model.nr();
            nrVar2.ri(jSONObjectOptJSONObject11.optString("url"));
            nrVar2.lr(jSONObjectOptJSONObject11.optInt("height"));
            nrVar2.ri(jSONObjectOptJSONObject11.optInt("width"));
            wjvVar.lr(nrVar2);
        }
        if (jSONObject.has("banner") && (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("banner")) != null) {
            wjvVar.ri(new PAGBannerSize(jSONObjectOptJSONObject2.optInt("width", 0), jSONObjectOptJSONObject2.optInt("height", 0)));
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
        if (jSONArrayOptJSONArray != null) {
            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                com.bytedance.sdk.openadsdk.core.model.nr nrVar3 = new com.bytedance.sdk.openadsdk.core.model.nr();
                JSONObject jSONObjectOptJSONObject12 = jSONArrayOptJSONArray.optJSONObject(i3);
                nrVar3.ri(jSONObjectOptJSONObject12.optString("url"));
                nrVar3.lr(jSONObjectOptJSONObject12.optInt("height"));
                nrVar3.ri(jSONObjectOptJSONObject12.optInt("width"));
                nrVar3.ri(jSONObjectOptJSONObject12.optBoolean("image_preview"));
                nrVar3.lr(jSONObjectOptJSONObject12.optString("image_key"));
                wjvVar.ik(nrVar3);
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("show_url");
        if (jSONArrayOptJSONArray2 != null) {
            for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                wjvVar.amj().add(jSONArrayOptJSONArray2.optString(i4));
            }
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(CampaignEx.JSON_KEY_CLICK_URL);
        if (jSONArrayOptJSONArray3 != null) {
            for (int i5 = 0; i5 < jSONArrayOptJSONArray3.length(); i5++) {
                wjvVar.bfa().add(jSONArrayOptJSONArray3.optString(i5));
            }
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("play_start");
        if (jSONArrayOptJSONArray4 != null) {
            for (int i6 = 0; i6 < jSONArrayOptJSONArray4.length(); i6++) {
                wjvVar.fn().add(jSONArrayOptJSONArray4.optString(i6));
            }
        }
        JSONObject jSONObjectOptJSONObject13 = jSONObject.optJSONObject("click_area");
        if (jSONObjectOptJSONObject13 != null) {
            com.bytedance.sdk.openadsdk.core.model.sf sfVar = new com.bytedance.sdk.openadsdk.core.model.sf();
            sfVar.ri = jSONObjectOptJSONObject13.optBoolean("click_upper_content_area", true);
            sfVar.lr = jSONObjectOptJSONObject13.optBoolean("click_upper_non_content_area", true);
            sfVar.ik = jSONObjectOptJSONObject13.optBoolean("click_lower_content_area", true);
            sfVar.ka = jSONObjectOptJSONObject13.optBoolean("click_lower_non_content_area", true);
            sfVar.fi = jSONObjectOptJSONObject13.optBoolean("click_button_area", true);
            sfVar.di = jSONObjectOptJSONObject13.optBoolean("click_video_area", true);
            wjvVar.ri(sfVar);
        }
        JSONObject jSONObjectOptJSONObject14 = jSONObject.optJSONObject("adslot");
        if (jSONObjectOptJSONObject14 != null) {
            wjvVar.ri(ri(jSONObjectOptJSONObject14));
        } else {
            wjvVar.ri(adSlot);
        }
        if (adSlot != null) {
            Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
            if (requestExtraMap != null && requestExtraMap.containsKey(PangleRequestHelper.ADMOB_WATERMARK_KEY)) {
                wjvVar.qt(String.valueOf(requestExtraMap.get(PangleRequestHelper.ADMOB_WATERMARK_KEY)));
            }
        } else {
            wjvVar.qt(jSONObject.optString("identificationOverlayContent"));
        }
        wjvVar.wjv(jSONObject.optInt("intercept_flag", 0));
        wjvVar.tan(jSONObject.optString("phone_num"));
        wjvVar.ac(jSONObject.optString("title"));
        wjvVar.ihz(jSONObject.optString(InMobiNetworkValues.DESCRIPTION));
        wjvVar.uq(jSONObject.optString("button_text"));
        wjvVar.ihz(jSONObject.optInt("ad_logo", 1));
        wjvVar.su(jSONObject.optString("ext"));
        wjvVar.igq(jSONObject.optInt("cover_click_area", 0));
        wjvVar.xd(jSONObject.optInt("image_mode"));
        wjvVar.pv(jSONObject.optInt("orientation", 1));
        wjvVar.ri((float) jSONObject.optDouble("aspect_ratio", 100.0d));
        wjvVar.igq(jSONObject.optInt("cover_click_area", 0));
        JSONObject jSONObjectOptJSONObject15 = jSONObject.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        JSONObject jSONObjectOptJSONObject16 = jSONObject.optJSONObject(CampaignEx.JSON_KEY_DEEP_LINK_URL);
        JSONObject jSONObjectOptJSONObject17 = jSONObject.optJSONObject("oem");
        wjvVar.di(jSONObject.optInt("is_web_jump_ip", 0));
        wjvVar.ri(com.bytedance.sdk.openadsdk.core.model.zf.ri(jSONObjectOptJSONObject17));
        wjvVar.ri(fi(jSONObjectOptJSONObject15));
        JSONObject jSONObjectOptJSONObject18 = jSONObject.optJSONObject("interaction_method_params");
        wjvVar.ri(mj(jSONObject.optJSONObject("arbitrage_interceptor_params")));
        wjvVar.ri(di(jSONObjectOptJSONObject18));
        wjvVar.ri(xha(jSONObjectOptJSONObject18));
        wjvVar.ri(qt(jSONObjectOptJSONObject16));
        wjvVar.ri(new com.bytedance.sdk.openadsdk.core.model.dw(jSONObject));
        JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("filter_words");
        if (jSONArrayOptJSONArray5 != null) {
            for (int i7 = 0; i7 < jSONArrayOptJSONArray5.length(); i7++) {
                FilterWord filterWordKa = ka(jSONArrayOptJSONArray5.optJSONObject(i7));
                if (filterWordKa != null && filterWordKa.isValid()) {
                    wjvVar.ri(filterWordKa);
                }
            }
        }
        wjvVar.dzy(jSONObject.optInt("count_down"));
        wjvVar.ik(jSONObject.optLong("expiration_time"));
        wjvVar.siy(jSONObject.optInt("video_encode_type", 0));
        wjvVar.bnj(0);
        JSONObject jSONObjectOptJSONObject19 = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject19 != null) {
            attabalVarRi = ri(jSONObjectOptJSONObject19, wjvVar, true);
            wjvVar.lr(attabalVarRi);
            wjvVar.mj(jSONObjectOptJSONObject19.optInt("multi_played_percent", 50));
        } else {
            attabalVarRi = null;
        }
        JSONObject jSONObjectOptJSONObject20 = jSONObject.optJSONObject("h265_video");
        if (jSONObjectOptJSONObject20 != null) {
            attabalVarRi2 = ri(jSONObjectOptJSONObject20, wjvVar, false);
            wjvVar.ik(attabalVarRi2);
        } else {
            attabalVarRi2 = null;
        }
        if (Build.VERSION.SDK_INT < 26 || wjvVar.sh() == 0) {
            wjvVar.ri(attabalVarRi);
            wjvVar.siy(0);
        } else {
            if (attabalVarRi2 != null && attabalVarRi != null) {
                if (TextUtils.isEmpty(attabalVarRi2.marial())) {
                    attabalVarRi2.graveside(attabalVarRi.marial());
                }
                if (TextUtils.isEmpty(attabalVarRi2.saneness())) {
                    attabalVarRi2.apical(attabalVarRi.saneness());
                }
                if (attabalVarRi2.polloi() == -1) {
                    attabalVarRi2.molybdenite(attabalVarRi.polloi());
                }
            }
            if (attabalVarRi2 != null) {
                wjvVar.ri(attabalVarRi2);
            } else {
                wjvVar.ri(attabalVarRi);
            }
        }
        JSONObject jSONObjectOptJSONObject21 = jSONObject.optJSONObject("download_conf");
        if (jSONObjectOptJSONObject21 != null) {
            wjvVar.ri(jbs(jSONObjectOptJSONObject21));
        }
        wjvVar.ri(sf(jSONObject.optJSONObject("media_ext")));
        JSONObject jSONObjectOptJSONObject22 = jSONObject.optJSONObject("tpl_info");
        if (jSONObjectOptJSONObject22 != null) {
            com.bytedance.sdk.openadsdk.core.model.wjv.ri riVar4 = new com.bytedance.sdk.openadsdk.core.model.wjv.ri();
            riVar4.ik(jSONObjectOptJSONObject22.optString("id"));
            riVar4.ka(jSONObjectOptJSONObject22.optString("md5"));
            riVar4.fi(jSONObjectOptJSONObject22.optString("url"));
            riVar4.di(jSONObjectOptJSONObject22.optString("data"));
            riVar4.xha(jSONObjectOptJSONObject22.optString("diff_data"));
            String strOptString = jSONObjectOptJSONObject22.optString("dynamic_creative");
            riVar4.mj(strOptString);
            riVar4.lr(jSONObjectOptJSONObject22.optString("version"));
            riVar4.jbs(jSONObjectOptJSONObject22.optString("media_view"));
            try {
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObject2 = new JSONObject(strOptString);
                JSONArray jSONArrayOptJSONArray6 = jSONObject2.optJSONArray("tag_ids");
                if (jSONArrayOptJSONArray6 != null) {
                    for (int i8 = 0; i8 < jSONArrayOptJSONArray6.length(); i8++) {
                        arrayList.add(Integer.valueOf(jSONArrayOptJSONArray6.optInt(i8)));
                    }
                }
                String strOptString2 = jSONObject2.optString("music_url");
                riVar4.ri(arrayList);
                riVar4.ri(strOptString2);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.ac.ik("TTAD.AdInfoFactory", e.getMessage());
            }
            riVar4.qt(jSONObjectOptJSONObject22.optString("engine_version"));
            riVar4.sf(jSONObjectOptJSONObject22.optString("ugen_url"));
            riVar4.co(jSONObjectOptJSONObject22.optString("ugen_md5"));
            riVar4.aw(jSONObjectOptJSONObject22.optString("ugen_data"));
            wjvVar.ri(riVar4);
        }
        JSONObject jSONObjectOptJSONObject23 = jSONObject.optJSONObject("tpl_info_v3");
        if (jSONObjectOptJSONObject23 != null) {
            wjvVar.ri(com.bytedance.sdk.openadsdk.core.model.oh.ri(jSONObjectOptJSONObject23));
        }
        JSONObject jSONObjectOptJSONObject24 = jSONObject.optJSONObject("dynamic_creative");
        if (jSONObjectOptJSONObject24 != null) {
            wjvVar.lr(jSONObjectOptJSONObject24);
        }
        wjvVar.vr(jSONObject.optString("creative_extra"));
        wjvVar.slm(jSONObject.optInt("if_block_lp", 0));
        wjvVar.fr(jSONObject.optInt("cache_sort", 1));
        wjvVar.su(jSONObject.optInt("if_sp_cache", 0));
        JSONObject jSONObjectOptJSONObject25 = jSONObject.optJSONObject("splash_control");
        if (jSONObjectOptJSONObject25 != null) {
            wjvVar.ri(ik(jSONObjectOptJSONObject25));
        }
        wjvVar.qd(jSONObject.optInt("is_package_open", 1));
        wjvVar.aw(jSONObject.optString("ad_info", null));
        wjvVar.zf(jSONObject.optInt("ua_policy", 2));
        wjvVar.srn(jSONObject.optInt("playable_duration_time", 30));
        wjvVar.jc(jSONObject.optInt("playable_close_time", -1));
        wjvVar.kt(jSONObject.optInt("playable_endcard_close_time", -1));
        wjvVar.feb(jSONObject.optInt("endcard_close_time", -1));
        wjvVar.qt(jSONObject.optInt("interaction_method"));
        wjvVar.sf(jSONObject.optInt("top_area_leave_blank", 0));
        wjvVar.rzk(jSONObject.optInt("lp_click_type", -1));
        wjvVar.fi(jSONObject.optInt("lp_click_interval", -1));
        wjvVar.dw(jSONObject.optString("dsp_html"));
        wjvVar.jbs(jSONObject.optInt("image_stay", 0));
        int iOptInt2 = jSONObject.optInt("dsp_material_type", 0);
        if (iOptInt2 < 0 || iOptInt2 > 3) {
            iOptInt2 = 0;
        }
        if (iOptInt2 == 0) {
            if (jSONObject.optBoolean("is_vast", false)) {
                iOptInt2 = 1;
            }
            i2 = jSONObject.optBoolean("is_html", false) ? 2 : iOptInt2;
        }
        wjvVar.xm(i2);
        if (i2 == 1 || i2 == 3) {
            int iGo = wjvVar.go();
            if (iGo < 0) {
                if (wjvVar.eb() != null) {
                    iGo = wjvVar.eb().getDurationSlotType();
                } else {
                    iGo = wjvVar.lji();
                }
            }
            String strIk = com.bytedance.sdk.openadsdk.utils.ig.ik(iGo);
            if (jSONObject.has("vast_json")) {
                riVarRi = com.bytedance.sdk.openadsdk.core.aw.ri.ri(jSONObject.optJSONObject("vast_json"));
                str = "";
            } else {
                String strOptString3 = jSONObject.optString("dsp_vast");
                if (TextUtils.isEmpty(strOptString3)) {
                    ri(wjvVar, strIk);
                    return null;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Pair<com.bytedance.sdk.openadsdk.core.aw.ri, com.bytedance.sdk.openadsdk.core.aw.ri.lr.ri> pairRi = ri(strOptString3, wjvVar.bbu(), iGo);
                if (pairRi != null) {
                    riVar2 = (com.bytedance.sdk.openadsdk.core.aw.ri) pairRi.first;
                    str = "";
                    riVar3 = (com.bytedance.sdk.openadsdk.core.aw.ri.lr.ri) pairRi.second;
                } else {
                    str = "";
                    riVar2 = null;
                    riVar3 = null;
                }
                com.bytedance.sdk.openadsdk.core.aw.ik.ka.lr(wjvVar, strIk, riVar2, jElapsedRealtime, riVar3);
                riVarRi = riVar2;
            }
            if (riVarRi == null) {
                return null;
            }
            ri(riVarRi, wjvVar);
        } else {
            str = "";
        }
        wjvVar.ory(jSONObject.optString("deep_link_appname", str));
        wjvVar.whw(jSONObject.optInt("landing_page_download_clicktype", 1));
        JSONObject jSONObjectOptJSONObject26 = jSONObject.optJSONObject("dsp_style");
        if (jSONObjectOptJSONObject26 != null) {
            wjvVar.ri(new com.bytedance.sdk.openadsdk.core.model.vr(jSONObjectOptJSONObject26));
        }
        JSONObject jSONObjectOptJSONObject27 = jSONObject.optJSONObject("dsp_adchoices");
        if (jSONObjectOptJSONObject27 != null) {
            wjvVar.xha(jSONObjectOptJSONObject27.optString("adchoices_icon", str));
            wjvVar.mj(jSONObjectOptJSONObject27.optString("adchoices_url", str));
        }
        String strOptString4 = jSONObject.optString("gdid_encrypted");
        if (!TextUtils.isEmpty(strOptString4)) {
            wjvVar.jbs(strOptString4);
        }
        wjvVar.whw();
        JSONObject jSONObjectOptJSONObject28 = jSONObject.optJSONObject("ugen");
        if (jSONObjectOptJSONObject28 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject28.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) != null) {
            wjvVar.ri(lr(jSONObjectOptJSONObject));
            JSONObject jSONObjectOptJSONObject29 = jSONObjectOptJSONObject.optJSONObject("overlay");
            if (jSONObjectOptJSONObject29 != null) {
                wjvVar.lr(lr(jSONObjectOptJSONObject29));
            }
        }
        wjvVar.xha(jSONObject.optInt("preload_h5_type", 0));
        wjvVar.qt(jSONObject.optBoolean("hasReportShow", false));
        wjvVar.sf(jSONObject.optString("endcard_creative", str));
        wjvVar.xha(jSONObject.optJSONObject("ad_label"));
        JSONObject jSONObjectOptJSONObject30 = jSONObject.optJSONObject("ev");
        if (jSONObjectOptJSONObject30 != null) {
            wjvVar.nr(jSONObjectOptJSONObject30.optBoolean(a.j, com.bytedance.sdk.openadsdk.ay.ri.ik.ri));
            wjvVar.qh(jSONObjectOptJSONObject30.optInt("wait_time", com.bytedance.sdk.openadsdk.ay.ri.ik.lr));
            wjvVar.dzy(jSONObjectOptJSONObject30.optString("label", com.bytedance.sdk.openadsdk.ay.ri.ik.ik));
            wjvVar.ri(new com.bytedance.sdk.openadsdk.ay.ri.lr(wjvVar));
        }
        JSONArray jSONArrayOptJSONArray7 = jSONObject.optJSONArray("ad_tracks");
        if (jSONArrayOptJSONArray7 != null && jSONArrayOptJSONArray7.length() > 0) {
            com.bytedance.sdk.openadsdk.core.model.fi fiVar = new com.bytedance.sdk.openadsdk.core.model.fi(jSONArrayOptJSONArray7);
            if (fiVar.ik()) {
                wjvVar.ri(fiVar);
            }
        }
        JSONObject jSONObjectOptJSONObject31 = jSONObject.optJSONObject("popup");
        if (jSONObjectOptJSONObject31 != null) {
            wjvVar.ri(new com.bytedance.sdk.openadsdk.core.model.ay(jSONObjectOptJSONObject31));
        }
        JSONArray jSONArrayOptJSONArray8 = jSONObject.optJSONArray("app_log_url_backup");
        if (jSONArrayOptJSONArray8 != null && jSONArrayOptJSONArray8.length() > 0) {
            for (int i9 = 0; i9 < jSONArrayOptJSONArray8.length(); i9++) {
                String strOptString5 = jSONArrayOptJSONArray8.optString(i9);
                if (!TextUtils.isEmpty(strOptString5)) {
                    wjvVar.pv(strOptString5);
                }
            }
        }
        return wjvVar;
    }

    private static void ri(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("iv_skip_time", -1);
            int iOptInt2 = jSONObject.optInt("rv_skip_time", -1);
            if (iOptInt != -1) {
                wjvVar.gcp(iOptInt);
            }
            if (iOptInt2 != -1) {
                wjvVar.tw(iOptInt2);
            }
        }
    }

    private static void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            jSONObject.put("error_code", -1);
            com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, str, "load_vast_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    private static Pair<com.bytedance.sdk.openadsdk.core.aw.ri, com.bytedance.sdk.openadsdk.core.aw.ri.lr.ri> ri(String str, int i, int i2) {
        int iIk;
        int iFi;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i2 == 1 || i2 == 5) {
            iIk = 0;
            iFi = 0;
        } else {
            iIk = com.bytedance.sdk.openadsdk.utils.qd.ik(nr.ri());
            iFi = com.bytedance.sdk.openadsdk.utils.qd.fi(nr.ri());
            if (i == 2) {
                iFi = iIk;
                iIk = iFi;
            }
        }
        com.bytedance.sdk.openadsdk.core.aw.ri.ri.fi fiVar = new com.bytedance.sdk.openadsdk.core.aw.ri.ri.fi(nr.ri(), iIk, iFi);
        return new Pair<>(fiVar.ri(str, (File) null, new ArrayList()), fiVar.di);
    }

    private static void ri(com.bytedance.sdk.openadsdk.core.aw.ri riVar, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        riVar.ri(wjvVar);
        if (!ri(wjvVar.adz())) {
            wjvVar.ory(2);
        }
        wjvVar.vr(1);
        wjvVar.ri(riVar);
        if (!TextUtils.isEmpty(riVar.ka())) {
            wjvVar.ac(riVar.ka());
        }
        if (!TextUtils.isEmpty(riVar.fi())) {
            wjvVar.ihz(riVar.fi());
        }
        wjvVar.nr(riVar.di());
        wjvVar.ri((com.bytedance.sdk.openadsdk.core.model.di) null);
        attabal attabalVarEu = wjvVar.eu();
        if (attabalVarEu == null) {
            attabalVarEu = new attabal();
        }
        attabalVarEu.kowloon(riVar.xha());
        attabalVarEu.oilcan(riVar.mj());
        attabalVarEu.impromptu(null);
        attabalVarEu.gintrap(null);
        attabalVarEu.graveside(null);
        wjvVar.ri(attabalVarEu);
        if (riVar.lr() != null && !TextUtils.isEmpty(riVar.lr().ka())) {
            com.bytedance.sdk.openadsdk.core.model.nr nrVar = new com.bytedance.sdk.openadsdk.core.model.nr();
            nrVar.ri(riVar.lr().ka());
            nrVar.ri(riVar.lr().ri());
            nrVar.lr(riVar.lr().lr());
            wjvVar.ri(nrVar);
            return;
        }
        if (wjvVar.fb() == null) {
            com.bytedance.sdk.openadsdk.core.model.nr nrVar2 = new com.bytedance.sdk.openadsdk.core.model.nr();
            nrVar2.ri("https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/static/images/2023620white.jpeg");
            nrVar2.ri(98);
            nrVar2.lr(98);
            wjvVar.ri(nrVar2);
        }
    }

    public static AdSlot ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("mCodeId", "");
        int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 0);
        int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", 0);
        float fOptDouble = (float) jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
        float fOptDouble2 = (float) jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
        int iOptInt3 = jSONObject.optInt("mAdCount", 6);
        boolean zOptBoolean = jSONObject.optBoolean("mSupportDeepLink", true);
        String strOptString2 = jSONObject.optString("mRewardName", "");
        int iOptInt4 = jSONObject.optInt("mRewardAmount", 0);
        String strOptString3 = jSONObject.optString("mMediaExtra", "");
        String strOptString4 = jSONObject.optString("mUserID", "");
        jSONObject.optInt("mOrientation", 2);
        int iOptInt5 = jSONObject.optInt("mNativeAdType", 0);
        boolean zOptBoolean2 = jSONObject.optBoolean("mIsAutoPlay", false);
        boolean zOptBoolean3 = jSONObject.optBoolean("mIsExpressAd", false);
        String strOptString5 = jSONObject.optString("mBidAdm", "");
        return new AdSlot.Builder().setCodeId(strOptString).setImageAcceptedSize(iOptInt, iOptInt2).setExpressViewAcceptedSize(fOptDouble, fOptDouble2).setAdCount(iOptInt3).setSupportDeepLink(zOptBoolean).setRewardName(strOptString2).setRewardAmount(iOptInt4).setMediaExtra(strOptString3).setUserID(strOptString4).setNativeAdType(iOptInt5).setIsAutoPlay(zOptBoolean2).isExpressAd(zOptBoolean3).withBid(strOptString5).setDurationSlotType(jSONObject.optInt("mDurationSlotType", 0)).build();
    }

    private static attabal ri(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, boolean z) {
        int iOptInt;
        if (jSONObject == null) {
            return null;
        }
        attabal attabalVar = new attabal();
        attabalVar.dovishness(jSONObject.optInt("cover_height"));
        attabalVar.triweekly(jSONObject.optInt("cover_width"));
        attabalVar.kattegat(jSONObject.optString("resolution"));
        attabalVar.sealless(jSONObject.optLong("size"));
        double dOptDouble = jSONObject.optDouble("video_duration", 0.0d);
        attabalVar.oilcan(dOptDouble);
        int i = 1;
        int iOptInt2 = jSONObject.optInt("replay_time", 1);
        if (dOptDouble <= 15.0d && wjvVar.ajz() != 1 && com.bytedance.sdk.openadsdk.core.model.wjv.fi(wjvVar)) {
            i = iOptInt2;
        }
        attabalVar.stratoscope(i);
        attabalVar.gintrap(jSONObject.optString("cover_url"));
        attabalVar.kowloon(jSONObject.optString(CampaignEx.JSON_KEY_VIDEO_URL));
        attabalVar.graveside(jSONObject.optString(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD));
        attabalVar.apical(jSONObject.optString("playable_download_url"));
        attabalVar.impromptu(jSONObject.optString("file_hash"));
        attabalVar.preprohormone(jSONObject.optInt("if_playable_loading_show", 0));
        attabalVar.monoploid(jSONObject.optInt("remove_loading_page_type", 0));
        attabalVar.yemenite(jSONObject.optInt("fallback_endcard_judge", 0));
        attabalVar.cutely(jSONObject.optInt("video_preload_size", 307200));
        attabalVar.competently(jSONObject.optInt("reward_video_cached_type", 0));
        attabalVar.saran(jSONObject.optInt("execute_cached_type", 0));
        if (z) {
            iOptInt = jSONObject.optInt("endcard_render", 0);
        } else {
            iOptInt = jSONObject.optInt("endcard_render", -1);
        }
        attabalVar.molybdenite(iOptInt);
        return attabalVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    private static int ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        int iRi;
        int iRi2;
        if (wjvVar == null) {
            com.bytedance.sdk.openadsdk.ka.ik.ik((com.bytedance.sdk.openadsdk.core.model.wjv) null, "", 401);
            return 401;
        }
        String strIk = com.bytedance.sdk.openadsdk.utils.ig.ik(wjvVar.go());
        if (!TextUtils.isEmpty(wjvVar.tn()) && wjvVar.tn().length() > 1) {
            if (wjvVar.zyu()) {
                if (wjvVar.go() < 0) {
                    if (wjvVar.eb() != null) {
                        wjvVar.eb().getDurationSlotType();
                    } else {
                        wjvVar.lji();
                    }
                }
                if (wjvVar.vgs()) {
                    strIk = "fullscreen_interstitial_ad";
                }
                if (TextUtils.isEmpty(wjvVar.rko())) {
                    com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, strIk, "load_html_fail", (JSONObject) null);
                    return 401;
                }
                com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, strIk, "load_html_success", (JSONObject) null);
            }
            if (wjvVar.yv() == 0) {
                int iVz = wjvVar.vz();
                if (iVz == 2 || iVz == 3 || iVz == 4) {
                    iRi = ri(wjvVar.rbz());
                    if (iRi != 200) {
                        com.bytedance.sdk.openadsdk.ka.ik.ik(wjvVar, strIk, iRi);
                        return iRi;
                    }
                } else if (iVz == 5 || iVz == 15) {
                    iRi2 = ri(wjvVar.eu(), wjvVar.zz());
                    if (iRi2 != 200) {
                        com.bytedance.sdk.openadsdk.ka.ik.ik(wjvVar, strIk, iRi2);
                        return iRi2;
                    }
                } else if (iVz == 16) {
                    iRi = ri(wjvVar.rbz());
                    if (iRi != 200) {
                        com.bytedance.sdk.openadsdk.ka.ik.ik(wjvVar, strIk, iRi);
                        return iRi;
                    }
                } else if (iVz == 50) {
                    iRi2 = ri(wjvVar.eu(), wjvVar.zz());
                    if (iRi2 != 200) {
                        com.bytedance.sdk.openadsdk.ka.ik.ik(wjvVar, strIk, iRi2);
                        return iRi2;
                    }
                }
            }
            if (com.bytedance.sdk.openadsdk.core.settings.sf.lr().wjv()) {
                return ik(wjvVar);
            }
            return lr(wjvVar);
        }
        com.bytedance.sdk.openadsdk.ka.ik.ik(wjvVar, strIk, TTAdConstant.AD_ID_IS_NULL_CODE);
        return TTAdConstant.AD_ID_IS_NULL_CODE;
    }

    private static int ri(com.bytedance.sdk.openadsdk.core.model.aw awVar) {
        if (awVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(awVar.ri())) {
            return 403;
        }
        if (TextUtils.isEmpty(awVar.lr())) {
            return 404;
        }
        return (awVar.ik() == 1 || awVar.ik() == 2) ? 200 : 405;
    }

    private static int ri(attabal attabalVar, boolean z) {
        if (attabalVar == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(attabalVar.supplicat())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z || !TextUtils.isEmpty(attabalVar.cuirassed())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    private static int ri(com.bytedance.sdk.openadsdk.core.model.di diVar) {
        if (diVar == null) {
            return 407;
        }
        if (TextUtils.isEmpty(diVar.ri())) {
            return 408;
        }
        if (TextUtils.isEmpty(diVar.ik())) {
            return TTAdConstant.PACKAGE_NAME_CODE;
        }
        return 200;
    }

    private static int ri(List<com.bytedance.sdk.openadsdk.core.model.nr> list) {
        if (list == null) {
            return 409;
        }
        if (list.size() <= 0) {
            return 410;
        }
        for (com.bytedance.sdk.openadsdk.core.model.nr nrVar : list) {
            if (nrVar == null) {
                return 411;
            }
            if (TextUtils.isEmpty(nrVar.ri())) {
                return TTAdConstant.IMAGE_URL_CODE;
            }
        }
        return 200;
    }

    private static void ri(final ArrayList<ri> arrayList) {
        com.bytedance.sdk.openadsdk.slm.ka.ri("multiple_ads_parsing_error", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.core.lr.1
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_error", arrayList.size());
                JSONArray jSONArray = new JSONArray();
                for (ri riVar : arrayList) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(BidResponsedEx.KEY_CID, riVar.ri);
                    jSONObject2.put("error_msg", riVar.lr);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("error_cid_list", jSONArray);
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("multiple_ads_parsing_error").lr(jSONObject.toString());
            }
        });
    }
}
