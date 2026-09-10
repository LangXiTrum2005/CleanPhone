package com.bytedance.sdk.openadsdk.rq.qdl;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.hzv;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.fco;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class exc extends com.bytedance.sdk.component.qdl.mml<JSONObject, JSONObject> {
    private ljh lnr;
    private String mml;
    private com.bytedance.sdk.component.tvp.mo qdl;
    private hkc ud;

    public exc(com.bytedance.sdk.component.tvp.mo moVar, String str, hkc hkcVar, ljh ljhVar) {
        this.qdl = moVar;
        this.mml = str;
        this.ud = hkcVar;
        this.lnr = ljhVar;
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, com.bytedance.sdk.component.tvp.mo moVar, hkc hkcVar, ljh ljhVar) {
        bjyVar.qdl("closeWebview", new exc(moVar, "closeWebview", hkcVar, ljhVar));
        bjyVar.qdl("makeVisible", new exc(moVar, "makeVisible", hkcVar, ljhVar));
        bjyVar.qdl("getCurrentVisibleState", new exc(moVar, "getCurrentVisibleState", hkcVar, ljhVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.qdl.mml
    public JSONObject qdl(String str, JSONObject jSONObject, com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.mml;
        str2.getClass();
        switch (str2) {
            case "getCurrentVisibleState":
                ljh ljhVar = this.lnr;
                if (ljhVar != null) {
                    jSONObject2.put("visibleState", !hzv.qdl(this.qdl, 20, ljhVar.ok(), false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.rq.qdl.exc.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (exc.this.qdl != null) {
                            exc.this.qdl.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) exc.this.qdl.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(exc.this.qdl);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.qdl != null) {
                    jSONObject2.put("success", true);
                    fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.rq.qdl.exc.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (exc.this.qdl != null) {
                                exc.this.qdl.setVisibility(0);
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
