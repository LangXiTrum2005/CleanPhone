package com.bytedance.sdk.openadsdk.bch.ud;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class lnr extends ud {
    private int mml;

    public lnr(Integer num, View view, ljh ljhVar, mzz.qdl qdlVar) {
        super(num, view, ljhVar, 1000, qdlVar);
        this.mml = -1;
        ud(view);
    }

    @Override // com.bytedance.sdk.openadsdk.bch.ud.ud
    public boolean lnr() {
        WeakReference<View> weakReference = this.qdl;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        View view = this.qdl.get();
        if (this.mml == -1) {
            ud(view);
        }
        return mo.qdl(view, this.mml == 1, this.ud.ok());
    }

    @Override // com.bytedance.sdk.openadsdk.bch.ud.ud
    public void mml() {
        super.mml();
    }

    @Override // com.bytedance.sdk.openadsdk.bch.ud.ud
    public int mo() {
        ljh ljhVar = this.ud;
        return (ljhVar != null && ljhVar.ax() && this.ud.vz() == 1) ? 1000 : 100;
    }

    @Override // com.bytedance.sdk.openadsdk.bch.ud.ud
    public void ud(int i2) {
    }

    private void ud(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.mml = width * height >= 242500 ? 1 : 0;
        }
    }
}
