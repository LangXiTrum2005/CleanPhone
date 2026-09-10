package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.R;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private com.bytedance.sdk.openadsdk.common.IeN LD;
    private final Lxb Lxb;
    private TTAdDislikeToast lk;

    public lk(Lxb lxb) {
        this.Lxb = lxb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lk() {
        this.lk.show(TTAdDislikeToast.getDislikeSendTip());
    }

    public void LD() {
        TTAdDislikeToast tTAdDislikeToast = this.lk;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.onDestroy();
        }
    }

    public void Lxb(com.bytedance.sdk.openadsdk.component.reward.LD.LD ld) {
        if (this.Lxb.Pw.isFinishing()) {
            return;
        }
        if (this.Lxb.sLN.get()) {
            this.lk.show(TTAdDislikeToast.getDislikeTip());
            return;
        }
        if (this.LD == null) {
            try {
                LD(ld);
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th);
            }
        }
        com.bytedance.sdk.openadsdk.common.IeN ieN = this.LD;
        if (ieN != null) {
            ieN.Lxb();
        }
    }

    private void LD(final com.bytedance.sdk.openadsdk.component.reward.LD.LD ld) {
        if (this.LD == null) {
            Lxb lxb = this.Lxb;
            com.bytedance.sdk.openadsdk.common.IeN ieN = new com.bytedance.sdk.openadsdk.common.IeN(lxb.Pw, lxb.LD);
            this.LD = ieN;
            ieN.setCallback(new com.bytedance.sdk.openadsdk.common.IeN.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.lk.1
                @Override // com.bytedance.sdk.openadsdk.common.IeN.Lxb
                public void LD(View view) {
                    lk.this.Lxb.JVA.set(false);
                    if (lk.this.Lxb.eK.JXs) {
                        if (lk.this.Lxb.id != null) {
                            lk.this.Lxb.id.Lxb(0, true);
                        }
                    } else {
                        lk.this.Lxb.eK.Lxb(ld);
                        if (lk.this.Lxb.eK.ZU()) {
                            lk.this.Lxb.eK.STP();
                        }
                        com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(lk.this.Lxb.LD, 4);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.IeN.Lxb
                public void Lxb(View view) {
                    lk.this.Lxb.JVA.set(true);
                    String str = "landing_page";
                    if (!com.bytedance.sdk.openadsdk.core.model.kqm.LD(lk.this.Lxb.LD) && !com.bytedance.sdk.openadsdk.core.model.kqm.ZU(lk.this.Lxb.LD) && !com.bytedance.sdk.openadsdk.core.model.kqm.JXs(lk.this.Lxb.LD)) {
                        if (!lk.this.Lxb.nBu.get()) {
                            str = "video_player";
                        } else if (eK.LD(lk.this.Lxb.LD)) {
                            str = "playable";
                        } else if (!lk.this.Lxb.LD.le()) {
                            str = CampaignEx.JSON_NATIVE_VIDEO_ENDCARD;
                        }
                    }
                    lk.this.LD.setDislikeSource(str);
                    if (lk.this.Lxb.eK.JXs) {
                        if (lk.this.Lxb.id != null) {
                            lk.this.Lxb.id.Lxb(8, false);
                        }
                    } else {
                        ld.VVE();
                        if (lk.this.Lxb.eK.LD()) {
                            lk.this.Lxb.eK.IeN();
                        }
                        com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(lk.this.Lxb.LD, 8);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.IeN.Lxb
                public void Lxb(FilterWord filterWord) {
                    if (lk.this.Lxb.sLN.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    lk.this.Lxb.sLN.set(true);
                    lk.this.lk();
                }
            });
            ((FrameLayout) this.Lxb.Pw.findViewById(R.id.content)).addView(this.LD);
        }
        if (this.lk == null) {
            this.lk = new TTAdDislikeToast(this.Lxb.Pw);
            ((FrameLayout) this.Lxb.Pw.findViewById(R.id.content)).addView(this.lk);
        }
    }

    public void Lxb() {
        TTAdDislikeToast tTAdDislikeToast = this.lk;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.hide();
        }
    }
}
