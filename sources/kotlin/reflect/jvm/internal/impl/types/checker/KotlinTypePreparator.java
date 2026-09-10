package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public abstract class KotlinTypePreparator extends AbstractTypePreparator {

    public static final class Default extends KotlinTypePreparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Default f44563a = new Default();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public static SimpleType b(SimpleType simpleType) {
        KotlinType type;
        TypeConstructor typeConstructorH0 = simpleType.H0();
        ?? r3 = 0;
        if (typeConstructorH0 instanceof CapturedTypeConstructorImpl) {
            CapturedTypeConstructorImpl capturedTypeConstructorImpl = (CapturedTypeConstructorImpl) typeConstructorH0;
            TypeProjection typeProjection = capturedTypeConstructorImpl.f44297a;
            if (typeProjection.b() != Variance.IN_VARIANCE) {
                typeProjection = null;
            }
            UnwrappedType unwrappedTypeK0 = (typeProjection == null || (type = typeProjection.getType()) == null) ? null : type.K0();
            if (capturedTypeConstructorImpl.f44298b == null) {
                Collection collectionD = capturedTypeConstructorImpl.d();
                final ArrayList arrayList = new ArrayList(CollectionsKt.n(collectionD, 10));
                Iterator it = collectionD.iterator();
                while (it.hasNext()) {
                    arrayList.add(((KotlinType) it.next()).K0());
                }
                TypeProjection projection = capturedTypeConstructorImpl.f44297a;
                Intrinsics.f(projection, "projection");
                capturedTypeConstructorImpl.f44298b = new NewCapturedTypeConstructor(projection, new Function0<List<? extends UnwrappedType>>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return arrayList;
                    }
                }, (TypeParameterDescriptor) r3, 8);
            }
            CaptureStatus captureStatus = CaptureStatus.X;
            NewCapturedTypeConstructor newCapturedTypeConstructor = capturedTypeConstructorImpl.f44298b;
            Intrinsics.c(newCapturedTypeConstructor);
            return new NewCapturedType(captureStatus, newCapturedTypeConstructor, unwrappedTypeK0, simpleType.G0(), simpleType.I0(), 32);
        }
        if (typeConstructorH0 instanceof IntegerValueTypeConstructor) {
            ((IntegerValueTypeConstructor) typeConstructorH0).getClass();
            CollectionsKt.n(null, 10);
            throw null;
        }
        if (!(typeConstructorH0 instanceof IntersectionTypeConstructor) || !simpleType.I0()) {
            return simpleType;
        }
        ?? r0 = (IntersectionTypeConstructor) typeConstructorH0;
        LinkedHashSet linkedHashSet = r0.f44513b;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            arrayList2.add(TypeUtilsKt.j((KotlinType) it2.next()));
            z2 = true;
        }
        if (z2) {
            KotlinType kotlinType = r0.f44512a;
            UnwrappedType unwrappedTypeJ = kotlinType != null ? TypeUtilsKt.j(kotlinType) : null;
            IntersectionTypeConstructor intersectionTypeConstructor = new IntersectionTypeConstructor(new IntersectionTypeConstructor(arrayList2).f44513b);
            intersectionTypeConstructor.f44512a = unwrappedTypeJ;
            r3 = intersectionTypeConstructor;
        }
        if (r3 != 0) {
            r0 = r3;
        }
        return r0.f();
    }

    public final UnwrappedType a(KotlinTypeMarker type) {
        UnwrappedType unwrappedTypeB;
        Intrinsics.f(type, "type");
        if (!(type instanceof KotlinType)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        UnwrappedType unwrappedTypeK0 = ((KotlinType) type).K0();
        if (unwrappedTypeK0 instanceof SimpleType) {
            unwrappedTypeB = b((SimpleType) unwrappedTypeK0);
        } else {
            if (!(unwrappedTypeK0 instanceof FlexibleType)) {
                throw new NoWhenBranchMatchedException();
            }
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeK0;
            SimpleType simpleType = flexibleType.f44509Y;
            SimpleType simpleTypeB = b(simpleType);
            SimpleType simpleType2 = flexibleType.Z;
            SimpleType simpleTypeB2 = b(simpleType2);
            unwrappedTypeB = (simpleTypeB == simpleType && simpleTypeB2 == simpleType2) ? unwrappedTypeK0 : KotlinTypeFactory.b(simpleTypeB, simpleTypeB2);
        }
        KotlinTypePreparator$prepareType$1 kotlinTypePreparator$prepareType$1 = new KotlinTypePreparator$prepareType$1(1, this);
        KotlinType kotlinTypeA = TypeWithEnhancementKt.a(unwrappedTypeK0);
        return TypeWithEnhancementKt.c(unwrappedTypeB, kotlinTypeA != null ? (KotlinType) kotlinTypePreparator$prepareType$1.invoke(kotlinTypeA) : null);
    }
}
