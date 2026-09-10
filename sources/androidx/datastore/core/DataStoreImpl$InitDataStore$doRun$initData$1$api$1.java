package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1", "Landroidx/datastore/core/InitializerApi;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1 implements InitializerApi<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Mutex f4615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f4616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f4617c;
    public final /* synthetic */ DataStoreImpl d;

    public DataStoreImpl$InitDataStore$doRun$initData$1$api$1(Mutex mutex, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, DataStoreImpl dataStoreImpl) {
        this.f4615a = mutex;
        this.f4616b = booleanRef;
        this.f4617c = objectRef;
        this.d = dataStoreImpl;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ac, B:38:0x00b4), top: B:54:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InitializerApi
    public final Object a(Function2 function2, ContinuationImpl continuationImpl) throws Throwable {
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1;
        Mutex mutex;
        DataStoreImpl dataStoreImpl;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        Mutex mutex2;
        Mutex mutex3;
        DataStoreImpl dataStoreImpl2;
        Object obj;
        Ref.ObjectRef objectRef2;
        if (continuationImpl instanceof DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) continuationImpl;
            int i2 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.i0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.i0 = i2 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, continuationImpl);
            }
        } else {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, continuationImpl);
        }
        Object obj2 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.g0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.i0;
        try {
            if (i3 == 0) {
                ResultKt.b(obj2);
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.X = function2;
                mutex = this.f4615a;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f4618Y = mutex;
                Ref.BooleanRef booleanRef2 = this.f4616b;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.Z = booleanRef2;
                Ref.ObjectRef objectRef3 = this.f4617c;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.e0 = objectRef3;
                dataStoreImpl = this.d;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f0 = dataStoreImpl;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.i0 = 1;
                if (mutex.a(dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != coroutineSingletons) {
                    booleanRef = booleanRef2;
                    objectRef = objectRef3;
                }
                return coroutineSingletons;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.Z;
                    objectRef2 = (Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f4618Y;
                    mutex2 = (Mutex) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.X;
                    try {
                        ResultKt.b(obj2);
                        objectRef2.X = obj;
                        objectRef = objectRef2;
                        Object obj3 = objectRef.X;
                        mutex2.b(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        mutex2.b(null);
                        throw th;
                    }
                }
                dataStoreImpl2 = (DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.Z;
                objectRef = (Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f4618Y;
                mutex3 = (Mutex) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.X;
                try {
                    ResultKt.b(obj2);
                    if (!Intrinsics.a(obj2, objectRef.X)) {
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.X = mutex3;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f4618Y = objectRef;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.Z = obj2;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.i0 = 3;
                        if (dataStoreImpl2.j(obj2, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != coroutineSingletons) {
                            obj = obj2;
                            objectRef2 = objectRef;
                            mutex2 = mutex3;
                            objectRef2.X = obj;
                            objectRef = objectRef2;
                        }
                        return coroutineSingletons;
                    }
                    mutex2 = mutex3;
                    Object obj4 = objectRef.X;
                    mutex2.b(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2 = mutex3;
                    mutex2.b(null);
                    throw th;
                }
            }
            DataStoreImpl dataStoreImpl3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f0;
            objectRef = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.e0;
            booleanRef = (Ref.BooleanRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.Z;
            Mutex mutex4 = (Mutex) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f4618Y;
            Function2 function3 = (Function2) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.X;
            ResultKt.b(obj2);
            dataStoreImpl = dataStoreImpl3;
            function2 = function3;
            mutex = mutex4;
            if (booleanRef.X) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = objectRef.X;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.X = mutex;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f4618Y = objectRef;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.Z = dataStoreImpl;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.e0 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f0 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.i0 = 2;
            Object objInvoke = function2.invoke(obj5, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1);
            if (objInvoke != coroutineSingletons) {
                mutex3 = mutex;
                obj2 = objInvoke;
                dataStoreImpl2 = dataStoreImpl;
                if (!Intrinsics.a(obj2, objectRef.X)) {
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.X = mutex3;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f4618Y = objectRef;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.Z = obj2;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.i0 = 3;
                    if (dataStoreImpl2.j(obj2, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != coroutineSingletons) {
                        obj = obj2;
                        objectRef2 = objectRef;
                        mutex2 = mutex3;
                        objectRef2.X = obj;
                        objectRef = objectRef2;
                    }
                } else {
                    mutex2 = mutex3;
                }
                Object obj6 = objectRef.X;
                mutex2.b(null);
                return obj6;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.b(null);
            throw th;
        }
    }
}
