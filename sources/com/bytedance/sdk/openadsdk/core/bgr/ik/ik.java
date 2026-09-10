package com.bytedance.sdk.openadsdk.core.bgr.ik;

import com.bytedance.sdk.component.utils.xha;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends com.bytedance.sdk.openadsdk.lr.lr {
    public ik(int i, int i2) {
        super(i, i2);
    }

    @Override // com.bytedance.sdk.openadsdk.lr.lr, com.bytedance.sdk.openadsdk.lr.ri
    public void ri(List<File> list) {
        int size = list.size();
        if (ri(0L, size)) {
            return;
        }
        for (File file : list) {
            xha.ik(file);
            size--;
            if (ri(file, 0L, size)) {
                return;
            }
        }
    }

    public ik(int i, int i2, boolean z) {
        super(i, i2);
        this.ri = z;
    }
}
