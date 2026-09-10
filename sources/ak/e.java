package ak;

import com.ironsource.X3;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements k, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f3617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f3618b;

    public e(i element, k left) {
        n.f(left, "left");
        n.f(element, "element");
        this.f3617a = left;
        this.f3618b = element;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int iG = g();
        final k[] kVarArr = new k[iG];
        final a0 a0Var = new a0();
        fold(r.f53297a, new jk.c() { // from class: ak.b
            @Override // jk.c
            public final Object invoke(Object obj, Object obj2) {
                i element = (i) obj2;
                n.f((r) obj, "<unused var>");
                n.f(element, "element");
                a0 a0Var2 = a0Var;
                int i10 = a0Var2.f44754a;
                a0Var2.f44754a = i10 + 1;
                kVarArr[i10] = element;
                return r.f53297a;
            }
        });
        if (a0Var.f44754a == iG) {
            return new d(kVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.g() == g()) {
                while (true) {
                    i iVar = this.f3618b;
                    if (!n.a(eVar.get(iVar.getKey()), iVar)) {
                        zA = false;
                        break;
                    }
                    k kVar = this.f3617a;
                    if (!(kVar instanceof e)) {
                        n.d(kVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        i iVar2 = (i) kVar;
                        zA = n.a(eVar.get(iVar2.getKey()), iVar2);
                        break;
                    }
                    this = (e) kVar;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ak.k
    public final Object fold(Object obj, jk.c cVar) {
        return cVar.invoke(this.f3617a.fold(obj, cVar), this.f3618b);
    }

    public final int g() {
        int i10 = 2;
        while (true) {
            k kVar = this.f3617a;
            this = kVar instanceof e ? (e) kVar : null;
            if (this == null) {
                return i10;
            }
            i10++;
        }
    }

    @Override // ak.k
    public final i get(j key) {
        n.f(key, "key");
        while (true) {
            i iVar = this.f3618b.get(key);
            if (iVar != null) {
                return iVar;
            }
            k kVar = this.f3617a;
            if (!(kVar instanceof e)) {
                return kVar.get(key);
            }
            this = (e) kVar;
        }
    }

    public final int hashCode() {
        return this.f3618b.hashCode() + this.f3617a.hashCode();
    }

    @Override // ak.k
    public final k minusKey(j key) {
        n.f(key, "key");
        i iVar = this.f3618b;
        i iVar2 = iVar.get(key);
        k kVar = this.f3617a;
        if (iVar2 != null) {
            return kVar;
        }
        k kVarMinusKey = kVar.minusKey(key);
        if (kVarMinusKey == kVar) {
            return this;
        }
        return kVarMinusKey == l.f3620a ? iVar : new e(iVar, kVarMinusKey);
    }

    @Override // ak.k
    public final k plus(k context) {
        n.f(context, "context");
        return context == l.f3620a ? this : (k) context.fold(this, new c(1));
    }

    public final String toString() {
        return wi.d.k(new StringBuilder(X3.j.f27834d), (String) fold("", new c(0)), ']');
    }
}
