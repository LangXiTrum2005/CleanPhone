package zl;

import com.google.android.gms.internal.ads.k3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f55066a;

    public k() {
        this.f55066a = new h();
    }

    public final boolean l() {
        x xVar = this.f55066a.f55042a;
        for (int i10 = 0; i10 < xVar.f55090b.size(); i10++) {
            if (!h.e((Map.Entry) xVar.f55090b.get(i10))) {
                return false;
            }
        }
        Iterator it = xVar.c().iterator();
        while (it.hasNext()) {
            if (!h.e((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int m() {
        x xVar = this.f55066a.f55042a;
        int iD = 0;
        for (int i10 = 0; i10 < xVar.f55090b.size(); i10++) {
            Map.Entry entry = (Map.Entry) xVar.f55090b.get(i10);
            iD += h.d((l) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : xVar.c()) {
            iD += h.d((l) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final Object n(m mVar) {
        r(mVar);
        l lVar = mVar.f55073d;
        Object obj = this.f55066a.f55042a.get(lVar);
        if (obj == null) {
            return mVar.f55071b;
        }
        if (!lVar.f55069c) {
            return mVar.a(obj);
        }
        if (lVar.f55068b.f55051a != j0.ENUM) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(mVar.a(it.next()));
        }
        return arrayList;
    }

    public final boolean o(m mVar) {
        r(mVar);
        l lVar = mVar.f55073d;
        h hVar = this.f55066a;
        hVar.getClass();
        if (lVar.f55069c) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return hVar.f55042a.get(lVar) != null;
    }

    public final void p() {
        this.f55066a.f();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    public final boolean q(e eVar, k3 k3Var, g gVar, int i10) throws q {
        boolean z10;
        boolean z11;
        Object objA;
        a aVar;
        int i11 = i10 & 7;
        m mVar = (m) gVar.f55040a.get(new f(getDefaultInstanceForType(), i10 >>> 3));
        if (mVar == null) {
            z11 = true;
            z10 = false;
        } else {
            l lVar = mVar.f55073d;
            i0 i0Var = lVar.f55068b;
            h hVar = h.f55041c;
            if (i11 == i0Var.f55052b) {
                z11 = false;
                z10 = false;
            } else if (lVar.f55069c && i0Var.d() && i11 == 2) {
                z10 = true;
                z11 = false;
            } else {
                z11 = true;
                z10 = false;
            }
        }
        if (z11) {
            return eVar.q(i10, k3Var);
        }
        i iVarG = null;
        h hVar2 = this.f55066a;
        if (z10) {
            int iD = eVar.d(eVar.k());
            l lVar2 = mVar.f55073d;
            if (lVar2.f55068b != i0.f55049g) {
                while (eVar.b() > 0) {
                    hVar2.a(lVar2, h.h(eVar, lVar2.f55068b));
                }
            } else if (eVar.b() > 0) {
                eVar.k();
                throw null;
            }
            eVar.c(iD);
            return true;
        }
        l lVar3 = mVar.f55073d;
        i0 i0Var2 = lVar3.f55068b;
        boolean z12 = lVar3.f55069c;
        int iOrdinal = i0Var2.f55051a.ordinal();
        if (iOrdinal == 7) {
            eVar.k();
            throw null;
        }
        if (iOrdinal != 8) {
            objA = h.h(eVar, i0Var2);
        } else {
            if (!z12 && (aVar = (a) hVar2.f55042a.get(lVar3)) != null) {
                iVarG = aVar.h();
            }
            if (iVarG == null) {
                iVarG = mVar.f55072c.g();
            }
            if (i0Var2 == i0.f55047e) {
                int i12 = lVar3.f55067a;
                int i13 = eVar.f55036i;
                if (i13 >= 64) {
                    throw new q("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                }
                eVar.f55036i = i13 + 1;
                iVarG.b(eVar, gVar);
                eVar.a((i12 << 3) | 4);
                eVar.f55036i--;
            } else {
                int iK = eVar.k();
                if (eVar.f55036i >= 64) {
                    throw new q("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                }
                int iD2 = eVar.d(iK);
                eVar.f55036i++;
                iVarG.b(eVar, gVar);
                eVar.a(0);
                eVar.f55036i--;
                eVar.c(iD2);
            }
            objA = iVarG.a();
        }
        if (z12) {
            hVar2.a(lVar3, mVar.b(objA));
            return true;
        }
        hVar2.i(lVar3, mVar.b(objA));
        return true;
    }

    public final void r(m mVar) {
        if (mVar.f55070a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public k(j jVar) {
        jVar.f55053b.f();
        jVar.f55054c = false;
        this.f55066a = jVar.f55053b;
    }
}
