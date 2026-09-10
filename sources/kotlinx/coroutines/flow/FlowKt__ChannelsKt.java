package kotlinx.coroutines.flow;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ChannelsKt {
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002e, B:25:0x0055, B:29:0x006a, B:31:0x0072, B:20:0x0046, B:24:0x0051), top: B:47:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0084 -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(kotlinx.coroutines.flow.FlowCollector r6, kotlinx.coroutines.channels.ReceiveChannel r7, boolean r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.g0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g0 = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r2 = r0.g0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.e0
            kotlinx.coroutines.channels.ChannelIterator r6 = r0.Z
            kotlinx.coroutines.channels.ReceiveChannel r7 = r0.f44871Y
            kotlinx.coroutines.flow.FlowCollector r2 = r0.X
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L34
        L31:
            r9 = r6
            r6 = r2
            goto L55
        L34:
            r6 = move-exception
            goto L90
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            boolean r8 = r0.e0
            kotlinx.coroutines.channels.ChannelIterator r6 = r0.Z
            kotlinx.coroutines.channels.ReceiveChannel r7 = r0.f44871Y
            kotlinx.coroutines.flow.FlowCollector r2 = r0.X
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L34
            goto L6a
        L4a:
            kotlin.ResultKt.b(r9)
            boolean r9 = r6 instanceof kotlinx.coroutines.flow.ThrowingCollector
            if (r9 != 0) goto L98
            kotlinx.coroutines.channels.ChannelIterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L34
        L55:
            r0.X = r6     // Catch: java.lang.Throwable -> L34
            r0.f44871Y = r7     // Catch: java.lang.Throwable -> L34
            r0.Z = r9     // Catch: java.lang.Throwable -> L34
            r0.e0 = r8     // Catch: java.lang.Throwable -> L34
            r0.g0 = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r9.b(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L66
            goto L86
        L66:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L87
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L34
            r0.X = r2     // Catch: java.lang.Throwable -> L34
            r0.f44871Y = r7     // Catch: java.lang.Throwable -> L34
            r0.Z = r6     // Catch: java.lang.Throwable -> L34
            r0.e0 = r8     // Catch: java.lang.Throwable -> L34
            r0.g0 = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L34
            if (r9 != r1) goto L31
        L86:
            return r1
        L87:
            if (r8 == 0) goto L8d
            r6 = 0
            r7.a(r6)
        L8d:
            kotlin.Unit r6 = kotlin.Unit.f43263a
            return r6
        L90:
            throw r6     // Catch: java.lang.Throwable -> L91
        L91:
            r9 = move-exception
            if (r8 == 0) goto L97
            kotlinx.coroutines.channels.ChannelsKt.a(r7, r6)
        L97:
            throw r9
        L98:
            kotlinx.coroutines.flow.ThrowingCollector r6 = (kotlinx.coroutines.flow.ThrowingCollector) r6
            java.lang.Throwable r6 = r6.X
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.a(kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.channels.ReceiveChannel, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
