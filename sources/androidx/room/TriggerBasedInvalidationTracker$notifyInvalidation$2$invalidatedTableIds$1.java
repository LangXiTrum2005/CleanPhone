package androidx.room;

import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "", "connection", "Landroidx/room/Transactor;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", f = "InvalidationTracker.kt", l = {418, 425}, m = "invokeSuspend")
final class TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 extends SuspendLambda implements Function2<Transactor, Continuation<? super Set<? extends Integer>>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f8266Y;
    public final /* synthetic */ TriggerBasedInvalidationTracker Z;

    /* JADX INFO: renamed from: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "", "Landroidx/room/TransactionScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", f = "InvalidationTracker.kt", l = {426}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function2<TransactionScope<Set<? extends Integer>>, Continuation<? super Set<? extends Integer>>, Object> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public /* synthetic */ Object f8267Y;
        public final /* synthetic */ TriggerBasedInvalidationTracker Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Continuation continuation) {
            super(2, continuation);
            this.Z = triggerBasedInvalidationTracker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.Z, continuation);
            anonymousClass1.f8267Y = obj;
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
            TransactionScope transactionScope = (TransactionScope) this.f8267Y;
            this.X = 1;
            Object objA = TriggerBasedInvalidationTracker.a(this.Z, transactionScope, this);
            return objA == coroutineSingletons ? coroutineSingletons : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Continuation continuation) {
        super(2, continuation);
        this.Z = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 = new TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1(this.Z, continuation);
        triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1.f8266Y = obj;
        return triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1) create((Transactor) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r1 = r7.X
            kotlin.collections.EmptySet r2 = kotlin.collections.EmptySet.X
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.b(r8)     // Catch: android.database.SQLException -> L56
            goto L53
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.f8266Y
            androidx.room.Transactor r1 = (androidx.room.Transactor) r1
            kotlin.ResultKt.b(r8)
            goto L35
        L22:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.f8266Y
            r1 = r8
            androidx.room.Transactor r1 = (androidx.room.Transactor) r1
            r7.f8266Y = r1
            r7.X = r4
            java.lang.Boolean r8 = r1.c(r7)
            if (r8 != r0) goto L35
            goto L52
        L35:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L3e
            goto L56
        L3e:
            androidx.room.Transactor$SQLiteTransactionType r8 = androidx.room.Transactor.SQLiteTransactionType.f8253Y     // Catch: android.database.SQLException -> L56
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1 r4 = new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1     // Catch: android.database.SQLException -> L56
            androidx.room.TriggerBasedInvalidationTracker r5 = r7.Z     // Catch: android.database.SQLException -> L56
            r6 = 0
            r4.<init>(r5, r6)     // Catch: android.database.SQLException -> L56
            r7.f8266Y = r6     // Catch: android.database.SQLException -> L56
            r7.X = r3     // Catch: android.database.SQLException -> L56
            java.lang.Object r8 = r1.a(r8, r4, r7)     // Catch: android.database.SQLException -> L56
            if (r8 != r0) goto L53
        L52:
            return r0
        L53:
            java.util.Set r8 = (java.util.Set) r8     // Catch: android.database.SQLException -> L56
            return r8
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
