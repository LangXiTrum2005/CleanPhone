package com.bytedance.sdk.openadsdk.core.xha.ri;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.lr.sf;
import com.bytedance.sdk.openadsdk.core.ik.ik;
import com.bytedance.sdk.openadsdk.core.model.slm;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends ik implements com.bytedance.sdk.component.adexpress.dynamic.di.ri {
    private sf lr;
    protected WeakReference<View> ri;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.di.ri
    public void ri(sf sfVar) {
        this.lr = sfVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.di.ri
    public void ri(View view) {
        this.ri = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ik.ik
    public void ri(View view, float f, float f2, float f3, float f4, SparseArray<ik.ri> sparseArray, boolean z) {
        ri(view, ((Integer) view.getTag()).intValue(), f, f2, f3, f4, sparseArray);
    }

    private void ri(View view, int i, float f, float f2, float f3, float f4, SparseArray<ik.ri> sparseArray) {
        if (this.lr != null) {
            String strValueOf = "";
            try {
                int i2 = com.bytedance.sdk.component.adexpress.dynamic.ri.ihz;
                if (view.getTag(i2) != null) {
                    strValueOf = String.valueOf(view.getTag(i2));
                }
            } catch (Exception unused) {
            }
            this.lr.ri(view, i, new slm.ri().ka(f).ik(f2).lr(f3).ri(f4).lr(this.ay).ri(this.fr).ri(sparseArray).ri(this.ory).ri(strValueOf).ri());
        }
    }
}
