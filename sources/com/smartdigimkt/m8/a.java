package com.smartdigimkt.m8;

import com.smartdigimkt.l8.f;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static boolean a(List<f> list) {
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = list.get(i2);
                if (fVar != null && fVar.n1()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(f fVar) {
        return fVar.t0() == 66;
    }

    public static boolean c(f fVar) {
        return fVar.t0() == 15 && !fVar.m1();
    }

    public static long a(f fVar) {
        if (fVar == null) {
            return 0L;
        }
        return fVar.X0();
    }
}
