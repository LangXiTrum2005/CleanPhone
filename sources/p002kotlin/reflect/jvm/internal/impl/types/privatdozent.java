package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;

/* JADX INFO: compiled from: StarProjectionImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class privatdozent extends milliradian {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final oilcan f31809attabal;

    public privatdozent(beachfront kotlinBuiltIns) {
        Intrinsics.checkNotNullParameter(kotlinBuiltIns, "kotlinBuiltIns");
        merc mercVarRestrictive = kotlinBuiltIns.restrictive();
        Intrinsics.checkNotNullExpressionValue(mercVarRestrictive, "getNullableAnyType(...)");
        this.f31809attabal = mercVarRestrictive;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.timberyard
    public timberyard attabal(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.timberyard
    public Variance dern() {
        return Variance.OUT_VARIANCE;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.timberyard
    public oilcan getType() {
        return this.f31809attabal;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.timberyard
    public boolean saneness() {
        return true;
    }
}
