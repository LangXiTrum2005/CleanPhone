package com.bytedance.sdk.openadsdk.core.rq.ud;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ljh;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class qdl extends com.bytedance.adsdk.ugeno.tvp.mo.ud {
    public qdl(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.tvp.mo.ud
    public void rdp(String str) {
        super.rdp(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals(AbstractJsonLexerKt.NULL, str)) {
            return;
        }
        try {
            String str2 = String.format(ljh.qdl(this.ud, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str)));
            ((com.bytedance.adsdk.ugeno.tvp.mo.qdl) this.mzz).setText("(" + str2 + ")");
        } catch (Exception unused) {
        }
    }
}
