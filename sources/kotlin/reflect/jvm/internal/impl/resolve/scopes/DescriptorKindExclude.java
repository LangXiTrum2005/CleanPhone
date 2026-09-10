package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DescriptorKindExclude {

    public static final class NonExtensions extends DescriptorKindExclude {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NonExtensions f44328a = new NonExtensions();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f44329b;

        static {
            DescriptorKindFilter.Companion companion = DescriptorKindFilter.f44331c;
            companion.getClass();
            int i2 = DescriptorKindFilter.k;
            companion.getClass();
            int i3 = DescriptorKindFilter.f44334i;
            companion.getClass();
            f44329b = (~(DescriptorKindFilter.j | i3)) & i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public final int a() {
            return f44329b;
        }
    }

    public static final class TopLevelPackages extends DescriptorKindExclude {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TopLevelPackages f44330a = new TopLevelPackages();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public final int a() {
            return 0;
        }
    }

    public abstract int a();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
