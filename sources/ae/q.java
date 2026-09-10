package ae;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f3530i = new l(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f3533c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f3536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n f3537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n f3538h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3534d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3535e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f3531a = f3530i;

    public q(boolean z10) {
        this.f3532b = z10;
        this.f3536f = new p(z10);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final p a(Object obj, boolean z10) {
        int iCompareTo;
        p pVar;
        p pVar2 = this.f3533c;
        l lVar = f3530i;
        Comparator comparator = this.f3531a;
        if (pVar2 != null) {
            Comparable comparable = comparator == lVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = pVar2.f3526f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return pVar2;
                }
                p pVar3 = iCompareTo < 0 ? pVar2.f3522b : pVar2.f3523c;
                if (pVar3 == null) {
                    break;
                }
                pVar2 = pVar3;
            }
        } else {
            iCompareTo = 0;
        }
        p pVar4 = pVar2;
        if (!z10) {
            return null;
        }
        p pVar5 = this.f3536f;
        if (pVar4 != null) {
            pVar = new p(this.f3532b, pVar4, obj, pVar5, pVar5.f3525e);
            if (iCompareTo < 0) {
                pVar4.f3522b = pVar;
            } else {
                pVar4.f3523c = pVar;
            }
            b(pVar4, true);
        } else {
            if (comparator == lVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            pVar = new p(this.f3532b, pVar4, obj, pVar5, pVar5.f3525e);
            this.f3533c = pVar;
        }
        this.f3534d++;
        this.f3535e++;
        return pVar;
    }

    public final void b(p pVar, boolean z10) {
        while (pVar != null) {
            p pVar2 = pVar.f3522b;
            p pVar3 = pVar.f3523c;
            int i10 = pVar2 != null ? pVar2.f3529i : 0;
            int i11 = pVar3 != null ? pVar3.f3529i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                p pVar4 = pVar3.f3522b;
                p pVar5 = pVar3.f3523c;
                int i13 = (pVar4 != null ? pVar4.f3529i : 0) - (pVar5 != null ? pVar5.f3529i : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    e(pVar);
                } else {
                    f(pVar3);
                    e(pVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                p pVar6 = pVar2.f3522b;
                p pVar7 = pVar2.f3523c;
                int i14 = (pVar6 != null ? pVar6.f3529i : 0) - (pVar7 != null ? pVar7.f3529i : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    f(pVar);
                } else {
                    e(pVar2);
                    f(pVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                pVar.f3529i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                pVar.f3529i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            pVar = pVar.f3521a;
        }
    }

    public final void c(p pVar, boolean z10) {
        p pVar2;
        p pVar3;
        int i10;
        if (z10) {
            p pVar4 = pVar.f3525e;
            pVar4.f3524d = pVar.f3524d;
            pVar.f3524d.f3525e = pVar4;
        }
        p pVar5 = pVar.f3522b;
        p pVar6 = pVar.f3523c;
        p pVar7 = pVar.f3521a;
        int i11 = 0;
        if (pVar5 == null || pVar6 == null) {
            if (pVar5 != null) {
                d(pVar, pVar5);
                pVar.f3522b = null;
            } else if (pVar6 != null) {
                d(pVar, pVar6);
                pVar.f3523c = null;
            } else {
                d(pVar, null);
            }
            b(pVar7, false);
            this.f3534d--;
            this.f3535e++;
            return;
        }
        if (pVar5.f3529i > pVar6.f3529i) {
            p pVar8 = pVar5.f3523c;
            while (true) {
                p pVar9 = pVar8;
                pVar3 = pVar5;
                pVar5 = pVar9;
                if (pVar5 == null) {
                    break;
                } else {
                    pVar8 = pVar5.f3523c;
                }
            }
        } else {
            p pVar10 = pVar6.f3522b;
            while (true) {
                pVar2 = pVar6;
                pVar6 = pVar10;
                if (pVar6 == null) {
                    break;
                } else {
                    pVar10 = pVar6.f3522b;
                }
            }
            pVar3 = pVar2;
        }
        c(pVar3, false);
        p pVar11 = pVar.f3522b;
        if (pVar11 != null) {
            i10 = pVar11.f3529i;
            pVar3.f3522b = pVar11;
            pVar11.f3521a = pVar3;
            pVar.f3522b = null;
        } else {
            i10 = 0;
        }
        p pVar12 = pVar.f3523c;
        if (pVar12 != null) {
            i11 = pVar12.f3529i;
            pVar3.f3523c = pVar12;
            pVar12.f3521a = pVar3;
            pVar.f3523c = null;
        }
        pVar3.f3529i = Math.max(i10, i11) + 1;
        d(pVar, pVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f3533c = null;
        this.f3534d = 0;
        this.f3535e++;
        p pVar = this.f3536f;
        pVar.f3525e = pVar;
        pVar.f3524d = pVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        p pVarA = null;
        if (obj != null) {
            try {
                pVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return pVarA != null;
    }

    public final void d(p pVar, p pVar2) {
        p pVar3 = pVar.f3521a;
        pVar.f3521a = null;
        if (pVar2 != null) {
            pVar2.f3521a = pVar3;
        }
        if (pVar3 == null) {
            this.f3533c = pVar2;
        } else if (pVar3.f3522b == pVar) {
            pVar3.f3522b = pVar2;
        } else {
            pVar3.f3523c = pVar2;
        }
    }

    public final void e(p pVar) {
        p pVar2 = pVar.f3522b;
        p pVar3 = pVar.f3523c;
        p pVar4 = pVar3.f3522b;
        p pVar5 = pVar3.f3523c;
        pVar.f3523c = pVar4;
        if (pVar4 != null) {
            pVar4.f3521a = pVar;
        }
        d(pVar, pVar3);
        pVar3.f3522b = pVar;
        pVar.f3521a = pVar3;
        int iMax = Math.max(pVar2 != null ? pVar2.f3529i : 0, pVar4 != null ? pVar4.f3529i : 0) + 1;
        pVar.f3529i = iMax;
        pVar3.f3529i = Math.max(iMax, pVar5 != null ? pVar5.f3529i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        n nVar = this.f3537g;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this, 0);
        this.f3537g = nVar2;
        return nVar2;
    }

    public final void f(p pVar) {
        p pVar2 = pVar.f3522b;
        p pVar3 = pVar.f3523c;
        p pVar4 = pVar2.f3522b;
        p pVar5 = pVar2.f3523c;
        pVar.f3522b = pVar5;
        if (pVar5 != null) {
            pVar5.f3521a = pVar;
        }
        d(pVar, pVar2);
        pVar2.f3523c = pVar;
        pVar.f3521a = pVar2;
        int iMax = Math.max(pVar3 != null ? pVar3.f3529i : 0, pVar5 != null ? pVar5.f3529i : 0) + 1;
        pVar.f3529i = iMax;
        pVar2.f3529i = Math.max(iMax, pVar4 != null ? pVar4.f3529i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        p pVarA;
        if (obj != null) {
            try {
                pVarA = a(obj, false);
            } catch (ClassCastException unused) {
                pVarA = null;
            }
        } else {
            pVarA = null;
        }
        if (pVarA != null) {
            return pVarA.f3528h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        n nVar = this.f3538h;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this, 1);
        this.f3538h = nVar2;
        return nVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f3532b) {
            throw new NullPointerException("value == null");
        }
        p pVarA = a(obj, true);
        Object obj3 = pVarA.f3528h;
        pVarA.f3528h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        p pVarA;
        if (obj != null) {
            try {
                pVarA = a(obj, false);
            } catch (ClassCastException unused) {
                pVarA = null;
            }
        } else {
            pVarA = null;
        }
        if (pVarA != null) {
            c(pVarA, true);
        }
        if (pVarA != null) {
            return pVarA.f3528h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3534d;
    }
}
