package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class uq extends di implements com.bytedance.sdk.component.adexpress.dynamic.ik {
    private int ac;
    private int lr;
    private int ri;

    public uq(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        ri();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi
    public void di() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i = this.jbs;
        layoutParams.leftMargin = i;
        layoutParams.topMargin = this.qt;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        setBackground(getBackgroundDrawable());
        setPadding((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.f18035co.ik()), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.f18035co.lr()), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.f18035co.ka()), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.f18035co.ri()));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.ac == 0) {
            setMeasuredDimension(this.lr, this.mj);
        } else {
            setMeasuredDimension(this.ri, this.mj);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik
    public void ri(CharSequence charSequence, boolean z, int i, boolean z2) {
        this.ac = i;
    }

    private void ri() {
        List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> listSf = this.aw.sf();
        if (listSf == null || listSf.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar : listSf) {
            if (mjVar.qt().ri() == 21) {
                this.ri = (int) (this.xha - com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, mjVar.mj()));
            }
            if (mjVar.qt().ri() == 20) {
                this.lr = (int) (this.xha - com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, mjVar.mj()));
            }
        }
    }
}
