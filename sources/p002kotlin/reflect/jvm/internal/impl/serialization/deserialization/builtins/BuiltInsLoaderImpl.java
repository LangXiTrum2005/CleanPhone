package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import discontentedness.attabal;
import discontentedness.dern;
import droppable.saneness;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p002kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import p002kotlin.reflect.jvm.internal.impl.descriptors.kattegat;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.apical;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.impromptu;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.kowloon;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.taiyuan;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.triweekly;
import yeast.formularize;

/* JADX INFO: compiled from: BuiltInsLoaderImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final saneness f31453saneness = new saneness();

    @Override // p002kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    public kattegat attabal(formularize storageManager, trm builtInsModule, Iterable<? extends discontentedness.saneness> classDescriptorFactories, dern platformDependentDeclarationFilter, attabal additionalClassPartsProvider, boolean z) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(builtInsModule, "builtInsModule");
        Intrinsics.checkNotNullParameter(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        return saneness(storageManager, builtInsModule, competently.f29685sealless, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z, new BuiltInsLoaderImpl$createPackageFragmentProvider$1(this.f31453saneness));
    }

    public final kattegat saneness(formularize formularizeVar, trm trmVar, Set<byname.dern> packageFqNames, Iterable<? extends discontentedness.saneness> classDescriptorFactories, dern platformDependentDeclarationFilter, attabal additionalClassPartsProvider, boolean z, Function1<? super String, ? extends InputStream> loadResource) {
        formularize storageManager = formularizeVar;
        trm module = trmVar;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(packageFqNames, "packageFqNames");
        Intrinsics.checkNotNullParameter(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(loadResource, "loadResource");
        Set<byname.dern> set = packageFqNames;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(set, 10));
        for (byname.dern dernVar : set) {
            String strPolloi = droppable.attabal.f25374polloi.polloi(dernVar);
            InputStream inputStreamInvoke = loadResource.invoke(strPolloi);
            if (inputStreamInvoke == null) {
                throw new IllegalStateException("Resource not found in classpath: " + strPolloi);
            }
            trm trmVar2 = module;
            storageManager = formularizeVar;
            module = trmVar2;
            arrayList.add(attabal.f31454stratoscope.attabal(dernVar, formularizeVar, trmVar2, inputStreamInvoke, z));
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl = new PackageFragmentProviderImpl(arrayList);
        NotFoundClasses notFoundClasses = new NotFoundClasses(storageManager, module);
        taiyuan.attabal attabalVar = taiyuan.attabal.f31623attabal;
        apical apicalVar = new apical(packageFragmentProviderImpl);
        droppable.attabal attabalVar2 = droppable.attabal.f25374polloi;
        p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.saneness sanenessVar = new p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.saneness(module, notFoundClasses, attabalVar2);
        molybdenite.attabal attabalVar3 = molybdenite.attabal.f31613attabal;
        triweekly DO_NOTHING = triweekly.f31624attabal;
        Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
        impromptu impromptuVar = new impromptu(storageManager, trmVar, attabalVar, apicalVar, sanenessVar, packageFragmentProviderImpl, attabalVar3, DO_NOTHING, discontentedly.dern.attabal.f25322attabal, kowloon.attabal.f31608attabal, classDescriptorFactories, notFoundClasses, p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.competently.f31456attabal.attabal(), additionalClassPartsProvider, platformDependentDeclarationFilter, attabalVar2.marial(), null, new swaddle.saneness(storageManager, adultoid.formularize()), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((attabal) it.next()).vesuvio(impromptuVar);
        }
        return packageFragmentProviderImpl;
    }
}
