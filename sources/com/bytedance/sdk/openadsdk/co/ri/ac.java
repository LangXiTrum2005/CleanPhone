package com.bytedance.sdk.openadsdk.co.ri;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.pv;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ac extends com.bytedance.sdk.component.ri.nr<JSONObject, JSONObject> {
    public static final HashSet<String> ri = new HashSet<>(Arrays.asList("closeWebview", "makeVisible", "getCurrentVisibleState"));
    private dzy ik;
    private wjv ka;
    private com.bytedance.sdk.component.jbs.di lr;

    public ac(com.bytedance.sdk.component.jbs.di diVar, dzy dzyVar, wjv wjvVar) {
        this.lr = diVar;
        this.ik = dzyVar;
        this.ka = wjvVar;
    }

    public static void ri(com.bytedance.sdk.component.ri.vr vrVar, com.bytedance.sdk.component.jbs.di diVar, dzy dzyVar, wjv wjvVar) {
        vrVar.ri(ri, new ac(diVar, dzyVar, wjvVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.ri.ka
    public JSONObject ri(String str, JSONObject jSONObject, com.bytedance.sdk.component.ri.fi fiVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        str.getClass();
        switch (str) {
            case "getCurrentVisibleState":
                wjv wjvVar = this.ka;
                if (wjvVar != null) {
                    jSONObject2.put("visibleState", !pv.ri(this.lr, 20, wjvVar.go(), false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                com.bytedance.sdk.openadsdk.utils.dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.co.ri.ac.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ac.this.lr != null) {
                            ac.this.lr.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) ac.this.lr.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(ac.this.lr);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.lr != null) {
                    jSONObject2.put("success", true);
                    com.bytedance.sdk.openadsdk.utils.dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.co.ri.ac.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (ac.this.lr != null) {
                                ac.this.lr.setVisibility(0);
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
