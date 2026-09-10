package kotlinx.coroutines.flow;

import androidx.room.d;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, TTAdConstant.VIDEO_COVER_URL_CODE}, m = "invokeSuspend")
final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public Ref.ObjectRef X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Ref.LongRef f44877Y;
    public int Z;
    public /* synthetic */ Object e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ d g0;
    public final /* synthetic */ Flow h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(d dVar, Flow flow, Continuation continuation) {
        super(3, continuation);
        this.g0 = dVar;
        this.h0 = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.g0, this.h0, (Continuation) obj3);
        flowKt__DelayKt$debounceInternal$1.e0 = (CoroutineScope) obj;
        flowKt__DelayKt$debounceInternal$1.f0 = (FlowCollector) obj2;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:19:0x0078  */
    /* JADX WARN: Code duplicated, block: B:21:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0090 A[PHI: r1 r5 r6 r7
  0x0090: PHI (r1v3 kotlin.jvm.internal.Ref$LongRef) = (r1v5 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef) binds: [B:25:0x008e, B:15:0x0060, B:18:0x0076] A[DONT_GENERATE, DONT_INLINE]
  0x0090: PHI (r5v2 kotlin.jvm.internal.Ref$ObjectRef) = 
  (r5v4 kotlin.jvm.internal.Ref$ObjectRef)
  (r5v5 kotlin.jvm.internal.Ref$ObjectRef)
  (r5v5 kotlin.jvm.internal.Ref$ObjectRef)
 binds: [B:25:0x008e, B:15:0x0060, B:18:0x0076] A[DONT_GENERATE, DONT_INLINE]
  0x0090: PHI (r6v3 kotlinx.coroutines.channels.ReceiveChannel) = 
  (r6v5 kotlinx.coroutines.channels.ReceiveChannel)
  (r6v6 kotlinx.coroutines.channels.ReceiveChannel)
  (r6v6 kotlinx.coroutines.channels.ReceiveChannel)
 binds: [B:25:0x008e, B:15:0x0060, B:18:0x0076] A[DONT_GENERATE, DONT_INLINE]
  0x0090: PHI (r7v2 kotlinx.coroutines.flow.FlowCollector) = 
  (r7v4 kotlinx.coroutines.flow.FlowCollector)
  (r7v5 kotlinx.coroutines.flow.FlowCollector)
  (r7v5 kotlinx.coroutines.flow.FlowCollector)
 binds: [B:25:0x008e, B:15:0x0060, B:18:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d1  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r7.emit(r8, r12) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
    
        if (r7.g(r12) == r0) goto L34;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ce -> B:7:0x001a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
