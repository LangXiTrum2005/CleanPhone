package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", RequestConfiguration.MAX_AD_CONTENT_RATING_T}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, 458, 546, 468}, m = "invokeSuspend")
final class DataStoreImpl$InitDataStore$doRun$initData$1 extends SuspendLambda implements Function1<Continuation<? super Data<Object>>, Object> {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Serializable f4614Y;
    public Object Z;
    public Object e0;
    public Iterator f0;
    public int g0;
    public int h0;
    public final /* synthetic */ DataStoreImpl i0;
    public final /* synthetic */ DataStoreImpl.InitDataStore j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$initData$1(DataStoreImpl dataStoreImpl, DataStoreImpl.InitDataStore initDataStore, Continuation continuation) {
        super(1, continuation);
        this.i0 = dataStoreImpl;
        this.j0 = initDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataStoreImpl$InitDataStore$doRun$initData$1(this.i0, this.j0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((DataStoreImpl$InitDataStore$doRun$initData$1) create((Continuation) obj)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x00a0->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws CorruptionException {
        Mutex mutexA;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Mutex mutex;
        Iterator it;
        Mutex mutex2;
        Ref.BooleanRef booleanRef2;
        Ref.ObjectRef objectRef3;
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
        Ref.ObjectRef objectRef4;
        Ref.BooleanRef booleanRef3;
        Function2 function2;
        Object obj2;
        int iHashCode;
        Object objC;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = this.h0;
        DataStoreImpl.InitDataStore initDataStore = this.j0;
        DataStoreImpl dataStoreImpl = this.i0;
        if (i3 == 0) {
            ResultKt.b(obj);
            mutexA = MutexKt.a();
            booleanRef = new Ref.BooleanRef();
            objectRef = new Ref.ObjectRef();
            this.X = mutexA;
            this.f4614Y = booleanRef;
            this.Z = objectRef;
            this.e0 = objectRef;
            this.h0 = 1;
            obj = DataStoreImpl.f(dataStoreImpl, true, this);
            if (obj != coroutineSingletons) {
                objectRef2 = objectRef;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            objectRef = (Ref.ObjectRef) this.e0;
            objectRef2 = (Ref.ObjectRef) this.Z;
            booleanRef = (Ref.BooleanRef) this.f4614Y;
            mutexA = (Mutex) this.X;
            ResultKt.b(obj);
        } else {
            if (i3 == 2) {
                it = this.f0;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1) this.e0;
                objectRef3 = (Ref.ObjectRef) this.Z;
                booleanRef2 = (Ref.BooleanRef) this.f4614Y;
                mutex2 = (Mutex) this.X;
                ResultKt.b(obj);
                while (it.hasNext()) {
                    function2 = (Function2) it.next();
                    this.X = mutex2;
                    this.f4614Y = booleanRef2;
                    this.Z = objectRef3;
                    this.e0 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                    this.f0 = it;
                    this.h0 = 2;
                    if (function2.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                objectRef2 = objectRef3;
                booleanRef = booleanRef2;
                mutex = mutex2;
                initDataStore.f4612c = null;
                this.X = booleanRef;
                this.f4614Y = objectRef2;
                this.Z = mutex;
                this.e0 = null;
                this.f0 = null;
                this.h0 = 3;
                if (mutex.a(this) != coroutineSingletons) {
                    objectRef4 = objectRef2;
                    booleanRef3 = booleanRef;
                    booleanRef3.X = true;
                    mutex.b(null);
                    obj2 = objectRef4.X;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterProcessCoordinator interProcessCoordinatorG = dataStoreImpl.g();
                    this.X = obj2;
                    this.f4614Y = null;
                    this.Z = null;
                    this.g0 = iHashCode;
                    this.h0 = 4;
                    objC = interProcessCoordinatorG.c(this);
                    if (objC != coroutineSingletons) {
                        i2 = iHashCode;
                        obj = objC;
                    }
                }
                return coroutineSingletons;
            }
            if (i3 == 3) {
                mutex = (Mutex) this.Z;
                objectRef4 = (Ref.ObjectRef) this.f4614Y;
                booleanRef3 = (Ref.BooleanRef) this.X;
                ResultKt.b(obj);
                try {
                    booleanRef3.X = true;
                    mutex.b(null);
                    obj2 = objectRef4.X;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterProcessCoordinator interProcessCoordinatorG2 = dataStoreImpl.g();
                    this.X = obj2;
                    this.f4614Y = null;
                    this.Z = null;
                    this.g0 = iHashCode;
                    this.h0 = 4;
                    objC = interProcessCoordinatorG2.c(this);
                    if (objC != coroutineSingletons) {
                        i2 = iHashCode;
                        obj = objC;
                    }
                    return coroutineSingletons;
                } catch (Throwable th) {
                    mutex.b(null);
                    throw th;
                }
            }
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.g0;
            obj2 = this.X;
            ResultKt.b(obj);
        }
        return new Data(obj2, i2, ((Number) obj).intValue());
        objectRef.X = ((Data) obj).f4599b;
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$2 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1(mutexA, booleanRef, objectRef2, dataStoreImpl);
        List list = initDataStore.f4612c;
        if (list != null) {
            it = list.iterator();
            mutex2 = mutexA;
            booleanRef2 = booleanRef;
            objectRef3 = objectRef2;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = dataStoreImpl$InitDataStore$doRun$initData$1$api$2;
            while (it.hasNext()) {
                function2 = (Function2) it.next();
                this.X = mutex2;
                this.f4614Y = booleanRef2;
                this.Z = objectRef3;
                this.e0 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                this.f0 = it;
                this.h0 = 2;
                if (function2.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            objectRef2 = objectRef3;
            booleanRef = booleanRef2;
            mutex = mutex2;
        } else {
            mutex = mutexA;
        }
        initDataStore.f4612c = null;
        this.X = booleanRef;
        this.f4614Y = objectRef2;
        this.Z = mutex;
        this.e0 = null;
        this.f0 = null;
        this.h0 = 3;
        if (mutex.a(this) != coroutineSingletons) {
            objectRef4 = objectRef2;
            booleanRef3 = booleanRef;
            booleanRef3.X = true;
            mutex.b(null);
            obj2 = objectRef4.X;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            InterProcessCoordinator interProcessCoordinatorG3 = dataStoreImpl.g();
            this.X = obj2;
            this.f4614Y = null;
            this.Z = null;
            this.g0 = iHashCode;
            this.h0 = 4;
            objC = interProcessCoordinatorG3.c(this);
            if (objC != coroutineSingletons) {
                i2 = iHashCode;
                obj = objC;
                return new Data(obj2, i2, ((Number) obj).intValue());
            }
        }
        return coroutineSingletons;
    }
}
