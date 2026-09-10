package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import byname.marial;
import henotic.saneness;
import iaido.dern;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import p002kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.load.java.components.wireman;
import p002kotlin.reflect.jvm.internal.impl.load.java.cutely;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.competently;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.impromptu;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.monoploid;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.taiyuan;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.triweekly;
import p002kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import yeast.formularize;

/* JADX INFO: compiled from: DeserializationComponentsForJava.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class beachfront {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final attabal f30695saneness = new attabal(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final impromptu f30696attabal;

    /* JADX INFO: compiled from: DeserializationComponentsForJava.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.beachfront$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DeserializationComponentsForJava.kt */
        public static final class C0684attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final beachfront f30697attabal;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public final DeserializedDescriptorResolver f30698saneness;

            public C0684attabal(beachfront deserializationComponentsForJava, DeserializedDescriptorResolver deserializedDescriptorResolver) {
                Intrinsics.checkNotNullParameter(deserializationComponentsForJava, "deserializationComponentsForJava");
                Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
                this.f30697attabal = deserializationComponentsForJava;
                this.f30698saneness = deserializedDescriptorResolver;
            }

            public final beachfront attabal() {
                return this.f30697attabal;
            }

            public final DeserializedDescriptorResolver saneness() {
                return this.f30698saneness;
            }
        }

        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0684attabal attabal(kowloon kotlinClassFinder, kowloon jvmBuiltInsKotlinClassFinder, cutely javaClassFinder, String moduleName, triweekly errorReporter, saneness javaSourceElementFactory) {
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
            Intrinsics.checkNotNullParameter(jvmBuiltInsKotlinClassFinder, "jvmBuiltInsKotlinClassFinder");
            Intrinsics.checkNotNullParameter(javaClassFinder, "javaClassFinder");
            Intrinsics.checkNotNullParameter(moduleName, "moduleName");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(javaSourceElementFactory, "javaSourceElementFactory");
            LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("DeserializationComponentsForJava.ModuleData");
            JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager, JvmBuiltIns.Kind.FROM_DEPENDENCIES);
            marial marialVarImpassible = marial.impassible('<' + moduleName + '>');
            Intrinsics.checkNotNullExpressionValue(marialVarImpassible, "special(...)");
            ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(marialVarImpassible, lockBasedStorageManager, jvmBuiltIns, null, null, null, 56, null);
            jvmBuiltIns.technofreak(moduleDescriptorImpl);
            jvmBuiltIns.mastfed(moduleDescriptorImpl, true);
            DeserializedDescriptorResolver deserializedDescriptorResolver = new DeserializedDescriptorResolver();
            p002kotlin.reflect.jvm.internal.impl.load.java.lazy.beachfront beachfrontVar = new p002kotlin.reflect.jvm.internal.impl.load.java.lazy.beachfront();
            NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager, moduleDescriptorImpl);
            LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProviderSaneness = competently.saneness(javaClassFinder, moduleDescriptorImpl, lockBasedStorageManager, notFoundClasses, kotlinClassFinder, deserializedDescriptorResolver, errorReporter, javaSourceElementFactory, beachfrontVar, (512 & 512) != 0 ? gintrap.attabal.f30755attabal : null);
            beachfront beachfrontVarAttabal = competently.attabal(moduleDescriptorImpl, lockBasedStorageManager, notFoundClasses, lazyJavaPackageFragmentProviderSaneness, kotlinClassFinder, deserializedDescriptorResolver, errorReporter, foreshot.marial.f26283taiyuan);
            deserializedDescriptorResolver.impassible(beachfrontVarAttabal);
            wireman EMPTY = wireman.f30394attabal;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            dern dernVar = new dern(lazyJavaPackageFragmentProviderSaneness, EMPTY);
            beachfrontVar.dern(dernVar);
            p002kotlin.reflect.jvm.internal.impl.builtins.jvm.impromptu impromptuVar = new p002kotlin.reflect.jvm.internal.impl.builtins.jvm.impromptu(lockBasedStorageManager, jvmBuiltInsKotlinClassFinder, moduleDescriptorImpl, notFoundClasses, jvmBuiltIns.setterwort(), jvmBuiltIns.setterwort(), taiyuan.attabal.f31623attabal, p002kotlin.reflect.jvm.internal.impl.types.checker.cutely.f31723saneness.attabal(), new swaddle.saneness(lockBasedStorageManager, adultoid.formularize()));
            moduleDescriptorImpl.prefect(moduleDescriptorImpl);
            moduleDescriptorImpl.deadwork(new p002kotlin.reflect.jvm.internal.impl.descriptors.impl.impromptu(adultoid.kowloon(dernVar.attabal(), impromptuVar), "CompositeProvider@RuntimeModuleData for " + moduleDescriptorImpl));
            return new C0684attabal(beachfrontVarAttabal, deserializedDescriptorResolver);
        }

        public attabal() {
        }
    }

    public beachfront(formularize storageManager, trm moduleDescriptor, taiyuan configuration, impromptu classDataFinder, dern annotationAndConstantLoader, LazyJavaPackageFragmentProvider packageFragmentProvider, NotFoundClasses notFoundClasses, triweekly errorReporter, discontentedly.dern lookupTracker, competently contractDeserializer, p002kotlin.reflect.jvm.internal.impl.types.checker.cutely kotlinTypeChecker, ladefoged.attabal typeAttributeTranslators) {
        discontentedness.dern dernVar;
        discontentedness.attabal attabalVar;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(classDataFinder, "classDataFinder");
        Intrinsics.checkNotNullParameter(annotationAndConstantLoader, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(contractDeserializer, "contractDeserializer");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(typeAttributeTranslators, "typeAttributeTranslators");
        p002kotlin.reflect.jvm.internal.impl.builtins.beachfront beachfrontVarApical = moduleDescriptor.apical();
        JvmBuiltIns jvmBuiltIns = beachfrontVarApical instanceof JvmBuiltIns ? (JvmBuiltIns) beachfrontVarApical : null;
        this.f30696attabal = new impromptu(storageManager, moduleDescriptor, configuration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, molybdenite.attabal.f31613attabal, errorReporter, lookupTracker, taiyuan.f30803attabal, adultoid.formularize(), notFoundClasses, contractDeserializer, (jvmBuiltIns == null || (attabalVar = jvmBuiltIns.setterwort()) == null) ? discontentedness.attabal.C0590attabal.f25323attabal : attabalVar, (jvmBuiltIns == null || (dernVar = jvmBuiltIns.setterwort()) == null) ? discontentedness.dern.saneness.f25325attabal : dernVar, foreshot.taiyuan.f26288attabal.attabal(), kotlinTypeChecker, new swaddle.saneness(storageManager, adultoid.formularize()), typeAttributeTranslators.attabal(), monoploid.f31614attabal);
    }

    public final impromptu attabal() {
        return this.f30696attabal;
    }
}
