package rn;

import com.google.android.gms.internal.ads.kj1;
import java.util.LinkedHashMap;
import java.util.Map;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements nn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nn.a f49717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f49718b;

    public h(nn.a aVar) {
        p pVar = p.f49742a;
        this.f49717a = aVar;
        this.f49718b = new g(p.f49743b, aVar.d());
    }

    @Override // nn.a
    public final void a(f4.a aVar, Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.n.f(map, "<this>");
        map.size();
        g descriptor = this.f49718b;
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        f4.a aVarA = aVar.a(descriptor);
        Map map2 = (Map) obj;
        kotlin.jvm.internal.n.f(map2, "<this>");
        int i10 = 0;
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            aVarA.h(descriptor, i10, p.f49742a, key);
            i10 += 2;
            aVarA.h(descriptor, i11, this.f49717a, value);
        }
        aVarA.l(descriptor);
    }

    @Override // nn.a
    public Object b(kj1 decoder) {
        kotlin.jvm.internal.n.f(decoder, "decoder");
        kotlin.jvm.internal.n.f(decoder, "decoder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlin.jvm.internal.n.f(linkedHashMap, "<this>");
        int size = linkedHashMap.size() * 2;
        kj1 kj1VarB = decoder.b(d());
        while (true) {
            int iC = kj1VarB.c(d());
            if (iC == -1) {
                kj1VarB.n(d());
                kotlin.jvm.internal.n.f(linkedHashMap, "<this>");
                return linkedHashMap;
            }
            int i10 = iC + size;
            LinkedHashMap builder = linkedHashMap;
            kotlin.jvm.internal.n.f(builder, "builder");
            p pVar = p.f49742a;
            g gVar = this.f49718b;
            Object objJ = kj1VarB.j(gVar, i10, pVar, null);
            int iC2 = kj1VarB.c(gVar);
            if (iC2 != i10 + 1) {
                throw new IllegalArgumentException(defpackage.e.g(i10, iC2, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
            boolean zContainsKey = builder.containsKey(objJ);
            nn.a aVar = this.f49717a;
            builder.put(objJ, (!zContainsKey || (aVar.d().getKind() instanceof pn.c)) ? kj1VarB.j(gVar, iC2, aVar, null) : kj1VarB.j(gVar, iC2, aVar, b0.M(objJ, builder)));
        }
    }

    @Override // nn.a
    public final pn.d d() {
        return this.f49718b;
    }
}
