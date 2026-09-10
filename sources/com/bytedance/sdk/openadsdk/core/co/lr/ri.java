package com.bytedance.sdk.openadsdk.core.co.lr;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.uq;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends com.bytedance.adsdk.ugeno.jbs.di.lr {
    public ri(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.jbs.di.lr
    public void aw(String str) {
        super.aw(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals("null", str)) {
            return;
        }
        try {
            String str2 = String.format(uq.ri(this.lr, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str)));
            ((com.bytedance.adsdk.ugeno.jbs.di.ri) this.fi).setText("(" + str2 + ")");
        } catch (Exception unused) {
        }
    }
}
