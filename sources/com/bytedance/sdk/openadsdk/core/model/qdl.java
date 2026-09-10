package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private ljh fs;
    private String lnr;
    private uw mo;
    private ljh mzz;
    private String qdl;
    private String rq;
    private oth to;
    private int tvp;
    private int ud;
    private List<ljh> mml = new ArrayList();
    private JSONObject wd = new JSONObject();
    private volatile boolean jpc = false;

    public ljh bjy() {
        return this.mzz;
    }

    public JSONObject exu() {
        try {
            JSONObject jSONObject = new JSONObject();
            oth othVarWd = wd();
            if (othVarWd != null) {
                jSONObject.put("loop_config", othVarWd.rq());
            }
            uw uwVarFs = fs();
            if (uwVarFs != null) {
                jSONObject.put("multi_ad_config", uwVarFs.jl());
            }
            List<ljh> list = this.mml;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < this.mml.size(); i2++) {
                    jSONArray.put(this.mml.get(i2).rdz());
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("multi_ad_style", this.tvp);
            jSONObject.put("request_id", this.qdl);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.qdl("AdInfo", "toJsonObj: ", th);
            return null;
        }
    }

    public uw fs() {
        return this.mo;
    }

    public boolean jpc() {
        return this.jpc;
    }

    public int lnr() {
        return this.ud;
    }

    public List<ljh> mml() {
        return this.mml;
    }

    public ljh mo() {
        if (this.mml.size() > 0) {
            return this.mml.get(0);
        }
        return null;
    }

    public boolean mzz() {
        List<ljh> list = this.mml;
        return list != null && list.size() > 0;
    }

    public JSONObject qdl() {
        return this.wd;
    }

    public String rdp() {
        return this.rq;
    }

    public ljh rq() {
        return this.fs;
    }

    public boolean to() {
        return this.tvp == 1;
    }

    public void tvp() {
        this.jpc = false;
    }

    public String ud() {
        ljh ljhVarMo = mo();
        return ljhVarMo != null ? ljhVarMo.cev() : "";
    }

    public oth wd() {
        return this.to;
    }

    public void lnr(String str) {
        this.rq = str;
    }

    public void qdl(JSONObject jSONObject) {
        this.wd = jSONObject;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void qdl(int i2) {
        this.ud = i2;
    }

    public void ud(String str) {
        this.lnr = str;
    }

    public void qdl(ljh ljhVar) {
        this.mml.add(ljhVar);
        if (this.fs == null) {
            this.fs = ljhVar;
        }
    }

    public void ud(int i2) {
        this.tvp = i2;
    }

    public static qdl ud(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            qdl qdlVar = new qdl();
            qdlVar.qdl(oth.qdl(jSONObject.optJSONObject("loop_config")));
            qdlVar.ud(jSONObject.optInt("multi_ad_style", 0));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    ljh ljhVarQdl = com.bytedance.sdk.openadsdk.core.ud.qdl(jSONArrayOptJSONArray.optJSONObject(i2), null, null, qdlVar, i2);
                    if (ljhVarQdl != null) {
                        arrayList.add(ljhVarQdl);
                    }
                }
                qdlVar.qdl(arrayList);
            }
            qdlVar.qdl(jSONObject.optString("request_id", ""));
            String strOptString = jSONObject.optString("multi_ad_config");
            if (!TextUtils.isEmpty(strOptString)) {
                qdlVar.qdl(uw.qdl(strOptString));
            }
            return qdlVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.qdl("AdInfo", "fromJson: ", th);
            return null;
        }
    }

    public void qdl(List<ljh> list) {
        this.mml = list;
        if (list.isEmpty()) {
            return;
        }
        this.fs = list.get(0);
    }

    public static Map<String, ljh> qdl(qdl qdlVar) {
        if (qdlVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (ljh ljhVar : qdlVar.mml()) {
            if (!TextUtils.isEmpty(ljhVar.xmr())) {
                map.put(ljhVar.xmr(), ljhVar);
            }
        }
        if (map.size() != 0) {
            return map;
        }
        return null;
    }

    public void qdl(oth othVar) {
        this.to = othVar;
    }

    public void qdl(uw uwVar) {
        this.mo = uwVar;
    }

    public void ud(ljh ljhVar) {
        this.mzz = ljhVar;
    }
}
