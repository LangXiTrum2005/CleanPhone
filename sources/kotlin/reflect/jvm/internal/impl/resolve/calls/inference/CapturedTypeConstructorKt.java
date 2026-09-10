package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes7.dex */
public final class CapturedTypeConstructorKt {
    public static final TypeProjection a(final TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null || typeProjection.b() == Variance.INVARIANT) {
            return typeProjection;
        }
        if (typeParameterDescriptor.j() != typeProjection.b()) {
            CapturedTypeConstructorImpl capturedTypeConstructorImpl = new CapturedTypeConstructorImpl(typeProjection);
            TypeAttributes.f44529Y.getClass();
            return new TypeProjectionImpl(new CapturedType(typeProjection, capturedTypeConstructorImpl, false, TypeAttributes.Z));
        }
        if (!typeProjection.a()) {
            return new TypeProjectionImpl(typeProjection.getType());
        }
        StorageManager NO_LOCKS = LockBasedStorageManager.f44473e;
        Intrinsics.e(NO_LOCKS, "NO_LOCKS");
        return new TypeProjectionImpl(new LazyWrappedType((LockBasedStorageManager) NO_LOCKS, new Function0<KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$createCapturedIfNeeded$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KotlinType type = typeProjection.getType();
                Intrinsics.e(type, "this@createCapturedIfNeeded.type");
                return type;
            }
        }));
    }

    public static TypeSubstitution b(TypeSubstitution typeSubstitution) {
        if (!(typeSubstitution instanceof IndexedParametersSubstitution)) {
            return new CapturedTypeConstructorKt$wrapWithCapturingSubstitution$2(typeSubstitution);
        }
        IndexedParametersSubstitution indexedParametersSubstitution = (IndexedParametersSubstitution) typeSubstitution;
        TypeProjection[] typeProjectionArr = indexedParametersSubstitution.f44511c;
        TypeParameterDescriptor[] typeParameterDescriptorArr = indexedParametersSubstitution.f44510b;
        ArrayList<Pair> arrayListP = ArraysKt.P(typeProjectionArr, typeParameterDescriptorArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.n(arrayListP, 10));
        for (Pair pair : arrayListP) {
            arrayList.add(a((TypeProjection) pair.X, (TypeParameterDescriptor) pair.f43249Y));
        }
        return new IndexedParametersSubstitution(typeParameterDescriptorArr, (TypeProjection[]) arrayList.toArray(new TypeProjection[0]), true);
    }
}
