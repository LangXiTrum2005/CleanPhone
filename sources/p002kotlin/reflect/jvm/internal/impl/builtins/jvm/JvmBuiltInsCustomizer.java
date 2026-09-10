package p002kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kurbash.formularize;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.creditor;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cuirassed;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cutely;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.gintrap;
import p002kotlin.reflect.jvm.internal.impl.descriptors.monoploid;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.adultoid;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import p002kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import p002kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import p002kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import yeast.apical;
import yeast.beachfront;
import yeast.impromptu;

/* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JvmBuiltInsCustomizer implements discontentedness.attabal, discontentedness.dern {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f29831taiyuan = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(JvmBuiltInsCustomizer.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(JvmBuiltInsCustomizer.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(JvmBuiltInsCustomizer.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final trm f29832attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final yeast.attabal<byname.dern, wireman> f29833beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final impromptu f29834competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final impromptu f29835dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final beachfront<Pair<String, String>, marial> f29836impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final impromptu f29837marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final wireman f29838saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final oilcan f29839wireman;

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public enum JDKMemberStatus {
        HIDDEN,
        VISIBLE,
        DEPRECATED_LIST_METHODS,
        NOT_CONSIDERED,
        DROP;


        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final /* synthetic */ pussyfooter.attabal f29840arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());
    }

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f29842attabal;

        static {
            int[] iArr = new int[JDKMemberStatus.values().length];
            try {
                iArr[JDKMemberStatus.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JDKMemberStatus.DEPRECATED_LIST_METHODS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JDKMemberStatus.NOT_CONSIDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JDKMemberStatus.DROP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JDKMemberStatus.VISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f29842attabal = iArr;
        }
    }

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public static final class dern extends lyreflower.saneness.AbstractC0726saneness<wireman, JDKMemberStatus> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ String f29843attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<JDKMemberStatus> f29844saneness;

        public dern(String str, Ref$ObjectRef<JDKMemberStatus> ref$ObjectRef) {
            this.f29843attabal = str;
            this.f29844saneness = ref$ObjectRef;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
        /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
        /* JADX WARN: Type inference failed for: r0v7, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
        @Override // lyreflower.saneness.wireman
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public boolean saneness(wireman javaClassDescriptor) {
            Intrinsics.checkNotNullParameter(javaClassDescriptor, "javaClassDescriptor");
            String strAttabal = adultoid.attabal(SignatureBuildingComponents.f30687attabal, javaClassDescriptor, this.f29843attabal);
            taiyuan taiyuanVar = taiyuan.f29874attabal;
            if (taiyuanVar.beachfront().contains(strAttabal)) {
                this.f29844saneness.element = JDKMemberStatus.HIDDEN;
            } else if (taiyuanVar.taiyuan().contains(strAttabal)) {
                this.f29844saneness.element = JDKMemberStatus.VISIBLE;
            } else if (taiyuanVar.dern().contains(strAttabal)) {
                this.f29844saneness.element = JDKMemberStatus.DEPRECATED_LIST_METHODS;
            } else if (taiyuanVar.wireman().contains(strAttabal)) {
                this.f29844saneness.element = JDKMemberStatus.DROP;
            }
            return this.f29844saneness.element == null;
        }

        @Override // lyreflower.saneness.wireman
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public JDKMemberStatus result() {
            JDKMemberStatus jDKMemberStatus = this.f29844saneness.element;
            return jDKMemberStatus == null ? JDKMemberStatus.NOT_CONSIDERED : jDKMemberStatus;
        }
    }

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public static final class saneness extends gintrap {
        public saneness(trm trmVar, byname.dern dernVar) {
            super(trmVar, dernVar);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.sealless
        /* JADX INFO: renamed from: outmarry, reason: merged with bridge method [inline-methods] */
        public MemberScope.attabal formularize() {
            return MemberScope.attabal.f31367saneness;
        }
    }

    public JvmBuiltInsCustomizer(trm moduleDescriptor, final yeast.formularize storageManager, Function0<JvmBuiltIns.attabal> settingsComputation) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(settingsComputation, "settingsComputation");
        this.f29832attabal = moduleDescriptor;
        this.f29838saneness = wireman.f29882attabal;
        this.f29835dern = storageManager.dern(settingsComputation);
        this.f29839wireman = formularize(storageManager);
        this.f29837marial = storageManager.dern(new Function0<merc>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$cloneableType$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final merc invoke() {
                return FindClassInModuleKt.dern(this.this$0.adultoid().attabal(), JvmBuiltInClassDescriptorFactory.f29818wireman.attabal(), new NotFoundClasses(storageManager, this.this$0.adultoid().attabal())).impassible();
            }
        });
        this.f29833beachfront = storageManager.attabal();
        this.f29834competently = storageManager.dern(new Function0<marial>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$notConsideredDeprecation$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final marial invoke() {
                return marial.f29950impromptu.attabal(graveside.marial(AnnotationUtilKt.saneness(this.this$0.f29832attabal.apical(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
            }
        });
        this.f29836impromptu = storageManager.taiyuan(new Function1<Pair<? extends String, ? extends String>, marial>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$deprecationForSomeOfTheListMethods$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ marial invoke(Pair<? extends String, ? extends String> pair) {
                return invoke2((Pair<String, String>) pair);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final marial invoke2(Pair<String, String> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                String strComponent1 = pair.component1();
                String strComponent2 = pair.component2();
                return marial.f29950impromptu.attabal(graveside.marial(AnnotationUtilKt.saneness(this.this$0.f29832attabal.apical(), '\'' + strComponent1 + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + strComponent2 + "()' stdlib extension instead", strComponent2 + "()", null, true, 4, null)));
            }
        });
    }

    public static final Iterable gintrap(CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor.attabal().wireman();
    }

    public static final boolean kowloon(cutely cutelyVar, TypeSubstitutor typeSubstitutor, cutely cutelyVar2) {
        return OverridingUtil.rotuma(cutelyVar, cutelyVar2.dern(typeSubstitutor)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
    }

    public static final Iterable molybdenite(JvmBuiltInsCustomizer this$0, wireman wiremanVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Collection<oilcan> collectionCutely = wiremanVar.impromptu().cutely();
        Intrinsics.checkNotNullExpressionValue(collectionCutely, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionCutely.iterator();
        while (it.hasNext()) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = ((oilcan) it.next()).setterwort().wireman();
            wireman wiremanVarMonoploid = null;
            p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarAttabal = beachfrontVarWireman != null ? beachfrontVarWireman.attabal() : null;
            wireman wiremanVar2 = beachfrontVarAttabal instanceof wireman ? (wireman) beachfrontVarAttabal : null;
            if (wiremanVar2 != null && (wiremanVarMonoploid = this$0.monoploid(wiremanVar2)) == null) {
                wiremanVarMonoploid = wiremanVar2;
            }
            if (wiremanVarMonoploid != null) {
                arrayList.add(wiremanVarMonoploid);
            }
        }
        return arrayList;
    }

    public final JvmBuiltIns.attabal adultoid() {
        return (JvmBuiltIns.attabal) apical.attabal(this.f29835dern, this, f29831taiyuan[0]);
    }

    public final hydrovane apical(DeserializedClassDescriptor deserializedClassDescriptor, hydrovane hydrovaneVar) {
        dovishness.attabal<? extends hydrovane> attabalVarMonoploid = hydrovaneVar.monoploid();
        attabalVarMonoploid.monoploid(deserializedClassDescriptor);
        attabalVarMonoploid.impromptu(p002kotlin.reflect.jvm.internal.impl.descriptors.polloi.f30212marial);
        attabalVarMonoploid.formularize(deserializedClassDescriptor.impassible());
        attabalVarMonoploid.dern(deserializedClassDescriptor.technofreak());
        dovishness dovishnessVarBuild = attabalVarMonoploid.build();
        Intrinsics.beachfront(dovishnessVarBuild);
        return (hydrovane) dovishnessVarBuild;
    }

    @Override // discontentedness.attabal
    /* JADX INFO: renamed from: arytenoidectomy, reason: merged with bridge method [inline-methods] */
    public Set<byname.marial> wireman(wireman classDescriptor) {
        LazyJavaClassMemberScope lazyJavaClassMemberScopeWalach;
        Set<byname.marial> setAttabal;
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (!adultoid().saneness()) {
            return creditor.marial();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorMonoploid = monoploid(classDescriptor);
        return (lazyJavaClassDescriptorMonoploid == null || (lazyJavaClassMemberScopeWalach = lazyJavaClassDescriptorMonoploid.walach()) == null || (setAttabal = lazyJavaClassMemberScopeWalach.attabal()) == null) ? creditor.marial() : setAttabal;
    }

    @Override // discontentedness.dern
    public boolean attabal(wireman classDescriptor, hydrovane functionDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        LazyJavaClassDescriptor lazyJavaClassDescriptorMonoploid = monoploid(classDescriptor);
        if (lazyJavaClassDescriptorMonoploid == null || !functionDescriptor.getAnnotations().restrictive(discontentedness.wireman.attabal())) {
            return true;
        }
        if (!adultoid().saneness()) {
            return false;
        }
        String strDern = p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.dern(functionDescriptor, false, false, 3, null);
        LazyJavaClassMemberScope lazyJavaClassMemberScopeWalach = lazyJavaClassDescriptorMonoploid.walach();
        byname.marial name = functionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Collection<hydrovane> collectionSaneness = lazyJavaClassMemberScopeWalach.saneness(name, NoLookupLocation.FROM_BUILTINS);
        if ((collectionSaneness instanceof Collection) && collectionSaneness.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionSaneness.iterator();
        while (it.hasNext()) {
            if (Intrinsics.wireman(p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.dern((hydrovane) it.next(), false, false, 3, null), strDern)) {
                return true;
            }
        }
        return false;
    }

    @Override // discontentedness.attabal
    public Collection<oilcan> dern(wireman classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        byname.wireman wiremanVarImpassible = DescriptorUtilsKt.impassible(classDescriptor);
        taiyuan taiyuanVar = taiyuan.f29874attabal;
        if (!taiyuanVar.cutely(wiremanVarImpassible)) {
            return taiyuanVar.apical(wiremanVarImpassible) ? graveside.marial(this.f29839wireman) : p002kotlin.collections.adultoid.formularize();
        }
        merc mercVarTriweekly = triweekly();
        Intrinsics.checkNotNullExpressionValue(mercVarTriweekly, "<get-cloneableType>(...)");
        return p002kotlin.collections.adultoid.kowloon(mercVarTriweekly, this.f29839wireman);
    }

    public final boolean dovishness(hydrovane hydrovaneVar, boolean z) {
        p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVarSaneness = hydrovaneVar.saneness();
        Intrinsics.competently(apicalVarSaneness, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String strDern = p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.dern(hydrovaneVar, false, false, 3, null);
        if (z ^ taiyuan.f29874attabal.competently().contains(adultoid.attabal(SignatureBuildingComponents.f30687attabal, (wireman) apicalVarSaneness, strDern))) {
            return true;
        }
        Boolean boolMarial = lyreflower.saneness.marial(graveside.marial(hydrovaneVar), marial.f29871attabal, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$isMutabilityViolation$2
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0021  */
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
                boolean z2;
                if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.DECLARATION) {
                    wireman wiremanVar = this.this$0.f29838saneness;
                    p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVarSaneness2 = callableMemberDescriptor.saneness();
                    Intrinsics.competently(apicalVarSaneness2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (wiremanVar.dern((wireman) apicalVarSaneness2)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(boolMarial, "ifAny(...)");
        return boolMarial.booleanValue();
    }

    public final oilcan formularize(yeast.formularize formularizeVar) {
        competently competentlyVar = new competently(new saneness(this.f29832attabal, new byname.dern("java.io")), byname.marial.cutely("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, graveside.marial(new LazyWrappedType(formularizeVar, new Function0<oilcan>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$createMockJavaIoSerializableType$superTypes$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final oilcan invoke() {
                merc mercVarTaiyuan = this.this$0.f29832attabal.apical().taiyuan();
                Intrinsics.checkNotNullExpressionValue(mercVarTaiyuan, "getAnyType(...)");
                return mercVarTaiyuan;
            }
        })), walach.f30274attabal, false, formularizeVar);
        competentlyVar.dhss(MemberScope.attabal.f31367saneness, creditor.marial(), null);
        merc mercVarImpassible = competentlyVar.impassible();
        Intrinsics.checkNotNullExpressionValue(mercVarImpassible, "getDefaultType(...)");
        return mercVarImpassible;
    }

    public final marial graveside() {
        return (marial) apical.attabal(this.f29834competently, this, f29831taiyuan[2]);
    }

    public final Collection<hydrovane> impassible(wireman wiremanVar, Function1<? super MemberScope, ? extends Collection<? extends hydrovane>> function1) {
        final LazyJavaClassDescriptor lazyJavaClassDescriptorMonoploid = monoploid(wiremanVar);
        if (lazyJavaClassDescriptorMonoploid == null) {
            return p002kotlin.collections.adultoid.formularize();
        }
        Collection<wireman> collectionCompetently = this.f29838saneness.competently(DescriptorUtilsKt.formularize(lazyJavaClassDescriptorMonoploid), p002kotlin.reflect.jvm.internal.impl.builtins.jvm.saneness.f29872impromptu.attabal());
        final wireman wiremanVar2 = (wireman) CollectionsKt.gusty(collectionCompetently);
        if (wiremanVar2 == null) {
            return p002kotlin.collections.adultoid.formularize();
        }
        lyreflower.beachfront.saneness sanenessVar = lyreflower.beachfront.f33195monoploid;
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(collectionCompetently, 10));
        Iterator<T> it = collectionCompetently.iterator();
        while (it.hasNext()) {
            arrayList.add(DescriptorUtilsKt.formularize((wireman) it.next()));
        }
        lyreflower.beachfront beachfrontVarSaneness = sanenessVar.saneness(arrayList);
        boolean zDern = this.f29838saneness.dern(wiremanVar);
        MemberScope memberScopeWalach = this.f29833beachfront.attabal(DescriptorUtilsKt.formularize(lazyJavaClassDescriptorMonoploid), new Function0<wireman>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final wireman invoke() {
                LazyJavaClassDescriptor lazyJavaClassDescriptor = lazyJavaClassDescriptorMonoploid;
                p002kotlin.reflect.jvm.internal.impl.load.java.components.wireman EMPTY = p002kotlin.reflect.jvm.internal.impl.load.java.components.wireman.f30394attabal;
                Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
                return lazyJavaClassDescriptor.mastfed(EMPTY, wiremanVar2);
            }
        }).walach();
        Intrinsics.checkNotNullExpressionValue(memberScopeWalach, "getUnsubstitutedMemberScope(...)");
        Collection<? extends hydrovane> collectionInvoke = function1.invoke(memberScopeWalach);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionInvoke) {
            hydrovane hydrovaneVar = (hydrovane) obj;
            if (hydrovaneVar.getKind() == CallableMemberDescriptor.Kind.DECLARATION && hydrovaneVar.getVisibility().wireman() && !p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.sayid(hydrovaneVar)) {
                Collection<? extends dovishness> collectionWireman = hydrovaneVar.wireman();
                Intrinsics.checkNotNullExpressionValue(collectionWireman, "getOverriddenDescriptors(...)");
                Collection<? extends dovishness> collection2 = collectionWireman;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator<T> it2 = collection2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVarSaneness = ((dovishness) it2.next()).saneness();
                            Intrinsics.checkNotNullExpressionValue(apicalVarSaneness, "getContainingDeclaration(...)");
                            if (beachfrontVarSaneness.contains(DescriptorUtilsKt.formularize(apicalVarSaneness))) {
                            }
                        }
                    }
                }
                if (!dovishness(hydrovaneVar, zDern)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    @Override // discontentedness.attabal
    public Collection<hydrovane> marial(final byname.marial name, wireman classDescriptor) {
        marial marialVarInvoke;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (Intrinsics.wireman(name, p002kotlin.reflect.jvm.internal.impl.builtins.jvm.attabal.f29846marial.attabal()) && (classDescriptor instanceof DeserializedClassDescriptor) && p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.milliradian(classDescriptor)) {
            DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) classDescriptor;
            List<ProtoBuf$Function> functionList = deserializedClassDescriptor.licking().getFunctionList();
            Intrinsics.checkNotNullExpressionValue(functionList, "getFunctionList(...)");
            List<ProtoBuf$Function> list = functionList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.wireman(p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.graveside.saneness(deserializedClassDescriptor.osteal().competently(), ((ProtoBuf$Function) it.next()).getName()), p002kotlin.reflect.jvm.internal.impl.builtins.jvm.attabal.f29846marial.attabal())) {
                        return p002kotlin.collections.adultoid.formularize();
                    }
                }
            }
            return graveside.marial(apical(deserializedClassDescriptor, (hydrovane) CollectionsKt.hardpan(triweekly().formularize().saneness(name, NoLookupLocation.FROM_BUILTINS))));
        }
        if (!adultoid().saneness()) {
            return p002kotlin.collections.adultoid.formularize();
        }
        Collection<hydrovane> collectionImpassible = impassible(classDescriptor, new Function1<MemberScope, Collection<? extends hydrovane>>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getFunctions$2
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final Collection<hydrovane> invoke(MemberScope it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.saneness(name, NoLookupLocation.FROM_BUILTINS);
            }
        });
        ArrayList arrayList = new ArrayList();
        for (hydrovane hydrovaneVar : collectionImpassible) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVarSaneness = hydrovaneVar.saneness();
            Intrinsics.competently(apicalVarSaneness, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            dovishness dovishnessVarDern = hydrovaneVar.dern(cutely.attabal((wireman) apicalVarSaneness, classDescriptor).dern());
            Intrinsics.competently(dovishnessVarDern, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            dovishness.attabal<? extends hydrovane> attabalVarMonoploid = ((hydrovane) dovishnessVarDern).monoploid();
            attabalVarMonoploid.monoploid(classDescriptor);
            attabalVarMonoploid.dern(classDescriptor.technofreak());
            attabalVarMonoploid.apical();
            int i = attabal.f29842attabal[polloi(hydrovaneVar).ordinal()];
            hydrovane hydrovaneVar2 = null;
            if (i != 1) {
                if (i == 2) {
                    byname.marial name2 = hydrovaneVar.getName();
                    if (Intrinsics.wireman(name2, competently.f29848attabal)) {
                        marialVarInvoke = this.f29836impromptu.invoke(patroclinal.formularize.attabal(hydrovaneVar.getName().dern(), "first"));
                    } else {
                        if (!Intrinsics.wireman(name2, competently.f29849saneness)) {
                            throw new IllegalStateException(("Unexpected name: " + hydrovaneVar.getName()).toString());
                        }
                        marialVarInvoke = this.f29836impromptu.invoke(patroclinal.formularize.attabal(hydrovaneVar.getName().dern(), "last"));
                    }
                    attabalVarMonoploid.molybdenite(marialVarInvoke);
                } else if (i == 3) {
                    attabalVarMonoploid.molybdenite(graveside());
                } else if (i != 4) {
                }
                dovishness dovishnessVarBuild = attabalVarMonoploid.build();
                Intrinsics.beachfront(dovishnessVarBuild);
                hydrovaneVar2 = (hydrovane) dovishnessVarBuild;
            } else if (!cuirassed.attabal(classDescriptor)) {
                attabalVarMonoploid.wireman();
                dovishness dovishnessVarBuild2 = attabalVarMonoploid.build();
                Intrinsics.beachfront(dovishnessVarBuild2);
                hydrovaneVar2 = (hydrovane) dovishnessVarBuild2;
            }
            if (hydrovaneVar2 != null) {
                arrayList.add(hydrovaneVar2);
            }
        }
        return arrayList;
    }

    public final LazyJavaClassDescriptor monoploid(wireman wiremanVar) {
        byname.saneness sanenessVarTriweekly;
        byname.dern dernVarSaneness;
        if (p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.cultivated(wiremanVar) || !p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.claque(wiremanVar)) {
            return null;
        }
        byname.wireman wiremanVarImpassible = DescriptorUtilsKt.impassible(wiremanVar);
        if (wiremanVarImpassible.beachfront() && (sanenessVarTriweekly = p002kotlin.reflect.jvm.internal.impl.builtins.jvm.dern.f29852attabal.triweekly(wiremanVarImpassible)) != null && (dernVarSaneness = sanenessVarTriweekly.saneness()) != null) {
            wireman wiremanVarWireman = monoploid.wireman(adultoid().attabal(), dernVarSaneness, NoLookupLocation.FROM_BUILTINS);
            if (wiremanVarWireman instanceof LazyJavaClassDescriptor) {
                return (LazyJavaClassDescriptor) wiremanVarWireman;
            }
        }
        return null;
    }

    public final JDKMemberStatus polloi(dovishness dovishnessVar) {
        p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVarSaneness = dovishnessVar.saneness();
        Intrinsics.competently(apicalVarSaneness, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Object objSaneness = lyreflower.saneness.saneness(graveside.marial((wireman) apicalVarSaneness), new beachfront(this), new dern(p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.dern(dovishnessVar, false, false, 3, null), new Ref$ObjectRef()));
        Intrinsics.checkNotNullExpressionValue(objSaneness, "dfs(...)");
        return (JDKMemberStatus) objSaneness;
    }

    public final boolean rotuma(cutely cutelyVar, wireman wiremanVar) {
        if (cutelyVar.beachfront().size() != 1) {
            return false;
        }
        List<cultivated> listBeachfront = cutelyVar.beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = ((cultivated) CollectionsKt.herdbook(listBeachfront)).getType().setterwort().wireman();
        return Intrinsics.wireman(beachfrontVarWireman != null ? DescriptorUtilsKt.impassible(beachfrontVarWireman) : null, DescriptorUtilsKt.impassible(wiremanVar));
    }

    @Override // discontentedness.attabal
    public Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.dern> saneness(wireman classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (classDescriptor.getKind() != ClassKind.CLASS || !adultoid().saneness()) {
            return p002kotlin.collections.adultoid.formularize();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorMonoploid = monoploid(classDescriptor);
        if (lazyJavaClassDescriptorMonoploid == null) {
            return p002kotlin.collections.adultoid.formularize();
        }
        wireman wiremanVarBeachfront = wireman.beachfront(this.f29838saneness, DescriptorUtilsKt.formularize(lazyJavaClassDescriptorMonoploid), p002kotlin.reflect.jvm.internal.impl.builtins.jvm.saneness.f29872impromptu.attabal(), null, 4, null);
        if (wiremanVarBeachfront == null) {
            return p002kotlin.collections.adultoid.formularize();
        }
        TypeSubstitutor typeSubstitutorDern = cutely.attabal(wiremanVarBeachfront, lazyJavaClassDescriptorMonoploid).dern();
        List<p002kotlin.reflect.jvm.internal.impl.descriptors.dern> listTaiyuan = lazyJavaClassDescriptorMonoploid.taiyuan();
        ArrayList<p002kotlin.reflect.jvm.internal.impl.descriptors.dern> arrayList = new ArrayList();
        for (Object obj : listTaiyuan) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.dern dernVar = (p002kotlin.reflect.jvm.internal.impl.descriptors.dern) obj;
            if (dernVar.getVisibility().wireman()) {
                Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.dern> collectionTaiyuan = wiremanVarBeachfront.taiyuan();
                Intrinsics.checkNotNullExpressionValue(collectionTaiyuan, "getConstructors(...)");
                Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.dern> collection2 = collectionTaiyuan;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator<T> it = collection2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            p002kotlin.reflect.jvm.internal.impl.descriptors.dern dernVar2 = (p002kotlin.reflect.jvm.internal.impl.descriptors.dern) it.next();
                            Intrinsics.beachfront(dernVar2);
                            if (kowloon(dernVar2, typeSubstitutorDern, dernVar)) {
                            }
                        }
                    }
                }
                if (!rotuma(dernVar, classDescriptor) && !p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.sayid(dernVar) && !taiyuan.f29874attabal.marial().contains(adultoid.attabal(SignatureBuildingComponents.f30687attabal, lazyJavaClassDescriptorMonoploid, p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.dern(dernVar, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(p002kotlin.collections.dovishness.gintrap(arrayList, 10));
        for (p002kotlin.reflect.jvm.internal.impl.descriptors.dern dernVar3 : arrayList) {
            dovishness.attabal<? extends dovishness> attabalVarMonoploid = dernVar3.monoploid();
            attabalVarMonoploid.monoploid(classDescriptor);
            attabalVarMonoploid.formularize(classDescriptor.impassible());
            attabalVarMonoploid.apical();
            attabalVarMonoploid.beachfront(typeSubstitutorDern.cutely());
            if (!taiyuan.f29874attabal.impromptu().contains(adultoid.attabal(SignatureBuildingComponents.f30687attabal, lazyJavaClassDescriptorMonoploid, p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.dern(dernVar3, false, false, 3, null)))) {
                attabalVarMonoploid.molybdenite(graveside());
            }
            dovishness dovishnessVarBuild = attabalVarMonoploid.build();
            Intrinsics.competently(dovishnessVarBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((p002kotlin.reflect.jvm.internal.impl.descriptors.dern) dovishnessVarBuild);
        }
        return arrayList2;
    }

    public final merc triweekly() {
        return (merc) apical.attabal(this.f29837marial, this, f29831taiyuan[1]);
    }
}
