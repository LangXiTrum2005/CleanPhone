package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p002kotlin.reflect.jvm.internal.impl.renderer.saneness;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import presbytery.wireman;

/* JADX INFO: compiled from: dynamicTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class graveside extends preprohormone implements wireman {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final overspeculate f31767polloi;

    /* JADX WARN: Illegal instructions before constructor call */
    public graveside(beachfront builtIns, overspeculate attributes) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        merc mercVarSupplicat = builtIns.supplicat();
        Intrinsics.checkNotNullExpressionValue(mercVarSupplicat, "getNothingType(...)");
        merc mercVarRestrictive = builtIns.restrictive();
        Intrinsics.checkNotNullExpressionValue(mercVarRestrictive, "getNullableAnyType(...)");
        super(mercVarSupplicat, mercVarRestrictive);
        this.f31767polloi = attributes;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.preprohormone
    public String basify(DescriptorRenderer renderer, saneness options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        return "dynamic";
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.preprohormone, p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public boolean mastfed() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.preprohormone
    public merc molet() {
        return immediately();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: osteal, reason: merged with bridge method [inline-methods] */
    public graveside deadwork(overspeculate newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new graveside(TypeUtilsKt.taiyuan(molet()), newAttributes);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: prefect, reason: merged with bridge method [inline-methods] */
    public graveside libyan(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.preprohormone, p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public overspeculate vesuvio() {
        return this.f31767polloi;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: tectonization, reason: merged with bridge method [inline-methods] */
    public graveside lampshade(boolean z) {
        return this;
    }
}
