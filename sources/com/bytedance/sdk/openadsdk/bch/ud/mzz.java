package com.bytedance.sdk.openadsdk.bch.ud;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class mzz {
    private static final Map<Integer, ud> qdl = new ConcurrentHashMap();

    public static class qdl {
        public int qdl;
        public int ud = -1;

        public qdl(int i2) {
            this.qdl = i2;
        }
    }

    private static boolean lnr(ljh ljhVar) {
        if (ljhVar == null) {
            return false;
        }
        String strQdl = gy.qdl(ljhVar);
        return ((!"open_ad".equals(strQdl) && !"fullscreen_interstitial_ad".equals(strQdl) && !"rewarded_video".equals(strQdl)) || vu.ud(ljhVar) || ljhVar.taz() == 5 || ljhVar.taz() == 33 || !ljh.mzz(ljhVar) || ljhVar.tdy() == null) ? false : true;
    }

    public static void qdl(View view, ljh ljhVar, qdl qdlVar) {
        if (view == null || ljhVar == null || ljhVar.kt()) {
            return;
        }
        boolean zLnr = lnr(ljhVar);
        if (vu.ud(ljhVar) && qdlVar != null) {
            qdlVar.qdl = -1;
        }
        qdl(qdl(view, ljhVar, zLnr, qdlVar));
    }

    public static void ud(Integer num) {
        qdl.remove(num);
    }

    public static Integer ud(ljh ljhVar) {
        return Integer.valueOf((ljhVar.cev() + ljhVar.yre()).hashCode());
    }

    private static ud qdl(View view, ljh ljhVar, boolean z2, qdl qdlVar) {
        if (view == null || ljhVar == null || ljhVar.yre() == null) {
            return null;
        }
        Integer numUd = ud(ljhVar);
        Map<Integer, ud> map = qdl;
        if (map.containsKey(numUd)) {
            ud udVar = map.get(numUd);
            if (udVar != null) {
                udVar.qdl(view);
            }
            return udVar;
        }
        ud udVarQdl = ud.qdl(z2, numUd, view, ljhVar, qdlVar);
        map.put(numUd, udVarQdl);
        return udVarQdl;
    }

    private static void qdl(ud udVar) {
        if (udVar == null) {
            return;
        }
        udVar.qdl();
    }

    public static void qdl(ljh ljhVar, int i2) {
        if (ljhVar == null || ljhVar.yre() == null) {
            return;
        }
        qdl(qdl.get(ud(ljhVar)), i2);
    }

    public static void qdl(ud udVar, int i2) {
        if (udVar == null) {
            return;
        }
        udVar.qdl(i2);
    }

    public static void qdl(ljh ljhVar) {
        if (ljhVar == null || ljhVar.yre() == null) {
            return;
        }
        Integer numUd = ud(ljhVar);
        Map<Integer, ud> map = qdl;
        ud udVar = map.get(numUd);
        if (udVar != null) {
            udVar.to();
        }
        ud(numUd);
        if (map.size() <= 0) {
            wd.qdl();
        }
    }

    public static ud qdl(Integer num) {
        return qdl.get(num);
    }
}
