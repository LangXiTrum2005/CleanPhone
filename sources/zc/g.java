package zc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.applovin.impl.da;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f54829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f54830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f54831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54833e;

    public g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new q9.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f54829a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f54831c = new Object();
        this.f54833e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            c0.b(intent);
        }
        synchronized (this.f54831c) {
            try {
                int i10 = this.f54833e - 1;
                this.f54833e = i10;
                if (i10 == 0) {
                    stopSelfResult(this.f54832d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f54830b == null) {
                this.f54830b = new d0(new f(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f54830b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f54829a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.f54831c) {
            this.f54832d = i11;
            this.f54833e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) u.t().f54882e).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f54829a.execute(new ld.f(this, intent2, taskCompletionSource, 13));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener(new da(1), new tb.n(7, this, intent));
        return 3;
    }
}
