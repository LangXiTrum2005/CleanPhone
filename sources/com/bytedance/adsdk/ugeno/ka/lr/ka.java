package com.bytedance.adsdk.ugeno.ka.lr;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ka.di;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends ri {
    public ka(com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, di.ri riVar) {
        super(ikVar, str, riVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ka.lr.ri
    public void ri() {
        com.bytedance.adsdk.ugeno.lr.ik ikVar;
        com.bytedance.adsdk.ugeno.lr.ik ikVarLr;
        com.bytedance.adsdk.ugeno.ri.ri riVarCo;
        Map<String, String> map = this.di;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.di.get("name");
        if (TextUtils.isEmpty(str) || (ikVarLr = (ikVar = this.ik).lr(ikVar)) == null || (riVarCo = ikVarLr.mj(str).co(str)) == null) {
            return;
        }
        riVarCo.lr();
        riVarCo.ri(new com.bytedance.adsdk.ugeno.ri.lr() { // from class: com.bytedance.adsdk.ugeno.ka.lr.ka.1
            @Override // com.bytedance.adsdk.ugeno.ri.lr
            public void lr() {
                ka.this.ik();
            }

            @Override // com.bytedance.adsdk.ugeno.ri.lr
            public void ri() {
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.ka.lr.ri
    public void lr() {
    }
}
