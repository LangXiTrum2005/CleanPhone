package com.bytedance.sdk.openadsdk.ri.lr.ri;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.jbs.ac;
import com.bytedance.sdk.openadsdk.core.jbs.tan;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ik {
    public lr(Context context, wjv wjvVar, AdSlot adSlot) {
        super(context, wjvVar, adSlot);
    }

    public com.bytedance.sdk.openadsdk.tan.ik.ri lr() {
        ac acVar = this.qt;
        if (acVar != null) {
            return ((tan) acVar).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.ri.lr.ri.ik
    public void ri() {
        tan tanVar = new tan(((ik) this).mj, this.lr, ((ik) this).jbs, this.sf, false);
        this.qt = tanVar;
        this.ri.ri(tanVar.getVideoController());
        ik();
    }
}
