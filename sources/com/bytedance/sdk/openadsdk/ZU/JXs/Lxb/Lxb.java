package com.bytedance.sdk.openadsdk.ZU.JXs.Lxb;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.STP.lk;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.IeN;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.JXs;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.LD;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.NXR;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.OY;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.QAg;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.STP;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.ZU;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.lc;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.nBu;
import com.bytedance.sdk.openadsdk.ZU.ebl;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.eK;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uo0;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private static final Map<DK, IeN> Lxb = Collections.synchronizedMap(new WeakHashMap());

    public static void JXs(DK dk, IeN.Lxb lxb) {
        IeN ieN;
        if (dk == null || lxb == null || lxb.QAg() <= 0 || (ieN = Lxb.get(dk)) == null) {
            return;
        }
        Uo0 uo0ZU = ieN.ZU();
        tD tDVarJXs = ieN.JXs();
        if (uo0ZU == null || tDVarJXs == null) {
            return;
        }
        long jLk = lxb.lk();
        NXR nxr = new NXR();
        nxr.Lxb(lxb.LD());
        nxr.LD(jLk);
        nxr.Lxb(lxb.QAg());
        JSONObject jSONObjectLxb = Lxb(tDVarJXs, ieN.LD(), ieN.lk(), uo0ZU);
        int i = uo0ZU.ZU;
        if (i > 0) {
            try {
                jSONObjectLxb.put("play_time", i);
            } catch (JSONException e) {
                sLN.Lxb("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb lxb2 = new com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb(tDVarJXs, nJ.Lxb(tDVarJXs), jSONObjectLxb, nxr);
        lxb2.Lxb(lxb.nBu());
        Lxb(lxb2, "play_buffer");
    }

    public static void LD(DK dk, IeN.Lxb lxb) {
        IeN ieN;
        if (dk == null || lxb == null || (ieN = Lxb.get(dk)) == null) {
            return;
        }
        Uo0 uo0ZU = ieN.ZU();
        tD tDVarJXs = ieN.JXs();
        if (uo0ZU == null || tDVarJXs == null) {
            return;
        }
        long jLxb = lxb.Lxb();
        long jLk = lxb.lk();
        if (jLk <= 0 || jLxb <= 0) {
            return;
        }
        JXs jXs = new JXs();
        jXs.Lxb(lxb.LD());
        jXs.LD(jLk);
        JSONObject jSONObjectLxb = Lxb(tDVarJXs, ieN.LD(), ieN.lk(), uo0ZU);
        int i = uo0ZU.ZU;
        if (i > 0) {
            try {
                jSONObjectLxb.put("play_time", i);
            } catch (JSONException e) {
                sLN.Lxb("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb lxb2 = new com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb(tDVarJXs, nJ.Lxb(tDVarJXs), jSONObjectLxb, jXs);
        lxb2.Lxb(lxb.nBu());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jLxb);
            jSONObject.put("percent", lxb.lc());
            Lxb(lxb2, "feed_continue", jSONObject);
        } catch (JSONException e2) {
            sLN.Lxb("TTAD.VideoEventManager", "", e2);
        }
    }

    public static void Lxb(Context context, DK dk, IeN.Lxb lxb, ebl eblVar) {
        IeN ieN;
        if (context == null || dk == null || lxb == null || (ieN = Lxb.get(dk)) == null) {
            return;
        }
        Uo0 uo0ZU = ieN.ZU();
        tD tDVarJXs = ieN.JXs();
        if (uo0ZU == null || tDVarJXs == null) {
            return;
        }
        if (!lxb.nBu()) {
            Lxb(tDVarJXs, uo0ZU, lxb);
        }
        OY oy = new OY();
        oy.Lxb(lxb.JVA() ? 1 : 0);
        ((OK) CacheDirFactory.getICacheDir(tDVarJXs.tv())).getClass();
        long length = 0;
        if (!TextUtils.isEmpty(uo0ZU.LD()) && !TextUtils.isEmpty(uo0ZU.STP())) {
            String strLD = uo0ZU.LD();
            String strSTP = uo0ZU.STP();
            File fileY = AbstractC2845Vx.Y(strLD, strSTP);
            if (fileY.exists()) {
                length = fileY.length();
            } else {
                File fileF = AbstractC2845Vx.F(strLD, strSTP);
                if (fileF.exists()) {
                    length = fileF.length();
                }
            }
        }
        oy.LD(length);
        oy.Lxb(SystemClock.elapsedRealtime() - ieN.Lxb());
        JSONObject jSONObjectLxb = Lxb(tDVarJXs, ieN.LD(), ieN.lk(), uo0ZU);
        int i = uo0ZU.ZU;
        if (i > 0) {
            try {
                jSONObjectLxb.put("play_time", i);
            } catch (JSONException e) {
                sLN.Lxb("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb lxb2 = new com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb(tDVarJXs, nJ.Lxb(tDVarJXs), jSONObjectLxb, oy);
        lxb2.Lxb(lxb.nBu());
        Lxb(lxb2, "feed_play", eblVar);
    }

    public static void ZU(DK dk, IeN.Lxb lxb) {
        IeN ieN;
        if (dk == null || lxb == null || (ieN = Lxb.get(dk)) == null) {
            return;
        }
        Uo0 uo0ZU = ieN.ZU();
        tD tDVarJXs = ieN.JXs();
        if (uo0ZU == null || tDVarJXs == null) {
            return;
        }
        long jLxb = lxb.Lxb();
        long jLk = lxb.lk();
        LD ld = new LD();
        ld.Lxb(lxb.LD());
        ld.LD(jLk);
        ld.Lxb(lxb.ZU());
        ld.LD(lxb.JXs());
        com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb lxb2 = new com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb(tDVarJXs, nJ.Lxb(tDVarJXs), Lxb(tDVarJXs, ieN.LD(), ieN.lk(), uo0ZU), ld);
        lxb2.Lxb(lxb.nBu());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jLxb);
            jSONObject.put("percent", lxb.lc());
            Lxb(lxb2, "endcard_skip", jSONObject);
        } catch (JSONException e) {
            sLN.Lxb("TTAD.VideoEventManager", "", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long lk(Uo0 uo0) {
        if (uo0 == null) {
            return 0L;
        }
        KG kgSfi = uo0.JVA() ? uo0.Sfi() : uo0.DY();
        if (kgSfi != null) {
            return Double.valueOf(kgSfi.d * 1000.0d).longValue();
        }
        return 0L;
    }

    public static void lk(DK dk, IeN.Lxb lxb) {
        IeN ieN;
        if (dk == null || lxb == null || (ieN = Lxb.get(dk)) == null) {
            return;
        }
        Uo0 uo0ZU = ieN.ZU();
        tD tDVarJXs = ieN.JXs();
        if (uo0ZU == null || tDVarJXs == null) {
            return;
        }
        long jLxb = lxb.Lxb();
        long jLk = lxb.lk();
        STP stp = new STP(lxb.sLN());
        stp.Lxb(lxb.LD());
        stp.LD(jLk);
        JSONObject jSONObjectLxb = Lxb(tDVarJXs, ieN.LD(), ieN.lk(), uo0ZU);
        int i = uo0ZU.ZU;
        if (i > 0) {
            try {
                jSONObjectLxb.put("play_time", i);
            } catch (JSONException e) {
                sLN.Lxb("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb lxb2 = new com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb(tDVarJXs, nJ.Lxb(tDVarJXs), jSONObjectLxb, stp);
        lxb2.Lxb(lxb.nBu());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jLxb);
            jSONObject.put("percent", lxb.lc());
            Lxb(lxb2, "play_error", jSONObject);
        } catch (JSONException e2) {
            sLN.Lxb("TTAD.VideoEventManager", "", e2);
        }
        Lxb.remove(dk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String ZU(Uo0 uo0) {
        return new File(uo0.LD(), uo0.STP()).getAbsolutePath();
    }

    public static void LD(DK dk, IeN.Lxb lxb, ebl eblVar) {
        if (dk == null || lxb == null) {
            return;
        }
        JXs(dk, lxb);
        IeN ieN = Lxb.get(dk);
        if (ieN == null) {
            return;
        }
        Uo0 uo0ZU = ieN.ZU();
        tD tDVarJXs = ieN.JXs();
        if (uo0ZU == null || tDVarJXs == null) {
            return;
        }
        long jLxb = lxb.Lxb();
        long jLk = lxb.lk();
        lc lcVar = new lc();
        lcVar.LD(lxb.LD());
        lcVar.Lxb(jLk);
        lcVar.Lxb(lxb.OY());
        JSONObject jSONObjectLxb = Lxb(tDVarJXs, ieN.LD(), ieN.lk(), uo0ZU);
        int i = uo0ZU.ZU;
        if (i > 0) {
            try {
                jSONObjectLxb.put("play_time", i);
            } catch (JSONException e) {
                sLN.Lxb("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb lxb2 = new com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb(tDVarJXs, nJ.Lxb(tDVarJXs), jSONObjectLxb, lcVar);
        lxb2.Lxb(lxb.nBu());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jLxb);
            jSONObject.put("percent", lxb.lc());
            Lxb(lxb2, "feed_over", jSONObject, eblVar);
        } catch (JSONException e2) {
            sLN.Lxb("TTAD.VideoEventManager", "", e2);
        }
        Lxb.remove(dk);
    }

    public static void Lxb(tD tDVar, DK dk, Uo0 uo0) {
        if (tDVar == null || dk == null || uo0 == null) {
            return;
        }
        String strLxb = eK.Lxb();
        ((OK) CacheDirFactory.getICacheDir(tDVar.tv())).getClass();
        int i = (TextUtils.isEmpty(uo0.LD()) || TextUtils.isEmpty(uo0.STP()) || !new File(uo0.LD(), uo0.STP()).exists()) ? 2 : 1;
        Lxb.put(dk, new IeN(SystemClock.elapsedRealtime(), strLxb, i, uo0, tDVar));
        JSONObject jSONObjectLxb = Lxb(tDVar, strLxb, i, uo0);
        String strLxb2 = nJ.Lxb(tDVar);
        try {
            int i2 = uo0.ZU;
            if (i2 > 0) {
                jSONObjectLxb.put("play_time", i2);
            }
            jSONObjectLxb.put("is_mute", uo0.OY() ? 1 : 0);
        } catch (JSONException e) {
            sLN.Lxb("TTAD.VideoEventManager", "", e);
        }
        com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb lxb = new com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb(tDVar, strLxb2, jSONObjectLxb, null);
        lxb.Lxb(uo0.IeN() == -1);
        Lxb(lxb, "play_start");
    }

    public static void Lxb(DK dk, IeN.Lxb lxb) {
        IeN ieN;
        if (dk == null || lxb == null || (ieN = Lxb.get(dk)) == null) {
            return;
        }
        Uo0 uo0ZU = ieN.ZU();
        tD tDVarJXs = ieN.JXs();
        if (uo0ZU == null || tDVarJXs == null) {
            return;
        }
        long jLxb = lxb.Lxb();
        long jLk = lxb.lk();
        if (jLk <= 0 || jLxb <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.ZU.JXs.LD.ebl eblVar = new com.bytedance.sdk.openadsdk.ZU.JXs.LD.ebl();
        eblVar.Lxb(lxb.LD());
        eblVar.LD(jLk);
        JSONObject jSONObjectLxb = Lxb(tDVarJXs, ieN.LD(), ieN.lk(), uo0ZU);
        int i = uo0ZU.ZU;
        if (i > 0) {
            try {
                jSONObjectLxb.put("play_time", i);
            } catch (JSONException e) {
                sLN.Lxb("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb lxb2 = new com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb(tDVarJXs, nJ.Lxb(tDVarJXs), jSONObjectLxb, eblVar);
        lxb2.Lxb(lxb.nBu());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jLxb);
            jSONObject.put("percent", lxb.lc());
            Lxb(lxb2, "feed_pause", jSONObject);
        } catch (JSONException e2) {
            sLN.Lxb("TTAD.VideoEventManager", "", e2);
        }
    }

    public static void LD(com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb<QAg> lxb) {
        lk.Lxb("load_video_cancel", lxb);
    }

    public static void Lxb(DK dk, IeN.Lxb lxb, ebl eblVar) {
        IeN ieN;
        if (dk == null || lxb == null || (ieN = Lxb.get(dk)) == null) {
            return;
        }
        Uo0 uo0ZU = ieN.ZU();
        tD tDVarJXs = ieN.JXs();
        if (uo0ZU == null || tDVarJXs == null) {
            return;
        }
        long jLxb = lxb.Lxb();
        long jLk = lxb.lk();
        ZU zu = new ZU();
        zu.LD(lxb.LD());
        zu.Lxb(jLk);
        zu.Lxb(lxb.ebl());
        zu.LD(lxb.OY());
        JSONObject jSONObjectLxb = Lxb(tDVarJXs, ieN.LD(), ieN.lk(), uo0ZU);
        int i = uo0ZU.ZU;
        if (i > 0) {
            try {
                jSONObjectLxb.put("play_time", i);
            } catch (JSONException e) {
                sLN.Lxb("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb lxb2 = new com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb(tDVarJXs, nJ.Lxb(tDVarJXs), jSONObjectLxb, zu);
        lxb2.Lxb(lxb.nBu());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jLxb);
            jSONObject.put("percent", lxb.lc());
            Lxb(lxb2, "feed_break", jSONObject, eblVar);
        } catch (JSONException e2) {
            sLN.Lxb("TTAD.VideoEventManager", "", e2);
        }
    }

    public static void Lxb(DK dk, boolean z) {
        IeN ieN;
        if (dk == null || (ieN = Lxb.get(dk)) == null) {
            return;
        }
        Uo0 uo0ZU = ieN.ZU();
        tD tDVarJXs = ieN.JXs();
        if (uo0ZU == null || tDVarJXs == null) {
            return;
        }
        JSONObject jSONObjectLxb = Lxb(tDVarJXs, ieN.LD(), ieN.lk(), uo0ZU);
        try {
            int i = uo0ZU.ZU;
            if (i > 0) {
                jSONObjectLxb.put("play_time", i);
            }
            jSONObjectLxb.put("is_mute", z ? 1 : 0);
        } catch (JSONException e) {
            sLN.Lxb("TTAD.VideoEventManager", "", e);
        }
        Lxb(new com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb(tDVarJXs, nJ.Lxb(tDVarJXs), jSONObjectLxb, null), "mute_state_change");
    }

    public static JSONObject Lxb(tD tDVar, String str, int i, Uo0 uo0) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("session_id", str);
            }
            if (i > 0) {
                jSONObject.put("play_type", String.valueOf(i));
            }
            if (tDVar != null) {
                KG kgJJ = tDVar.JJ();
                if (kgJJ != null) {
                    jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, kgJJ.e);
                    jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(kgJJ.c));
                    jSONObject.put(CampaignEx.JSON_KEY_VIDEO_URL, kgJJ.g);
                    jSONObject.put("player_type", uo0.IeN());
                    jSONObject.put("video_encode_type", uo0.JVA() ? 1 : 0);
                }
                jSONObject.put("dp_creative_type", tDVar.qK());
            }
        } catch (JSONException e) {
            sLN.Lxb("TTAD.VideoEventManager", "", e);
        }
        return jSONObject;
    }

    public static void Lxb(com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb<nBu> lxb) {
        lk.Lxb("load_video_error", lxb);
    }

    private static void Lxb(com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb lxb, String str) {
        Lxb(lxb, str, (JSONObject) null, (ebl) null);
    }

    private static void Lxb(com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb lxb, String str, JSONObject jSONObject) {
        Lxb(lxb, str, jSONObject, (ebl) null);
    }

    private static void Lxb(com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb lxb, String str, ebl eblVar) {
        Lxb(lxb, str, (JSONObject) null, eblVar);
    }

    private static void Lxb(final com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb lxb, String str, final JSONObject jSONObject, final ebl eblVar) {
        if (lxb == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (lxb.JXs() && !TextUtils.isEmpty(lxb.LD())) {
            String strLD = lxb.LD();
            strLD.getClass();
            if (strLD.equals("stream") || strLD.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str2 = str;
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(System.currentTimeMillis(), lxb.Lxb(), lxb.LD(), str2, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.1
            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
            public JSONObject Lxb() {
                ebl eblVar2;
                try {
                    JSONObject jSONObjectLk = lxb.lk();
                    if (lxb.ZU() != null) {
                        lxb.ZU().Lxb(jSONObjectLk);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (eblVar2 = eblVar) != null) {
                        eblVar2.Lxb(jSONObjectLk);
                    }
                    jSONObject.put("ad_extra_data", jSONObjectLk.toString());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    private static void Lxb(final tD tDVar, final Uo0 uo0, final IeN.Lxb lxb) {
        lk.Lxb();
        lk.Lxb("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.2
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", Lxb.lk(uo0));
                jSONObject.put("player_duration", lxb.lk());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", uo0.NXR());
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, Lxb.ZU(uo0));
                jSONObject.put("player_type", uo0.IeN());
                com.bytedance.sdk.openadsdk.STP.Lxb.ZU zuLxb = com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("pangle_video_play_state");
                tD tDVar2 = tDVar;
                return zuLxb.Lxb(tDVar2 != null ? tDVar2.lJ() : 0).LD(jSONObject.toString());
            }
        });
    }
}
