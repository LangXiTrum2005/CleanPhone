package gn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface l extends fn.e {
    static /* synthetic */ fn.e c(l lVar, dn.e eVar, int i10, en.a aVar, int i11) {
        ak.k kVar = eVar;
        if ((i11 & 1) != 0) {
            kVar = ak.l.f3620a;
        }
        if ((i11 & 2) != 0) {
            i10 = -3;
        }
        if ((i11 & 4) != 0) {
            aVar = en.a.f40122a;
        }
        return lVar.b(kVar, i10, aVar);
    }

    fn.e b(ak.k kVar, int i10, en.a aVar);
}
