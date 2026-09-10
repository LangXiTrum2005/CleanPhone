package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends com.bytedance.sdk.openadsdk.core.JXs.ZU {
    public lk(Context context) {
        super(context);
        Lxb();
    }

    private void Lxb() {
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.STP.xNP);
    }

    public void Lxb(int i, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (tDVar.chu() || (tDVar.Iyd() && tDVar.OY())) {
            le.Lxb((View) this, 0);
            com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb((int) le.Lxb(getContext(), i, true), this, tDVar);
        }
    }
}
