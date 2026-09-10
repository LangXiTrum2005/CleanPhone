package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import byname.dern;
import byname.marial;
import byname.saneness;
import genesic.adultoid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.load.java.cutely;
import p002kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.arytenoidectomy;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.kowloon;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid;
import p002kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import yeast.competently;
import yeast.taiyuan;

/* JADX INFO: compiled from: LazyJavaPackageScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaPackageScope extends wireman {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final taiyuan<Set<String>> f30537arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final LazyJavaPackageFragment f30538kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final competently<attabal, wireman> f30539monoploid;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public final adultoid f30540triweekly;

    /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final genesic.competently f30541attabal;
        private final marial name;

        public attabal(marial name, genesic.competently competentlyVar) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.f30541attabal = competentlyVar;
        }

        public final genesic.competently attabal() {
            return this.f30541attabal;
        }

        public boolean equals(Object obj) {
            return (obj instanceof attabal) && Intrinsics.wireman(this.name, ((attabal) obj).name);
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public final marial saneness() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
    public static abstract class saneness {

        /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
        public static final class attabal extends saneness {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final wireman f30542attabal;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public attabal(wireman descriptor) {
                super(null);
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                this.f30542attabal = descriptor;
            }

            public final wireman attabal() {
                return this.f30542attabal;
            }
        }

        /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
        public static final class dern extends saneness {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final dern f30543attabal = new dern();

            public dern() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$saneness$saneness, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
        public static final class C0680saneness extends saneness {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final C0680saneness f30544attabal = new C0680saneness();

            public C0680saneness() {
                super(null);
            }
        }

        public /* synthetic */ saneness(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public saneness() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(final p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman c, adultoid jPackage, LazyJavaPackageFragment ownerDescriptor) {
        super(c);
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.f30540triweekly = jPackage;
        this.f30538kowloon = ownerDescriptor;
        this.f30537arytenoidectomy = c.marial().marial(new Function0<Set<? extends String>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$knownClassNamesInPackage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Set<? extends String> invoke() {
                return c.attabal().wireman().saneness(this.trm().marial());
            }
        });
        this.f30539monoploid = c.marial().competently(new Function1<attabal, wireman>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$classes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final wireman invoke(LazyJavaPackageScope.attabal request) {
                Intrinsics.checkNotNullParameter(request, "request");
                saneness sanenessVar = new saneness(this.this$0.trm().marial(), request.saneness());
                kowloon.attabal attabalVarSaneness = request.attabal() != null ? c.attabal().cutely().saneness(request.attabal(), this.this$0.hydrovane()) : c.attabal().cutely().dern(sanenessVar, this.this$0.hydrovane());
                monoploid monoploidVarAttabal = attabalVarSaneness != null ? attabalVarSaneness.attabal() : null;
                saneness sanenessVarCompetently = monoploidVarAttabal != null ? monoploidVarAttabal.competently() : null;
                if (sanenessVarCompetently != null && (sanenessVarCompetently.formularize() || sanenessVarCompetently.apical())) {
                    return null;
                }
                LazyJavaPackageScope.saneness sanenessVarPeridotite = this.this$0.peridotite(monoploidVarAttabal);
                if (sanenessVarPeridotite instanceof LazyJavaPackageScope.saneness.attabal) {
                    return ((LazyJavaPackageScope.saneness.attabal) sanenessVarPeridotite).attabal();
                }
                if (sanenessVarPeridotite instanceof LazyJavaPackageScope.saneness.dern) {
                    return null;
                }
                if (!(sanenessVarPeridotite instanceof LazyJavaPackageScope.saneness.C0680saneness)) {
                    throw new NoWhenBranchMatchedException();
                }
                genesic.competently competentlyVarAttabal = request.attabal();
                if (competentlyVarAttabal == null) {
                    competentlyVarAttabal = c.attabal().wireman().attabal(new cutely.attabal(sanenessVar, null, null, 4, null));
                }
                genesic.competently competentlyVar = competentlyVarAttabal;
                if ((competentlyVar != null ? competentlyVar.restrictive() : null) != LightClassOriginKind.BINARY) {
                    dern dernVarMarial = competentlyVar != null ? competentlyVar.marial() : null;
                    if (dernVarMarial == null || dernVarMarial.wireman() || !Intrinsics.wireman(dernVarMarial.marial(), this.this$0.trm().marial())) {
                        return null;
                    }
                    LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(c, this.this$0.trm(), competentlyVar, null, 8, null);
                    c.attabal().marial().attabal(lazyJavaClassDescriptor);
                    return lazyJavaClassDescriptor;
                }
                throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + competentlyVar + "\nClassId: " + sanenessVar + "\nfindKotlinClass(JavaClass) = " + arytenoidectomy.saneness(c.attabal().cutely(), competentlyVar, this.this$0.hydrovane()) + "\nfindKotlinClass(ClassId) = " + arytenoidectomy.attabal(c.attabal().cutely(), sanenessVar, this.this$0.hydrovane()) + '\n');
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.attabal arytenoidectomy() {
        return p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.attabal.C0681attabal.f30570attabal;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public Collection<apical> competently(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.attabal attabalVar = p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.f31395dern;
        if (!kindFilter.attabal(attabalVar.marial() | attabalVar.dern())) {
            return p002kotlin.collections.adultoid.formularize();
        }
        Collection<apical> collectionInvoke = dovishness().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionInvoke) {
            apical apicalVar = (apical) obj;
            if (apicalVar instanceof wireman) {
                marial name = ((wireman) apicalVar).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (nameFilter.invoke(name).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final wireman creditor(genesic.competently javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        return privatdozent(javaClass.getName(), javaClass);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<saran> dern(marial name, discontentedly.saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return p002kotlin.collections.adultoid.formularize();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<marial> formularize(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super marial, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        if (!kindFilter.attabal(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.f31395dern.marial())) {
            return creditor.marial();
        }
        Set<String> setInvoke = this.f30537arytenoidectomy.invoke();
        if (setInvoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = setInvoke.iterator();
            while (it.hasNext()) {
                hashSet.add(marial.cutely((String) it.next()));
            }
            return hashSet;
        }
        adultoid adultoidVar = this.f30540triweekly;
        if (function1 == null) {
            function1 = FunctionsKt.attabal();
        }
        Collection<genesic.competently> collectionOilcan = adultoidVar.oilcan(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (genesic.competently competentlyVar : collectionOilcan) {
            marial name = competentlyVar.restrictive() == LightClassOriginKind.SOURCE ? null : competentlyVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<marial> graveside(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super marial, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return creditor.marial();
    }

    public final foreshot.marial hydrovane() {
        return lyreflower.dern.attabal(gintrap().attabal().saneness().wireman().competently());
    }

    public final saneness peridotite(monoploid monoploidVar) {
        if (monoploidVar == null) {
            return saneness.C0680saneness.f30544attabal;
        }
        if (monoploidVar.saneness().dern() != KotlinClassHeader.Kind.CLASS) {
            return saneness.dern.f30543attabal;
        }
        wireman wiremanVarFormularize = gintrap().attabal().saneness().formularize(monoploidVar);
        return wiremanVarFormularize != null ? new saneness.attabal(wiremanVarFormularize) : saneness.C0680saneness.f30544attabal;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void polloi(Collection<hydrovane> result, marial name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public final wireman privatdozent(marial marialVar, genesic.competently competentlyVar) {
        if (!byname.competently.f15233attabal.attabal(marialVar)) {
            return null;
        }
        Set<String> setInvoke = this.f30537arytenoidectomy.invoke();
        if (competentlyVar != null || setInvoke == null || setInvoke.contains(marialVar.dern())) {
            return this.f30539monoploid.invoke(new attabal(marialVar, competentlyVar));
        }
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    /* JADX INFO: renamed from: starveling, reason: merged with bridge method [inline-methods] */
    public wireman marial(marial name, discontentedly.saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return privatdozent(name, null);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<marial> triweekly(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super marial, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return creditor.marial();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: walach, reason: merged with bridge method [inline-methods] */
    public LazyJavaPackageFragment trm() {
        return this.f30538kowloon;
    }
}
