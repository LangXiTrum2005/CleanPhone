package com.bytedance.sdk.openadsdk.ZU.Lxb;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public int ZU;
    public AtomicInteger Lxb = new AtomicInteger(0);
    public AtomicInteger LD = new AtomicInteger(0);
    public AtomicLong lk = new AtomicLong(0);
    public AtomicInteger JXs = new AtomicInteger(0);
    public Map<Integer, Integer> lc = new HashMap();
    public AtomicBoolean ebl = new AtomicBoolean(false);

    public LD(int i) {
        this.ZU = i;
    }

    public JSONObject LD() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.Lxb.get());
            jSONObject.put("fail", this.LD.get());
            jSONObject.put("type", this.ZU);
            jSONObject.put("time", this.JXs.get());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public JSONObject Lxb() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.Lxb.get());
            jSONObject.put("fail", this.LD.get());
            jSONObject.put("type", this.ZU);
            jSONObject.put("duration", this.lk.get() / ((long) this.Lxb.get()));
            JSONObject jSONObject2 = new JSONObject();
            if (this.lc.size() > 0) {
                for (Map.Entry<Integer, Integer> entry : this.lc.entrySet()) {
                    jSONObject2.put(String.valueOf(entry.getKey()), entry.getValue());
                }
            }
            jSONObject.put("fail_error_code", jSONObject2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
