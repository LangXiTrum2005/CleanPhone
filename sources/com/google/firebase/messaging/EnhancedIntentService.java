package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EnhancedIntentService extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = triweekly.wireman();
    private final Object lock = new Object();
    private int runningTasks = 0;

    public class attabal implements nosophobia.attabal {
        public attabal() {
        }

        @Override // com.google.firebase.messaging.nosophobia.attabal
        public Task<Void> attabal(Intent intent) {
            return EnhancedIntentService.this.processIntent(intent);
        }
    }

    public static /* synthetic */ void attabal(EnhancedIntentService enhancedIntentService, Intent intent, TaskCompletionSource taskCompletionSource) {
        enhancedIntentService.getClass();
        try {
            enhancedIntentService.handleIntent(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishTask(Intent intent) {
        if (intent != null) {
            coffeecake.dern(intent);
        }
        synchronized (this.lock) {
            try {
                int i = this.runningTasks - 1;
                this.runningTasks = i;
                if (i == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> processIntent(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new Runnable() { // from class: com.google.firebase.messaging.impromptu
            @Override // java.lang.Runnable
            public final void run() {
                EnhancedIntentService.attabal(this.f22655kowloon, intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            Log.isLoggable(TAG, 3);
            if (this.binder == null) {
                this.binder = new nosophobia(new attabal());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        Task<Void> taskProcessIntent = processIntent(startCommandIntent);
        if (taskProcessIntent.isComplete()) {
            finishTask(intent);
            return 2;
        }
        taskProcessIntent.addOnCompleteListener(new androidx.privacysandbox.ads.adservices.measurement.cutely(), new OnCompleteListener() { // from class: com.google.firebase.messaging.competently
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f22621attabal.finishTask(intent);
            }
        });
        return 3;
    }

    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }
}
