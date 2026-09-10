package com.thinkup.core.common.ooo;

import com.thinkup.core.common.on.o0mm;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class om {
    private static final String o = "om";

    public static void o(com.thinkup.core.oo.n0 n0Var, Map<String, Object> map, o0mm o0mmVar, com.thinkup.core.common.on.omn omnVar) {
        if (omnVar == null) {
            return;
        }
        double dMm = omnVar.mm();
        if (dMm < 0.0d) {
            return;
        }
        int iMn = omnVar.mn();
        boolean zN0 = omnVar.n0();
        List<Integer> listNo = n0Var.no();
        if (listNo == null) {
            return;
        }
        boolean zOom = o0mmVar.oom();
        int i2 = 2;
        boolean z2 = false;
        if (iMn == 22) {
            if ((zOom && listNo.contains(3)) || (!zOom && listNo.contains(1))) {
                z2 = true;
            }
        } else if (!(zOom && listNo.contains(4)) && (zOom || !listNo.contains(2))) {
            i2 = 5;
        } else {
            i2 = 5;
            z2 = true;
        }
        if (!z2) {
            listNo.toString();
            return;
        }
        int iMom = (int) ((dMm / n0Var.mom()) * 100.0d);
        int i3 = zN0 ? 3 : 1;
        boolean zOm = omnVar.om();
        o0mmVar.toString();
        listNo.toString();
        map.put("bd_a", Integer.valueOf(i2));
        map.put("bd_b", Integer.valueOf(iMom));
        map.put("bd_c", Integer.valueOf(i3));
        map.put("bd_s", Integer.valueOf(zOm ? 1 : 0));
    }
}
