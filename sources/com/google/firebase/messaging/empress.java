package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: WithinAppServiceConnection.java */
/* JADX INFO: loaded from: classes3.dex */
public class empress implements ServiceConnection {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Queue<attabal> f22640beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public nosophobia f22641competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Context f22642dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f22643impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final ScheduledExecutorService f22644marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Intent f22645wireman;

    /* JADX INFO: compiled from: WithinAppServiceConnection.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Intent f22646attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final TaskCompletionSource<Void> f22647saneness = new TaskCompletionSource<>();

        public attabal(Intent intent) {
            this.f22646attabal = intent;
        }

        public static /* synthetic */ void saneness(attabal attabalVar) {
            attabalVar.f22646attabal.getAction();
            attabalVar.wireman();
        }

        public void dern(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.lotta
                @Override // java.lang.Runnable
                public final void run() {
                    empress.attabal.saneness(this.f22664kowloon);
                }
            }, 20L, TimeUnit.SECONDS);
            marial().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.sayid
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        public Task<Void> marial() {
            return this.f22647saneness.getTask();
        }

        public void wireman() {
            this.f22647saneness.trySetResult(null);
        }
    }

    public empress(Context context, String str) {
        this(context, str, attabal());
    }

    public static ScheduledThreadPoolExecutor attabal() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    public final synchronized void dern() {
        try {
            Log.isLoggable("FirebaseMessaging", 3);
            while (!this.f22640beachfront.isEmpty()) {
                Log.isLoggable("FirebaseMessaging", 3);
                nosophobia nosophobiaVar = this.f22641competently;
                if (nosophobiaVar == null || !nosophobiaVar.isBinderAlive()) {
                    marial();
                    return;
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                    this.f22641competently.saneness(this.f22640beachfront.poll());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void marial() {
        Log.isLoggable("FirebaseMessaging", 3);
        if (this.f22643impromptu) {
            return;
        }
        this.f22643impromptu = true;
        try {
            if (ConnectionTracker.getInstance().bindService(this.f22642dern, this.f22645wireman, this, 65)) {
                return;
            }
        } catch (SecurityException unused) {
        }
        this.f22643impromptu = false;
        saneness();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f22643impromptu = false;
            if (iBinder instanceof nosophobia) {
                this.f22641competently = (nosophobia) iBinder;
                dern();
            } else {
                Objects.toString(iBinder);
                saneness();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        dern();
    }

    public final void saneness() {
        while (!this.f22640beachfront.isEmpty()) {
            this.f22640beachfront.poll().wireman();
        }
    }

    public synchronized Task<Void> wireman(Intent intent) {
        attabal attabalVar;
        Log.isLoggable("FirebaseMessaging", 3);
        attabalVar = new attabal(intent);
        attabalVar.dern(this.f22644marial);
        this.f22640beachfront.add(attabalVar);
        dern();
        return attabalVar.marial();
    }

    public empress(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f22640beachfront = new ArrayDeque();
        this.f22643impromptu = false;
        Context applicationContext = context.getApplicationContext();
        this.f22642dern = applicationContext;
        this.f22645wireman = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f22644marial = scheduledExecutorService;
    }
}
