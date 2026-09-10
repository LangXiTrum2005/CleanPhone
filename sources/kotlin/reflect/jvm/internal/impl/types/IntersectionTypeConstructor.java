package kotlin.reflect.jvm.internal.impl.types;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class IntersectionTypeConstructor implements TypeConstructor, IntersectionTypeConstructorMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public KotlinType f44512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f44513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44514c;

    public IntersectionTypeConstructor(AbstractCollection typesToIntersect) {
        Intrinsics.f(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(typesToIntersect);
        this.f44513b = linkedHashSet;
        this.f44514c = linkedHashSet.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final ClassifierDescriptor c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final Collection d() {
        return this.f44513b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntersectionTypeConstructor) {
            return Intrinsics.a(this.f44513b, ((IntersectionTypeConstructor) obj).f44513b);
        }
        return false;
    }

    public final SimpleType f() {
        TypeAttributes.f44529Y.getClass();
        return KotlinTypeFactory.f(TypeAttributes.Z, this, EmptyList.X, false, TypeIntersectionScope.Companion.a("member scope for intersection type", this.f44513b), new Function1<KotlinTypeRefiner, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$createType$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj;
                Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
                IntersectionTypeConstructor intersectionTypeConstructor = this.X;
                intersectionTypeConstructor.getClass();
                Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
                LinkedHashSet linkedHashSet = intersectionTypeConstructor.f44513b;
                ArrayList arrayList = new ArrayList(CollectionsKt.n(linkedHashSet, 10));
                Iterator it = linkedHashSet.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    arrayList.add(((KotlinType) it.next()).J0(kotlinTypeRefiner));
                    z2 = true;
                }
                IntersectionTypeConstructor intersectionTypeConstructor2 = null;
                if (z2) {
                    KotlinType kotlinType = intersectionTypeConstructor.f44512a;
                    KotlinType kotlinTypeJ0 = kotlinType != null ? kotlinType.J0(kotlinTypeRefiner) : null;
                    IntersectionTypeConstructor intersectionTypeConstructor3 = new IntersectionTypeConstructor(new IntersectionTypeConstructor(arrayList).f44513b);
                    intersectionTypeConstructor3.f44512a = kotlinTypeJ0;
                    intersectionTypeConstructor2 = intersectionTypeConstructor3;
                }
                if (intersectionTypeConstructor2 != null) {
                    intersectionTypeConstructor = intersectionTypeConstructor2;
                }
                return intersectionTypeConstructor.f();
            }
        });
    }

    public final String g(final Function1 getProperTypeRelatedToStringify) {
        Intrinsics.f(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return CollectionsKt.D(CollectionsKt.c0(new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                KotlinType it = (KotlinType) obj;
                Intrinsics.e(it, "it");
                Function1 function1 = getProperTypeRelatedToStringify;
                String string = function1.invoke(it).toString();
                KotlinType it2 = (KotlinType) obj2;
                Intrinsics.e(it2, "it");
                return ComparisonsKt.a(string, function1.invoke(it2).toString());
            }
        }, this.f44513b), " & ", "{", "}", new Function1<KotlinType, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinType it = (KotlinType) obj;
                Intrinsics.e(it, "it");
                return getProperTypeRelatedToStringify.invoke(it).toString();
            }
        }, 24);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return EmptyList.X;
    }

    public final int hashCode() {
        return this.f44514c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final KotlinBuiltIns k() {
        KotlinBuiltIns kotlinBuiltInsK = ((KotlinType) this.f44513b.iterator().next()).H0().k();
        Intrinsics.e(kotlinBuiltInsK, "intersectedTypes.iterato…xt().constructor.builtIns");
        return kotlinBuiltInsK;
    }

    public final String toString() {
        return g(IntersectionTypeConstructor$makeDebugNameForIntersectionType$1.X);
    }
}
