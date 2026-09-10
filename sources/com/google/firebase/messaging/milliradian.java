package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: TopicsSubscriber.java */
/* JADX INFO: loaded from: classes3.dex */
public class milliradian {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final long f22673taiyuan = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f22674attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final ScheduledExecutorService f22675beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final yemenite f22677dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final premeiotic f22678impromptu;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final merc f22680saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final FirebaseMessaging f22681wireman;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f22679marial = new androidx.collection.attabal();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f22676competently = false;

    public milliradian(FirebaseMessaging firebaseMessaging, merc mercVar, premeiotic premeioticVar, yemenite yemeniteVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f22681wireman = firebaseMessaging;
        this.f22680saneness = mercVar;
        this.f22678impromptu = premeioticVar;
        this.f22677dern = yemeniteVar;
        this.f22674attabal = context;
        this.f22675beachfront = scheduledExecutorService;
    }

    public static /* synthetic */ milliradian attabal(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, merc mercVar, yemenite yemeniteVar) {
        return new milliradian(firebaseMessaging, mercVar, premeiotic.saneness(context, scheduledExecutorService), yemeniteVar, context, scheduledExecutorService);
    }

    public static Task<milliradian> beachfront(final FirebaseMessaging firebaseMessaging, final merc mercVar, final yemenite yemeniteVar, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.timberyard
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return milliradian.attabal(context, scheduledExecutorService, firebaseMessaging, mercVar, yemeniteVar);
            }
        });
    }

    public static <T> void dern(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean impromptu() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public boolean apical(cultivated cultivatedVar) throws IOException {
        try {
            String strSaneness = cultivatedVar.saneness();
            int iHashCode = strSaneness.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && strSaneness.equals("U")) {
                    marial(cultivatedVar.dern());
                    if (!impromptu()) {
                        return true;
                    }
                    cultivatedVar.dern();
                    return true;
                }
            } else if (strSaneness.equals("S")) {
                wireman(cultivatedVar.dern());
                if (!impromptu()) {
                    return true;
                }
                cultivatedVar.dern();
                return true;
            }
            impromptu();
            return true;
        } catch (IOException e) {
            if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage()) || "TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                e.getMessage();
                return false;
            }
            if (e.getMessage() == null) {
                return false;
            }
            throw e;
        }
    }

    public void arytenoidectomy() {
        if (competently()) {
            kowloon();
        }
    }

    public boolean competently() {
        return this.f22678impromptu.dern() != null;
    }

    public final void cutely(cultivated cultivatedVar) {
        synchronized (this.f22679marial) {
            try {
                String strMarial = cultivatedVar.marial();
                if (this.f22679marial.containsKey(strMarial)) {
                    ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f22679marial.get(strMarial);
                    TaskCompletionSource<Void> taskCompletionSourcePoll = arrayDeque.poll();
                    if (taskCompletionSourcePoll != null) {
                        taskCompletionSourcePoll.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f22679marial.remove(strMarial);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void formularize(Runnable runnable, long j) {
        this.f22675beachfront.schedule(runnable, j, TimeUnit.SECONDS);
    }

    public Task<Void> graveside(String str) {
        Task<Void> taskImpassible = impassible(cultivated.competently(str));
        arytenoidectomy();
        return taskImpassible;
    }

    public Task<Void> impassible(cultivated cultivatedVar) {
        this.f22678impromptu.attabal(cultivatedVar);
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        saneness(cultivatedVar, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final void kowloon() {
        if (taiyuan()) {
            return;
        }
        molybdenite(0L);
    }

    public final void marial(String str) throws IOException {
        dern(this.f22677dern.impassible(this.f22681wireman.impassible(), str));
    }

    public void molybdenite(long j) {
        formularize(new treadless(this, this.f22674attabal, this.f22680saneness, Math.min(Math.max(30L, 2 * j), f22673taiyuan)), j);
        triweekly(true);
    }

    public Task<Void> monoploid(String str) {
        Task<Void> taskImpassible = impassible(cultivated.beachfront(str));
        arytenoidectomy();
        return taskImpassible;
    }

    public boolean polloi() throws IOException {
        while (true) {
            synchronized (this) {
                try {
                    cultivated cultivatedVarDern = this.f22678impromptu.dern();
                    if (cultivatedVarDern == null) {
                        impromptu();
                        return true;
                    }
                    if (!apical(cultivatedVarDern)) {
                        return false;
                    }
                    this.f22678impromptu.marial(cultivatedVarDern);
                    cutely(cultivatedVarDern);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void saneness(cultivated cultivatedVar, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque<TaskCompletionSource<Void>> arrayDeque;
        synchronized (this.f22679marial) {
            try {
                String strMarial = cultivatedVar.marial();
                if (this.f22679marial.containsKey(strMarial)) {
                    arrayDeque = this.f22679marial.get(strMarial);
                } else {
                    ArrayDeque<TaskCompletionSource<Void>> arrayDeque2 = new ArrayDeque<>();
                    this.f22679marial.put(strMarial, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean taiyuan() {
        return this.f22676competently;
    }

    public synchronized void triweekly(boolean z) {
        this.f22676competently = z;
    }

    public final void wireman(String str) throws IOException {
        dern(this.f22677dern.formularize(this.f22681wireman.impassible(), str));
    }
}
