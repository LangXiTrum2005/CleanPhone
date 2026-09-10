package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class JobIntentService extends Service {
    public static final HashMap g0 = new HashMap();
    public JobServiceEngineImpl X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public WorkEnqueuer f4175Y;
    public CommandProcessor Z;
    public boolean e0 = false;
    public final ArrayList f0;

    public final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        public CommandProcessor() {
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            GenericWorkItem wrapperWorkItem;
            while (true) {
                JobIntentService jobIntentService = JobIntentService.this;
                JobServiceEngineImpl jobServiceEngineImpl = jobIntentService.X;
                if (jobServiceEngineImpl != null) {
                    synchronized (jobServiceEngineImpl.f4184b) {
                        try {
                            JobParameters jobParameters = jobServiceEngineImpl.f4185c;
                            if (jobParameters != null) {
                                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                                if (jobWorkItemDequeueWork != null) {
                                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(jobServiceEngineImpl.f4183a.getClassLoader());
                                    wrapperWorkItem = jobServiceEngineImpl.new WrapperWorkItem(jobWorkItemDequeueWork);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    synchronized (jobIntentService.f0) {
                        try {
                            wrapperWorkItem = jobIntentService.f0.size() > 0 ? (GenericWorkItem) jobIntentService.f0.remove(0) : null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                if (wrapperWorkItem == null) {
                    return null;
                }
                JobIntentService jobIntentService2 = JobIntentService.this;
                wrapperWorkItem.getIntent();
                jobIntentService2.b();
                wrapperWorkItem.complete();
            }
        }

        @Override // android.os.AsyncTask
        public final void onCancelled(Void r1) {
            JobIntentService.this.c();
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r1) {
            JobIntentService.this.c();
        }
    }

    public interface CompatJobEngine {
    }

    public static final class CompatWorkEnqueuer extends WorkEnqueuer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f4177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PowerManager.WakeLock f4178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PowerManager.WakeLock f4179c;
        public boolean d;

        public CompatWorkEnqueuer(JobIntentService jobIntentService, ComponentName componentName) {
            this.f4177a = jobIntentService.getApplicationContext();
            PowerManager powerManager = (PowerManager) jobIntentService.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f4178b = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f4179c = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public final void a() {
            synchronized (this) {
                try {
                    if (this.d) {
                        this.d = false;
                        this.f4179c.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public final void b() {
            synchronized (this) {
                try {
                    if (!this.d) {
                        this.d = true;
                        this.f4179c.acquire(TTAdConstant.AD_MAX_EVENT_TIME);
                        this.f4178b.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public final void c() {
            synchronized (this) {
            }
        }
    }

    public final class CompatWorkItem implements GenericWorkItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f4180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4181b;

        public CompatWorkItem(Intent intent, int i2) {
            this.f4180a = intent;
            this.f4181b = i2;
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public final void complete() {
            JobIntentService.this.stopSelf(this.f4181b);
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public final Intent getIntent() {
            return this.f4180a;
        }
    }

    public interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    public static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JobIntentService f4183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f4184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public JobParameters f4185c;

        public final class WrapperWorkItem implements GenericWorkItem {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final JobWorkItem f4186a;

            public WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.f4186a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public final void complete() {
                synchronized (JobServiceEngineImpl.this.f4184b) {
                    try {
                        JobParameters jobParameters = JobServiceEngineImpl.this.f4185c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f4186a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public final Intent getIntent() {
                return this.f4186a.getIntent();
            }
        }

        public JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f4184b = new Object();
            this.f4183a = jobIntentService;
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.f4185c = jobParameters;
            this.f4183a.a(false);
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            CommandProcessor commandProcessor = this.f4183a.Z;
            if (commandProcessor != null) {
                commandProcessor.cancel(false);
            }
            synchronized (this.f4184b) {
                this.f4185c = null;
            }
            return true;
        }
    }

    public static final class JobWorkEnqueuer extends WorkEnqueuer {
    }

    public static abstract class WorkEnqueuer {
        public void a() {
        }

        public void b() {
        }

        public void c() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f0 = null;
        } else {
            this.f0 = new ArrayList();
        }
    }

    public final void a(boolean z2) {
        if (this.Z == null) {
            this.Z = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.f4175Y;
            if (workEnqueuer != null && z2) {
                workEnqueuer.b();
            }
            this.Z.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void b();

    public final void c() {
        ArrayList arrayList = this.f0;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.Z = null;
                    ArrayList arrayList2 = this.f0;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        a(false);
                    } else if (!this.e0) {
                        this.f4175Y.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        JobServiceEngineImpl jobServiceEngineImpl = this.X;
        if (jobServiceEngineImpl != null) {
            return jobServiceEngineImpl.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.X = new JobServiceEngineImpl(this);
            this.f4175Y = null;
            return;
        }
        this.X = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap map = g0;
        WorkEnqueuer compatWorkEnqueuer = (WorkEnqueuer) map.get(componentName);
        if (compatWorkEnqueuer == null) {
            if (i2 >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            compatWorkEnqueuer = new CompatWorkEnqueuer(this, componentName);
            map.put(componentName, compatWorkEnqueuer);
        }
        this.f4175Y = compatWorkEnqueuer;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f0;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.e0 = true;
                this.f4175Y.a();
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        if (this.f0 == null) {
            return 2;
        }
        this.f4175Y.c();
        synchronized (this.f0) {
            ArrayList arrayList = this.f0;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CompatWorkItem(intent, i3));
            a(true);
        }
        return 3;
    }
}
