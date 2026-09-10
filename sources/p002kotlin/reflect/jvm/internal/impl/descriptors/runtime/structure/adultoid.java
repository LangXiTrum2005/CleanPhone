package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import byname.dern;
import byname.marial;
import genesic.attabal;
import genesic.competently;
import java.util.Collection;
import java.util.List;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaPackage.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class adultoid extends triweekly implements genesic.adultoid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dern f30224attabal;

    public adultoid(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f30224attabal = fqName;
    }

    @Override // genesic.adultoid
    public Collection<genesic.adultoid> adultoid() {
        return p002kotlin.collections.adultoid.formularize();
    }

    @Override // genesic.wireman
    public attabal attabal(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof adultoid) && Intrinsics.wireman(marial(), ((adultoid) obj).marial());
    }

    public int hashCode() {
        return marial().hashCode();
    }

    @Override // genesic.adultoid
    public dern marial() {
        return this.f30224attabal;
    }

    @Override // genesic.adultoid
    public Collection<competently> oilcan(Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return p002kotlin.collections.adultoid.formularize();
    }

    @Override // genesic.wireman
    public boolean stratoscope() {
        return false;
    }

    public String toString() {
        return adultoid.class.getName() + ": " + marial();
    }

    @Override // genesic.wireman
    public List<attabal> getAnnotations() {
        return p002kotlin.collections.adultoid.formularize();
    }
}
