package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lkotlinx/coroutines/Job;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, 1005}, m = "invokeSuspend")
final class JobSupport$children$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Job>, Continuation<? super Unit>, Object> {
    public LockFreeLinkedListHead X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public LockFreeLinkedListNode f44762Y;
    public int Z;
    public /* synthetic */ Object e0;
    public final /* synthetic */ JobSupport f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(Continuation continuation, JobSupport jobSupport) {
        super(2, continuation);
        this.f0 = jobSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(continuation, this.f0);
        jobSupport$children$1.e0 = obj;
        return jobSupport$children$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((JobSupport$children$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0069 -> B:25:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r1 = r5.Z
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r5.f44762Y
            kotlinx.coroutines.internal.LockFreeLinkedListHead r3 = r5.X
            java.lang.Object r4 = r5.e0
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.b(r6)
            goto L7e
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            kotlin.ResultKt.b(r6)
            goto L83
        L24:
            kotlin.ResultKt.b(r6)
            java.lang.Object r6 = r5.e0
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            kotlinx.coroutines.JobSupport r1 = r5.f0
            r1.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.JobSupport.X
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof kotlinx.coroutines.ChildHandleNode
            if (r4 == 0) goto L44
            kotlinx.coroutines.ChildHandleNode r1 = (kotlinx.coroutines.ChildHandleNode) r1
            kotlinx.coroutines.JobSupport r1 = r1.f0
            r5.Z = r3
            r6.a(r1, r5)
            return r0
        L44:
            boolean r3 = r1 instanceof kotlinx.coroutines.Incomplete
            if (r3 == 0) goto L83
            kotlinx.coroutines.Incomplete r1 = (kotlinx.coroutines.Incomplete) r1
            kotlinx.coroutines.NodeList r1 = r1.getX()
            if (r1 == 0) goto L83
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.internal.LockFreeLinkedListNode.X
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.d(r3, r4)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L61:
            boolean r6 = r1.equals(r3)
            if (r6 != 0) goto L83
            boolean r6 = r1 instanceof kotlinx.coroutines.ChildHandleNode
            if (r6 == 0) goto L7e
            r6 = r1
            kotlinx.coroutines.ChildHandleNode r6 = (kotlinx.coroutines.ChildHandleNode) r6
            r5.e0 = r4
            r5.X = r3
            r5.f44762Y = r1
            r5.Z = r2
            kotlinx.coroutines.JobSupport r6 = r6.f0
            r4.a(r6, r5)
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            return r0
        L7e:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.g()
            goto L61
        L83:
            kotlin.Unit r6 = kotlin.Unit.f43263a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
