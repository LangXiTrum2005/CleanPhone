package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/datastore/core/State;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "locked"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE}, m = "invokeSuspend")
final class DataStoreImpl$readDataAndUpdateCache$4 extends SuspendLambda implements Function2<Boolean, Continuation<? super Pair<? extends State<Object>, ? extends Boolean>>, Object> {
    public Throwable X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f4632Y;
    public /* synthetic */ boolean Z;
    public final /* synthetic */ DataStoreImpl e0;
    public final /* synthetic */ int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$4(DataStoreImpl dataStoreImpl, int i2, Continuation continuation) {
        super(2, continuation);
        this.e0 = dataStoreImpl;
        this.f0 = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new DataStoreImpl$readDataAndUpdateCache$4(this.e0, this.f0, continuation);
        dataStoreImpl$readDataAndUpdateCache$4.Z = ((Boolean) obj).booleanValue();
        return dataStoreImpl$readDataAndUpdateCache$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((DataStoreImpl$readDataAndUpdateCache$4) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int iIntValue;
        ?? r0;
        ?? r1;
        State state;
        ?? r2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ?? r3 = this.f4632Y;
        DataStoreImpl dataStoreImpl = this.e0;
        try {
            if (r3 == 0) {
                ResultKt.b(obj);
                boolean z2 = this.Z;
                this.Z = z2;
                this.f4632Y = 1;
                obj = DataStoreImpl.f(dataStoreImpl, z2, this);
                r3 = z2;
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (r3 != 1) {
                    if (r3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = this.Z;
                    th = this.X;
                    ResultKt.b(obj);
                    r1 = z3;
                    iIntValue = ((Number) obj).intValue();
                    r0 = r1;
                    ReadException readException = new ReadException(th, iIntValue);
                    r2 = r0;
                    state = readException;
                    return new Pair(state, Boolean.valueOf((boolean) r2));
                }
                boolean z4 = this.Z;
                ResultKt.b(obj);
                r3 = z4;
            }
            state = (State) obj;
            r2 = r3;
        } catch (Throwable th2) {
            if (r3 != 0) {
                InterProcessCoordinator interProcessCoordinatorG = dataStoreImpl.g();
                this.X = th2;
                this.Z = r3;
                this.f4632Y = 2;
                Object objC = interProcessCoordinatorG.c(this);
                if (objC != coroutineSingletons) {
                    r1 = r3;
                    th = th2;
                    obj = objC;
                }
                return coroutineSingletons;
            }
            ?? r5 = r3;
            th = th2;
            iIntValue = this.f0;
            r0 = r5 == true ? 1 : 0;
        }
        return new Pair(state, Boolean.valueOf((boolean) r2));
    }
}
