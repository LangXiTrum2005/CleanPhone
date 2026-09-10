package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", l = {299, 300, 301}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$takeWhile$1 extends SuspendLambda implements Function2 {
    public ChannelIterator X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f44828Y;
    public int Z;
    public /* synthetic */ Object e0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$takeWhile$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
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
            int r1 = r9.Z
            kotlin.Unit r2 = kotlin.Unit.f43263a
            r3 = 0
            if (r1 == 0) goto L76
            r4 = 2
            r5 = 1
            if (r1 == r5) goto L56
            r6 = 3
            if (r1 == r4) goto L24
            if (r1 != r6) goto L1c
            kotlinx.coroutines.channels.ChannelIterator r1 = r9.X
            java.lang.Object r6 = r9.e0
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.b(r10)
            goto L49
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            java.lang.Object r1 = r9.f44828Y
            kotlinx.coroutines.channels.ChannelIterator r7 = r9.X
            java.lang.Object r8 = r9.e0
            kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
            kotlin.ResultKt.b(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L38
            goto L68
        L38:
            r9.e0 = r8
            r9.X = r7
            r9.f44828Y = r3
            r9.Z = r6
            java.lang.Object r10 = r8.y(r1, r9)
            if (r10 != r0) goto L47
            goto L55
        L47:
            r1 = r7
            r6 = r8
        L49:
            r9.e0 = r6
            r9.X = r1
            r9.Z = r5
            java.lang.Object r10 = r1.b(r9)
            if (r10 != r0) goto L60
        L55:
            return r0
        L56:
            kotlinx.coroutines.channels.ChannelIterator r1 = r9.X
            java.lang.Object r0 = r9.e0
            r6 = r0
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.b(r10)
        L60:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L69
        L68:
            return r2
        L69:
            java.lang.Object r10 = r1.next()
            r9.e0 = r6
            r9.X = r1
            r9.f44828Y = r10
            r9.Z = r4
            throw r3
        L76:
            kotlin.ResultKt.b(r10)
            java.lang.Object r10 = r9.e0
            kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
