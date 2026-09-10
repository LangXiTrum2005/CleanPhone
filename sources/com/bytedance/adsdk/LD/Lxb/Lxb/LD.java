package com.bytedance.adsdk.LD.Lxb.Lxb;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LD {
    private final List<Sfi> Lxb = new ArrayList();

    public void Lxb(Sfi sfi) {
        this.Lxb.add(sfi);
    }

    public void Lxb(Path path) {
        for (int size = this.Lxb.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.LD.lc.lc.Lxb(path, this.Lxb.get(size));
        }
    }
}
