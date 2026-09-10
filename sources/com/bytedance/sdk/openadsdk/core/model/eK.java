package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class eK {
    private String JXs;
    private int LD;
    private int Lxb;
    private int OY;
    private int QAg;
    private int ZU;
    private int ebl;
    private String lc;
    private boolean lk;
    private boolean nBu;

    public eK(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.lk = jSONObject.optBoolean("is_playable");
        this.ZU = jSONObject.optInt("playable_type", 0);
        this.JXs = jSONObject.optString("playable_style");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("playable");
        if (jSONObjectOptJSONObject != null) {
            this.lc = jSONObjectOptJSONObject.optString("playable_url", "");
            this.ebl = jSONObjectOptJSONObject.optInt("playable_orientation", 0);
            this.LD = jSONObjectOptJSONObject.optInt("new_style", 0);
            this.Lxb = jSONObjectOptJSONObject.optInt("close_2_app", 0);
            int iLD = LD(this.ZU);
            this.OY = jSONObjectOptJSONObject.optInt("playable_webview_timeout", iLD);
            this.QAg = jSONObjectOptJSONObject.optInt("playable_js_timeout", iLD);
            this.nBu = jSONObjectOptJSONObject.optInt("playable_backup_enable", 0) == 1;
        }
    }

    private static int CSn(tD tDVar) {
        eK eKVarAH = aH(tDVar);
        if (eKVarAH == null) {
            return 0;
        }
        return eKVarAH.ZU;
    }

    public static long DY(tD tDVar) {
        return Math.max(Sfi(tDVar), HD(tDVar));
    }

    public static long HD(tD tDVar) {
        eK eKVarAH = aH(tDVar);
        if (eKVarAH == null) {
            return 5L;
        }
        return eKVarAH.LD();
    }

    public static boolean IeN(tD tDVar) {
        return tDVar == null || tDVar.JJ() == null || tDVar.JJ().n != 1;
    }

    public static String JVA(tD tDVar) {
        eK eKVarAH = aH(tDVar);
        if (eKVarAH == null) {
            return null;
        }
        return eKVarAH.JXs;
    }

    public static boolean JXs(tD tDVar) {
        eK eKVarAH = aH(tDVar);
        return eKVarAH != null && tDVar.II() && eKVarAH.lk && !TextUtils.isEmpty(NXR(tDVar));
    }

    private static int LD(int i) {
        return i == 1 ? 10 : 5;
    }

    public static int Lxb(int i) {
        return i + 10;
    }

    public static String NXR(tD tDVar) {
        if (tDVar == null) {
            return null;
        }
        eK eKVarVVE = tDVar.VVE();
        if (eKVarVVE != null && eKVarVVE.lk) {
            String str = eKVarVVE.lc;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (tDVar.kqm() == 20) {
            return tDVar.Sv();
        }
        if (tDVar.JJ() != null) {
            return tDVar.JJ().h;
        }
        return null;
    }

    public static boolean OY(tD tDVar) {
        eK eKVarVVE = tDVar.VVE();
        return eKVarVVE != null && !tDVar.II() && eKVarVVE.lk && eKVarVVE.LD == 1;
    }

    public static boolean QAg(tD tDVar) {
        eK eKVarVVE = tDVar.VVE();
        return eKVarVVE != null && eKVarVVE.lk && eKVarVVE.LD == 1;
    }

    public static boolean STP(tD tDVar) {
        return true;
    }

    public static long Sfi(tD tDVar) {
        eK eKVarAH = aH(tDVar);
        if (eKVarAH == null) {
            return 5L;
        }
        return eKVarAH.Lxb();
    }

    public static boolean VVE(tD tDVar) {
        KG kgJJ = tDVar.JJ();
        return kgJJ != null && kgJJ.n == 1;
    }

    public static boolean ZU(tD tDVar) {
        return lk(tDVar) && !QAg(tDVar);
    }

    private static eK aH(tD tDVar) {
        if (tDVar == null) {
            return null;
        }
        return tDVar.VVE();
    }

    public static boolean brP(tD tDVar) {
        return ebl(tDVar) && CSn(tDVar) == 1;
    }

    public static boolean eK(tD tDVar) {
        eK eKVarAH = aH(tDVar);
        return eKVarAH != null && eKVarAH.lk();
    }

    public static boolean ebl(tD tDVar) {
        eK eKVarAH = aH(tDVar);
        return (eKVarAH == null || tDVar.II() || !eKVarAH.lk || TextUtils.isEmpty(NXR(tDVar))) ? false : true;
    }

    public static int kqm(tD tDVar) {
        eK eKVarAH = aH(tDVar);
        if (eKVarAH == null) {
            return 0;
        }
        return eKVarAH.ebl;
    }

    public static boolean lc(tD tDVar) {
        return JXs(tDVar) && CSn(tDVar) == 1;
    }

    public static boolean lk(tD tDVar) {
        return LD(tDVar) && CSn(tDVar) == 1;
    }

    public static boolean nBu(tD tDVar) {
        eK eKVarVVE = tDVar.VVE();
        return eKVarVVE != null && tDVar.II() && eKVarVVE.lk && eKVarVVE.LD == 1;
    }

    public static String sLN(tD tDVar) {
        eK eKVarAH = aH(tDVar);
        if (eKVarAH == null) {
            return null;
        }
        return eKVarAH.lc;
    }

    public static boolean tD(tD tDVar) {
        return ebl(tDVar) && CSn(tDVar) == 0;
    }

    public static boolean LD(tD tDVar) {
        eK eKVarAH = aH(tDVar);
        return (eKVarAH == null || !eKVarAH.lk || TextUtils.isEmpty(NXR(tDVar))) ? false : true;
    }

    public static int Lxb(tD tDVar) {
        int i;
        eK eKVarVVE = tDVar.VVE();
        if (eKVarVVE != null && (i = eKVarVVE.Lxb) >= 0 && i <= 100) {
            return i;
        }
        return 0;
    }

    public boolean lk() {
        return this.nBu;
    }

    public int LD() {
        return this.QAg;
    }

    public void Lxb(JSONObject jSONObject) {
        try {
            jSONObject.put("is_playable", this.lk);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("PlayableModel", e.getMessage());
        }
        if (!TextUtils.isEmpty(this.lc)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("playable_url", this.lc);
                jSONObject2.put("playable_orientation", this.ebl);
                jSONObject2.put("new_style", this.LD);
                jSONObject2.put("close_2_app", this.Lxb);
                jSONObject2.put("playable_webview_timeout", this.OY);
                jSONObject2.put("playable_js_timeout", this.QAg);
                jSONObject2.put("playable_backup_enable", this.nBu ? 1 : 0);
                jSONObject.put("playable", jSONObject2);
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.sLN.Lxb("PlayableModel", e2.getMessage());
            }
        }
        try {
            jSONObject.put("playable_type", this.ZU);
        } catch (JSONException e3) {
            com.bytedance.sdk.component.utils.sLN.Lxb("PlayableModel", e3.getMessage());
        }
        try {
            jSONObject.put("playable_style", this.JXs);
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.sLN.Lxb("PlayableModel", e4.getMessage());
        }
    }

    public int Lxb() {
        return this.OY;
    }
}
