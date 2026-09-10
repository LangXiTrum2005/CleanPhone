package com.bytedance.sdk.openadsdk.core.sLN;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private String IeN;
    private String JVA;
    private String JXs;
    LD LD;
    private double OY;
    private int QAg;
    private String ZU;
    private String ebl;
    private String lc;
    lk lk;
    private int nBu;
    ZU Lxb = new ZU(this);
    private final Set<nBu> sLN = new HashSet();
    private String NXR = "VAST_ACTION_BUTTON";
    private boolean STP = false;

    private JSONArray VVE() {
        JSONArray jSONArray = new JSONArray();
        for (nBu nbu : this.sLN) {
            if (nbu != null) {
                jSONArray.put(nbu.ZU());
            }
        }
        return jSONArray;
    }

    public void IeN() {
        this.STP = true;
    }

    public String JVA() {
        return this.JVA;
    }

    public String JXs() {
        return this.JXs;
    }

    public LD LD() {
        return this.LD;
    }

    public ZU Lxb() {
        return this.Lxb;
    }

    public int NXR() {
        return this.nBu;
    }

    public double OY() {
        return this.OY;
    }

    public String QAg() {
        lk lkVar;
        String str = this.lc;
        if (!TextUtils.isEmpty(this.IeN)) {
            String str2 = this.IeN;
            this.IeN = null;
            return str2;
        }
        String str3 = this.NXR;
        str3.getClass();
        if (str3.equals("VAST_ICON")) {
            LD ld = this.LD;
            if (ld != null && !TextUtils.isEmpty(ld.OY)) {
                str = this.LD.OY;
            }
        } else if (str3.equals("VAST_END_CARD") && (lkVar = this.lk) != null && !TextUtils.isEmpty(lkVar.OY)) {
            str = this.lk.OY;
        }
        this.NXR = "VAST_ACTION_BUTTON";
        return str;
    }

    public Set<nBu> STP() {
        return this.sLN;
    }

    public String ZU() {
        return this.ZU;
    }

    public String ebl() {
        return this.ebl;
    }

    public String lc() {
        return this.lc;
    }

    public lk lk() {
        return this.lk;
    }

    public JSONObject nBu() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoTrackers", this.Lxb.Lxb());
        LD ld = this.LD;
        if (ld != null) {
            jSONObject.put("vastIcon", ld.Lxb());
        }
        lk lkVar = this.lk;
        if (lkVar != null) {
            jSONObject.put("endCard", lkVar.Lxb());
        }
        jSONObject.put(CampaignEx.JSON_KEY_TITLE, this.ZU);
        jSONObject.put("description", this.JXs);
        jSONObject.put("clickThroughUrl", this.lc);
        jSONObject.put("videoUrl", this.ebl);
        jSONObject.put("videDuration", this.OY);
        jSONObject.put("tag", this.JVA);
        jSONObject.put("videoWidth", this.QAg);
        jSONObject.put("videoHeight", this.nBu);
        jSONObject.put("viewabilityVendor", VVE());
        return jSONObject;
    }

    public int sLN() {
        return this.QAg;
    }

    public void JXs(String str) {
        this.NXR = str;
    }

    public void LD(String str) {
        this.JXs = str;
    }

    public void Lxb(LD ld) {
        if (ld != null) {
            ld.Lxb(this.ebl);
        }
        this.LD = ld;
    }

    public void ZU(String str) {
        this.ebl = str;
    }

    public void ebl(String str) {
        this.IeN = str;
    }

    public void lc(String str) {
        this.JVA = str;
        this.Lxb.Lxb(str);
    }

    public void lk(String str) {
        this.lc = str;
    }

    public void LD(int i) {
        this.nBu = i;
    }

    public void Lxb(lk lkVar) {
        if (lkVar != null) {
            lkVar.Lxb(this.ebl);
        }
        this.lk = lkVar;
    }

    public void Lxb(String str) {
        this.ZU = str;
    }

    public void Lxb(double d) {
        this.OY = d;
    }

    public static Lxb Lxb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Lxb lxb = new Lxb();
        lxb.Lxb.Lxb(jSONObject.optJSONObject("videoTrackers"));
        lxb.LD = LD.Lxb(jSONObject.optJSONObject("vastIcon"));
        lxb.lk = lk.LD(jSONObject.optJSONObject("endCard"));
        lxb.ZU = jSONObject.optString(CampaignEx.JSON_KEY_TITLE);
        lxb.JXs = jSONObject.optString("description");
        lxb.lc = jSONObject.optString("clickThroughUrl");
        lxb.ebl = jSONObject.optString("videoUrl");
        lxb.OY = jSONObject.optDouble("videDuration");
        lxb.JVA = jSONObject.optString("tag");
        lxb.QAg = jSONObject.optInt("videoWidth");
        lxb.QAg = jSONObject.optInt("videoHeight");
        lxb.sLN.addAll(nBu.Lxb(jSONObject.optJSONArray("viewabilityVendor")));
        return lxb;
    }

    public void Lxb(tD tDVar) {
        this.Lxb.Lxb(tDVar);
        LD ld = this.LD;
        if (ld != null) {
            ld.Lxb(tDVar);
        }
        lk lkVar = this.lk;
        if (lkVar != null) {
            lkVar.Lxb(tDVar);
        }
    }

    public void Lxb(int i) {
        this.QAg = i;
    }

    public void Lxb(Set<nBu> set) {
        if (set == null || set.size() <= 0) {
            return;
        }
        this.sLN.addAll(set);
    }
}
