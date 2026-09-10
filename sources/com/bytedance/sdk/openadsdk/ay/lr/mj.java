package com.bytedance.sdk.openadsdk.ay.lr;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: loaded from: classes2.dex */
public class mj extends lr {
    private int ka;

    public mj(Integer num, View view, wjv wjvVar, fi.ri riVar) {
        super(num, view, wjvVar, 2000, riVar);
        this.ka = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.ay.lr.lr
    public boolean co() {
        int i = this.ka;
        boolean z = i == 2 || i == 0;
        if (z) {
            this.ik.set(false);
        }
        return !z || super.co();
    }

    @Override // com.bytedance.sdk.openadsdk.ay.lr.lr
    public int di() {
        return 200;
    }

    @Override // com.bytedance.sdk.openadsdk.ay.lr.lr
    public boolean ik() {
        return di.ri(this.ri.get(), this.lr.go()) && this.ka == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.ay.lr.lr
    public void ka() {
        super.ka();
    }

    @Override // com.bytedance.sdk.openadsdk.ay.lr.lr
    public void lr(int i) {
        if (jbs()) {
            return;
        }
        if (i == 6 || i == 5) {
            this.ka = 0;
            mj();
        }
        if (i == 3 || i == 2) {
            this.ka = 2;
            mj();
        }
        if (this.ka == 1 || i != 0) {
            return;
        }
        this.ka = 1;
        ri();
    }

    @Override // com.bytedance.sdk.openadsdk.ay.lr.lr
    public void ri() {
        if (this.ka != 1) {
            return;
        }
        super.ri();
    }
}
