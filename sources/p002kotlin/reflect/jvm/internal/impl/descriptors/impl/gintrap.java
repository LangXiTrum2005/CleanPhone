package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import byname.dern;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impassible;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;

/* JADX INFO: compiled from: PackageFragmentDescriptorImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class gintrap extends cutely implements sealless {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final String f30064molybdenite;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final dern f30065polloi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gintrap(trm module, dern fqName) {
        super(module, marial.f29950impromptu.saneness(), fqName.impromptu(), walach.f30274attabal);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f30065polloi = fqName;
        this.f30064molybdenite = "package " + fqName + " of " + module;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cutely, p002kotlin.reflect.jvm.internal.impl.descriptors.triweekly
    public walach competently() {
        walach NO_SOURCE = walach.f30274attabal;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public <R, D> R dovishness(impassible<R, D> visitor, D d) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.impromptu(this, d);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.sealless
    public final dern marial() {
        return this.f30065polloi;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.taiyuan
    public String toString() {
        return this.f30064molybdenite;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cutely, p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public trm saneness() {
        apical apicalVarSaneness = super.saneness();
        Intrinsics.competently(apicalVarSaneness, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (trm) apicalVarSaneness;
    }
}
