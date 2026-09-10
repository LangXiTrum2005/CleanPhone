package p002kotlin.reflect.jvm.internal.impl.types.checker;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import p002kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import p002kotlin.reflect.jvm.internal.impl.types.empress;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: NewKotlinTypeChecker.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class apical implements cutely {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final beachfront f31717dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final OverridingUtil f31718marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final KotlinTypePreparator f31719wireman;

    public apical(beachfront kotlinTypeRefiner, KotlinTypePreparator kotlinTypePreparator) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        this.f31717dern = kotlinTypeRefiner;
        this.f31719wireman = kotlinTypePreparator;
        OverridingUtil overridingUtilImpassible = OverridingUtil.impassible(dern());
        Intrinsics.checkNotNullExpressionValue(overridingUtilImpassible, "createWithTypeRefiner(...)");
        this.f31718marial = overridingUtilImpassible;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.cutely
    public OverridingUtil attabal() {
        return this.f31718marial;
    }

    public KotlinTypePreparator beachfront() {
        return this.f31719wireman;
    }

    public final boolean competently(TypeCheckerState typeCheckerState, empress subType, empress superType) {
        Intrinsics.checkNotNullParameter(typeCheckerState, "<this>");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return AbstractTypeChecker.graveside(AbstractTypeChecker.f31648attabal, typeCheckerState, subType, superType, false, 8, null);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.cutely
    public beachfront dern() {
        return this.f31717dern;
    }

    public final boolean marial(TypeCheckerState typeCheckerState, empress a, empress b) {
        Intrinsics.checkNotNullParameter(typeCheckerState, "<this>");
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return AbstractTypeChecker.f31648attabal.apical(typeCheckerState, a, b);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.marial
    public boolean saneness(oilcan a, oilcan b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return marial(attabal.saneness(false, false, null, beachfront(), dern(), 6, null), a.homozygous(), b.homozygous());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.marial
    public boolean wireman(oilcan subtype, oilcan supertype) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        return competently(attabal.saneness(true, false, null, beachfront(), dern(), 6, null), subtype.homozygous(), supertype.homozygous());
    }

    public /* synthetic */ apical(beachfront beachfrontVar, KotlinTypePreparator kotlinTypePreparator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(beachfrontVar, (i & 2) != 0 ? KotlinTypePreparator.attabal.f31707attabal : kotlinTypePreparator);
    }
}
