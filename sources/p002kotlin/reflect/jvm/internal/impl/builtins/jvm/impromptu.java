package p002kotlin.reflect.jvm.internal.impl.builtins.jvm;

import discontentedness.dern;
import java.io.InputStream;
import org.objectweb.asm.Opcodes;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.kowloon;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.apical;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.competently;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.monoploid;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.saneness;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.taiyuan;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.triweekly;
import p002kotlin.reflect.jvm.internal.impl.types.checker.cutely;
import yeast.formularize;

/* JADX INFO: compiled from: JvmBuiltInsPackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impromptu extends AbstractDeserializedPackageFragmentProvider {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final attabal f29870beachfront = new attabal(null);

    /* JADX INFO: compiled from: JvmBuiltInsPackageFragmentProvider.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public attabal() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public impromptu(formularize storageManager, kowloon finder, trm moduleDescriptor, NotFoundClasses notFoundClasses, discontentedness.attabal additionalClassPartsProvider, dern platformDependentDeclarationFilter, taiyuan deserializationConfiguration, cutely kotlinTypeChecker, swaddle.attabal samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(deserializationConfiguration, "deserializationConfiguration");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
        apical apicalVar = new apical(this);
        droppable.attabal attabalVar = droppable.attabal.f25374polloi;
        saneness sanenessVar = new saneness(moduleDescriptor, notFoundClasses, attabalVar);
        molybdenite.attabal attabalVar2 = molybdenite.attabal.f31613attabal;
        triweekly DO_NOTHING = triweekly.f31624attabal;
        Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
        taiyuan(new p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.impromptu(storageManager, moduleDescriptor, deserializationConfiguration, apicalVar, sanenessVar, this, attabalVar2, DO_NOTHING, discontentedly.dern.attabal.f25322attabal, kotlin.reflect.jvm.internal.impl.serialization.deserialization.kowloon.attabal.f31608attabal, adultoid.kowloon(new p002kotlin.reflect.jvm.internal.impl.builtins.functions.attabal(storageManager, moduleDescriptor), new JvmBuiltInClassDescriptorFactory(storageManager, moduleDescriptor, null, 4, null)), notFoundClasses, competently.f31456attabal.attabal(), additionalClassPartsProvider, platformDependentDeclarationFilter, attabalVar.marial(), kotlinTypeChecker, samConversionResolver, null, monoploid.f31614attabal, Opcodes.ASM4, null));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider
    public p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.formularize wireman(byname.dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        InputStream inputStreamAttabal = beachfront().attabal(fqName);
        if (inputStreamAttabal != null) {
            return p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.attabal.f31454stratoscope.attabal(fqName, impromptu(), competently(), inputStreamAttabal, false);
        }
        return null;
    }
}
