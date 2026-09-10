package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import byname.dern;
import byname.marial;
import java.util.Collection;
import java.util.List;
import lyreflower.attabal;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.restrictive;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import patroclinal.wireman;
import yeast.competently;
import yeast.formularize;

/* JADX INFO: compiled from: AbstractDeserializedPackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractDeserializedPackageFragmentProvider implements restrictive {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final formularize f31415attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final trm f31416dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final competently<dern, sealless> f31417marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final polloi f31418saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public impromptu f31419wireman;

    public AbstractDeserializedPackageFragmentProvider(formularize storageManager, polloi finder, trm moduleDescriptor) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        this.f31415attabal = storageManager;
        this.f31418saneness = finder;
        this.f31416dern = moduleDescriptor;
        this.f31417marial = storageManager.competently(new Function1<dern, sealless>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider$fragments$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final sealless invoke(dern fqName) {
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                formularize formularizeVarWireman = this.this$0.wireman(fqName);
                if (formularizeVarWireman == null) {
                    return null;
                }
                formularizeVarWireman.vesuvio(this.this$0.marial());
                return formularizeVarWireman;
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.restrictive
    public boolean attabal(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return (this.f31417marial.apical(fqName) ? (sealless) this.f31417marial.invoke(fqName) : wireman(fqName)) == null;
    }

    public final polloi beachfront() {
        return this.f31418saneness;
    }

    public final trm competently() {
        return this.f31416dern;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.kattegat
    @wireman
    public List<sealless> dern(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return adultoid.arytenoidectomy(this.f31417marial.invoke(fqName));
    }

    public final formularize impromptu() {
        return this.f31415attabal;
    }

    public final impromptu marial() {
        impromptu impromptuVar = this.f31419wireman;
        if (impromptuVar != null) {
            return impromptuVar;
        }
        Intrinsics.preprohormone("components");
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.kattegat
    public Collection<dern> polloi(dern fqName, Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return creditor.marial();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.restrictive
    public void saneness(dern fqName, Collection<sealless> packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        attabal.attabal(packageFragments, this.f31417marial.invoke(fqName));
    }

    public final void taiyuan(impromptu impromptuVar) {
        Intrinsics.checkNotNullParameter(impromptuVar, "<set-?>");
        this.f31419wireman = impromptuVar;
    }

    public abstract formularize wireman(dern dernVar);
}
