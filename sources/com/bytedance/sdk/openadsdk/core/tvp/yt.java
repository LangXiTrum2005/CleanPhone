package com.bytedance.sdk.openadsdk.core.tvp;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class yt extends qdl {
    private aaj exu;
    private FrameLayout qdl;
    private FrameLayout rdp;

    public yt(Context context) {
        super(context);
        this.ud = context;
    }

    private void lnr() {
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(this.ud);
        this.qdl = lnrVar;
        addView(lnrVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar2 = new com.bytedance.sdk.openadsdk.core.mo.lnr(this.ud);
        this.rdp = lnrVar2;
        this.qdl.addView(lnrVar2, new FrameLayout.LayoutParams(-1, -1));
        this.rdp.removeAllViews();
    }

    private void ud() {
        this.wd = ax.ud(this.ud, this.exu.getExpectExpressWidth());
        this.jpc = ax.ud(this.ud, this.exu.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.wd, this.jpc);
        }
        layoutParams.width = this.wd;
        layoutParams.height = this.jpc;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.lnr.gg();
        lnr();
    }

    public View getBackupContainerBackgroundView() {
        return this.qdl;
    }

    public FrameLayout getVideoContainer() {
        return this.rdp;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, aaj aajVar, ViewGroup viewGroup) {
        if (ljhVar == null) {
            return;
        }
        setBackgroundColor(-1);
        this.lnr = ljhVar;
        this.exu = aajVar;
        if (ljhVar.vz() == 7) {
            this.mo = "rewarded_video";
        } else {
            this.mo = "fullscreen_interstitial_ad";
        }
        ud();
        if (com.bytedance.sdk.openadsdk.core.model.aaj.lnr(ljhVar)) {
            this.exu.addView(this, new ViewGroup.LayoutParams(-1, -1));
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.exu.addView(this, layoutParams);
        }
        int i2 = com.bytedance.sdk.openadsdk.utils.jtx.qh;
        View viewFindViewById = viewGroup.findViewById(i2);
        if (viewFindViewById != null) {
            Object tag = viewFindViewById.getTag(i2);
            if (tag instanceof String) {
                String str = (String) tag;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(str, viewFindViewById);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.qdl
    public void qdl(View view, int i2, com.bytedance.sdk.openadsdk.core.model.jtx jtxVar) {
        aaj aajVar = this.exu;
        if (aajVar != null) {
            aajVar.qdl(view, i2, jtxVar);
        }
    }
}
