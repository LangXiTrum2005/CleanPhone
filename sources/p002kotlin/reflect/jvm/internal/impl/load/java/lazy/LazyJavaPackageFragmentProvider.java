package p002kotlin.reflect.jvm.internal.impl.load.java.lazy;

import byname.dern;
import byname.marial;
import java.util.Collection;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.restrictive;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import p002kotlin.reflect.jvm.internal.impl.load.java.taiyuan;
import patroclinal.cutely;
import patroclinal.wireman;
import yeast.attabal;

/* JADX INFO: compiled from: LazyJavaPackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaPackageFragmentProvider implements restrictive {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final wireman f30446attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final attabal<dern, LazyJavaPackageFragment> f30447saneness;

    public LazyJavaPackageFragmentProvider(attabal components) {
        Intrinsics.checkNotNullParameter(components, "components");
        wireman wiremanVar = new wireman(components, competently.attabal.f30478attabal, cutely.dern(null));
        this.f30446attabal = wiremanVar;
        this.f30447saneness = wiremanVar.marial().attabal();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.restrictive
    public boolean attabal(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return taiyuan.attabal(this.f30446attabal.attabal().wireman(), fqName, false, 2, null) == null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.kattegat
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public List<dern> polloi(dern fqName, Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        LazyJavaPackageFragment lazyJavaPackageFragmentMarial = marial(fqName);
        List<dern> listHomozygous = lazyJavaPackageFragmentMarial != null ? lazyJavaPackageFragmentMarial.homozygous() : null;
        return listHomozygous == null ? adultoid.formularize() : listHomozygous;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.kattegat
    @wireman
    public List<LazyJavaPackageFragment> dern(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return adultoid.arytenoidectomy(marial(fqName));
    }

    public final LazyJavaPackageFragment marial(dern dernVar) {
        final genesic.adultoid adultoidVarAttabal = taiyuan.attabal(this.f30446attabal.attabal().wireman(), dernVar, false, 2, null);
        if (adultoidVarAttabal == null) {
            return null;
        }
        return this.f30447saneness.attabal(dernVar, new Function0<LazyJavaPackageFragment>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider$getPackageFragment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final LazyJavaPackageFragment invoke() {
                return new LazyJavaPackageFragment(this.this$0.f30446attabal, adultoidVarAttabal);
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.restrictive
    public void saneness(dern fqName, Collection<sealless> packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        lyreflower.attabal.attabal(packageFragments, marial(fqName));
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f30446attabal.attabal().impassible();
    }
}
