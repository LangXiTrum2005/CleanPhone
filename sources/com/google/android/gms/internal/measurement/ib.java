package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ib extends y5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.e f23581b;

    public ib(v9.e eVar) {
        this.f23581b = eVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.y5, com.google.android.gms.internal.measurement.b6
    public final b6 m(String str, d8 d8Var, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        v9.e eVar = this.f23581b;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    yg.c(0, "getEventName", arrayList);
                    return new e6(((b) eVar.f52504c).f23305a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    yg.c(0, "getTimestamp", arrayList);
                    return new o3(Double.valueOf(((b) eVar.f52504c).f23306b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    yg.c(1, "getParamValue", arrayList);
                    String strZzc = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzc();
                    HashMap map = ((b) eVar.f52504c).f23307c;
                    return h.b(map.containsKey(strZzc) ? map.get(strZzc) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    yg.c(0, "getParams", arrayList);
                    HashMap map2 = ((b) eVar.f52504c).f23307c;
                    y5 y5Var = new y5();
                    for (String str2 : map2.keySet()) {
                        y5Var.b(str2, h.b(map2.get(str2)));
                    }
                    return y5Var;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    yg.c(2, "setParamValue", arrayList);
                    String strZzc2 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzc();
                    b6 b6VarE = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1));
                    b bVar = (b) eVar.f52504c;
                    Object objM = yg.m(b6VarE);
                    HashMap map3 = bVar.f23307c;
                    if (objM == null) {
                        map3.remove(strZzc2);
                        return b6VarE;
                    }
                    map3.put(strZzc2, b.b(strZzc2, map3.get(strZzc2), objM));
                    return b6VarE;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    yg.c(1, "setEventName", arrayList);
                    b6 b6VarE2 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0));
                    if (b6.S8.equals(b6VarE2) || b6.T8.equals(b6VarE2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    ((b) eVar.f52504c).f23305a = b6VarE2.zzc();
                    return new e6(b6VarE2.zzc());
                }
                break;
        }
        return super.m(str, d8Var, arrayList);
    }
}
