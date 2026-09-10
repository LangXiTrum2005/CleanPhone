package com.bytedance.sdk.component.JXs.lk.Lxb.LD;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.JXs.brP;

/* JADX INFO: loaded from: classes2.dex */
public class ZU implements brP {
    private final com.bytedance.sdk.component.JXs.lk.Lxb.LD LD;
    private final brP Lxb;

    public ZU(brP brp) {
        this(brp, null);
    }

    public ZU(brP brp, com.bytedance.sdk.component.JXs.lk.Lxb.LD ld) {
        this.Lxb = brp;
        this.LD = ld;
    }

    @Override // com.bytedance.sdk.component.JXs.Lxb
    public boolean LD(String str) {
        return this.Lxb.LD(str);
    }

    @Override // com.bytedance.sdk.component.JXs.Lxb
    public boolean Lxb(String str, Bitmap bitmap) {
        return this.Lxb.Lxb(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.JXs.Lxb
    public Bitmap Lxb(String str) {
        return this.Lxb.Lxb(str);
    }
}
