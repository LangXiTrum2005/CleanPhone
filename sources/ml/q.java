package ml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f46230f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i10) {
        super(0);
        this.f46229e = i10;
        this.f46230f = rVar;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f46229e) {
            case 0:
                r rVar = this.f46230f;
                rl.e eVar = ((ll.a) rVar.f46233h.f23782b).l;
                rVar.f6518e.b();
                eVar.getClass();
                return xj.b0.W(new ArrayList());
            case 1:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) j1.f.w(this.f46230f.f46234i, r.f46231m[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    el.b bVar = (el.b) entry.getValue();
                    gm.b bVarD = gm.b.d(str);
                    eo.g gVar = bVar.f40113b;
                    sl.a aVar = (sl.a) gVar.f40197c;
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 2) {
                        map.put(bVarD, bVarD);
                    } else if (iOrdinal == 5) {
                        String str2 = (String) gVar.f40202h;
                        if (aVar != sl.a.MULTIFILE_CLASS_PART) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            map.put(bVarD, gm.b.d(str2));
                        }
                    }
                }
                return map;
            default:
                this.f46230f.f46232g.getClass();
                return new ArrayList(xj.p.W(xj.v.f53866a, 10));
        }
    }
}
