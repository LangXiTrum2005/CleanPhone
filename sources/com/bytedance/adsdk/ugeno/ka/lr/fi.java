package com.bytedance.adsdk.ugeno.ka.lr;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ka.di;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends ri {
    public fi(com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, di.ri riVar) {
        super(ikVar, str, riVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ka.lr.ri
    public void ri() {
        Map<String, String> map = this.di;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.di.get("id");
        if (TextUtils.isEmpty(str)) {
            ri(this.ik);
            return;
        }
        com.bytedance.adsdk.ugeno.lr.ik ikVar = this.ik;
        com.bytedance.adsdk.ugeno.lr.ik ikVarLr = ikVar.lr(ikVar);
        if (ikVarLr == null) {
            return;
        }
        ri(ikVarLr.fi(str));
    }

    private void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        if (ikVar == null) {
            return;
        }
        for (String str : this.di.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "id")) {
                ikVar.ri(str, this.di.get(str));
            }
        }
        ikVar.ri(this.di.containsKey("width"), this.di.containsKey("height"));
        ikVar.lr();
    }
}
