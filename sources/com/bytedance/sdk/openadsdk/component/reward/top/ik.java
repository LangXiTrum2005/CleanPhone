package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends View implements ri<ik> {
    private ri<ik> ri;

    public ik(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public void clickSkip() {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            riVar.clickSkip();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public void clickSound(String str) {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            riVar.clickSound(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public View getCloseButton() {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            return riVar.getCloseButton();
        }
        return null;
    }

    public View getITopLayout() {
        Object obj = this.ri;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public ik ri(wjv wjvVar) {
        if (this.ri == null) {
            TopLayoutDislike2 topLayoutDislike2Load = new TopLayoutDislike2(getContext()).load(wjvVar);
            this.ri = topLayoutDislike2Load;
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ri(topLayoutDislike2Load, (ViewGroup) parent);
            }
        }
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public void setCountDownFor1InN(CharSequence charSequence, int i) {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            riVar.setCountDownFor1InN(charSequence, i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public void setListener(lr lrVar) {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            riVar.setListener(lrVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public void setShowDislike(boolean z) {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            riVar.setShowDislike(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public void setShowEndCardNextAd(boolean z, wjv wjvVar) {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            riVar.setShowEndCardNextAd(z, wjvVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public void setShowPlayableNextAd(boolean z, wjv wjvVar) {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            riVar.setShowPlayableNextAd(z, wjvVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public void setShowSkip(boolean z) {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            riVar.setShowSkip(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public void setShowSound(boolean z) {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            riVar.setShowSound(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public void setSkipEnable(boolean z) {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            riVar.setSkipEnable(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public void setSkipInvisiable() {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            riVar.setSkipInvisiable();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public void setSkipText(CharSequence charSequence) {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            riVar.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public void setSoundMute(boolean z) {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            riVar.setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            riVar.setTime(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public void showCloseButton() {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            riVar.showCloseButton();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public void showCountDownText() {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            riVar.showCountDownText();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ri
    public void showSkipButton() {
        ri<ik> riVar = this.ri;
        if (riVar != null) {
            riVar.showSkipButton();
        }
    }

    public ik(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ik(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        setWillNotDraw(true);
    }

    private void ri(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
        if (view != null) {
            view.setId(slm.zz);
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }
}
