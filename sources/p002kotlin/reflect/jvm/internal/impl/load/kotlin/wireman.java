package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import foreshot.marial;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import yeast.formularize;

/* JADX INFO: compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class wireman {
    public static final dern attabal(trm module, NotFoundClasses notFoundClasses, formularize storageManager, kowloon kotlinClassFinder, marial jvmMetadataVersion) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        dern dernVar = new dern(module, notFoundClasses, storageManager, kotlinClassFinder);
        dernVar.saran(jvmMetadataVersion);
        return dernVar;
    }
}
