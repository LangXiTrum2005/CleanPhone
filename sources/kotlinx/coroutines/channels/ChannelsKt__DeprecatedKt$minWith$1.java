package kotlinx.coroutines.channels;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {464, 466}, m = "minWith")
final class ChannelsKt__DeprecatedKt$minWith$1<E> extends ContinuationImpl {
    public Comparator X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ReceiveChannel f44823Y;
    public ChannelIterator Z;
    public Object e0;
    public /* synthetic */ Object f0;
    public int g0;

    /* JADX WARN: Code duplicated, block: B:23:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #2 {all -> 0x0084, blocks: (B:25:0x0068, B:27:0x0070), top: B:49:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0061 -> B:49:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r10.f0 = r11
            int r0 = r10.g0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r10.g0 = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            r2 = 0
            if (r0 == 0) goto L8e
            r3 = 1
            r4 = 2
            if (r0 == r3) goto L32
            if (r0 != r4) goto L2a
            java.lang.Object r0 = r10.e0
            kotlinx.coroutines.channels.ChannelIterator r3 = r10.Z
            kotlinx.coroutines.channels.ReceiveChannel r5 = r10.f44823Y
            java.util.Comparator r6 = r10.X
            kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L26
            r7 = r6
            r6 = r5
            r5 = r3
            r3 = r0
            r0 = r10
            goto L68
        L26:
            r11 = move-exception
            r2 = r5
            goto L93
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L32:
            kotlinx.coroutines.channels.ChannelIterator r0 = r10.Z
            kotlinx.coroutines.channels.ReceiveChannel r3 = r10.f44823Y
            java.util.Comparator r5 = r10.X
            kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L8b
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L8b
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L8b
            if (r11 != 0) goto L47
            r3.a(r2)
            return r2
        L47:
            java.lang.Object r11 = r0.next()     // Catch: java.lang.Throwable -> L8b
            r6 = r5
            r5 = r3
            r3 = r0
            r0 = r11
            r11 = r10
        L50:
            r11.X = r6     // Catch: java.lang.Throwable -> L26
            r11.f44823Y = r5     // Catch: java.lang.Throwable -> L26
            r11.Z = r3     // Catch: java.lang.Throwable -> L26
            r11.e0 = r0     // Catch: java.lang.Throwable -> L26
            r11.g0 = r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r7 = r3.b(r11)     // Catch: java.lang.Throwable -> L26
            if (r7 != r1) goto L61
            return r1
        L61:
            r9 = r0
            r0 = r11
            r11 = r7
            r7 = r6
            r6 = r5
            r5 = r3
            r3 = r9
        L68:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L84
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L87
            java.lang.Object r11 = r5.next()     // Catch: java.lang.Throwable -> L84
            int r8 = r7.compare(r3, r11)     // Catch: java.lang.Throwable -> L84
            if (r8 <= 0) goto L81
            r3 = r0
            r0 = r11
            r11 = r3
        L7d:
            r3 = r5
            r5 = r6
            r6 = r7
            goto L50
        L81:
            r11 = r0
            r0 = r3
            goto L7d
        L84:
            r11 = move-exception
            r2 = r6
            goto L93
        L87:
            r6.a(r2)
            return r3
        L8b:
            r11 = move-exception
            r2 = r3
            goto L93
        L8e:
            kotlin.ResultKt.b(r11)
            throw r2     // Catch: java.lang.Throwable -> L92
        L92:
            r11 = move-exception
        L93:
            throw r11     // Catch: java.lang.Throwable -> L94
        L94:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.a(r2, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
