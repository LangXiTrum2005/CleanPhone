package t2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import l1.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends al.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f50433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f50434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f50435d;

    public static Serializable H0(int i10, q qVar) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(qVar.t()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(qVar.z() == 1);
        }
        if (i10 == 2) {
            return J0(qVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return I0(qVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(qVar.t()));
                qVar.N(2);
                return date;
            }
            int iD = qVar.D();
            ArrayList arrayList = new ArrayList(iD);
            for (int i11 = 0; i11 < iD; i11++) {
                Serializable serializableH0 = H0(qVar.z(), qVar);
                if (serializableH0 != null) {
                    arrayList.add(serializableH0);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strJ0 = J0(qVar);
            int iZ = qVar.z();
            if (iZ == 9) {
                return map;
            }
            Serializable serializableH1 = H0(iZ, qVar);
            if (serializableH1 != null) {
                map.put(strJ0, serializableH1);
            }
        }
    }

    public static HashMap I0(q qVar) {
        int iD = qVar.D();
        HashMap map = new HashMap(iD);
        for (int i10 = 0; i10 < iD; i10++) {
            String strJ0 = J0(qVar);
            Serializable serializableH0 = H0(qVar.z(), qVar);
            if (serializableH0 != null) {
                map.put(strJ0, serializableH0);
            }
        }
        return map;
    }

    public static String J0(q qVar) {
        int iG = qVar.G();
        int i10 = qVar.f44814b;
        qVar.N(iG);
        return new String(qVar.f44813a, i10, iG);
    }
}
