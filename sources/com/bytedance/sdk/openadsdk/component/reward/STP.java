package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: loaded from: classes2.dex */
class STP implements TTClientBidding {
    private final OY Lxb;

    public STP(Context context, com.bytedance.sdk.openadsdk.core.model.Lxb lxb, AdSlot adSlot) {
        this.Lxb = new OY(context, lxb, adSlot);
    }

    public void LD() {
        this.Lxb.Lxb();
    }

    public OY Lxb() {
        return this.Lxb;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d, String str, String str2) {
        this.Lxb.loss(d, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d) {
        this.Lxb.win(d);
    }
}
