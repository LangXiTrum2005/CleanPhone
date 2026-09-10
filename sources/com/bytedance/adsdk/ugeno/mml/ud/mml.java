package com.bytedance.adsdk.ugeno.mml.ud;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.mml.mo;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class mml extends qdl {
    public mml(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, mo.qdl qdlVar) {
        super(lnrVar, str, qdlVar);
    }

    @Override // com.bytedance.adsdk.ugeno.mml.ud.qdl
    public void qdl() {
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar;
        com.bytedance.adsdk.ugeno.ud.lnr lnrVarUd;
        com.bytedance.adsdk.ugeno.qdl.qdl qdlVarExu;
        Map<String, String> map = this.mo;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.mo.get("name");
        if (TextUtils.isEmpty(str) || (lnrVarUd = (lnrVar = this.lnr).ud(lnrVar)) == null || (qdlVarExu = lnrVarUd.jpc(str).exu(str)) == null) {
            return;
        }
        qdlVarExu.ud();
        qdlVarExu.qdl(new com.bytedance.adsdk.ugeno.qdl.ud() { // from class: com.bytedance.adsdk.ugeno.mml.ud.mml.1
            @Override // com.bytedance.adsdk.ugeno.qdl.ud
            public void qdl() {
            }

            @Override // com.bytedance.adsdk.ugeno.qdl.ud
            public void ud() {
                mml.this.lnr();
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.mml.ud.qdl
    public void ud() {
    }
}
