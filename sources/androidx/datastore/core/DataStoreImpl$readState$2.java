package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/core/State;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "invokeSuspend")
final class DataStoreImpl$readState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super State<Object>>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ DataStoreImpl f4636Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readState$2(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(2, continuation);
        this.f4636Y = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DataStoreImpl$readState$2(this.f4636Y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreImpl$readState$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r1 = r5.X
            r2 = 2
            r3 = 1
            androidx.datastore.core.DataStoreImpl r4 = r5.f4636Y
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.b(r6)
            goto L47
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L1e
            goto L3d
        L1e:
            r6 = move-exception
            goto L4a
        L20:
            kotlin.ResultKt.b(r6)
            androidx.datastore.core.DataStoreInMemoryCache r6 = r4.f4609h
            androidx.datastore.core.State r6 = r6.a()
            boolean r6 = r6 instanceof androidx.datastore.core.Final
            if (r6 == 0) goto L34
            androidx.datastore.core.DataStoreInMemoryCache r6 = r4.f4609h
            androidx.datastore.core.State r6 = r6.a()
            return r6
        L34:
            r5.X = r3     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r6 = r4.h(r5)     // Catch: java.lang.Throwable -> L1e
            if (r6 != r0) goto L3d
            goto L46
        L3d:
            r5.X = r2
            r6 = 0
            java.lang.Object r6 = androidx.datastore.core.DataStoreImpl.e(r4, r6, r5)
            if (r6 != r0) goto L47
        L46:
            return r0
        L47:
            androidx.datastore.core.State r6 = (androidx.datastore.core.State) r6
            return r6
        L4a:
            androidx.datastore.core.ReadException r0 = new androidx.datastore.core.ReadException
            r1 = -1
            r0.<init>(r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$readState$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
