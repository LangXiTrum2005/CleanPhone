package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", l = {514, 363, 363}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$map$1 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {
    public Function2 X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ReceiveChannel f44820Y;
    public ChannelIterator Z;
    public ProducerScope e0;
    public int f0;
    public /* synthetic */ Object g0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$map$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051 A[Catch: all -> 0x0021, PHI: r1 r6 r7 r8 r12
  0x0051: PHI (r1v4 kotlinx.coroutines.channels.ChannelIterator) = (r1v1 kotlinx.coroutines.channels.ChannelIterator), (r1v6 kotlinx.coroutines.channels.ChannelIterator) binds: [B:21:0x004e, B:33:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r6v6 kotlinx.coroutines.channels.ReceiveChannel) = (r6v2 kotlinx.coroutines.channels.ReceiveChannel), (r6v8 kotlinx.coroutines.channels.ReceiveChannel) binds: [B:21:0x004e, B:33:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r7v5 kotlin.jvm.functions.Function2) = (r7v1 kotlin.jvm.functions.Function2), (r7v7 kotlin.jvm.functions.Function2) binds: [B:21:0x004e, B:33:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r8v4 kotlinx.coroutines.channels.ProducerScope) = (r8v1 kotlinx.coroutines.channels.ProducerScope), (r8v6 kotlinx.coroutines.channels.ProducerScope) binds: [B:21:0x004e, B:33:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r12v8 java.lang.Object) = (r12v0 java.lang.Object), (r12v16 java.lang.Object) binds: [B:21:0x004e, B:33:0x00a3] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0021, blocks: (B:9:0x001c, B:32:0x0092, B:22:0x0051, B:24:0x0059, B:21:0x004e), top: B:43:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:9:0x001c, B:32:0x0092, B:22:0x0051, B:24:0x0059, B:21:0x004e), top: B:43:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008e -> B:32:0x0092). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r1 = r11.f0
            r2 = 0
            if (r1 == 0) goto Lb2
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == r5) goto L42
            if (r1 == r4) goto L2c
            if (r1 != r3) goto L24
            kotlinx.coroutines.channels.ChannelIterator r1 = r11.Z
            kotlinx.coroutines.channels.ReceiveChannel r6 = r11.f44820Y
            kotlin.jvm.functions.Function2 r7 = r11.X
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r8 = r11.g0
            kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
            kotlin.ResultKt.b(r12)     // Catch: java.lang.Throwable -> L21
            goto L92
        L21:
            r12 = move-exception
            goto Lac
        L24:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2c:
            kotlinx.coroutines.channels.ProducerScope r1 = r11.e0
            kotlinx.coroutines.channels.ChannelIterator r6 = r11.Z
            kotlinx.coroutines.channels.ReceiveChannel r7 = r11.f44820Y
            kotlin.jvm.functions.Function2 r8 = r11.X
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r9 = r11.g0
            kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
            kotlin.ResultKt.b(r12)     // Catch: java.lang.Throwable -> L3e
            goto L78
        L3e:
            r12 = move-exception
            r6 = r7
            goto Lac
        L42:
            kotlinx.coroutines.channels.ChannelIterator r1 = r11.Z
            kotlinx.coroutines.channels.ReceiveChannel r6 = r11.f44820Y
            kotlin.jvm.functions.Function2 r7 = r11.X
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r8 = r11.g0
            kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
            kotlin.ResultKt.b(r12)     // Catch: java.lang.Throwable -> L21
        L51:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L21
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L21
            if (r12 == 0) goto La6
            java.lang.Object r12 = r1.next()     // Catch: java.lang.Throwable -> L21
            r11.g0 = r8     // Catch: java.lang.Throwable -> L21
            r9 = r7
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9     // Catch: java.lang.Throwable -> L21
            r11.X = r9     // Catch: java.lang.Throwable -> L21
            r11.f44820Y = r6     // Catch: java.lang.Throwable -> L21
            r11.Z = r1     // Catch: java.lang.Throwable -> L21
            r11.e0 = r8     // Catch: java.lang.Throwable -> L21
            r11.f0 = r4     // Catch: java.lang.Throwable -> L21
            java.lang.Object r12 = r7.invoke(r12, r11)     // Catch: java.lang.Throwable -> L21
            if (r12 != r0) goto L73
            goto La5
        L73:
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r9
        L78:
            r11.g0 = r9     // Catch: java.lang.Throwable -> L3e
            r10 = r8
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10     // Catch: java.lang.Throwable -> L3e
            r11.X = r10     // Catch: java.lang.Throwable -> L3e
            r11.f44820Y = r7     // Catch: java.lang.Throwable -> L3e
            r11.Z = r6     // Catch: java.lang.Throwable -> L3e
            r11.e0 = r2     // Catch: java.lang.Throwable -> L3e
            r11.f0 = r3     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r12 = r1.y(r12, r11)     // Catch: java.lang.Throwable -> L3e
            if (r12 != r0) goto L8e
            goto La5
        L8e:
            r1 = r6
            r6 = r7
            r7 = r8
            r8 = r9
        L92:
            r11.g0 = r8     // Catch: java.lang.Throwable -> L21
            r12 = r7
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12     // Catch: java.lang.Throwable -> L21
            r11.X = r12     // Catch: java.lang.Throwable -> L21
            r11.f44820Y = r6     // Catch: java.lang.Throwable -> L21
            r11.Z = r1     // Catch: java.lang.Throwable -> L21
            r11.f0 = r5     // Catch: java.lang.Throwable -> L21
            java.lang.Object r12 = r1.b(r11)     // Catch: java.lang.Throwable -> L21
            if (r12 != r0) goto L51
        La5:
            return r0
        La6:
            r6.a(r2)
            kotlin.Unit r12 = kotlin.Unit.f43263a
            return r12
        Lac:
            throw r12     // Catch: java.lang.Throwable -> Lad
        Lad:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.a(r6, r12)
            throw r0
        Lb2:
            kotlin.ResultKt.b(r12)
            java.lang.Object r12 = r11.g0
            kotlinx.coroutines.channels.ProducerScope r12 = (kotlinx.coroutines.channels.ProducerScope) r12
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
