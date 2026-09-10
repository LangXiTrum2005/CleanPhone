package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import com.bytedance.sdk.openadsdk.component.reward.ri.bu;
import com.bytedance.sdk.openadsdk.component.reward.ri.vr;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: loaded from: classes2.dex */
public class xha {
    private boolean fi;
    private boolean ik;
    private bu ka;
    private RFEndCardBackUpLayout lr;
    private final com.bytedance.sdk.openadsdk.component.reward.ri.ri ri;

    public xha(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        this.ri = riVar;
    }

    public boolean fi() {
        return this.fi;
    }

    public void ik() {
        bu buVar = this.ka;
        if (buVar != null) {
            buVar.ri();
        }
    }

    public void ka() {
        bu buVar = this.ka;
        if (buVar != null) {
            buVar.lr();
        }
    }

    public void lr() {
        this.fi = true;
        qd.ri((View) this.lr, 0);
    }

    public void ri() {
        if (this.ik) {
            return;
        }
        this.ik = true;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = (RFEndCardBackUpLayout) this.ri.pv.findViewById(slm.eb);
        this.lr = rFEndCardBackUpLayout;
        if (rFEndCardBackUpLayout != null) {
            rFEndCardBackUpLayout.init(this.ri);
        }
        if (this.ri.lr.zz()) {
            this.ka = new bu(this.ri);
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.core.ik.fi fiVar) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.lr;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        qd.ri(rFEndCardBackUpLayout, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.xha.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        bu buVar = this.ka;
        if (buVar != null) {
            buVar.ri(fiVar);
        }
    }

    public boolean ri(vr vrVar) {
        this.fi = true;
        bu buVar = this.ka;
        if (buVar == null || !buVar.ri(vrVar)) {
            return false;
        }
        qd.ri((View) this.lr, 0);
        return true;
    }

    public void ri(int i) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.lr;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        rFEndCardBackUpLayout.setShownAdCount(i);
    }
}
