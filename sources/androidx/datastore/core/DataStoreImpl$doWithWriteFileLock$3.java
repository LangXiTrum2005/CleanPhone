package androidx.datastore.core;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "R", RequestConfiguration.MAX_AD_CONTENT_RATING_T}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {TTAdConstant.PACKAGE_NAME_CODE}, m = "invokeSuspend")
final class DataStoreImpl$doWithWriteFileLock$3 extends SuspendLambda implements Function1<Continuation<Object>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Function1 f4625Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$doWithWriteFileLock$3(Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.f4625Y = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataStoreImpl$doWithWriteFileLock$3(this.f4625Y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((DataStoreImpl$doWithWriteFileLock$3) create((Continuation) obj)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        this.X = 1;
        Object objInvoke = ((DataStoreImpl$readDataOrHandleCorruption$3) this.f4625Y).invoke(this);
        return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
    }
}
