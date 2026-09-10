package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.STP;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends View implements Lxb<lk> {
    private Lxb<lk> Lxb;

    public lk(Context context) {
        this(context, null);
    }

    public lk Lxb(@NonNull tD tDVar) {
        if (this.Lxb != null) {
            return this;
        }
        TopLayoutDislike2 topLayoutDislike2M23load = new TopLayoutDislike2(getContext()).load(tDVar);
        this.Lxb = topLayoutDislike2M23load;
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            Lxb(topLayoutDislike2M23load, (ViewGroup) parent);
        }
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void clickSkip() {
        Lxb<lk> lxb = this.Lxb;
        if (lxb != null) {
            lxb.clickSkip();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void clickSound() {
        Lxb<lk> lxb = this.Lxb;
        if (lxb != null) {
            lxb.clickSound();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public View getCloseButton() {
        Lxb<lk> lxb = this.Lxb;
        if (lxb != null) {
            return lxb.getCloseButton();
        }
        return null;
    }

    public View getITopLayout() {
        Object obj = this.Lxb;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void setListener(LD ld) {
        Lxb<lk> lxb = this.Lxb;
        if (lxb != null) {
            lxb.setListener(ld);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void setShowDislike(boolean z) {
        Lxb<lk> lxb = this.Lxb;
        if (lxb != null) {
            lxb.setShowDislike(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void setShowSkip(boolean z) {
        Lxb<lk> lxb = this.Lxb;
        if (lxb != null) {
            lxb.setShowSkip(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void setShowSound(boolean z) {
        Lxb<lk> lxb = this.Lxb;
        if (lxb != null) {
            lxb.setShowSound(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void setSkipEnable(boolean z) {
        Lxb<lk> lxb = this.Lxb;
        if (lxb != null) {
            lxb.setSkipEnable(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void setSkipInvisiable() {
        Lxb<lk> lxb = this.Lxb;
        if (lxb != null) {
            lxb.setSkipInvisiable();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void setSkipText(CharSequence charSequence) {
        Lxb<lk> lxb = this.Lxb;
        if (lxb != null) {
            lxb.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void setSoundMute(boolean z) {
        Lxb<lk> lxb = this.Lxb;
        if (lxb != null) {
            lxb.setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        Lxb<lk> lxb = this.Lxb;
        if (lxb != null) {
            lxb.setTime(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void showCloseButton() {
        Lxb<lk> lxb = this.Lxb;
        if (lxb != null) {
            lxb.showCloseButton();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void showCountDownText() {
        Lxb<lk> lxb = this.Lxb;
        if (lxb != null) {
            lxb.showCountDownText();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void showSkipButton() {
        Lxb<lk> lxb = this.Lxb;
        if (lxb != null) {
            lxb.showSkipButton();
        }
    }

    public lk(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public lk(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        setWillNotDraw(true);
    }

    private void Lxb(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
        if (view != null) {
            view.setId(STP.Yc);
        }
    }
}
