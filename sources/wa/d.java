package wa;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements eb.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f53013a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final eb.x f53014b = new eb.x(eb.h.class, va.a.class, new ud.t(7));

    @Override // eb.b0
    public final Class a() {
        return va.a.class;
    }

    @Override // eb.b0
    public final Object b(m5.k kVar, cj.h hVar) throws GeneralSecurityException {
        lb.a aVarT0;
        List arrayList;
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < ((List) kVar.f45902b).size(); i10++) {
            va.f fVarQ = kVar.q(i10);
            if (fVarQ.f52522c.equals(va.c.f52510c)) {
                qk.i0 i0VarA = fVarQ.a();
                if (i0VarA instanceof b) {
                    aVarT0 = ((b) i0VarA).t0();
                } else {
                    if (!(i0VarA instanceof eb.h)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + i0VarA.getClass().getName() + " with parameters " + i0VarA.N());
                    }
                    aVarT0 = ((eb.h) i0VarA).t0();
                }
                xa.m mVar = new xa.m((va.a) hVar.c(fVarQ), fVarQ.f52523d);
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
                arrayList.add(mVar);
            }
        }
        if (((Map) kVar.f45903c).get(eb.j.class) == null) {
            return new kb.c(new xa.m((va.a) hVar.c(kVar.w()), kVar.w().f52523d), new eb.w(map));
        }
        throw new ClassCastException();
    }

    @Override // eb.b0
    public final Class c() {
        return va.a.class;
    }
}
