package com.bytedance.adsdk.ud.qdl.qdl;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ud {
    private final List<jyq> qdl = new ArrayList();

    public void qdl(jyq jyqVar) {
        this.qdl.add(jyqVar);
    }

    public void qdl(Path path) {
        for (int size = this.qdl.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.ud.mo.mo.qdl(path, this.qdl.get(size));
        }
    }
}
