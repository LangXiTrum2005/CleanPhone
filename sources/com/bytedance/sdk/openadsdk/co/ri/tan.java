package com.bytedance.sdk.openadsdk.co.ri;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.pv;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class tan extends com.bytedance.sdk.component.ri.ka<JSONObject, JSONObject> {
    private wjv ik;
    private String ka;
    private dzy lr;
    private com.bytedance.sdk.component.jbs.di ri;

    public tan(com.bytedance.sdk.component.jbs.di diVar, String str, dzy dzyVar, wjv wjvVar) {
        this.ri = diVar;
        this.ka = str;
        this.lr = dzyVar;
        this.ik = wjvVar;
    }

    public static void ri(com.bytedance.sdk.component.ri.vr vrVar, com.bytedance.sdk.component.jbs.di diVar, dzy dzyVar, wjv wjvVar) {
        vrVar.ri("closeWebview", new tan(diVar, "closeWebview", dzyVar, wjvVar));
        vrVar.ri("makeVisible", new tan(diVar, "makeVisible", dzyVar, wjvVar));
        vrVar.ri("getCurrentVisibleState", new tan(diVar, "getCurrentVisibleState", dzyVar, wjvVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.ri.ka
    public JSONObject ri(String str, JSONObject jSONObject, com.bytedance.sdk.component.ri.fi fiVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.ka;
        str2.getClass();
        switch (str2) {
            case "getCurrentVisibleState":
                wjv wjvVar = this.ik;
                if (wjvVar != null) {
                    jSONObject2.put("visibleState", !pv.ri(this.ri, 20, wjvVar.go(), false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                com.bytedance.sdk.openadsdk.utils.dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.co.ri.tan.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (tan.this.ri != null) {
                            tan.this.ri.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) tan.this.ri.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(tan.this.ri);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.ri != null) {
                    jSONObject2.put("success", true);
                    com.bytedance.sdk.openadsdk.utils.dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.co.ri.tan.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (tan.this.ri != null) {
                                tan.this.ri.setVisibility(0);
                            }
                        }
                    });
                    return jSONObject2;
                }
                jSONObject2.put("success", false);
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }
}
