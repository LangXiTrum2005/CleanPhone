package com.bytedance.sdk.openadsdk.core.NXR.lk;

import com.bytedance.sdk.component.utils.lc;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends com.bytedance.sdk.openadsdk.LD.LD {
    public lk(int i, int i2) {
        super(i, i2);
    }

    @Override // com.bytedance.sdk.openadsdk.LD.LD, com.bytedance.sdk.openadsdk.LD.Lxb
    public void Lxb(List<File> list) {
        int size = list.size();
        if (Lxb(0L, size)) {
            return;
        }
        for (File file : list) {
            lc.lk(file);
            size--;
            if (Lxb(file, 0L, size)) {
                return;
            }
        }
    }

    public lk(int i, int i2, boolean z) {
        super(i, i2);
        this.Lxb = z;
    }
}
