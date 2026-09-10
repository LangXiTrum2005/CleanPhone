package com.bytedance.sdk.openadsdk.JVA.Lxb;

import com.bytedance.sdk.component.Lxb.kqm;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.bytedance.sdk.openadsdk.core.model.tD;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lc extends com.bytedance.sdk.component.Lxb.JXs<JSONObject, JSONObject> {
    private final WeakReference<Ivz> Lxb;

    public lc(Ivz ivz) {
        this.Lxb = new WeakReference<>(ivz);
    }

    public static void Lxb(kqm kqmVar, Ivz ivz) {
        kqmVar.Lxb("interactiveFinish", new lc(ivz));
    }

    @Override // com.bytedance.sdk.component.Lxb.JXs
    public JSONObject Lxb(JSONObject jSONObject, com.bytedance.sdk.component.Lxb.lc lcVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<Ivz> weakReference = this.Lxb;
        if (weakReference != null && weakReference.get() != null) {
            Ivz ivz = this.Lxb.get();
            tD tDVarLk = ivz.lk();
            try {
                boolean z = true;
                int i = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z = false;
                }
                int iOptInt = jSONObject.optInt("reduce_duration", -1);
                int iTA = tDVarLk != null ? tDVarLk.TA() : 0;
                if (iOptInt >= 0 && iTA >= 0) {
                    iOptInt = Math.min(iOptInt, iTA);
                } else if (iOptInt < 0) {
                    iOptInt = iTA >= 0 ? iTA : 0;
                }
                if (z) {
                    ivz.lk(iOptInt);
                } else {
                    i = -1;
                }
                jSONObject2.put("code", i);
                jSONObject2.put("reduce_duration", iOptInt);
            } catch (JSONException e) {
                sLN.Lxb("InteractiveFinishMethod", e.getMessage());
            }
        }
        return jSONObject2;
    }
}
