package com.bytedance.sdk.openadsdk.component.reward.ri;

import android.R;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private TTAdDislikeToast ik;
    private com.bytedance.sdk.openadsdk.common.bu lr;
    private final ri ri;

    public ik(ri riVar) {
        this.ri = riVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ik() {
        return this.ri.qmx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ka() {
        TTAdDislikeToast tTAdDislikeToast = this.ik;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    public void lr() {
        TTAdDislikeToast tTAdDislikeToast = this.ik;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.onDestroy();
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar) {
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar;
        if (this.ri.ig.isFinishing()) {
            return;
        }
        ri riVar = this.ri;
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar2 = riVar.ajz;
        boolean z = (mjVar2 instanceof com.bytedance.sdk.openadsdk.activity.single.fi) && ((com.bytedance.sdk.openadsdk.activity.single.fi) mjVar2).ri;
        if (riVar.sf.get() || !((mjVar = this.ri.ajz) == null || !mjVar.jc().igq() || z)) {
            if (this.ik == null) {
                this.ik = new TTAdDislikeToast(this.ri.ig);
                ((FrameLayout) this.ri.ig.findViewById(R.id.content)).addView(this.ik);
            }
            this.ik.show(TTAdDislikeToast.getDislikeTip());
            this.ri.sf.set(true);
            return;
        }
        if (this.lr == null) {
            try {
                lr(lrVar);
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th);
            }
        }
        com.bytedance.sdk.openadsdk.common.bu buVar = this.lr;
        if (buVar != null) {
            buVar.ri();
        }
    }

    private void lr(final com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar) {
        if (this.lr == null) {
            ri riVar = this.ri;
            com.bytedance.sdk.openadsdk.common.bu buVar = new com.bytedance.sdk.openadsdk.common.bu(riVar.ig, riVar.lr);
            this.lr = buVar;
            buVar.setCallback(new com.bytedance.sdk.openadsdk.common.bu.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.ik.1
                @Override // com.bytedance.sdk.openadsdk.common.bu.ri
                public void lr(View view) {
                    ik.this.ri.qt.set(false);
                    if (ik.this.ri.ihz.fi) {
                        if (ik.this.ri.ay != null) {
                            ik.this.ri.ay.ri(0, true);
                            return;
                        }
                        return;
                    }
                    ik.this.ri.ihz.ri(lrVar);
                    if (ik.this.ri.ihz.jbs()) {
                        ik.this.ri.ihz.ihz();
                    }
                    if (ik.this.ik()) {
                        ik.this.ri.ajz.jc().lr(ik.this.ri.ajz, 1);
                    }
                    com.bytedance.sdk.openadsdk.ay.ri.ik.ri(ik.this.ri.lr, 4);
                    ik.this.ri.wjv.ri(0);
                    ik.this.ri.wjv.fi();
                    if (ik.this.ri.aac != null) {
                        ik.this.ri.aac.ri();
                    }
                    com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar2 = lrVar;
                    if (lrVar2 != null) {
                        lrVar2.bu();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.bu.ri
                public void ri(View view) {
                    ik.this.ri.qt.set(true);
                    String str = "landing_page";
                    if (!ac.lr(ik.this.ri.lr) && !ac.ka(ik.this.ri.lr) && !ac.di(ik.this.ri.lr) && !ac.xha(ik.this.ri.lr)) {
                        if (!ik.this.ri.jbs.get()) {
                            str = "video_player";
                        } else if (dw.lr(ik.this.ri.lr)) {
                            str = "playable";
                        } else if (!ik.this.ri.lr.che()) {
                            str = CampaignEx.JSON_NATIVE_VIDEO_ENDCARD;
                        }
                    }
                    ik.this.lr.setDislikeSource(str);
                    if (ik.this.ri.ihz.fi) {
                        if (ik.this.ri.ay != null) {
                            ik.this.ri.ay.ri(8, false);
                            return;
                        }
                        return;
                    }
                    lrVar.bgr();
                    if (ik.this.ri.ihz.di()) {
                        ik.this.ri.ihz.uq();
                    }
                    if (ik.this.ik()) {
                        ik.this.ri.ajz.jc().lr(ik.this.ri.ajz, 2);
                    }
                    com.bytedance.sdk.openadsdk.ay.ri.ik.ri(ik.this.ri.lr, 8);
                    ik.this.ri.wjv.di();
                    ik.this.ri.wjv.mj();
                    if (ik.this.ri.aac != null) {
                        ik.this.ri.aac.lr();
                    }
                    if (ik.this.ri.jbs.get()) {
                        ik.this.ri.nr.set(true);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.bu.ri
                public void ri(FilterWord filterWord) {
                    if (ik.this.ri.sf.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    ik.this.ri.sf.set(true);
                    if (ik.this.ri.ajz != null) {
                        ik.this.ri.ajz.jc().ik(true);
                    }
                    ik.this.ka();
                }
            });
            ((FrameLayout) this.ri.ig.findViewById(R.id.content)).addView(this.lr);
        }
        if (this.ik == null) {
            this.ik = new TTAdDislikeToast(this.ri.ig);
            ((FrameLayout) this.ri.ig.findViewById(R.id.content)).addView(this.ik);
        }
    }

    public void ri() {
        TTAdDislikeToast tTAdDislikeToast = this.ik;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.hide();
        }
    }
}
