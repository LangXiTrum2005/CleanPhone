package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class igq extends di implements com.bytedance.sdk.component.adexpress.dynamic.ik {
    private int ac;
    private int ihz;
    boolean lr;
    int ri;
    private boolean uq;

    public igq(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        this.ihz = 0;
        setTag(Integer.valueOf(getClickArea()));
        ri();
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().su()) {
            return;
        }
        View view = this.vr;
        if (view != null) {
            view.setVisibility(8);
        }
        setVisibility(8);
    }

    private void ri() {
        List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> listSf = this.aw.sf();
        if (listSf == null || listSf.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar : listSf) {
            if (TextUtils.equals("skip-with-time-skip-btn", mjVar.qt().lr())) {
                int iRi = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, mjVar.mj() + (com.bytedance.sdk.component.adexpress.ka.lr() ? mjVar.aw() : 0));
                this.ac = iRi;
                this.ri = this.xha - iRi;
                break;
            }
        }
        this.ihz = this.xha - this.ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi
    public void di() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.lr) {
            layoutParams.leftMargin = this.jbs;
        } else {
            layoutParams.leftMargin = this.jbs + this.ihz;
        }
        if (this.uq && this.f18035co != null) {
            layoutParams.leftMargin = ((this.jbs + this.ihz) - ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.f18035co.ik()))) - ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.f18035co.ka()));
        }
        if (com.bytedance.sdk.component.adexpress.ka.lr()) {
            layoutParams.topMargin = this.qt - ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.f18035co.lr()));
        } else {
            layoutParams.topMargin = this.qt;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        if (com.bytedance.sdk.component.adexpress.ka.di.lr(this.bgr.getRenderRequest().ka())) {
            return true;
        }
        super.jbs();
        setPadding((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.f18035co.ik()), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.f18035co.lr()), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.f18035co.ka()), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.f18035co.ri()));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.uq && this.f18035co != null) {
            setMeasuredDimension(this.ac + ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.f18035co.ik())) + ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.f18035co.ka())), this.mj);
        } else if (this.lr) {
            setMeasuredDimension(this.xha, this.mj);
        } else {
            setMeasuredDimension(this.ri, this.mj);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik
    public void ri(CharSequence charSequence, boolean z, int i, boolean z2) {
        if (z2 && this.uq != z2) {
            this.uq = z2;
            di();
            return;
        }
        if (z && this.lr != z) {
            this.lr = z;
            di();
        }
        this.lr = z;
    }
}
