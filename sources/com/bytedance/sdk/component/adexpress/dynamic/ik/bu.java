package com.bytedance.sdk.component.adexpress.dynamic.ik;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.di.ihz;

/* JADX INFO: loaded from: classes2.dex */
public class bu<E extends ihz> implements xha<E> {
    protected int fi;
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi ik;
    protected com.bytedance.sdk.component.adexpress.dynamic.ka.xha ka;
    protected Context lr;
    protected ihz ri;

    public bu(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi fiVar, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar, int i) {
        this.fi = i;
        this.lr = context;
        this.ik = fiVar;
        this.ka = xhaVar;
        ka();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    /* JADX INFO: renamed from: fi, reason: merged with bridge method [inline-methods] */
    public E ik() {
        return (E) this.ri;
    }

    public void ka() {
        this.ri = new ihz(this.lr, this.ka.kt());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.lr, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.lr, 100 - this.fi);
        this.ri.setLayoutParams(layoutParams);
        try {
            this.ri.setGuideText(this.ka.whw());
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void lr() {
        this.ri.lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void ri() {
        this.ri.ri();
    }

    public bu(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi fiVar, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar) {
        this(context, fiVar, xhaVar, 0);
    }
}
