package com.bytedance.adsdk.ugeno.ZU;

import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JXs implements ebl {
    private com.bytedance.adsdk.ugeno.LD.lk LD;
    private Map<String, com.bytedance.adsdk.ugeno.ZU.lk.Lxb> Lxb;
    private boolean lk;

    public JXs(com.bytedance.adsdk.ugeno.LD.lk lkVar, Map<String, com.bytedance.adsdk.ugeno.ZU.lk.Lxb> map) {
        this.LD = lkVar;
        this.Lxb = map;
    }

    public void LD() {
        com.bytedance.adsdk.ugeno.ZU.lk.Lxb Lxb = Lxb("twist");
        if (Lxb != null) {
            Lxb.Lxb(this);
            Lxb.Lxb(new Object[0]);
        }
    }

    public void Lxb() {
        com.bytedance.adsdk.ugeno.ZU.lk.Lxb Lxb = Lxb("shake");
        if (Lxb != null) {
            Lxb.Lxb(this);
            Lxb.Lxb(new Object[0]);
        }
    }

    public void ZU() {
        com.bytedance.adsdk.ugeno.ZU.lk.Lxb Lxb = Lxb("timer");
        if (Lxb != null) {
            Lxb.Lxb(this);
            Lxb.Lxb(new Object[0]);
        }
    }

    public void lk() {
        for (Map.Entry<String, com.bytedance.adsdk.ugeno.ZU.lk.Lxb> entry : this.Lxb.entrySet()) {
            if (entry != null) {
                com.bytedance.adsdk.ugeno.ZU.lk.Lxb value = entry.getValue();
                if (value instanceof com.bytedance.adsdk.ugeno.ZU.lk.LD) {
                    value.Lxb(this);
                    value.Lxb(new Object[0]);
                }
            }
        }
    }

    public boolean Lxb(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.ZU.lk.Lxb Lxb = Lxb("tap");
        if (Lxb instanceof com.bytedance.adsdk.ugeno.ZU.lk.ZU) {
            Lxb.Lxb(this);
            this.lk = Lxb.Lxb(motionEvent);
        }
        if (this.lk) {
            return true;
        }
        com.bytedance.adsdk.ugeno.ZU.lk.Lxb Lxb2 = Lxb("slide");
        if (Lxb2 instanceof com.bytedance.adsdk.ugeno.ZU.lk.lk) {
            Lxb2.Lxb(this);
            return Lxb2.Lxb(motionEvent);
        }
        return this.lk;
    }

    private void Lxb(String str, List<LD.Lxb> list) {
        com.bytedance.adsdk.ugeno.ZU.LD.Lxb Lxb;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (LD.Lxb lxb : list) {
            if (lxb != null && (Lxb = com.bytedance.adsdk.ugeno.ZU.LD.Lxb.C0035Lxb.Lxb(this.LD, str, lxb)) != null) {
                Lxb.Lxb();
            }
        }
    }

    public com.bytedance.adsdk.ugeno.ZU.lk.Lxb Lxb(String str) {
        Map<String, com.bytedance.adsdk.ugeno.ZU.lk.Lxb> map = this.Lxb;
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.Lxb.get(str);
    }

    @Override // com.bytedance.adsdk.ugeno.ZU.ebl
    public void Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar, String str, List<LD.Lxb> list) {
        Lxb(str, list);
    }

    public static JXs Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar, String str) {
        com.bytedance.adsdk.ugeno.ZU.lk.Lxb Lxb;
        if (lkVar != null && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() <= 0) {
                    return null;
                }
                HashMap map = new HashMap();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null && (Lxb = com.bytedance.adsdk.ugeno.ZU.lk.Lxb.C0036Lxb.Lxb(lkVar.QAg().getContext(), lkVar, jSONObjectOptJSONObject, lkVar.nBu())) != null) {
                        map.put(Lxb.LD(), Lxb);
                    }
                }
                return new JXs(lkVar, map);
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
