package com.bytedance.sdk.openadsdk.rq.qdl;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.hzv;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.fco;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class aaj extends com.bytedance.sdk.component.qdl.jl<JSONObject, JSONObject> {
    public static final HashSet<String> qdl = new HashSet<>(Arrays.asList("closeWebview", "makeVisible", "getCurrentVisibleState"));
    private hkc lnr;
    private ljh mml;
    private com.bytedance.sdk.component.tvp.mo ud;

    public aaj(com.bytedance.sdk.component.tvp.mo moVar, hkc hkcVar, ljh ljhVar) {
        this.ud = moVar;
        this.lnr = hkcVar;
        this.mml = ljhVar;
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, com.bytedance.sdk.component.tvp.mo moVar, hkc hkcVar, ljh ljhVar) {
        bjyVar.qdl(qdl, new aaj(moVar, hkcVar, ljhVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.qdl.mml
    public JSONObject qdl(String str, JSONObject jSONObject, com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        str.getClass();
        switch (str) {
            case "getCurrentVisibleState":
                ljh ljhVar = this.mml;
                if (ljhVar != null) {
                    jSONObject2.put("visibleState", !hzv.qdl(this.ud, 20, ljhVar.ok(), false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.rq.qdl.aaj.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (aaj.this.ud != null) {
                            aaj.this.ud.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) aaj.this.ud.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(aaj.this.ud);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.ud != null) {
                    jSONObject2.put("success", true);
                    fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.rq.qdl.aaj.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (aaj.this.ud != null) {
                                aaj.this.ud.setVisibility(0);
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
