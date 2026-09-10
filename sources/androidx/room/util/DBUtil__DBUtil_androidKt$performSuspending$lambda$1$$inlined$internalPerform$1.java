package androidx.room.util;

import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.coroutines.RawConnectionAccessor;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¨\u0006\u0004"}, d2 = {"<anonymous>", "R", "transactor", "Landroidx/room/Transactor;", "androidx/room/util/DBUtil__DBUtilKt$internalPerform$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE, 59, 60}, m = "invokeSuspend")
public final class DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 extends SuspendLambda implements Function2<Transactor, Continuation<Object>, Object> {
    public Transactor.SQLiteTransactionType X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f8337Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ boolean e0;
    public final /* synthetic */ RoomDatabase f0;
    public final /* synthetic */ Function1 g0;

    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "R", "Landroidx/room/TransactionScope;", "androidx/room/util/DBUtil__DBUtilKt$internalPerform$2$result$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
    public final class AnonymousClass1 extends SuspendLambda implements Function2<TransactionScope<Object>, Continuation<Object>, Object> {
        public /* synthetic */ Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ Function1 f8338Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f8338Y = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f8338Y, continuation);
            anonymousClass1.X = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((TransactionScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            ResultKt.b(obj);
            TransactionScope transactionScope = (TransactionScope) this.X;
            Intrinsics.d(transactionScope, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
            return this.f8338Y.invoke(((RawConnectionAccessor) transactionScope).getF8287b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(RoomDatabase roomDatabase, Continuation continuation, Function1 function1, boolean z2) {
        super(2, continuation);
        this.e0 = z2;
        this.f0 = roomDatabase;
        this.g0 = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(this.f0, continuation, this.g0, this.e0);
        dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1.Z = obj;
        return dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1) create((Transactor) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[PHI: r1 r9
  0x0072: PHI (r1v6 androidx.room.Transactor) = (r1v3 androidx.room.Transactor), (r1v10 androidx.room.Transactor) binds: [B:23:0x006f, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0072: PHI (r9v14 java.lang.Object) = (r9v12 java.lang.Object), (r9v0 java.lang.Object) binds: [B:23:0x006f, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Transactor.SQLiteTransactionType sQLiteTransactionType;
        Transactor.SQLiteTransactionType sQLiteTransactionType2;
        Transactor transactor;
        Transactor transactor2;
        Boolean boolC;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.f8337Y;
        Function1 function1 = this.g0;
        if (i2 == 0) {
            ResultKt.b(obj);
            Transactor transactor3 = (Transactor) this.Z;
            Intrinsics.d(transactor3, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
            return function1.invoke(((RawConnectionAccessor) transactor3).getF8287b());
        }
        RoomDatabase roomDatabase = this.f0;
        if (i2 != 1) {
            if (i2 == 2) {
                sQLiteTransactionType = this.X;
                transactor2 = (Transactor) this.Z;
                ResultKt.b(obj);
            } else {
                if (i2 == 3) {
                    transactor = (Transactor) this.Z;
                    ResultKt.b(obj);
                    if (this.e0) {
                        return obj;
                    }
                    this.Z = obj;
                    this.f8337Y = 4;
                    boolC = transactor.c(this);
                    if (boolC != coroutineSingletons) {
                        obj2 = obj;
                        obj = boolC;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.Z;
                ResultKt.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                roomDatabase.g().b();
            }
            return obj2;
        }
        sQLiteTransactionType = this.X;
        Transactor transactor4 = (Transactor) this.Z;
        ResultKt.b(obj);
        if (((Boolean) obj).booleanValue()) {
            sQLiteTransactionType2 = sQLiteTransactionType;
            transactor = transactor4;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(function1, null);
            this.Z = transactor;
            this.X = null;
            this.f8337Y = 3;
            obj = transactor.a(sQLiteTransactionType2, anonymousClass1, this);
            if (obj != coroutineSingletons) {
                if (this.e0) {
                    return obj;
                }
                this.Z = obj;
                this.f8337Y = 4;
                boolC = transactor.c(this);
                if (boolC != coroutineSingletons) {
                    obj2 = obj;
                    obj = boolC;
                    if (!((Boolean) obj).booleanValue()) {
                        roomDatabase.g().b();
                    }
                    return obj2;
                }
            }
        } else {
            InvalidationTracker invalidationTrackerG = roomDatabase.g();
            this.Z = transactor4;
            this.X = sQLiteTransactionType;
            this.f8337Y = 2;
            if (invalidationTrackerG.c(this) != coroutineSingletons) {
                transactor2 = transactor4;
            }
        }
        return coroutineSingletons;
        sQLiteTransactionType2 = sQLiteTransactionType;
        transactor = transactor2;
        AnonymousClass1 anonymousClass2 = new AnonymousClass1(function1, null);
        this.Z = transactor;
        this.X = null;
        this.f8337Y = 3;
        obj = transactor.a(sQLiteTransactionType2, anonymousClass2, this);
        if (obj != coroutineSingletons) {
            if (this.e0) {
                return obj;
            }
            this.Z = obj;
            this.f8337Y = 4;
            boolC = transactor.c(this);
            if (boolC != coroutineSingletons) {
                obj2 = obj;
                obj = boolC;
                if (!((Boolean) obj).booleanValue()) {
                    roomDatabase.g().b();
                }
                return obj2;
            }
        }
        return coroutineSingletons;
    }
}
