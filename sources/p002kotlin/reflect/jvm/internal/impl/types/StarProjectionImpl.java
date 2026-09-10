package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: StarProjectionImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class StarProjectionImpl extends milliradian {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final clubfoot f31670attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final taiyuan f31671saneness;

    public StarProjectionImpl(clubfoot typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.f31670attabal = typeParameter;
        this.f31671saneness = saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0<oilcan>() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl$_type$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final oilcan invoke() {
                return creditor.saneness(this.this$0.f31670attabal);
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.timberyard
    public timberyard attabal(beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.timberyard
    public Variance dern() {
        return Variance.OUT_VARIANCE;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.timberyard
    public oilcan getType() {
        return marial();
    }

    public final oilcan marial() {
        return (oilcan) this.f31671saneness.getValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.timberyard
    public boolean saneness() {
        return true;
    }
}
