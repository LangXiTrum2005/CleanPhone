package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.util.Log;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.concurrent.CloseBarrier;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.room.migration.Migration;
import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.room.support.PrePackagedCopyOpenHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Landroidx/room/RoomDatabase;", "", "JournalMode", "Builder", "MigrationContainer", "Callback", "PrepackagedDatabaseCallback", "QueryCallback", "Companion", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ContextScope f8217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CoroutineContext f8218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f8219c;
    public TransactionExecutor d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RoomConnectionManager f8220e;
    public InvalidationTracker f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8221h;
    public final CloseBarrier g = new CloseBarrier(new RoomDatabase$closeBarrier$1(0, this, RoomDatabase.class, "onClosed", "onClosed()V", 0));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ThreadLocal f8222i = new ThreadLocal();
    public final LinkedHashMap j = new LinkedHashMap();
    public boolean k = true;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/RoomDatabase;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class Builder<T extends RoomDatabase> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f8224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f8225c;
        public Executor f;
        public Executor g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public SupportSQLiteOpenHelper.Factory f8227h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f8228i;
        public boolean q;
        public final ArrayList d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f8226e = new ArrayList();
        public final JournalMode j = JournalMode.X;
        public final long k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final MigrationContainer f8229l = new MigrationContainer();
        public final LinkedHashSet m = new LinkedHashSet();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final LinkedHashSet f8230n = new LinkedHashSet();
        public final ArrayList o = new ArrayList();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f8231p = true;
        public final boolean r = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KClass f8223a = JvmClassMappingKt.e(WorkDatabase.class);

        public Builder(Context context, String str) {
            this.f8224b = context;
            this.f8225c = str;
        }

        public final void a(Migration... migrationArr) {
            for (Migration migration : migrationArr) {
                LinkedHashSet linkedHashSet = this.f8230n;
                linkedHashSet.add(Integer.valueOf(migration.f8314a));
                linkedHashSet.add(Integer.valueOf(migration.f8315b));
            }
            Migration[] migrations = (Migration[]) Arrays.copyOf(migrationArr, migrationArr.length);
            MigrationContainer migrationContainer = this.f8229l;
            migrationContainer.getClass();
            Intrinsics.f(migrations, "migrations");
            for (Migration migration2 : migrations) {
                Intrinsics.f(migration2, "migration");
                LinkedHashMap linkedHashMap = migrationContainer.f8233a;
                Integer numValueOf = Integer.valueOf(migration2.f8314a);
                Object treeMap = linkedHashMap.get(numValueOf);
                if (treeMap == null) {
                    treeMap = new TreeMap();
                    linkedHashMap.put(numValueOf, treeMap);
                }
                TreeMap treeMap2 = (TreeMap) treeMap;
                int i2 = migration2.f8315b;
                if (treeMap2.containsKey(Integer.valueOf(i2))) {
                    Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + migration2);
                }
                treeMap2.put(Integer.valueOf(i2), migration2);
            }
        }

        public final RoomDatabase b() {
            String name;
            CoroutineContext coroutineContextPlus;
            Executor executor = this.f;
            if (executor == null && this.g == null) {
                androidx.arch.core.executor.a aVar = ArchTaskExecutor.f3675c;
                this.g = aVar;
                this.f = aVar;
            } else if (executor != null && this.g == null) {
                this.g = executor;
            } else if (executor == null) {
                this.f = this.g;
            }
            LinkedHashSet migrationStartAndEndVersions = this.f8230n;
            LinkedHashSet migrationsNotRequiredFrom = this.m;
            Intrinsics.f(migrationStartAndEndVersions, "migrationStartAndEndVersions");
            Intrinsics.f(migrationsNotRequiredFrom, "migrationsNotRequiredFrom");
            if (!migrationStartAndEndVersions.isEmpty()) {
                Iterator it = migrationStartAndEndVersions.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(android.support.v4.media.a.h(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ").toString());
                    }
                }
            }
            SupportSQLiteOpenHelper.Factory frameworkSQLiteOpenHelperFactory = this.f8227h;
            if (frameworkSQLiteOpenHelperFactory == null) {
                frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            }
            SupportSQLiteOpenHelper.Factory factory = frameworkSQLiteOpenHelperFactory;
            if (this.k > 0) {
                if (this.f8225c != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            ArrayList arrayList = this.d;
            boolean z2 = this.f8228i;
            JournalMode journalMode = this.j;
            journalMode.getClass();
            Context context = this.f8224b;
            Intrinsics.f(context, "context");
            if (journalMode == JournalMode.X) {
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                journalMode = (activityManager == null || activityManager.isLowRamDevice()) ? JournalMode.f8232Y : JournalMode.Z;
            }
            Executor executor2 = this.f;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor3 = this.g;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, this.f8225c, factory, this.f8229l, arrayList, z2, journalMode, executor2, executor3, null, this.f8231p, this.q, migrationsNotRequiredFrom, null, null, null, null, this.f8226e, this.o, false, null, null);
            databaseConfiguration.f8177w = this.r;
            Class clsB = JvmClassMappingKt.b(this.f8223a);
            Package r4 = clsB.getPackage();
            if (r4 == null || (name = r4.getName()) == null) {
                name = "";
            }
            String canonicalName = clsB.getCanonicalName();
            Intrinsics.c(canonicalName);
            if (name.length() != 0) {
                canonicalName = canonicalName.substring(name.length() + 1);
                Intrinsics.e(canonicalName, "substring(...)");
            }
            String strConcat = StringsKt.H(canonicalName, '.', '_').concat("_Impl");
            try {
                Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsB.getClassLoader());
                Intrinsics.d(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
                RoomDatabase roomDatabase = (RoomDatabase) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                roomDatabase.getClass();
                roomDatabase.k = databaseConfiguration.f8177w;
                try {
                    throw new NotImplementedError();
                } catch (NotImplementedError unused) {
                    roomDatabase.f8220e = new RoomConnectionManager(databaseConfiguration, new b(roomDatabase, 1), new RoomDatabase$createConnectionManager$2(2, roomDatabase, RoomDatabaseKt__RoomDatabase_androidKt.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1));
                    roomDatabase.f = roomDatabase.d();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Set setL0 = CollectionsKt.l0(new ArrayList(CollectionsKt.n(EmptySet.X, 10)));
                    List list = databaseConfiguration.s;
                    int size = list.size();
                    boolean[] zArr = new boolean[size];
                    Iterator it2 = setL0.iterator();
                    while (true) {
                        int i2 = -1;
                        if (!it2.hasNext()) {
                            int size2 = list.size() - 1;
                            if (size2 >= 0) {
                                while (true) {
                                    int i3 = size2 - 1;
                                    if (size2 >= size || !zArr[size2]) {
                                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                    }
                                    if (i3 < 0) {
                                        break;
                                    }
                                    size2 = i3;
                                }
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.h(linkedHashMap.size()));
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                linkedHashMap2.put(JvmClassMappingKt.b((KClass) entry.getKey()), entry.getValue());
                            }
                            Set<Map.Entry> setEntrySet = EmptyMap.X.entrySet();
                            int iH = MapsKt.h(CollectionsKt.n(setEntrySet, 10));
                            if (iH < 16) {
                                iH = 16;
                            }
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(iH);
                            for (Map.Entry entry2 : setEntrySet) {
                                Class cls2 = (Class) entry2.getKey();
                                List list2 = (List) entry2.getValue();
                                KClass kClassE = JvmClassMappingKt.e(cls2);
                                List list3 = list2;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.n(list3, 10));
                                Iterator it3 = list3.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(JvmClassMappingKt.e((Class) it3.next()));
                                }
                                linkedHashMap3.put(kClassE, arrayList2);
                            }
                            List list4 = databaseConfiguration.r;
                            boolean[] zArr2 = new boolean[list4.size()];
                            for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                                KClass kClass = (KClass) entry3.getKey();
                                for (KClass kclass : (List) entry3.getValue()) {
                                    int size3 = list4.size() - 1;
                                    if (size3 < 0) {
                                        size3 = -1;
                                        break;
                                    }
                                    while (true) {
                                        int i4 = size3 - 1;
                                        if (kclass.e(list4.get(size3))) {
                                            zArr2[size3] = true;
                                            break;
                                        }
                                        if (i4 < 0) {
                                            size3 = -1;
                                            break;
                                        }
                                        size3 = i4;
                                    }
                                    if (size3 < 0) {
                                        throw new IllegalArgumentException(("A required type converter (" + kclass.k() + ") for " + kClass.k() + " is missing in the database configuration.").toString());
                                    }
                                    Object converter = list4.get(size3);
                                    Intrinsics.f(kclass, "kclass");
                                    Intrinsics.f(converter, "converter");
                                    roomDatabase.j.put(kclass, converter);
                                }
                            }
                            int size4 = list4.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i5 = size4 - 1;
                                    if (!zArr2[size4]) {
                                        throw new IllegalArgumentException("Unexpected type converter " + list4.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i5 < 0) {
                                        break;
                                    }
                                    size4 = i5;
                                }
                            }
                            CoroutineContext coroutineContext = databaseConfiguration.v;
                            if (coroutineContext != null) {
                                CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.Key.X);
                                Intrinsics.d(element, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
                                CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) element;
                                Executor executorA = ExecutorsKt.a(coroutineDispatcher);
                                roomDatabase.f8219c = executorA;
                                roomDatabase.d = new TransactionExecutor(executorA);
                                roomDatabase.f8217a = CoroutineScopeKt.a(coroutineContext.plus(SupervisorKt.a((Job) coroutineContext.get(Job.Key.X))));
                                if (roomDatabase.i()) {
                                    ContextScope contextScope = roomDatabase.f8217a;
                                    if (contextScope == null) {
                                        Intrinsics.m("coroutineScope");
                                        throw null;
                                    }
                                    coroutineContextPlus = contextScope.X.plus(coroutineDispatcher.e0(1));
                                } else {
                                    ContextScope contextScope2 = roomDatabase.f8217a;
                                    if (contextScope2 == null) {
                                        Intrinsics.m("coroutineScope");
                                        throw null;
                                    }
                                    coroutineContextPlus = contextScope2.X;
                                }
                                roomDatabase.f8218b = coroutineContextPlus;
                            } else {
                                roomDatabase.f8219c = databaseConfiguration.f8171h;
                                roomDatabase.d = new TransactionExecutor(databaseConfiguration.f8172i);
                                Executor executor4 = roomDatabase.f8219c;
                                if (executor4 == null) {
                                    Intrinsics.m("internalQueryExecutor");
                                    throw null;
                                }
                                ContextScope contextScopeA = CoroutineScopeKt.a(ExecutorsKt.b(executor4).plus(SupervisorKt.b()));
                                roomDatabase.f8217a = contextScopeA;
                                TransactionExecutor transactionExecutor = roomDatabase.d;
                                if (transactionExecutor == null) {
                                    Intrinsics.m("internalTransactionExecutor");
                                    throw null;
                                }
                                roomDatabase.f8218b = contextScopeA.X.plus(ExecutorsKt.b(transactionExecutor));
                            }
                            roomDatabase.f8221h = databaseConfiguration.f;
                            RoomConnectionManager roomConnectionManager = roomDatabase.f8220e;
                            if (roomConnectionManager == null) {
                                Intrinsics.m("connectionManager");
                                throw null;
                            }
                            SupportSQLiteOpenHelper delegate = roomConnectionManager.f8215c;
                            if (delegate == null) {
                                delegate = null;
                                break;
                            }
                            while (!(delegate instanceof PrePackagedCopyOpenHelper)) {
                                if (!(delegate instanceof DelegatingOpenHelper)) {
                                    delegate = null;
                                    break;
                                }
                                delegate = ((DelegatingOpenHelper) delegate).getDelegate();
                            }
                            RoomConnectionManager roomConnectionManager2 = roomDatabase.f8220e;
                            if (roomConnectionManager2 == null) {
                                Intrinsics.m("connectionManager");
                                throw null;
                            }
                            SupportSQLiteOpenHelper delegate2 = roomConnectionManager2.f8215c;
                            if (delegate2 == null) {
                                delegate2 = null;
                                break;
                            }
                            while (!(delegate2 instanceof AutoClosingRoomOpenHelper)) {
                                if (!(delegate2 instanceof DelegatingOpenHelper)) {
                                    delegate2 = null;
                                    break;
                                }
                                delegate2 = ((DelegatingOpenHelper) delegate2).getDelegate();
                            }
                            if (((AutoClosingRoomOpenHelper) delegate2) != null) {
                                throw null;
                            }
                            Intent intent = databaseConfiguration.j;
                            if (intent != null) {
                                String str = databaseConfiguration.f8168b;
                                if (str == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                InvalidationTracker invalidationTrackerG = roomDatabase.g();
                                Context context2 = databaseConfiguration.f8167a;
                                Intrinsics.f(context2, "context");
                                invalidationTrackerG.f8185h = intent;
                                invalidationTrackerG.f8186i = new MultiInstanceInvalidationClient(context2, str, invalidationTrackerG);
                            }
                            return roomDatabase;
                        }
                        KClass kClass2 = (KClass) it2.next();
                        int size5 = list.size() - 1;
                        if (size5 >= 0) {
                            while (true) {
                                int i6 = size5 - 1;
                                if (kClass2.e(list.get(size5))) {
                                    zArr[size5] = true;
                                    i2 = size5;
                                    break;
                                }
                                if (i6 < 0) {
                                    break;
                                }
                                size5 = i6;
                            }
                        }
                        if (i2 < 0) {
                            throw new IllegalArgumentException(("A required auto migration spec (" + kClass2.k() + ") is missing in the database configuration.").toString());
                        }
                        linkedHashMap.put(kClass2, list.get(i2));
                    }
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Cannot find implementation for " + clsB.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot access the constructor " + clsB.getCanonicalName(), e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException("Failed to create an instance of " + clsB.getCanonicalName(), e4);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomDatabase$Callback;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Callback {
        public void a(SupportSQLiteDatabase db) {
            Intrinsics.f(db, "db");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/RoomDatabase$Companion;", "", "", "MAX_BIND_PARAMETER_CNT", "I", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class JournalMode {
        public static final JournalMode X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final JournalMode f8232Y;
        public static final JournalMode Z;
        public static final /* synthetic */ JournalMode[] e0;
        public static final /* synthetic */ EnumEntries f0;

        static {
            JournalMode journalMode = new JournalMode("AUTOMATIC", 0);
            X = journalMode;
            JournalMode journalMode2 = new JournalMode("TRUNCATE", 1);
            f8232Y = journalMode2;
            JournalMode journalMode3 = new JournalMode("WRITE_AHEAD_LOGGING", 2);
            Z = journalMode3;
            JournalMode[] journalModeArr = {journalMode, journalMode2, journalMode3};
            e0 = journalModeArr;
            f0 = EnumEntriesKt.a(journalModeArr);
        }

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) e0.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomDatabase$MigrationContainer;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class MigrationContainer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f8233a = new LinkedHashMap();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class PrepackagedDatabaseCallback {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/room/RoomDatabase$QueryCallback;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface QueryCallback {
    }

    public final void a() {
        if (this.f8221h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!i() || j()) {
            return;
        }
        CoroutineContext coroutineContext = (CoroutineContext) this.f8222i.get();
        if ((coroutineContext != null ? (TransactionElement) coroutineContext.get(TransactionElement.f8251Y) : null) != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        SupportSQLiteDatabase writableDatabase = h().getWritableDatabase();
        if (!writableDatabase.v()) {
            RunBlockingUninterruptible_androidKt.a(new InvalidationTracker$syncBlocking$1(g(), null));
        }
        if (writableDatabase.K0()) {
            writableDatabase.O();
        } else {
            writableDatabase.x();
        }
    }

    public abstract InvalidationTracker d();

    public SupportSQLiteOpenHelper e(DatabaseConfiguration config) {
        Intrinsics.f(config, "config");
        throw new NotImplementedError();
    }

    public final void f() {
        h().getWritableDatabase().R();
        if (j()) {
            return;
        }
        InvalidationTracker invalidationTrackerG = g();
        invalidationTrackerG.f8183c.e(invalidationTrackerG.f, invalidationTrackerG.g);
    }

    public final InvalidationTracker g() {
        InvalidationTracker invalidationTracker = this.f;
        if (invalidationTracker != null) {
            return invalidationTracker;
        }
        Intrinsics.m("internalTracker");
        throw null;
    }

    public final SupportSQLiteOpenHelper h() {
        RoomConnectionManager roomConnectionManager = this.f8220e;
        if (roomConnectionManager == null) {
            Intrinsics.m("connectionManager");
            throw null;
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = roomConnectionManager.f8215c;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final boolean i() {
        RoomConnectionManager roomConnectionManager = this.f8220e;
        if (roomConnectionManager != null) {
            return roomConnectionManager.f8215c != null;
        }
        Intrinsics.m("connectionManager");
        throw null;
    }

    public final boolean j() {
        return k() && h().getWritableDatabase().v();
    }

    public final boolean k() {
        RoomConnectionManager roomConnectionManager = this.f8220e;
        if (roomConnectionManager == null) {
            Intrinsics.m("connectionManager");
            throw null;
        }
        SupportSQLiteDatabase supportSQLiteDatabase = roomConnectionManager.d;
        if (supportSQLiteDatabase != null) {
            return supportSQLiteDatabase.isOpen();
        }
        return false;
    }

    public final void l() {
        h().getWritableDatabase().N();
    }

    public final Object m(boolean z2, Function2 function2, ContinuationImpl continuationImpl) {
        RoomConnectionManager roomConnectionManager = this.f8220e;
        if (roomConnectionManager != null) {
            return roomConnectionManager.f8214b.x0(z2, function2, continuationImpl);
        }
        Intrinsics.m("connectionManager");
        throw null;
    }
}
