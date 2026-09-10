package androidx.work.impl;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.support.v4.media.a;
import android.text.TextUtils;
import androidx.arch.core.util.Function;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.EnqueueRunnable;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.PreferenceUtils;
import androidx.work.impl.utils.SerialExecutor;
import androidx.work.impl.utils.StartWorkRunnable;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.charging.screenshow.battery.animations.themes.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public class WorkManagerImpl extends WorkManager {
    public static WorkManagerImpl j;
    public static WorkManagerImpl k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f8683l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f8685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkDatabase f8686c;
    public final WorkManagerTaskExecutor d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f8687e;
    public final Processor f;
    public final PreferenceUtils g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f8689i;

    /* JADX INFO: renamed from: androidx.work.impl.WorkManagerImpl$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r1 = this;
                r0 = 0
                throw r0     // Catch: java.lang.Throwable -> L2
            L2:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.WorkManagerImpl.AnonymousClass1.run():void");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkManagerImpl$2, reason: invalid class name */
    class AnonymousClass2 implements Function<List<WorkSpec.WorkInfoPojo>, WorkInfo> {
        @Override // androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            List list = (List) obj;
            if (list == null || list.size() <= 0) {
                return null;
            }
            return ((WorkSpec.WorkInfoPojo) list.get(0)).a();
        }
    }

    static {
        Logger.e("WorkManagerImpl");
        j = null;
        k = null;
        f8683l = new Object();
    }

    public WorkManagerImpl(Context context, Configuration configuration, WorkManagerTaskExecutor workManagerTaskExecutor) {
        RoomDatabase.Builder builder;
        boolean z2 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        final Context context2 = context.getApplicationContext();
        SerialExecutor executor = workManagerTaskExecutor.f8850a;
        int i2 = WorkDatabase.m;
        if (z2) {
            Intrinsics.f(context2, "context");
            builder = new RoomDatabase.Builder(context2, null);
            builder.f8228i = true;
        } else {
            String str = WorkDatabasePathHelper.f8677a;
            Intrinsics.f(context2, "context");
            if (StringsKt.w("androidx.work.workdb")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            RoomDatabase.Builder builder2 = new RoomDatabase.Builder(context2, "androidx.work.workdb");
            builder2.f8227h = new SupportSQLiteOpenHelper.Factory() { // from class: androidx.work.impl.WorkDatabase.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f8670a;

                public AnonymousClass1() {
                    context = context2;
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
                public final SupportSQLiteOpenHelper a(SupportSQLiteOpenHelper.Configuration configuration2) {
                    SupportSQLiteOpenHelper.Configuration.Builder builderA = SupportSQLiteOpenHelper.Configuration.Companion.a(context);
                    builderA.f8370b = configuration2.f8367b;
                    SupportSQLiteOpenHelper.Callback callback = configuration2.f8368c;
                    Intrinsics.f(callback, "callback");
                    builderA.f8371c = callback;
                    builderA.d = true;
                    return new FrameworkSQLiteOpenHelperFactory().a(builderA.a());
                }
            };
            builder = builder2;
        }
        Intrinsics.f(executor, "executor");
        builder.f = executor;
        builder.d.add(new WorkDatabase.AnonymousClass2());
        builder.a(WorkDatabaseMigrations.f8671a);
        builder.a(new WorkDatabaseMigrations.RescheduleMigration(context2, 2, 3));
        builder.a(WorkDatabaseMigrations.f8672b);
        builder.a(WorkDatabaseMigrations.f8673c);
        builder.a(new WorkDatabaseMigrations.RescheduleMigration(context2, 5, 6));
        builder.a(WorkDatabaseMigrations.d);
        builder.a(WorkDatabaseMigrations.f8674e);
        builder.a(WorkDatabaseMigrations.f);
        builder.a(new WorkDatabaseMigrations.WorkMigration9To10(context2));
        builder.a(new WorkDatabaseMigrations.RescheduleMigration(context2, 10, 11));
        builder.a(WorkDatabaseMigrations.g);
        builder.f8231p = false;
        builder.q = true;
        WorkDatabase workDatabase = (WorkDatabase) builder.b();
        Context applicationContext = context.getApplicationContext();
        Logger.LogcatLogger logcatLogger = new Logger.LogcatLogger(configuration.f);
        synchronized (Logger.class) {
            Logger.f8630a = logcatLogger;
        }
        String str2 = Schedulers.f8664a;
        SystemJobScheduler systemJobScheduler = new SystemJobScheduler(applicationContext, this);
        PackageManagerHelper.a(applicationContext, SystemJobService.class, true);
        Logger.c().a(Schedulers.f8664a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        List listAsList = Arrays.asList(systemJobScheduler, new GreedyScheduler(applicationContext, configuration, workManagerTaskExecutor, this));
        Processor processor = new Processor(context, configuration, workManagerTaskExecutor, workDatabase, listAsList);
        Context applicationContext2 = context.getApplicationContext();
        this.f8684a = applicationContext2;
        this.f8685b = configuration;
        this.d = workManagerTaskExecutor;
        this.f8686c = workDatabase;
        this.f8687e = listAsList;
        this.f = processor;
        this.g = new PreferenceUtils(workDatabase);
        this.f8688h = false;
        if (applicationContext2.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.d.b(new ForceStopRunnable(applicationContext2, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WorkManagerImpl b(Context context) {
        WorkManagerImpl workManagerImplB;
        Object obj = f8683l;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        workManagerImplB = j;
                        if (workManagerImplB == null) {
                            workManagerImplB = k;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return workManagerImplB;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (workManagerImplB == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof Configuration.Provider)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            c(applicationContext, ((Configuration.Provider) applicationContext).a());
            workManagerImplB = b(applicationContext);
        }
        return workManagerImplB;
    }

    public static void c(Context context, Configuration configuration) {
        synchronized (f8683l) {
            try {
                WorkManagerImpl workManagerImpl = j;
                if (workManagerImpl != null && k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (workManagerImpl == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (k == null) {
                        k = new WorkManagerImpl(applicationContext, configuration, new WorkManagerTaskExecutor(configuration.f8600b));
                    }
                    j = k;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.WorkManager
    public final OperationImpl a(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        WorkContinuationImpl workContinuationImpl = new WorkContinuationImpl(this, list);
        if (workContinuationImpl.f8668e) {
            Logger.c().f(WorkContinuationImpl.g, a.n("Already enqueued work ids (", TextUtils.join(", ", workContinuationImpl.f8667c), ")"), new Throwable[0]);
        } else {
            EnqueueRunnable enqueueRunnable = new EnqueueRunnable(workContinuationImpl);
            this.d.b(enqueueRunnable);
            workContinuationImpl.f = enqueueRunnable.f8803Y;
        }
        return workContinuationImpl.f;
    }

    public final void d() {
        synchronized (f8683l) {
            try {
                this.f8688h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f8689i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f8689i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        ArrayList arrayListE;
        WorkDatabase workDatabase = this.f8686c;
        Context context = this.f8684a;
        String str = SystemJobScheduler.f0;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListE = SystemJobScheduler.e(context, jobScheduler)) != null && !arrayListE.isEmpty()) {
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                SystemJobScheduler.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        workDatabase.s().k();
        Schedulers.a(this.f8685b, workDatabase, this.f8687e);
    }

    public final void f(String str, WorkerParameters.RuntimeExtras runtimeExtras) {
        WorkManagerTaskExecutor workManagerTaskExecutor = this.d;
        StartWorkRunnable startWorkRunnable = new StartWorkRunnable();
        startWorkRunnable.X = this;
        startWorkRunnable.f8812Y = str;
        startWorkRunnable.Z = runtimeExtras;
        workManagerTaskExecutor.b(startWorkRunnable);
    }
}
