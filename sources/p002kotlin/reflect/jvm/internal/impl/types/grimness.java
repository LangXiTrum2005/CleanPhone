package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;

/* JADX INFO: compiled from: TypeWithEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class grimness extends arytenoidectomy implements lotta {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final merc f31768arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final oilcan f31769monoploid;

    public grimness(merc delegate, oilcan enhancement) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(enhancement, "enhancement");
        this.f31768arytenoidectomy = delegate;
        this.f31769monoploid = enhancement;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.arytenoidectomy
    public merc immediately() {
        return this.f31768arytenoidectomy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.arytenoidectomy
    /* JADX INFO: renamed from: licking, reason: merged with bridge method [inline-methods] */
    public grimness tectonization(merc delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new grimness(delegate, timberyard());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: molet */
    public merc lampshade(boolean z) {
        empress empressVarWireman = sayid.wireman(getOrigin().lampshade(z), timberyard().homozygous().lampshade(z));
        Intrinsics.competently(empressVarWireman, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (merc) empressVarWireman;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.arytenoidectomy, p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: osteal, reason: merged with bridge method [inline-methods] */
    public grimness libyan(beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        oilcan oilcanVarAttabal = kotlinTypeRefiner.attabal(immediately());
        Intrinsics.competently(oilcanVarAttabal, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new grimness((merc) oilcanVarAttabal, kotlinTypeRefiner.attabal(timberyard()));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.lotta
    /* JADX INFO: renamed from: prefect, reason: merged with bridge method [inline-methods] */
    public merc getOrigin() {
        return immediately();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: sakeen */
    public merc deadwork(overspeculate newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        empress empressVarWireman = sayid.wireman(getOrigin().deadwork(newAttributes), timberyard());
        Intrinsics.competently(empressVarWireman, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (merc) empressVarWireman;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.lotta
    public oilcan timberyard() {
        return this.f31769monoploid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.merc
    public String toString() {
        return "[@EnhancedForWarnings(" + timberyard() + ")] " + getOrigin();
    }
}
