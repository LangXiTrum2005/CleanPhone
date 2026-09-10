package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class lnr extends com.bytedance.sdk.openadsdk.core.mo.mml {
    public lnr(Context context) {
        super(context);
        qdl();
    }

    private void qdl() {
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.jtx.xmr);
    }

    public void qdl(int i2, ljh ljhVar) {
        if (ljhVar.uj() || (ljhVar.vxm() && ljhVar.exc())) {
            ax.qdl((View) this, 0);
            com.bytedance.sdk.openadsdk.jl.ud.ud().qdl((int) ax.qdl(getContext(), i2, true), this, ljhVar);
        }
    }
}
