package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class bch extends mo {
    private int qdl;

    public bch(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        this.qdl = 0;
        com.bytedance.sdk.component.adexpress.mo.bch bchVar = new com.bytedance.sdk.component.adexpress.mo.bch(context, null);
        this.bjy = bchVar;
        bchVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.bjy, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        int iQdl = (int) (com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), this.fs.mml()) + this.fs.lnr()) + (com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), this.fs.mzz()) * 5.0f));
        if (this.wd > iQdl && 4 == this.fs.jpc()) {
            this.qdl = (this.wd - iQdl) / 2;
        }
        this.wd = iQdl;
        return new FrameLayout.LayoutParams(this.wd, this.jpc);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz
    public void mo() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.wd, this.jpc);
        layoutParams.topMargin = this.to;
        int i2 = this.tvp + this.qdl;
        layoutParams.leftMargin = i2;
        layoutParams.setMarginStart(i2);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        DynamicRootView dynamicRootView;
        super.tvp();
        double dExu = this.fs.exu();
        if (com.bytedance.sdk.component.adexpress.mml.ud() && (dExu < 0.0d || dExu > 5.0d || ((dynamicRootView = this.rdp) != null && dynamicRootView.getRenderRequest() != null && this.rdp.getRenderRequest().to() != 4))) {
            this.bjy.setVisibility(8);
            return true;
        }
        double d = (dExu < 0.0d || dExu > 5.0d) ? 5.0d : dExu;
        this.bjy.setVisibility(0);
        ((com.bytedance.sdk.component.adexpress.mo.bch) this.bjy).qdl(d, this.fs.wd(), (int) this.fs.mzz(), ((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.ud())) + ((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.qdl())) + ((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.mzz())));
        return true;
    }
}
