package com.bytedance.sdk.openadsdk.core.lnr;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mzz extends qdl {
    public mzz(Context context, ljh ljhVar, String str, int i2) {
        super(context, ljhVar, str, i2);
    }

    public abstract void qdl(View view, float f, float f2, float f3, float f4, SparseArray<lnr.qdl> sparseArray, int i2, int i3, int i4, boolean z2);

    @Override // com.bytedance.sdk.openadsdk.core.lnr.qdl, com.bytedance.sdk.openadsdk.core.lnr.ud, com.bytedance.sdk.openadsdk.core.lnr.lnr
    public void qdl(View view, float f, float f2, float f3, float f4, SparseArray<lnr.qdl> sparseArray, boolean z2) {
        if (qdl(view, z2)) {
            qdl(view, f, f2, f3, f4, sparseArray, this.koa, this.xmv, this.bqt, z2);
        }
        super.qdl(view, f, f2, f3, f4, sparseArray, z2);
    }
}
