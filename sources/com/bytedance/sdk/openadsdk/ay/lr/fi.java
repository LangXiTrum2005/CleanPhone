package com.bytedance.sdk.openadsdk.ay.lr;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.ig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    private static final Map<Integer, lr> ri = new ConcurrentHashMap();

    public static class ri {
        public int lr = -1;
        public int ri;

        public ri(int i) {
            this.ri = i;
        }
    }

    private static boolean ik(wjv wjvVar) {
        if (wjvVar == null) {
            return false;
        }
        String strRi = ig.ri(wjvVar);
        return ((!"open_ad".equals(strRi) && !"fullscreen_interstitial_ad".equals(strRi) && !"rewarded_video".equals(strRi)) || dw.lr(wjvVar) || wjvVar.nd() == 5 || wjvVar.nd() == 33 || !wjv.fi(wjvVar) || wjvVar.eu() == null) ? false : true;
    }

    public static void lr(Integer num) {
        ri.remove(num);
    }

    public static void ri(View view, wjv wjvVar, ri riVar) {
        if (view == null || wjvVar == null || wjvVar.cgm()) {
            return;
        }
        boolean zIk = ik(wjvVar);
        if (dw.lr(wjvVar) && riVar != null) {
            riVar.ri = -1;
        }
        ri(ri(view, wjvVar, zIk, riVar));
    }

    public static Integer lr(wjv wjvVar) {
        return Integer.valueOf((wjvVar.jf() + wjvVar.tn()).hashCode());
    }

    private static lr ri(View view, wjv wjvVar, boolean z, ri riVar) {
        if (view == null || wjvVar == null || wjvVar.tn() == null) {
            return null;
        }
        Integer numLr = lr(wjvVar);
        Map<Integer, lr> map = ri;
        if (map.containsKey(numLr)) {
            lr lrVar = map.get(numLr);
            if (lrVar != null) {
                lrVar.ri(view);
            }
            return lrVar;
        }
        lr lrVarRi = lr.ri(z, numLr, view, wjvVar, riVar);
        map.put(numLr, lrVarRi);
        return lrVarRi;
    }

    private static void ri(lr lrVar) {
        if (lrVar == null) {
            return;
        }
        lrVar.ri();
    }

    public static void ri(wjv wjvVar, int i) {
        if (wjvVar == null || wjvVar.tn() == null) {
            return;
        }
        ri(ri.get(lr(wjvVar)), i);
    }

    public static void ri(lr lrVar, int i) {
        if (lrVar == null) {
            return;
        }
        lrVar.ri(i);
    }

    public static void ri(wjv wjvVar) {
        if (wjvVar == null || wjvVar.tn() == null) {
            return;
        }
        Integer numLr = lr(wjvVar);
        Map<Integer, lr> map = ri;
        lr lrVar = map.get(numLr);
        if (lrVar != null) {
            lrVar.qt();
        }
        lr(numLr);
        if (map.size() <= 0) {
            xha.ri();
        }
    }

    public static lr ri(Integer num) {
        return ri.get(num);
    }
}
