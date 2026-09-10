package com.bytedance.sdk.openadsdk.core.ik;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fi extends ri {
    public fi(Context context, wjv wjvVar, String str, int i) {
        super(context, wjvVar, str, i);
    }

    public abstract void ri(View view, float f, float f2, float f3, float f4, SparseArray<ik.ri> sparseArray, int i, int i2, int i3, boolean z);

    @Override // com.bytedance.sdk.openadsdk.core.ik.ri, com.bytedance.sdk.openadsdk.core.ik.lr, com.bytedance.sdk.openadsdk.core.ik.ik
    public void ri(View view, float f, float f2, float f3, float f4, SparseArray<ik.ri> sparseArray, boolean z) {
        if (ri(view, z)) {
            ri(view, f, f2, f3, f4, sparseArray, this.zf, this.su, this.igq, z);
        }
        super.ri(view, f, f2, f3, f4, sparseArray, z);
    }
}
