package fb;

import eb.b0;
import eb.w;
import eb.x;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f40734b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f40735c = new e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f40736d = new x(eb.h.class, va.h.class, new com.unity3d.ads.adplayer.b(18));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40737a;

    public /* synthetic */ e(int i10) {
        this.f40737a = i10;
    }

    @Override // eb.b0
    public final Class a() {
        switch (this.f40737a) {
            case 0:
                return gb.b.class;
            default:
                return va.h.class;
        }
    }

    @Override // eb.b0
    public final Object b(m5.k kVar, cj.h hVar) throws GeneralSecurityException {
        lb.a aVarT0;
        List list;
        lb.a aVarT1;
        List arrayList;
        switch (this.f40737a) {
            case 0:
                va.f fVarW = kVar.w();
                HashMap map = new HashMap();
                for (int i10 = 0; i10 < ((List) kVar.f45902b).size(); i10++) {
                    va.f fVarQ = kVar.q(i10);
                    if (fVarQ.f52522c.equals(va.c.f52510c)) {
                        gb.b bVar = (gb.b) hVar.c(fVarQ);
                        i0 i0VarA = fVarQ.a();
                        if (i0VarA instanceof l) {
                            aVarT0 = ((l) i0VarA).t0();
                        } else {
                            if (!(i0VarA instanceof eb.h)) {
                                throw new GeneralSecurityException("Cannot get output prefix for key of class " + i0VarA.getClass().getName() + " with parameters " + i0VarA.N());
                            }
                            aVarT0 = ((eb.h) i0VarA).t0();
                        }
                        byte[] bArr = aVarT0.f45273a;
                        if (bArr.length != 0 && bArr.length != 5) {
                            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                        }
                        if (map.containsKey(aVarT0)) {
                            list = (List) map.get(aVarT0);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            map.put(aVarT0, arrayList2);
                            list = arrayList2;
                        }
                        list.add(bVar);
                    }
                }
                return new gb.b();
            default:
                HashMap map2 = new HashMap();
                for (int i11 = 0; i11 < ((List) kVar.f45902b).size(); i11++) {
                    va.f fVarQ2 = kVar.q(i11);
                    if (fVarQ2.f52522c.equals(va.c.f52510c)) {
                        va.h hVar2 = (va.h) hVar.c(fVarQ2);
                        i0 i0VarA2 = fVarQ2.a();
                        if (i0VarA2 instanceof l) {
                            aVarT1 = ((l) i0VarA2).t0();
                        } else {
                            if (!(i0VarA2 instanceof eb.h)) {
                                throw new GeneralSecurityException("Cannot get output prefix for key of class " + i0VarA2.getClass().getName() + " with parameters " + i0VarA2.N());
                            }
                            aVarT1 = ((eb.h) i0VarA2).t0();
                        }
                        gb.e eVar = new gb.e(hVar2, fVarQ2.f52523d);
                        byte[] bArr2 = aVarT1.f45273a;
                        if (bArr2.length != 0 && bArr2.length != 5) {
                            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                        }
                        if (map2.containsKey(aVarT1)) {
                            arrayList = (List) map2.get(aVarT1);
                        } else {
                            arrayList = new ArrayList();
                            map2.put(aVarT1, arrayList);
                        }
                        arrayList.add(eVar);
                    }
                }
                if (((Map) kVar.f45903c).get(eb.j.class) != null) {
                    throw new ClassCastException();
                }
                new gb.e((va.h) hVar.c(kVar.w()), kVar.w().f52523d);
                new w(map2);
                return new gb.d();
        }
    }

    @Override // eb.b0
    public final Class c() {
        switch (this.f40737a) {
            case 0:
                return gb.b.class;
            default:
                return va.h.class;
        }
    }
}
