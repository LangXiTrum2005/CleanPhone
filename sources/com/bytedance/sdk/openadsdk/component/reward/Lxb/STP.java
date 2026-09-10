package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class STP {
    private boolean JXs = false;
    com.bytedance.sdk.component.adexpress.dynamic.ZU LD;
    com.bytedance.sdk.openadsdk.component.reward.top.lk Lxb;
    private final Lxb ZU;
    private boolean lc;
    private final Activity lk;

    public STP(Lxb lxb) {
        this.lk = lxb.Pw;
        this.ZU = lxb;
    }

    public void JXs(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar;
        if (this.lc || (lkVar = this.Lxb) == null) {
            return;
        }
        lkVar.setSkipEnable(z);
    }

    public void LD(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar = this.Lxb;
        if (lkVar != null) {
            lkVar.setSoundMute(z);
        }
        com.bytedance.sdk.component.adexpress.dynamic.ZU zu = this.LD;
        if (zu != null) {
            zu.setSoundMute(z);
        }
    }

    public void Lxb() {
        if (this.JXs) {
            return;
        }
        this.JXs = true;
        Lxb lxb = this.ZU;
        com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar = lxb.Lv;
        if (lkVar != null) {
            this.Lxb = lkVar;
            this.lc = true;
        } else {
            this.Lxb = (com.bytedance.sdk.openadsdk.component.reward.top.lk) lxb.rW.findViewById(com.bytedance.sdk.openadsdk.utils.STP.qK);
        }
        com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar2 = this.Lxb;
        if (lkVar2 != null) {
            lkVar2.Lxb(this.ZU.LD);
            if (this.ZU.LD.chu()) {
                Lxb(false);
            } else {
                Lxb(this.ZU.LD.FV());
            }
        }
    }

    public void ZU(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar;
        if (this.lc || (lkVar = this.Lxb) == null) {
            return;
        }
        lkVar.setShowSkip(z);
    }

    public void lc() {
        com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar;
        if (this.lc || (lkVar = this.Lxb) == null) {
            return;
        }
        lkVar.setSkipInvisiable();
    }

    public void lk(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar;
        if (this.lc || (lkVar = this.Lxb) == null) {
            return;
        }
        lkVar.setShowSound(z);
    }

    public void JXs() {
        com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar = this.Lxb;
        if (lkVar != null) {
            lkVar.clickSound();
        }
    }

    public void ZU() {
        com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar = this.Lxb;
        if (lkVar != null) {
            lkVar.clickSkip();
        }
    }

    public void lk() {
        com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar;
        if (this.lc || (lkVar = this.Lxb) == null) {
            return;
        }
        lkVar.showSkipButton();
    }

    public void LD() {
        com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar;
        if (this.lc || (lkVar = this.Lxb) == null) {
            return;
        }
        lkVar.showCountDownText();
    }

    public void Lxb(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar;
        if (this.lc || (lkVar = this.Lxb) == null) {
            return;
        }
        lkVar.setShowDislike(z);
    }

    public void Lxb(String str, CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar;
        if (this.lc || (lkVar = this.Lxb) == null) {
            return;
        }
        lkVar.setTime(String.valueOf(str), charSequence);
    }

    public void Lxb(CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar;
        if (this.lc || (lkVar = this.Lxb) == null) {
            return;
        }
        lkVar.setSkipText(charSequence);
    }

    public void Lxb(com.bytedance.sdk.openadsdk.component.reward.top.LD ld) {
        com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar = this.Lxb;
        if (lkVar != null) {
            lkVar.setListener(ld);
        }
    }

    public void Lxb(com.bytedance.sdk.component.adexpress.dynamic.ZU zu) {
        this.LD = zu;
    }

    public void Lxb(int i) {
        View viewFindViewById;
        com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar = this.Lxb;
        if (lkVar == null || lkVar.getITopLayout() == null || i == 0 || (viewFindViewById = this.Lxb.getITopLayout().findViewById(520093713)) == null || !(viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || viewFindViewById.getWidth() <= 0 || viewFindViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        viewFindViewById.getLocationOnScreen(iArr);
        int width = i - (viewFindViewById.getWidth() + iArr[0]);
        if (width < le.lk(this.lk, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin = (le.lk(this.lk, 16.0f) - width) + ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin;
            viewFindViewById.requestLayout();
        }
    }
}
