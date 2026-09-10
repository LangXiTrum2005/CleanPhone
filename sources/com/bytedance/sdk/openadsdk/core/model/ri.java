package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private wjv f18140co;
    private fr di;
    private wjv fi;
    private String ik;
    private int jbs;
    private int lr;
    private uq qt;
    private String ri;
    private String sf;
    private List<wjv> ka = new ArrayList();
    private JSONObject xha = new JSONObject();
    private volatile boolean mj = false;

    public wjv co() {
        return this.fi;
    }

    public wjv di() {
        if (this.ka.size() > 0) {
            return this.ka.get(0);
        }
        return null;
    }

    public boolean fi() {
        List<wjv> list = this.ka;
        return list != null && list.size() > 0;
    }

    public int ik() {
        return this.lr;
    }

    public wjv jbs() {
        return this.f18140co;
    }

    public List<wjv> ka() {
        return this.ka;
    }

    public String lr() {
        wjv wjvVarDi = di();
        return wjvVarDi != null ? wjvVarDi.jf() : "";
    }

    public boolean mj() {
        return this.jbs == 1;
    }

    public fr qt() {
        return this.di;
    }

    public JSONObject ri() {
        return this.xha;
    }

    public String sf() {
        return this.sf;
    }

    public uq xha() {
        return this.qt;
    }

    public void ik(String str) {
        this.sf = str;
    }

    public void ri(JSONObject jSONObject) {
        this.xha = jSONObject;
    }

    public void ri(String str) {
        this.ri = str;
    }

    public void lr(String str) {
        this.ik = str;
    }

    public void ri(int i) {
        this.lr = i;
    }

    public void lr(int i) {
        this.jbs = i;
    }

    public void ri(wjv wjvVar) {
        this.ka.add(wjvVar);
        if (this.f18140co == null) {
            this.f18140co = wjvVar;
        }
    }

    public static ri lr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            ri riVar = new ri();
            riVar.ri(uq.ri(jSONObject.optJSONObject("loop_config")));
            riVar.lr(jSONObject.optInt("multi_ad_style", 0));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    wjv wjvVarRi = com.bytedance.sdk.openadsdk.core.lr.ri(jSONArrayOptJSONArray.optJSONObject(i), null, null, riVar, i);
                    if (wjvVarRi != null) {
                        arrayList.add(wjvVarRi);
                    }
                }
                riVar.ri(arrayList);
            }
            riVar.ri(jSONObject.optString("request_id", ""));
            String strOptString = jSONObject.optString("multi_ad_config");
            if (!TextUtils.isEmpty(strOptString)) {
                riVar.ri(fr.ri(strOptString));
            }
            return riVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ri("AdInfo", "fromJson: ", th);
            return null;
        }
    }

    public void ri(List<wjv> list) {
        this.ka = list;
        if (list.isEmpty()) {
            return;
        }
        this.f18140co = list.get(0);
    }

    public static Map<String, wjv> ri(ri riVar) {
        if (riVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (wjv wjvVar : riVar.ka()) {
            if (!TextUtils.isEmpty(wjvVar.mvf())) {
                map.put(wjvVar.mvf(), wjvVar);
            }
        }
        if (map.size() != 0) {
            return map;
        }
        return null;
    }

    public void ri(uq uqVar) {
        this.qt = uqVar;
    }

    public void ri(fr frVar) {
        this.di = frVar;
    }

    public void lr(wjv wjvVar) {
        this.fi = wjvVar;
    }
}
