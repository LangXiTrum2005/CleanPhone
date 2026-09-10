package com.bytedance.sdk.openadsdk.eK.LD;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class JXs {
    private static final Map<Integer, LD> Lxb = new ConcurrentHashMap();

    public static class Lxb {
        public int LD = -1;
        public int Lxb;

        public Lxb(int i) {
            this.Lxb = i;
        }
    }

    public static void LD(Integer num) {
        Lxb.remove(num);
    }

    public static void Lxb(View view, tD tDVar, Lxb lxb) {
        if (view == null || tDVar == null || tDVar.goy()) {
            return;
        }
        boolean zLk = lk(tDVar);
        if (eK.LD(tDVar) && lxb != null) {
            lxb.Lxb = -1;
        }
        Lxb(Lxb(view, tDVar, zLk, lxb));
    }

    private static boolean lk(tD tDVar) {
        if (tDVar == null) {
            return false;
        }
        String strLxb = nJ.Lxb(tDVar);
        return ((!"open_ad".equals(strLxb) && !"fullscreen_interstitial_ad".equals(strLxb) && !"rewarded_video".equals(strLxb)) || eK.LD(tDVar) || tDVar.kqm() == 5 || tDVar.kqm() == 33 || !tD.JXs(tDVar) || tDVar.JJ() == null) ? false : true;
    }

    public static Integer LD(tD tDVar) {
        return Integer.valueOf((tDVar.xNP() + tDVar.bG()).hashCode());
    }

    private static LD Lxb(View view, tD tDVar, boolean z, Lxb lxb) {
        if (view == null || tDVar == null || tDVar.bG() == null) {
            return null;
        }
        Integer numLD = LD(tDVar);
        Map<Integer, LD> map = Lxb;
        if (map.containsKey(numLD)) {
            LD ld = map.get(numLD);
            if (ld != null) {
                ld.Lxb(view);
            }
            return ld;
        }
        LD ldLxb = LD.Lxb(z, numLD, view, tDVar, lxb);
        map.put(numLD, ldLxb);
        return ldLxb;
    }

    private static void Lxb(LD ld) {
        if (ld == null) {
            return;
        }
        ld.Lxb();
    }

    public static void Lxb(tD tDVar, int i) {
        if (tDVar == null || tDVar.bG() == null) {
            return;
        }
        Lxb(Lxb.get(LD(tDVar)), i);
    }

    public static void Lxb(LD ld, int i) {
        if (ld == null) {
            return;
        }
        ld.Lxb(i);
    }

    public static void Lxb(tD tDVar) {
        if (tDVar == null || tDVar.bG() == null) {
            return;
        }
        Integer numLD = LD(tDVar);
        Map<Integer, LD> map = Lxb;
        LD ld = map.get(numLD);
        if (ld != null) {
            ld.nBu();
        }
        LD(numLD);
        if (map.size() <= 0) {
            ebl.Lxb();
        }
    }

    public static LD Lxb(Integer num) {
        return Lxb.get(num);
    }
}
