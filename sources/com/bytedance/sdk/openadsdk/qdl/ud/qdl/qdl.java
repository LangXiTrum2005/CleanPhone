package com.bytedance.sdk.openadsdk.qdl.ud.qdl;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.jtx;
import com.bytedance.sdk.openadsdk.core.tvp.aaj;

/* JADX INFO: loaded from: classes3.dex */
public class qdl extends com.bytedance.sdk.openadsdk.core.tvp.qdl {
    private com.bytedance.sdk.openadsdk.qdl.ud.qdl exu;
    private aaj qdl;

    public qdl(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.qdl
    public void qdl(View view, int i2, jtx jtxVar) {
        aaj aajVar = this.qdl;
        if (aajVar != null) {
            aajVar.qdl(view, i2, jtxVar);
        }
    }

    public void setExtraFuncationHelper(com.bytedance.sdk.openadsdk.qdl.ud.qdl qdlVar) {
        this.exu = qdlVar;
    }

    public void qdl(aaj aajVar) {
        this.qdl = aajVar;
        aajVar.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }
}
