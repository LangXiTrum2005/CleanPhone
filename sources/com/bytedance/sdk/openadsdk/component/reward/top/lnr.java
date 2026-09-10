package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.jtx;

/* JADX INFO: loaded from: classes3.dex */
public class lnr extends View implements qdl<lnr> {
    private qdl<lnr> qdl;

    public lnr(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void clickSkip() {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.clickSkip();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void clickSound(String str) {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.clickSound(str);
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public View getCloseButton() {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            return qdlVar.getCloseButton();
        }
        return null;
    }

    public View getITopLayout() {
        Object obj = this.qdl;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public lnr qdl(ljh ljhVar) {
        if (this.qdl == null) {
            TopLayoutDislike2 topLayoutDislike2Load = new TopLayoutDislike2(getContext()).load(ljhVar);
            this.qdl = topLayoutDislike2Load;
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                qdl(topLayoutDislike2Load, (ViewGroup) parent);
            }
        }
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setCountDownFor1InN(CharSequence charSequence, int i2) {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.setCountDownFor1InN(charSequence, i2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setListener(ud udVar) {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.setListener(udVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setShowDislike(boolean z2) {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.setShowDislike(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setShowEndCardNextAd(boolean z2, ljh ljhVar) {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.setShowEndCardNextAd(z2, ljhVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setShowPlayableNextAd(boolean z2, ljh ljhVar) {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.setShowPlayableNextAd(z2, ljhVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setShowSkip(boolean z2) {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.setShowSkip(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setShowSound(boolean z2) {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.setShowSound(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setSkipEnable(boolean z2) {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.setSkipEnable(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setSkipInvisiable() {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.setSkipInvisiable();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setSkipText(CharSequence charSequence) {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setSoundMute(boolean z2) {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.setSoundMute(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.setTime(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void showCloseButton() {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.showCloseButton();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void showCountDownText() {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.showCountDownText();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void showSkipButton() {
        qdl<lnr> qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.showSkipButton();
        }
    }

    public lnr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public lnr(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setVisibility(8);
        setWillNotDraw(true);
    }

    private void qdl(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
        if (view != null) {
            view.setId(jtx.tvf);
        }
    }
}
