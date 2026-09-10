package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", l = {102, 104, 105}, m = "fixedDelayTicker")
final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl {
    public SendChannel X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f44836Y;
    public int Z;

    /* JADX WARN: Code duplicated, block: B:19:0x004e A[PHI: r2
  0x004e: PHI (r2v2 kotlinx.coroutines.channels.SendChannel) = 
  (r2v1 kotlinx.coroutines.channels.SendChannel)
  (r2v3 kotlinx.coroutines.channels.SendChannel)
  (r2v4 kotlinx.coroutines.channels.SendChannel)
 binds: [B:17:0x004b, B:23:0x0063, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x005b A[PHI: r2
  0x005b: PHI (r2v3 kotlinx.coroutines.channels.SendChannel) = (r2v2 kotlinx.coroutines.channels.SendChannel), (r2v5 kotlinx.coroutines.channels.SendChannel) binds: [B:20:0x0058, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0063 -> B:19:0x004e). Please report as a decompilation issue!!! */
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
            r8.f44836Y = r9
            int r9 = r8.Z
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 | r0
            r8.Z = r9
            r1 = r9 & r0
            if (r1 == 0) goto L12
            int r9 = r9 - r0
            r8.Z = r9
            r9 = r8
            goto L17
        L12:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r9 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r9.<init>(r8)
        L17:
            java.lang.Object r0 = r9.f44836Y
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r2 = r9.Z
            r3 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L3f
            if (r2 == r7) goto L39
            if (r2 == r6) goto L33
            if (r2 != r5) goto L2b
            goto L39
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            kotlinx.coroutines.channels.SendChannel r2 = r9.X
            kotlin.ResultKt.b(r0)
            goto L5b
        L39:
            kotlinx.coroutines.channels.SendChannel r2 = r9.X
            kotlin.ResultKt.b(r0)
            goto L4e
        L3f:
            kotlin.ResultKt.b(r0)
            r2 = 0
            r9.X = r2
            r9.Z = r7
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.a(r3, r9)
            if (r0 != r1) goto L4e
            goto L65
        L4e:
            kotlin.Unit r0 = kotlin.Unit.f43263a
            r9.X = r2
            r9.Z = r6
            java.lang.Object r0 = r2.y(r0, r9)
            if (r0 != r1) goto L5b
            goto L65
        L5b:
            r9.X = r2
            r9.Z = r5
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.a(r3, r9)
            if (r0 != r1) goto L4e
        L65:
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
