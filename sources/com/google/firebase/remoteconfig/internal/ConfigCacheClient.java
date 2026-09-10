package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public class ConfigCacheClient {
    public static final HashMap d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final androidx.arch.core.executor.a f20935e = new androidx.arch.core.executor.a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f20936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConfigStorageClient f20937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Task f20938c = null;

    public static class AwaitListener<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {
        public final CountDownLatch X = new CountDownLatch(1);

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
            this.X.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception exc) {
            this.X.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(Object obj) {
            this.X.countDown();
        }
    }

    public ConfigCacheClient(Executor executor, ConfigStorageClient configStorageClient) {
        this.f20936a = executor;
        this.f20937b = configStorageClient;
    }

    public static Object a(Task task) throws ExecutionException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AwaitListener awaitListener = new AwaitListener();
        Executor executor = f20935e;
        task.addOnSuccessListener(executor, awaitListener);
        task.addOnFailureListener(executor, awaitListener);
        task.addOnCanceledListener(executor, awaitListener);
        if (!awaitListener.X.await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public final synchronized Task b() {
        try {
            Task task = this.f20938c;
            if (task == null || (task.isComplete() && !this.f20938c.isSuccessful())) {
                this.f20938c = Tasks.call(this.f20936a, new androidx.webkit.internal.b(this.f20937b, 3));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f20938c;
    }

    public final ConfigContainer c() {
        synchronized (this) {
            try {
                Task task = this.f20938c;
                if (task != null && task.isSuccessful()) {
                    return (ConfigContainer) this.f20938c.getResult();
                }
                try {
                    Task taskB = b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (ConfigContainer) a(taskB);
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
