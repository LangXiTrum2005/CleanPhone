package com.bytedance.sdk.openadsdk.ay.lr;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends lr {
    private int ka;

    public ik(Integer num, View view, wjv wjvVar, fi.ri riVar) {
        super(num, view, wjvVar, 1000, riVar);
        this.ka = -1;
        lr(view);
    }

    @Override // com.bytedance.sdk.openadsdk.ay.lr.lr
    public int di() {
        wjv wjvVar = this.lr;
        return (wjvVar != null && wjvVar.zyn() && this.lr.lji() == 1) ? 1000 : 100;
    }

    @Override // com.bytedance.sdk.openadsdk.ay.lr.lr
    public boolean ik() {
        WeakReference<View> weakReference = this.ri;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        View view = this.ri.get();
        if (this.ka == -1) {
            lr(view);
        }
        return di.ri(view, this.ka == 1, this.lr.go());
    }

    @Override // com.bytedance.sdk.openadsdk.ay.lr.lr
    public void ka() {
        super.ka();
    }

    @Override // com.bytedance.sdk.openadsdk.ay.lr.lr
    public void lr(int i) {
    }

    private void lr(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.ka = width * height >= 242500 ? 1 : 0;
        }
    }
}
