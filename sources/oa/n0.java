package oa;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f47279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f47280b;

    public n0(o0 o0Var) {
        int i10 = ((s1) o0Var).f47310f;
        Object[] objArr = new Object[i10];
        Object[] objArr2 = new Object[i10];
        e2 it = o0Var.entrySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i11] = entry.getKey();
            objArr2[i11] = entry.getValue();
            i11++;
        }
        this.f47279a = objArr;
        this.f47280b = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.f47279a;
        boolean z10 = objArr instanceof u0;
        Object[] objArr2 = this.f47280b;
        if (!z10) {
            b2.p pVar = new b2.p(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                pVar.l(objArr[i10], objArr2[i10]);
            }
            return pVar.c(true);
        }
        u0 u0Var = (u0) objArr;
        b2.p pVar2 = new b2.p(u0Var.size());
        e2 it = u0Var.iterator();
        e2 it2 = ((c0) objArr2).iterator();
        while (it.hasNext()) {
            pVar2.l(it.next(), it2.next());
        }
        return pVar2.c(true);
    }
}
