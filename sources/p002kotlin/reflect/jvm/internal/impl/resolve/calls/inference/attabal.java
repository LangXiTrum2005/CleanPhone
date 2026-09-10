package p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import presbytery.saneness;
import prescient.competently;

/* JADX INFO: compiled from: CapturedTypeConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal extends merc implements saneness {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final timberyard f31307arytenoidectomy;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final overspeculate f31308molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final saneness f31309monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final boolean f31310polloi;

    public /* synthetic */ attabal(timberyard timberyardVar, saneness sanenessVar, boolean z, overspeculate overspeculateVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(timberyardVar, (i & 2) != 0 ? new dern(timberyardVar) : sanenessVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? overspeculate.f31797arytenoidectomy.taiyuan() : overspeculateVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.merc
    /* JADX INFO: renamed from: basify, reason: merged with bridge method [inline-methods] */
    public attabal lampshade(boolean z) {
        return z == mastfed() ? this : new attabal(this.f31307arytenoidectomy, setterwort(), z, vesuvio());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public List<timberyard> dhss() {
        return adultoid.formularize();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public MemberScope formularize() {
        return competently.attabal(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    /* JADX INFO: renamed from: immediately, reason: merged with bridge method [inline-methods] */
    public saneness setterwort() {
        return this.f31309monoploid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public boolean mastfed() {
        return this.f31310polloi;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: sakeen */
    public merc deadwork(overspeculate newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new attabal(this.f31307arytenoidectomy, setterwort(), mastfed(), newAttributes);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: tectonization, reason: merged with bridge method [inline-methods] */
    public attabal libyan(beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        timberyard timberyardVarAttabal = this.f31307arytenoidectomy.attabal(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(timberyardVarAttabal, "refine(...)");
        return new attabal(timberyardVarAttabal, setterwort(), mastfed(), vesuvio());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.merc
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Captured(");
        sb.append(this.f31307arytenoidectomy);
        sb.append(')');
        sb.append(mastfed() ? "?" : "");
        return sb.toString();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public overspeculate vesuvio() {
        return this.f31308molybdenite;
    }

    public attabal(timberyard typeProjection, saneness constructor, boolean z, overspeculate attributes) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f31307arytenoidectomy = typeProjection;
        this.f31309monoploid = constructor;
        this.f31310polloi = z;
        this.f31308molybdenite = attributes;
    }
}
