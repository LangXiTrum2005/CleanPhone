package com.bytedance.sdk.openadsdk.Lxb.LD.Lxb;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.OY.tD;
import com.bytedance.sdk.openadsdk.core.model.STP;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends com.bytedance.sdk.openadsdk.core.OY.Lxb {
    private tD Lxb;
    private com.bytedance.sdk.openadsdk.Lxb.LD.Lxb NXR;

    public Lxb(@NonNull Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.Lxb
    public void Lxb(View view, int i, STP stp) {
        tD tDVar = this.Lxb;
        if (tDVar != null) {
            tDVar.Lxb(view, i, stp);
        }
    }

    public void setExtraFuncationHelper(com.bytedance.sdk.openadsdk.Lxb.LD.Lxb lxb) {
        this.NXR = lxb;
    }

    public void Lxb(tD tDVar) {
        this.Lxb = tDVar;
        tDVar.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }
}
