package iaido;

import genesic.competently;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import p002kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: JavaDescriptorResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final LazyJavaPackageFragmentProvider f28344attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final p002kotlin.reflect.jvm.internal.impl.load.java.components.wireman f28345saneness;

    public dern(LazyJavaPackageFragmentProvider packageFragmentProvider, p002kotlin.reflect.jvm.internal.impl.load.java.components.wireman javaResolverCache) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        this.f28344attabal = packageFragmentProvider;
        this.f28345saneness = javaResolverCache;
    }

    public final LazyJavaPackageFragmentProvider attabal() {
        return this.f28344attabal;
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman saneness(competently javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        byname.dern dernVarMarial = javaClass.marial();
        if (dernVarMarial != null && javaClass.restrictive() == LightClassOriginKind.SOURCE) {
            return this.f28345saneness.dern(dernVarMarial);
        }
        competently competentlyVarFormularize = javaClass.formularize();
        if (competentlyVarFormularize != null) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarSaneness = saneness(competentlyVarFormularize);
            MemberScope memberScopePrivatdozent = wiremanVarSaneness != null ? wiremanVarSaneness.privatdozent() : null;
            beachfront beachfrontVarMarial = memberScopePrivatdozent != null ? memberScopePrivatdozent.marial(javaClass.getName(), NoLookupLocation.FROM_JAVA_LOADER) : null;
            if (beachfrontVarMarial instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) {
                return (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) beachfrontVarMarial;
            }
            return null;
        }
        if (dernVarMarial == null) {
            return null;
        }
        LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = this.f28344attabal;
        byname.dern dernVarMarial2 = dernVarMarial.marial();
        Intrinsics.checkNotNullExpressionValue(dernVarMarial2, "parent(...)");
        LazyJavaPackageFragment lazyJavaPackageFragment = (LazyJavaPackageFragment) CollectionsKt.firstOrNull(lazyJavaPackageFragmentProvider.dern(dernVarMarial2));
        if (lazyJavaPackageFragment != null) {
            return lazyJavaPackageFragment.setterwort(javaClass);
        }
        return null;
    }
}
