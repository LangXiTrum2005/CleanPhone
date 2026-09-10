package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import byname.saneness;
import genesic.attabal;
import genesic.competently;
import genesic.cutely;
import genesic.preprohormone;
import genesic.rotuma;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import methylmercury.dern;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.creditor;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.graveside;
import p002kotlin.collections.kattegat;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import p002kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dent;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.splinterproof;
import p002kotlin.reflect.jvm.internal.impl.descriptors.treadless;
import p002kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p002kotlin.reflect.jvm.internal.impl.load.java.impassible;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.triweekly;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import patroclinal.taiyuan;
import yeast.impromptu;

/* JADX INFO: compiled from: LazyJavaClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaClassDescriptor extends beachfront implements dern {

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public final taiyuan f30501cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public final ClassKind f30502cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final wireman f30503dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final competently f30504gintrap;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public final ScopesHolderForClass<LazyJavaClassMemberScope> f30505kattegat;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public final marial f30506merc;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public final boolean f30507oilcan;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public final impromptu<List<clubfoot>> f30508polder;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final wireman f30509preprohormone;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public final LazyJavaStaticClassScope f30510restrictive;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman f30511rotuma;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public final LazyJavaClassMemberScope f30512sealless;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public final Modality f30513stratoscope;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public final p002kotlin.reflect.jvm.internal.impl.resolve.scopes.marial f30514supplicat;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public final treadless f30515trm;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public final LazyJavaClassTypeConstructor f30516yemenite;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public static final attabal f30500seminary = new attabal(null);

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public static final Set<String> f30499grimness = creditor.impromptu("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");

    /* JADX INFO: compiled from: LazyJavaClassDescriptor.kt */
    public final class LazyJavaClassTypeConstructor extends p002kotlin.reflect.jvm.internal.impl.types.saneness {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final impromptu<List<clubfoot>> f30518wireman;

        public LazyJavaClassTypeConstructor() {
            super(LazyJavaClassDescriptor.this.f30509preprohormone.marial());
            this.f30518wireman = LazyJavaClassDescriptor.this.f30509preprohormone.marial().dern(new Function0<List<? extends clubfoot>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$parameters$1
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends clubfoot> invoke() {
                    return TypeParameterUtilsKt.wireman(lazyJavaClassDescriptor);
                }
            });
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public List<clubfoot> getParameters() {
            return this.f30518wireman.invoke();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.apical, p002kotlin.reflect.jvm.internal.impl.types.permissivist
        /* JADX INFO: renamed from: gintrap, reason: merged with bridge method [inline-methods] */
        public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wireman() {
            return LazyJavaClassDescriptor.this;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public Collection<oilcan> impassible() {
            Collection<cutely> collectionCutely = LazyJavaClassDescriptor.this.homozygous().cutely();
            ArrayList arrayList = new ArrayList(collectionCutely.size());
            ArrayList<rotuma> arrayList2 = new ArrayList(0);
            oilcan oilcanVarRotuma = rotuma();
            Iterator<cutely> it = collectionCutely.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cutely next = it.next();
                oilcan oilcanVarImpromptu = LazyJavaClassDescriptor.this.f30509preprohormone.attabal().polloi().impromptu(LazyJavaClassDescriptor.this.f30509preprohormone.competently().kowloon(next, p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.saneness.saneness(TypeUsage.SUPERTYPE, false, false, null, 7, null)), LazyJavaClassDescriptor.this.f30509preprohormone);
                if (oilcanVarImpromptu.setterwort().wireman() instanceof NotFoundClasses.saneness) {
                    arrayList2.add(next);
                }
                if (!Intrinsics.wireman(oilcanVarImpromptu.setterwort(), oilcanVarRotuma != null ? oilcanVarRotuma.setterwort() : null) && !p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.premeiotic(oilcanVarImpromptu)) {
                    arrayList.add(oilcanVarImpromptu);
                }
            }
            p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar = LazyJavaClassDescriptor.this.f30511rotuma;
            lyreflower.attabal.attabal(arrayList, wiremanVar != null ? p002kotlin.reflect.jvm.internal.impl.builtins.jvm.cutely.attabal(wiremanVar, LazyJavaClassDescriptor.this).dern().arytenoidectomy(wiremanVar.impassible(), Variance.INVARIANT) : null);
            lyreflower.attabal.attabal(arrayList, oilcanVarRotuma);
            if (!arrayList2.isEmpty()) {
                triweekly triweeklyVarDern = LazyJavaClassDescriptor.this.f30509preprohormone.attabal().dern();
                p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarWireman = wireman();
                ArrayList arrayList3 = new ArrayList(dovishness.gintrap(arrayList2, 10));
                for (rotuma rotumaVar : arrayList2) {
                    Intrinsics.competently(rotumaVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((cutely) rotumaVar).trm());
                }
                triweeklyVarDern.saneness(wiremanVarWireman, arrayList3);
            }
            return !arrayList.isEmpty() ? CollectionsKt.molet(arrayList) : graveside.marial(LazyJavaClassDescriptor.this.f30509preprohormone.wireman().apical().taiyuan());
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public boolean marial() {
            return true;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public splinterproof monoploid() {
            return LazyJavaClassDescriptor.this.f30509preprohormone.attabal().dovishness();
        }

        public final byname.dern preprohormone() {
            String strSaneness;
            marial annotations = LazyJavaClassDescriptor.this.getAnnotations();
            byname.dern PURELY_IMPLEMENTS_ANNOTATION = p002kotlin.reflect.jvm.internal.impl.load.java.graveside.f30433polloi;
            Intrinsics.checkNotNullExpressionValue(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern dernVarAttabal = annotations.attabal(PURELY_IMPLEMENTS_ANNOTATION);
            if (dernVarAttabal == null) {
                return null;
            }
            Object objTechnofreak = CollectionsKt.technofreak(dernVarAttabal.attabal().values());
            p002kotlin.reflect.jvm.internal.impl.resolve.constants.graveside gravesideVar = objTechnofreak instanceof p002kotlin.reflect.jvm.internal.impl.resolve.constants.graveside ? (p002kotlin.reflect.jvm.internal.impl.resolve.constants.graveside) objTechnofreak : null;
            if (gravesideVar == null || (strSaneness = gravesideVar.saneness()) == null || !p002kotlin.reflect.jvm.internal.impl.name.attabal.marial(strSaneness)) {
                return null;
            }
            return new byname.dern(strSaneness);
        }

        public final oilcan rotuma() {
            byname.dern dernVarSaneness;
            ArrayList arrayList;
            byname.dern dernVarPreprohormone = preprohormone();
            if (dernVarPreprohormone == null || dernVarPreprohormone.wireman() || !dernVarPreprohormone.taiyuan(p002kotlin.reflect.jvm.internal.impl.builtins.competently.f29683rotuma)) {
                dernVarPreprohormone = null;
            }
            if (dernVarPreprohormone == null) {
                dernVarSaneness = p002kotlin.reflect.jvm.internal.impl.load.java.competently.f30359attabal.saneness(DescriptorUtilsKt.formularize(LazyJavaClassDescriptor.this));
                if (dernVarSaneness == null) {
                    return null;
                }
            } else {
                dernVarSaneness = dernVarPreprohormone;
            }
            p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarGintrap = DescriptorUtilsKt.gintrap(LazyJavaClassDescriptor.this.f30509preprohormone.wireman(), dernVarSaneness, NoLookupLocation.FROM_JAVA_LOADER);
            if (wiremanVarGintrap == null) {
                return null;
            }
            int size = wiremanVarGintrap.impromptu().getParameters().size();
            List<clubfoot> parameters = LazyJavaClassDescriptor.this.impromptu().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            int size2 = parameters.size();
            if (size2 == size) {
                List<clubfoot> list = parameters;
                arrayList = new ArrayList(dovishness.gintrap(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new p002kotlin.reflect.jvm.internal.impl.types.treadless(Variance.INVARIANT, ((clubfoot) it.next()).impassible()));
                }
            } else {
                if (size2 != 1 || size <= 1 || dernVarPreprohormone != null) {
                    return null;
                }
                p002kotlin.reflect.jvm.internal.impl.types.treadless treadlessVar = new p002kotlin.reflect.jvm.internal.impl.types.treadless(Variance.INVARIANT, ((clubfoot) CollectionsKt.herdbook(parameters)).impassible());
                IntRange intRange = new IntRange(1, size);
                ArrayList arrayList2 = new ArrayList(dovishness.gintrap(intRange, 10));
                Iterator<Integer> it2 = intRange.iterator();
                while (it2.hasNext()) {
                    ((kattegat) it2).nextInt();
                    arrayList2.add(treadlessVar);
                }
                arrayList = arrayList2;
            }
            return KotlinTypeFactory.competently(overspeculate.f31797arytenoidectomy.taiyuan(), wiremanVarGintrap, arrayList);
        }

        public String toString() {
            String strDern = LazyJavaClassDescriptor.this.getName().dern();
            Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
            return strDern;
        }
    }

    /* JADX INFO: compiled from: LazyJavaClassDescriptor.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public attabal() {
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class saneness<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return frenchy.saneness.wireman(DescriptorUtilsKt.formularize((p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) t).saneness(), DescriptorUtilsKt.formularize((p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) t2).saneness());
        }
    }

    public /* synthetic */ LazyJavaClassDescriptor(wireman wiremanVar, apical apicalVar, competently competentlyVar, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wiremanVar, apicalVar, competentlyVar, (i & 8) != 0 ? null : wiremanVar2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.wireman> adultoid() {
        if (this.f30513stratoscope != Modality.SEALED) {
            return adultoid.formularize();
        }
        p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.attabal attabalVarSaneness = p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.saneness.saneness(TypeUsage.COMMON, false, false, null, 7, null);
        Collection<cutely> collectionCuirassed = this.f30504gintrap.cuirassed();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionCuirassed.iterator();
        while (it.hasNext()) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = this.f30509preprohormone.competently().kowloon((cutely) it.next(), attabalVarSaneness).setterwort().wireman();
            p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar = beachfrontVarWireman instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman ? (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) beachfrontVarWireman : null;
            if (wiremanVar != null) {
                arrayList.add(wiremanVar);
            }
        }
        return CollectionsKt.setterwort(arrayList, new saneness());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    /* JADX INFO: renamed from: attendance, reason: merged with bridge method [inline-methods] */
    public List<p002kotlin.reflect.jvm.internal.impl.descriptors.dern> taiyuan() {
        return this.f30512sealless.monroe().invoke();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean coffeecake() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public p002kotlin.reflect.jvm.internal.impl.descriptors.dern cord() {
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public dent<merc> creditor() {
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.attabal, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    /* JADX INFO: renamed from: deadwork, reason: merged with bridge method [inline-methods] */
    public LazyJavaClassMemberScope walach() {
        MemberScope memberScopeWalach = super.walach();
        Intrinsics.competently(memberScopeWalach, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (LazyJavaClassMemberScope) memberScopeWalach;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal
    public marial getAnnotations() {
        return this.f30506merc;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public ClassKind getKind() {
        return this.f30502cuirassed;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public molybdenite getVisibility() {
        if (!Intrinsics.wireman(this.f30515trm, polloi.f30203attabal) || this.f30504gintrap.formularize() != null) {
            return p002kotlin.reflect.jvm.internal.impl.load.java.rotuma.wireman(this.f30515trm);
        }
        molybdenite molybdeniteVar = impassible.f30438attabal;
        Intrinsics.beachfront(molybdeniteVar);
        return molybdeniteVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.competently
    public boolean gintrap() {
        return this.f30507oilcan;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean herdbook() {
        return false;
    }

    public final competently homozygous() {
        return this.f30504gintrap;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront
    public permissivist impromptu() {
        return this.f30516yemenite;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean isInline() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public Modality kowloon() {
        return this.f30513stratoscope;
    }

    public final List<genesic.attabal> lampshade() {
        return (List) this.f30501cord.getValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public MemberScope lerp() {
        return this.f30510restrictive;
    }

    public final wireman libyan() {
        return this.f30503dovishness;
    }

    public final LazyJavaClassDescriptor mastfed(p002kotlin.reflect.jvm.internal.impl.load.java.components.wireman javaResolverCache, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        wireman wiremanVar2 = this.f30509preprohormone;
        wireman wiremanVarTaiyuan = ContextKt.taiyuan(wiremanVar2, wiremanVar2.attabal().rotuma(javaResolverCache));
        apical apicalVarSaneness = saneness();
        Intrinsics.checkNotNullExpressionValue(apicalVarSaneness, "getContainingDeclaration(...)");
        return new LazyJavaClassDescriptor(wiremanVarTaiyuan, apicalVarSaneness, this.f30504gintrap, wiremanVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.polloi
    /* JADX INFO: renamed from: molet, reason: merged with bridge method [inline-methods] */
    public LazyJavaClassMemberScope itchy(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (LazyJavaClassMemberScope) this.f30505kattegat.dern(kotlinTypeRefiner);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman nosophobia() {
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean overspeculate() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean peridotite() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean permissivist() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.attabal, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public MemberScope privatdozent() {
        return this.f30514supplicat;
    }

    public String toString() {
        return "Lazy Java class " + DescriptorUtilsKt.impassible(this);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean treadless() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.competently
    public List<clubfoot> triweekly() {
        return this.f30508polder.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor(wireman outerContext, apical containingDeclaration, competently jClass, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
        ClassKind classKind;
        Modality modalityAttabal;
        super(outerContext.marial(), containingDeclaration, jClass.getName(), outerContext.attabal().graveside().attabal(jClass), false);
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f30503dovishness = outerContext;
        this.f30504gintrap = jClass;
        this.f30511rotuma = wiremanVar;
        wireman wiremanVarWireman = ContextKt.wireman(outerContext, this, jClass, 0, 4, null);
        this.f30509preprohormone = wiremanVarWireman;
        wiremanVarWireman.attabal().impromptu().marial(jClass, this);
        jClass.restrictive();
        this.f30501cord = p002kotlin.saneness.saneness(new Function0<List<? extends genesic.attabal>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$moduleAnnotations$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends attabal> invoke() {
                saneness sanenessVarApical = DescriptorUtilsKt.apical(this.this$0);
                if (sanenessVarApical != null) {
                    return this.this$0.libyan().attabal().beachfront().attabal(sanenessVarApical);
                }
                return null;
            }
        });
        if (jClass.kowloon()) {
            classKind = ClassKind.ANNOTATION_CLASS;
        } else if (jClass.supplicat()) {
            classKind = ClassKind.INTERFACE;
        } else {
            classKind = jClass.dovishness() ? ClassKind.ENUM_CLASS : ClassKind.CLASS;
        }
        this.f30502cuirassed = classKind;
        if (jClass.kowloon() || jClass.dovishness()) {
            modalityAttabal = Modality.FINAL;
        } else {
            modalityAttabal = Modality.Companion.attabal(jClass.rotuma(), jClass.rotuma() || jClass.isAbstract() || jClass.supplicat(), !jClass.isFinal());
        }
        this.f30513stratoscope = modalityAttabal;
        this.f30515trm = jClass.getVisibility();
        this.f30507oilcan = (jClass.formularize() == null || jClass.apical()) ? false : true;
        this.f30516yemenite = new LazyJavaClassTypeConstructor();
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(wiremanVarWireman, this, jClass, wiremanVar != null, null, 16, null);
        this.f30512sealless = lazyJavaClassMemberScope;
        this.f30505kattegat = ScopesHolderForClass.f29908marial.attabal(this, wiremanVarWireman.marial(), wiremanVarWireman.attabal().apical().dern(), new Function1<p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront, LazyJavaClassMemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$scopeHolder$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final LazyJavaClassMemberScope invoke(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront it) {
                Intrinsics.checkNotNullParameter(it, "it");
                wireman wiremanVar2 = this.this$0.f30509preprohormone;
                LazyJavaClassDescriptor lazyJavaClassDescriptor = this.this$0;
                return new LazyJavaClassMemberScope(wiremanVar2, lazyJavaClassDescriptor, lazyJavaClassDescriptor.homozygous(), this.this$0.f30511rotuma != null, this.this$0.f30512sealless);
            }
        });
        this.f30514supplicat = new p002kotlin.reflect.jvm.internal.impl.resolve.scopes.marial(lazyJavaClassMemberScope);
        this.f30510restrictive = new LazyJavaStaticClassScope(wiremanVarWireman, jClass, this);
        this.f30506merc = p002kotlin.reflect.jvm.internal.impl.load.java.lazy.dern.attabal(wiremanVarWireman, jClass);
        this.f30508polder = wiremanVarWireman.marial().dern(new Function0<List<? extends clubfoot>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$declaredParameters$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends clubfoot> invoke() {
                List<preprohormone> typeParameters = this.this$0.homozygous().getTypeParameters();
                LazyJavaClassDescriptor lazyJavaClassDescriptor = this.this$0;
                ArrayList arrayList = new ArrayList(dovishness.gintrap(typeParameters, 10));
                for (preprohormone preprohormoneVar : typeParameters) {
                    clubfoot clubfootVarAttabal = lazyJavaClassDescriptor.f30509preprohormone.beachfront().attabal(preprohormoneVar);
                    if (clubfootVarAttabal == null) {
                        throw new AssertionError("Parameter " + preprohormoneVar + " surely belongs to class " + lazyJavaClassDescriptor.homozygous() + ", so it must be resolved");
                    }
                    arrayList.add(clubfootVarAttabal);
                }
                return arrayList;
            }
        });
    }
}
