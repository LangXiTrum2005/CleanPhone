package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
@DebugMetadata(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", l = {34}, m = "whileSelect")
final class WhileSelectKt$whileSelect$1 extends ContinuationImpl {
    public Function1 X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f45100Y;
    public int Z;

    /* JADX WARN: Code duplicated, block: B:11:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0043 -> B:13:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            r6.f45100Y = r7
            int r0 = r6.Z
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r6.Z = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L1b
            kotlin.jvm.functions.Function1 r0 = r6.X
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlin.ResultKt.b(r7)
            r3 = r0
            r0 = r6
            goto L47
        L1b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L23:
            kotlin.ResultKt.b(r7)
            r7 = 0
            r0 = r7
            r7 = r6
        L29:
            kotlinx.coroutines.selects.SelectImplementation r3 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r4 = r7.getF45023Y()
            r3.<init>(r4)
            r0.invoke(r3)
            r4 = r0
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r7.X = r4
            r7.Z = r2
            java.lang.Object r3 = r3.g(r7)
            if (r3 != r1) goto L43
            return r1
        L43:
            r5 = r0
            r0 = r7
            r7 = r3
            r3 = r5
        L47:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L52
            kotlin.Unit r7 = kotlin.Unit.f43263a
            return r7
        L52:
            r7 = r0
            r0 = r3
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
