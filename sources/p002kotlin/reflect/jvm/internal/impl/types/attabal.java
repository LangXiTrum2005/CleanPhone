package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal extends arytenoidectomy {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final merc f31705arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final merc f31706monoploid;

    public attabal(merc delegate, merc abbreviation) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(abbreviation, "abbreviation");
        this.f31705arytenoidectomy = delegate;
        this.f31706monoploid = abbreviation;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.arytenoidectomy
    public merc immediately() {
        return this.f31705arytenoidectomy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.arytenoidectomy, p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: licking, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public attabal libyan(beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        oilcan oilcanVarAttabal = kotlinTypeRefiner.attabal(immediately());
        Intrinsics.competently(oilcanVarAttabal, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        oilcan oilcanVarAttabal2 = kotlinTypeRefiner.attabal(this.f31706monoploid);
        Intrinsics.competently(oilcanVarAttabal2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new attabal((merc) oilcanVarAttabal, (merc) oilcanVarAttabal2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.arytenoidectomy
    /* JADX INFO: renamed from: microchemistry, reason: merged with bridge method [inline-methods] */
    public attabal tectonization(merc delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new attabal(delegate, this.f31706monoploid);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.merc
    /* JADX INFO: renamed from: osteal, reason: merged with bridge method [inline-methods] */
    public attabal lampshade(boolean z) {
        return new attabal(immediately().lampshade(z), this.f31706monoploid.lampshade(z));
    }

    public final merc prefect() {
        return this.f31706monoploid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: sakeen */
    public merc deadwork(overspeculate newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new attabal(immediately().deadwork(newAttributes), this.f31706monoploid);
    }

    public final merc trm() {
        return immediately();
    }
}
