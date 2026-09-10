package com.bytedance.sdk.component.adexpress.dynamic.lnr;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.mo.oth;

/* JADX INFO: loaded from: classes.dex */
public class yt<E extends oth> implements wd<E> {
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz lnr;
    protected com.bytedance.sdk.component.adexpress.dynamic.mml.wd mml;
    protected int mzz;
    protected oth qdl;
    protected Context ud;

    public yt(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz mzzVar, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar, int i2) {
        this.mzz = i2;
        this.ud = context;
        this.lnr = mzzVar;
        this.mml = wdVar;
        mml();
    }

    public void mml() {
        this.qdl = new oth(this.ud, this.mml.wc());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.ud, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.ud, 100 - this.mzz);
        this.qdl.setLayoutParams(layoutParams);
        try {
            this.qdl.setGuideText(this.mml.jjk());
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    /* JADX INFO: renamed from: mzz, reason: merged with bridge method [inline-methods] */
    public E lnr() {
        return (E) this.qdl;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public void qdl() {
        this.qdl.qdl();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public void ud() {
        this.qdl.ud();
    }

    public yt(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz mzzVar, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar) {
        this(context, mzzVar, wdVar, 0);
    }
}
