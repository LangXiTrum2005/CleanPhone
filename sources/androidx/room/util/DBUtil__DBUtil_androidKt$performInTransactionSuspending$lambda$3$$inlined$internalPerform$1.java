package androidx.room.util;

import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¨\u0006\u0004"}, d2 = {"<anonymous>", "R", "transactor", "Landroidx/room/Transactor;", "androidx/room/util/DBUtil__DBUtilKt$internalPerform$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE, 59, 60, 172}, m = "invokeSuspend")
public final class DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1 extends SuspendLambda implements Function2<Transactor, Continuation<Object>, Object> {
    public Transactor.SQLiteTransactionType X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f8333Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ RoomDatabase e0;
    public final /* synthetic */ Function1 f0;

    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "R", "Landroidx/room/TransactionScope;", "androidx/room/util/DBUtil__DBUtilKt$internalPerform$2$result$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {60}, m = "invokeSuspend")
    public final class AnonymousClass1 extends SuspendLambda implements Function2<TransactionScope<Object>, Continuation<Object>, Object> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public /* synthetic */ Object f8334Y;
        public final /* synthetic */ Function1 Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.Z = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.Z, continuation);
            anonymousClass1.f8334Y = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((TransactionScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
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
            Object objInvoke = this.Z.invoke(this);
            return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1(RoomDatabase roomDatabase, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.e0 = roomDatabase;
        this.f0 = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1(this.e0, continuation, this.f0);
        dBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1.Z = obj;
        return dBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1) create((Transactor) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[PHI: r1 r10
  0x0094: PHI (r1v7 androidx.room.Transactor) = (r1v4 androidx.room.Transactor), (r1v12 androidx.room.Transactor) binds: [B:31:0x0091, B:15:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r10v13 java.lang.Object) = (r10v11 java.lang.Object), (r10v0 java.lang.Object) binds: [B:31:0x0091, B:15:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Transactor.SQLiteTransactionType sQLiteTransactionType;
        Transactor transactor;
        Transactor.SQLiteTransactionType sQLiteTransactionType2;
        Transactor transactor2;
        Transactor transactor3;
        Boolean boolC;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.f8333Y;
        RoomDatabase roomDatabase = this.e0;
        if (i2 == 0) {
            ResultKt.b(obj);
            Transactor transactor4 = (Transactor) this.Z;
            sQLiteTransactionType = Transactor.SQLiteTransactionType.f8253Y;
            this.Z = transactor4;
            this.X = sQLiteTransactionType;
            this.f8333Y = 1;
            Boolean boolC2 = transactor4.c(this);
            if (boolC2 != coroutineSingletons) {
                transactor = transactor4;
                obj = boolC2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            sQLiteTransactionType = this.X;
            transactor = (Transactor) this.Z;
            ResultKt.b(obj);
        } else {
            if (i2 == 2) {
                sQLiteTransactionType = this.X;
                transactor3 = (Transactor) this.Z;
                ResultKt.b(obj);
                sQLiteTransactionType2 = sQLiteTransactionType;
                transactor2 = transactor3;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f0, null);
                this.Z = transactor2;
                this.X = null;
                this.f8333Y = 3;
                obj = transactor2.a(sQLiteTransactionType2, anonymousClass1, this);
                if (obj != coroutineSingletons) {
                    this.Z = obj;
                    this.f8333Y = 4;
                    boolC = transactor2.c(this);
                    if (boolC != coroutineSingletons) {
                        obj2 = obj;
                        obj = boolC;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                transactor2 = (Transactor) this.Z;
                ResultKt.b(obj);
                this.Z = obj;
                this.f8333Y = 4;
                boolC = transactor2.c(this);
                if (boolC != coroutineSingletons) {
                    obj2 = obj;
                    obj = boolC;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            obj2 = this.Z;
            ResultKt.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            roomDatabase.g().b();
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            sQLiteTransactionType2 = sQLiteTransactionType;
            transactor2 = transactor;
            AnonymousClass1 anonymousClass2 = new AnonymousClass1(this.f0, null);
            this.Z = transactor2;
            this.X = null;
            this.f8333Y = 3;
            obj = transactor2.a(sQLiteTransactionType2, anonymousClass2, this);
            if (obj != coroutineSingletons) {
                this.Z = obj;
                this.f8333Y = 4;
                boolC = transactor2.c(this);
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
            this.Z = transactor;
            this.X = sQLiteTransactionType;
            this.f8333Y = 2;
            if (invalidationTrackerG.c(this) != coroutineSingletons) {
                transactor3 = transactor;
                sQLiteTransactionType2 = sQLiteTransactionType;
                transactor2 = transactor3;
                AnonymousClass1 anonymousClass3 = new AnonymousClass1(this.f0, null);
                this.Z = transactor2;
                this.X = null;
                this.f8333Y = 3;
                obj = transactor2.a(sQLiteTransactionType2, anonymousClass3, this);
                if (obj != coroutineSingletons) {
                    this.Z = obj;
                    this.f8333Y = 4;
                    boolC = transactor2.c(this);
                    if (boolC != coroutineSingletons) {
                        obj2 = obj;
                        obj = boolC;
                        if (!((Boolean) obj).booleanValue()) {
                            roomDatabase.g().b();
                        }
                        return obj2;
                    }
                }
            }
        }
        return coroutineSingletons;
    }
}
