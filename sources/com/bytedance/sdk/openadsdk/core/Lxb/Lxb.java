package com.bytedance.sdk.openadsdk.core.Lxb;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.VVE.ZU;
import com.bytedance.sdk.openadsdk.VVE.lk;
import com.bytedance.sdk.openadsdk.core.model.LD;
import com.bytedance.sdk.openadsdk.core.tD;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements tD.Lxb {
    private final AdSlot LD;
    private final tD.Lxb Lxb;

    public Lxb(tD.Lxb lxb, AdSlot adSlot) {
        this.Lxb = lxb;
        this.LD = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tD.Lxb
    public void Lxb(final int i, final String str) {
        AdSlot adSlot;
        if (this.Lxb != null) {
            if (hg.JXs() || !((adSlot = this.LD) == null || adSlot.getDurationSlotType() == 5 || com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("start_activity_async", 0) != 1)) {
                this.Lxb.Lxb(i, str);
            } else {
                hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Lxb.Lxb.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Lxb.this.Lxb.Lxb(i, str);
                    }
                });
            }
            AdSlot adSlot2 = this.LD;
            if (adSlot2 == null || adSlot2.isPreload()) {
                return;
            }
            lk.lk(new ZU() { // from class: com.bytedance.sdk.openadsdk.core.Lxb.Lxb.2
                @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                    com.bytedance.sdk.openadsdk.VVE.LD.Lxb lxbL = AbstractC3950lJ.l("load_ad");
                    lxbL.lk(Lxb.this.LD.getCodeId());
                    lxbL.ZU(nJ.lk(Lxb.this.LD.getDurationSlotType()));
                    lxbL.Lxb(BuildConfig.VERSION_NAME);
                    lxbL.ebl(nJ.Lxb(Lxb.this.LD).toString());
                    return lxbL;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tD.Lxb
    public void Lxb(final com.bytedance.sdk.openadsdk.core.model.Lxb lxb, final LD ld) {
        AdSlot adSlot;
        if (this.Lxb != null) {
            if (!hg.JXs() && ((adSlot = this.LD) == null || adSlot.getDurationSlotType() == 5 || com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("start_activity_async", 0) != 1)) {
                hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Lxb.Lxb.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Lxb.this.Lxb.Lxb(lxb, ld);
                    }
                });
            } else {
                this.Lxb.Lxb(lxb, ld);
            }
            AdSlot adSlot2 = this.LD;
            if (adSlot2 == null || adSlot2.isPreload()) {
                return;
            }
            lk.LD(new ZU() { // from class: com.bytedance.sdk.openadsdk.core.Lxb.Lxb.4
                @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                    com.bytedance.sdk.openadsdk.VVE.LD.Lxb lxbL = AbstractC3950lJ.l("load_ad");
                    lxbL.lk(Lxb.this.LD.getCodeId());
                    lxbL.ZU(nJ.lk(Lxb.this.LD.getDurationSlotType()));
                    lxbL.Lxb(BuildConfig.VERSION_NAME);
                    lxbL.ebl(nJ.Lxb(Lxb.this.LD).toString());
                    return lxbL;
                }
            });
        }
    }
}
