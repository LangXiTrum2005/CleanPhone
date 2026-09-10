package androidx.paging;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.FlowExtKt$simpleScan$1$1", f = "FlowExt.kt", l = {56, Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE}, m = "emit")
final class FlowExtKt$simpleScan$1$1$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ FlowExtKt$simpleScan$1.AnonymousClass1 f7800Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$simpleScan$1$1$emit$1(FlowExtKt$simpleScan$1.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.f7800Y = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        this.f7800Y.emit(null, this);
        return Unit.f43263a;
    }
}
