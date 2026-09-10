package kotlin.reflect;

import android.support.v4.media.a;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/TypeVariableImpl;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "Lkotlin/reflect/TypeImpl;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class TypeVariableImpl implements TypeVariable<GenericDeclaration>, TypeImpl {
    public final KTypeParameter X;

    public TypeVariableImpl(KTypeParameter typeParameter) {
        Intrinsics.f(typeParameter, "typeParameter");
        this.X = typeParameter;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !Intrinsics.a(this.X.getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List upperBounds = this.X.getUpperBounds();
        ArrayList arrayList = new ArrayList(CollectionsKt.n(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(TypesJVMKt.b((KType) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError(a.C("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.X));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.X.getName();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return this.X.getName();
    }

    public final int hashCode() {
        this.X.getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return this.X.getName();
    }
}
