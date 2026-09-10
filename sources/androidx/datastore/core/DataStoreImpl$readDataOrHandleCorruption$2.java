package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "locked", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
final class DataStoreImpl$readDataOrHandleCorruption$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Data<Object>>, Object> {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f4634Y;
    public /* synthetic */ boolean Z;
    public final /* synthetic */ DataStoreImpl e0;
    public final /* synthetic */ int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataOrHandleCorruption$2(DataStoreImpl dataStoreImpl, int i2, Continuation continuation) {
        super(2, continuation);
        this.e0 = dataStoreImpl;
        this.f0 = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$2 = new DataStoreImpl$readDataOrHandleCorruption$2(this.e0, this.f0, continuation);
        dataStoreImpl$readDataOrHandleCorruption$2.Z = ((Boolean) obj).booleanValue();
        return dataStoreImpl$readDataOrHandleCorruption$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((DataStoreImpl$readDataOrHandleCorruption$2) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z2;
        Object obj2;
        int iIntValue;
        int iHashCode;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.f4634Y;
        DataStoreImpl dataStoreImpl = this.e0;
        if (i2 == 0) {
            ResultKt.b(obj);
            z2 = this.Z;
            this.Z = z2;
            this.f4634Y = 1;
            obj = dataStoreImpl.i(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            z2 = this.Z;
            ResultKt.b(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.X;
            ResultKt.b(obj);
        }
        iIntValue = ((Number) obj).intValue();
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new Data(obj2, iHashCode, iIntValue);
        if (z2) {
            InterProcessCoordinator interProcessCoordinatorG = dataStoreImpl.g();
            this.X = obj;
            this.f4634Y = 2;
            Object objC = interProcessCoordinatorG.c(this);
            if (objC != coroutineSingletons) {
                obj2 = obj;
                obj = objC;
                iIntValue = ((Number) obj).intValue();
            }
            return coroutineSingletons;
        }
        obj2 = obj;
        iIntValue = this.f0;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new Data(obj2, iHashCode, iIntValue);
    }
}
