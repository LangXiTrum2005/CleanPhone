package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: loaded from: classes3.dex */
class bjy implements TTClientBidding {
    private final jpc qdl;

    public bjy(Context context, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, AdSlot adSlot) {
        this.qdl = new jpc(context, qdlVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d, String str, String str2) {
        this.qdl.loss(d, str, str2);
    }

    public jpc qdl() {
        return this.qdl;
    }

    public void ud() {
        this.qdl.qdl();
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d) {
        this.qdl.win(d);
    }
}
