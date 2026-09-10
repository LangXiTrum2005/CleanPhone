package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: loaded from: classes2.dex */
class tan implements TTClientBidding {
    private final qt ri;

    public tan(Context context, com.bytedance.sdk.openadsdk.core.model.ri riVar, AdSlot adSlot) {
        this.ri = new qt(context, riVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d, String str, String str2) {
        this.ri.loss(d, str, str2);
    }

    public void lr() {
        this.ri.ri();
    }

    public qt ri() {
        return this.ri;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d) {
        this.ri.win(d);
    }
}
