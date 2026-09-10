package com.bytedance.sdk.openadsdk.core.exu.lnr;

import com.bytedance.sdk.component.utils.wd;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class lnr extends com.bytedance.sdk.openadsdk.ud.ud {
    public lnr(int i2, int i3) {
        super(i2, i3);
    }

    @Override // com.bytedance.sdk.openadsdk.ud.ud, com.bytedance.sdk.openadsdk.ud.qdl
    public void qdl(List<File> list) {
        int size = list.size();
        if (qdl(0L, size)) {
            return;
        }
        for (File file : list) {
            wd.lnr(file);
            size--;
            if (qdl(file, 0L, size)) {
                return;
            }
        }
    }

    public lnr(int i2, int i3, boolean z2) {
        super(i2, i3);
        this.qdl = z2;
    }
}
