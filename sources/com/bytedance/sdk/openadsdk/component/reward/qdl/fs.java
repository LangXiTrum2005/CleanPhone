package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class fs {
    private final Activity lnr;
    private final qdl mml;
    private boolean mo;
    private boolean mzz = false;
    com.bytedance.sdk.openadsdk.component.reward.top.lnr qdl;
    com.bytedance.sdk.component.adexpress.dynamic.mml ud;

    public fs(qdl qdlVar) {
        this.lnr = qdlVar.ag;
        this.mml = qdlVar;
    }

    public void lnr(boolean z2) {
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar;
        if (this.mo || (lnrVar = this.qdl) == null) {
            return;
        }
        lnrVar.setShowSound(z2);
    }

    public void mml(boolean z2) {
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar;
        if (this.mo || (lnrVar = this.qdl) == null) {
            return;
        }
        lnrVar.setShowSkip(z2);
    }

    public void mzz(boolean z2) {
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar;
        if (this.mo || (lnrVar = this.qdl) == null) {
            return;
        }
        lnrVar.setSkipEnable(z2);
    }

    public void qdl() {
        if (this.mzz) {
            return;
        }
        this.mzz = true;
        qdl qdlVar = this.mml;
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar = qdlVar.fzn;
        if (lnrVar != null) {
            this.qdl = lnrVar;
            this.mo = true;
        } else {
            this.qdl = (com.bytedance.sdk.openadsdk.component.reward.top.lnr) qdlVar.ax.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.mwc);
        }
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar2 = this.qdl;
        if (lnrVar2 != null) {
            lnrVar2.qdl(this.mml.ud);
            if (this.mml.ud.uj()) {
                qdl(false);
            } else {
                qdl(this.mml.ud.tvf());
            }
        }
    }

    public void ud(boolean z2) {
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar = this.qdl;
        if (lnrVar != null) {
            lnrVar.setSoundMute(z2);
        }
        com.bytedance.sdk.component.adexpress.dynamic.mml mmlVar = this.ud;
        if (mmlVar != null) {
            mmlVar.setSoundMute(z2);
        }
    }

    public void lnr() {
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar;
        if (this.mo || (lnrVar = this.qdl) == null) {
            return;
        }
        lnrVar.showSkipButton();
    }

    public void mml() {
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar = this.qdl;
        if (lnrVar != null) {
            lnrVar.clickSkip();
        }
    }

    public void mzz() {
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar;
        if (this.mo || (lnrVar = this.qdl) == null) {
            return;
        }
        lnrVar.setSkipInvisiable();
    }

    public void ud() {
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar;
        if (this.mo || (lnrVar = this.qdl) == null) {
            return;
        }
        lnrVar.showCountDownText();
    }

    public void qdl(boolean z2) {
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar;
        if (this.mo || (lnrVar = this.qdl) == null) {
            return;
        }
        lnrVar.setShowDislike(z2);
    }

    public void qdl(String str, CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar;
        if (this.mo || (lnrVar = this.qdl) == null) {
            return;
        }
        lnrVar.setTime(String.valueOf(str), charSequence);
    }

    public void qdl(CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar;
        if (this.mo || (lnrVar = this.qdl) == null) {
            return;
        }
        lnrVar.setSkipText(charSequence);
    }

    public void qdl(String str) {
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar = this.qdl;
        if (lnrVar != null) {
            lnrVar.clickSound(str);
        }
    }

    public void qdl(com.bytedance.sdk.openadsdk.component.reward.top.ud udVar) {
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar = this.qdl;
        if (lnrVar != null) {
            lnrVar.setListener(udVar);
        }
    }

    public void qdl(com.bytedance.sdk.component.adexpress.dynamic.mml mmlVar) {
        this.ud = mmlVar;
    }

    public void qdl(int i2) {
        View viewFindViewById;
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar = this.qdl;
        if (lnrVar == null || lnrVar.getITopLayout() == null || i2 == 0 || (viewFindViewById = this.qdl.getITopLayout().findViewById(520093713)) == null || !(viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || viewFindViewById.getWidth() <= 0 || viewFindViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        viewFindViewById.getLocationOnScreen(iArr);
        int width = i2 - (viewFindViewById.getWidth() + iArr[0]);
        if (width < ax.ud(this.lnr, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin = (ax.ud(this.lnr, 16.0f) - width) + ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin;
            viewFindViewById.requestLayout();
        }
    }
}
