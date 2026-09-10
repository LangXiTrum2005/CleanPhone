package androidx.privacysandbox.ads.adservices.measurement;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", f = "MeasurementManagerImplCommon.kt", l = {}, m = "invokeSuspend")
public final class MeasurementManagerImplCommon$registerSource$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ SourceRegistrationRequest f7954Y;
    public final /* synthetic */ MeasurementManagerImplCommon Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeasurementManagerImplCommon$registerSource$4(MeasurementManagerImplCommon measurementManagerImplCommon, SourceRegistrationRequest sourceRegistrationRequest, Continuation continuation) {
        super(2, continuation);
        this.f7954Y = sourceRegistrationRequest;
        this.Z = measurementManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MeasurementManagerImplCommon$registerSource$4 measurementManagerImplCommon$registerSource$4 = new MeasurementManagerImplCommon$registerSource$4(this.Z, this.f7954Y, continuation);
        measurementManagerImplCommon$registerSource$4.X = obj;
        return measurementManagerImplCommon$registerSource$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((MeasurementManagerImplCommon$registerSource$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ResultKt.b(obj);
        this.f7954Y.getClass();
        throw null;
    }
}
