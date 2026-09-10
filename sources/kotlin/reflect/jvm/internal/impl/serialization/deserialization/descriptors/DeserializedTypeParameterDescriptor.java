package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes7.dex */
public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {
    public final DeserializationContext l0;
    public final ProtoBuf.TypeParameter m0;
    public final DeserializedAnnotations n0;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializedTypeParameterDescriptor(DeserializationContext c2, ProtoBuf.TypeParameter typeParameter, int i2) {
        Variance variance;
        Intrinsics.f(c2, "c");
        DeserializationComponents deserializationComponents = c2.f44401a;
        LockBasedStorageManager lockBasedStorageManager = deserializationComponents.f44391a;
        Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$1 = Annotations.Companion.f43614a;
        Name nameB = NameResolverUtilKt.b(c2.f44402b, typeParameter.f0);
        ProtoBuf.TypeParameter.Variance variance2 = typeParameter.h0;
        Intrinsics.e(variance2, "proto.variance");
        int iOrdinal = variance2.ordinal();
        if (iOrdinal == 0) {
            variance = Variance.IN_VARIANCE;
        } else if (iOrdinal == 1) {
            variance = Variance.OUT_VARIANCE;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            variance = Variance.INVARIANT;
        }
        Variance variance3 = variance;
        super(lockBasedStorageManager, c2.f44403c, annotations$Companion$EMPTY$1, nameB, variance3, typeParameter.g0, i2, SupertypeLoopChecker.EMPTY.f43593a);
        this.l0 = c2;
        this.m0 = typeParameter;
        this.n0 = new DeserializedAnnotations(deserializationComponents.f44391a, new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$annotations$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor = this.X;
                DeserializationContext deserializationContext = deserializedTypeParameterDescriptor.l0;
                return CollectionsKt.i0(deserializationContext.f44401a.f44394e.g(deserializedTypeParameterDescriptor.m0, deserializationContext.f44402b));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final void G0(KotlinType type) {
        Intrinsics.f(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final List H0() {
        DeserializationContext deserializationContext = this.l0;
        TypeTable typeTable = deserializationContext.d;
        ProtoBuf.TypeParameter typeParameter = this.m0;
        Intrinsics.f(typeParameter, "<this>");
        List list = typeParameter.i0;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List upperBoundIdList = typeParameter.j0;
            Intrinsics.e(upperBoundIdList, "upperBoundIdList");
            List<Integer> list2 = upperBoundIdList;
            arrayList = new ArrayList(CollectionsKt.n(list2, 10));
            for (Integer it : list2) {
                Intrinsics.e(it, "it");
                arrayList.add(typeTable.a(it.intValue()));
            }
        }
        if (arrayList.isEmpty()) {
            return CollectionsKt.H(DescriptorUtilsKt.e(this).n());
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(deserializationContext.f44405h.g((ProtoBuf.Type) it2.next()));
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        return this.n0;
    }
}
