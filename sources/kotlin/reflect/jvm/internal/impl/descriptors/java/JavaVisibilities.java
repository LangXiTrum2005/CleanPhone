package kotlin.reflect.jvm.internal.impl.descriptors.java;

import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaVisibilities {

    public static final class PackageVisibility extends Visibility {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final PackageVisibility f43665c = new PackageVisibility("package", false);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final Integer a(Visibility visibility) {
            Intrinsics.f(visibility, "visibility");
            if (this == visibility) {
                return 0;
            }
            MapBuilder mapBuilder = Visibilities.f43594a;
            return (visibility == Visibilities.Private.f43599c || visibility == Visibilities.PrivateToThis.f43600c) ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final String b() {
            return "public/*package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final Visibility c() {
            return Visibilities.Protected.f43601c;
        }
    }

    public static final class ProtectedAndPackage extends Visibility {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ProtectedAndPackage f43666c = new ProtectedAndPackage("protected_and_package", true);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final Integer a(Visibility visibility) {
            Intrinsics.f(visibility, "visibility");
            if (equals(visibility)) {
                return 0;
            }
            if (visibility == Visibilities.Internal.f43596c) {
                return null;
            }
            MapBuilder mapBuilder = Visibilities.f43594a;
            return visibility == Visibilities.Private.f43599c || visibility == Visibilities.PrivateToThis.f43600c ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final String b() {
            return "protected/*protected and package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final Visibility c() {
            return Visibilities.Protected.f43601c;
        }
    }

    public static final class ProtectedStaticVisibility extends Visibility {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ProtectedStaticVisibility f43667c = new ProtectedStaticVisibility("protected_static", true);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final String b() {
            return "protected/*protected static*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final Visibility c() {
            return Visibilities.Protected.f43601c;
        }
    }
}
