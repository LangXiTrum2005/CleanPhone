package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.y4.g;
import j$.time.Instant;
import j$.time.TimeConversions;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0097@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007H\u0097@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0097@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0014H\u0097@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0017H\u0097@¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u0097@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManager;", "Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "deletionRequest", "", "a", "(Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trigger", "e", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;", "request", f.j, "(Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;", "d", "(Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;", g.f40227p, "(Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class MeasurementManagerImplCommon extends MeasurementManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.adservices.measurement.MeasurementManager f7953a;

    public MeasurementManagerImplCommon(android.adservices.measurement.MeasurementManager mMeasurementManager) {
        Intrinsics.f(mMeasurementManager, "mMeasurementManager");
        this.f7953a = mMeasurementManager;
    }

    public static Object h(MeasurementManagerImplCommon measurementManagerImplCommon, DeletionRequest deletionRequest, Continuation<? super Unit> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.q();
        android.adservices.measurement.MeasurementManager measurementManager = measurementManagerImplCommon.f7953a;
        deletionRequest.getClass();
        android.adservices.measurement.DeletionRequest deletionRequestBuild = androidx.privacysandbox.ads.adservices.customaudience.a.d().setDeletionMode(0).setMatchBehavior(0).setStart(TimeConversions.convert((Instant) null)).setEnd(TimeConversions.convert((Instant) null)).setDomainUris(null).setOriginUris(null).build();
        Intrinsics.e(deletionRequestBuild, "Builder()\n            .s…ris)\n            .build()");
        measurementManager.deleteRegistrations(deletionRequestBuild, new androidx.arch.core.executor.a(1), OutcomeReceiverKt.a(cancellableContinuationImpl));
        Object objP = cancellableContinuationImpl.p();
        return objP == CoroutineSingletons.X ? objP : Unit.f43263a;
    }

    public static Object i(MeasurementManagerImplCommon measurementManagerImplCommon, Continuation<? super Integer> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.q();
        measurementManagerImplCommon.f7953a.getMeasurementApiStatus(new androidx.arch.core.executor.a(1), OutcomeReceiverKt.a(cancellableContinuationImpl));
        Object objP = cancellableContinuationImpl.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        return objP;
    }

    public static Object j(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.q();
        measurementManagerImplCommon.f7953a.registerSource(uri, inputEvent, new androidx.arch.core.executor.a(1), OutcomeReceiverKt.a(cancellableContinuationImpl));
        Object objP = cancellableContinuationImpl.p();
        return objP == CoroutineSingletons.X ? objP : Unit.f43263a;
    }

    @ExperimentalFeatures.RegisterSourceOptIn
    public static Object k(MeasurementManagerImplCommon measurementManagerImplCommon, SourceRegistrationRequest sourceRegistrationRequest, Continuation<? super Unit> continuation) {
        Object objD = CoroutineScopeKt.d(new MeasurementManagerImplCommon$registerSource$4(measurementManagerImplCommon, sourceRegistrationRequest, null), continuation);
        return objD == CoroutineSingletons.X ? objD : Unit.f43263a;
    }

    public static Object l(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, Continuation<? super Unit> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.q();
        measurementManagerImplCommon.f7953a.registerTrigger(uri, new androidx.arch.core.executor.a(1), OutcomeReceiverKt.a(cancellableContinuationImpl));
        Object objP = cancellableContinuationImpl.p();
        return objP == CoroutineSingletons.X ? objP : Unit.f43263a;
    }

    public static Object m(MeasurementManagerImplCommon measurementManagerImplCommon, WebSourceRegistrationRequest webSourceRegistrationRequest, Continuation<? super Unit> continuation) {
        new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation)).q();
        android.adservices.measurement.MeasurementManager measurementManager = measurementManagerImplCommon.f7953a;
        webSourceRegistrationRequest.getClass();
        androidx.privacysandbox.ads.adservices.customaudience.a.B();
        Intrinsics.f(null, "request");
        new ArrayList();
        throw null;
    }

    public static Object n(MeasurementManagerImplCommon measurementManagerImplCommon, WebTriggerRegistrationRequest webTriggerRegistrationRequest, Continuation<? super Unit> continuation) {
        new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation)).q();
        android.adservices.measurement.MeasurementManager measurementManager = measurementManagerImplCommon.f7953a;
        webTriggerRegistrationRequest.getClass();
        androidx.privacysandbox.ads.adservices.customaudience.a.D();
        Intrinsics.f(null, "request");
        new ArrayList();
        throw null;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object a(DeletionRequest deletionRequest, Continuation<? super Unit> continuation) {
        return h(this, deletionRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object b(Continuation<? super Integer> continuation) {
        return i(this, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object c(Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) {
        return j(this, uri, inputEvent, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @ExperimentalFeatures.RegisterSourceOptIn
    public Object d(SourceRegistrationRequest sourceRegistrationRequest, Continuation<? super Unit> continuation) {
        return k(this, sourceRegistrationRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object e(Uri uri, Continuation<? super Unit> continuation) {
        return l(this, uri, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object f(WebSourceRegistrationRequest webSourceRegistrationRequest, Continuation<? super Unit> continuation) {
        return m(this, webSourceRegistrationRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object g(WebTriggerRegistrationRequest webTriggerRegistrationRequest, Continuation<? super Unit> continuation) {
        return n(this, webTriggerRegistrationRequest, continuation);
    }
}
