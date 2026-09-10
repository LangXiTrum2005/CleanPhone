package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import byname.dern;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.merc;
import p002kotlin.reflect.jvm.internal.impl.descriptors.stratoscope;
import yeast.formularize;

/* JADX INFO: compiled from: PackageViewDescriptorFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface rotuma {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f30160attabal = attabal.f30161attabal;

    /* JADX INFO: compiled from: PackageViewDescriptorFactory.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ attabal f30161attabal = new attabal();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final stratoscope<rotuma> f30162saneness = new stratoscope<>("PackageViewDescriptorFactory");

        public final stratoscope<rotuma> attabal() {
            return f30162saneness;
        }
    }

    /* JADX INFO: compiled from: PackageViewDescriptorFactory.kt */
    public static final class saneness implements rotuma {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final saneness f30163saneness = new saneness();

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.rotuma
        public merc attabal(ModuleDescriptorImpl module, dern fqName, formularize storageManager) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            return new LazyPackageViewDescriptorImpl(module, fqName, storageManager);
        }
    }

    merc attabal(ModuleDescriptorImpl moduleDescriptorImpl, dern dernVar, formularize formularizeVar);
}
