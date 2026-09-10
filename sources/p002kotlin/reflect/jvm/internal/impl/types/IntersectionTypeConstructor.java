package p002kotlin.reflect.jvm.internal.impl.types;

import frenchy.saneness;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import presbytery.beachfront;

/* JADX INFO: compiled from: IntersectionTypeConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class IntersectionTypeConstructor implements permissivist, beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public oilcan f31659attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f31660dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final LinkedHashSet<oilcan> f31661saneness;

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class attabal<T> implements Comparator {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Function1 f31662kowloon;

        public attabal(Function1 function1) {
            this.f31662kowloon = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            oilcan oilcanVar = (oilcan) t;
            Function1 function1 = this.f31662kowloon;
            Intrinsics.beachfront(oilcanVar);
            String string = function1.invoke(oilcanVar).toString();
            oilcan oilcanVar2 = (oilcan) t2;
            Function1 function2 = this.f31662kowloon;
            Intrinsics.beachfront(oilcanVar2);
            return saneness.wireman(string, function2.invoke(oilcanVar2).toString());
        }
    }

    public IntersectionTypeConstructor(Collection<? extends oilcan> typesToIntersect) {
        Intrinsics.checkNotNullParameter(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet<oilcan> linkedHashSet = new LinkedHashSet<>(typesToIntersect);
        this.f31661saneness = linkedHashSet;
        this.f31660dern = linkedHashSet.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String formularize(IntersectionTypeConstructor intersectionTypeConstructor, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<oilcan, String>() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$1
                @Override // p002kotlin.jvm.functions.Function1
                public final String invoke(oilcan it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.toString();
                }
            };
        }
        return intersectionTypeConstructor.taiyuan(function1);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public p002kotlin.reflect.jvm.internal.impl.builtins.beachfront apical() {
        p002kotlin.reflect.jvm.internal.impl.builtins.beachfront beachfrontVarApical = this.f31661saneness.iterator().next().setterwort().apical();
        Intrinsics.checkNotNullExpressionValue(beachfrontVarApical, "getBuiltIns(...)");
        return beachfrontVarApical;
    }

    public final MemberScope beachfront() {
        return TypeIntersectionScope.f31378wireman.attabal("member scope for intersection type", this.f31661saneness);
    }

    public final merc competently() {
        return KotlinTypeFactory.triweekly(overspeculate.f31797arytenoidectomy.taiyuan(), this, adultoid.formularize(), false, beachfront(), new Function1<p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront, merc>() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$createType$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final merc invoke(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront kotlinTypeRefiner) {
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                return this.this$0.attabal(kotlinTypeRefiner).competently();
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public Collection<oilcan> cutely() {
        return this.f31661saneness;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntersectionTypeConstructor) {
            return Intrinsics.wireman(this.f31661saneness, ((IntersectionTypeConstructor) obj).f31661saneness);
        }
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public List<clubfoot> getParameters() {
        return adultoid.formularize();
    }

    public int hashCode() {
        return this.f31660dern;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
    public IntersectionTypeConstructor attabal(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection<oilcan> collectionCutely = cutely();
        ArrayList arrayList = new ArrayList(dovishness.gintrap(collectionCutely, 10));
        Iterator<T> it = collectionCutely.iterator();
        boolean z = false;
        while (it.hasNext()) {
            arrayList.add(((oilcan) it.next()).libyan(kotlinTypeRefiner));
            z = true;
        }
        IntersectionTypeConstructor intersectionTypeConstructorTriweekly = null;
        if (z) {
            oilcan oilcanVarImpromptu = impromptu();
            intersectionTypeConstructorTriweekly = new IntersectionTypeConstructor(arrayList).triweekly(oilcanVarImpromptu != null ? oilcanVarImpromptu.libyan(kotlinTypeRefiner) : null);
        }
        return intersectionTypeConstructorTriweekly == null ? this : intersectionTypeConstructorTriweekly;
    }

    public final oilcan impromptu() {
        return this.f31659attabal;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public boolean marial() {
        return false;
    }

    public final String taiyuan(final Function1<? super oilcan, ? extends Object> getProperTypeRelatedToStringify) {
        Intrinsics.checkNotNullParameter(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return CollectionsKt.preterite(CollectionsKt.setterwort(this.f31661saneness, new attabal(getProperTypeRelatedToStringify)), " & ", "{", "}", 0, null, new Function1<oilcan, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final CharSequence invoke(oilcan oilcanVar) {
                Function1<oilcan, Object> function1 = getProperTypeRelatedToStringify;
                Intrinsics.beachfront(oilcanVar);
                return function1.invoke(oilcanVar).toString();
            }
        }, 24, null);
    }

    public String toString() {
        return formularize(this, null, 1, null);
    }

    public final IntersectionTypeConstructor triweekly(oilcan oilcanVar) {
        return new IntersectionTypeConstructor(this.f31661saneness, oilcanVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront wireman() {
        return null;
    }

    public IntersectionTypeConstructor(Collection<? extends oilcan> collection2, oilcan oilcanVar) {
        this(collection2);
        this.f31659attabal = oilcanVar;
    }
}
