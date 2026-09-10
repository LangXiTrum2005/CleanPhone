package p002kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import byname.dern;
import byname.marial;
import java.util.Map;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: BuiltInAnnotationDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class BuiltInAnnotationDescriptor implements dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final beachfront f29920attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<marial, competently<?>> f29921dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final taiyuan f29922marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final dern f29923saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final boolean f29924wireman;

    /* JADX WARN: Multi-variable type inference failed */
    public BuiltInAnnotationDescriptor(beachfront builtIns, dern fqName, Map<marial, ? extends competently<?>> allValueArguments, boolean z) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(allValueArguments, "allValueArguments");
        this.f29920attabal = builtIns;
        this.f29923saneness = fqName;
        this.f29921dern = allValueArguments;
        this.f29924wireman = z;
        this.f29922marial = saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0<merc>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor$type$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final merc invoke() {
                return this.this$0.f29920attabal.kowloon(this.this$0.marial()).impassible();
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    public Map<marial, competently<?>> attabal() {
        return this.f29921dern;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    public walach competently() {
        walach NO_SOURCE = walach.f30274attabal;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    public oilcan getType() {
        Object value = this.f29922marial.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (oilcan) value;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    public dern marial() {
        return this.f29923saneness;
    }

    public /* synthetic */ BuiltInAnnotationDescriptor(beachfront beachfrontVar, dern dernVar, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(beachfrontVar, dernVar, map, (i & 8) != 0 ? false : z);
    }
}
