package com.bytedance.sdk.openadsdk.co.ri;

import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di extends com.bytedance.sdk.component.ri.ka<JSONObject, JSONObject> {
    private final WeakReference<dzy> ri;

    public di(dzy dzyVar) {
        this.ri = new WeakReference<>(dzyVar);
    }

    public static void ri(com.bytedance.sdk.component.ri.vr vrVar, dzy dzyVar) {
        vrVar.ri("interactiveFinish", new di(dzyVar));
    }

    @Override // com.bytedance.sdk.component.ri.ka
    public JSONObject ri(String str, JSONObject jSONObject, com.bytedance.sdk.component.ri.fi fiVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<dzy> weakReference = this.ri;
        if (weakReference != null && weakReference.get() != null) {
            dzy dzyVar = this.ri.get();
            wjv wjvVarKa = dzyVar.ka();
            try {
                boolean z = true;
                int i = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z = false;
                }
                int iOptInt = jSONObject.optInt("reduce_duration", -1);
                int iQuz = wjvVarKa != null ? wjvVarKa.quz() : 0;
                if (iOptInt >= 0 && iQuz >= 0) {
                    iOptInt = Math.min(iOptInt, iQuz);
                } else if (iOptInt < 0) {
                    iOptInt = iQuz >= 0 ? iQuz : 0;
                }
                if (z) {
                    dzyVar.ik(iOptInt);
                } else {
                    i = -1;
                }
                jSONObject2.put("code", i);
                jSONObject2.put("reduce_duration", iOptInt);
                return jSONObject2;
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.ac.ik("InteractiveFinishMethod", e.getMessage());
            }
        }
        return jSONObject2;
    }
}
