package com.bytedance.sdk.openadsdk.eK.LD;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.tD;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends LD {
    private int ZU;

    public lk(Integer num, View view, tD tDVar, JXs.Lxb lxb) {
        super(num, view, tDVar, 1000, lxb);
        this.ZU = -1;
        LD(view);
    }

    @Override // com.bytedance.sdk.openadsdk.eK.LD.LD
    public void LD(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.eK.LD.LD
    public void ZU() {
        super.ZU();
    }

    @Override // com.bytedance.sdk.openadsdk.eK.LD.LD
    public int lc() {
        return 100;
    }

    @Override // com.bytedance.sdk.openadsdk.eK.LD.LD
    public boolean lk() {
        WeakReference<View> weakReference = this.Lxb;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        View view = this.Lxb.get();
        if (this.ZU == -1) {
            LD(view);
        }
        return lc.Lxb(view, this.ZU == 1, this.LD.op());
    }

    private void LD(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.ZU = width * height >= 242500 ? 1 : 0;
        }
    }
}
