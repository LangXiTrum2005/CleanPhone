package com.bytedance.adsdk.ugeno.mml.ud;

import com.bytedance.adsdk.ugeno.mml.mo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ud extends qdl {
    private List<com.bytedance.adsdk.ugeno.mml.qdl.mml> tvp;

    public ud(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, mo.qdl qdlVar) {
        super(lnrVar, str, qdlVar);
        this.tvp = new CopyOnWriteArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.mml.ud.qdl
    public void qdl() {
        com.bytedance.adsdk.ugeno.mml.qdl.lnr lnrVarQdl;
        Map<String, String> map = this.mo;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.mo.get("name");
        com.bytedance.adsdk.ugeno.mml.qdl.qdl qdlVarAg = this.lnr.ag();
        if (qdlVarAg == null || (lnrVarQdl = qdlVarAg.qdl(str)) == null) {
            return;
        }
        lnrVarQdl.qdl(str);
    }
}
