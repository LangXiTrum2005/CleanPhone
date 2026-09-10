package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/WriteScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
final class DataStoreImpl$writeData$2 extends SuspendLambda implements Function2<WriteScope<Object>, Continuation<? super Unit>, Object> {
    public Ref.IntRef X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f4642Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ Ref.IntRef e0;
    public final /* synthetic */ DataStoreImpl f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ boolean h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeData$2(Ref.IntRef intRef, DataStoreImpl dataStoreImpl, Object obj, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.e0 = intRef;
        this.f0 = dataStoreImpl;
        this.g0 = obj;
        this.h0 = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(this.e0, this.f0, this.g0, this.h0, continuation);
        dataStoreImpl$writeData$2.Z = obj;
        return dataStoreImpl$writeData$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreImpl$writeData$2) create((WriteScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r6.d(r3, r7) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r1 = r7.f4642Y
            kotlin.jvm.internal.Ref$IntRef r2 = r7.e0
            java.lang.Object r3 = r7.g0
            androidx.datastore.core.DataStoreImpl r4 = r7.f0
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            kotlin.ResultKt.b(r8)
            goto L59
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            kotlin.jvm.internal.Ref$IntRef r1 = r7.X
            java.lang.Object r6 = r7.Z
            androidx.datastore.core.WriteScope r6 = (androidx.datastore.core.WriteScope) r6
            kotlin.ResultKt.b(r8)
            goto L43
        L28:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.Z
            androidx.datastore.core.WriteScope r8 = (androidx.datastore.core.WriteScope) r8
            androidx.datastore.core.InterProcessCoordinator r1 = r4.g()
            r7.Z = r8
            r7.X = r2
            r7.f4642Y = r6
            java.lang.Object r1 = r1.e(r7)
            if (r1 != r0) goto L40
            goto L58
        L40:
            r6 = r8
            r8 = r1
            r1 = r2
        L43:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.X = r8
            r8 = 0
            r7.Z = r8
            r7.X = r8
            r7.f4642Y = r5
            java.lang.Object r8 = r6.d(r3, r7)
            if (r8 != r0) goto L59
        L58:
            return r0
        L59:
            boolean r8 = r7.h0
            if (r8 == 0) goto L71
            androidx.datastore.core.DataStoreInMemoryCache r8 = r4.f4609h
            androidx.datastore.core.Data r0 = new androidx.datastore.core.Data
            if (r3 == 0) goto L68
            int r1 = r3.hashCode()
            goto L69
        L68:
            r1 = 0
        L69:
            int r2 = r2.X
            r0.<init>(r3, r1, r2)
            r8.b(r0)
        L71:
            kotlin.Unit r8 = kotlin.Unit.f43263a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$writeData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
