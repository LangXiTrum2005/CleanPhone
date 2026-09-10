package com.bytedance.sdk.component.adexpress.dynamic.ik;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.di.ac;

/* JADX INFO: loaded from: classes2.dex */
public class slm implements xha {
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi ik;
    private com.bytedance.sdk.component.adexpress.dynamic.ka.xha ka;
    private Context lr;
    private ac ri;

    public slm(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi fiVar, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar) {
        this.lr = context;
        this.ik = fiVar;
        this.ka = xhaVar;
        ka();
    }

    private void ka() {
        this.ri = new ac(this.lr);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.lr, 120.0f));
        layoutParams.gravity = 17;
        this.ri.setLayoutParams(layoutParams);
        this.ri.setClipChildren(false);
        this.ri.setGuideText(this.ka.whw());
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi fiVar = this.ik;
        if (fiVar != null) {
            this.ri.setOnClickListener((View.OnClickListener) fiVar.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public ViewGroup ik() {
        return this.ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void lr() {
        ac acVar = this.ri;
        if (acVar != null) {
            acVar.lr();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void ri() {
        ac acVar = this.ri;
        if (acVar != null) {
            acVar.ri();
        }
    }
}
