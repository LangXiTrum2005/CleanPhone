package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: loaded from: classes2.dex */
class nr implements TTClientBidding {
    private final mj ri;

    public nr(Context context, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        this.ri = new mj(context, riVar);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d, String str, String str2) {
        this.ri.loss(d, str, str2);
    }

    public void lr() {
        this.ri.ri();
    }

    public mj ri() {
        return this.ri;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d) {
        this.ri.win(d);
    }
}
