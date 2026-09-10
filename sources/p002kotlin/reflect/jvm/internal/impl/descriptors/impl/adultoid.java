package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModuleDescriptorImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class adultoid implements graveside {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<ModuleDescriptorImpl> f29998attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final List<ModuleDescriptorImpl> f29999dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Set<ModuleDescriptorImpl> f30000saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Set<ModuleDescriptorImpl> f30001wireman;

    public adultoid(List<ModuleDescriptorImpl> allDependencies, Set<ModuleDescriptorImpl> modulesWhoseInternalsAreVisible, List<ModuleDescriptorImpl> directExpectedByDependencies, Set<ModuleDescriptorImpl> allExpectedByDependencies) {
        Intrinsics.checkNotNullParameter(allDependencies, "allDependencies");
        Intrinsics.checkNotNullParameter(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        Intrinsics.checkNotNullParameter(directExpectedByDependencies, "directExpectedByDependencies");
        Intrinsics.checkNotNullParameter(allExpectedByDependencies, "allExpectedByDependencies");
        this.f29998attabal = allDependencies;
        this.f30000saneness = modulesWhoseInternalsAreVisible;
        this.f29999dern = directExpectedByDependencies;
        this.f30001wireman = allExpectedByDependencies;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.graveside
    public List<ModuleDescriptorImpl> attabal() {
        return this.f29998attabal;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.graveside
    public Set<ModuleDescriptorImpl> dern() {
        return this.f30000saneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.graveside
    public List<ModuleDescriptorImpl> saneness() {
        return this.f29999dern;
    }
}
