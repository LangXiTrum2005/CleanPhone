package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", l = {241, 242, 242}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$filterIndexed$1 extends SuspendLambda implements Function2 {
    public ChannelIterator X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f44810Y;
    public int Z;
    public int e0;
    public /* synthetic */ Object f0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$filterIndexed$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r10 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r1 = r9.e0
            r2 = 0
            if (r1 == 0) goto L8c
            r3 = 1
            r4 = 2
            if (r1 == r3) goto L5f
            r5 = 3
            if (r1 == r4) goto L24
            if (r1 != r5) goto L1c
            int r1 = r9.Z
            kotlinx.coroutines.channels.ChannelIterator r5 = r9.X
            java.lang.Object r6 = r9.f0
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.b(r10)
            goto L4c
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            int r1 = r9.Z
            java.lang.Object r6 = r9.f44810Y
            kotlinx.coroutines.channels.ChannelIterator r7 = r9.X
            java.lang.Object r8 = r9.f0
            kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
            kotlin.ResultKt.b(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4e
            r9.f0 = r8
            r9.X = r7
            r9.f44810Y = r2
            r9.Z = r1
            r9.e0 = r5
            java.lang.Object r10 = r8.y(r6, r9)
            if (r10 != r0) goto L4a
            goto L5e
        L4a:
            r5 = r7
            r6 = r8
        L4c:
            r7 = r5
            r8 = r6
        L4e:
            r9.f0 = r8
            r9.X = r7
            r9.f44810Y = r2
            r9.Z = r1
            r9.e0 = r3
            java.lang.Object r10 = r7.b(r9)
            if (r10 != r0) goto L6b
        L5e:
            return r0
        L5f:
            int r1 = r9.Z
            kotlinx.coroutines.channels.ChannelIterator r7 = r9.X
            java.lang.Object r0 = r9.f0
            r8 = r0
            kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
            kotlin.ResultKt.b(r10)
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L76
            kotlin.Unit r10 = kotlin.Unit.f43263a
            return r10
        L76:
            java.lang.Object r10 = r7.next()
            int r0 = r1 + 1
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r1)
            r9.f0 = r8
            r9.X = r7
            r9.f44810Y = r10
            r9.Z = r0
            r9.e0 = r4
            throw r2
        L8c:
            kotlin.ResultKt.b(r10)
            java.lang.Object r10 = r9.f0
            kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
