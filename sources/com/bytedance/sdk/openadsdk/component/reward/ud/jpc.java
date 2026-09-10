package com.bytedance.sdk.openadsdk.component.reward.ud;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes3.dex */
public class jpc extends ud {
    private com.bytedance.sdk.openadsdk.component.reward.view.lnr bjy;

    public jpc(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        super(qdlVar);
    }

    private boolean rc() {
        return ljh.mzz(this.ud);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud
    public ud.qdl mml() {
        return new ud.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.ud.jpc.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud.qdl
            public void qdl(boolean z2) {
                if (jpc.this.bjy != null) {
                    jpc.this.bjy.setIsMute(z2);
                }
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud
    public boolean mo() {
        return rc();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud
    public boolean mzz() {
        return rc();
    }

    public FrameLayout vu() {
        com.bytedance.sdk.openadsdk.component.reward.view.lnr lnrVar = this.bjy;
        if (lnrVar != null) {
            return lnrVar.getVideoContainer();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud
    public void wd() {
        this.mo.mml(8);
        this.mo.ud(8);
        if (this.ud.dk() == 2) {
            this.jpc.qdl(false);
            this.jpc.lnr(false);
            this.jpc.mml(false);
            this.mo.mo(8);
            return;
        }
        this.jpc.qdl(this.ud.tvf());
        this.jpc.lnr(rc());
        this.jpc.mml(rc());
        if (rc()) {
            this.mo.mo(8);
        } else {
            this.jpc.mzz();
            this.mo.mo(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.ud
    public void qdl(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.reward.view.lnr lnrVar = new com.bytedance.sdk.openadsdk.component.reward.view.lnr(this.qdl.ag, this.rq);
        this.bjy = lnrVar;
        lnrVar.setDownloadListener(this.fs);
        com.bytedance.sdk.openadsdk.component.reward.view.lnr lnrVar2 = this.bjy;
        ljh ljhVar = this.ud;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        lnrVar2.qdl(ljhVar, qdlVar.taz, qdlVar.zlt, this.lnr, this.mml);
        frameLayout.addView(this.bjy.getInteractionStyleRootView());
    }

    public static boolean qdl(ljh ljhVar) {
        return (ljhVar.mq() || ljhVar.nv() == 100.0f) ? false : true;
    }
}
