package com.bytedance.sdk.component.adexpress.dynamic.lnr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.mo.jyq;

/* JADX INFO: loaded from: classes.dex */
public class jtx implements wd {
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz lnr;
    private com.bytedance.sdk.component.adexpress.dynamic.mml.wd mml;
    private jyq qdl;
    private Context ud;

    public jtx(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz mzzVar, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar) {
        this.ud = context;
        this.lnr = mzzVar;
        this.mml = wdVar;
        mml();
    }

    private void mml() {
        this.qdl = new jyq(this.ud);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.ud, 120.0f));
        layoutParams.gravity = 17;
        this.qdl.setLayoutParams(layoutParams);
        this.qdl.setClipChildren(false);
        this.qdl.setGuideText(this.mml.jjk());
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz mzzVar = this.lnr;
        if (mzzVar != null) {
            this.qdl.setOnClickListener((View.OnClickListener) mzzVar.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public ViewGroup lnr() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public void qdl() {
        jyq jyqVar = this.qdl;
        if (jyqVar != null) {
            jyqVar.qdl();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public void ud() {
        jyq jyqVar = this.qdl;
        if (jyqVar != null) {
            jyqVar.ud();
        }
    }
}
