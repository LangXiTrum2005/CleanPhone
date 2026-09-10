package androidx.room;

import androidx.room.concurrent.CloseBarrier;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/TriggerBasedInvalidationTracker;", "", "Companion", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TriggerBasedInvalidationTracker {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f8254l = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f8255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f8256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f8257c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f8258e;
    public final String[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ObservedTableStates f8259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ObservedTableVersions f8260i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public Function0 k = new e(0);
    public final LinkedHashMap f = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Landroidx/room/TriggerBasedInvalidationTracker$Companion;", "", "", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "Ljava/lang/String;", "TABLE_ID_COLUMN_NAME", "INVALIDATED_COLUMN_NAME", "CREATE_TRACKING_TABLE_SQL", "DROP_TRACKING_TABLE_SQL", "SELECT_UPDATED_TABLES_SQL", "RESET_UPDATED_TABLES_SQL", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public TriggerBasedInvalidationTracker(WorkDatabase_Impl workDatabase_Impl, HashMap map, HashMap map2, String[] strArr, boolean z2, Function1 function1) {
        String lowerCase;
        this.f8255a = workDatabase_Impl;
        this.f8256b = map;
        this.f8257c = map2;
        this.d = z2;
        this.f8258e = function1;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            Intrinsics.e(lowerCase2, "toLowerCase(...)");
            this.f.put(lowerCase2, Integer.valueOf(i2));
            String str2 = (String) this.f8256b.get(strArr[i2]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                Intrinsics.e(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i2] = lowerCase2;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.f8256b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            Intrinsics.e(lowerCase3, "toLowerCase(...)");
            if (this.f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                Intrinsics.e(lowerCase4, "toLowerCase(...)");
                LinkedHashMap linkedHashMap = this.f;
                linkedHashMap.put(lowerCase4, MapsKt.f(linkedHashMap, lowerCase3));
            }
        }
        this.f8259h = new ObservedTableStates(this.g.length);
        this.f8260i = new ObservedTableVersions(this.g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, PooledConnection pooledConnection, ContinuationImpl continuationImpl) {
        TriggerBasedInvalidationTracker$checkInvalidatedTables$1 triggerBasedInvalidationTracker$checkInvalidatedTables$1;
        triggerBasedInvalidationTracker.getClass();
        if (continuationImpl instanceof TriggerBasedInvalidationTracker$checkInvalidatedTables$1) {
            triggerBasedInvalidationTracker$checkInvalidatedTables$1 = (TriggerBasedInvalidationTracker$checkInvalidatedTables$1) continuationImpl;
            int i2 = triggerBasedInvalidationTracker$checkInvalidatedTables$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$checkInvalidatedTables$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                triggerBasedInvalidationTracker$checkInvalidatedTables$1 = new TriggerBasedInvalidationTracker$checkInvalidatedTables$1(triggerBasedInvalidationTracker, continuationImpl);
            }
        } else {
            triggerBasedInvalidationTracker$checkInvalidatedTables$1 = new TriggerBasedInvalidationTracker$checkInvalidatedTables$1(triggerBasedInvalidationTracker, continuationImpl);
        }
        Object objB = triggerBasedInvalidationTracker$checkInvalidatedTables$1.f8261Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = triggerBasedInvalidationTracker$checkInvalidatedTables$1.e0;
        if (i3 == 0) {
            ResultKt.b(objB);
            d dVar = new d(1);
            triggerBasedInvalidationTracker$checkInvalidatedTables$1.X = pooledConnection;
            triggerBasedInvalidationTracker$checkInvalidatedTables$1.e0 = 1;
            objB = pooledConnection.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1", dVar, triggerBasedInvalidationTracker$checkInvalidatedTables$1);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = (Set) triggerBasedInvalidationTracker$checkInvalidatedTables$1.X;
            ResultKt.b(objB);
            return set;
        }
        pooledConnection = (PooledConnection) triggerBasedInvalidationTracker$checkInvalidatedTables$1.X;
        ResultKt.b(objB);
        Set set2 = (Set) objB;
        if (!set2.isEmpty()) {
            triggerBasedInvalidationTracker$checkInvalidatedTables$1.X = set2;
            triggerBasedInvalidationTracker$checkInvalidatedTables$1.e0 = 2;
            if (TransactorKt.a(pooledConnection, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", triggerBasedInvalidationTracker$checkInvalidatedTables$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (androidx.room.TransactorKt.a(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        if (androidx.room.TransactorKt.a(r11, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00db, code lost:
    
        return r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d9 -> B:28:0x00dc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.room.TriggerBasedInvalidationTracker r17, androidx.room.Transactor r18, int r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.b(androidx.room.TriggerBasedInvalidationTracker, androidx.room.Transactor, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:18:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0082 -> B:19:0x0085). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(androidx.room.TriggerBasedInvalidationTracker r8, androidx.room.Transactor r9, int r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1
            if (r0 == 0) goto L16
            r0 = r11
            androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1) r0
            int r1 = r0.i0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.i0 = r1
            goto L1b
        L16:
            androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.g0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r2 = r0.i0
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f0
            int r9 = r0.e0
            java.lang.String[] r10 = r0.Z
            java.lang.String r2 = r0.f8271Y
            androidx.room.PooledConnection r4 = r0.X
            kotlin.ResultKt.b(r11)
            r11 = r10
            r10 = r4
            goto L85
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            kotlin.ResultKt.b(r11)
            java.lang.String[] r8 = r8.g
            r8 = r8[r10]
            java.lang.String[] r10 = androidx.room.TriggerBasedInvalidationTracker.f8254l
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L50:
            if (r9 >= r8) goto L87
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r6 = 96
            java.lang.String r4 = androidx.media3.extractor.text.ttml.a.i(r6, r5, r4)
            r0.X = r10
            r0.f8271Y = r2
            r0.Z = r11
            r0.e0 = r9
            r0.f0 = r8
            r0.i0 = r3
            java.lang.Object r4 = androidx.room.TransactorKt.a(r10, r4, r0)
            if (r4 != r1) goto L85
            return r1
        L85:
            int r9 = r9 + r3
            goto L50
        L87:
            kotlin.Unit r8 = kotlin.Unit.f43263a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.c(androidx.room.TriggerBasedInvalidationTracker, androidx.room.Transactor, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ContinuationImpl continuationImpl) throws Throwable {
        TriggerBasedInvalidationTracker$notifyInvalidation$1 triggerBasedInvalidationTracker$notifyInvalidation$1;
        CloseBarrier closeBarrier;
        if (continuationImpl instanceof TriggerBasedInvalidationTracker$notifyInvalidation$1) {
            triggerBasedInvalidationTracker$notifyInvalidation$1 = (TriggerBasedInvalidationTracker$notifyInvalidation$1) continuationImpl;
            int i2 = triggerBasedInvalidationTracker$notifyInvalidation$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$notifyInvalidation$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                triggerBasedInvalidationTracker$notifyInvalidation$1 = new TriggerBasedInvalidationTracker$notifyInvalidation$1(this, continuationImpl);
            }
        } else {
            triggerBasedInvalidationTracker$notifyInvalidation$1 = new TriggerBasedInvalidationTracker$notifyInvalidation$1(this, continuationImpl);
        }
        Object objM = triggerBasedInvalidationTracker$notifyInvalidation$1.f8265Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = triggerBasedInvalidationTracker$notifyInvalidation$1.e0;
        if (i3 == 0) {
            ResultKt.b(objM);
            WorkDatabase_Impl workDatabase_Impl = this.f8255a;
            CloseBarrier closeBarrier2 = workDatabase_Impl.g;
            boolean zA = closeBarrier2.a();
            EmptySet emptySet = EmptySet.X;
            if (!zA) {
                return emptySet;
            }
            try {
                if (!this.j.compareAndSet(true, false)) {
                    closeBarrier2.b();
                    return emptySet;
                }
                if (!((Boolean) this.k.invoke()).booleanValue()) {
                    closeBarrier2.b();
                    return emptySet;
                }
                TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 = new TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1(this, null);
                triggerBasedInvalidationTracker$notifyInvalidation$1.X = closeBarrier2;
                triggerBasedInvalidationTracker$notifyInvalidation$1.e0 = 1;
                objM = workDatabase_Impl.m(false, triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1, triggerBasedInvalidationTracker$notifyInvalidation$1);
                if (objM == coroutineSingletons) {
                    return coroutineSingletons;
                }
                closeBarrier = closeBarrier2;
            } catch (Throwable th) {
                th = th;
                closeBarrier = closeBarrier2;
                closeBarrier.b();
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeBarrier = triggerBasedInvalidationTracker$notifyInvalidation$1.X;
            try {
                ResultKt.b(objM);
            } catch (Throwable th2) {
                th = th2;
                closeBarrier.b();
                throw th;
            }
        }
        Set set = (Set) objM;
        if (!set.isEmpty()) {
            this.f8260i.a(set);
            ((InvalidationTracker$implementation$1) this.f8258e).invoke(set);
        }
        closeBarrier.b();
        return set;
    }

    public final void e(a onRefreshScheduled, a onRefreshCompleted) {
        Intrinsics.f(onRefreshScheduled, "onRefreshScheduled");
        Intrinsics.f(onRefreshCompleted, "onRefreshCompleted");
        if (this.j.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            ContextScope contextScope = this.f8255a.f8217a;
            if (contextScope != null) {
                BuildersKt.c(contextScope, new CoroutineName("Room Invalidation Tracker Refresh"), null, new TriggerBasedInvalidationTracker$refreshInvalidationAsync$3(this, onRefreshCompleted, null), 2);
            } else {
                Intrinsics.m("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ContinuationImpl continuationImpl) throws Throwable {
        TriggerBasedInvalidationTracker$syncTriggers$1 triggerBasedInvalidationTracker$syncTriggers$1;
        CloseBarrier closeBarrier;
        if (continuationImpl instanceof TriggerBasedInvalidationTracker$syncTriggers$1) {
            triggerBasedInvalidationTracker$syncTriggers$1 = (TriggerBasedInvalidationTracker$syncTriggers$1) continuationImpl;
            int i2 = triggerBasedInvalidationTracker$syncTriggers$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$syncTriggers$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                triggerBasedInvalidationTracker$syncTriggers$1 = new TriggerBasedInvalidationTracker$syncTriggers$1(this, continuationImpl);
            }
        } else {
            triggerBasedInvalidationTracker$syncTriggers$1 = new TriggerBasedInvalidationTracker$syncTriggers$1(this, continuationImpl);
        }
        Object obj = triggerBasedInvalidationTracker$syncTriggers$1.f8272Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = triggerBasedInvalidationTracker$syncTriggers$1.e0;
        if (i3 == 0) {
            ResultKt.b(obj);
            WorkDatabase_Impl workDatabase_Impl = this.f8255a;
            CloseBarrier closeBarrier2 = workDatabase_Impl.g;
            if (closeBarrier2.a()) {
                try {
                    TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1(this, null);
                    triggerBasedInvalidationTracker$syncTriggers$1.X = closeBarrier2;
                    triggerBasedInvalidationTracker$syncTriggers$1.e0 = 1;
                    if (workDatabase_Impl.m(false, triggerBasedInvalidationTracker$syncTriggers$2$1, triggerBasedInvalidationTracker$syncTriggers$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    closeBarrier = closeBarrier2;
                    closeBarrier.b();
                } catch (Throwable th) {
                    th = th;
                    closeBarrier = closeBarrier2;
                    closeBarrier.b();
                    throw th;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeBarrier = triggerBasedInvalidationTracker$syncTriggers$1.X;
            try {
                ResultKt.b(obj);
                closeBarrier.b();
            } catch (Throwable th2) {
                th = th2;
                closeBarrier.b();
                throw th;
            }
        }
        return Unit.f43263a;
    }

    public final Pair g(String[] names) {
        Intrinsics.f(names, "names");
        SetBuilder setBuilder = new SetBuilder();
        for (String str : names) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.e(lowerCase, "toLowerCase(...)");
            Set set = (Set) this.f8257c.get(lowerCase);
            if (set != null) {
                setBuilder.addAll(set);
            } else {
                setBuilder.add(str);
            }
        }
        String[] strArr = (String[]) SetsKt.a(setBuilder).toArray(new String[0]);
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = strArr[i2];
            LinkedHashMap linkedHashMap = this.f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            Intrinsics.e(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) linkedHashMap.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i2] = num.intValue();
        }
        return new Pair(strArr, iArr);
    }
}
