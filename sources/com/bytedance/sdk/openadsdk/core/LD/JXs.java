package com.bytedance.sdk.openadsdk.core.LD;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.tD;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JXs extends Lxb {
    public JXs(@NonNull Context context, @NonNull tD tDVar, @NonNull String str, int i) {
        super(context, tDVar, str, i);
    }

    public abstract void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<lk.Lxb> sparseArray, int i, int i2, int i3, boolean z);

    @Override // com.bytedance.sdk.openadsdk.core.LD.Lxb, com.bytedance.sdk.openadsdk.core.LD.LD, com.bytedance.sdk.openadsdk.core.LD.lk
    public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<lk.Lxb> sparseArray, boolean z) {
        if (Lxb(view, z)) {
            Lxb(view, f, f2, f3, f4, sparseArray, this.Ivz, this.foI, this.KPU, z);
        }
        super.Lxb(view, f, f2, f3, f4, sparseArray, z);
    }
}
