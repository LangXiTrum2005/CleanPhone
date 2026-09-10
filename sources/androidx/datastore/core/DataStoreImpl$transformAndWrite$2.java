package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
final class DataStoreImpl$transformAndWrite$2 extends SuspendLambda implements Function1<Continuation<Object>, Object> {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f4637Y;
    public final /* synthetic */ DataStoreImpl Z;
    public final /* synthetic */ CoroutineContext e0;
    public final /* synthetic */ SuspendLambda f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreImpl$transformAndWrite$2(DataStoreImpl dataStoreImpl, CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        super(1, continuation);
        this.Z = dataStoreImpl;
        this.e0 = coroutineContext;
        this.f0 = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataStoreImpl$transformAndWrite$2(this.Z, this.e0, this.f0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((DataStoreImpl$transformAndWrite$2) create((Continuation) obj)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Data data;
        Object obj2;
        int iHashCode;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.f4637Y;
        DataStoreImpl dataStoreImpl = this.Z;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.f4637Y = 1;
            obj = DataStoreImpl.f(dataStoreImpl, true, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj3 = this.X;
                ResultKt.b(obj);
                return obj3;
            }
            data = (Data) this.X;
            ResultKt.b(obj);
        }
        obj2 = data.f4599b;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        if (iHashCode == data.f4600c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        if (!Intrinsics.a(data.f4599b, obj)) {
            this.X = obj;
            this.f4637Y = 3;
            if (dataStoreImpl.j(obj, true, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
        data = (Data) obj;
        DataStoreImpl$transformAndWrite$2$newData$1 dataStoreImpl$transformAndWrite$2$newData$1 = new DataStoreImpl$transformAndWrite$2$newData$1(this.f0, data, null);
        this.X = data;
        this.f4637Y = 2;
        obj = BuildersKt.f(this.e0, dataStoreImpl$transformAndWrite$2$newData$1, this);
        if (obj != coroutineSingletons) {
            obj2 = data.f4599b;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            if (iHashCode == data.f4600c) {
                throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            }
            if (!Intrinsics.a(data.f4599b, obj)) {
                this.X = obj;
                this.f4637Y = 3;
                if (dataStoreImpl.j(obj, true, this) == coroutineSingletons) {
                }
            }
            return obj;
        }
        return coroutineSingletons;
    }
}
