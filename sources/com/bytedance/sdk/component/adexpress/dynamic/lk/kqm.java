package com.bytedance.sdk.component.adexpress.dynamic.lk;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.lc.HD;

/* JADX INFO: loaded from: classes2.dex */
public class kqm<E extends HD> implements ebl<E> {
    protected int JXs;
    protected Context LD;
    protected HD Lxb;
    protected com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl ZU;
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs lk;

    public kqm(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs jXs, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar, int i) {
        this.JXs = i;
        this.LD = context;
        this.lk = jXs;
        this.ZU = eblVar;
        ZU();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    /* JADX INFO: renamed from: JXs, reason: merged with bridge method [inline-methods] */
    public E lk() {
        return (E) this.Lxb;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public void LD() {
        this.Lxb.LD();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public void Lxb() {
        this.Lxb.Lxb();
    }

    public void ZU() {
        this.Lxb = new HD(this.LD, this.ZU.NDz());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.LD, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.LD, 100 - this.JXs);
        this.Lxb.setLayoutParams(layoutParams);
        try {
            this.Lxb.setGuideText(this.ZU.Ns());
        } catch (Throwable unused) {
        }
    }

    public kqm(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs jXs, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar) {
        this(context, jXs, eblVar, 0);
    }
}
