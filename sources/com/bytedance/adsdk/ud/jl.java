package com.bytedance.adsdk.ud;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class jl {
    private boolean qdl = false;
    private final Set<Object> ud = new qdl();
    private final Map<String, com.bytedance.adsdk.ud.mo.mml> lnr = new HashMap();
    private final Comparator<Pair<String, Float>> mml = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.ud.jl.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.second).floatValue();
            float fFloatValue2 = ((Float) pair2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    public void qdl(boolean z2) {
        this.qdl = z2;
    }

    public void qdl(String str, float f) {
        if (this.qdl) {
            com.bytedance.adsdk.ud.mo.mml mmlVar = this.lnr.get(str);
            if (mmlVar == null) {
                mmlVar = new com.bytedance.adsdk.ud.mo.mml();
                this.lnr.put(str, mmlVar);
            }
            mmlVar.qdl(f);
            if (str.equals("__container")) {
                Iterator<Object> it = this.ud.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
