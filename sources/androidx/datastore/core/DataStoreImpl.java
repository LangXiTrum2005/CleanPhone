package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/datastore/core/DataStoreImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/DataStore;", "Companion", "InitDataStore", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataStoreImpl<T> implements DataStore<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileStorage f4605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CorruptionHandler f4606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f4607c;
    public final Flow d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutexImpl f4608e;
    public int f;
    public Job g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DataStoreInMemoryCache f4609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InitDataStore f4610i;
    public final Lazy j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SimpleActor f4611l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/datastore/core/DataStoreImpl$Companion;", "", "", "BUG_MESSAGE", "Ljava/lang/String;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Landroidx/datastore/core/RunOnce;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class InitDataStore extends RunOnce {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f4612c;

        public InitDataStore(List list) {
            this.f4612c = CollectionsKt.i0(list);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.datastore.core.RunOnce
        public final Object a(ContinuationImpl continuationImpl) throws CorruptionException {
            DataStoreImpl$InitDataStore$doRun$1 dataStoreImpl$InitDataStore$doRun$1;
            InitDataStore initDataStore;
            Data data;
            if (continuationImpl instanceof DataStoreImpl$InitDataStore$doRun$1) {
                dataStoreImpl$InitDataStore$doRun$1 = (DataStoreImpl$InitDataStore$doRun$1) continuationImpl;
                int i2 = dataStoreImpl$InitDataStore$doRun$1.e0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$InitDataStore$doRun$1.e0 = i2 - Integer.MIN_VALUE;
                } else {
                    dataStoreImpl$InitDataStore$doRun$1 = new DataStoreImpl$InitDataStore$doRun$1(this, continuationImpl);
                }
            } else {
                dataStoreImpl$InitDataStore$doRun$1 = new DataStoreImpl$InitDataStore$doRun$1(this, continuationImpl);
            }
            Object objF = dataStoreImpl$InitDataStore$doRun$1.f4613Y;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i3 = dataStoreImpl$InitDataStore$doRun$1.e0;
            if (i3 == 0) {
                ResultKt.b(objF);
                List list = this.f4612c;
                DataStoreImpl dataStoreImpl = DataStoreImpl.this;
                if (list == null || list.isEmpty()) {
                    dataStoreImpl$InitDataStore$doRun$1.X = this;
                    dataStoreImpl$InitDataStore$doRun$1.e0 = 1;
                    objF = DataStoreImpl.f(dataStoreImpl, false, dataStoreImpl$InitDataStore$doRun$1);
                    if (objF != coroutineSingletons) {
                        initDataStore = this;
                        data = (Data) objF;
                    }
                } else {
                    InterProcessCoordinator interProcessCoordinatorG = dataStoreImpl.g();
                    DataStoreImpl$InitDataStore$doRun$initData$1 dataStoreImpl$InitDataStore$doRun$initData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1(dataStoreImpl, this, null);
                    dataStoreImpl$InitDataStore$doRun$1.X = this;
                    dataStoreImpl$InitDataStore$doRun$1.e0 = 2;
                    objF = interProcessCoordinatorG.d(dataStoreImpl$InitDataStore$doRun$initData$1, dataStoreImpl$InitDataStore$doRun$1);
                    if (objF != coroutineSingletons) {
                        initDataStore = this;
                        data = (Data) objF;
                    }
                }
                return coroutineSingletons;
            }
            if (i3 == 1) {
                initDataStore = (InitDataStore) dataStoreImpl$InitDataStore$doRun$1.X;
                ResultKt.b(objF);
                data = (Data) objF;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                initDataStore = (InitDataStore) dataStoreImpl$InitDataStore$doRun$1.X;
                ResultKt.b(objF);
                data = (Data) objF;
            }
            DataStoreImpl.this.f4609h.b(data);
            return Unit.f43263a;
        }
    }

    public DataStoreImpl(FileStorage fileStorage, List list, CorruptionHandler corruptionHandler, CoroutineScope scope) {
        Intrinsics.f(scope, "scope");
        this.f4605a = fileStorage;
        this.f4606b = corruptionHandler;
        this.f4607c = scope;
        this.d = FlowKt.o(new DataStoreImpl$data$1(this, null));
        this.f4608e = MutexKt.a();
        this.f4609h = new DataStoreInMemoryCache();
        this.f4610i = new InitDataStore(list);
        this.j = LazyKt.b(new Function0<StorageConnection<Object>>() { // from class: androidx.datastore.core.DataStoreImpl$storageConnectionDelegate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws IOException {
                FileStorage fileStorage2 = this.X.f4605a;
                final File canonicalFile = ((File) fileStorage2.f4651c.invoke()).getCanonicalFile();
                synchronized (FileStorage.f4648e) {
                    String path = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = FileStorage.d;
                    if (linkedHashSet.contains(path)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Intrinsics.e(path, "path");
                    linkedHashSet.add(path);
                }
                return new FileStorageConnection(canonicalFile, fileStorage2.f4649a, (InterProcessCoordinator) fileStorage2.f4650b.invoke(canonicalFile), new Function0<Unit>() { // from class: androidx.datastore.core.FileStorage$createConnection$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Object obj = FileStorage.f4648e;
                        File file = canonicalFile;
                        synchronized (obj) {
                            FileStorage.d.remove(file.getAbsolutePath());
                        }
                        return Unit.f43263a;
                    }
                });
            }
        });
        this.k = LazyKt.b(new Function0<InterProcessCoordinator>() { // from class: androidx.datastore.core.DataStoreImpl$coordinator$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((StorageConnection) this.X.j.getX()).getF4654c();
            }
        });
        this.f4611l = new SimpleActor(scope, new DataStoreImpl$writeActor$1(this), new DataStoreImpl$writeActor$3(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(DataStoreImpl dataStoreImpl, ContinuationImpl continuationImpl) {
        DataStoreImpl$decrementCollector$1 dataStoreImpl$decrementCollector$1;
        MutexImpl mutexImpl;
        dataStoreImpl.getClass();
        if (continuationImpl instanceof DataStoreImpl$decrementCollector$1) {
            dataStoreImpl$decrementCollector$1 = (DataStoreImpl$decrementCollector$1) continuationImpl;
            int i2 = dataStoreImpl$decrementCollector$1.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$decrementCollector$1.f0 = i2 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$decrementCollector$1 = new DataStoreImpl$decrementCollector$1(dataStoreImpl, continuationImpl);
            }
        } else {
            dataStoreImpl$decrementCollector$1 = new DataStoreImpl$decrementCollector$1(dataStoreImpl, continuationImpl);
        }
        Object obj = dataStoreImpl$decrementCollector$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = dataStoreImpl$decrementCollector$1.f0;
        if (i3 == 0) {
            ResultKt.b(obj);
            mutexImpl = dataStoreImpl.f4608e;
            dataStoreImpl$decrementCollector$1.X = dataStoreImpl;
            dataStoreImpl$decrementCollector$1.f4624Y = mutexImpl;
            dataStoreImpl$decrementCollector$1.f0 = 1;
            if (mutexImpl.a(dataStoreImpl$decrementCollector$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutexImpl mutexImpl2 = dataStoreImpl$decrementCollector$1.f4624Y;
            DataStoreImpl dataStoreImpl2 = dataStoreImpl$decrementCollector$1.X;
            ResultKt.b(obj);
            mutexImpl = mutexImpl2;
            dataStoreImpl = dataStoreImpl2;
        }
        try {
            int i4 = dataStoreImpl.f - 1;
            dataStoreImpl.f = i4;
            if (i4 == 0) {
                Job job = dataStoreImpl.g;
                if (job != null) {
                    ((JobSupport) job).a(null);
                }
                dataStoreImpl.g = null;
            }
            return Unit.f43263a;
        } finally {
            mutexImpl.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bf, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.datastore.core.DataStoreImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [androidx.datastore.core.DataStoreImpl] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.datastore.core.DataStoreImpl r9, androidx.datastore.core.Message.Update r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.c(androidx.datastore.core.DataStoreImpl, androidx.datastore.core.Message$Update, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(DataStoreImpl dataStoreImpl, ContinuationImpl continuationImpl) {
        DataStoreImpl$incrementCollector$1 dataStoreImpl$incrementCollector$1;
        MutexImpl mutexImpl;
        dataStoreImpl.getClass();
        if (continuationImpl instanceof DataStoreImpl$incrementCollector$1) {
            dataStoreImpl$incrementCollector$1 = (DataStoreImpl$incrementCollector$1) continuationImpl;
            int i2 = dataStoreImpl$incrementCollector$1.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$incrementCollector$1.f0 = i2 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$incrementCollector$1 = new DataStoreImpl$incrementCollector$1(dataStoreImpl, continuationImpl);
            }
        } else {
            dataStoreImpl$incrementCollector$1 = new DataStoreImpl$incrementCollector$1(dataStoreImpl, continuationImpl);
        }
        Object obj = dataStoreImpl$incrementCollector$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = dataStoreImpl$incrementCollector$1.f0;
        if (i3 == 0) {
            ResultKt.b(obj);
            mutexImpl = dataStoreImpl.f4608e;
            dataStoreImpl$incrementCollector$1.X = dataStoreImpl;
            dataStoreImpl$incrementCollector$1.f4627Y = mutexImpl;
            dataStoreImpl$incrementCollector$1.f0 = 1;
            if (mutexImpl.a(dataStoreImpl$incrementCollector$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutexImpl mutexImpl2 = dataStoreImpl$incrementCollector$1.f4627Y;
            DataStoreImpl dataStoreImpl2 = dataStoreImpl$incrementCollector$1.X;
            ResultKt.b(obj);
            mutexImpl = mutexImpl2;
            dataStoreImpl = dataStoreImpl2;
        }
        try {
            int i4 = dataStoreImpl.f + 1;
            dataStoreImpl.f = i4;
            if (i4 == 1) {
                dataStoreImpl.g = BuildersKt.c(dataStoreImpl.f4607c, null, null, new DataStoreImpl$incrementCollector$2$1(dataStoreImpl, null), 3);
            }
            return Unit.f43263a;
        } finally {
            mutexImpl.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object e(DataStoreImpl dataStoreImpl, boolean z2, Continuation continuation) {
        DataStoreImpl$readDataAndUpdateCache$1 dataStoreImpl$readDataAndUpdateCache$1;
        DataStoreImpl dataStoreImpl2;
        State state;
        DataStoreImpl dataStoreImpl3;
        Pair pair;
        State state2;
        dataStoreImpl.getClass();
        if (continuation instanceof DataStoreImpl$readDataAndUpdateCache$1) {
            dataStoreImpl$readDataAndUpdateCache$1 = (DataStoreImpl$readDataAndUpdateCache$1) continuation;
            int i2 = dataStoreImpl$readDataAndUpdateCache$1.g0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$readDataAndUpdateCache$1.g0 = i2 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$readDataAndUpdateCache$1 = new DataStoreImpl$readDataAndUpdateCache$1(dataStoreImpl, continuation);
            }
        } else {
            dataStoreImpl$readDataAndUpdateCache$1 = new DataStoreImpl$readDataAndUpdateCache$1(dataStoreImpl, continuation);
        }
        Object objA = dataStoreImpl$readDataAndUpdateCache$1.e0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = dataStoreImpl$readDataAndUpdateCache$1.g0;
        if (i3 == 0) {
            ResultKt.b(objA);
            State stateA = dataStoreImpl.f4609h.a();
            if (stateA instanceof UnInitialized) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            InterProcessCoordinator interProcessCoordinatorG = dataStoreImpl.g();
            dataStoreImpl$readDataAndUpdateCache$1.X = dataStoreImpl;
            dataStoreImpl$readDataAndUpdateCache$1.f4630Y = stateA;
            dataStoreImpl$readDataAndUpdateCache$1.Z = z2;
            dataStoreImpl$readDataAndUpdateCache$1.g0 = 1;
            Object objC = interProcessCoordinatorG.c(dataStoreImpl$readDataAndUpdateCache$1);
            if (objC != coroutineSingletons) {
                dataStoreImpl2 = dataStoreImpl;
                state = stateA;
                objA = objC;
            }
            return coroutineSingletons;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                dataStoreImpl3 = dataStoreImpl$readDataAndUpdateCache$1.X;
                ResultKt.b(objA);
                pair = (Pair) objA;
                state2 = (State) pair.X;
                if (((Boolean) pair.f43249Y).booleanValue()) {
                    dataStoreImpl3.f4609h.b(state2);
                }
                return state2;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dataStoreImpl3 = dataStoreImpl$readDataAndUpdateCache$1.X;
            ResultKt.b(objA);
            pair = (Pair) objA;
            state2 = (State) pair.X;
            if (((Boolean) pair.f43249Y).booleanValue()) {
                dataStoreImpl3.f4609h.b(state2);
            }
            return state2;
        }
        z2 = dataStoreImpl$readDataAndUpdateCache$1.Z;
        state = dataStoreImpl$readDataAndUpdateCache$1.f4630Y;
        dataStoreImpl2 = dataStoreImpl$readDataAndUpdateCache$1.X;
        ResultKt.b(objA);
        int iIntValue = ((Number) objA).intValue();
        boolean z3 = state instanceof Data;
        int i4 = z3 ? state.f4693a : -1;
        if (z3 && iIntValue == i4) {
            return state;
        }
        if (z2) {
            InterProcessCoordinator interProcessCoordinatorG2 = dataStoreImpl2.g();
            DataStoreImpl$readDataAndUpdateCache$3 dataStoreImpl$readDataAndUpdateCache$3 = new DataStoreImpl$readDataAndUpdateCache$3(dataStoreImpl2, null);
            dataStoreImpl$readDataAndUpdateCache$1.X = dataStoreImpl2;
            dataStoreImpl$readDataAndUpdateCache$1.f4630Y = null;
            dataStoreImpl$readDataAndUpdateCache$1.g0 = 2;
            objA = interProcessCoordinatorG2.d(dataStoreImpl$readDataAndUpdateCache$3, dataStoreImpl$readDataAndUpdateCache$1);
            if (objA != coroutineSingletons) {
                dataStoreImpl3 = dataStoreImpl2;
                pair = (Pair) objA;
                state2 = (State) pair.X;
                if (((Boolean) pair.f43249Y).booleanValue()) {
                    dataStoreImpl3.f4609h.b(state2);
                }
                return state2;
            }
        } else {
            InterProcessCoordinator interProcessCoordinatorG3 = dataStoreImpl2.g();
            DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new DataStoreImpl$readDataAndUpdateCache$4(dataStoreImpl2, i4, null);
            dataStoreImpl$readDataAndUpdateCache$1.X = dataStoreImpl2;
            dataStoreImpl$readDataAndUpdateCache$1.f4630Y = null;
            dataStoreImpl$readDataAndUpdateCache$1.g0 = 3;
            objA = interProcessCoordinatorG3.a(dataStoreImpl$readDataAndUpdateCache$4, dataStoreImpl$readDataAndUpdateCache$1);
            if (objA != coroutineSingletons) {
                dataStoreImpl3 = dataStoreImpl2;
                pair = (Pair) objA;
                state2 = (State) pair.X;
                if (((Boolean) pair.f43249Y).booleanValue()) {
                    dataStoreImpl3.f4609h.b(state2);
                }
                return state2;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a2 A[Catch: CorruptionException -> 0x0062, TryCatch #2 {CorruptionException -> 0x0062, blocks: (B:19:0x005d, B:54:0x0101, B:24:0x006b, B:51:0x00e3, B:32:0x0088, B:40:0x00a2, B:42:0x00a8, B:36:0x0091, B:48:0x00d0), top: B:81:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:63:0x013e A[Catch: all -> 0x016a, TryCatch #1 {all -> 0x016a, blocks: (B:61:0x012c, B:63:0x013e, B:64:0x0146), top: B:80:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0146 A[Catch: all -> 0x016a, TRY_LEAVE, TryCatch #1 {all -> 0x016a, blocks: (B:61:0x012c, B:63:0x013e, B:64:0x0146), top: B:80:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0156  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object f(DataStoreImpl dataStoreImpl, boolean z2, ContinuationImpl continuationImpl) throws CorruptionException {
        DataStoreImpl$readDataOrHandleCorruption$1 dataStoreImpl$readDataOrHandleCorruption$1;
        Ref.ObjectRef objectRef;
        CorruptionException corruptionException;
        DataStoreImpl dataStoreImpl2;
        boolean z3;
        Ref.ObjectRef objectRef2;
        Ref.IntRef intRef;
        CorruptionException corruptionException2;
        DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$3;
        Object objD;
        Ref.IntRef intRef2;
        Ref.ObjectRef objectRef3;
        int iHashCode;
        Object objC;
        DataStoreImpl dataStoreImpl3;
        int i2;
        Object obj;
        dataStoreImpl.getClass();
        if (continuationImpl instanceof DataStoreImpl$readDataOrHandleCorruption$1) {
            dataStoreImpl$readDataOrHandleCorruption$1 = (DataStoreImpl$readDataOrHandleCorruption$1) continuationImpl;
            int i3 = dataStoreImpl$readDataOrHandleCorruption$1.j0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$readDataOrHandleCorruption$1.j0 = i3 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$readDataOrHandleCorruption$1 = new DataStoreImpl$readDataOrHandleCorruption$1(dataStoreImpl, continuationImpl);
            }
        } else {
            dataStoreImpl$readDataOrHandleCorruption$1 = new DataStoreImpl$readDataOrHandleCorruption$1(dataStoreImpl, continuationImpl);
        }
        Object objC2 = dataStoreImpl$readDataOrHandleCorruption$1.h0;
        Object data = CoroutineSingletons.X;
        try {
            switch (dataStoreImpl$readDataOrHandleCorruption$1.j0) {
                case 0:
                    ResultKt.b(objC2);
                    if (z2) {
                        dataStoreImpl$readDataOrHandleCorruption$1.X = dataStoreImpl;
                        dataStoreImpl$readDataOrHandleCorruption$1.f0 = z2;
                        dataStoreImpl$readDataOrHandleCorruption$1.j0 = 1;
                        objC2 = dataStoreImpl.i(dataStoreImpl$readDataOrHandleCorruption$1);
                        if (objC2 != data) {
                            if (objC2 != null) {
                                iHashCode = objC2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            InterProcessCoordinator interProcessCoordinatorG = dataStoreImpl.g();
                            dataStoreImpl$readDataOrHandleCorruption$1.X = dataStoreImpl;
                            dataStoreImpl$readDataOrHandleCorruption$1.f4633Y = objC2;
                            dataStoreImpl$readDataOrHandleCorruption$1.f0 = z2;
                            dataStoreImpl$readDataOrHandleCorruption$1.g0 = iHashCode;
                            dataStoreImpl$readDataOrHandleCorruption$1.j0 = 2;
                            objC = interProcessCoordinatorG.c(dataStoreImpl$readDataOrHandleCorruption$1);
                            if (objC != data) {
                                dataStoreImpl3 = dataStoreImpl;
                                i2 = iHashCode;
                                obj = objC2;
                                objC2 = objC;
                                return new Data(obj, i2, ((Number) objC2).intValue());
                            }
                        }
                    } else {
                        InterProcessCoordinator interProcessCoordinatorG2 = dataStoreImpl.g();
                        dataStoreImpl$readDataOrHandleCorruption$1.X = dataStoreImpl;
                        dataStoreImpl$readDataOrHandleCorruption$1.f0 = z2;
                        dataStoreImpl$readDataOrHandleCorruption$1.j0 = 3;
                        objC2 = interProcessCoordinatorG2.c(dataStoreImpl$readDataOrHandleCorruption$1);
                        if (objC2 != data) {
                            int iIntValue = ((Number) objC2).intValue();
                            InterProcessCoordinator interProcessCoordinatorG3 = dataStoreImpl.g();
                            DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$2 = new DataStoreImpl$readDataOrHandleCorruption$2(dataStoreImpl, iIntValue, null);
                            dataStoreImpl$readDataOrHandleCorruption$1.X = dataStoreImpl;
                            dataStoreImpl$readDataOrHandleCorruption$1.f0 = z2;
                            dataStoreImpl$readDataOrHandleCorruption$1.j0 = 4;
                            objC2 = interProcessCoordinatorG3.a(dataStoreImpl$readDataOrHandleCorruption$2, dataStoreImpl$readDataOrHandleCorruption$1);
                            if (objC2 == data) {
                            }
                            return (Data) objC2;
                        }
                    }
                    return data;
                case 1:
                    z2 = dataStoreImpl$readDataOrHandleCorruption$1.f0;
                    dataStoreImpl = (DataStoreImpl) dataStoreImpl$readDataOrHandleCorruption$1.X;
                    ResultKt.b(objC2);
                    if (objC2 != null) {
                        iHashCode = objC2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterProcessCoordinator interProcessCoordinatorG4 = dataStoreImpl.g();
                    dataStoreImpl$readDataOrHandleCorruption$1.X = dataStoreImpl;
                    dataStoreImpl$readDataOrHandleCorruption$1.f4633Y = objC2;
                    dataStoreImpl$readDataOrHandleCorruption$1.f0 = z2;
                    dataStoreImpl$readDataOrHandleCorruption$1.g0 = iHashCode;
                    dataStoreImpl$readDataOrHandleCorruption$1.j0 = 2;
                    objC = interProcessCoordinatorG4.c(dataStoreImpl$readDataOrHandleCorruption$1);
                    if (objC != data) {
                        dataStoreImpl3 = dataStoreImpl;
                        i2 = iHashCode;
                        obj = objC2;
                        objC2 = objC;
                        return new Data(obj, i2, ((Number) objC2).intValue());
                    }
                    return data;
                case 2:
                    i2 = dataStoreImpl$readDataOrHandleCorruption$1.g0;
                    z2 = dataStoreImpl$readDataOrHandleCorruption$1.f0;
                    obj = dataStoreImpl$readDataOrHandleCorruption$1.f4633Y;
                    dataStoreImpl3 = (DataStoreImpl) dataStoreImpl$readDataOrHandleCorruption$1.X;
                    try {
                        ResultKt.b(objC2);
                        return new Data(obj, i2, ((Number) objC2).intValue());
                    } catch (CorruptionException e2) {
                        e = e2;
                        dataStoreImpl = dataStoreImpl3;
                        objectRef = new Ref.ObjectRef();
                        CorruptionHandler corruptionHandler = dataStoreImpl.f4606b;
                        dataStoreImpl$readDataOrHandleCorruption$1.X = dataStoreImpl;
                        dataStoreImpl$readDataOrHandleCorruption$1.f4633Y = e;
                        dataStoreImpl$readDataOrHandleCorruption$1.Z = objectRef;
                        dataStoreImpl$readDataOrHandleCorruption$1.e0 = objectRef;
                        dataStoreImpl$readDataOrHandleCorruption$1.f0 = z2;
                        dataStoreImpl$readDataOrHandleCorruption$1.j0 = 5;
                        Object objA = corruptionHandler.a(e);
                        if (objA != data) {
                            corruptionException = e;
                            objC2 = objA;
                            dataStoreImpl2 = dataStoreImpl;
                            z3 = z2;
                            objectRef2 = objectRef;
                            objectRef2.X = objC2;
                            intRef = new Ref.IntRef();
                            try {
                                dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(objectRef, dataStoreImpl2, intRef, null);
                                dataStoreImpl$readDataOrHandleCorruption$1.X = corruptionException;
                                dataStoreImpl$readDataOrHandleCorruption$1.f4633Y = objectRef;
                                dataStoreImpl$readDataOrHandleCorruption$1.Z = intRef;
                                dataStoreImpl$readDataOrHandleCorruption$1.e0 = null;
                                dataStoreImpl$readDataOrHandleCorruption$1.j0 = 6;
                                if (z3) {
                                    dataStoreImpl2.getClass();
                                    objD = dataStoreImpl$readDataOrHandleCorruption$3.invoke(dataStoreImpl$readDataOrHandleCorruption$1);
                                } else {
                                    objD = dataStoreImpl2.g().d(new DataStoreImpl$doWithWriteFileLock$3(dataStoreImpl$readDataOrHandleCorruption$3, null), dataStoreImpl$readDataOrHandleCorruption$1);
                                }
                                if (objD != data) {
                                    intRef2 = intRef;
                                    objectRef3 = objectRef;
                                    Object obj2 = objectRef3.X;
                                    data = new Data(obj2, obj2 != null ? obj2.hashCode() : 0, intRef2.X);
                                }
                            } catch (Throwable th) {
                                th = th;
                                corruptionException2 = corruptionException;
                                ExceptionsKt.a(corruptionException2, th);
                                throw corruptionException2;
                            }
                        }
                        return data;
                    }
                case 3:
                    z2 = dataStoreImpl$readDataOrHandleCorruption$1.f0;
                    dataStoreImpl = (DataStoreImpl) dataStoreImpl$readDataOrHandleCorruption$1.X;
                    ResultKt.b(objC2);
                    int iIntValue2 = ((Number) objC2).intValue();
                    InterProcessCoordinator interProcessCoordinatorG5 = dataStoreImpl.g();
                    DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$4 = new DataStoreImpl$readDataOrHandleCorruption$2(dataStoreImpl, iIntValue2, null);
                    dataStoreImpl$readDataOrHandleCorruption$1.X = dataStoreImpl;
                    dataStoreImpl$readDataOrHandleCorruption$1.f0 = z2;
                    dataStoreImpl$readDataOrHandleCorruption$1.j0 = 4;
                    objC2 = interProcessCoordinatorG5.a(dataStoreImpl$readDataOrHandleCorruption$4, dataStoreImpl$readDataOrHandleCorruption$1);
                    if (objC2 == data) {
                        return data;
                    }
                    return (Data) objC2;
                case 4:
                    boolean z4 = dataStoreImpl$readDataOrHandleCorruption$1.f0;
                    ResultKt.b(objC2);
                    return (Data) objC2;
                case 5:
                    z3 = dataStoreImpl$readDataOrHandleCorruption$1.f0;
                    objectRef2 = dataStoreImpl$readDataOrHandleCorruption$1.e0;
                    objectRef = (Ref.ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.Z;
                    corruptionException = (CorruptionException) dataStoreImpl$readDataOrHandleCorruption$1.f4633Y;
                    dataStoreImpl2 = (DataStoreImpl) dataStoreImpl$readDataOrHandleCorruption$1.X;
                    ResultKt.b(objC2);
                    objectRef2.X = objC2;
                    intRef = new Ref.IntRef();
                    dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(objectRef, dataStoreImpl2, intRef, null);
                    dataStoreImpl$readDataOrHandleCorruption$1.X = corruptionException;
                    dataStoreImpl$readDataOrHandleCorruption$1.f4633Y = objectRef;
                    dataStoreImpl$readDataOrHandleCorruption$1.Z = intRef;
                    dataStoreImpl$readDataOrHandleCorruption$1.e0 = null;
                    dataStoreImpl$readDataOrHandleCorruption$1.j0 = 6;
                    if (z3) {
                        dataStoreImpl2.getClass();
                        objD = dataStoreImpl$readDataOrHandleCorruption$3.invoke(dataStoreImpl$readDataOrHandleCorruption$1);
                    } else {
                        objD = dataStoreImpl2.g().d(new DataStoreImpl$doWithWriteFileLock$3(dataStoreImpl$readDataOrHandleCorruption$3, null), dataStoreImpl$readDataOrHandleCorruption$1);
                    }
                    if (objD != data) {
                        intRef2 = intRef;
                        objectRef3 = objectRef;
                        Object obj3 = objectRef3.X;
                        data = new Data(obj3, obj3 != null ? obj3.hashCode() : 0, intRef2.X);
                    }
                    return data;
                case 6:
                    intRef2 = (Ref.IntRef) dataStoreImpl$readDataOrHandleCorruption$1.Z;
                    objectRef3 = (Ref.ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.f4633Y;
                    corruptionException2 = (CorruptionException) dataStoreImpl$readDataOrHandleCorruption$1.X;
                    try {
                        ResultKt.b(objC2);
                        Object obj4 = objectRef3.X;
                        data = new Data(obj4, obj4 != null ? obj4.hashCode() : 0, intRef2.X);
                        return data;
                    } catch (Throwable th2) {
                        th = th2;
                        ExceptionsKt.a(corruptionException2, th);
                        throw corruptionException2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CorruptionException e3) {
            e = e3;
        }
    }

    @Override // androidx.datastore.core.DataStore
    public final Object a(Function2 function2, Continuation continuation) {
        UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) continuation.getF45023Y().get(UpdatingDataContextElement.Companion.Key.X);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.c(this);
        }
        return BuildersKt.f(new UpdatingDataContextElement(updatingDataContextElement, this), new DataStoreImpl$updateData$2(this, function2, null), continuation);
    }

    public final InterProcessCoordinator g() {
        return (InterProcessCoordinator) this.k.getX();
    }

    @Override // androidx.datastore.core.DataStore
    /* JADX INFO: renamed from: getData, reason: from getter */
    public final Flow getD() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.b(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) r0
            int r1 = r0.f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f0 = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.Z
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r2 = r0.f0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.f4629Y
            androidx.datastore.core.DataStoreImpl r0 = r0.X
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r6 = move-exception
            goto L6f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            androidx.datastore.core.DataStoreImpl r2 = r0.X
            kotlin.ResultKt.b(r6)
            goto L51
        L3e:
            kotlin.ResultKt.b(r6)
            androidx.datastore.core.InterProcessCoordinator r6 = r5.g()
            r0.X = r5
            r0.f0 = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L50
            goto L65
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            androidx.datastore.core.DataStoreImpl$InitDataStore r4 = r2.f4610i     // Catch: java.lang.Throwable -> L6d
            r0.X = r2     // Catch: java.lang.Throwable -> L6d
            r0.f4629Y = r6     // Catch: java.lang.Throwable -> L6d
            r0.f0 = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r4.b(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r6 = kotlin.Unit.f43263a
            return r6
        L69:
            r1 = r6
            r6 = r0
            r0 = r2
            goto L6f
        L6d:
            r0 = move-exception
            goto L69
        L6f:
            androidx.datastore.core.DataStoreInMemoryCache r0 = r0.f4609h
            androidx.datastore.core.ReadException r2 = new androidx.datastore.core.ReadException
            r2.<init>(r6, r1)
            r0.b(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.h(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object i(ContinuationImpl continuationImpl) {
        return ((StorageConnection) this.j.getX()).b(new StorageConnectionKt$readData$2(3, null), continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(Object obj, boolean z2, ContinuationImpl continuationImpl) {
        DataStoreImpl$writeData$1 dataStoreImpl$writeData$1;
        Ref.IntRef intRef;
        if (continuationImpl instanceof DataStoreImpl$writeData$1) {
            dataStoreImpl$writeData$1 = (DataStoreImpl$writeData$1) continuationImpl;
            int i2 = dataStoreImpl$writeData$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$writeData$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$writeData$1 = new DataStoreImpl$writeData$1(this, continuationImpl);
            }
        } else {
            dataStoreImpl$writeData$1 = new DataStoreImpl$writeData$1(this, continuationImpl);
        }
        Object obj2 = dataStoreImpl$writeData$1.f4641Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = dataStoreImpl$writeData$1.e0;
        if (i3 == 0) {
            ResultKt.b(obj2);
            Ref.IntRef intRef2 = new Ref.IntRef();
            StorageConnection storageConnection = (StorageConnection) this.j.getX();
            DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(intRef2, this, obj, z2, null);
            dataStoreImpl$writeData$1.X = intRef2;
            dataStoreImpl$writeData$1.e0 = 1;
            if (storageConnection.c(dataStoreImpl$writeData$2, dataStoreImpl$writeData$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            intRef = intRef2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intRef = dataStoreImpl$writeData$1.X;
            ResultKt.b(obj2);
        }
        return new Integer(intRef.X);
    }
}
