package p002kotlin.reflect.jvm.internal.impl.resolve.scopes;

import discontentedly.saneness;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lyreflower.marial;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: TypeIntersectionScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TypeIntersectionScope extends p002kotlin.reflect.jvm.internal.impl.resolve.scopes.attabal {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final attabal f31378wireman = new attabal(null);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final MemberScope f31379dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f31380saneness;

    /* JADX INFO: compiled from: TypeIntersectionScope.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MemberScope attabal(String message, Collection<? extends oilcan> types) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(types, "types");
            Collection<? extends oilcan> collection2 = types;
            ArrayList arrayList = new ArrayList(dovishness.gintrap(collection2, 10));
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((oilcan) it.next()).formularize());
            }
            marial<MemberScope> marialVarSaneness = civitan.attabal.saneness(arrayList);
            MemberScope memberScopeSaneness = saneness.f31385wireman.saneness(message, marialVarSaneness);
            return marialVarSaneness.size() <= 1 ? memberScopeSaneness : new TypeIntersectionScope(message, memberScopeSaneness, null);
        }

        public attabal() {
        }
    }

    public /* synthetic */ TypeIntersectionScope(String str, MemberScope memberScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, memberScope);
    }

    public static final MemberScope cutely(String str, Collection<? extends oilcan> collection2) {
        return f31378wireman.attabal(str, collection2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.attabal, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public Collection<apical> competently(wireman kindFilter, Function1<? super byname.marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Collection<apical> collectionCompetently = super.competently(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionCompetently) {
            if (((apical) obj) instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.attabal) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.component1();
        List list2 = (List) pair.component2();
        Intrinsics.competently(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return CollectionsKt.unconsolidated(OverridingUtilsKt.attabal(list, new Function1<p002kotlin.reflect.jvm.internal.impl.descriptors.attabal, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$getContributedDescriptors$2
            @Override // p002kotlin.jvm.functions.Function1
            public final attabal invoke(attabal selectMostSpecificInEachOverridableGroup) {
                Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            }
        }), list2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.attabal, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<saran> dern(byname.marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return OverridingUtilsKt.attabal(super.dern(name, location), new Function1<saran, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$getContributedVariables$1
            @Override // p002kotlin.jvm.functions.Function1
            public final attabal invoke(saran selectMostSpecificInEachOverridableGroup) {
                Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.attabal, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<hydrovane> saneness(byname.marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return OverridingUtilsKt.attabal(super.saneness(name, location), new Function1<hydrovane, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$getContributedFunctions$1
            @Override // p002kotlin.jvm.functions.Function1
            public final attabal invoke(hydrovane selectMostSpecificInEachOverridableGroup) {
                Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.attabal
    public MemberScope taiyuan() {
        return this.f31379dern;
    }

    public TypeIntersectionScope(String str, MemberScope memberScope) {
        this.f31380saneness = str;
        this.f31379dern = memberScope;
    }
}
