package ae;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f3515b;

    public /* synthetic */ n(q qVar, int i10) {
        this.f3514a = i10;
        this.f3515b = qVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f3514a) {
            case 0:
                this.f3515b.clear();
                break;
            default:
                this.f3515b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        p pVarA;
        switch (this.f3514a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                q qVar = this.f3515b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                p pVar = null;
                if (key != null) {
                    try {
                        pVarA = qVar.a(key, false);
                    } catch (ClassCastException unused) {
                        pVarA = null;
                    }
                    break;
                } else {
                    pVarA = null;
                }
                if (pVarA != null && Objects.equals(pVarA.f3528h, entry.getValue())) {
                    pVar = pVarA;
                }
                return pVar != null;
            default:
                return this.f3515b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f3514a) {
            case 0:
                return new m(this.f3515b, 0);
            default:
                return new m(this.f3515b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        p pVarA;
        switch (this.f3514a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                q qVar = this.f3515b;
                p pVar = null;
                if (key != null) {
                    try {
                        pVarA = qVar.a(key, false);
                    } catch (ClassCastException unused) {
                        pVarA = null;
                    }
                    break;
                } else {
                    pVarA = null;
                }
                if (pVarA != null && Objects.equals(pVarA.f3528h, entry.getValue())) {
                    pVar = pVarA;
                }
                if (pVar == null) {
                    return false;
                }
                qVar.c(pVar, true);
                return true;
            default:
                q qVar2 = this.f3515b;
                p pVarA2 = null;
                if (obj != null) {
                    try {
                        pVarA2 = qVar2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (pVarA2 != null) {
                    qVar2.c(pVarA2, true);
                }
                return pVarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f3514a) {
            case 0:
                break;
        }
        return this.f3515b.f3534d;
    }
}
