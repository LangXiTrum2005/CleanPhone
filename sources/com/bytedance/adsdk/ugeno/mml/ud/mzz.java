package com.bytedance.adsdk.ugeno.mml.ud;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.mml.mo;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class mzz extends qdl {
    public mzz(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, mo.qdl qdlVar) {
        super(lnrVar, str, qdlVar);
    }

    @Override // com.bytedance.adsdk.ugeno.mml.ud.qdl
    public void qdl() {
        Map<String, String> map = this.mo;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.mo.get("id");
        if (TextUtils.isEmpty(str)) {
            qdl(this.lnr);
            return;
        }
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.lnr;
        com.bytedance.adsdk.ugeno.ud.lnr lnrVarUd = lnrVar.ud(lnrVar);
        if (lnrVarUd == null) {
            return;
        }
        qdl(lnrVarUd.mzz(str));
    }

    private void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        if (lnrVar == null) {
            return;
        }
        for (String str : this.mo.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "id")) {
                lnrVar.qdl(str, this.mo.get(str));
            }
        }
        lnrVar.qdl(this.mo.containsKey("width"), this.mo.containsKey("height"));
        lnrVar.ud();
    }
}
