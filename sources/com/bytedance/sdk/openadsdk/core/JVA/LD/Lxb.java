package com.bytedance.sdk.openadsdk.core.JVA.LD;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.tD;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends com.bytedance.adsdk.ugeno.QAg.lc.LD {
    public Lxb(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.QAg.lc.LD
    public void ebl(String str) {
        super.ebl(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals("null", str)) {
            return;
        }
        try {
            String str2 = String.format(tD.Lxb(this.JXs, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str)));
            ((com.bytedance.adsdk.ugeno.QAg.lc.Lxb) this.OY).setText("(" + str2 + ")");
        } catch (Exception unused) {
        }
    }
}
