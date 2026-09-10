package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import discontentedness.dern;
import discontentedness.saneness;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p002kotlin.reflect.jvm.internal.impl.descriptors.kattegat;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.protobuf.beachfront;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.types.checker.cutely;
import p002kotlin.reflect.jvm.internal.impl.types.impassible;
import p002kotlin.reflect.jvm.internal.impl.types.splinterproof;
import swaddle.attabal;
import yeast.formularize;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impromptu {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final ClassDeserializer f31587adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final Iterable<saneness> f31588apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final beachfront f31589arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final formularize f31590attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final kattegat f31591beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final molybdenite f31592competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final kowloon f31593cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final taiyuan f31594dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final NotFoundClasses f31595formularize;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final impassible f31596graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final competently f31597impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final triweekly f31598impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final dern f31599kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final attabal<p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern, competently<?>> f31600marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final List<splinterproof> f31601molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final cutely f31602monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final attabal f31603polloi;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final trm f31604saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final discontentedly.dern f31605taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public final discontentedness.attabal f31606triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final beachfront f31607wireman;

    /* JADX WARN: Multi-variable type inference failed */
    public impromptu(formularize storageManager, trm moduleDescriptor, taiyuan configuration, beachfront classDataFinder, attabal<? extends p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern, ? extends competently<?>> annotationAndConstantLoader, kattegat packageFragmentProvider, molybdenite localClassifierTypeSettings, triweekly errorReporter, discontentedly.dern lookupTracker, kowloon flexibleTypeDeserializer, Iterable<? extends saneness> fictitiousClassDescriptorFactories, NotFoundClasses notFoundClasses, competently contractDeserializer, discontentedness.attabal additionalClassPartsProvider, dern platformDependentDeclarationFilter, beachfront extensionRegistryLite, cutely kotlinTypeChecker, attabal samConversionResolver, List<? extends splinterproof> typeAttributeTranslators, impassible enumEntriesDeserializationSupport) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(classDataFinder, "classDataFinder");
        Intrinsics.checkNotNullParameter(annotationAndConstantLoader, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(localClassifierTypeSettings, "localClassifierTypeSettings");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        Intrinsics.checkNotNullParameter(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(contractDeserializer, "contractDeserializer");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(extensionRegistryLite, "extensionRegistryLite");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
        Intrinsics.checkNotNullParameter(typeAttributeTranslators, "typeAttributeTranslators");
        Intrinsics.checkNotNullParameter(enumEntriesDeserializationSupport, "enumEntriesDeserializationSupport");
        this.f31590attabal = storageManager;
        this.f31604saneness = moduleDescriptor;
        this.f31594dern = configuration;
        this.f31607wireman = classDataFinder;
        this.f31600marial = annotationAndConstantLoader;
        this.f31591beachfront = packageFragmentProvider;
        this.f31592competently = localClassifierTypeSettings;
        this.f31598impromptu = errorReporter;
        this.f31605taiyuan = lookupTracker;
        this.f31593cutely = flexibleTypeDeserializer;
        this.f31588apical = fictitiousClassDescriptorFactories;
        this.f31595formularize = notFoundClasses;
        this.f31597impassible = contractDeserializer;
        this.f31606triweekly = additionalClassPartsProvider;
        this.f31599kowloon = platformDependentDeclarationFilter;
        this.f31589arytenoidectomy = extensionRegistryLite;
        this.f31602monoploid = kotlinTypeChecker;
        this.f31603polloi = samConversionResolver;
        this.f31601molybdenite = typeAttributeTranslators;
        this.f31596graveside = enumEntriesDeserializationSupport;
        this.f31587adultoid = new ClassDeserializer(this);
    }

    public final formularize adultoid() {
        return this.f31590attabal;
    }

    public final beachfront apical() {
        return this.f31589arytenoidectomy;
    }

    public final discontentedly.dern arytenoidectomy() {
        return this.f31605taiyuan;
    }

    public final cutely attabal(sealless descriptor, genesis.dern nameResolver, genesis.competently typeTable, genesis.impromptu versionRequirementTable, genesis.attabal metadataVersion, wireman wiremanVar) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        return new cutely(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, wiremanVar, null, adultoid.formularize());
    }

    public final ClassDeserializer beachfront() {
        return this.f31587adultoid;
    }

    public final taiyuan competently() {
        return this.f31594dern;
    }

    public final triweekly cutely() {
        return this.f31598impromptu;
    }

    public final discontentedness.attabal dern() {
        return this.f31606triweekly;
    }

    public final List<splinterproof> dovishness() {
        return this.f31601molybdenite;
    }

    public final Iterable<saneness> formularize() {
        return this.f31588apical;
    }

    public final dern graveside() {
        return this.f31599kowloon;
    }

    public final kowloon impassible() {
        return this.f31593cutely;
    }

    public final competently impromptu() {
        return this.f31597impassible;
    }

    public final molybdenite kowloon() {
        return this.f31592competently;
    }

    public final beachfront marial() {
        return this.f31607wireman;
    }

    public final kattegat molybdenite() {
        return this.f31591beachfront;
    }

    public final trm monoploid() {
        return this.f31604saneness;
    }

    public final NotFoundClasses polloi() {
        return this.f31595formularize;
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman saneness(byname.saneness classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return ClassDeserializer.marial(this.f31587adultoid, classId, null, 2, null);
    }

    public final impassible taiyuan() {
        return this.f31596graveside;
    }

    public final cutely triweekly() {
        return this.f31602monoploid;
    }

    public final attabal<p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern, competently<?>> wireman() {
        return this.f31600marial;
    }

    public /* synthetic */ impromptu(formularize formularizeVar, trm trmVar, taiyuan taiyuanVar, beachfront beachfrontVar, attabal attabalVar, kattegat kattegatVar, molybdenite molybdeniteVar, triweekly triweeklyVar, discontentedly.dern dernVar, kowloon kowloonVar, Iterable iterable, NotFoundClasses notFoundClasses, competently competentlyVar, discontentedness.attabal attabalVar2, dern dernVar2, beachfront beachfrontVar2, cutely cutelyVar, attabal attabalVar3, List list, impassible impassibleVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(formularizeVar, trmVar, taiyuanVar, beachfrontVar, attabalVar, kattegatVar, molybdeniteVar, triweeklyVar, dernVar, kowloonVar, iterable, notFoundClasses, competentlyVar, (i & 8192) != 0 ? discontentedness.attabal.C0590attabal.f25323attabal : attabalVar2, (i & 16384) != 0 ? dern.attabal.f25324attabal : dernVar2, beachfrontVar2, (65536 & i) != 0 ? cutely.f31723saneness.attabal() : cutelyVar, attabalVar3, (262144 & i) != 0 ? graveside.marial(impassible.f31774attabal) : list, (i & Opcodes.ASM8) != 0 ? impassible.attabal.f31586attabal : impassibleVar);
    }
}
