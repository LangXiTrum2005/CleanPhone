package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.o30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4192o30 extends AbstractC3413f9 {
    public long c;
    public long[] d;
    public long[] e;

    public static Serializable j(int i, JT jt) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(jt.n()));
        }
        if (i == 1) {
            return Boolean.valueOf(jt.t() == 1);
        }
        if (i == 2) {
            return l(jt);
        }
        if (i != 3) {
            if (i == 8) {
                return k(jt);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(jt.n()));
                jt.F(2);
                return date;
            }
            int iW = jt.w();
            ArrayList arrayList = new ArrayList(iW);
            for (int i2 = 0; i2 < iW; i2++) {
                Serializable serializableJ = j(jt.t(), jt);
                if (serializableJ != null) {
                    arrayList.add(serializableJ);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strL = l(jt);
            int iT = jt.t();
            if (iT == 9) {
                return map;
            }
            Serializable serializableJ2 = j(iT, jt);
            if (serializableJ2 != null) {
                map.put(strL, serializableJ2);
            }
        }
    }

    public static HashMap k(JT jt) {
        int iW = jt.w();
        HashMap map = new HashMap(iW);
        for (int i = 0; i < iW; i++) {
            String strL = l(jt);
            Serializable serializableJ = j(jt.t(), jt);
            if (serializableJ != null) {
                map.put(strL, serializableJ);
            }
        }
        return map;
    }

    public static String l(JT jt) {
        int iY = jt.y();
        int i = jt.b;
        jt.F(iY);
        return new String(jt.f3266a, i, iY);
    }

    public final boolean i(long j, JT jt) {
        if (jt.t() != 2 || !"onMetaData".equals(l(jt)) || jt.a() == 0 || jt.t() != 8) {
            return false;
        }
        HashMap mapK = k(jt);
        Object obj = mapK.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.c = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapK.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.d = new long[size];
                this.e = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.d = new long[0];
                        this.e = new long[0];
                        break;
                    }
                    this.d[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.e[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }
}
