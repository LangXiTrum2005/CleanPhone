package com.bytedance.sdk.component.adexpress.dynamic.lk;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.lc.Sfi;

/* JADX INFO: loaded from: classes2.dex */
public class VVE implements ebl {
    private Context LD;
    private Sfi Lxb;
    private com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl ZU;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs lk;

    public VVE(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs jXs, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar) {
        this.LD = context;
        this.lk = jXs;
        this.ZU = eblVar;
        ZU();
    }

    private void ZU() {
        this.Lxb = new Sfi(this.LD);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.LD, 120.0f));
        layoutParams.gravity = 17;
        this.Lxb.setLayoutParams(layoutParams);
        this.Lxb.setClipChildren(false);
        this.Lxb.setGuideText(this.ZU.Ns());
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs jXs = this.lk;
        if (jXs != null) {
            this.Lxb.setOnClickListener((View.OnClickListener) jXs.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public void LD() {
        Sfi sfi = this.Lxb;
        if (sfi != null) {
            sfi.LD();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public void Lxb() {
        Sfi sfi = this.Lxb;
        if (sfi != null) {
            sfi.Lxb();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public ViewGroup lk() {
        return this.Lxb;
    }
}
