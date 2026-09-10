package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514, 272}, m = "filterNotNullTo")
final class ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends SendChannel<? super E>> extends ContinuationImpl {
    public SendChannel X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ReceiveChannel f44812Y;
    public ChannelIterator Z;
    public /* synthetic */ Object e0;
    public int f0;

    /* JADX WARN: Code duplicated, block: B:16:0x0035 A[Catch: all -> 0x0020, PHI: r0 r5 r6 r7 r9
  0x0035: PHI (r0v5 kotlinx.coroutines.channels.ChannelIterator) = (r0v4 kotlinx.coroutines.channels.ChannelIterator), (r0v6 kotlinx.coroutines.channels.ChannelIterator) binds: [B:15:0x0031, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r5v2 kotlinx.coroutines.channels.ReceiveChannel) = (r5v1 kotlinx.coroutines.channels.ReceiveChannel), (r5v3 kotlinx.coroutines.channels.ReceiveChannel) binds: [B:15:0x0031, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r6v1 kotlinx.coroutines.channels.SendChannel) = (r6v0 kotlinx.coroutines.channels.SendChannel), (r6v2 kotlinx.coroutines.channels.SendChannel) binds: [B:15:0x0031, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r7v1 kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends kotlinx.coroutines.channels.SendChannel<? super E>>) = 
  (r7v0 kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends kotlinx.coroutines.channels.SendChannel<? super E>>)
  (r7v2 kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends kotlinx.coroutines.channels.SendChannel<? super E>>)
 binds: [B:15:0x0031, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r9v4 java.lang.Object) = (r9v0 java.lang.Object), (r9v9 java.lang.Object) binds: [B:15:0x0031, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0020, blocks: (B:8:0x001b, B:23:0x0052, B:16:0x0035, B:18:0x003d, B:20:0x0043, B:15:0x0031), top: B:35:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x003d A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x001b, B:23:0x0052, B:16:0x0035, B:18:0x003d, B:20:0x0043, B:15:0x0031), top: B:35:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0043 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x001b, B:23:0x0052, B:16:0x0035, B:18:0x003d, B:20:0x0043, B:15:0x0031), top: B:35:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052 A[Catch: all -> 0x0020, PHI: r0 r5 r6 r7
  0x0052: PHI (r0v6 kotlinx.coroutines.channels.ChannelIterator) = 
  (r0v5 kotlinx.coroutines.channels.ChannelIterator)
  (r0v5 kotlinx.coroutines.channels.ChannelIterator)
  (r0v8 kotlinx.coroutines.channels.ChannelIterator)
 binds: [B:19:0x0041, B:21:0x004f, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r5v3 kotlinx.coroutines.channels.ReceiveChannel) = 
  (r5v2 kotlinx.coroutines.channels.ReceiveChannel)
  (r5v2 kotlinx.coroutines.channels.ReceiveChannel)
  (r5v4 kotlinx.coroutines.channels.ReceiveChannel)
 binds: [B:19:0x0041, B:21:0x004f, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r6v2 kotlinx.coroutines.channels.SendChannel) = 
  (r6v1 kotlinx.coroutines.channels.SendChannel)
  (r6v1 kotlinx.coroutines.channels.SendChannel)
  (r6v3 kotlinx.coroutines.channels.SendChannel)
 binds: [B:19:0x0041, B:21:0x004f, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r7v2 kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends kotlinx.coroutines.channels.SendChannel<? super E>>) = 
  (r7v1 kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends kotlinx.coroutines.channels.SendChannel<? super E>>)
  (r7v1 kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends kotlinx.coroutines.channels.SendChannel<? super E>>)
  (r7v3 kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends kotlinx.coroutines.channels.SendChannel<? super E>>)
 binds: [B:19:0x0041, B:21:0x004f, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x001b, B:23:0x0052, B:16:0x0035, B:18:0x003d, B:20:0x0043, B:15:0x0031), top: B:35:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:23:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004f -> B:23:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r8.e0 = r9
            int r0 = r8.f0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r8.f0 = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            r2 = 0
            if (r0 == 0) goto L65
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L2b
            if (r0 != r3) goto L23
            kotlinx.coroutines.channels.ChannelIterator r0 = r8.Z
            kotlinx.coroutines.channels.ReceiveChannel r5 = r8.f44812Y
            kotlinx.coroutines.channels.SendChannel r6 = r8.X
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L20
            r7 = r8
            goto L52
        L20:
            r9 = move-exception
            r2 = r5
            goto L6a
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2b:
            kotlinx.coroutines.channels.ChannelIterator r0 = r8.Z
            kotlinx.coroutines.channels.ReceiveChannel r5 = r8.f44812Y
            kotlinx.coroutines.channels.SendChannel r6 = r8.X
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L20
            r7 = r8
        L35:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L20
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r9 == 0) goto L61
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> L20
            if (r9 == 0) goto L52
            r7.X = r6     // Catch: java.lang.Throwable -> L20
            r7.f44812Y = r5     // Catch: java.lang.Throwable -> L20
            r7.Z = r0     // Catch: java.lang.Throwable -> L20
            r7.f0 = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Object r9 = r6.y(r9, r7)     // Catch: java.lang.Throwable -> L20
            if (r9 != r1) goto L52
            goto L60
        L52:
            r7.X = r6     // Catch: java.lang.Throwable -> L20
            r7.f44812Y = r5     // Catch: java.lang.Throwable -> L20
            r7.Z = r0     // Catch: java.lang.Throwable -> L20
            r7.f0 = r4     // Catch: java.lang.Throwable -> L20
            java.lang.Object r9 = r0.b(r7)     // Catch: java.lang.Throwable -> L20
            if (r9 != r1) goto L35
        L60:
            return r1
        L61:
            r5.a(r2)
            return r6
        L65:
            kotlin.ResultKt.b(r9)
            throw r2     // Catch: java.lang.Throwable -> L69
        L69:
            r9 = move-exception
        L6a:
            throw r9     // Catch: java.lang.Throwable -> L6b
        L6b:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.a(r2, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
