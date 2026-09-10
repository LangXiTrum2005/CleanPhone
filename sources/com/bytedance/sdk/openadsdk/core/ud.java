package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.p004ironsource.x4;
import com.smartdigimkt.m6.a;
import com.smartdigimkt.w5.g;
import com.smartdigimkt.x.d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud {

    public static class qdl {
        public String qdl;
        public int ud;

        public qdl(String str, int i2) {
            this.qdl = str;
            this.ud = i2;
        }
    }

    private static Map<String, Object> fs(JSONObject jSONObject) {
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

    private static com.bytedance.sdk.openadsdk.core.model.exc jpc(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.exc excVar = new com.bytedance.sdk.openadsdk.core.model.exc();
        if (jSONObject == null) {
            excVar.mml(5);
            excVar.mzz(30);
            excVar.mo(70);
            excVar.wd(1);
            excVar.jpc(com.bytedance.sdk.openadsdk.core.model.exc.qdl);
            excVar.lnr(0);
            excVar.ud(0);
            excVar.qdl(3);
            return excVar;
        }
        excVar.mml(jSONObject.optInt("ceiling_time", 5));
        excVar.mzz(jSONObject.optInt("ceiling_ratio", 30));
        excVar.mo(jSONObject.optInt("expand_ratio", 70));
        excVar.wd(jSONObject.optInt("back_type", 1));
        excVar.jpc(jSONObject.optInt("boc_return_type", com.bytedance.sdk.openadsdk.core.model.exc.qdl));
        excVar.lnr(jSONObject.optInt("pre_render_status", 0));
        excVar.ud(jSONObject.optInt("pre_render_use_gecko", 0));
        excVar.qdl(jSONObject.optInt("pre_render_add_type", 3));
        return excVar;
    }

    private static com.bytedance.sdk.openadsdk.core.rq.jpc.qdl lnr(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.rq.jpc.qdl qdlVar = new com.bytedance.sdk.openadsdk.core.rq.jpc.qdl();
        qdlVar.qdl(jSONObject.optString("id"));
        qdlVar.ud(jSONObject.optString("md5"));
        qdlVar.lnr(jSONObject.optString("url"));
        return qdlVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.wd mml(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("splash_clickarea", 2);
        int iOptInt2 = jSONObject.optInt("splash_layout_id", 1);
        long jOptLong = jSONObject.optLong("load_wait_time", 0L);
        long j = jOptLong >= 0 ? jOptLong : 0L;
        int iOptInt3 = jSONObject.optInt("skip_time", -1);
        com.bytedance.sdk.openadsdk.core.model.wd wdVar = new com.bytedance.sdk.openadsdk.core.model.wd();
        wdVar.ud(iOptInt);
        wdVar.lnr(iOptInt2);
        wdVar.qdl(j);
        wdVar.qdl(iOptInt3);
        return wdVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.mo mo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.mo moVar = new com.bytedance.sdk.openadsdk.core.model.mo();
        moVar.ud(jSONObject.optString("app_name"));
        moVar.lnr(jSONObject.optString("package_name"));
        moVar.qdl(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
        moVar.qdl(jSONObject.optDouble("score", -1.0d));
        moVar.qdl(jSONObject.optInt("comment_num", -1));
        moVar.ud(jSONObject.optInt("app_size", 0));
        moVar.mml(jSONObject.optString("app_category"));
        return moVar;
    }

    private static FilterWord mzz(JSONObject jSONObject) {
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
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    FilterWord filterWordMzz = mzz(jSONArrayOptJSONArray.optJSONObject(i2));
                    if (filterWordMzz != null && filterWordMzz.isValid()) {
                        filterWord.addOption(filterWordMzz);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean qdl(int i2) {
        return i2 == 2 || i2 == 3 || i2 == 8;
    }

    private static com.bytedance.sdk.openadsdk.core.model.exu rq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.exu exuVar = new com.bytedance.sdk.openadsdk.core.model.exu();
        exuVar.qdl(jSONObject.optString("deeplink_url"));
        exuVar.ud(jSONObject.optString("fallback_url"));
        exuVar.qdl(jSONObject.optInt("fallback_type"));
        return exuVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.rdp to(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.rdp rdpVar = new com.bytedance.sdk.openadsdk.core.model.rdp();
        rdpVar.qdl(jSONObject.optInt("if_send_click", 0));
        return rdpVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.jpc tvp(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.model.jpc();
        if (jSONObject == null) {
            jpcVar.lnr(0);
            jpcVar.mml(0);
            jpcVar.ud(new ArrayList());
            jpcVar.mzz(0);
            jpcVar.qdl(new ArrayList());
            jpcVar.ud(0);
            jpcVar.qdl(0);
            return jpcVar;
        }
        jpcVar.lnr(jSONObject.optInt("interceptor_x", 0));
        jpcVar.mml(jSONObject.optInt("interceptor_y", 0));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("interceptor_page");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i2)));
            }
        }
        jpcVar.ud(arrayList);
        jpcVar.mzz(jSONObject.optInt("interceptor_interval_time", 0));
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("url_regular");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                arrayList2.add(jSONArrayOptJSONArray2.optString(i3));
            }
        }
        jpcVar.qdl(arrayList2);
        jpcVar.ud(jSONObject.optInt("boc_index", 0));
        jpcVar.qdl(jSONObject.optInt("is_act", 0));
        return jpcVar;
    }

    public static AdSlot ud(JSONObject jSONObject) {
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

    private static com.bytedance.sdk.openadsdk.core.model.jyq wd(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.jyq jyqVar = new com.bytedance.sdk.openadsdk.core.model.jyq();
        if (jSONObject == null) {
            jyqVar.qdl(10L);
            jyqVar.ud(20L);
            jyqVar.lnr(10L);
            jyqVar.mml(20L);
            jyqVar.qdl("");
            return jyqVar;
        }
        jyqVar.qdl(jSONObject.optLong("onlylp_loading_maxtime", 10L));
        jyqVar.ud(jSONObject.optLong("straight_lp_showtime", 20L));
        jyqVar.lnr(jSONObject.optLong("onlyagg_loading_maxtime", 10L));
        jyqVar.mml(jSONObject.optLong("straight_agg_showtime", 20L));
        jyqVar.qdl(jSONObject.optString("loading_text", ""));
        return jyqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [android.util.Pair<com.bytedance.sdk.openadsdk.core.model.qdl, java.util.ArrayList<java.lang.Integer>>] */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static Pair<com.bytedance.sdk.openadsdk.core.model.qdl, ArrayList<Integer>> qdl(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.bqt bqtVar) {
        ?? r17;
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar;
        ?? r9;
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar2;
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar3 = null;
        ljhVar3 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.qdl qdlVar = new com.bytedance.sdk.openadsdk.core.model.qdl();
            qdlVar.qdl(jSONObject.optString("request_id"));
            qdlVar.qdl(jSONObject.optInt("ret"));
            qdlVar.ud(jSONObject.optInt("multi_ad_style", 0));
            qdlVar.ud(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            String strOptString = jSONObject.optString("gdid_encrypted");
            qdlVar.qdl(com.bytedance.sdk.openadsdk.core.model.oth.qdl(jSONObject.optJSONObject("loop_config")));
            String strOptString2 = jSONObject.optString("auction_price");
            if (qdlVar.lnr() != 0) {
                return null;
            }
            qdlVar.qdl(com.bytedance.sdk.openadsdk.core.model.uw.qdl(jSONObject.optString("multi_ad_config")));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                jSONArrayOptJSONArray.length();
                int i2 = 0;
                ?? arrayList2 = qdlVar.to() ? new ArrayList() : null;
                while (i2 < jSONArrayOptJSONArray.length()) {
                    com.bytedance.sdk.openadsdk.core.model.ljh ljhVarQdl = qdl(jSONArrayOptJSONArray.optJSONObject(i2), adSlot, bqtVar, qdlVar, i2);
                    if (!qdlVar.to()) {
                        r9 = arrayList2;
                        r9 = ljhVar3;
                    }
                    r9 = arrayList2;
                    int iQdl = qdl(ljhVarQdl);
                    if (iQdl != 200) {
                        if (ljhVarQdl != null) {
                            com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVarQdl, com.bytedance.sdk.openadsdk.utils.gy.lnr(ljhVarQdl.ok()), iQdl);
                        } else {
                            com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar3, "", iQdl);
                        }
                        arrayList.add(Integer.valueOf(iQdl));
                        if (r9 == 0 || ljhVarQdl == null) {
                            ljhVar2 = ljhVar3;
                        } else {
                            ljhVar = ljhVar3;
                            try {
                                r9.add(new qdl(ljhVarQdl.wc(), iQdl));
                                ljhVar2 = ljhVar;
                            } catch (Throwable th) {
                                th = th;
                                r17 = ljhVar;
                            }
                        }
                        if (ljhVarQdl != null && (ljhVarQdl.taz() == 39 || ljhVarQdl.taz() == 41)) {
                            qdlVar.ud(0);
                        }
                        jSONArrayOptJSONArray.remove(i2);
                        i2--;
                    } else {
                        ljhVar2 = ljhVar3;
                        ljhVarQdl.rdp(strOptString2);
                        if (!TextUtils.isEmpty(strOptString)) {
                            ljhVarQdl.tvp(strOptString);
                        }
                        qdlVar.qdl(ljhVarQdl);
                    }
                    i2++;
                    ljhVar3 = ljhVar2;
                    arrayList2 = r9;
                }
                ljhVar = ljhVar3;
                List<com.bytedance.sdk.openadsdk.core.model.ljh> listMml = qdlVar.mml();
                qdl(listMml, qdlVar);
                if (listMml != null) {
                    if (qdlVar.to() && listMml.size() == 1) {
                        qdlVar.ud(0);
                        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar4 = listMml.get(0);
                        if (ljhVar4 != null) {
                            ljhVar4.jpc(false);
                        }
                    }
                    int size = listMml.size();
                    jSONObject.put("creatives", jSONArrayOptJSONArray);
                    for (int i3 = 0; i3 < size; i3++) {
                        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar5 = listMml.get(i3);
                        if (ljhVar5 != null) {
                            if (i3 > 0) {
                                ljhVar5.wxg();
                            }
                            ljhVar5.hkc(jSONObject.toString());
                        }
                    }
                }
                if (arrayList2 != 0 && !arrayList2.isEmpty()) {
                    qdl((ArrayList<qdl>) arrayList2);
                }
            } else {
                ljhVar = null;
            }
            return new Pair<>(qdlVar, arrayList);
        } catch (Throwable th2) {
            th = th2;
            r17 = ljhVar3;
        }
        com.bytedance.sdk.component.utils.aaj.lnr("TTAD.AdInfoFactory", th.getMessage());
        return r17;
    }

    private static int lnr(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        int iQdl;
        String strLnr = com.bytedance.sdk.openadsdk.utils.gy.lnr(ljhVar.ok());
        if (ljhVar.ikv() == 0) {
            iQdl = qdl(ljhVar.bo());
            if (iQdl != 200) {
                com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, strLnr, iQdl);
                return iQdl;
            }
        } else {
            iQdl = 200;
        }
        int iYgv = ljhVar.ygv();
        if (iYgv != 2 && iYgv != 3) {
            if (iYgv == 4) {
                int iQdl2 = qdl(ljhVar.fhs());
                if (iQdl2 != 200) {
                    com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, strLnr, iQdl2);
                }
                return iQdl2;
            }
            if (iYgv != 8) {
                return iQdl;
            }
        }
        if (!mml(ljhVar) || !TextUtils.isEmpty(ljhVar.od())) {
            return iQdl;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, strLnr, 406);
        return 406;
    }

    private static boolean mml(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        return (ljhVar.uj() || ljhVar.vxm()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    private static int ud(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        int iQdl;
        String strLnr = com.bytedance.sdk.openadsdk.utils.gy.lnr(ljhVar.ok());
        if (ljhVar.ikv() == 0) {
            iQdl = qdl(ljhVar.bo());
            com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, strLnr, iQdl);
        } else {
            iQdl = 200;
        }
        int iYgv = ljhVar.ygv();
        if (iYgv == 2 || iYgv == 3) {
            if (mml(ljhVar) && TextUtils.isEmpty(ljhVar.od())) {
                com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, strLnr, 406);
                iQdl = 406;
            }
        } else if (iYgv == 4) {
            com.bytedance.sdk.openadsdk.core.model.mo moVarFhs = ljhVar.fhs();
            if (moVarFhs == null) {
                com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, strLnr, 407);
                iQdl = 407;
            } else if (TextUtils.isEmpty(moVarFhs.lnr()) && TextUtils.isEmpty(moVarFhs.qdl())) {
                com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, strLnr, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME);
                iQdl = 417;
            } else if (TextUtils.isEmpty(moVarFhs.lnr())) {
                iQdl = TTAdConstant.PACKAGE_NAME_CODE;
                com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, strLnr, TTAdConstant.PACKAGE_NAME_CODE);
            } else if (TextUtils.isEmpty(moVarFhs.qdl())) {
                iQdl = 408;
                com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, strLnr, 408);
            }
        } else if (iYgv == 8) {
            if (mml(ljhVar)) {
                com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, strLnr, 406);
                iQdl = 406;
            }
        }
        if (iQdl == 417 || iQdl == 407 || iQdl == 406) {
            return iQdl;
        }
        if (iQdl != 200) {
            com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, strLnr, iQdl);
        }
        return 200;
    }

    private static void qdl(List<com.bytedance.sdk.openadsdk.core.model.ljh> list, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = list.get(0);
        if (!qdlVar.to() || ljhVar == null || !ljhVar.qur() || com.bytedance.sdk.openadsdk.utils.gy.rc() == 0) {
            return;
        }
        qdlVar.ud(0);
        ljhVar.jpc(false);
    }

    public static com.bytedance.sdk.openadsdk.core.model.ljh qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return qdl(jSONObject, null, null, null, 0);
    }

    /* JADX WARN: Code duplicated, block: B:176:0x06a5 A[PHI: r0
  0x06a5: PHI (r0v86 int) = (r0v85 int), (r0v136 int) binds: [B:169:0x0691, B:174:0x06a2] A[DONT_GENERATE, DONT_INLINE]] */
    public static com.bytedance.sdk.openadsdk.core.model.ljh qdl(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.bqt bqtVar, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, int i2) {
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarQdl;
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarQdl2;
        int i3;
        String str;
        com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar2;
        com.bytedance.sdk.openadsdk.core.fs.qdl.ud.qdl qdlVar3;
        com.bytedance.sdk.openadsdk.core.fs.qdl qdlVarQdl;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = new com.bytedance.sdk.openadsdk.core.model.ljh();
        if (qdlVar != null) {
            ljhVar.qdl(qdlVar);
            if (qdlVar.to()) {
                int iOptInt = jSONObject.optInt("interaction_method");
                if (iOptInt != 30 && iOptInt != 39 && iOptInt != 40 && iOptInt != 41 && iOptInt != 43 && iOptInt != 44) {
                    qdlVar.ud(0);
                    ljhVar.jpc(false);
                } else {
                    ljhVar.jpc(true);
                }
            }
        }
        ljhVar.qdl(i2);
        qdl(jSONObject, ljhVar);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("multi_ad_scene");
        if (jSONObjectOptJSONObject4 != null) {
            ljhVar.qdl(com.bytedance.sdk.openadsdk.core.model.xmv.qdl(jSONObjectOptJSONObject4));
        }
        if (jSONObject.has("raw_response_info")) {
            ljhVar.hkc(jSONObject.optString("raw_response_info"));
        }
        ljhVar.to(jSONObject.optInt("proportion_watching", -1));
        ljhVar.rdp(jSONObject.optBoolean("mate_disable_cache", false));
        ljhVar.xmv(jSONObject.optInt("interaction_type"));
        ljhVar.uw(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.ljh.lnr, 0));
        ljhVar.bqt(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.ljh.ud, 0));
        ljhVar.koa(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.ljh.mml, 0));
        ljhVar.jl(jSONObject.optString("target_url"));
        ljhVar.ljh(jSONObject.optString("ad_id"));
        ljhVar.bch(jSONObject.optString("app_log_url"));
        ljhVar.uw(jSONObject.optString("settings_url"));
        ljhVar.jtx(jSONObject.optString("source"));
        ljhVar.yt(jSONObject.optString("app_name"));
        ljhVar.ekw(jSONObject.optInt("dislike_control", 0));
        ljhVar.aaj(jSONObject.optInt("play_bar_show_time", AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES));
        ljhVar.bqt(jSONObject.optString("gecko_id"));
        if (jSONObject.has("set_click_type")) {
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("set_click_type");
            ljhVar.ud(jSONObjectOptJSONObject5.optDouble("cta", 2.0d));
            ljhVar.qdl(jSONObjectOptJSONObject5.optDouble(x4.DEFAULT_AUCTION_FALLBACK_VALUE, 1.0d));
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("extension");
        ljhVar.mo(jSONObjectOptJSONObject6);
        if (jSONObjectOptJSONObject6 != null) {
            ljhVar.qdl(new com.bytedance.sdk.openadsdk.core.model.yt(jSONObjectOptJSONObject6));
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("icon");
        ljhVar.tvp(jSONObject.optBoolean("screenshot", false));
        ljhVar.jl(jSONObject.optInt("play_bar_style", 0));
        ljhVar.koa(jSONObject.optString("market_url", ""));
        ljhVar.jtx(jSONObject.optInt("video_adaptation", 0));
        ljhVar.exu(jSONObject.optInt("feed_video_opentype", 0));
        ljhVar.lnr(jSONObject.optJSONObject("session_params"));
        JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("dynamic_configs");
        ljhVar.mml(jSONObjectOptJSONObject8);
        if (jSONObjectOptJSONObject8 != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject8.optJSONObject("speed_config")) != null) {
            com.bytedance.sdk.openadsdk.core.model.rc rcVar = new com.bytedance.sdk.openadsdk.core.model.rc();
            rcVar.qdl((float) jSONObjectOptJSONObject3.optDouble("speed", 1.0d));
            rcVar.qdl(jSONObjectOptJSONObject3.optInt("type", 0));
            ljhVar.qdl(rcVar);
        }
        ljhVar.rdp(jSONObject.optString("auction_price", ""));
        ljhVar.ax(jSONObject.optInt("mrc_report", 0));
        if (jSONObject.optBoolean("isMrcReportFinish", false)) {
            ljhVar.cuk();
        }
        JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject("render");
        if (jSONObjectOptJSONObject9 != null) {
            ljhVar.rdp(jSONObjectOptJSONObject9.optInt("render_sequence", 0));
            ljhVar.bjy(jSONObjectOptJSONObject9.optInt("backup_render_control", 1));
            ljhVar.ag(jSONObjectOptJSONObject9.optInt("reserve_time", 100));
            ljhVar.wc(jSONObjectOptJSONObject9.optInt("render_thread", 0));
        }
        ljhVar.rq(jSONObject.optInt("render_control", bqtVar != null ? bqtVar.tvp : 1));
        if (jSONObjectOptJSONObject7 != null) {
            com.bytedance.sdk.openadsdk.core.model.jl jlVar = new com.bytedance.sdk.openadsdk.core.model.jl();
            jlVar.qdl(jSONObjectOptJSONObject7.optString("url"));
            jlVar.ud(jSONObjectOptJSONObject7.optInt("height"));
            jlVar.qdl(jSONObjectOptJSONObject7.optInt("width"));
            ljhVar.qdl(jlVar);
        }
        JSONObject jSONObjectOptJSONObject10 = jSONObject.optJSONObject("reward_data");
        if (jSONObjectOptJSONObject10 != null) {
            ljhVar.tvp(jSONObjectOptJSONObject10.optInt("reward_amount", 0));
            ljhVar.fs(jSONObjectOptJSONObject10.optString("reward_name", ""));
        }
        JSONObject jSONObjectOptJSONObject11 = jSONObject.optJSONObject("cover_image");
        if (jSONObjectOptJSONObject11 != null) {
            com.bytedance.sdk.openadsdk.core.model.jl jlVar2 = new com.bytedance.sdk.openadsdk.core.model.jl();
            jlVar2.qdl(jSONObjectOptJSONObject11.optString("url"));
            jlVar2.ud(jSONObjectOptJSONObject11.optInt("height"));
            jlVar2.qdl(jSONObjectOptJSONObject11.optInt("width"));
            ljhVar.ud(jlVar2);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(d.c.k);
        if (jSONArrayOptJSONArray != null) {
            for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                com.bytedance.sdk.openadsdk.core.model.jl jlVar3 = new com.bytedance.sdk.openadsdk.core.model.jl();
                JSONObject jSONObjectOptJSONObject12 = jSONArrayOptJSONArray.optJSONObject(i4);
                jlVar3.qdl(jSONObjectOptJSONObject12.optString("url"));
                jlVar3.ud(jSONObjectOptJSONObject12.optInt("height"));
                jlVar3.qdl(jSONObjectOptJSONObject12.optInt("width"));
                jlVar3.qdl(jSONObjectOptJSONObject12.optBoolean("image_preview"));
                jlVar3.ud(jSONObjectOptJSONObject12.optString("image_key"));
                ljhVar.lnr(jlVar3);
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("show_url");
        if (jSONArrayOptJSONArray2 != null) {
            for (int i5 = 0; i5 < jSONArrayOptJSONArray2.length(); i5++) {
                ljhVar.eta().add(jSONArrayOptJSONArray2.optString(i5));
            }
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("click_url");
        if (jSONArrayOptJSONArray3 != null) {
            for (int i6 = 0; i6 < jSONArrayOptJSONArray3.length(); i6++) {
                ljhVar.vr().add(jSONArrayOptJSONArray3.optString(i6));
            }
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray(a.r.f);
        if (jSONArrayOptJSONArray4 != null) {
            for (int i7 = 0; i7 < jSONArrayOptJSONArray4.length(); i7++) {
                ljhVar.auu().add(jSONArrayOptJSONArray4.optString(i7));
            }
        }
        JSONObject jSONObjectOptJSONObject13 = jSONObject.optJSONObject(g.a.g);
        if (jSONObjectOptJSONObject13 != null) {
            com.bytedance.sdk.openadsdk.core.model.rq rqVar = new com.bytedance.sdk.openadsdk.core.model.rq();
            rqVar.qdl = jSONObjectOptJSONObject13.optBoolean("click_upper_content_area", true);
            rqVar.ud = jSONObjectOptJSONObject13.optBoolean("click_upper_non_content_area", true);
            rqVar.lnr = jSONObjectOptJSONObject13.optBoolean("click_lower_content_area", true);
            rqVar.mml = jSONObjectOptJSONObject13.optBoolean("click_lower_non_content_area", true);
            rqVar.mzz = jSONObjectOptJSONObject13.optBoolean("click_button_area", true);
            rqVar.mo = jSONObjectOptJSONObject13.optBoolean("click_video_area", true);
            ljhVar.qdl(rqVar);
        }
        JSONObject jSONObjectOptJSONObject14 = jSONObject.optJSONObject("adslot");
        if (jSONObjectOptJSONObject14 != null) {
            ljhVar.qdl(ud(jSONObjectOptJSONObject14));
        } else {
            ljhVar.qdl(adSlot);
        }
        if (adSlot != null) {
            Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
            if (requestExtraMap != null && requestExtraMap.containsKey("admob_watermark")) {
                ljhVar.to(String.valueOf(requestExtraMap.get("admob_watermark")));
            }
        } else {
            ljhVar.to(jSONObject.optString("identificationOverlayContent"));
        }
        ljhVar.exc(jSONObject.optInt("intercept_flag", 0));
        ljhVar.exc(jSONObject.optString("phone_num"));
        ljhVar.aaj(jSONObject.optString("title"));
        ljhVar.jyq(jSONObject.optString("description"));
        ljhVar.oth(jSONObject.optString("button_text"));
        ljhVar.yt(jSONObject.optInt("ad_logo", 1));
        ljhVar.xmv(jSONObject.optString("ext"));
        ljhVar.ljh(jSONObject.optInt("cover_click_area", 0));
        ljhVar.vu(jSONObject.optInt("image_mode"));
        ljhVar.kdv(jSONObject.optInt("orientation", 1));
        ljhVar.qdl((float) jSONObject.optDouble("aspect_ratio", 100.0d));
        ljhVar.ljh(jSONObject.optInt("cover_click_area", 0));
        JSONObject jSONObjectOptJSONObject15 = jSONObject.optJSONObject("app");
        JSONObject jSONObjectOptJSONObject16 = jSONObject.optJSONObject("deep_link");
        JSONObject jSONObjectOptJSONObject17 = jSONObject.optJSONObject("oem");
        ljhVar.lnr(jSONObject.optInt("is_web_jump_ip", 0));
        ljhVar.qdl(com.bytedance.sdk.openadsdk.core.model.koa.qdl(jSONObjectOptJSONObject17));
        ljhVar.qdl(mo(jSONObjectOptJSONObject15));
        JSONObject jSONObjectOptJSONObject18 = jSONObject.optJSONObject("interaction_method_params");
        ljhVar.qdl(tvp(jSONObject.optJSONObject("arbitrage_interceptor_params")));
        ljhVar.qdl(wd(jSONObjectOptJSONObject18));
        ljhVar.qdl(jpc(jSONObjectOptJSONObject18));
        ljhVar.qdl(rq(jSONObjectOptJSONObject16));
        ljhVar.qdl(new com.bytedance.sdk.openadsdk.core.model.vu(jSONObject));
        JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("filter_words");
        if (jSONArrayOptJSONArray5 != null) {
            for (int i8 = 0; i8 < jSONArrayOptJSONArray5.length(); i8++) {
                FilterWord filterWordMzz = mzz(jSONArrayOptJSONArray5.optJSONObject(i8));
                if (filterWordMzz != null && filterWordMzz.isValid()) {
                    ljhVar.qdl(filterWordMzz);
                }
            }
        }
        ljhVar.rc(jSONObject.optInt("count_down"));
        ljhVar.ud(jSONObject.optLong("expiration_time"));
        ljhVar.yh(jSONObject.optInt("video_encode_type", 0));
        ljhVar.cx(0);
        JSONObject jSONObjectOptJSONObject19 = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject19 != null) {
            udVarQdl = qdl(jSONObjectOptJSONObject19, ljhVar, true);
            ljhVar.ud(udVarQdl);
            ljhVar.mzz(jSONObjectOptJSONObject19.optInt("multi_played_percent", 50));
        } else {
            udVarQdl = null;
        }
        JSONObject jSONObjectOptJSONObject20 = jSONObject.optJSONObject("h265_video");
        if (jSONObjectOptJSONObject20 != null) {
            udVarQdl2 = qdl(jSONObjectOptJSONObject20, ljhVar, false);
            ljhVar.lnr(udVarQdl2);
        } else {
            udVarQdl2 = null;
        }
        if (Build.VERSION.SDK_INT < 26 || ljhVar.ddg() == 0) {
            ljhVar.qdl(udVarQdl);
            ljhVar.yh(0);
        } else {
            if (udVarQdl2 != null && udVarQdl != null) {
                if (TextUtils.isEmpty(udVarQdl2.fs())) {
                    udVarQdl2.mml(udVarQdl.fs());
                }
                if (TextUtils.isEmpty(udVarQdl2.exu())) {
                    udVarQdl2.mzz(udVarQdl.exu());
                }
                if (udVarQdl2.mml() == -1) {
                    udVarQdl2.mml(udVarQdl.mml());
                }
            }
            if (udVarQdl2 != null) {
                ljhVar.qdl(udVarQdl2);
            } else {
                ljhVar.qdl(udVarQdl);
            }
        }
        JSONObject jSONObjectOptJSONObject21 = jSONObject.optJSONObject("download_conf");
        if (jSONObjectOptJSONObject21 != null) {
            ljhVar.qdl(to(jSONObjectOptJSONObject21));
        }
        ljhVar.qdl(fs(jSONObject.optJSONObject("media_ext")));
        JSONObject jSONObjectOptJSONObject22 = jSONObject.optJSONObject("tpl_info");
        if (jSONObjectOptJSONObject22 != null) {
            com.bytedance.sdk.openadsdk.core.model.ljh.qdl qdlVar4 = new com.bytedance.sdk.openadsdk.core.model.ljh.qdl();
            qdlVar4.lnr(jSONObjectOptJSONObject22.optString("id"));
            qdlVar4.mml(jSONObjectOptJSONObject22.optString("md5"));
            qdlVar4.mzz(jSONObjectOptJSONObject22.optString("url"));
            qdlVar4.mo(jSONObjectOptJSONObject22.optString("data"));
            qdlVar4.wd(jSONObjectOptJSONObject22.optString("diff_data"));
            String strOptString = jSONObjectOptJSONObject22.optString("dynamic_creative");
            qdlVar4.jpc(strOptString);
            qdlVar4.ud(jSONObjectOptJSONObject22.optString("version"));
            qdlVar4.tvp(jSONObjectOptJSONObject22.optString("media_view"));
            try {
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObject2 = new JSONObject(strOptString);
                JSONArray jSONArrayOptJSONArray6 = jSONObject2.optJSONArray("tag_ids");
                if (jSONArrayOptJSONArray6 != null) {
                    for (int i9 = 0; i9 < jSONArrayOptJSONArray6.length(); i9++) {
                        arrayList.add(Integer.valueOf(jSONArrayOptJSONArray6.optInt(i9)));
                    }
                }
                String strOptString2 = jSONObject2.optString("music_url");
                qdlVar4.qdl(arrayList);
                qdlVar4.qdl(strOptString2);
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.aaj.lnr("TTAD.AdInfoFactory", e2.getMessage());
            }
            qdlVar4.to(jSONObjectOptJSONObject22.optString("engine_version"));
            qdlVar4.rq(jSONObjectOptJSONObject22.optString("ugen_url"));
            qdlVar4.fs(jSONObjectOptJSONObject22.optString("ugen_md5"));
            qdlVar4.exu(jSONObjectOptJSONObject22.optString("ugen_data"));
            ljhVar.qdl(qdlVar4);
        }
        JSONObject jSONObjectOptJSONObject23 = jSONObject.optJSONObject("tpl_info_v3");
        if (jSONObjectOptJSONObject23 != null) {
            ljhVar.qdl(com.bytedance.sdk.openadsdk.core.model.ekw.qdl(jSONObjectOptJSONObject23));
        }
        JSONObject jSONObjectOptJSONObject24 = jSONObject.optJSONObject("dynamic_creative");
        if (jSONObjectOptJSONObject24 != null) {
            ljhVar.ud(jSONObjectOptJSONObject24);
        }
        ljhVar.bjy(jSONObject.optString("creative_extra"));
        ljhVar.fs(jSONObject.optInt("if_block_lp", 0));
        ljhVar.jyq(jSONObject.optInt("cache_sort", 1));
        ljhVar.oth(jSONObject.optInt("if_sp_cache", 0));
        JSONObject jSONObjectOptJSONObject25 = jSONObject.optJSONObject("splash_control");
        if (jSONObjectOptJSONObject25 != null) {
            ljhVar.qdl(mml(jSONObjectOptJSONObject25));
        }
        ljhVar.hkc(jSONObject.optInt("is_package_open", 1));
        ljhVar.exu(jSONObject.optString("ad_info", null));
        ljhVar.bch(jSONObject.optInt("ua_policy", 2));
        ljhVar.hzv(jSONObject.optInt("playable_duration_time", 30));
        ljhVar.fco(jSONObject.optInt("playable_close_time", -1));
        ljhVar.mrf(jSONObject.optInt("playable_endcard_close_time", -1));
        ljhVar.gy(jSONObject.optInt("endcard_close_time", -1));
        ljhVar.wd(jSONObject.optInt("interaction_method"));
        ljhVar.irn(jSONObject.optInt("lp_click_type", -1));
        ljhVar.mml(jSONObject.optInt("lp_click_interval", -1));
        ljhVar.vu(jSONObject.optString("dsp_html"));
        ljhVar.mo(jSONObject.optInt("image_stay", 0));
        int iOptInt2 = jSONObject.optInt("dsp_material_type", 0);
        if (iOptInt2 < 0 || iOptInt2 > 3) {
            iOptInt2 = 0;
        }
        if (iOptInt2 == 0) {
            if (jSONObject.optBoolean("is_vast", false)) {
                iOptInt2 = 1;
            }
            i3 = jSONObject.optBoolean("is_html", false) ? 2 : iOptInt2;
        }
        ljhVar.gt(i3);
        if (i3 == 1 || i3 == 3) {
            int iOk = ljhVar.ok();
            if (iOk < 0) {
                if (ljhVar.ji() != null) {
                    iOk = ljhVar.ji().getDurationSlotType();
                } else {
                    iOk = ljhVar.vz();
                }
            }
            String strLnr = com.bytedance.sdk.openadsdk.utils.gy.lnr(iOk);
            if (jSONObject.has("vast_json")) {
                qdlVarQdl = com.bytedance.sdk.openadsdk.core.fs.qdl.qdl(jSONObject.optJSONObject("vast_json"));
                str = "";
            } else {
                String strOptString3 = jSONObject.optString("dsp_vast");
                if (TextUtils.isEmpty(strOptString3)) {
                    qdl(ljhVar, strLnr);
                    return null;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Pair<com.bytedance.sdk.openadsdk.core.fs.qdl, com.bytedance.sdk.openadsdk.core.fs.qdl.ud.qdl> pairQdl = qdl(strOptString3, ljhVar.jb(), iOk);
                if (pairQdl != null) {
                    qdlVar2 = (com.bytedance.sdk.openadsdk.core.fs.qdl) pairQdl.first;
                    str = "";
                    qdlVar3 = (com.bytedance.sdk.openadsdk.core.fs.qdl.ud.qdl) pairQdl.second;
                } else {
                    str = "";
                    qdlVar2 = null;
                    qdlVar3 = null;
                }
                com.bytedance.sdk.openadsdk.core.fs.lnr.mml.ud(ljhVar, strLnr, qdlVar2, jElapsedRealtime, qdlVar3);
                qdlVarQdl = qdlVar2;
            }
            if (qdlVarQdl == null) {
                return null;
            }
            qdl(qdlVarQdl, ljhVar);
        } else {
            str = "";
        }
        ljhVar.rc(jSONObject.optString("deep_link_appname", str));
        ljhVar.wak(jSONObject.optInt("landing_page_download_clicktype", 1));
        JSONObject jSONObjectOptJSONObject26 = jSONObject.optJSONObject("dsp_style");
        if (jSONObjectOptJSONObject26 != null) {
            ljhVar.qdl(new com.bytedance.sdk.openadsdk.core.model.bjy(jSONObjectOptJSONObject26));
        }
        JSONObject jSONObjectOptJSONObject27 = jSONObject.optJSONObject("dsp_adchoices");
        if (jSONObjectOptJSONObject27 != null) {
            ljhVar.wd(jSONObjectOptJSONObject27.optString("adchoices_icon", str));
            ljhVar.jpc(jSONObjectOptJSONObject27.optString("adchoices_url", str));
        }
        String strOptString4 = jSONObject.optString("gdid_encrypted");
        if (!TextUtils.isEmpty(strOptString4)) {
            ljhVar.tvp(strOptString4);
        }
        ljhVar.wak();
        JSONObject jSONObjectOptJSONObject28 = jSONObject.optJSONObject("ugen");
        if (jSONObjectOptJSONObject28 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject28.optJSONObject("endcard")) != null) {
            ljhVar.qdl(lnr(jSONObjectOptJSONObject2));
            JSONObject jSONObjectOptJSONObject29 = jSONObjectOptJSONObject2.optJSONObject("overlay");
            if (jSONObjectOptJSONObject29 != null) {
                ljhVar.ud(lnr(jSONObjectOptJSONObject29));
            }
        }
        ljhVar.mml(jSONObject.optInt("preload_h5_type", 0));
        ljhVar.wd(jSONObject.optBoolean("hasReportShow", false));
        ljhVar.rq(jSONObject.optString("endcard_creative", str));
        ljhVar.wd(jSONObject.optJSONObject("ad_label"));
        JSONObject jSONObjectOptJSONObject30 = jSONObject.optJSONObject("ev");
        if (jSONObjectOptJSONObject30 != null) {
            ljhVar.bjy(jSONObjectOptJSONObject30.optBoolean(com.p004ironsource.mediationsdk.metadata.a.j, com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl));
            ljhVar.xi(jSONObjectOptJSONObject30.optInt("wait_time", com.bytedance.sdk.openadsdk.bch.qdl.lnr.ud));
            ljhVar.hzv(jSONObjectOptJSONObject30.optString("label", com.bytedance.sdk.openadsdk.bch.qdl.lnr.lnr));
            ljhVar.qdl(new com.bytedance.sdk.openadsdk.bch.qdl.ud(ljhVar));
        }
        if (jSONObject.has("banner") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("banner")) != null) {
            ljhVar.qdl(new PAGBannerSize(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0)));
        }
        JSONArray jSONArrayOptJSONArray7 = jSONObject.optJSONArray("ad_tracks");
        if (jSONArrayOptJSONArray7 != null && jSONArrayOptJSONArray7.length() > 0) {
            com.bytedance.sdk.openadsdk.core.model.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.model.mzz(jSONArrayOptJSONArray7);
            if (mzzVar.mml()) {
                ljhVar.qdl(mzzVar);
            }
        }
        JSONObject jSONObjectOptJSONObject31 = jSONObject.optJSONObject("popup");
        if (jSONObjectOptJSONObject31 != null) {
            ljhVar.qdl(new com.bytedance.sdk.openadsdk.core.model.bch(jSONObjectOptJSONObject31));
        }
        return ljhVar;
    }

    private static void qdl(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("iv_skip_time", -1);
            int iOptInt2 = jSONObject.optInt("rv_skip_time", -1);
            if (iOptInt != -1) {
                ljhVar.jjk(iOptInt);
            }
            if (iOptInt2 != -1) {
                ljhVar.zlt(iOptInt2);
            }
        }
    }

    private static void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            jSONObject.put("error_code", -1);
            com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, str, "load_vast_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    private static Pair<com.bytedance.sdk.openadsdk.core.fs.qdl, com.bytedance.sdk.openadsdk.core.fs.qdl.ud.qdl> qdl(String str, int i2, int i3) {
        int iLnr;
        int iMzz;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i3 == 1 || i3 == 5) {
            iLnr = 0;
            iMzz = 0;
        } else {
            iLnr = ax.lnr(yt.qdl());
            iMzz = ax.mzz(yt.qdl());
            if (i2 == 2) {
                iMzz = iLnr;
                iLnr = iMzz;
            }
        }
        com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.mzz(yt.qdl(), iLnr, iMzz);
        return new Pair<>(mzzVar.qdl(str, (File) null, new ArrayList()), mzzVar.mo);
    }

    private static void qdl(com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        qdlVar.qdl(ljhVar);
        if (!qdl(ljhVar.ygv())) {
            ljhVar.xmv(2);
        }
        ljhVar.rq(1);
        ljhVar.qdl(qdlVar);
        if (!TextUtils.isEmpty(qdlVar.mml())) {
            ljhVar.aaj(qdlVar.mml());
        }
        if (!TextUtils.isEmpty(qdlVar.mzz())) {
            ljhVar.jyq(qdlVar.mzz());
        }
        ljhVar.jl(qdlVar.mo());
        ljhVar.qdl((com.bytedance.sdk.openadsdk.core.model.mo) null);
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarTdy = ljhVar.tdy();
        if (udVarTdy == null) {
            udVarTdy = new com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud();
        }
        udVarTdy.lnr(qdlVar.wd());
        udVarTdy.qdl(qdlVar.jpc());
        udVarTdy.mo((String) null);
        udVarTdy.ud((String) null);
        udVarTdy.mml((String) null);
        ljhVar.qdl(udVarTdy);
        if (qdlVar.ud() != null && !TextUtils.isEmpty(qdlVar.ud().mzz())) {
            com.bytedance.sdk.openadsdk.core.model.jl jlVar = new com.bytedance.sdk.openadsdk.core.model.jl();
            jlVar.qdl(qdlVar.ud().mzz());
            jlVar.qdl(qdlVar.ud().ud());
            jlVar.ud(qdlVar.ud().lnr());
            ljhVar.qdl(jlVar);
            return;
        }
        if (ljhVar.hcs() == null) {
            com.bytedance.sdk.openadsdk.core.model.jl jlVar2 = new com.bytedance.sdk.openadsdk.core.model.jl();
            jlVar2.qdl("https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/static/images/2023620white.jpeg");
            jlVar2.qdl(98);
            jlVar2.ud(98);
            ljhVar.qdl(jlVar2);
        }
    }

    private static com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud qdl(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, boolean z2) {
        int iOptInt;
        if (jSONObject == null) {
            return null;
        }
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVar = new com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud();
        udVar.ud(jSONObject.optInt("cover_height"));
        udVar.lnr(jSONObject.optInt("cover_width"));
        udVar.qdl(jSONObject.optString("resolution"));
        udVar.qdl(jSONObject.optLong("size"));
        double dOptDouble = jSONObject.optDouble("video_duration", 0.0d);
        udVar.qdl(dOptDouble);
        int i2 = 1;
        int iOptInt2 = jSONObject.optInt("replay_time", 1);
        if (dOptDouble <= 15.0d && ljhVar.dk() != 1 && com.bytedance.sdk.openadsdk.core.model.ljh.mzz(ljhVar)) {
            i2 = iOptInt2;
        }
        udVar.to(i2);
        udVar.ud(jSONObject.optString("cover_url"));
        udVar.lnr(jSONObject.optString("video_url"));
        udVar.mml(jSONObject.optString("endcard"));
        udVar.mzz(jSONObject.optString("playable_download_url"));
        udVar.mo(jSONObject.optString("file_hash"));
        udVar.jpc(jSONObject.optInt("if_playable_loading_show", 0));
        udVar.tvp(jSONObject.optInt("remove_loading_page_type", 0));
        udVar.qdl(jSONObject.optInt("fallback_endcard_judge", 0));
        udVar.mzz(jSONObject.optInt("video_preload_size", 307200));
        udVar.mo(jSONObject.optInt("reward_video_cached_type", 0));
        udVar.wd(jSONObject.optInt("execute_cached_type", 0));
        if (z2) {
            iOptInt = jSONObject.optInt("endcard_render", 0);
        } else {
            iOptInt = jSONObject.optInt("endcard_render", -1);
        }
        udVar.mml(iOptInt);
        return udVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    private static int qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        int iQdl;
        int iQdl2;
        if (ljhVar == null) {
            com.bytedance.sdk.openadsdk.mml.lnr.lnr((com.bytedance.sdk.openadsdk.core.model.ljh) null, "", 401);
            return 401;
        }
        String strLnr = com.bytedance.sdk.openadsdk.utils.gy.lnr(ljhVar.ok());
        if (!TextUtils.isEmpty(ljhVar.yre()) && ljhVar.yre().length() > 1) {
            if (ljhVar.vxm()) {
                if (ljhVar.ok() < 0) {
                    if (ljhVar.ji() != null) {
                        ljhVar.ji().getDurationSlotType();
                    } else {
                        ljhVar.vz();
                    }
                }
                if (ljhVar.au()) {
                    strLnr = "fullscreen_interstitial_ad";
                }
                if (TextUtils.isEmpty(ljhVar.fk())) {
                    com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, strLnr, "load_html_fail", (JSONObject) null);
                    return 401;
                }
                com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, strLnr, "load_html_success", (JSONObject) null);
            }
            if (ljhVar.ikv() == 0) {
                int iVxg = ljhVar.vxg();
                if (iVxg == 2 || iVxg == 3 || iVxg == 4) {
                    iQdl = qdl(ljhVar.vm());
                    if (iQdl != 200) {
                        com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, strLnr, iQdl);
                        return iQdl;
                    }
                } else if (iVxg == 5 || iVxg == 15) {
                    iQdl2 = qdl(ljhVar.tdy(), ljhVar.uj());
                    if (iQdl2 != 200) {
                        com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, strLnr, iQdl2);
                        return iQdl2;
                    }
                } else if (iVxg == 16) {
                    iQdl = qdl(ljhVar.vm());
                    if (iQdl != 200) {
                        com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, strLnr, iQdl);
                        return iQdl;
                    }
                } else if (iVxg == 50) {
                    iQdl2 = qdl(ljhVar.tdy(), ljhVar.uj());
                    if (iQdl2 != 200) {
                        com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, strLnr, iQdl2);
                        return iQdl2;
                    }
                }
            }
            if (com.bytedance.sdk.openadsdk.core.settings.rq.lnr().uw()) {
                return lnr(ljhVar);
            }
            return ud(ljhVar);
        }
        com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, strLnr, TTAdConstant.AD_ID_IS_NULL_CODE);
        return TTAdConstant.AD_ID_IS_NULL_CODE;
    }

    private static int qdl(com.bytedance.sdk.openadsdk.core.model.exu exuVar) {
        if (exuVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(exuVar.qdl())) {
            return 403;
        }
        if (TextUtils.isEmpty(exuVar.ud())) {
            return 404;
        }
        return (exuVar.lnr() == 1 || exuVar.lnr() == 2) ? 200 : 405;
    }

    private static int qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVar, boolean z2) {
        if (udVar == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(udVar.rq())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z2 || !TextUtils.isEmpty(udVar.to())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    private static int qdl(com.bytedance.sdk.openadsdk.core.model.mo moVar) {
        if (moVar == null) {
            return 407;
        }
        if (TextUtils.isEmpty(moVar.qdl())) {
            return 408;
        }
        if (TextUtils.isEmpty(moVar.lnr())) {
            return TTAdConstant.PACKAGE_NAME_CODE;
        }
        return 200;
    }

    private static int qdl(List<com.bytedance.sdk.openadsdk.core.model.jl> list) {
        if (list == null) {
            return 409;
        }
        if (list.size() <= 0) {
            return 410;
        }
        for (com.bytedance.sdk.openadsdk.core.model.jl jlVar : list) {
            if (jlVar == null) {
                return 411;
            }
            if (TextUtils.isEmpty(jlVar.qdl())) {
                return TTAdConstant.IMAGE_URL_CODE;
            }
        }
        return 200;
    }

    private static void qdl(final ArrayList<qdl> arrayList) {
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl("multiple_ads_parsing_error", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.core.ud.1
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_error", arrayList.size());
                JSONArray jSONArray = new JSONArray();
                for (qdl qdlVar : arrayList) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("cid", qdlVar.qdl);
                    jSONObject2.put("error_msg", qdlVar.ud);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("error_cid_list", jSONArray);
                return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("multiple_ads_parsing_error").ud(jSONObject.toString());
            }
        });
    }
}
