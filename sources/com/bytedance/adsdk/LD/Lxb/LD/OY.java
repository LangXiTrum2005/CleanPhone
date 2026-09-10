package com.bytedance.adsdk.LD.Lxb.LD;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class OY {
    private final List<Lxb<Integer, Integer>> LD;
    private final List<Lxb<com.bytedance.adsdk.LD.lk.LD.STP, Path>> Lxb;
    private final List<com.bytedance.adsdk.LD.lk.LD.OY> lk;

    public OY(List<com.bytedance.adsdk.LD.lk.LD.OY> list) {
        this.lk = list;
        this.Lxb = new ArrayList(list.size());
        this.LD = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.Lxb.add(list.get(i).LD().Lxb());
            this.LD.add(list.get(i).lk().Lxb());
        }
    }

    public List<Lxb<com.bytedance.adsdk.LD.lk.LD.STP, Path>> LD() {
        return this.Lxb;
    }

    public List<com.bytedance.adsdk.LD.lk.LD.OY> Lxb() {
        return this.lk;
    }

    public List<Lxb<Integer, Integer>> lk() {
        return this.LD;
    }
}
