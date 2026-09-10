package com.bytedance.sdk.openadsdk.core.settings;

import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public int BcA;
    public int CG;
    public int CSn;
    public int DY;
    public int HD;
    public int IeN;
    public boolean Ivz;
    public String JJ;
    public int JVA;
    public int JXs;
    public int KPU;
    public int LD;
    public String Lxb;
    public String NDz;
    public int NXR;
    public int OY;
    public JSONObject Of;
    public int Pw;
    public int QAg;
    public int STP;
    public boolean Sfi;
    public List<OY> VU;
    public int VVE;
    public int ZU;
    public int aH;
    public int brP;
    public long dR;
    public List<String> eK;
    public int ebl;
    public int foI;
    public int hg;
    public int id;
    public int kqm;
    public int lc;
    public int le;
    public int lk;
    public int nBu;
    public boolean nE;
    public boolean nJ;
    public int rW;
    public int sLN;
    public List<OY> sRq;
    public int tD;
    public boolean xan;

    public LD(JSONObject jSONObject) {
        this.LD = 1;
        this.lk = 1;
        this.ZU = 2;
        this.JXs = 1;
        this.lc = 100;
        this.ebl = 0;
        this.OY = 2;
        this.QAg = 1;
        this.nBu = 3;
        this.JVA = 30;
        this.sLN = 30;
        this.NXR = 1;
        this.STP = 1;
        this.IeN = 2;
        this.VVE = 1500;
        this.kqm = 2;
        this.brP = 3500;
        this.tD = 0;
        this.DY = 5;
        this.Sfi = false;
        this.HD = 0;
        this.aH = 2;
        this.CSn = -1;
        this.id = 0;
        this.foI = 0;
        this.KPU = 5;
        this.Ivz = true;
        this.nE = false;
        this.xan = false;
        this.hg = 0;
        this.CG = -1;
        this.nJ = false;
        this.le = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
        this.BcA = 2;
        this.rW = 1000;
        this.Pw = 1;
        this.VU = new ArrayList();
        this.sRq = new ArrayList();
        new JSONObject();
        this.Of = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.Lxb = jSONObject.optString("code_id");
        this.LD = jSONObject.optInt("auto_play", 1);
        this.CG = jSONObject.optInt("endcard_close_time", -1);
        this.lk = jSONObject.optInt("voice_control", 1);
        this.ZU = jSONObject.optInt("rv_preload", 2);
        this.JXs = jSONObject.optInt("nv_preload", 1);
        this.lc = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.ebl = jSONObject.optInt("skip_time_displayed", 0);
        this.OY = jSONObject.optInt("video_skip_result", 2);
        this.QAg = jSONObject.optInt("reg_creative_control", 1);
        this.nBu = jSONObject.optInt("play_bar_show_time", 3);
        int iOptInt = jSONObject.optInt("rv_skip_time", 30);
        this.JVA = iOptInt;
        if (iOptInt < 0) {
            this.JVA = 30;
        }
        this.NXR = jSONObject.optInt("voice_control", 2);
        this.STP = jSONObject.optInt("if_show_win", 1);
        this.IeN = jSONObject.optInt("sp_preload", 2);
        this.VVE = jSONObject.optInt("stop_time", 1500);
        this.kqm = jSONObject.optInt("native_playable_delay", 2);
        this.brP = jSONObject.optInt("time_out_control", -1);
        this.CSn = jSONObject.optInt("playable_close_time", -1);
        this.tD = jSONObject.optInt("playable_reward_type", 0);
        this.HD = jSONObject.optInt("reward_is_callback", 0);
        int iOptInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.DY = iOptInt2;
        if (iOptInt2 < 0) {
            this.DY = 5;
        }
        Lxb(jSONObject.optJSONArray("parent_tpl_ids"));
        this.aH = jSONObject.optInt("slot_type", 2);
        this.Sfi = jSONObject.optBoolean("close_on_click", false);
        this.id = jSONObject.optInt("allow_system_back", 0);
        this.foI = jSONObject.optInt("splash_skip_time", 0);
        this.KPU = jSONObject.optInt("splash_image_count_down_time", 5);
        this.nE = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.xan = jSONObject.optBoolean("splash_close_on_click", false);
        int iOptInt3 = jSONObject.optInt("splash_load_strategy", 0);
        this.hg = iOptInt3;
        if (iOptInt3 < 0 || iOptInt3 > 1) {
            this.hg = 0;
        }
        this.Ivz = jSONObject.optBoolean("allow_mediaview_click", true);
        int iOptInt4 = jSONObject.optInt("total_time_out", MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
        this.le = iOptInt4;
        if (iOptInt4 <= 0 || iOptInt4 > 1800000) {
            this.le = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
        }
        int iOptInt5 = jSONObject.optInt("req_parallel_num", 2);
        this.BcA = iOptInt5;
        if (iOptInt5 <= 0 || iOptInt5 > 4) {
            this.BcA = 2;
        }
        this.rW = jSONObject.optInt("bidding_token_tmax", 1000);
        int iOptInt6 = jSONObject.optInt("ad_load_type", 1);
        this.Pw = iOptInt6;
        if (iOptInt6 <= 0 || iOptInt6 > 2) {
            this.Pw = 1;
        }
        boolean zOptBoolean = jSONObject.optBoolean("is_mediation", false);
        this.nJ = zOptBoolean;
        if (zOptBoolean) {
            VVE.TA().wbY();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mediation_config");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject.optString("adn_name");
                String strOptString2 = jSONObjectOptJSONObject.optString("adn_slot_id");
                int iOptInt7 = jSONObjectOptJSONObject.optInt("ad_expired_time", 3600000);
                int iOptInt8 = jSONObjectOptJSONObject.optInt("req_bidding_type", 2);
                String strOptString3 = jSONObjectOptJSONObject.optString("rit_cpm");
                int iOptInt9 = jSONObjectOptJSONObject.optInt("show_sort");
                int iOptInt10 = jSONObjectOptJSONObject.optInt("layer_time_out", 2000);
                int i2 = (iOptInt10 <= 0 || iOptInt10 > 60000) ? 2000 : iOptInt10;
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("server_params");
                if (iOptInt8 == 2) {
                    arrayList.add(new OY(strOptString, strOptString2, iOptInt7, iOptInt8, strOptString3, iOptInt9, i2, jSONObjectOptJSONObject2 == null ? "" : jSONObjectOptJSONObject2.toString()));
                } else if (iOptInt8 == 0) {
                    arrayList2.add(new OY(strOptString, strOptString2, iOptInt7, iOptInt8, strOptString3, iOptInt9, i2, jSONObjectOptJSONObject2 == null ? "" : jSONObjectOptJSONObject2.toString()));
                }
            }
            this.VU = arrayList;
            this.sRq = arrayList2;
            Collections.sort(arrayList);
            Collections.sort(this.sRq);
        }
        if (!Lxb(this.lk)) {
            this.lk = 1;
        }
        if (!Lxb(this.NXR)) {
            this.NXR = 1;
        }
        this.dR = jSONObject.optLong("waterfall_id");
        String strOptString4 = jSONObject.optString("waterfall_version");
        this.NDz = strOptString4;
        this.JJ = strOptString4;
        this.sLN = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    private static boolean Lxb(int i) {
        return i == 1 || i == 2;
    }

    public void Lxb(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.eK = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                this.eK.add(jSONArray.get(i).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }

    public LD(String str, int i) {
        this.LD = 1;
        this.lk = 1;
        this.ZU = 2;
        this.JXs = 1;
        this.lc = 100;
        this.ebl = 0;
        this.OY = 2;
        this.QAg = 1;
        this.nBu = 3;
        this.JVA = 30;
        this.sLN = 30;
        this.NXR = 1;
        this.STP = 1;
        this.IeN = 2;
        this.VVE = 1500;
        this.kqm = 2;
        this.brP = 3500;
        this.tD = 0;
        this.DY = 5;
        this.Sfi = false;
        this.HD = 0;
        this.aH = 2;
        this.CSn = -1;
        this.id = 0;
        this.foI = 0;
        this.KPU = 5;
        this.Ivz = true;
        this.nE = false;
        this.xan = false;
        this.hg = 0;
        this.CG = -1;
        this.nJ = false;
        this.le = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
        this.BcA = 2;
        this.rW = 1000;
        this.Pw = 1;
        this.VU = new ArrayList();
        this.sRq = new ArrayList();
        this.Of = new JSONObject();
        this.Lxb = str;
        this.lk = i;
    }
}
