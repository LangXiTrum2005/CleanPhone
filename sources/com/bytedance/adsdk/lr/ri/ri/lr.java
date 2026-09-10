package com.bytedance.adsdk.lr.ri.ri;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private final List<ihz> ri = new ArrayList();

    public void ri(ihz ihzVar) {
        this.ri.add(ihzVar);
    }

    public void ri(Path path) {
        for (int size = this.ri.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.lr.di.di.ri(path, this.ri.get(size));
        }
    }
}
