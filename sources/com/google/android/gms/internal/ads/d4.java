package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d4 extends mu1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f13381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f13382e;

    public static String X0(np0 np0Var) {
        int iL = np0Var.L();
        int i10 = np0Var.f17881b;
        np0Var.G(iL);
        return new String(np0Var.f17880a, i10, iL);
    }

    public static HashMap Y0(np0 np0Var) {
        int iH = np0Var.h();
        HashMap map = new HashMap(iH);
        for (int i10 = 0; i10 < iH; i10++) {
            String strX0 = X0(np0Var);
            Serializable serializableZ0 = Z0(np0Var.K(), np0Var);
            if (serializableZ0 != null) {
                map.put(strX0, serializableZ0);
            }
        }
        return map;
    }

    public static Serializable Z0(int i10, np0 np0Var) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(np0Var.d()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(np0Var.K() == 1);
        }
        if (i10 == 2) {
            return X0(np0Var);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return Y0(np0Var);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(np0Var.d()));
                np0Var.G(2);
                return date;
            }
            int iH = np0Var.h();
            ArrayList arrayList = new ArrayList(iH);
            for (int i11 = 0; i11 < iH; i11++) {
                Serializable serializableZ0 = Z0(np0Var.K(), np0Var);
                if (serializableZ0 != null) {
                    arrayList.add(serializableZ0);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strX0 = X0(np0Var);
            int iK = np0Var.K();
            if (iK == 9) {
                return map;
            }
            Serializable serializableZ1 = Z0(iK, np0Var);
            if (serializableZ1 != null) {
                map.put(strX0, serializableZ1);
            }
        }
    }
}
