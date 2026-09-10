package com.bytedance.sdk.component.adexpress.dynamic.ka;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mj {
    private String aw;
    private boolean bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private List<List<mj>> f18038co;
    private float di;
    private float fi;
    private float ik;
    private fi jbs;
    private float ka;
    private float lr;
    private float mj;
    private List<mj> qt;
    private String ri;
    private mj sf;
    private float xha;
    private Map<String, String> vr = new HashMap();
    private Map<Integer, String> slm = new HashMap();

    public Map<String, String> ac() {
        return this.vr;
    }

    public int aw() {
        di diVarFi = this.jbs.fi();
        return diVarFi.ta() + diVarFi.bnj();
    }

    public boolean ay() {
        return this.jbs.fi().qmx() < 0 || this.jbs.fi().id() < 0 || this.jbs.fi().ud() < 0 || this.jbs.fi().hpn() < 0;
    }

    public int bgr() {
        di diVarFi = this.jbs.fi();
        return diVarFi.tnn() + diVarFi.fe();
    }

    public List<List<mj>> bu() {
        return this.f18038co;
    }

    public mj co() {
        return this.sf;
    }

    public float di() {
        return this.lr;
    }

    public float fi() {
        return this.fi;
    }

    public void ihz() {
        List<List<mj>> list = this.f18038co;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<mj> list2 : this.f18038co) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.f18038co = arrayList;
    }

    public String ik() {
        return this.ri;
    }

    public float jbs() {
        return this.xha;
    }

    public float ka() {
        return this.ka;
    }

    public Map<Integer, String> lr() {
        return this.slm;
    }

    public float mj() {
        return this.di;
    }

    public boolean nr() {
        List<mj> list = this.qt;
        return list == null || list.size() <= 0;
    }

    public fi qt() {
        return this.jbs;
    }

    public String ri() {
        return this.aw;
    }

    public List<mj> sf() {
        return this.qt;
    }

    public float slm() {
        di diVarFi = this.jbs.fi();
        return bgr() + diVarFi.bu() + diVarFi.bgr() + (diVarFi.co() * 2.0f);
    }

    public boolean tan() {
        return this.bgr;
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.ri + "', x=" + this.lr + ", y=" + this.ik + ", width=" + this.di + ", height=" + this.xha + ", remainWidth=" + this.mj + ", rootBrick=" + this.jbs + ", childrenBrickUnits=" + this.qt + '}';
    }

    public boolean uq() {
        return TextUtils.equals(this.jbs.fi().zf(), "flex");
    }

    public float vr() {
        di diVarFi = this.jbs.fi();
        return aw() + diVarFi.vr() + diVarFi.slm() + (diVarFi.co() * 2.0f);
    }

    public String wjv() {
        return this.jbs.fi().wjv();
    }

    public float xha() {
        return this.ik;
    }

    public void di(float f) {
        this.xha = f;
    }

    public void fi(float f) {
        this.di = f;
    }

    public void ik(float f) {
        this.lr = f;
    }

    public void ka(float f) {
        this.ik = f;
    }

    public void lr(String str) {
        this.ri = str;
    }

    public void ri(String str) {
        this.aw = str;
    }

    public void xha(float f) {
        this.mj = f;
    }

    public void ik(String str) {
        this.jbs.fi().di(str);
    }

    public void lr(float f) {
        this.fi = f;
    }

    public void ri(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    this.slm.put(Integer.valueOf(jSONObjectOptJSONObject.optInt("id")), jSONObjectOptJSONObject.optString("value"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void lr(List<List<mj>> list) {
        this.f18038co = list;
    }

    public void ri(float f) {
        this.ka = f;
    }

    public void ri(fi fiVar) {
        this.jbs = fiVar;
    }

    public void ri(List<mj> list) {
        this.qt = list;
    }

    public void ri(mj mjVar) {
        this.sf = mjVar;
    }

    public void ri(boolean z) {
        this.bgr = z;
    }

    public void ri(String str, String str2) {
        this.vr.put(str, str2);
    }

    public String ri(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.jbs.lr());
        sb.append(":");
        sb.append(this.ri);
        if (this.jbs.fi() != null) {
            sb.append(":");
            sb.append(this.jbs.fi().eu());
        }
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }
}
