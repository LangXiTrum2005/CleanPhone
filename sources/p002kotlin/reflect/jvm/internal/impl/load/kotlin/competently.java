package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import byname.saneness;
import discontentedly.dern;
import foreshot.marial;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import p002kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p002kotlin.reflect.jvm.internal.impl.descriptors.splinterproof;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import p002kotlin.reflect.jvm.internal.impl.load.java.apical;
import p002kotlin.reflect.jvm.internal.impl.load.java.components.wireman;
import p002kotlin.reflect.jvm.internal.impl.load.java.kowloon;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.taiyuan;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.triweekly;
import p002kotlin.reflect.jvm.internal.impl.types.checker.cutely;
import p002kotlin.reflect.jvm.internal.impl.types.impassible;
import yeast.formularize;

/* JADX INFO: compiled from: DeserializationComponentsForJava.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class competently {

    /* JADX INFO: compiled from: DeserializationComponentsForJava.kt */
    public static final class attabal implements kowloon {
        @Override // p002kotlin.reflect.jvm.internal.impl.load.java.kowloon
        public List<genesic.attabal> attabal(saneness classId) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            return null;
        }
    }

    public static final beachfront attabal(trm module, formularize storageManager, NotFoundClasses notFoundClasses, LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, kowloon reflectKotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, triweekly errorReporter, marial jvmMetadataVersion) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
        Intrinsics.checkNotNullParameter(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        return new beachfront(storageManager, module, taiyuan.attabal.f31623attabal, new impromptu(reflectKotlinClassFinder, deserializedDescriptorResolver), wireman.attabal(module, notFoundClasses, storageManager, reflectKotlinClassFinder, jvmMetadataVersion), lazyJavaPackageFragmentProvider, notFoundClasses, errorReporter, dern.attabal.f25322attabal, p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.competently.f31456attabal.attabal(), cutely.f31723saneness.attabal(), new ladefoged.attabal(graveside.marial(impassible.f31774attabal)));
    }

    public static final LazyJavaPackageFragmentProvider saneness(p002kotlin.reflect.jvm.internal.impl.load.java.cutely javaClassFinder, trm module, formularize storageManager, NotFoundClasses notFoundClasses, kowloon reflectKotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, triweekly errorReporter, henotic.saneness javaSourceElementFactory, p002kotlin.reflect.jvm.internal.impl.load.java.lazy.marial singleModuleClassResolver, gintrap packagePartProvider) {
        Intrinsics.checkNotNullParameter(javaClassFinder, "javaClassFinder");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(javaSourceElementFactory, "javaSourceElementFactory");
        Intrinsics.checkNotNullParameter(singleModuleClassResolver, "singleModuleClassResolver");
        Intrinsics.checkNotNullParameter(packagePartProvider, "packagePartProvider");
        p002kotlin.reflect.jvm.internal.impl.load.java.components.marial DO_NOTHING = p002kotlin.reflect.jvm.internal.impl.load.java.components.marial.f30382attabal;
        Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
        wireman EMPTY = wireman.f30394attabal;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        kotlin.reflect.jvm.internal.impl.load.java.components.dern.attabal attabalVar = kotlin.reflect.jvm.internal.impl.load.java.components.dern.attabal.f30381attabal;
        swaddle.saneness sanenessVar = new swaddle.saneness(storageManager, adultoid.formularize());
        splinterproof.attabal attabalVar2 = splinterproof.attabal.f30272attabal;
        dern.attabal attabalVar3 = dern.attabal.f25322attabal;
        ReflectionTypes reflectionTypes = new ReflectionTypes(module, notFoundClasses);
        JavaTypeEnhancementState.attabal attabalVar4 = JavaTypeEnhancementState.f30288wireman;
        p002kotlin.reflect.jvm.internal.impl.load.java.saneness sanenessVar2 = new p002kotlin.reflect.jvm.internal.impl.load.java.saneness(attabalVar4.attabal());
        kotlin.reflect.jvm.internal.impl.load.java.lazy.saneness.attabal attabalVar5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.saneness.attabal.f30574attabal;
        return new LazyJavaPackageFragmentProvider(new p002kotlin.reflect.jvm.internal.impl.load.java.lazy.attabal(storageManager, javaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, EMPTY, attabalVar, sanenessVar, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, attabalVar2, attabalVar3, module, reflectionTypes, sanenessVar2, new SignatureEnhancement(new p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.dern(attabalVar5)), apical.attabal.f30342attabal, attabalVar5, cutely.f31723saneness.attabal(), attabalVar4.attabal(), new attabal(), null, 8388608, null));
    }
}
