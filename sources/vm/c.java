package vm;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f52659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52660b;

    @Override // vm.a
    public final int b() {
        return this.f52660b;
    }

    @Override // vm.a
    public final Object get(int i10) {
        return xj.k.s0(i10, this.f52659a);
    }

    @Override // vm.a
    public final void h(int i10, pm.i iVar) {
        Object[] objArr = this.f52659a;
        if (objArr.length <= i10) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length * 2);
            kotlin.jvm.internal.n.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f52659a = objArrCopyOf;
        }
        Object[] objArr2 = this.f52659a;
        if (objArr2[i10] == null) {
            this.f52660b++;
        }
        objArr2[i10] = iVar;
    }

    @Override // vm.a, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this);
    }
}
