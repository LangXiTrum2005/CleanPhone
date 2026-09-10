package com.bytedance.adsdk.LD;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class brP {
    private boolean Lxb = false;
    private final Set<Object> LD = new Lxb();
    private final Map<String, com.bytedance.adsdk.LD.lc.ZU> lk = new HashMap();
    private final Comparator<Pair<String, Float>> ZU = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.LD.brP.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.second).floatValue();
            float fFloatValue2 = ((Float) pair2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    public void Lxb(boolean z) {
        this.Lxb = z;
    }

    public void Lxb(String str, float f) {
        if (this.Lxb) {
            com.bytedance.adsdk.LD.lc.ZU zu = this.lk.get(str);
            if (zu == null) {
                zu = new com.bytedance.adsdk.LD.lc.ZU();
                this.lk.put(str, zu);
            }
            zu.Lxb(f);
            if (str.equals("__container")) {
                Iterator<Object> it = this.LD.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
