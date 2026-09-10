package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", l = {284, 285}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$take$1 extends SuspendLambda implements Function2 {
    public ChannelIterator X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f44827Y;
    public int Z;
    public /* synthetic */ Object e0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$take$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d A[PHI: r1 r5 r6 r8
  0x002d: PHI (r1v2 int) = (r1v1 int), (r1v4 int) binds: [B:10:0x0022, B:20:0x0059] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r5v1 kotlinx.coroutines.channels.ChannelIterator) = (r5v0 kotlinx.coroutines.channels.ChannelIterator), (r5v2 kotlinx.coroutines.channels.ChannelIterator) binds: [B:10:0x0022, B:20:0x0059] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r6v2 kotlinx.coroutines.channels.ProducerScope) = (r6v1 kotlinx.coroutines.channels.ProducerScope), (r6v3 kotlinx.coroutines.channels.ProducerScope) binds: [B:10:0x0022, B:20:0x0059] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r8v4 java.lang.Object) = (r8v0 java.lang.Object), (r8v9 java.lang.Object) binds: [B:10:0x0022, B:20:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x0048 A[PHI: r1 r5 r6
  0x0048: PHI (r1v3 int) = (r1v2 int), (r1v5 int) binds: [B:14:0x0045, B:7:0x000e] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r5v2 kotlinx.coroutines.channels.ChannelIterator) = (r5v1 kotlinx.coroutines.channels.ChannelIterator), (r5v3 kotlinx.coroutines.channels.ChannelIterator) binds: [B:14:0x0045, B:7:0x000e] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r6v3 kotlinx.coroutines.channels.ProducerScope) = (r6v2 kotlinx.coroutines.channels.ProducerScope), (r6v5 kotlinx.coroutines.channels.ProducerScope) binds: [B:14:0x0045, B:7:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:16:0x0048). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r1 = r7.Z
            kotlin.Unit r2 = kotlin.Unit.f43263a
            if (r1 == 0) goto L5d
            r3 = 2
            r4 = 1
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            int r1 = r7.f44827Y
            kotlinx.coroutines.channels.ChannelIterator r5 = r7.X
            java.lang.Object r6 = r7.e0
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.b(r8)
            goto L48
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L22:
            int r1 = r7.f44827Y
            kotlinx.coroutines.channels.ChannelIterator r5 = r7.X
            java.lang.Object r6 = r7.e0
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.b(r8)
        L2d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5c
            java.lang.Object r8 = r5.next()
            r7.e0 = r6
            r7.X = r5
            r7.f44827Y = r1
            r7.Z = r3
            java.lang.Object r8 = r6.y(r8, r7)
            if (r8 != r0) goto L48
            goto L5b
        L48:
            int r1 = r1 + (-1)
            if (r1 != 0) goto L4d
            goto L5c
        L4d:
            r7.e0 = r6
            r7.X = r5
            r7.f44827Y = r1
            r7.Z = r4
            java.lang.Object r8 = r5.b(r7)
            if (r8 != r0) goto L2d
        L5b:
            return r0
        L5c:
            return r2
        L5d:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.e0
            kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
