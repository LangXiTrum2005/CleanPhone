package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import com.bytedance.sdk.openadsdk.component.reward.qdl.bjy;
import com.bytedance.sdk.openadsdk.component.reward.qdl.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;

/* JADX INFO: loaded from: classes3.dex */
public class jpc {
    private boolean lnr;
    private yt mml;
    private boolean mzz;
    private final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdl;
    private RFEndCardBackUpLayout ud;

    public jpc(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        this.qdl = qdlVar;
    }

    public void lnr() {
        yt ytVar = this.mml;
        if (ytVar != null) {
            ytVar.qdl();
        }
    }

    public void mml() {
        yt ytVar = this.mml;
        if (ytVar != null) {
            ytVar.ud();
        }
    }

    public boolean mzz() {
        return this.mzz;
    }

    public void qdl() {
        if (this.lnr) {
            return;
        }
        this.lnr = true;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = (RFEndCardBackUpLayout) this.qdl.ax.findViewById(jtx.ji);
        this.ud = rFEndCardBackUpLayout;
        if (rFEndCardBackUpLayout != null) {
            rFEndCardBackUpLayout.init(this.qdl);
        }
        if (this.qdl.ud.uj()) {
            this.mml = new yt(this.qdl);
        }
    }

    public void ud() {
        this.mzz = true;
        ax.qdl((View) this.ud, 0);
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.lnr.mzz mzzVar) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.ud;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        ax.qdl(rFEndCardBackUpLayout, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.jpc.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        yt ytVar = this.mml;
        if (ytVar != null) {
            ytVar.qdl(mzzVar);
        }
    }

    public boolean qdl(bjy bjyVar) {
        this.mzz = true;
        yt ytVar = this.mml;
        if (ytVar == null || !ytVar.qdl(bjyVar)) {
            return false;
        }
        ax.qdl((View) this.ud, 0);
        return true;
    }

    public void qdl(int i2) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.ud;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        rFEndCardBackUpLayout.setShownAdCount(i2);
    }
}
