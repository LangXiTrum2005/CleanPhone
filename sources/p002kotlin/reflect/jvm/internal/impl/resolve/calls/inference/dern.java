package p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.Collection;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;

/* JADX INFO: compiled from: CapturedTypeConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dern implements saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final timberyard f31311attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public NewCapturedTypeConstructor f31312saneness;

    public dern(timberyard projection) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.f31311attabal = projection;
        dern().dern();
        Variance variance = Variance.INVARIANT;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public beachfront apical() {
        beachfront beachfrontVarApical = dern().getType().setterwort().apical();
        Intrinsics.checkNotNullExpressionValue(beachfrontVarApical, "getBuiltIns(...)");
        return beachfrontVarApical;
    }

    public Void beachfront() {
        return null;
    }

    public final NewCapturedTypeConstructor competently() {
        return this.f31312saneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public Collection<oilcan> cutely() {
        oilcan type = dern().dern() == Variance.OUT_VARIANCE ? dern().getType() : apical().restrictive();
        Intrinsics.beachfront(type);
        return graveside.marial(type);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference.saneness
    public timberyard dern() {
        return this.f31311attabal;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public List<clubfoot> getParameters() {
        return adultoid.formularize();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public dern attabal(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        timberyard timberyardVarAttabal = dern().attabal(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(timberyardVarAttabal, "refine(...)");
        return new dern(timberyardVarAttabal);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public boolean marial() {
        return false;
    }

    public final void taiyuan(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.f31312saneness = newCapturedTypeConstructor;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + dern() + ')';
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public /* bridge */ /* synthetic */ p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront wireman() {
        return (p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront) beachfront();
    }
}
