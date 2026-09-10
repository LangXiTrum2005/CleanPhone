package com.bytedance.adsdk.ugeno.ka.lr;

import com.bytedance.adsdk.ugeno.ka.di;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ri {
    private List<com.bytedance.adsdk.ugeno.ka.ri.ka> jbs;

    public lr(com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, di.ri riVar) {
        super(ikVar, str, riVar);
        this.jbs = new CopyOnWriteArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.ka.lr.ri
    public void ri() {
        com.bytedance.adsdk.ugeno.ka.ri.ik ikVarRi;
        Map<String, String> map = this.di;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.di.get("name");
        com.bytedance.adsdk.ugeno.ka.ri.ri riVarJc = this.ik.jc();
        if (riVarJc == null || (ikVarRi = riVarJc.ri(str)) == null) {
            return;
        }
        ikVarRi.ri(str);
    }
}
