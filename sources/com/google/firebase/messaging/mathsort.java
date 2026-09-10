package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: RequestDeduplicator.java */
/* JADX INFO: loaded from: classes3.dex */
public class mathsort {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Executor f22666attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<String, Task<String>> f22667saneness = new androidx.collection.attabal();

    /* JADX INFO: compiled from: RequestDeduplicator.java */
    public interface attabal {
        Task<String> start();
    }

    public mathsort(Executor executor) {
        this.f22666attabal = executor;
    }

    public static /* synthetic */ Task attabal(mathsort mathsortVar, String str, Task task) {
        synchronized (mathsortVar) {
            mathsortVar.f22667saneness.remove(str);
        }
        return task;
    }

    public synchronized Task<String> saneness(final String str, attabal attabalVar) {
        Task<String> task = this.f22667saneness.get(str);
        if (task != null) {
            Log.isLoggable("FirebaseMessaging", 3);
            return task;
        }
        Log.isLoggable("FirebaseMessaging", 3);
        Task taskContinueWithTask = attabalVar.start().continueWithTask(this.f22666attabal, new Continuation() { // from class: com.google.firebase.messaging.peridotite
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return mathsort.attabal(this.f22686attabal, str, task2);
            }
        });
        this.f22667saneness.put(str, (Task<String>) taskContinueWithTask);
        return taskContinueWithTask;
    }
}
