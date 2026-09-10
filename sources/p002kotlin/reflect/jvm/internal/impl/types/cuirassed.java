package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p002kotlin.reflect.jvm.internal.impl.renderer.saneness;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;

/* JADX INFO: compiled from: TypeWithEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class cuirassed extends preprohormone implements lotta {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final oilcan f31743molybdenite;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final preprohormone f31744polloi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuirassed(preprohormone origin, oilcan enhancement) {
        super(origin.sakeen(), origin.immediately());
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(enhancement, "enhancement");
        this.f31744polloi = origin;
        this.f31743molybdenite = enhancement;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.preprohormone
    public String basify(DescriptorRenderer renderer, saneness options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        return options.wireman() ? renderer.adultoid(timberyard()) : getOrigin().basify(renderer, options);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    public empress deadwork(overspeculate newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return sayid.wireman(getOrigin().deadwork(newAttributes), timberyard());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    public empress lampshade(boolean z) {
        return sayid.wireman(getOrigin().lampshade(z), timberyard().homozygous().lampshade(z));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.preprohormone
    public merc molet() {
        return getOrigin().molet();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: prefect, reason: merged with bridge method [inline-methods] */
    public cuirassed libyan(beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        oilcan oilcanVarAttabal = kotlinTypeRefiner.attabal(getOrigin());
        Intrinsics.competently(oilcanVarAttabal, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new cuirassed((preprohormone) oilcanVarAttabal, kotlinTypeRefiner.attabal(timberyard()));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.lotta
    /* JADX INFO: renamed from: tectonization, reason: merged with bridge method [inline-methods] */
    public preprohormone getOrigin() {
        return this.f31744polloi;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.lotta
    public oilcan timberyard() {
        return this.f31743molybdenite;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.preprohormone
    public String toString() {
        return "[@EnhancedForWarnings(" + timberyard() + ")] " + getOrigin();
    }
}
