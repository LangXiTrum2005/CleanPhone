package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes7.dex */
class KClasses$$Lambda$0 implements DFS.Neighbors {
    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable a(Object obj) {
        KType kType = (KType) obj;
        KClassifier x = kType.getX();
        KClass kClass = x instanceof KClass ? (KClass) x : null;
        if (kClass == null) {
            throw new KotlinReflectionInternalError("Supertype not a class: " + kType);
        }
        List listD = kClass.d();
        if (kType.getF43338Y().isEmpty()) {
            return listD;
        }
        TypeSubstitutor typeSubstitutorD = TypeSubstitutor.d(((KTypeImpl) kType).X);
        List<KType> list = listD;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
        for (KType kType2 : list) {
            Intrinsics.d(kType2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            KotlinType kotlinTypeI = typeSubstitutorD.i(((KTypeImpl) kType2).X, Variance.INVARIANT);
            if (kotlinTypeI == null) {
                throw new KotlinReflectionInternalError("Type substitution failed: " + kType2 + " (" + kType + ')');
            }
            arrayList.add(new KTypeImpl(kotlinTypeI, null));
        }
        return arrayList;
    }
}
