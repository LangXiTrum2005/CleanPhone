package bb;

import eb.b0;
import eb.j;
import eb.w;
import eb.x;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m5.k;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f5526a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f5527b = new x(eb.h.class, va.b.class, new ae.b(12));

    @Override // eb.b0
    public final Class a() {
        return va.b.class;
    }

    @Override // eb.b0
    public final Object b(k kVar, cj.h hVar) throws GeneralSecurityException {
        lb.a aVarT0;
        List arrayList;
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < ((List) kVar.f45902b).size(); i10++) {
            va.f fVarQ = kVar.q(i10);
            if (fVarQ.f52522c.equals(va.c.f52510c)) {
                va.b bVar = (va.b) hVar.c(fVarQ);
                i0 i0VarA = fVarQ.a();
                if (i0VarA instanceof a) {
                    aVarT0 = ((a) i0VarA).f5513d;
                } else {
                    if (!(i0VarA instanceof eb.h)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + i0VarA.getClass().getName() + " with parameters " + i0VarA.N());
                    }
                    aVarT0 = ((eb.h) i0VarA).t0();
                }
                cb.c cVar = new cb.c(bVar, fVarQ.f52523d);
                byte[] bArr = aVarT0.f45273a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (map.containsKey(aVarT0)) {
                    arrayList = (List) map.get(aVarT0);
                } else {
                    arrayList = new ArrayList();
                    map.put(aVarT0, arrayList);
                }
                arrayList.add(cVar);
            }
        }
        if (((Map) kVar.f45903c).get(j.class) == null) {
            return new cb.d(new cb.c((va.b) hVar.c(kVar.w()), kVar.w().f52523d), new w(map));
        }
        throw new ClassCastException();
    }

    @Override // eb.b0
    public final Class c() {
        return va.b.class;
    }
}
