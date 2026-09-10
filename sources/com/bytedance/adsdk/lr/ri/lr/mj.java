package com.bytedance.adsdk.lr.ri.lr;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mj {
    private final List<com.bytedance.adsdk.lr.ik.lr.mj> ik;
    private final List<ri<Integer, Integer>> lr;
    private final List<ri<com.bytedance.adsdk.lr.ik.lr.bgr, Path>> ri;

    public mj(List<com.bytedance.adsdk.lr.ik.lr.mj> list) {
        this.ik = list;
        this.ri = new ArrayList(list.size());
        this.lr = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.ri.add(list.get(i).lr().ri());
            this.lr.add(list.get(i).ik().ri());
        }
    }

    public List<ri<Integer, Integer>> ik() {
        return this.lr;
    }

    public List<ri<com.bytedance.adsdk.lr.ik.lr.bgr, Path>> lr() {
        return this.ri;
    }

    public List<com.bytedance.adsdk.lr.ik.lr.mj> ri() {
        return this.ik;
    }
}
