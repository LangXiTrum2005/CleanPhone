package dh;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f38898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ah.d f38899b;

    public h(c cVar, ah.d type) {
        n.f(type, "type");
        this.f38898a = cVar;
        this.f38899b = type;
    }

    public final d0.c a() {
        ah.d mediaType = this.f38899b;
        n.f(mediaType, "mediaType");
        int iOrdinal = mediaType.ordinal();
        if (iOrdinal == 0) {
            return eh.a.f40044c;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return eh.b.f40048c;
            }
            if (iOrdinal != 3) {
                throw new aa.b((byte) 0, 20);
            }
        }
        return eh.c.f40052c;
    }

    public final boolean b(h hVar) {
        Long lValueOf;
        if (hVar != null) {
            c cVar = hVar.f38898a;
            if (this.f38899b == hVar.f38899b && hVar.c() && c()) {
                long j10 = cVar.f38888a;
                c cVar2 = this.f38898a;
                long jBitCount = Long.bitCount(j10 ^ cVar2.f38888a);
                if (jBitCount < a().y()) {
                    pk.e eVarO = a().o();
                    n.f(eVarO, "<this>");
                    if (eVarO.b(jBitCount)) {
                        return true;
                    }
                    if (c() && hVar.c()) {
                        double[][] dArr = cVar2.f38889b;
                        double[][] dArr2 = cVar.f38889b;
                        int length = dArr.length;
                        double dAbs = 0.0d;
                        for (int i10 = 0; i10 < length; i10++) {
                            int length2 = dArr[i10].length;
                            for (int i11 = 0; i11 < length2; i11++) {
                                dAbs += Math.abs(dArr[i10][i11] - dArr2[i10][i11]);
                            }
                        }
                        lValueOf = Long.valueOf((long) dAbs);
                    } else {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        long jLongValue = lValueOf.longValue();
                        for (wj.f fVar : a().w()) {
                            pk.e eVar = (pk.e) fVar.f53283a;
                            pk.e eVar2 = (pk.e) fVar.f53284b;
                            n.f(eVar, "<this>");
                            if (eVar.b(jBitCount)) {
                                return eVar2.b(jLongValue);
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean c() {
        c cVar = this.f38898a;
        return (cVar.f38888a == -1 || cVar.f38889b.length == 0) ? false : true;
    }
}
