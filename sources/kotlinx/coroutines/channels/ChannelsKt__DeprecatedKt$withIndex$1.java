package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/collections/IndexedValue;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", l = {400, 401}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$withIndex$1 extends SuspendLambda implements Function2 {
    public ChannelIterator X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f44832Y;
    public int Z;
    public /* synthetic */ Object e0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$withIndex$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r1 r4 r5 r9
  0x002b: PHI (r1v2 int) = (r1v1 int), (r1v4 int) binds: [B:10:0x0020, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r4v1 kotlinx.coroutines.channels.ChannelIterator) = (r4v0 kotlinx.coroutines.channels.ChannelIterator), (r4v2 kotlinx.coroutines.channels.ChannelIterator) binds: [B:10:0x0020, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r5v2 kotlinx.coroutines.channels.ProducerScope) = (r5v1 kotlinx.coroutines.channels.ProducerScope), (r5v3 kotlinx.coroutines.channels.ProducerScope) binds: [B:10:0x0020, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r9v4 java.lang.Object) = (r9v0 java.lang.Object), (r9v10 java.lang.Object) binds: [B:10:0x0020, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004d -> B:17:0x004e). Please report as a decompilation issue!!! */
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r1 = r8.Z
            if (r1 == 0) goto L60
            r2 = 1
            r3 = 2
            if (r1 == r2) goto L20
            if (r1 != r3) goto L18
            int r1 = r8.f44832Y
            kotlinx.coroutines.channels.ChannelIterator r4 = r8.X
            java.lang.Object r5 = r8.e0
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.b(r9)
            goto L4e
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            int r1 = r8.f44832Y
            kotlinx.coroutines.channels.ChannelIterator r4 = r8.X
            java.lang.Object r5 = r8.e0
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.b(r9)
        L2b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L5d
            java.lang.Object r9 = r4.next()
            kotlin.collections.IndexedValue r6 = new kotlin.collections.IndexedValue
            int r7 = r1 + 1
            r6.<init>(r1, r9)
            r8.e0 = r5
            r8.X = r4
            r8.f44832Y = r7
            r8.Z = r3
            java.lang.Object r9 = r5.y(r6, r8)
            if (r9 != r0) goto L4d
            goto L5c
        L4d:
            r1 = r7
        L4e:
            r8.e0 = r5
            r8.X = r4
            r8.f44832Y = r1
            r8.Z = r2
            java.lang.Object r9 = r4.b(r8)
            if (r9 != r0) goto L2b
        L5c:
            return r0
        L5d:
            kotlin.Unit r9 = kotlin.Unit.f43263a
            return r9
        L60:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.e0
            kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
