package androidx.datastore.core;

import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", l = {84, 85}, m = "invokeSuspend")
final class MulticastFileObserver$Companion$observe$1 extends SuspendLambda implements Function2<ProducerScope<? super Unit>, Continuation<? super Unit>, Object> {
    public a X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f4675Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ File e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1(File file, Continuation continuation) {
        super(2, continuation);
        this.e0 = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new MulticastFileObserver$Companion$observe$1(this.e0, continuation);
        multicastFileObserver$Companion$observe$1.Z = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MulticastFileObserver$Companion$observe$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if (kotlinx.coroutines.channels.ProduceKt.a(r3, r9, r8) == r0) goto L27;
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
            int r1 = r8.f4675Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.b(r9)
            goto L9a
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            androidx.datastore.core.a r1 = r8.X
            java.lang.Object r3 = r8.Z
            kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
            kotlin.ResultKt.b(r9)
            goto L87
        L23:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.Z
            kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
            androidx.datastore.core.MulticastFileObserver$Companion$observe$1$flowObserver$1 r1 = new androidx.datastore.core.MulticastFileObserver$Companion$observe$1$flowObserver$1
            java.io.File r4 = r8.e0
            r1.<init>()
            java.lang.Object r5 = androidx.datastore.core.MulticastFileObserver.f4672b
            java.io.File r4 = r4.getParentFile()
            kotlin.jvm.internal.Intrinsics.c(r4)
            java.io.File r4 = r4.getCanonicalFile()
            java.lang.String r4 = r4.getPath()
            java.lang.Object r5 = androidx.datastore.core.MulticastFileObserver.f4672b
            monitor-enter(r5)
            java.util.LinkedHashMap r6 = androidx.datastore.core.MulticastFileObserver.f4673c     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = "key"
            kotlin.jvm.internal.Intrinsics.e(r4, r7)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r7 = r6.get(r4)     // Catch: java.lang.Throwable -> L5b
            if (r7 != 0) goto L5d
            androidx.datastore.core.MulticastFileObserver r7 = new androidx.datastore.core.MulticastFileObserver     // Catch: java.lang.Throwable -> L5b
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L5b
            r6.put(r4, r7)     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r9 = move-exception
            goto L9d
        L5d:
            androidx.datastore.core.MulticastFileObserver r7 = (androidx.datastore.core.MulticastFileObserver) r7     // Catch: java.lang.Throwable -> L5b
            java.util.concurrent.CopyOnWriteArrayList r6 = r7.f4674a     // Catch: java.lang.Throwable -> L5b
            r6.add(r1)     // Catch: java.lang.Throwable -> L5b
            java.util.concurrent.CopyOnWriteArrayList r6 = r7.f4674a     // Catch: java.lang.Throwable -> L5b
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L5b
            if (r6 != r3) goto L6f
            r7.startWatching()     // Catch: java.lang.Throwable -> L5b
        L6f:
            monitor-exit(r5)
            androidx.datastore.core.a r5 = new androidx.datastore.core.a
            r6 = 0
            r5.<init>(r6, r4, r1)
            kotlin.Unit r1 = kotlin.Unit.f43263a
            r8.Z = r9
            r8.X = r5
            r8.f4675Y = r3
            java.lang.Object r1 = r9.y(r1, r8)
            if (r1 != r0) goto L85
            goto L99
        L85:
            r3 = r9
            r1 = r5
        L87:
            androidx.datastore.core.MulticastFileObserver$Companion$observe$1$1 r9 = new androidx.datastore.core.MulticastFileObserver$Companion$observe$1$1
            r9.<init>()
            r1 = 0
            r8.Z = r1
            r8.X = r1
            r8.f4675Y = r2
            java.lang.Object r9 = kotlinx.coroutines.channels.ProduceKt.a(r3, r9, r8)
            if (r9 != r0) goto L9a
        L99:
            return r0
        L9a:
            kotlin.Unit r9 = kotlin.Unit.f43263a
            return r9
        L9d:
            monitor-exit(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MulticastFileObserver$Companion$observe$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
