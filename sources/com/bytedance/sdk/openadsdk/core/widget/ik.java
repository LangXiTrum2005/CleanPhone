package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends com.bytedance.sdk.openadsdk.core.di.ka {
    public ik(Context context) {
        super(context);
        ri();
    }

    private void ri() {
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.slm.hqg);
    }

    public void ri(int i, wjv wjvVar) {
        if (wjvVar.zz() || (wjvVar.zyu() && wjvVar.wjv())) {
            qd.ri((View) this, 0);
            com.bytedance.sdk.openadsdk.ac.lr.lr().ri((int) qd.ri(getContext(), i, true), this, wjvVar);
        }
    }
}
