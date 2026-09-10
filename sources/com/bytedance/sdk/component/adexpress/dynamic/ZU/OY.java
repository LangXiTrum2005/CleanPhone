package com.bytedance.sdk.component.adexpress.dynamic.ZU;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class OY {
    private OY JVA;
    private float JXs;
    private float LD;
    private String Lxb;
    private String NXR;
    private float OY;
    private JXs QAg;
    private boolean STP;
    private float ZU;
    private float ebl;
    private float lc;
    private float lk;
    private List<OY> nBu;
    private List<List<OY>> sLN;
    private Map<String, String> IeN = new HashMap();
    private Map<Integer, String> VVE = new HashMap();

    public Map<String, String> DY() {
        return this.IeN;
    }

    public boolean HD() {
        return TextUtils.equals(this.QAg.JXs().KPU(), "flex");
    }

    public float IeN() {
        lc lcVarJXs = this.QAg.JXs();
        return (lcVarJXs.sLN() * 2.0f) + lcVarJXs.VVE() + lcVarJXs.IeN() + NXR();
    }

    public List<OY> JVA() {
        return this.nBu;
    }

    public float JXs() {
        return this.JXs;
    }

    public Map<Integer, String> LD() {
        return this.VVE;
    }

    public String Lxb() {
        return this.NXR;
    }

    public int NXR() {
        lc lcVarJXs = this.QAg.JXs();
        return lcVarJXs.JZE() + lcVarJXs.Ld();
    }

    public float OY() {
        return this.lc;
    }

    public float QAg() {
        return this.ebl;
    }

    public int STP() {
        lc lcVarJXs = this.QAg.JXs();
        return lcVarJXs.Of() + lcVarJXs.sRq();
    }

    public void Sfi() {
        List<List<OY>> list = this.sLN;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<OY> list2 : this.sLN) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.sLN = arrayList;
    }

    public float VVE() {
        lc lcVarJXs = this.QAg.JXs();
        return (lcVarJXs.sLN() * 2.0f) + lcVarJXs.STP() + lcVarJXs.kqm() + STP();
    }

    public float ZU() {
        return this.ZU;
    }

    public boolean aH() {
        return this.QAg.JXs().ro() < 0 || this.QAg.JXs().gS() < 0 || this.QAg.JXs().Wi() < 0 || this.QAg.JXs().oc() < 0;
    }

    public boolean brP() {
        List<OY> list = this.nBu;
        return list == null || list.size() <= 0;
    }

    public String eK() {
        return this.QAg.JXs().eK();
    }

    public float ebl() {
        return this.lk;
    }

    public List<List<OY>> kqm() {
        return this.sLN;
    }

    public float lc() {
        return this.LD;
    }

    public String lk() {
        return this.Lxb;
    }

    public JXs nBu() {
        return this.QAg;
    }

    public OY sLN() {
        return this.JVA;
    }

    public boolean tD() {
        return this.STP;
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.Lxb + "', x=" + this.LD + ", y=" + this.lk + ", width=" + this.lc + ", height=" + this.ebl + ", remainWidth=" + this.OY + ", rootBrick=" + this.QAg + ", childrenBrickUnits=" + this.nBu + '}';
    }

    public void JXs(float f) {
        this.lc = f;
    }

    public void LD(String str) {
        this.Lxb = str;
    }

    public void Lxb(String str) {
        this.NXR = str;
    }

    public void ZU(float f) {
        this.lk = f;
    }

    public void ebl(float f) {
        this.OY = f;
    }

    public void lc(float f) {
        this.ebl = f;
    }

    public void lk(float f) {
        this.LD = f;
    }

    public void LD(float f) {
        this.JXs = f;
    }

    public void Lxb(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    this.VVE.put(Integer.valueOf(jSONObjectOptJSONObject.optInt("id")), jSONObjectOptJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void lk(String str) {
        this.QAg.JXs().lc(str);
    }

    public void LD(List<List<OY>> list) {
        this.sLN = list;
    }

    public void Lxb(float f) {
        this.ZU = f;
    }

    public void Lxb(JXs jXs) {
        this.QAg = jXs;
    }

    public void Lxb(List<OY> list) {
        this.nBu = list;
    }

    public void Lxb(OY oy) {
        this.JVA = oy;
    }

    public void Lxb(boolean z) {
        this.STP = z;
    }

    public void Lxb(String str, String str2) {
        this.IeN.put(str, str2);
    }

    public String Lxb(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.QAg.LD());
        sb.append(":");
        sb.append(this.Lxb);
        if (this.QAg.JXs() != null) {
            sb.append(":");
            sb.append(this.QAg.JXs().owi());
        }
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }
}
