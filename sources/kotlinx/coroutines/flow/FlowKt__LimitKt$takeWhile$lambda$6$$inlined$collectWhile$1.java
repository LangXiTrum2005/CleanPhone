package kotlinx.coroutines.flow;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 implements FlowCollector<Object> {
    public final /* synthetic */ SuspendLambda X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f44916Y;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {131, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "emit")
    public final class AnonymousClass1 extends ContinuationImpl {
        public FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public /* synthetic */ Object f44917Y;
        public int Z;
        public Object f0;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44917Y = obj;
            this.Z |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.this.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1(Function2 function2, FlowCollector flowCollector) {
        this.X = (SuspendLambda) function2;
        this.f44916Y = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.AnonymousClass1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f44917Y
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 r8 = r0.X
            kotlin.ResultKt.b(r9)
            goto L6e
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.f0
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 r2 = r0.X
            kotlin.ResultKt.b(r9)
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
            goto L55
        L40:
            kotlin.ResultKt.b(r9)
            r0.X = r7
            r0.f0 = r8
            r0.Z = r4
            kotlin.coroutines.jvm.internal.SuspendLambda r9 = r7.X
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r1) goto L52
            goto L6c
        L52:
            r2 = r9
            r9 = r8
            r8 = r7
        L55:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L6d
            kotlinx.coroutines.flow.FlowCollector r2 = r8.f44916Y
            r0.X = r8
            r5 = 0
            r0.f0 = r5
            r0.Z = r3
            java.lang.Object r9 = r2.emit(r9, r0)
            if (r9 != r1) goto L6e
        L6c:
            return r1
        L6d:
            r4 = 0
        L6e:
            if (r4 == 0) goto L73
            kotlin.Unit r8 = kotlin.Unit.f43263a
            return r8
        L73:
            kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
