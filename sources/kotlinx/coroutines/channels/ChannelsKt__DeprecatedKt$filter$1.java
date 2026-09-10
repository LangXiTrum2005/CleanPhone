package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", l = {228, 229, 229}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$filter$1 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {
    public ChannelIterator X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f44809Y;
    public int Z;
    public /* synthetic */ Object e0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$filter$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r9 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r1 = r8.Z
            r2 = 0
            if (r1 == 0) goto L79
            r3 = 2
            r4 = 1
            if (r1 == r4) goto L57
            r5 = 3
            if (r1 == r3) goto L22
            if (r1 != r5) goto L1a
            kotlinx.coroutines.channels.ChannelIterator r1 = r8.X
            java.lang.Object r5 = r8.e0
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.b(r9)
            goto L46
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            java.lang.Object r1 = r8.f44809Y
            kotlinx.coroutines.channels.ChannelIterator r6 = r8.X
            java.lang.Object r7 = r8.e0
            kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
            kotlin.ResultKt.b(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L48
            r8.e0 = r7
            r8.X = r6
            r8.f44809Y = r2
            r8.Z = r5
            java.lang.Object r9 = r7.y(r1, r8)
            if (r9 != r0) goto L44
            goto L56
        L44:
            r1 = r6
            r5 = r7
        L46:
            r6 = r1
            r7 = r5
        L48:
            r8.e0 = r7
            r8.X = r6
            r8.f44809Y = r2
            r8.Z = r4
            java.lang.Object r9 = r6.b(r8)
            if (r9 != r0) goto L61
        L56:
            return r0
        L57:
            kotlinx.coroutines.channels.ChannelIterator r6 = r8.X
            java.lang.Object r0 = r8.e0
            r7 = r0
            kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
            kotlin.ResultKt.b(r9)
        L61:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L6c
            kotlin.Unit r9 = kotlin.Unit.f43263a
            return r9
        L6c:
            java.lang.Object r9 = r6.next()
            r8.e0 = r7
            r8.X = r6
            r8.f44809Y = r9
            r8.Z = r3
            throw r2
        L79:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.e0
            kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
