package sl;

import java.util.LinkedHashMap;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum a {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f50257b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50265a;

    static {
        a[] aVarArrValues = values();
        int iO = b0.O(aVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO < 16 ? 16 : iO);
        for (a aVar : aVarArrValues) {
            linkedHashMap.put(Integer.valueOf(aVar.f50265a), aVar);
        }
        f50257b = linkedHashMap;
    }

    a(int i10) {
        this.f50265a = i10;
    }
}
