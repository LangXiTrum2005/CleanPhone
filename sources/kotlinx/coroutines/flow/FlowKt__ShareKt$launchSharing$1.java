package kotlinx.coroutines.flow;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE}, m = "invokeSuspend")
final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ SharingStarted f44944Y = SharingStarted.Companion.f44979a;
    public final /* synthetic */ Flow Z;
    public final /* synthetic */ SharedFlowImpl e0;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {
        public /* synthetic */ int X;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.X = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            ResultKt.b(obj);
            return Boolean.valueOf(this.X > 0);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lkotlinx/coroutines/flow/SharingCommand;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "invokeSuspend")
    final class AnonymousClass2 extends SuspendLambda implements Function2<SharingCommand, Continuation<? super Unit>, Object> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public /* synthetic */ Object f44945Y;
        public final /* synthetic */ Flow Z;
        public final /* synthetic */ SharedFlowImpl e0;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$WhenMappings */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    SharingCommand sharingCommand = SharingCommand.X;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    SharingCommand sharingCommand2 = SharingCommand.X;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Flow flow, SharedFlowImpl sharedFlowImpl, Continuation continuation) {
            super(2, continuation);
            this.Z = flow;
            this.e0 = sharedFlowImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.Z, this.e0, continuation);
            anonymousClass2.f44945Y = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((SharingCommand) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.X;
            if (i2 == 0) {
                ResultKt.b(obj);
                int iOrdinal = ((SharingCommand) this.f44945Y).ordinal();
                SharedFlowImpl sharedFlowImpl = this.e0;
                if (iOrdinal == 0) {
                    this.X = 1;
                    if (this.Z.collect(sharedFlowImpl, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    synchronized (sharedFlowImpl) {
                        sharedFlowImpl.s(((long) sharedFlowImpl.l0) + sharedFlowImpl.n(), sharedFlowImpl.k0, ((long) sharedFlowImpl.l0) + sharedFlowImpl.n(), ((long) sharedFlowImpl.m0) + sharedFlowImpl.n() + ((long) sharedFlowImpl.l0));
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f43263a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharing$1(Flow flow, SharedFlowImpl sharedFlowImpl, Continuation continuation) {
        super(2, continuation);
        this.Z = flow;
        this.e0 = sharedFlowImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FlowKt__ShareKt$launchSharing$1(this.Z, this.e0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__ShareKt$launchSharing$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r4.collect(r2, r6) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r4.collect(r2, r6) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r1 = r6.X
            kotlinx.coroutines.flow.SharedFlowImpl r2 = r6.e0
            r3 = 1
            kotlinx.coroutines.flow.Flow r4 = r6.Z
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L16
            r3 = 3
            r5 = 2
            if (r1 == r5) goto L22
            if (r1 == r3) goto L16
            r0 = 4
            if (r1 != r0) goto L1a
        L16:
            kotlin.ResultKt.b(r7)
            goto L3a
        L1a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L22:
            kotlin.ResultKt.b(r7)
            r6.X = r3
            java.lang.Object r7 = r4.collect(r2, r6)
            if (r7 != r0) goto L3a
            goto L39
        L2e:
            kotlin.ResultKt.b(r7)
            r6.X = r3
            java.lang.Object r7 = r4.collect(r2, r6)
            if (r7 != r0) goto L3a
        L39:
            return r0
        L3a:
            kotlin.Unit r7 = kotlin.Unit.f43263a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
