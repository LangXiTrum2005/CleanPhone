package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: loaded from: classes2.dex */
class NXR implements TTClientBidding {
    private final lc Lxb;

    public NXR(Context context, com.bytedance.sdk.openadsdk.core.model.Lxb lxb) {
        this.Lxb = new lc(context, lxb);
    }

    public void LD() {
        this.Lxb.Lxb();
    }

    public lc Lxb() {
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

    public void Lxb(boolean z) {
        this.Lxb.Lxb(z);
    }
}
