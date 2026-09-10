package kotlinx.coroutines.flow.internal;

import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {Sdk.SDKMetric.SDKMetricType.AD_REWARD_USER_VALUE, 73, 76}, m = "invokeSuspend")
final class CombineKt$combineInternal$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Channel X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public byte[] f45006Y;
    public int Z;
    public int e0;
    public int f0;
    public /* synthetic */ Object g0;
    public final /* synthetic */ Flow[] h0;
    public final /* synthetic */ Function0 i0;
    public final /* synthetic */ SuspendLambda j0;
    public final /* synthetic */ FlowCollector k0;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ Flow[] f45007Y;
        public final /* synthetic */ int Z;
        public final /* synthetic */ AtomicInteger e0;
        public final /* synthetic */ BufferedChannel f0;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        final class C07761<T> implements FlowCollector {
            public final /* synthetic */ BufferedChannel X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ int f45008Y;

            public C07761(BufferedChannel bufferedChannel, int i2) {
                this.X = bufferedChannel;
                this.f45008Y = i2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
            
                if (kotlinx.coroutines.YieldKt.a(r0) == r1) goto L21;
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                    int r1 = r0.Z
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.Z = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.X
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
                    int r2 = r0.Z
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L36
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.ResultKt.b(r7)
                    goto L54
                L2a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L32:
                    kotlin.ResultKt.b(r7)
                    goto L4b
                L36:
                    kotlin.ResultKt.b(r7)
                    kotlin.collections.IndexedValue r7 = new kotlin.collections.IndexedValue
                    int r2 = r5.f45008Y
                    r7.<init>(r2, r6)
                    r0.Z = r4
                    kotlinx.coroutines.channels.BufferedChannel r6 = r5.X
                    java.lang.Object r6 = r6.y(r7, r0)
                    if (r6 != r1) goto L4b
                    goto L53
                L4b:
                    r0.Z = r3
                    java.lang.Object r6 = kotlinx.coroutines.YieldKt.a(r0)
                    if (r6 != r1) goto L54
                L53:
                    return r1
                L54:
                    kotlin.Unit r6 = kotlin.Unit.f43263a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1.C07761.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Flow[] flowArr, int i2, AtomicInteger atomicInteger, BufferedChannel bufferedChannel, Continuation continuation) {
            super(2, continuation);
            this.f45007Y = flowArr;
            this.Z = i2;
            this.e0 = atomicInteger;
            this.f0 = bufferedChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f45007Y, this.Z, this.e0, this.f0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.X;
            AtomicInteger atomicInteger = this.e0;
            BufferedChannel bufferedChannel = this.f0;
            try {
                if (i2 == 0) {
                    ResultKt.b(obj);
                    Flow[] flowArr = this.f45007Y;
                    int i3 = this.Z;
                    Flow flow = flowArr[i3];
                    C07761 c07761 = new C07761(bufferedChannel, i3);
                    this.X = 1;
                    if (flow.collect(c07761, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    bufferedChannel.x(null);
                }
                return Unit.f43263a;
            } catch (Throwable th) {
                if (atomicInteger.decrementAndGet() == 0) {
                    bufferedChannel.x(null);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2(Continuation continuation, Function0 function0, Function3 function3, FlowCollector flowCollector, Flow[] flowArr) {
        super(2, continuation);
        this.h0 = flowArr;
        this.i0 = function0;
        this.j0 = (SuspendLambda) function3;
        this.k0 = flowCollector;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ?? r3 = this.j0;
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(continuation, this.i0, r3, this.k0, this.h0);
        combineKt$combineInternal$2.g0 = obj;
        return combineKt$combineInternal$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CombineKt$combineInternal$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b4 A[PHI: r2 r8 r10 r11 r12 r13 r14
  0x00b4: PHI (r2v5 byte[] A[IMMUTABLE_TYPE]) = (r2v6 byte[]), (r2v9 byte[]) binds: [B:20:0x00b0, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x00b4: PHI (r8v2 java.lang.Object) = (r8v4 java.lang.Object), (r8v0 java.lang.Object) binds: [B:20:0x00b0, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x00b4: PHI (r10v3 int) = (r10v7 int), (r10v9 int) binds: [B:20:0x00b0, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x00b4: PHI (r11v2 java.lang.Object[]) = (r11v3 java.lang.Object[]), (r11v6 java.lang.Object[]) binds: [B:20:0x00b0, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x00b4: PHI (r12v4 kotlinx.coroutines.channels.Channel) = (r12v5 kotlinx.coroutines.channels.Channel), (r12v7 kotlinx.coroutines.channels.Channel) binds: [B:20:0x00b0, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x00b4: PHI (r13v3 int) = (r13v6 int), (r13v10 int) binds: [B:20:0x00b0, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x00b4: PHI (r14v1 java.lang.Object) = (r14v11 java.lang.Object), (r14v14 java.lang.Object) binds: [B:20:0x00b0, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bf A[LOOP:0: B:29:0x00bf->B:41:0x00e2, LOOP_START, PHI: r10 r14
  0x00bf: PHI (r10v4 int) = (r10v3 int), (r10v5 int) binds: [B:27:0x00bc, B:41:0x00e2] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r14v4 kotlin.collections.IndexedValue) = (r14v3 kotlin.collections.IndexedValue), (r14v9 kotlin.collections.IndexedValue) binds: [B:27:0x00bc, B:41:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4 A[EDGE_INSN: B:53:0x00e4->B:42:0x00e4 BREAK  A[LOOP:0: B:29:0x00bf->B:41:0x00e2], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v6, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0107 -> B:19:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x011e -> B:52:0x0121). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
