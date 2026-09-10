package p002kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.empress;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import presbytery.saneness;
import prescient.competently;

/* JADX INFO: compiled from: NewCapturedType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impromptu extends merc implements saneness {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final boolean f31727adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final CaptureStatus f31728arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final boolean f31729graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final overspeculate f31730molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final NewCapturedTypeConstructor f31731monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final empress f31732polloi;

    public /* synthetic */ impromptu(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, empress empressVar, overspeculate overspeculateVar, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(captureStatus, newCapturedTypeConstructor, empressVar, (i & 8) != 0 ? overspeculate.f31797arytenoidectomy.taiyuan() : overspeculateVar, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    /* JADX INFO: renamed from: basify, reason: merged with bridge method [inline-methods] */
    public NewCapturedTypeConstructor setterwort() {
        return this.f31731monoploid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public List<timberyard> dhss() {
        return adultoid.formularize();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public MemberScope formularize() {
        return competently.attabal(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public final CaptureStatus immediately() {
        return this.f31728arytenoidectomy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: licking, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public impromptu libyan(beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        CaptureStatus captureStatus = this.f31728arytenoidectomy;
        NewCapturedTypeConstructor newCapturedTypeConstructorAttabal = setterwort().attabal(kotlinTypeRefiner);
        empress empressVar = this.f31732polloi;
        return new impromptu(captureStatus, newCapturedTypeConstructorAttabal, empressVar != null ? kotlinTypeRefiner.attabal(empressVar).homozygous() : null, vesuvio(), mastfed(), false, 32, null);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public boolean mastfed() {
        return this.f31729graveside;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.merc
    /* JADX INFO: renamed from: osteal, reason: merged with bridge method [inline-methods] */
    public impromptu lampshade(boolean z) {
        return new impromptu(this.f31728arytenoidectomy, setterwort(), this.f31732polloi, vesuvio(), z, false, 32, null);
    }

    public final boolean prefect() {
        return this.f31727adultoid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: sakeen */
    public merc deadwork(overspeculate newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new impromptu(this.f31728arytenoidectomy, setterwort(), this.f31732polloi, newAttributes, mastfed(), this.f31727adultoid);
    }

    public final empress tectonization() {
        return this.f31732polloi;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public overspeculate vesuvio() {
        return this.f31730molybdenite;
    }

    public impromptu(CaptureStatus captureStatus, NewCapturedTypeConstructor constructor, empress empressVar, overspeculate attributes, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(captureStatus, "captureStatus");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f31728arytenoidectomy = captureStatus;
        this.f31731monoploid = constructor;
        this.f31732polloi = empressVar;
        this.f31730molybdenite = attributes;
        this.f31729graveside = z;
        this.f31727adultoid = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public impromptu(CaptureStatus captureStatus, empress empressVar, timberyard projection, clubfoot typeParameter) {
        Intrinsics.checkNotNullParameter(captureStatus, "captureStatus");
        Intrinsics.checkNotNullParameter(projection, "projection");
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        overspeculate overspeculateVar = null;
        boolean z = false;
        boolean z2 = false;
        this(captureStatus, new NewCapturedTypeConstructor(projection, null, null, typeParameter, 6, null), empressVar, overspeculateVar, z, z2, 56, null);
    }
}
