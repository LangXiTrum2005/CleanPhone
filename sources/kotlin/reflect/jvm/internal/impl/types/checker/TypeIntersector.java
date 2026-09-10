package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeAttribute;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeIntersector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TypeIntersector f44579a = new TypeIntersector();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResultNullability {
        public static final START X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final ACCEPT_NULL f44580Y;
        public static final UNKNOWN Z;
        public static final NOT_NULL e0;
        public static final /* synthetic */ ResultNullability[] f0;

        public static final class ACCEPT_NULL extends ResultNullability {
            public ACCEPT_NULL() {
                super("ACCEPT_NULL", 1);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability a(UnwrappedType nextType) {
                Intrinsics.f(nextType, "nextType");
                return ResultNullability.b(nextType);
            }
        }

        public static final class NOT_NULL extends ResultNullability {
            public NOT_NULL() {
                super("NOT_NULL", 3);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability a(UnwrappedType nextType) {
                Intrinsics.f(nextType, "nextType");
                return this;
            }
        }

        public static final class START extends ResultNullability {
            public START() {
                super("START", 0);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability a(UnwrappedType nextType) {
                Intrinsics.f(nextType, "nextType");
                return ResultNullability.b(nextType);
            }
        }

        public static final class UNKNOWN extends ResultNullability {
            public UNKNOWN() {
                super("UNKNOWN", 2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability a(UnwrappedType nextType) {
                Intrinsics.f(nextType, "nextType");
                ResultNullability resultNullabilityB = ResultNullability.b(nextType);
                return resultNullabilityB == ResultNullability.f44580Y ? this : resultNullabilityB;
            }
        }

        static {
            START start = new START();
            X = start;
            ACCEPT_NULL accept_null = new ACCEPT_NULL();
            f44580Y = accept_null;
            UNKNOWN unknown = new UNKNOWN();
            Z = unknown;
            NOT_NULL not_null = new NOT_NULL();
            e0 = not_null;
            f0 = new ResultNullability[]{start, accept_null, unknown, not_null};
        }

        public static ResultNullability b(UnwrappedType unwrappedType) {
            Intrinsics.f(unwrappedType, "<this>");
            if (unwrappedType.I0()) {
                return f44580Y;
            }
            boolean z2 = unwrappedType instanceof DefinitelyNotNullType;
            NOT_NULL not_null = e0;
            if (!z2 || !(((DefinitelyNotNullType) unwrappedType).f44501Y instanceof StubTypeForBuilderInference)) {
                boolean z3 = unwrappedType instanceof StubTypeForBuilderInference;
                UNKNOWN unknown = Z;
                if (z3 || !AbstractNullabilityChecker.a(ClassicTypeCheckerStateKt.a(false, null, 24), FlexibleTypesKt.b(unwrappedType), TypeCheckerState.SupertypesPolicy.LowerIfFlexible.f44536a)) {
                    return unknown;
                }
            }
            return not_null;
        }

        public static ResultNullability valueOf(String str) {
            return (ResultNullability) Enum.valueOf(ResultNullability.class, str);
        }

        public static ResultNullability[] values() {
            return (ResultNullability[]) f0.clone();
        }

        public abstract ResultNullability a(UnwrappedType unwrappedType);
    }

    public static ArrayList a(AbstractCollection abstractCollection, Function2 function2) {
        ArrayList<SimpleType> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        Intrinsics.e(it, "filteredTypes.iterator()");
        while (it.hasNext()) {
            SimpleType upper = (SimpleType) it.next();
            if (!arrayList.isEmpty()) {
                for (SimpleType lower : arrayList) {
                    if (lower != upper) {
                        Intrinsics.e(lower, "lower");
                        Intrinsics.e(upper, "upper");
                        if (((Boolean) function2.invoke(lower, upper)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [kotlin.reflect.jvm.internal.impl.types.TypeAttributes] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.types.TypeAttributes, kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner, kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16, types: [kotlin.reflect.jvm.internal.impl.types.SimpleType] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.SimpleType] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.LinkedHashSet, java.util.Set] */
    public final SimpleType b(ArrayList arrayList) {
        SimpleType simpleType;
        SimpleType simpleTypeF;
        arrayList.size();
        ArrayList<SimpleType> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SimpleType simpleType2 = (SimpleType) it.next();
            if (simpleType2.H0() instanceof IntersectionTypeConstructor) {
                Collection collectionD = simpleType2.H0().d();
                Intrinsics.e(collectionD, "type.constructor.supertypes");
                Collection<KotlinType> collection = collectionD;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.n(collection, 10));
                for (KotlinType it2 : collection) {
                    Intrinsics.e(it2, "it");
                    SimpleType simpleTypeC = FlexibleTypesKt.c(it2);
                    if (simpleType2.I0()) {
                        simpleTypeC = simpleTypeC.L0(true);
                    }
                    arrayList3.add(simpleTypeC);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(simpleType2);
            }
        }
        ResultNullability resultNullabilityA = ResultNullability.X;
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            resultNullabilityA = resultNullabilityA.a((UnwrappedType) it3.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (SimpleType simpleTypeL0 : arrayList2) {
            if (resultNullabilityA == ResultNullability.e0) {
                if (simpleTypeL0 instanceof NewCapturedType) {
                    NewCapturedType newCapturedType = (NewCapturedType) simpleTypeL0;
                    Intrinsics.f(newCapturedType, "<this>");
                    simpleTypeL0 = new NewCapturedType(newCapturedType.f44566Y, newCapturedType.Z, newCapturedType.e0, newCapturedType.f0, newCapturedType.g0, true);
                }
                Intrinsics.f(simpleTypeL0, "<this>");
                SimpleType simpleTypeA = DefinitelyNotNullType.Companion.a(simpleTypeL0, false);
                simpleTypeL0 = (simpleTypeA == null && (simpleTypeA = SpecialTypesKt.b(simpleTypeL0)) == null) ? simpleTypeL0.L0(false) : simpleTypeA;
            }
            linkedHashSet.add(simpleTypeL0);
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.n(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((SimpleType) it4.next()).G0());
        }
        Iterator it5 = arrayList4.iterator();
        if (!it5.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it5.next();
        while (it5.hasNext()) {
            TypeAttributes other = (TypeAttributes) it5.next();
            next = (TypeAttributes) next;
            next.getClass();
            Intrinsics.f(other, "other");
            if (!next.isEmpty() || !other.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = TypeAttributes.f44529Y.f44635a.values();
                Intrinsics.e(collectionValues, "idPerType.values");
                Iterator it6 = collectionValues.iterator();
                while (it6.hasNext()) {
                    int iIntValue = ((Number) it6.next()).intValue();
                    TypeAttribute typeAttribute = (TypeAttribute) next.X.get(iIntValue);
                    TypeAttribute typeAttribute2 = (TypeAttribute) other.X.get(iIntValue);
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList5, typeAttribute == null ? typeAttribute2 != null ? typeAttribute2.c(typeAttribute) : null : typeAttribute.c(typeAttribute2));
                }
                next = TypeAttributes.Companion.c(arrayList5);
            }
        }
        TypeAttributes typeAttributes = (TypeAttributes) next;
        if (linkedHashSet.size() == 1) {
            simpleTypeF = (SimpleType) CollectionsKt.V(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(2, this));
            arrayListA.isEmpty();
            if (arrayListA.isEmpty()) {
                simpleType = null;
            } else {
                Iterator it7 = arrayListA.iterator();
                if (!it7.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                ?? next2 = it7.next();
                while (it7.hasNext()) {
                    SimpleType simpleType3 = (SimpleType) it7.next();
                    next2 = (SimpleType) next2;
                    if (next2 != 0 && simpleType3 != null) {
                        TypeConstructor typeConstructorH0 = next2.H0();
                        TypeConstructor typeConstructorH1 = simpleType3.H0();
                        boolean z2 = typeConstructorH0 instanceof IntegerLiteralTypeConstructor;
                        if (z2 && (typeConstructorH1 instanceof IntegerLiteralTypeConstructor)) {
                            LinkedHashSet linkedHashSet2 = ((IntegerLiteralTypeConstructor) typeConstructorH0).f44307a;
                            LinkedHashSet other2 = ((IntegerLiteralTypeConstructor) typeConstructorH1).f44307a;
                            Intrinsics.f(linkedHashSet2, "<this>");
                            Intrinsics.f(other2, "other");
                            LinkedHashSet linkedHashSetK0 = CollectionsKt.k0(linkedHashSet2);
                            CollectionsKt.g(other2, linkedHashSetK0);
                            IntegerLiteralTypeConstructor integerLiteralTypeConstructor = new IntegerLiteralTypeConstructor(linkedHashSetK0);
                            TypeAttributes.f44529Y.getClass();
                            TypeAttributes attributes = TypeAttributes.Z;
                            Intrinsics.f(attributes, "attributes");
                            next2 = KotlinTypeFactory.e(EmptyList.X, ErrorUtils.a(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), attributes, integerLiteralTypeConstructor, false);
                        } else if (z2) {
                            if (!((IntegerLiteralTypeConstructor) typeConstructorH0).f44307a.contains(simpleType3)) {
                                simpleType3 = null;
                            }
                            next2 = simpleType3;
                        } else if (!(typeConstructorH1 instanceof IntegerLiteralTypeConstructor) || !((IntegerLiteralTypeConstructor) typeConstructorH1).f44307a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                simpleType = (SimpleType) next2;
            }
            if (simpleType != null) {
                simpleTypeF = simpleType;
            } else {
                NewKotlinTypeChecker.f44572b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1(2, NewKotlinTypeChecker.Companion.f44574b));
                arrayListA2.isEmpty();
                simpleTypeF = arrayListA2.size() < 2 ? (SimpleType) CollectionsKt.V(arrayListA2) : new IntersectionTypeConstructor(linkedHashSet).f();
            }
        }
        return simpleTypeF.N0(typeAttributes);
    }
}
