package com.bytedance.sdk.openadsdk.core.OY;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class VVE extends Lxb {
    private FrameLayout Lxb;
    private tD NXR;
    private FrameLayout STP;

    public VVE(@NonNull Context context) {
        super(context);
        this.LD = context;
    }

    private void LD() {
        this.ebl = le.lk(this.LD, this.NXR.getExpectExpressWidth());
        this.OY = le.lk(this.LD, this.NXR.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.ebl, this.OY);
        }
        layoutParams.width = this.ebl;
        layoutParams.height = this.OY;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.lk.nE();
        lk();
    }

    private void lk() {
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar = new com.bytedance.sdk.openadsdk.core.JXs.lk(this.LD);
        this.Lxb = lkVar;
        addView(lkVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar2 = new com.bytedance.sdk.openadsdk.core.JXs.lk(this.LD);
        this.STP = lkVar2;
        this.Lxb.addView(lkVar2, new FrameLayout.LayoutParams(-1, -1));
        this.STP.removeAllViews();
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, tD tDVar2, ViewGroup viewGroup) {
        if (tDVar == null) {
            return;
        }
        setBackgroundColor(-1);
        this.lk = tDVar;
        this.NXR = tDVar2;
        if (tDVar.lJ() == 7) {
            this.lc = "rewarded_video";
        } else {
            this.lc = "fullscreen_interstitial_ad";
        }
        LD();
        if (com.bytedance.sdk.openadsdk.core.model.kqm.lk(tDVar)) {
            this.NXR.addView(this, new ViewGroup.LayoutParams(-1, -1));
        } else {
            this.NXR.addView(this, new ViewGroup.LayoutParams(-2, -2));
        }
        int i = com.bytedance.sdk.openadsdk.utils.STP.nrJ;
        View viewFindViewById = viewGroup.findViewById(i);
        if (viewFindViewById != null) {
            Object tag = viewFindViewById.getTag(i);
            if (tag instanceof String) {
                String str = (String) tag;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(str, viewFindViewById);
            }
        }
    }

    public View getBackupContainerBackgroundView() {
        return this.Lxb;
    }

    public FrameLayout getVideoContainer() {
        return this.STP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.Lxb
    public void Lxb(View view, int i, com.bytedance.sdk.openadsdk.core.model.STP stp) {
        tD tDVar = this.NXR;
        if (tDVar != null) {
            tDVar.Lxb(view, i, stp);
        }
    }
}
