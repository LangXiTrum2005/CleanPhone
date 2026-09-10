package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
final class DataStoreImpl$readDataOrHandleCorruption$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public Serializable X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f4635Y;
    public final /* synthetic */ Ref.ObjectRef Z;
    public final /* synthetic */ DataStoreImpl e0;
    public final /* synthetic */ Ref.IntRef f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataOrHandleCorruption$3(Ref.ObjectRef objectRef, DataStoreImpl dataStoreImpl, Ref.IntRef intRef, Continuation continuation) {
        super(1, continuation);
        this.Z = objectRef;
        this.e0 = dataStoreImpl;
        this.f0 = intRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataStoreImpl$readDataOrHandleCorruption$3(this.Z, this.e0, this.f0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((DataStoreImpl$readDataOrHandleCorruption$3) create((Continuation) obj)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r9 == r0) goto L29;
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
            int r1 = r8.f4635Y
            kotlin.jvm.internal.Ref$IntRef r2 = r8.f0
            kotlin.jvm.internal.Ref$ObjectRef r3 = r8.Z
            r4 = 3
            r5 = 2
            androidx.datastore.core.DataStoreImpl r6 = r8.e0
            r7 = 1
            if (r1 == 0) goto L36
            if (r1 == r7) goto L2e
            if (r1 == r5) goto L26
            if (r1 != r4) goto L1e
            java.io.Serializable r0 = r8.X
            r2 = r0
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref.IntRef) r2
            kotlin.ResultKt.b(r9)
            goto L6d
        L1e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L26:
            java.io.Serializable r1 = r8.X
            kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
            kotlin.ResultKt.b(r9)     // Catch: androidx.datastore.core.CorruptionException -> L60
            goto L57
        L2e:
            java.io.Serializable r1 = r8.X
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            kotlin.ResultKt.b(r9)     // Catch: androidx.datastore.core.CorruptionException -> L60
            goto L45
        L36:
            kotlin.ResultKt.b(r9)
            r8.X = r3     // Catch: androidx.datastore.core.CorruptionException -> L60
            r8.f4635Y = r7     // Catch: androidx.datastore.core.CorruptionException -> L60
            java.lang.Object r9 = r6.i(r8)     // Catch: androidx.datastore.core.CorruptionException -> L60
            if (r9 != r0) goto L44
            goto L6c
        L44:
            r1 = r3
        L45:
            r1.X = r9     // Catch: androidx.datastore.core.CorruptionException -> L60
            androidx.datastore.core.InterProcessCoordinator r9 = r6.g()     // Catch: androidx.datastore.core.CorruptionException -> L60
            r8.X = r2     // Catch: androidx.datastore.core.CorruptionException -> L60
            r8.f4635Y = r5     // Catch: androidx.datastore.core.CorruptionException -> L60
            java.lang.Object r9 = r9.c(r8)     // Catch: androidx.datastore.core.CorruptionException -> L60
            if (r9 != r0) goto L56
            goto L6c
        L56:
            r1 = r2
        L57:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: androidx.datastore.core.CorruptionException -> L60
            int r9 = r9.intValue()     // Catch: androidx.datastore.core.CorruptionException -> L60
            r1.X = r9     // Catch: androidx.datastore.core.CorruptionException -> L60
            goto L75
        L60:
            java.lang.Object r9 = r3.X
            r8.X = r2
            r8.f4635Y = r4
            java.lang.Object r9 = r6.j(r9, r7, r8)
            if (r9 != r0) goto L6d
        L6c:
            return r0
        L6d:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r2.X = r9
        L75:
            kotlin.Unit r9 = kotlin.Unit.f43263a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
