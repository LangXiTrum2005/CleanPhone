package qk;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tk.l1;
import tk.o1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements TypeVariable, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f49118a;

    public f0(y yVar) {
        this.f49118a = yVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !getName().equals(((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        o1 o1Var = ((l1) this.f49118a).f51012b;
        w wVar = l1.f51010d[0];
        Object objInvoke = o1Var.invoke();
        kotlin.jvm.internal.n.e(objInvoke, "<get-upperBounds>(...)");
        List list = (List) objInvoke;
        ArrayList arrayList = new ArrayList(xj.p.W(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i0.k((x) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new cn.c0(defpackage.e.n("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f49118a), 4);
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return ((l1) this.f49118a).a();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return getName();
    }

    public final int hashCode() {
        getName();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return getName();
    }
}
