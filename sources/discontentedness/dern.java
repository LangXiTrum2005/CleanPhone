package discontentedness;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;

/* JADX INFO: compiled from: PlatformDependentDeclarationFilter.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface dern {

    /* JADX INFO: compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class attabal implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f25324attabal = new attabal();

        @Override // discontentedness.dern
        public boolean attabal(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman classDescriptor, hydrovane functionDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return true;
        }
    }

    /* JADX INFO: compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class saneness implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final saneness f25325attabal = new saneness();

        @Override // discontentedness.dern
        public boolean attabal(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman classDescriptor, hydrovane functionDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return !functionDescriptor.getAnnotations().restrictive(wireman.attabal());
        }
    }

    boolean attabal(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar, hydrovane hydrovaneVar);
}
