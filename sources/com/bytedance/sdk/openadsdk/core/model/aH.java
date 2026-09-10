package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.utils.CG;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.umeng.analytics.pro.bc;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class aH extends tD {
    private int Ax;
    private String BcA;
    private brP Bj;
    private JVA CG;
    private String CSn;
    private IeN DY;
    private tD.Lxb FD;
    private AdSlot FGm;
    private String FV;
    private eK FtP;
    private VVE GX;
    private String HD;
    private int HN;
    private String IG;
    private String Ivz;
    private String JD;
    public long JVA;
    private KG JZE;
    private int KOQ;
    private String KPU;
    private String Kue;
    private volatile boolean LRt;
    private int LXE;
    private KG Ld;
    private KG Lpq;
    private ZU Mvg;
    private NXR Mx;
    private boolean Njp;
    private boolean Ns;
    private int Nu;
    private int Of;
    private String Rt;
    private boolean SS;
    private String Sfi;
    private int SlV;
    private boolean Sv;
    private com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb Td;
    private JSONObject VB;
    private long VU;
    private int VVE;
    private int Vs;
    private int Wi;
    private int Yc;
    private boolean ZE;
    private String Zg;
    private int aE;
    private String ae;
    private int brP;
    private String cR;
    private JSONObject cf;
    private int chu;
    private int ek;
    private String fG;
    private String foI;
    private com.bytedance.sdk.openadsdk.core.sLN.Lxb goy;
    private lk hg;
    private sLN iC;
    private String id;
    private id kRz;
    private HD kVf;
    private int kqm;
    private boolean lJ;
    private String le;
    private String mOF;
    private com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb mW;
    private int mb;
    private int mhk;
    private int nE;
    private String nH;
    private int nJ;
    private boolean nYy;
    private String op;
    private int pyu;
    private boolean qEi;
    private boolean qK;
    private int rK;
    private String rW;
    private String ro;
    private int sRq;
    private IeN tD;
    private JXs uTT;
    private boolean uxf;
    private JSONObject wCT;
    private int wPa;
    private String wVL;
    private Map<String, Object> wbY;
    private JSONObject xr;
    private final List<IeN> sLN = new ArrayList();
    private final List<String> NXR = new ArrayList();
    private final List<FilterWord> STP = new ArrayList();
    private final CG IeN = CG.lk();
    public boolean nBu = false;
    private List<String> eK = new ArrayList();
    private List<String> aH = new ArrayList();
    private String xan = "0";
    private String Pw = "";
    private int dR = 0;
    private int NDz = 2;
    private int JJ = 0;
    private int bG = 0;
    private int jeq = 1;
    private QAg MGT = new QAg();
    private int nTb = -200;
    private int Lv = 0;
    private int oc = 1;
    private int gS = 0;
    private int Hu = 0;
    private int AcC = 0;
    private int Za = 1;
    private int bm = 1;
    private float eXY = 100.0f;
    private int Iyd = 2;
    private int owi = 1;
    private int TA = 0;
    private int Bg = -1;
    private long tv = -1;
    private int Pd = 0;
    private boolean xNP = false;
    private int JP = 0;
    private int uao = 50;
    private int BK = -1;
    private com.bytedance.sdk.openadsdk.eK.Lxb.LD RC = null;

    private com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb DhR() {
        tD.Lxb lxbRW = rW();
        if (lxbRW == null) {
            return null;
        }
        return tD.Lxb.LD(lxbRW, String.valueOf(Td()));
    }

    public static boolean ebl(tD tDVar) {
        if (tDVar == null) {
            return false;
        }
        int iFGm = tDVar.FGm();
        return tDVar.chu() || iFGm == 5 || iFGm == 15 || iFGm == 50;
    }

    private static double lc(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    private com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb xq() {
        id idVarDR = dR();
        if (idVarDR == null) {
            return null;
        }
        return new com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb().Lxb(idVarDR.Lxb()).LD(idVarDR.LD()).lk(idVarDR.lk()).ZU(idVarDR.ZU()).JXs(Td() + "_v3");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public JSONObject AcC() {
        return this.wCT;
    }

    public String Aj() {
        return this.Ivz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String Ax() {
        return this.op;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void BK() {
        this.IeN.JXs();
        ebl(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int BcA() {
        return this.LXE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public com.bytedance.sdk.component.QAg.LD.Lxb Bg() {
        com.bytedance.sdk.component.QAg.LD.Lxb lxb = new com.bytedance.sdk.component.QAg.LD.Lxb();
        lxb.Lxb(this.LXE);
        lxb.LD(this.xan);
        lxb.Lxb(Lv());
        return lxb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean Bj() {
        return this.KOQ == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int CG() {
        return this.nTb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int CSn() {
        return this.AcC;
    }

    public com.bytedance.sdk.component.adexpress.Lxb.lk.ZU Cjl() {
        tD.Lxb lxbRW = rW();
        if (lxbRW == null) {
            return null;
        }
        return tD.Lxb.Lxb(lxbRW, String.valueOf(Td()));
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int DY() {
        return this.Iyd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean FA() {
        return this.LD;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String FD() {
        return this.CSn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int FGm() {
        return this.nJ;
    }

    public int FUL() {
        return this.aE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean FV() {
        return !chu() && jo() == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void FtP() {
        this.LRt = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String GX() {
        return this.IG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int HD() {
        return this.dR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public KG HN() {
        return this.Lpq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public Map<String, Object> Hu() {
        return this.wbY;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean IG() {
        return lJ() == 8;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean II() {
        return this.Lxb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public long IeN() {
        ZU zu = this.Mvg;
        if (zu == null) {
            return 0L;
        }
        return zu.lk();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int Ivz() {
        return this.Hu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean Iyd() {
        return this.Pd == 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public JSONObject JD() {
        Object objLk;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interaction_type", sRq());
            jSONObject.put(tD.ZU, OR());
            jSONObject.put("interaction_method", brP());
            jSONObject.put(tD.lk, FUL());
            jSONObject.put(tD.JXs, JZE());
            jSONObject.put("target_url", Sv());
            jSONObject.put("app_log_url", jeq());
            jSONObject.put("gecko_id", oc());
            jSONObject.put("extension", ek());
            jSONObject.put("ad_id", bG());
            jSONObject.put("source", VU());
            jSONObject.put("app_name", Aj());
            jSONObject.put("screenshot", gS());
            jSONObject.put("dislike_control", jo());
            jSONObject.put("play_bar_show_time", CG());
            jSONObject.put("play_bar_style", nE());
            jSONObject.put("if_block_lp", foF());
            jSONObject.put("cache_sort", UQi());
            jSONObject.put("if_sp_cache", OCL());
            jSONObject.put("render_control", eK());
            jSONObject.put("mrc_report", this.KOQ);
            jSONObject.put("isMrcReportFinish", this.LRt);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cta", DY());
            jSONObject2.put("other", tD());
            jSONObject.put("set_click_type", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(CampaignEx.JSON_KEY_REWARD_NAME, Sfi());
            jSONObject3.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, HD());
            jSONObject.put("reward_data", jSONObject3);
            if (!TextUtils.isEmpty(lc()) && !TextUtils.isEmpty(ebl())) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("adchoices_icon", lc());
                jSONObject4.put("adchoices_url", ebl());
                jSONObject.put("dsp_adchoices", jSONObject4);
            }
            IeN ieNLpq = Lpq();
            if (ieNLpq != null && !TextUtils.isEmpty(ieNLpq.Lxb())) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("url", ieNLpq.Lxb());
                jSONObject5.put("height", ieNLpq.lk());
                jSONObject5.put("width", ieNLpq.LD());
                jSONObject.put(RewardPlus.ICON, jSONObject5);
            }
            IeN ieNNs = Ns();
            if (ieNNs != null && !TextUtils.isEmpty(ieNNs.Lxb())) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("url", ieNNs.Lxb());
                jSONObject6.put("height", ieNNs.lk());
                jSONObject6.put("width", ieNNs.LD());
                jSONObject.put("cover_image", jSONObject6);
            }
            Object objAcC = AcC();
            if (objAcC != null) {
                jSONObject.put("session_params", objAcC);
            }
            QAg qAgXan = xan();
            if (qAgXan != null) {
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("click_upper_content_area", qAgXan.Lxb);
                jSONObject7.put("click_upper_non_content_area", qAgXan.LD);
                jSONObject7.put("click_lower_content_area", qAgXan.lk);
                jSONObject7.put("click_lower_non_content_area", qAgXan.ZU);
                jSONObject7.put("click_button_area", qAgXan.JXs);
                jSONObject7.put("click_video_area", qAgXan.lc);
                jSONObject.put("click_area", jSONObject7);
            }
            JXs jXsJVA = JVA();
            if (jXsJVA != null) {
                jSONObject.put("arbitrage_interceptor_params", jXsJVA.OY());
            }
            AdSlot adSlotHg = hg();
            if (adSlotHg != null) {
                jSONObject.put("adslot", adSlotHg.toJsonObj());
            }
            List<IeN> listUxf = uxf();
            if (listUxf != null) {
                JSONArray jSONArray = new JSONArray();
                for (IeN ieN : listUxf) {
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put("url", ieN.Lxb());
                    jSONObject8.put("height", ieN.lk());
                    jSONObject8.put("width", ieN.LD());
                    jSONObject8.put("image_preview", ieN.lc());
                    jSONObject8.put("image_key", ieN.ebl());
                    jSONArray.put(jSONObject8);
                }
                jSONObject.put("image", jSONArray);
            }
            List<String> listSS = SS();
            if (listSS != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it = listSS.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next());
                }
                jSONObject.put("show_url", jSONArray2);
            }
            List<String> listLXE = LXE();
            if (listLXE != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator<String> it2 = listLXE.iterator();
                while (it2.hasNext()) {
                    jSONArray3.put(it2.next());
                }
                jSONObject.put(CampaignEx.JSON_KEY_CLICK_URL, jSONArray3);
            }
            List<String> listWbY = wbY();
            if (listWbY != null) {
                JSONArray jSONArray4 = new JSONArray();
                Iterator<String> it3 = listWbY.iterator();
                while (it3.hasNext()) {
                    jSONArray4.put(it3.next());
                }
                jSONObject.put("play_start", jSONArray4);
            }
            jSONObject.put("phone_num", Nu());
            jSONObject.put(CampaignEx.JSON_KEY_TITLE, FD());
            jSONObject.put("description", ae());
            jSONObject.put("ext", Lv());
            jSONObject.put("image_mode", FGm());
            jSONObject.put("cover_click_area", lm());
            jSONObject.put("intercept_flag", cRD());
            jSONObject.put("button_text", xr());
            jSONObject.put("ad_logo", dm());
            jSONObject.put("video_adaptation", Ivz());
            jSONObject.put("feed_video_opentype", CSn());
            jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, wCT());
            jSONObject.put("aspect_ratio", Za());
            lk lkVarMGT = MGT();
            if (lkVarMGT != null) {
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("app_name", lkVarMGT.LD());
                jSONObject9.put("package_name", lkVarMGT.lk());
                jSONObject9.put(DownloadModel.DOWNLOAD_URL, lkVarMGT.Lxb());
                jSONObject9.put("score", lkVarMGT.ZU());
                jSONObject9.put("comment_num", lkVarMGT.JXs());
                jSONObject9.put(CampaignEx.JSON_KEY_APP_SIZE, lkVarMGT.lc());
                jSONObject9.put("app_category", lkVarMGT.ebl());
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject9);
            }
            JVA jvaNTb = nTb();
            if (jvaNTb != null) {
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put("deeplink_url", jvaNTb.Lxb());
                jSONObject10.put("fallback_url", jvaNTb.LD());
                jSONObject10.put("fallback_type", jvaNTb.lk());
                jSONObject.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, jSONObject10);
            }
            HD hdWVT = wVT();
            if (hdWVT != null && (objLk = hdWVT.lk()) != null) {
                jSONObject.put("oem", objLk);
            }
            List<FilterWord> listWi = Wi();
            if (listWi != null) {
                JSONArray jSONArray5 = new JSONArray();
                Iterator<FilterWord> it4 = listWi.iterator();
                while (it4.hasNext()) {
                    JSONObject jSONObjectLD = LD(it4.next());
                    if (jSONObjectLD != null) {
                        jSONArray5.put(jSONObjectLD);
                    }
                }
                jSONObject.put("filter_words", jSONArray5);
            }
            VVE().Lxb(jSONObject);
            jSONObject.put("count_down", TbN());
            jSONObject.put("expiration_time", ro());
            KG kgHN = HN();
            if (kgHN != null) {
                jSONObject.put("video", kgHN.c());
            }
            KG kgRK = rK();
            if (kgRK != null) {
                jSONObject.put("h265_video", kgRK.c());
            }
            jSONObject.put("video_encode_type", Zg());
            JSONObject jSONObject11 = new JSONObject();
            jSONObject11.put("if_send_click", NDz());
            jSONObject.put("download_conf", jSONObject11);
            if (Hu() != null) {
                JSONObject jSONObject12 = new JSONObject();
                Set<Map.Entry<String, Object>> setEntrySet = Hu().entrySet();
                if (!setEntrySet.isEmpty()) {
                    for (Map.Entry<String, Object> entry : setEntrySet) {
                        jSONObject12.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONObject.put("media_ext", jSONObject12);
            }
            tD.Lxb lxbRW = rW();
            if (lxbRW != null) {
                JSONObject jSONObject13 = new JSONObject();
                jSONObject13.put("id", lxbRW.lc());
                jSONObject13.put("md5", lxbRW.ebl());
                jSONObject13.put("url", lxbRW.OY());
                jSONObject13.put("data", lxbRW.QAg());
                jSONObject13.put("diff_data", lxbRW.nBu());
                jSONObject13.put("version", lxbRW.JXs());
                jSONObject13.put("dynamic_creative", lxbRW.JVA());
                jSONObject13.put("engine_version", lxbRW.NXR());
                jSONObject13.put("ugen_data", lxbRW.kqm());
                jSONObject13.put("ugen_md5", lxbRW.VVE());
                jSONObject13.put("ugen_url", lxbRW.IeN());
                jSONObject.put("tpl_info", jSONObject13);
            }
            id idVar = this.kRz;
            if (idVar != null) {
                jSONObject.put("tpl_info_v3", idVar.lc());
            }
            jSONObject.put("dynamic_creative", YKq());
            jSONObject.put("creative_extra", nJ());
            jSONObject.put("market_url", tW());
            jSONObject.put("auction_price", KPU());
            jSONObject.put("ad_info", JW());
            jSONObject.put("is_package_open", bm());
            jSONObject.put("playable_duration_time", Rt());
            jSONObject.put("playable_endcard_close_time", pyu());
            jSONObject.put("endcard_close_time", mb());
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put("render_sequence", id());
            jSONObject14.put("backup_render_control", foI());
            jSONObject14.put("reserve_time", nH());
            jSONObject14.put("render_thread", VB());
            jSONObject.put("render", jSONObject14);
            if (this.Bj == null) {
                brP brp = new brP();
                this.Bj = brp;
                brp.Lxb("");
                this.Bj.Lxb(10L);
                this.Bj.LD(20L);
                this.Bj.lk(10L);
                this.Bj.ZU(20L);
            }
            JSONObject jSONObject15 = new JSONObject();
            jSONObject15.put("onlylp_loading_maxtime", this.Bj.Lxb());
            jSONObject15.put("straight_lp_showtime", this.Bj.LD());
            jSONObject15.put("onlyagg_loading_maxtime", this.Bj.lk());
            jSONObject15.put("straight_agg_showtime", this.Bj.ZU());
            jSONObject15.put("loading_text", this.Bj.JXs());
            VVE vve = this.GX;
            if (vve != null) {
                jSONObject15 = vve.Lxb(jSONObject15);
            }
            jSONObject.put("interaction_method_params", jSONObject15);
            JSONObject jSONObject16 = new JSONObject();
            jSONObject16.put("splash_clickarea", NXR());
            jSONObject16.put("splash_layout_id", STP());
            jSONObject16.put("load_wait_time", IeN());
            jSONObject.put("splash_control", jSONObject16);
            if (Iyd()) {
                jSONObject.put("dsp_html", this.nH);
            }
            if (chu()) {
                jSONObject.put("vast_json", this.goy.nBu());
            }
            jSONObject.put("dsp_material_type", qK());
            jSONObject.put("deep_link_appname", this.KPU);
            jSONObject.put("landing_page_download_clicktype", this.nE);
            NXR nxr = this.Mx;
            if (nxr != null) {
                jSONObject.put("dsp_style", nxr.JXs());
            }
            jSONObject.put("jump_probability", this.Vs);
            jSONObject.put("identificationOverlayContent", this.cR);
            if (this.mW != null) {
                JSONObject jSONObject17 = new JSONObject();
                jSONObject17.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.mW.Lxb(this.Td));
                jSONObject.put("ugen", jSONObject17);
            }
            jSONObject.put("preload_h5_type", XM());
            jSONObject.put("hasReportShow", this.ZE);
            jSONObject.put("endcard_creative", this.Kue);
            jSONObject.put("image_stay", this.mhk);
            JSONObject jSONObject18 = new JSONObject();
            jSONObject18.put("enable", this.lc);
            jSONObject18.put("wait_time", this.ebl);
            jSONObject18.put("label", this.OY);
            jSONObject.put("ev", jSONObject18);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void JJ(int i) {
        this.mhk = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean JP() {
        return hg() != null && hg().getDurationSlotType() == 8 && Iyd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public JXs JVA() {
        return this.uTT;
    }

    public String JW() {
        return this.Rt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean JXs() {
        return this.Sv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int JZE() {
        return this.Ax;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public NXR KOQ() {
        return this.Mx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void KPU(String str) {
        this.Kue = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public CG Kue() {
        return this.IeN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void LD(boolean z) {
        this.Sv = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int LRt() {
        return this.Nu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public List<String> LXE() {
        return this.aH;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean LYC() {
        return this.Njp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean Ld() {
        return this.aE == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public IeN Lpq() {
        return this.tD;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String Lv() {
        return this.rW;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(boolean z) {
        this.Ns = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public lk MGT() {
        return this.hg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean MH() {
        if (this.Bg <= 0) {
            this.Bg = lJ();
        }
        int i = this.Bg;
        return (i == 7 || i == 8) && !ebl(this) && brP() != 21 && this.mhk == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public JSONObject Mvg() {
        if (this.xr == null) {
            try {
                if (!TextUtils.isEmpty(this.rW)) {
                    this.xr = new JSONObject(this.rW);
                }
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("MaterialMeta", e.getMessage());
            }
        }
        return this.xr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String Mx() {
        return this.KPU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void NDz(int i) {
        this.uao = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int NXR() {
        ZU zu = this.Mvg;
        if (zu == null) {
            return 2;
        }
        return zu.Lxb();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean Njp() {
        int iLD;
        if (!wVL()) {
            int iNextInt = new Random().nextInt(100);
            if (chu()) {
                NXR nxr = this.Mx;
                if (nxr != null) {
                    iLD = nxr.LD();
                } else {
                    iLD = 0;
                }
            } else if (eK.LD(this)) {
                iLD = 0;
            } else {
                iLD = this.Vs;
            }
            if (iNextInt < iLD) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public IeN Ns() {
        return this.DY;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String Nu() {
        return this.HD;
    }

    public int OCL() {
        return this.wPa;
    }

    public int OR() {
        return this.Yc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean OY() {
        return (TextUtils.isEmpty(lc()) || TextUtils.isEmpty(ebl())) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean Of() {
        return this.Yc == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public long Pd() {
        if (this.tv < 0) {
            JSONObject jSONObjectMvg = Mvg();
            if (jSONObjectMvg != null) {
                this.tv = jSONObjectMvg.optLong("ad_id", 0L);
            } else {
                this.tv = 0L;
            }
        }
        return this.tv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Pw(int i) {
        this.Vs = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public brP QAg() {
        return this.Bj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void RC() {
        KG kg = this.Ld;
        if (kg == null || TextUtils.isEmpty(kg.h)) {
            return;
        }
        try {
            if (!this.Ld.h.contains("style_id")) {
                this.qEi = false;
            } else {
                this.qEi = true;
                this.IG = Uri.parse(this.Ld.h).getQueryParameters("style_id").get(0);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.LD(th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public com.bytedance.sdk.openadsdk.eK.Lxb.LD Rp() {
        return this.RC;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int Rt() {
        int i = this.mb;
        if (i > 0) {
            return i;
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public List<String> SS() {
        return this.eK;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int STP() {
        if (kVf()) {
            return 5;
        }
        if (Iyd()) {
            return 4;
        }
        ZU zu = this.Mvg;
        if (zu == null) {
            return 1;
        }
        return zu.LD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String Sfi() {
        return this.Pw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public com.bytedance.sdk.openadsdk.core.sLN.Lxb SlV() {
        return this.goy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String Sv() {
        return this.Sfi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int TA() {
        JSONObject jSONObject = this.VB;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    public int TbN() {
        return this.sRq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int Td() {
        JSONObject jSONObjectMvg = Mvg();
        if (jSONObjectMvg != null) {
            return jSONObjectMvg.optInt("rit", 0);
        }
        return 0;
    }

    public int UQi() {
        return this.Za;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int VB() {
        return this.rK;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String VU() {
        return this.le;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public eK VVE() {
        return this.FtP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean Vs() {
        return lJ() == 3 || lJ() == 4;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public List<FilterWord> Wi() {
        return this.STP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int XM() {
        return this.JP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Xp() {
        this.qK = true;
    }

    public JSONObject YKq() {
        return this.cf;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int YUS() {
        return this.uao;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean YZq() {
        return this.qK;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean Yc() {
        return this.nBu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb Yw() {
        return this.mW;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean ZE() {
        NXR nxr;
        return chu() && !wVL() && (nxr = this.Mx) != null && nxr.Lxb() == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean ZU() {
        return this.Ns;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public float Za() {
        if (this.eXY <= 0.0f) {
            this.eXY = 100.0f;
        }
        return (this.eXY * 1000.0f) / 1000.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int Zg() {
        return this.ek;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int aBz() {
        try {
            JSONObject jSONObjectMvg = Mvg();
            if (jSONObjectMvg != null) {
                return jSONObjectMvg.optInt("rec_clk", 0);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean aE() {
        return this.lJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean aH() {
        return this.gS == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void aHr() {
        this.nYy = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String ae() {
        return this.id;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String bG() {
        return this.xan;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int bm() {
        return this.pyu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int brP() {
        return this.brP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean cFD() {
        return this.qEi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean cR() {
        return lJ() == 7;
    }

    public int cRD() {
        return this.Wi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    @Nullable
    public String cf() {
        lk lkVarMGT = MGT();
        if (lkVarMGT == null || TextUtils.isEmpty(lkVarMGT.Lxb())) {
            return null;
        }
        return lkVarMGT.Lxb();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean chu() {
        int i = this.Pd;
        return (i == 1 || i == 3) && SlV() != null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void dR(int i) {
        this.JP = i;
    }

    public int dm() {
        return this.oc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int eK() {
        int i = this.kqm;
        if (i == 5 || i == 6 || i == 33) {
            return 1;
        }
        if (JP()) {
            return 2;
        }
        return this.NDz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean eXY() {
        return this.xNP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public JSONObject ek() {
        return this.VB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int eof() {
        if (this.BK < 0) {
            try {
                JSONObject jSONObjectMvg = Mvg();
                if (jSONObjectMvg != null) {
                    this.BK = jSONObjectMvg.optInt("is_drop_to_retargeting_sample", 0);
                } else {
                    this.BK = 0;
                }
            } catch (Throwable unused) {
                this.BK = 0;
            }
        }
        return this.BK;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean eq() {
        return this.lc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            tD tDVar = (tD) obj;
            if (this.xan.equals(tDVar.bG()) && this.rW.equals(tDVar.Lv())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int fG() {
        return this.nE;
    }

    public int foF() {
        return this.gS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void foI(String str) {
        this.cR = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean gS() {
        return this.SS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean goy() {
        return this.LRt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public AdSlot hg() {
        return this.FGm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public JSONObject iC() {
        JSONObject jSONObjectJD = JD();
        JSONObject jSONObjectBrP = com.bytedance.sdk.openadsdk.core.settings.VVE.TA().brP(String.valueOf(Td()));
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObjectJD);
            jSONObject.put("creatives", jSONArray);
            jSONObject.put("did", 1);
            jSONObject.put("processing_time_ms", 100);
            jSONObject.put("request_id", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject.put("s_receive_ts", 1);
            jSONObject.put("s_send_ts", 1);
            jSONObject.put("status_code", 20000);
            jSONObject.put("core_settings", jSONObjectBrP);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("MaterialMeta", "toJsonObjPlus", e.getMessage());
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String iQi() {
        return this.Kue;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void id(String str) {
        this.op = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String jeq() {
        return this.BcA;
    }

    public int jo() {
        return this.JJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public double kRz() {
        return lc(Mvg());
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean kVf() {
        List<Integer> listLk;
        return (rW() == null || (listLk = rW().lk()) == null || !listLk.contains(57)) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int kqm() {
        return this.kqm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int lJ() {
        if (this.Bg < 0) {
            JSONObject jSONObjectMvg = Mvg();
            if (jSONObjectMvg != null) {
                this.Bg = jSONObjectMvg.optInt("ad_slot_type", 0);
            } else {
                this.Bg = 0;
            }
        }
        return this.Bg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean le() {
        return lm() == 100 || this.kqm == 20;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lk(boolean z) {
        this.uxf = z;
    }

    public int lm() {
        return this.Of;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean mOF() {
        KG kg = this.Ld;
        return kg == null || kg.m != 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean mW() {
        return lJ() == 5;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int mb() {
        return this.SlV;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public long mhk() {
        return this.JVA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int mu() {
        Map<String, Object> map = this.wbY;
        if (map == null) {
            return 0;
        }
        try {
            Object obj = map.get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null) {
                return Integer.parseInt(obj.toString());
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public VVE nBu() {
        return this.GX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int nE() {
        if (chu()) {
            return 5;
        }
        if (Za() != 100.0f || eK() == 2) {
            return 0;
        }
        return this.Lv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int nH() {
        return this.HN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String nJ() {
        return this.ae;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int nP() {
        return this.ebl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public JVA nTb() {
        return this.CG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean nYy() {
        int i = this.kqm;
        return (i == 2 || i == 1) && 3 == this.VVE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb nrJ() {
        return this.Td;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String oc() {
        return this.JD;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean oo() {
        return this.nYy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int op() {
        return this.Bg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String owi() {
        return this.nH;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int pyu() {
        return this.chu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean qEi() {
        return lJ() == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int qK() {
        return this.Pd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public KG rK() {
        return this.JZE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String rO() {
        JSONObject jSONObjectMvg;
        if (this.wVL == null && (jSONObjectMvg = Mvg()) != null) {
            this.wVL = jSONObjectMvg.optString(BidResponsedEx.KEY_CID, "");
        }
        return this.wVL;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public tD.Lxb rW() {
        return this.FD;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public long ro() {
        return this.VU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public ZU sLN() {
        return this.Mvg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int sRq() {
        return this.VVE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int tD() {
        return this.owi;
    }

    public String tW() {
        return this.ro;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int tv() {
        return this.TA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String uTT() {
        return this.cR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean uao() {
        if (chu() && !wVL()) {
            int iNextInt = new Random().nextInt(100);
            NXR nxr = this.Mx;
            if (nxr != null && iNextInt < nxr.lk()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public List<IeN> uxf() {
        return this.sLN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String vSG() {
        return this.OY;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int wCT() {
        if (this.bm != 2) {
            this.bm = 1;
        }
        return this.bm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean wPa() {
        if (this.sLN.isEmpty()) {
            return false;
        }
        if (this.nJ == 4 && this.sLN.size() < 3) {
            return false;
        }
        Iterator<IeN> it = this.sLN.iterator();
        while (it.hasNext()) {
            if (!it.next().JXs()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean wVL() {
        return this.IeN.Lxb > 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public HD wVT() {
        return this.kVf;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public List<String> wbY() {
        return this.NXR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String xNP() {
        JSONObject jSONObjectMvg;
        String strOptString = this.Zg;
        if (TextUtils.isEmpty(strOptString) && (jSONObjectMvg = Mvg()) != null) {
            strOptString = jSONObjectMvg.optString("req_id", "");
            nE(strOptString);
        }
        return strOptString == null ? "" : strOptString;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public QAg xan() {
        return this.MGT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String xr() {
        if (!TextUtils.isEmpty(this.foI)) {
            return this.foI;
        }
        Context contextLxb = com.bytedance.sdk.openadsdk.core.kqm.Lxb();
        int iSRq = sRq();
        if (iSRq != 2 && iSRq != 3) {
            if (iSRq == 4) {
                return contextLxb != null ? com.bytedance.sdk.component.utils.tD.Lxb(contextLxb, "tt_video_download_apk") : this.foI;
            }
            if (iSRq != 8) {
                return this.foI;
            }
        }
        return contextLxb != null ? com.bytedance.sdk.component.utils.tD.Lxb(contextLxb, "tt_video_mobile_go_detail") : this.foI;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean zqY() {
        return this.ZE;
    }

    private String xan(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return com.bytedance.sdk.component.JXs.lk.lk.lk.Lxb(str);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("MaterialMeta", "generate icon key error", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void BcA(int i) {
        this.nE = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void CG(int i) {
        this.Nu = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void CSn(int i) {
        this.JJ = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void DY(int i) {
        this.aE = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void HD(int i) {
        this.nJ = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void IeN(int i) {
        this.wPa = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Ivz(int i) {
        this.SlV = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public KG JJ() {
        return this.Ld;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void JVA(int i) {
        this.Lv = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void JXs(String str) {
        this.fG = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String KPU() {
        return this.FV;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void LD(com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb lxb) {
        this.Td = lxb;
        com.bytedance.sdk.openadsdk.core.JVA.Lxb.LD.Lxb().Lxb(lxb, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(JXs jXs) {
        this.uTT = jXs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int NDz() {
        sLN sln = this.iC;
        if (sln == null) {
            return 0;
        }
        return sln.Lxb();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void NXR(int i) {
        this.nTb = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void OY(boolean z) {
        this.ZE = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean Pw() {
        tD.Lxb lxb = this.FD;
        if (lxb != null) {
            return !TextUtils.isEmpty(lxb.NXR());
        }
        int i = this.bG;
        return i == 9 || i == 10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void QAg(boolean z) {
        this.Njp = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Sfi(int i) {
        this.Ax = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void VU(int i) {
        if (i < 0 || i > 30) {
            i = 6;
        }
        this.ebl = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void VVE(int i) {
        this.Of = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void ZU(int i) {
        this.NDz = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void aH(int i) {
        this.bm = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void brP(int i) {
        this.Yc = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public id dR() {
        return this.kRz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int foI() {
        return this.jeq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void hg(int i) {
        this.rK = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int id() {
        return this.bG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void kqm(int i) {
        this.LXE = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String lc() {
        return this.fG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void le(int i) {
        this.ek = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lk(int i) {
        this.dR = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void nBu(int i) {
        this.oc = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void nJ(int i) {
        this.TA = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void rW(int i) {
        this.Pd = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void sLN(int i) {
        this.Wi = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void tD(int i) {
        this.VVE = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String CSn(String str) {
        JSONObject jSONObjectMvg = Mvg();
        return jSONObjectMvg != null ? jSONObjectMvg.optString("rit", str) : str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void DY(String str) {
        this.rW = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void HD(String str) {
        this.ro = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void IeN(String str) {
        this.CSn = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Ivz(String str) {
        if (TextUtils.isEmpty(str)) {
            this.OY = com.bytedance.sdk.openadsdk.eK.Lxb.lk.lk;
        } else {
            this.OY = str;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void JVA(String str) {
        this.le = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void JXs(int i) {
        this.gS = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void KPU(int i) {
        this.chu = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(brP brp) {
        this.Bj = brp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void NXR(String str) {
        this.Sfi = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void OY(String str) {
        this.Rt = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void QAg(String str) {
        this.FV = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Sfi(String str) {
        this.JD = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void VVE(String str) {
        this.id = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void ZU(boolean z) {
        this.SS = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void aH(String str) {
        this.KPU = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void brP(String str) {
        this.xan = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String ebl() {
        return this.mOF;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void foI(int i) {
        this.mb = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void id(int i) {
        this.pyu = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void kqm(String str) {
        this.foI = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lc(String str) {
        this.mOF = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lk(IeN ieN) {
        this.sLN.add(ieN);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void nBu(String str) {
        this.ae = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void sLN(String str) {
        this.Ivz = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void tD(String str) {
        this.BcA = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void JVA(boolean z) {
        this.lc = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void JXs(JSONObject jSONObject) {
        this.VB = jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void LD(int i) {
        this.kqm = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(VVE vve) {
        this.GX = vve;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void OY(int i) {
        this.jeq = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void QAg(int i) {
        this.Hu = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void STP(int i) {
        this.Za = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void ZU(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.VVE = 4;
        this.xan = jSONObject.optString("id");
        this.le = jSONObject.optString("source");
        lk lkVar = new lk();
        this.hg = lkVar;
        lkVar.lk(jSONObject.optString("pkg_name"));
        this.hg.LD(jSONObject.optString("name"));
        this.hg.Lxb(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void eK(int i) {
        this.sRq = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void ebl(boolean z) {
        this.lJ = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lc(int i) {
        this.AcC = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lk(JSONObject jSONObject) {
        this.wCT = jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void nBu(boolean z) {
        this.LD = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void nE(int i) {
        this.KOQ = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void JXs(boolean z) {
        this.xNP = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void LD(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.Iyd = 2;
        } else {
            this.Iyd = (int) d;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb lxb) {
        this.mW = lxb;
        com.bytedance.sdk.openadsdk.core.JVA.Lxb.LD.Lxb().Lxb(lxb, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void STP(String str) {
        this.HD = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void eK(String str) {
        this.nH = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void ebl(String str) {
        this.Pw = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lc(boolean z) {
        this.nBu = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lk(KG kg) {
        this.JZE = kg;
    }

    public void nE(String str) {
        this.Zg = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void xan(int i) {
        this.HN = Math.max(0, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void ebl(int i) {
        this.bG = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lk(long j) {
        this.JVA = j;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void LD(JSONObject jSONObject) {
        this.cf = jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(ZU zu) {
        this.Mvg = zu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void LD(IeN ieN) {
        this.DY = ieN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(eK eKVar) {
        this.FtP = eKVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void LD(long j) {
        this.VU = j;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(int i) {
        Lxb(i, -1);
    }

    private JSONObject LD(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(LD(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(int i, int i2) {
        this.brP = i;
        this.kqm = i;
        if (this.FGm == null) {
            this.kqm = 0;
            return;
        }
        if (i2 <= 0) {
            i2 = lJ();
        }
        if (this.FGm.getNativeAdType() != 3 && this.FGm.getDurationSlotType() != 3 && i2 != 3) {
            if (this.FGm.getNativeAdType() != 7 && this.FGm.getNativeAdType() != 8 && this.FGm.getDurationSlotType() != 7 && this.FGm.getDurationSlotType() != 8 && i2 != 7 && i2 != 8) {
                if (eK.LD(this)) {
                    this.kqm = 4;
                    return;
                }
                if (this.brP == 4 && !eK.LD(this)) {
                    this.kqm = 0;
                }
                if (i >= 5) {
                    this.kqm = 0;
                    return;
                }
                if (this.brP == 2 && sRq() != 3) {
                    this.kqm = 0;
                    return;
                } else {
                    if (i == 0 || (i == 1 && sRq() != 3)) {
                        this.kqm = 0;
                        return;
                    }
                    return;
                }
            }
            if (eK.lk(this)) {
                this.kqm = 12;
                return;
            }
            if (eK.LD(this)) {
                this.kqm = 9;
                return;
            }
            if (this.brP == 5 && !kqm.ZU(this)) {
                this.kqm = 7;
            }
            if (this.brP == 6 && !kqm.LD(this)) {
                this.kqm = 7;
            }
            if (this.brP == 8 && lm() != 100) {
                this.kqm = 7;
            }
            if (this.brP == 19 && TextUtils.isEmpty(this.Sfi)) {
                this.kqm = 7;
            }
            if (this.brP == 20 && TextUtils.isEmpty(this.Sfi)) {
                this.kqm = 7;
            }
            if (this.brP == 38 && !kqm.lk(this)) {
                this.kqm = 7;
            }
            if (i < 5) {
                this.kqm = 7;
                return;
            }
            return;
        }
        this.kqm = 14;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void LD(KG kg) {
        this.Lpq = kg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.owi = 1;
        } else {
            this.owi = (int) d;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(QAg qAg) {
        this.MGT = qAg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(AdSlot adSlot) {
        this.FGm = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(tD.Lxb lxb) {
        this.FD = lxb;
        com.bytedance.sdk.component.adexpress.Lxb.lk.ZU zuCjl = Cjl();
        if (zuCjl != null && !Pw()) {
            com.bytedance.sdk.component.adexpress.Lxb.LD.LD.Lxb(zuCjl);
        }
        if (lxb == null || TextUtils.isEmpty(lxb.IeN())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.JVA.Lxb.LD.Lxb().Lxb(DhR(), bc.aC);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(id idVar) {
        this.kRz = idVar;
        if (idVar == null || TextUtils.isEmpty(idVar.lk())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.JVA.Lxb.LD.Lxb().Lxb(xq(), "adv3");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(KG kg) {
        this.Ld = kg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(sLN sln) {
        this.iC = sln;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(IeN ieN) {
        Lxb(ieN, tD.QAg);
        String strXan = xan(ieN.Lxb());
        if (!TextUtils.isEmpty(strXan)) {
            ieN.LD(strXan);
        }
        this.tD = ieN;
    }

    private void Lxb(IeN ieN, int i) {
        if (ieN != null) {
            try {
                if (TextUtils.isEmpty(ieN.Lxb())) {
                    return;
                }
                if (ieN.LD() == 0 && ieN.lk() == 0) {
                    ieN.Lxb(i);
                    ieN.LD(i);
                    return;
                }
                if (ieN.LD() == 0) {
                    if (ieN.lk() > i) {
                        ieN.LD(i);
                        ieN.Lxb(i);
                        return;
                    } else {
                        ieN.Lxb(ieN.lk());
                        return;
                    }
                }
                if (ieN.lk() == 0) {
                    if (ieN.LD() > i) {
                        ieN.LD(i);
                        ieN.Lxb(i);
                        return;
                    } else {
                        ieN.LD(ieN.LD());
                        return;
                    }
                }
                if (ieN.LD() > ieN.lk()) {
                    if (ieN.LD() > i) {
                        ieN.LD((int) (i / (ieN.LD() / ieN.lk())));
                        ieN.Lxb(i);
                        return;
                    }
                    return;
                }
                if (ieN.lk() > i) {
                    ieN.Lxb((int) (i * (ieN.LD() / ieN.lk())));
                    ieN.LD(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(lk lkVar) {
        this.hg = lkVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(JVA jva) {
        this.CG = jva;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(FilterWord filterWord) {
        this.STP.add(filterWord);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(Map<String, Object> map) {
        this.wbY = map;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(float f) {
        this.eXY = f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(com.bytedance.sdk.openadsdk.core.sLN.Lxb lxb) {
        this.goy = lxb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(NXR nxr) {
        this.Mx = nxr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(HD hd) {
        this.kVf = hd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(com.bytedance.sdk.openadsdk.eK.Lxb.LD ld) {
        this.RC = ld;
    }
}
