package com.bytedance.sdk.openadsdk.component.reward.ri;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class co {
    private boolean di;
    private boolean fi = false;
    private final Activity ik;
    private final ri ka;
    com.bytedance.sdk.component.adexpress.dynamic.ka lr;
    com.bytedance.sdk.openadsdk.component.reward.top.ik ri;

    public co(ri riVar) {
        this.ik = riVar.ig;
        this.ka = riVar;
    }

    public void fi(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar;
        if (this.di || (ikVar = this.ri) == null) {
            return;
        }
        ikVar.setSkipEnable(z);
    }

    public void ik(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar;
        if (this.di || (ikVar = this.ri) == null) {
            return;
        }
        ikVar.setShowSound(z);
    }

    public void ka(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar;
        if (this.di || (ikVar = this.ri) == null) {
            return;
        }
        ikVar.setShowSkip(z);
    }

    public void lr(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar = this.ri;
        if (ikVar != null) {
            ikVar.setSoundMute(z);
        }
        com.bytedance.sdk.component.adexpress.dynamic.ka kaVar = this.lr;
        if (kaVar != null) {
            kaVar.setSoundMute(z);
        }
    }

    public void ri() {
        if (this.fi) {
            return;
        }
        this.fi = true;
        ri riVar = this.ka;
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar = riVar.pc;
        if (ikVar != null) {
            this.ri = ikVar;
            this.di = true;
        } else {
            this.ri = (com.bytedance.sdk.openadsdk.component.reward.top.ik) riVar.pv.findViewById(com.bytedance.sdk.openadsdk.utils.slm.gz);
        }
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar2 = this.ri;
        if (ikVar2 != null) {
            ikVar2.ri(this.ka.lr);
            if (this.ka.lr.zz()) {
                ri(false);
            } else {
                ri(this.ka.lr.nlk());
            }
        }
    }

    public void fi() {
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar;
        if (this.di || (ikVar = this.ri) == null) {
            return;
        }
        ikVar.setSkipInvisiable();
    }

    public void ik() {
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar;
        if (this.di || (ikVar = this.ri) == null) {
            return;
        }
        ikVar.showSkipButton();
    }

    public void ka() {
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar = this.ri;
        if (ikVar != null) {
            ikVar.clickSkip();
        }
    }

    public void lr() {
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar;
        if (this.di || (ikVar = this.ri) == null) {
            return;
        }
        ikVar.showCountDownText();
    }

    public void ri(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar;
        if (this.di || (ikVar = this.ri) == null) {
            return;
        }
        ikVar.setShowDislike(z);
    }

    public void ri(String str, CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar;
        if (this.di || (ikVar = this.ri) == null) {
            return;
        }
        ikVar.setTime(String.valueOf(str), charSequence);
    }

    public void ri(CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar;
        if (this.di || (ikVar = this.ri) == null) {
            return;
        }
        ikVar.setSkipText(charSequence);
    }

    public void ri(String str) {
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar = this.ri;
        if (ikVar != null) {
            ikVar.clickSound(str);
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.component.reward.top.lr lrVar) {
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar = this.ri;
        if (ikVar != null) {
            ikVar.setListener(lrVar);
        }
    }

    public void ri(com.bytedance.sdk.component.adexpress.dynamic.ka kaVar) {
        this.lr = kaVar;
    }

    public void ri(int i) {
        View viewFindViewById;
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar = this.ri;
        if (ikVar == null || ikVar.getITopLayout() == null || i == 0 || (viewFindViewById = this.ri.getITopLayout().findViewById(520093713)) == null || !(viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || viewFindViewById.getWidth() <= 0 || viewFindViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        viewFindViewById.getLocationOnScreen(iArr);
        int width = i - (iArr[0] + viewFindViewById.getWidth());
        if (width < qd.lr(this.ik, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin += qd.lr(this.ik, 16.0f) - width;
            viewFindViewById.requestLayout();
        }
    }
}
