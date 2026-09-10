package com.bytedance.sdk.openadsdk.core.lr;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.wjv;
import com.bytedance.sdk.openadsdk.nr.ik;
import com.bytedance.sdk.openadsdk.nr.ka;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.wjv.fi;
import com.vungle.ads.internal.saneness;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements wjv.ri {
    private final boolean ik;
    private final AdSlot lr;
    private final wjv.ri ri;

    public ri(wjv.ri riVar, AdSlot adSlot, boolean z) {
        this.ri = riVar;
        this.lr = adSlot;
        this.ik = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv.ri
    public void ri(final int i, final String str) {
        AdSlot adSlot;
        if (this.ri != null) {
            if (dzy.di() || !((adSlot = this.lr) == null || adSlot.getDurationSlotType() == 5 || fi.ri("getads_callback_async", 0) != 1)) {
                this.ri.ri(i, str);
            } else {
                dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.lr.ri.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ri.this.ri.ri(i, str);
                    }
                });
            }
            if (!this.ik || this.lr == null) {
                return;
            }
            ik.ik(new ka() { // from class: com.bytedance.sdk.openadsdk.core.lr.ri.2
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr(saneness.LOAD_AD);
                    riVar.ik(ri.this.lr.getCodeId());
                    riVar.ka(ig.ik(ri.this.lr.getDurationSlotType()));
                    riVar.ri(BuildConfig.VERSION_NAME);
                    riVar.xha(ig.ri(ri.this.lr).toString());
                    return riVar;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv.ri
    public void ri(final com.bytedance.sdk.openadsdk.core.model.ri riVar, final com.bytedance.sdk.openadsdk.core.model.ik ikVar) {
        AdSlot adSlot;
        if (this.ri != null) {
            if (!dzy.di() && ((adSlot = this.lr) == null || adSlot.getDurationSlotType() == 5 || fi.ri("getads_callback_async", 0) != 1)) {
                dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.lr.ri.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ri.this.ri.ri(riVar, ikVar);
                    }
                });
            } else {
                this.ri.ri(riVar, ikVar);
            }
            if (!this.ik || this.lr == null) {
                return;
            }
            ik.lr(new ka() { // from class: com.bytedance.sdk.openadsdk.core.lr.ri.4
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar2 = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar2.lr(saneness.LOAD_AD);
                    riVar2.ik(ri.this.lr.getCodeId());
                    riVar2.ka(ig.ik(ri.this.lr.getDurationSlotType()));
                    riVar2.ri(BuildConfig.VERSION_NAME);
                    riVar2.xha(ig.ri(ri.this.lr).toString());
                    return riVar2;
                }
            });
        }
    }
}
