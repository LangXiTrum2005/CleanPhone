package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private boolean JXs;
    private int LD;
    private String Lxb;
    private int NXR;
    private String OY;
    private long QAg;
    private String STP;
    private C0108Lxb ZU;
    private String lk;
    private boolean nBu;
    private List<tD> lc = new ArrayList();
    private List<OY> ebl = new ArrayList();
    private JSONObject JVA = new JSONObject();
    private volatile boolean sLN = false;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0108Lxb extends tD.Lxb {
        private int Lxb;

        public JSONObject LD() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", lc());
                jSONObject.put("md5", ebl());
                jSONObject.put("url", OY());
                jSONObject.put("data", QAg());
                jSONObject.put("diff_data", nBu());
                jSONObject.put("version", JXs());
                jSONObject.put("dynamic_creative", JVA());
                jSONObject.put("count_down_time", Lxb());
                return jSONObject;
            } catch (Throwable unused) {
                return null;
            }
        }

        public void Lxb(int i) {
            this.Lxb = i;
        }

        public int Lxb() {
            return this.Lxb;
        }

        public static C0108Lxb Lxb(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0108Lxb c0108Lxb = new C0108Lxb();
            c0108Lxb.lk(jSONObject.optString("id"));
            c0108Lxb.ZU(jSONObject.optString("md5"));
            c0108Lxb.JXs(jSONObject.optString("url"));
            c0108Lxb.lc(jSONObject.optString("data"));
            c0108Lxb.ebl(jSONObject.optString("diff_data"));
            c0108Lxb.LD(jSONObject.optString("version"));
            c0108Lxb.OY(jSONObject.optString("dynamic_creative"));
            c0108Lxb.Lxb(jSONObject.optInt("count_down_time"));
            if (Lxb(c0108Lxb)) {
                return c0108Lxb;
            }
            return null;
        }

        private static boolean Lxb(C0108Lxb c0108Lxb) {
            return (c0108Lxb == null || TextUtils.isEmpty(c0108Lxb.lc()) || TextUtils.isEmpty(c0108Lxb.OY())) ? false : true;
        }
    }

    public void JVA() {
        this.sLN = false;
    }

    public boolean JXs() {
        List<tD> list = this.lc;
        return list != null && list.size() > 0;
    }

    public String LD() {
        tD tDVarLc = lc();
        return tDVarLc != null ? tDVarLc.xNP() : "";
    }

    public JSONObject Lxb() {
        return this.JVA;
    }

    @Nullable
    public JSONObject NXR() {
        try {
            JSONObject jSONObject = new JSONObject();
            C0108Lxb c0108LxbQAg = QAg();
            if (c0108LxbQAg != null) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObjectLD = c0108LxbQAg.LD();
                if (jSONObjectLD != null) {
                    jSONObject2.put("tpl_info", jSONObjectLD);
                    jSONObject.put("choose_ui_data", jSONObject2);
                }
            }
            List<tD> list = this.lc;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < this.lc.size(); i++) {
                    jSONArray.put(this.lc.get(i).JD());
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("is_choose_ad_original", this.nBu);
            jSONObject.put("multi_ad_style", this.NXR);
            jSONObject.put("request_id", this.Lxb);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("AdInfo", "toJsonObj: ", th);
            return null;
        }
    }

    public boolean OY() {
        return this.nBu;
    }

    public C0108Lxb QAg() {
        return this.ZU;
    }

    public String STP() {
        return this.STP;
    }

    public List<tD> ZU() {
        return this.lc;
    }

    public boolean ebl() {
        if (QAg() == null || ZU() == null || ZU().size() <= 1) {
            this.JXs = false;
            Lxb((C0108Lxb) null);
        } else {
            this.JXs = true;
        }
        return this.JXs;
    }

    public tD lc() {
        if (this.lc.size() > 0) {
            return this.lc.get(0);
        }
        return null;
    }

    public int lk() {
        return this.LD;
    }

    public boolean nBu() {
        return this.sLN;
    }

    public boolean sLN() {
        return this.NXR == 1;
    }

    public void Lxb(JSONObject jSONObject) {
        this.JVA = jSONObject;
    }

    public void ZU(String str) {
        this.STP = str;
    }

    public void lk(String str) {
        this.OY = str;
    }

    public static Lxb lk(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            Lxb lxb = new Lxb();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("choose_ui_data");
            if (jSONObjectOptJSONObject != null) {
                lxb.LD(jSONObjectOptJSONObject);
            }
            lxb.LD(jSONObject.optInt("multi_ad_style", 0));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    tD tDVarLxb = com.bytedance.sdk.openadsdk.core.LD.Lxb(jSONArrayOptJSONArray.optJSONObject(i));
                    if (tDVarLxb != null) {
                        tDVarLxb.QAg(lxb.sLN());
                        arrayList.add(tDVarLxb);
                    }
                }
                lxb.Lxb(arrayList);
            }
            lxb.Lxb(jSONObject.optBoolean("is_choose_ad_original", false));
            lxb.Lxb(jSONObject.optString("request_id", ""));
            return lxb;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("AdInfo", "fromJson: ", th);
            return null;
        }
    }

    public void Lxb(String str) {
        this.Lxb = str;
    }

    public void LD(String str) {
        this.lk = str;
    }

    public void Lxb(int i) {
        this.LD = i;
    }

    public void LD(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        Lxb(C0108Lxb.Lxb(jSONObject.optJSONObject("tpl_info")));
    }

    public void Lxb(tD tDVar) {
        this.lc.add(tDVar);
    }

    public void LD(int i) {
        this.NXR = i;
    }

    public void Lxb(List<tD> list) {
        this.lc = list;
    }

    public void Lxb(OY oy) {
        this.ebl.add(oy);
    }

    public void Lxb(long j) {
        this.QAg = j;
    }

    public static Map<String, tD> Lxb(Lxb lxb) {
        if (lxb == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (tD tDVar : lxb.ZU()) {
            if (!TextUtils.isEmpty(tDVar.oc())) {
                map.put(tDVar.oc(), tDVar);
            }
        }
        if (map.size() != 0) {
            return map;
        }
        return null;
    }

    public void Lxb(boolean z) {
        this.nBu = z;
    }

    public void Lxb(C0108Lxb c0108Lxb) {
        this.ZU = c0108Lxb;
        if (c0108Lxb == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.Lxb.LD.LD.Lxb(tD.Lxb.Lxb(c0108Lxb, ""));
    }
}
