package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.google.ads.mediation.pangle.PangleRequestHelper;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.umeng.analytics.pro.bc;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD {

    public static class Lxb {
        public int LD;
        public String Lxb;

        public Lxb(String str, int i) {
            this.Lxb = str;
            this.LD = i;
        }
    }

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.JVA JVA(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.JVA jva = new com.bytedance.sdk.openadsdk.core.model.JVA();
        jva.Lxb(jSONObject.optString("deeplink_url"));
        jva.LD(jSONObject.optString("fallback_url"));
        jva.Lxb(jSONObject.optInt("fallback_type"));
        return jva;
    }

    private static FilterWord JXs(JSONObject jSONObject) {
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
                    FilterWord filterWordJXs = JXs(jSONArrayOptJSONArray.optJSONObject(i));
                    if (filterWordJXs != null && filterWordJXs.isValid()) {
                        filterWord.addOption(filterWordJXs);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static AdSlot LD(JSONObject jSONObject) {
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

    private static int Lxb(KG kg, boolean z) {
        if (kg == null) {
            return 413;
        }
        if (TextUtils.isEmpty(kg.g)) {
            return 414;
        }
        return (z || !TextUtils.isEmpty(kg.f)) ? 200 : 415;
    }

    private static com.bytedance.sdk.openadsdk.core.model.VVE OY(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.VVE vve = new com.bytedance.sdk.openadsdk.core.model.VVE();
        if (jSONObject == null) {
            vve.Lxb(5);
            vve.LD(30);
            vve.lk(70);
            vve.ZU(1);
            vve.JXs(com.bytedance.sdk.openadsdk.core.model.VVE.Lxb);
            return vve;
        }
        vve.Lxb(jSONObject.optInt("ceiling_time", 5));
        vve.LD(jSONObject.optInt("ceiling_ratio", 30));
        vve.lk(jSONObject.optInt("expand_ratio", 70));
        vve.ZU(jSONObject.optInt("back_type", 1));
        vve.JXs(jSONObject.optInt("boc_return_type", com.bytedance.sdk.openadsdk.core.model.VVE.Lxb));
        return vve;
    }

    private static com.bytedance.sdk.openadsdk.core.model.JXs QAg(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.JXs jXs = new com.bytedance.sdk.openadsdk.core.model.JXs();
        if (jSONObject == null) {
            jXs.lk(0);
            jXs.ZU(0);
            jXs.LD(new ArrayList());
            jXs.JXs(0);
            jXs.Lxb(new ArrayList());
            jXs.LD(0);
            jXs.Lxb(0);
            return jXs;
        }
        jXs.lk(jSONObject.optInt("interceptor_x", 0));
        jXs.ZU(jSONObject.optInt("interceptor_y", 0));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("interceptor_page");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i)));
            }
        }
        jXs.LD(arrayList);
        jXs.JXs(jSONObject.optInt("interceptor_interval_time", 0));
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("url_regular");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList2.add(jSONArrayOptJSONArray2.optString(i2));
            }
        }
        jXs.Lxb(arrayList2);
        jXs.LD(jSONObject.optInt("boc_index", 0));
        jXs.Lxb(jSONObject.optInt("is_act", 0));
        return jXs;
    }

    private static com.bytedance.sdk.openadsdk.core.model.ZU ZU(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("splash_clickarea", 2);
        int iOptInt2 = jSONObject.optInt("splash_layout_id", 1);
        long jOptLong = jSONObject.optLong("load_wait_time", 0L);
        long j = jOptLong >= 0 ? jOptLong : 0L;
        com.bytedance.sdk.openadsdk.core.model.ZU zu = new com.bytedance.sdk.openadsdk.core.model.ZU();
        zu.Lxb(iOptInt);
        zu.LD(iOptInt2);
        zu.Lxb(j);
        return zu;
    }

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.brP ebl(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.brP brp = new com.bytedance.sdk.openadsdk.core.model.brP();
        if (jSONObject == null) {
            brp.Lxb(10L);
            brp.LD(20L);
            brp.lk(10L);
            brp.ZU(20L);
            brp.Lxb("");
            return brp;
        }
        brp.Lxb(jSONObject.optLong("onlylp_loading_maxtime", 10L));
        brp.LD(jSONObject.optLong("straight_lp_showtime", 20L));
        brp.lk(jSONObject.optLong("onlyagg_loading_maxtime", 10L));
        brp.ZU(jSONObject.optLong("straight_agg_showtime", 20L));
        brp.Lxb(jSONObject.optString("loading_text", ""));
        return brp;
    }

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.lk lc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.lk lkVar = new com.bytedance.sdk.openadsdk.core.model.lk();
        lkVar.LD(jSONObject.optString("app_name"));
        lkVar.lk(jSONObject.optString("package_name"));
        lkVar.Lxb(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
        lkVar.Lxb(jSONObject.optDouble("score", -1.0d));
        lkVar.Lxb(jSONObject.optInt("comment_num", -1));
        lkVar.LD(jSONObject.optInt(CampaignEx.JSON_KEY_APP_SIZE, 0));
        lkVar.ZU(jSONObject.optString("app_category"));
        return lkVar;
    }

    private static com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb lk(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb lxb = new com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb();
        lxb.Lxb(jSONObject.optString("id"));
        lxb.LD(jSONObject.optString("md5"));
        lxb.lk(jSONObject.optString("url"));
        return lxb;
    }

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.sLN nBu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.sLN sln = new com.bytedance.sdk.openadsdk.core.model.sLN();
        sln.Lxb(jSONObject.optInt("if_send_click", 0));
        return sln;
    }

    private static Map<String, Object> sLN(JSONObject jSONObject) {
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

    private static int lk(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        int iLxb;
        String strLk = nJ.lk(tDVar.op());
        if (tDVar.qK() == 0) {
            iLxb = Lxb(tDVar.nTb());
            if (iLxb != 200) {
                com.bytedance.sdk.openadsdk.ZU.lk.lk(tDVar, strLk, iLxb);
                return iLxb;
            }
        } else {
            iLxb = 200;
        }
        int iSRq = tDVar.sRq();
        if (iSRq != 2 && iSRq != 3) {
            if (iSRq == 4) {
                int iLxb2 = Lxb(tDVar.MGT());
                if (iLxb2 == 200) {
                    return iLxb2;
                }
                com.bytedance.sdk.openadsdk.ZU.lk.lk(tDVar, strLk, iLxb2);
                return iLxb2;
            }
            if (iSRq != 8) {
                return iLxb;
            }
        }
        if (!ZU(tDVar) || !TextUtils.isEmpty(tDVar.Sv())) {
            return iLxb;
        }
        com.bytedance.sdk.openadsdk.ZU.lk.lk(tDVar, strLk, 406);
        return 406;
    }

    @Nullable
    private static KG Lxb(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.tD tDVar, boolean z) {
        int iOptInt;
        if (jSONObject == null) {
            return null;
        }
        KG kg = new KG();
        kg.f3307a = jSONObject.optInt("cover_height");
        kg.b = jSONObject.optInt("cover_width");
        kg.e = jSONObject.optString(bc.z);
        kg.c = jSONObject.optLong("size");
        double dOptDouble = jSONObject.optDouble("video_duration", 0.0d);
        kg.d = dOptDouble;
        int iOptInt2 = jSONObject.optInt("replay_time", 1);
        if (dOptDouble > 15.0d || tDVar.eK() == 1 || !com.bytedance.sdk.openadsdk.core.model.tD.JXs(tDVar)) {
            iOptInt2 = 1;
        }
        kg.r = Math.min(4, Math.max(1, iOptInt2));
        kg.f = jSONObject.optString("cover_url");
        kg.g = jSONObject.optString(CampaignEx.JSON_KEY_VIDEO_URL);
        kg.h = jSONObject.optString(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        kg.i = jSONObject.optString("playable_download_url");
        kg.j = jSONObject.optString("file_hash");
        kg.m = jSONObject.optInt("if_playable_loading_show", 0);
        kg.n = jSONObject.optInt("remove_loading_page_type", 0);
        kg.k = jSONObject.optInt("fallback_endcard_judge", 0);
        kg.q = jSONObject.optInt("video_preload_size", 307200);
        kg.o = jSONObject.optInt("reward_video_cached_type", 0);
        kg.p = jSONObject.optInt("execute_cached_type", 0);
        if (z) {
            iOptInt = jSONObject.optInt("endcard_render", 0);
        } else {
            iOptInt = jSONObject.optInt("endcard_render", -1);
        }
        kg.l = iOptInt;
        return kg;
    }

    private static boolean ZU(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        return (tDVar.chu() || tDVar.Iyd()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    private static int LD(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        int iLxb;
        String strLk = nJ.lk(tDVar.op());
        if (tDVar.qK() == 0) {
            iLxb = Lxb(tDVar.nTb());
            com.bytedance.sdk.openadsdk.ZU.lk.lk(tDVar, strLk, iLxb);
        } else {
            iLxb = 200;
        }
        int iSRq = tDVar.sRq();
        if (iSRq == 2 || iSRq == 3) {
            if (ZU(tDVar) && TextUtils.isEmpty(tDVar.Sv())) {
                com.bytedance.sdk.openadsdk.ZU.lk.lk(tDVar, strLk, 406);
                iLxb = 406;
            }
        } else if (iSRq == 4) {
            com.bytedance.sdk.openadsdk.core.model.lk lkVarMGT = tDVar.MGT();
            if (lkVarMGT == null) {
                com.bytedance.sdk.openadsdk.ZU.lk.lk(tDVar, strLk, 407);
                iLxb = 407;
            } else if (TextUtils.isEmpty(lkVarMGT.lk()) && TextUtils.isEmpty(lkVarMGT.Lxb())) {
                com.bytedance.sdk.openadsdk.ZU.lk.lk(tDVar, strLk, 417);
                iLxb = 417;
            } else if (TextUtils.isEmpty(lkVarMGT.lk())) {
                iLxb = 416;
                com.bytedance.sdk.openadsdk.ZU.lk.lk(tDVar, strLk, 416);
            } else if (TextUtils.isEmpty(lkVarMGT.Lxb())) {
                iLxb = 408;
                com.bytedance.sdk.openadsdk.ZU.lk.lk(tDVar, strLk, 408);
            }
        } else if (iSRq == 8) {
            if (ZU(tDVar)) {
                com.bytedance.sdk.openadsdk.ZU.lk.lk(tDVar, strLk, 406);
                iLxb = 406;
            }
        }
        if (iLxb == 417 || iLxb == 407 || iLxb == 406) {
            return iLxb;
        }
        if (iLxb != 200) {
            com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, strLk, iLxb);
        }
        return 200;
    }

    private static boolean Lxb(int i) {
        return i == 2 || i == 3 || i == 8;
    }

    @Nullable
    public static Pair<com.bytedance.sdk.openadsdk.core.model.Lxb, ArrayList<Integer>> Lxb(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Sfi sfi, com.bytedance.sdk.openadsdk.core.model.LD ld) {
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.Lxb lxb = new com.bytedance.sdk.openadsdk.core.model.Lxb();
            lxb.Lxb(jSONObject.optString("request_id"));
            lxb.Lxb(jSONObject.optInt("ret"));
            int i = 0;
            lxb.LD(jSONObject.optInt("multi_ad_style", 0));
            lxb.LD(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            String strOptString = jSONObject.optString("gdid_encrypted");
            if (jSONObject.has("choose_ui_data")) {
                lxb.LD(jSONObject.optJSONObject("choose_ui_data"));
                lxb.Lxb(true);
            }
            String strOptString2 = jSONObject.optString("auction_price");
            if (lxb.lk() != 0) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                ArrayList arrayList2 = lxb.sLN() ? new ArrayList() : null;
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    com.bytedance.sdk.openadsdk.core.model.tD tDVarLxb = Lxb(jSONArrayOptJSONArray.optJSONObject(i2), adSlot, sfi);
                    if (tDVarLxb != null && lxb.sLN()) {
                        if (tDVarLxb.kqm() == 30) {
                            tDVarLxb.QAg(true);
                        } else {
                            lxb.LD(0);
                            arrayList2 = null;
                        }
                    }
                    int iLxb = Lxb(tDVarLxb);
                    if (iLxb != 200) {
                        if (tDVarLxb != null) {
                            com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVarLxb, nJ.lk(tDVarLxb.op()), iLxb);
                        } else {
                            com.bytedance.sdk.openadsdk.ZU.lk.LD((com.bytedance.sdk.openadsdk.core.model.tD) null, "", iLxb);
                        }
                        arrayList.add(Integer.valueOf(iLxb));
                        if (arrayList2 != null && tDVarLxb != null) {
                            arrayList2.add(new Lxb(tDVarLxb.rO(), iLxb));
                        }
                    } else {
                        tDVarLxb.QAg(strOptString2);
                        if (!TextUtils.isEmpty(strOptString)) {
                            tDVarLxb.id(strOptString);
                        }
                        lxb.Lxb(tDVarLxb);
                    }
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    Lxb((ArrayList<Lxb>) arrayList2);
                }
                i = length;
            }
            Lxb(i, lxb, (ArrayList<Integer>) arrayList, ld);
            return new Pair<>(lxb, arrayList);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AdInfoFactory", th.getMessage());
            return null;
        }
    }

    private static void Lxb(int i, final com.bytedance.sdk.openadsdk.core.model.Lxb lxb, final ArrayList<Integer> arrayList, final com.bytedance.sdk.openadsdk.core.model.LD ld) {
        if (lxb == null || i < 2 || !lxb.OY()) {
            return;
        }
        final int size = i - (lxb.ZU() != null ? lxb.ZU().size() : 0);
        final boolean z = lxb.QAg() == null;
        if (size > 0 || z) {
            com.bytedance.sdk.openadsdk.STP.lk.Lxb();
            com.bytedance.sdk.openadsdk.STP.lk.Lxb("choose_ad_parsing_error", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.core.LD.1
                @Override // com.bytedance.sdk.openadsdk.STP.LD
                public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", lxb.LD());
                    jSONObject.put("material_error", size);
                    jSONObject.put("choose_ui_error", z ? 1 : 0);
                    ArrayList arrayList2 = arrayList;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) arrayList).toString());
                    }
                    com.bytedance.sdk.openadsdk.core.model.LD ld2 = ld;
                    if (ld2 != null) {
                        jSONObject.put("server_res_str", ld2.Lxb());
                    }
                    return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("choose_ad_parsing_error").LD(jSONObject.toString());
                }
            });
        }
    }

    @Nullable
    public static com.bytedance.sdk.openadsdk.core.model.tD Lxb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return Lxb(jSONObject, (AdSlot) null, (com.bytedance.sdk.openadsdk.core.model.Sfi) null);
    }

    /* JADX WARN: Code duplicated, block: B:141:0x05b6 A[PHI: r14
  0x05b6: PHI (r14v83 int) = (r14v82 int), (r14v131 int) binds: [B:134:0x05a2, B:139:0x05b3] A[DONT_GENERATE, DONT_INLINE]] */
    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.tD Lxb(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Sfi sfi) {
        KG kgLxb;
        KG kgLxb2;
        int i;
        com.bytedance.sdk.openadsdk.core.sLN.Lxb Lxb2;
        com.bytedance.sdk.openadsdk.core.sLN.Lxb.LD.Lxb lxb;
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.tD tDVarLk = com.bytedance.sdk.openadsdk.core.model.tD.lk();
        tDVarLk.tD(jSONObject.optInt("interaction_type"));
        tDVarLk.brP(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.tD.ZU, 0));
        tDVarLk.DY(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.tD.lk, 0));
        tDVarLk.Sfi(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.tD.JXs, 0));
        tDVarLk.NXR(jSONObject.optString("target_url"));
        tDVarLk.brP(jSONObject.optString("ad_id"));
        tDVarLk.tD(jSONObject.optString("app_log_url"));
        tDVarLk.JVA(jSONObject.optString("source"));
        tDVarLk.sLN(jSONObject.optString("app_name"));
        tDVarLk.CSn(jSONObject.optInt("dislike_control", 0));
        tDVarLk.NXR(jSONObject.optInt("play_bar_show_time", -200));
        tDVarLk.Sfi(jSONObject.optString("gecko_id"));
        if (jSONObject.has("set_click_type")) {
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("set_click_type");
            tDVarLk.LD(jSONObjectOptJSONObject2.optDouble("cta", 2.0d));
            tDVarLk.Lxb(jSONObjectOptJSONObject2.optDouble("other", 1.0d));
        }
        tDVarLk.JXs(jSONObject.optJSONObject("extension"));
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(RewardPlus.ICON);
        tDVarLk.ZU(jSONObject.optBoolean("screenshot", false));
        tDVarLk.JVA(jSONObject.optInt("play_bar_style", 0));
        tDVarLk.HD(jSONObject.optString("market_url", ""));
        tDVarLk.QAg(jSONObject.optInt("video_adaptation", 0));
        tDVarLk.lc(jSONObject.optInt("feed_video_opentype", 0));
        tDVarLk.lk(jSONObject.optJSONObject("session_params"));
        tDVarLk.QAg(jSONObject.optString("auction_price", ""));
        tDVarLk.nE(jSONObject.optInt("mrc_report", 0));
        if (jSONObject.optBoolean("isMrcReportFinish", false)) {
            tDVarLk.FtP();
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("render");
        if (jSONObjectOptJSONObject4 != null) {
            tDVarLk.ebl(jSONObjectOptJSONObject4.optInt("render_sequence", 0));
            tDVarLk.OY(jSONObjectOptJSONObject4.optInt("backup_render_control", 1));
            tDVarLk.xan(jSONObjectOptJSONObject4.optInt("reserve_time", 100));
            tDVarLk.hg(jSONObjectOptJSONObject4.optInt("render_thread", 0));
        }
        tDVarLk.ZU(jSONObject.optInt("render_control", sfi != null ? sfi.OY : 1));
        if (jSONObjectOptJSONObject3 != null) {
            com.bytedance.sdk.openadsdk.core.model.IeN ieN = new com.bytedance.sdk.openadsdk.core.model.IeN();
            ieN.Lxb(jSONObjectOptJSONObject3.optString("url"));
            ieN.LD(jSONObjectOptJSONObject3.optInt("height"));
            ieN.Lxb(jSONObjectOptJSONObject3.optInt("width"));
            tDVarLk.Lxb(ieN);
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("reward_data");
        if (jSONObjectOptJSONObject5 != null) {
            tDVarLk.lk(jSONObjectOptJSONObject5.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT, 0));
            tDVarLk.ebl(jSONObjectOptJSONObject5.optString(CampaignEx.JSON_KEY_REWARD_NAME, ""));
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("cover_image");
        if (jSONObjectOptJSONObject6 != null) {
            com.bytedance.sdk.openadsdk.core.model.IeN ieN2 = new com.bytedance.sdk.openadsdk.core.model.IeN();
            ieN2.Lxb(jSONObjectOptJSONObject6.optString("url"));
            ieN2.LD(jSONObjectOptJSONObject6.optInt("height"));
            ieN2.Lxb(jSONObjectOptJSONObject6.optInt("width"));
            tDVarLk.LD(ieN2);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                com.bytedance.sdk.openadsdk.core.model.IeN ieN3 = new com.bytedance.sdk.openadsdk.core.model.IeN();
                JSONObject jSONObjectOptJSONObject7 = jSONArrayOptJSONArray.optJSONObject(i2);
                ieN3.Lxb(jSONObjectOptJSONObject7.optString("url"));
                ieN3.LD(jSONObjectOptJSONObject7.optInt("height"));
                ieN3.Lxb(jSONObjectOptJSONObject7.optInt("width"));
                ieN3.Lxb(jSONObjectOptJSONObject7.optBoolean("image_preview"));
                ieN3.LD(jSONObjectOptJSONObject7.optString("image_key"));
                tDVarLk.lk(ieN3);
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("show_url");
        if (jSONArrayOptJSONArray2 != null) {
            for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                tDVarLk.SS().add(jSONArrayOptJSONArray2.optString(i3));
            }
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(CampaignEx.JSON_KEY_CLICK_URL);
        if (jSONArrayOptJSONArray3 != null) {
            for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                tDVarLk.LXE().add(jSONArrayOptJSONArray3.optString(i4));
            }
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("play_start");
        if (jSONArrayOptJSONArray4 != null) {
            for (int i5 = 0; i5 < jSONArrayOptJSONArray4.length(); i5++) {
                tDVarLk.wbY().add(jSONArrayOptJSONArray4.optString(i5));
            }
        }
        JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("click_area");
        if (jSONObjectOptJSONObject8 != null) {
            com.bytedance.sdk.openadsdk.core.model.QAg qAg = new com.bytedance.sdk.openadsdk.core.model.QAg();
            qAg.Lxb = jSONObjectOptJSONObject8.optBoolean("click_upper_content_area", true);
            qAg.LD = jSONObjectOptJSONObject8.optBoolean("click_upper_non_content_area", true);
            qAg.lk = jSONObjectOptJSONObject8.optBoolean("click_lower_content_area", true);
            qAg.ZU = jSONObjectOptJSONObject8.optBoolean("click_lower_non_content_area", true);
            qAg.JXs = jSONObjectOptJSONObject8.optBoolean("click_button_area", true);
            qAg.lc = jSONObjectOptJSONObject8.optBoolean("click_video_area", true);
            tDVarLk.Lxb(qAg);
        }
        JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject("adslot");
        if (jSONObjectOptJSONObject9 != null) {
            tDVarLk.Lxb(LD(jSONObjectOptJSONObject9));
        } else {
            tDVarLk.Lxb(adSlot);
        }
        if (adSlot != null) {
            Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
            if (requestExtraMap != null && requestExtraMap.containsKey(PangleRequestHelper.ADMOB_WATERMARK_KEY)) {
                tDVarLk.foI(String.valueOf(requestExtraMap.get(PangleRequestHelper.ADMOB_WATERMARK_KEY)));
            }
        } else {
            tDVarLk.foI(jSONObject.optString("identificationOverlayContent"));
        }
        tDVarLk.sLN(jSONObject.optInt("intercept_flag", 0));
        tDVarLk.STP(jSONObject.optString("phone_num"));
        tDVarLk.IeN(jSONObject.optString(CampaignEx.JSON_KEY_TITLE));
        tDVarLk.VVE(jSONObject.optString("description"));
        tDVarLk.kqm(jSONObject.optString("button_text"));
        tDVarLk.nBu(jSONObject.optInt("ad_logo", 1));
        tDVarLk.DY(jSONObject.optString("ext"));
        tDVarLk.VVE(jSONObject.optInt("cover_click_area", 0));
        tDVarLk.HD(jSONObject.optInt("image_mode"));
        tDVarLk.aH(jSONObject.optInt(AdUnitActivity.EXTRA_ORIENTATION, 1));
        tDVarLk.Lxb((float) jSONObject.optDouble("aspect_ratio", 100.0d));
        tDVarLk.VVE(jSONObject.optInt("cover_click_area", 0));
        JSONObject jSONObjectOptJSONObject10 = jSONObject.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        JSONObject jSONObjectOptJSONObject11 = jSONObject.optJSONObject(CampaignEx.JSON_KEY_DEEP_LINK_URL);
        tDVarLk.Lxb(com.bytedance.sdk.openadsdk.core.model.HD.Lxb(jSONObject.optJSONObject("oem")));
        tDVarLk.Lxb(lc(jSONObjectOptJSONObject10));
        JSONObject jSONObjectOptJSONObject12 = jSONObject.optJSONObject("interaction_method_params");
        tDVarLk.Lxb(QAg(jSONObject.optJSONObject("arbitrage_interceptor_params")));
        tDVarLk.Lxb(ebl(jSONObjectOptJSONObject12));
        tDVarLk.Lxb(OY(jSONObjectOptJSONObject12));
        tDVarLk.Lxb(JVA(jSONObjectOptJSONObject11));
        tDVarLk.Lxb(new com.bytedance.sdk.openadsdk.core.model.eK(jSONObject));
        JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("filter_words");
        if (jSONArrayOptJSONArray5 != null) {
            for (int i6 = 0; i6 < jSONArrayOptJSONArray5.length(); i6++) {
                FilterWord filterWordJXs = JXs(jSONArrayOptJSONArray5.optJSONObject(i6));
                if (filterWordJXs != null && filterWordJXs.isValid()) {
                    tDVarLk.Lxb(filterWordJXs);
                }
            }
        }
        tDVarLk.eK(jSONObject.optInt("count_down"));
        tDVarLk.LD(jSONObject.optLong("expiration_time"));
        tDVarLk.le(jSONObject.optInt("video_encode_type", 0));
        tDVarLk.nJ(0);
        JSONObject jSONObjectOptJSONObject13 = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject13 != null) {
            kgLxb = Lxb(jSONObjectOptJSONObject13, tDVarLk, true);
            tDVarLk.LD(kgLxb);
            tDVarLk.NDz(jSONObjectOptJSONObject13.optInt("multi_played_percent", 50));
        } else {
            kgLxb = null;
        }
        JSONObject jSONObjectOptJSONObject14 = jSONObject.optJSONObject("h265_video");
        if (jSONObjectOptJSONObject14 != null) {
            kgLxb2 = Lxb(jSONObjectOptJSONObject14, tDVarLk, false);
            tDVarLk.lk(kgLxb2);
        } else {
            kgLxb2 = null;
        }
        if (Build.VERSION.SDK_INT < 26 || tDVarLk.Zg() == 0) {
            tDVarLk.Lxb(kgLxb);
            tDVarLk.le(0);
        } else {
            if (kgLxb2 != null && kgLxb != null) {
                if (TextUtils.isEmpty(kgLxb2.h)) {
                    kgLxb2.h = kgLxb.h;
                }
                if (TextUtils.isEmpty(kgLxb2.i)) {
                    kgLxb2.i = kgLxb.i;
                }
                if (kgLxb2.l == -1) {
                    kgLxb2.l = kgLxb.l;
                }
            }
            if (kgLxb2 != null) {
                tDVarLk.Lxb(kgLxb2);
            } else {
                tDVarLk.Lxb(kgLxb);
            }
        }
        JSONObject jSONObjectOptJSONObject15 = jSONObject.optJSONObject("download_conf");
        if (jSONObjectOptJSONObject15 != null) {
            tDVarLk.Lxb(nBu(jSONObjectOptJSONObject15));
        }
        tDVarLk.Lxb(sLN(jSONObject.optJSONObject("media_ext")));
        JSONObject jSONObjectOptJSONObject16 = jSONObject.optJSONObject("tpl_info");
        if (jSONObjectOptJSONObject16 != null) {
            com.bytedance.sdk.openadsdk.core.model.tD.Lxb lxb2 = new com.bytedance.sdk.openadsdk.core.model.tD.Lxb();
            lxb2.lk(jSONObjectOptJSONObject16.optString("id"));
            lxb2.ZU(jSONObjectOptJSONObject16.optString("md5"));
            lxb2.JXs(jSONObjectOptJSONObject16.optString("url"));
            lxb2.lc(jSONObjectOptJSONObject16.optString("data"));
            lxb2.ebl(jSONObjectOptJSONObject16.optString("diff_data"));
            String strOptString = jSONObjectOptJSONObject16.optString("dynamic_creative");
            lxb2.OY(strOptString);
            lxb2.LD(jSONObjectOptJSONObject16.optString("version"));
            lxb2.QAg(jSONObjectOptJSONObject16.optString("media_view"));
            try {
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObject2 = new JSONObject(strOptString);
                JSONArray jSONArrayOptJSONArray6 = jSONObject2.optJSONArray("tag_ids");
                if (jSONArrayOptJSONArray6 != null) {
                    for (int i7 = 0; i7 < jSONArrayOptJSONArray6.length(); i7++) {
                        arrayList.add(Integer.valueOf(jSONArrayOptJSONArray6.optInt(i7)));
                    }
                }
                String strOptString2 = jSONObject2.optString("music_url");
                lxb2.Lxb(arrayList);
                lxb2.Lxb(strOptString2);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AdInfoFactory", e.getMessage());
            }
            lxb2.nBu(jSONObjectOptJSONObject16.optString("engine_version"));
            lxb2.JVA(jSONObjectOptJSONObject16.optString("ugen_url"));
            lxb2.sLN(jSONObjectOptJSONObject16.optString("ugen_md5"));
            lxb2.NXR(jSONObjectOptJSONObject16.optString("ugen_data"));
            tDVarLk.Lxb(lxb2);
        }
        JSONObject jSONObjectOptJSONObject17 = jSONObject.optJSONObject("tpl_info_v3");
        if (jSONObjectOptJSONObject17 != null) {
            tDVarLk.Lxb(com.bytedance.sdk.openadsdk.core.model.id.Lxb(jSONObjectOptJSONObject17));
        }
        JSONObject jSONObjectOptJSONObject18 = jSONObject.optJSONObject("dynamic_creative");
        if (jSONObjectOptJSONObject18 != null) {
            tDVarLk.LD(jSONObjectOptJSONObject18);
        }
        tDVarLk.nBu(jSONObject.optString("creative_extra"));
        tDVarLk.JXs(jSONObject.optInt("if_block_lp", 0));
        tDVarLk.STP(jSONObject.optInt("cache_sort", 1));
        tDVarLk.IeN(jSONObject.optInt("if_sp_cache", 0));
        JSONObject jSONObjectOptJSONObject19 = jSONObject.optJSONObject("splash_control");
        if (jSONObjectOptJSONObject19 != null) {
            tDVarLk.Lxb(ZU(jSONObjectOptJSONObject19));
        }
        tDVarLk.id(jSONObject.optInt("is_package_open", 1));
        tDVarLk.OY(jSONObject.optString("ad_info", null));
        tDVarLk.kqm(jSONObject.optInt("ua_policy", 2));
        tDVarLk.foI(jSONObject.optInt("playable_duration_time", 20));
        tDVarLk.KPU(jSONObject.optInt("playable_endcard_close_time", -1));
        tDVarLk.Ivz(jSONObject.optInt("endcard_close_time", -1));
        tDVarLk.Lxb(jSONObject.optInt("interaction_method"));
        tDVarLk.eK(jSONObject.optString("dsp_html"));
        tDVarLk.JJ(jSONObject.optInt("image_stay", 0));
        int iOptInt = jSONObject.optInt("dsp_material_type", 0);
        if (iOptInt < 0 || iOptInt > 3) {
            iOptInt = 0;
        }
        if (iOptInt == 0) {
            if (jSONObject.optBoolean("is_vast", false)) {
                iOptInt = 1;
            }
            i = jSONObject.optBoolean("is_html", false) ? 2 : iOptInt;
        }
        tDVarLk.rW(i);
        if (i == 1 || i == 3) {
            int iOp = tDVarLk.op();
            if (iOp < 0) {
                if (tDVarLk.hg() != null) {
                    iOp = tDVarLk.hg().getDurationSlotType();
                } else {
                    iOp = tDVarLk.lJ();
                }
            }
            String strLk = nJ.lk(iOp);
            if (jSONObject.has("vast_json")) {
                Lxb2 = com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb(jSONObject.optJSONObject("vast_json"));
            } else {
                String strOptString3 = jSONObject.optString("dsp_vast");
                if (TextUtils.isEmpty(strOptString3)) {
                    Lxb(tDVarLk, strLk);
                    return null;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                Pair<com.bytedance.sdk.openadsdk.core.sLN.Lxb, com.bytedance.sdk.openadsdk.core.sLN.Lxb.LD.Lxb> pairLxb = Lxb(strOptString3, tDVarLk.wCT(), iOp);
                if (pairLxb != null) {
                    com.bytedance.sdk.openadsdk.core.sLN.Lxb lxb3 = (com.bytedance.sdk.openadsdk.core.sLN.Lxb) pairLxb.first;
                    lxb = (com.bytedance.sdk.openadsdk.core.sLN.Lxb.LD.Lxb) pairLxb.second;
                    Lxb2 = lxb3;
                } else {
                    Lxb2 = null;
                    lxb = null;
                }
                Lxb(tDVarLk, strLk, Lxb2, jCurrentTimeMillis, lxb);
            }
            if (Lxb2 != null) {
                Lxb2.lc(strLk);
            }
            if (Lxb2 == null) {
                return null;
            }
            Lxb(Lxb2, tDVarLk);
        }
        tDVarLk.aH(jSONObject.optString("deep_link_appname", ""));
        tDVarLk.BcA(jSONObject.optInt("landing_page_download_clicktype", 1));
        JSONObject jSONObjectOptJSONObject20 = jSONObject.optJSONObject("dsp_style");
        if (jSONObjectOptJSONObject20 != null) {
            tDVarLk.Lxb(new com.bytedance.sdk.openadsdk.core.model.NXR(jSONObjectOptJSONObject20));
        }
        JSONObject jSONObjectOptJSONObject21 = jSONObject.optJSONObject("dsp_adchoices");
        if (jSONObjectOptJSONObject21 != null) {
            tDVarLk.JXs(jSONObjectOptJSONObject21.optString("adchoices_icon", ""));
            tDVarLk.lc(jSONObjectOptJSONObject21.optString("adchoices_url", ""));
        }
        String strOptString4 = jSONObject.optString("gdid_encrypted");
        if (!TextUtils.isEmpty(strOptString4)) {
            tDVarLk.id(strOptString4);
        }
        int iOptInt2 = jSONObject.optInt("jump_probability", 0);
        if (iOptInt2 < 0 || iOptInt2 > 100) {
            iOptInt2 = 0;
        }
        tDVarLk.Pw(iOptInt2);
        tDVarLk.RC();
        JSONObject jSONObjectOptJSONObject22 = jSONObject.optJSONObject("ugen");
        if (jSONObjectOptJSONObject22 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject22.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) != null) {
            tDVarLk.Lxb(lk(jSONObjectOptJSONObject));
            JSONObject jSONObjectOptJSONObject23 = jSONObjectOptJSONObject.optJSONObject("overlay");
            if (jSONObjectOptJSONObject23 != null) {
                tDVarLk.LD(lk(jSONObjectOptJSONObject23));
            }
        }
        tDVarLk.dR(jSONObject.optInt("preload_h5_type", 0));
        tDVarLk.OY(jSONObject.optBoolean("hasReportShow", false));
        tDVarLk.KPU(jSONObject.optString("endcard_creative", ""));
        JSONObject jSONObjectOptJSONObject24 = jSONObject.optJSONObject("ev");
        if (jSONObjectOptJSONObject24 != null) {
            tDVarLk.JVA(jSONObjectOptJSONObject24.optBoolean("enable", com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb));
            tDVarLk.VU(jSONObjectOptJSONObject24.optInt("wait_time", com.bytedance.sdk.openadsdk.eK.Lxb.lk.LD));
            tDVarLk.Ivz(jSONObjectOptJSONObject24.optString("label", com.bytedance.sdk.openadsdk.eK.Lxb.lk.lk));
            tDVarLk.Lxb(new com.bytedance.sdk.openadsdk.eK.Lxb.LD(tDVarLk));
        }
        return tDVarLk;
    }

    private static void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            jSONObject.put("error_code", -1);
            com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, str, "load_vast_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    private static void Lxb(final com.bytedance.sdk.openadsdk.core.model.tD tDVar, final String str, final com.bytedance.sdk.openadsdk.core.sLN.Lxb lxb, final long j, final com.bytedance.sdk.openadsdk.core.sLN.Lxb.LD.Lxb lxb2) {
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(new com.bytedance.sdk.component.OY.OY("vast_parser") { // from class: com.bytedance.sdk.openadsdk.core.LD.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    com.bytedance.sdk.openadsdk.core.sLN.Lxb lxb3 = lxb;
                    String str2 = "load_vast_fail";
                    if (lxb3 == null) {
                        jSONObject.put("reason_code", -2);
                        com.bytedance.sdk.openadsdk.core.sLN.Lxb.LD.Lxb lxb4 = lxb2;
                        if (lxb4 != null) {
                            jSONObject.put("error_code", lxb4.Lxb);
                        }
                    } else if (TextUtils.isEmpty(lxb3.QAg()) || TextUtils.isEmpty(lxb.lc()) || lxb.OY() <= 0.0d) {
                        jSONObject.put("reason_code", -3);
                        jSONObject.put("error_code", -3);
                    } else {
                        jSONObject.put("duration", System.currentTimeMillis() - j);
                        com.bytedance.sdk.openadsdk.core.sLN.Lxb.LD.Lxb lxb5 = lxb2;
                        if (lxb5 != null) {
                            jSONObject.put("wrapper_count", lxb5.LD);
                            jSONObject.put("impression_links_null", lxb2.lk);
                        }
                        str2 = "load_vast_success";
                    }
                    com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, str, str2, jSONObject);
                    com.bytedance.sdk.openadsdk.core.sLN.Lxb lxb6 = lxb;
                    if (lxb6 == null || lxb6.LD() == null || !TextUtils.isEmpty(lxb.LD().lc())) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_code", 1000);
                        jSONObject2.put("description", "1000:Image url is null");
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, str, "load_vast_icon_fail", jSONObject2);
                    lxb.Lxb((com.bytedance.sdk.openadsdk.core.sLN.LD) null);
                } catch (Exception unused2) {
                }
            }
        });
    }

    private static Pair<com.bytedance.sdk.openadsdk.core.sLN.Lxb, com.bytedance.sdk.openadsdk.core.sLN.Lxb.LD.Lxb> Lxb(String str, int i, int i2) {
        int iLk;
        int iZU;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i2 == 1 || i2 == 5) {
            iLk = 0;
            iZU = 0;
        } else {
            iLk = le.lk(kqm.Lxb());
            iZU = le.ZU(kqm.Lxb());
            if (i == 2) {
                iZU = iLk;
                iLk = iZU;
            }
        }
        com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb.JXs jXs = new com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb.JXs(kqm.Lxb(), iLk, iZU);
        return new Pair<>(jXs.Lxb(str, new ArrayList()), jXs.lc);
    }

    private static void Lxb(com.bytedance.sdk.openadsdk.core.sLN.Lxb lxb, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        lxb.Lxb(tDVar);
        if (!Lxb(tDVar.sRq())) {
            tDVar.tD(2);
        }
        tDVar.ZU(1);
        tDVar.Lxb(lxb);
        if (!TextUtils.isEmpty(lxb.ZU())) {
            tDVar.IeN(lxb.ZU());
        }
        if (!TextUtils.isEmpty(lxb.JXs())) {
            tDVar.VVE(lxb.JXs());
        }
        tDVar.NXR(lxb.lc());
        tDVar.Lxb((com.bytedance.sdk.openadsdk.core.model.lk) null);
        KG kgJJ = tDVar.JJ();
        if (kgJJ == null) {
            kgJJ = new KG();
        }
        kgJJ.g = lxb.ebl();
        kgJJ.d = lxb.OY();
        kgJJ.j = null;
        kgJJ.f = null;
        kgJJ.h = null;
        tDVar.Lxb(kgJJ);
        if (lxb.LD() != null && !TextUtils.isEmpty(lxb.LD().JXs())) {
            com.bytedance.sdk.openadsdk.core.model.IeN ieN = new com.bytedance.sdk.openadsdk.core.model.IeN();
            ieN.Lxb(lxb.LD().JXs());
            ieN.Lxb(lxb.LD().LD());
            ieN.LD(lxb.LD().lk());
            tDVar.Lxb(ieN);
            return;
        }
        if (tDVar.Lpq() == null) {
            com.bytedance.sdk.openadsdk.core.model.IeN ieN2 = new com.bytedance.sdk.openadsdk.core.model.IeN();
            ieN2.Lxb("https://sf16-fe-tos-sg.i18n-pglstatp.com/obj/ad-pattern-sg/static/images/2023620white.jpeg");
            ieN2.Lxb(98);
            ieN2.LD(98);
            tDVar.Lxb(ieN2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    private static int Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        int iLxb;
        int iLxb2;
        if (tDVar == null) {
            com.bytedance.sdk.openadsdk.ZU.lk.lk((com.bytedance.sdk.openadsdk.core.model.tD) null, "", 401);
            return 401;
        }
        String strLk = nJ.lk(tDVar.op());
        if (!TextUtils.isEmpty(tDVar.bG()) && tDVar.bG().length() > 1) {
            if (tDVar.Iyd()) {
                if (tDVar.op() < 0) {
                    if (tDVar.hg() != null) {
                        tDVar.hg().getDurationSlotType();
                    } else {
                        tDVar.lJ();
                    }
                }
                if (tDVar.JP()) {
                    strLk = "fullscreen_interstitial_ad";
                }
                if (TextUtils.isEmpty(tDVar.owi())) {
                    com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, strLk, "load_html_fail", (JSONObject) null);
                    return 401;
                }
                com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, strLk, "load_html_success", (JSONObject) null);
            }
            if (tDVar.qK() == 0) {
                int iFGm = tDVar.FGm();
                if (iFGm == 2 || iFGm == 3 || iFGm == 4) {
                    iLxb = Lxb(tDVar.uxf());
                    if (iLxb != 200) {
                        com.bytedance.sdk.openadsdk.ZU.lk.lk(tDVar, strLk, iLxb);
                        return iLxb;
                    }
                } else if (iFGm == 5 || iFGm == 15) {
                    iLxb2 = Lxb(tDVar.JJ(), tDVar.chu());
                    if (iLxb2 != 200) {
                        com.bytedance.sdk.openadsdk.ZU.lk.lk(tDVar, strLk, iLxb2);
                        return iLxb2;
                    }
                } else if (iFGm == 16) {
                    iLxb = Lxb(tDVar.uxf());
                    if (iLxb != 200) {
                        com.bytedance.sdk.openadsdk.ZU.lk.lk(tDVar, strLk, iLxb);
                        return iLxb;
                    }
                } else if (iFGm == 50) {
                    iLxb2 = Lxb(tDVar.JJ(), tDVar.chu());
                    if (iLxb2 != 200) {
                        com.bytedance.sdk.openadsdk.ZU.lk.lk(tDVar, strLk, iLxb2);
                        return iLxb2;
                    }
                }
            }
            if (com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Rt()) {
                return lk(tDVar);
            }
            return LD(tDVar);
        }
        com.bytedance.sdk.openadsdk.ZU.lk.lk(tDVar, strLk, 402);
        return 402;
    }

    private static int Lxb(com.bytedance.sdk.openadsdk.core.model.JVA jva) {
        if (jva == null) {
            return 200;
        }
        if (TextUtils.isEmpty(jva.Lxb())) {
            return 403;
        }
        if (TextUtils.isEmpty(jva.LD())) {
            return 404;
        }
        return (jva.lk() == 1 || jva.lk() == 2) ? 200 : 405;
    }

    private static int Lxb(com.bytedance.sdk.openadsdk.core.model.lk lkVar) {
        if (lkVar == null) {
            return 407;
        }
        if (TextUtils.isEmpty(lkVar.Lxb())) {
            return 408;
        }
        return TextUtils.isEmpty(lkVar.lk()) ? 416 : 200;
    }

    private static int Lxb(List<com.bytedance.sdk.openadsdk.core.model.IeN> list) {
        if (list == null) {
            return 409;
        }
        if (list.size() <= 0) {
            return 410;
        }
        for (com.bytedance.sdk.openadsdk.core.model.IeN ieN : list) {
            if (ieN == null) {
                return 411;
            }
            if (TextUtils.isEmpty(ieN.Lxb())) {
                return 412;
            }
        }
        return 200;
    }

    private static void Lxb(final ArrayList<Lxb> arrayList) {
        com.bytedance.sdk.openadsdk.STP.lk.Lxb("multiple_ads_parsing_error", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.core.LD.3
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            @Nullable
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_error", arrayList.size());
                JSONArray jSONArray = new JSONArray();
                for (Lxb lxb : arrayList) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(BidResponsedEx.KEY_CID, lxb.Lxb);
                    jSONObject2.put("error_msg", lxb.LD);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("error_cid_list", jSONArray);
                return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("multiple_ads_parsing_error").LD(jSONObject.toString());
            }
        });
    }
}
