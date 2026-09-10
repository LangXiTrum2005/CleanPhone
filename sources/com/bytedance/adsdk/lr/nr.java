package com.bytedance.adsdk.lr;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class nr {
    private boolean ri = false;
    private final Set<Object> lr = new ri();
    private final Map<String, com.bytedance.adsdk.lr.di.ka> ik = new HashMap();
    private final Comparator<Pair<String, Float>> ka = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.lr.nr.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.second).floatValue();
            float fFloatValue2 = ((Float) pair2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    public void ri(boolean z) {
        this.ri = z;
    }

    public void ri(String str, float f) {
        if (this.ri) {
            com.bytedance.adsdk.lr.di.ka kaVar = this.ik.get(str);
            if (kaVar == null) {
                kaVar = new com.bytedance.adsdk.lr.di.ka();
                this.ik.put(str, kaVar);
            }
            kaVar.ri(f);
            if (str.equals("__container")) {
                Iterator<Object> it = this.lr.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
