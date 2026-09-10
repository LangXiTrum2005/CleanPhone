package com.bytedance.sdk.openadsdk.core.lc.Lxb;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.LD.JVA;
import com.bytedance.sdk.openadsdk.core.LD.lk;
import com.bytedance.sdk.openadsdk.core.model.STP;
import com.bytedance.sdk.openadsdk.utils.le;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends lk implements com.bytedance.sdk.component.adexpress.dynamic.lc.Lxb {
    protected WeakReference<View> LD;
    protected WeakReference<View> Lxb;
    private JVA lk;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lc.Lxb
    public void LD(View view) {
        this.LD = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lc.Lxb
    public void Lxb(JVA jva) {
        this.lk = jva;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lc.Lxb
    public void Lxb(View view) {
        this.Lxb = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.LD.lk
    public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<lk.Lxb> sparseArray, boolean z) {
        Lxb(view, ((Integer) view.getTag()).intValue(), f, f2, f3, f4, sparseArray);
    }

    private void Lxb(View view, int i, float f, float f2, float f3, float f4, SparseArray<lk.Lxb> sparseArray) {
        if (this.lk != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            WeakReference<View> weakReference = this.LD;
            if (weakReference != null) {
                int[] iArrLxb = le.Lxb(weakReference.get());
                if (iArrLxb != null) {
                    iArr = iArrLxb;
                }
                int[] iArrLk = le.lk(this.LD.get());
                if (iArrLk != null) {
                    iArr2 = iArrLk;
                }
            }
            String strValueOf = "";
            try {
                int i2 = com.bytedance.sdk.component.adexpress.dynamic.Lxb.Sfi;
                if (view.getTag(i2) != null) {
                    strValueOf = String.valueOf(view.getTag(i2));
                }
            } catch (Exception unused) {
            }
            this.lk.Lxb(view, i, new STP.Lxb().ZU(f).lk(f2).LD(f3).Lxb(f4).LD(this.CSn).Lxb(this.id).lk(iArr[0]).ZU(iArr[1]).JXs(iArr2[0]).lc(iArr2[1]).Lxb(sparseArray).Lxb(this.xan).Lxb(strValueOf).Lxb());
        }
    }
}
