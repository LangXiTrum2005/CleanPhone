package saneness;

import ads_mobile_sdk.cd1;
import ads_mobile_sdk.mr;
import ads_mobile_sdk.yc1;
import ads_mobile_sdk.zc1;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ferrovanadium implements imparkation {
    public final int attabal(int i, Object obj, Object obj2) {
        cd1 cd1Var = (cd1) obj;
        zc1 zc1Var = (zc1) obj2;
        int i2 = 0;
        if (cd1Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : cd1Var.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            zc1Var.getClass();
            int iH = mr.h(i);
            int iA = zc1.a(zc1Var.a, key, value);
            i2 += mr.i(iA) + iA + iH;
        }
        return i2;
    }

    public final boolean beachfront(Object obj) {
        return !((cd1) obj).a;
    }

    public final Object competently(Object obj) {
        ((cd1) obj).a = false;
        return obj;
    }

    public final cd1 dern(Object obj, Object obj2) {
        cd1 cd1VarB = (cd1) obj;
        cd1 cd1Var = (cd1) obj2;
        if (cd1Var.isEmpty()) {
            return cd1VarB;
        }
        if (!cd1VarB.a) {
            cd1VarB = cd1VarB.b();
        }
        if (!cd1VarB.a) {
            throw new UnsupportedOperationException();
        }
        if (!cd1Var.isEmpty()) {
            cd1VarB.putAll(cd1Var);
        }
        return cd1VarB;
    }

    public final cd1 marial(Object obj) {
        return (cd1) obj;
    }

    public final cd1 saneness() {
        return cd1.b.b();
    }

    public final yc1 wireman(Object obj) {
        return ((zc1) obj).a;
    }
}
