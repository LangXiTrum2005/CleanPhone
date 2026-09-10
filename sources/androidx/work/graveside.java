package androidx.work;

import android.content.Context;

/* JADX INFO: compiled from: WorkerFactory.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class graveside {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final String f14049attabal = apical.beachfront("WorkerFactory");

    /* JADX INFO: compiled from: WorkerFactory.java */
    public class attabal extends graveside {
        @Override // androidx.work.graveside
        public ListenableWorker attabal(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static graveside dern() {
        return new attabal();
    }

    public abstract ListenableWorker attabal(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker saneness(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        ListenableWorker listenableWorkerAttabal = attabal(context, str, workerParameters);
        if (listenableWorkerAttabal == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                apical.dern().saneness(f14049attabal, "Invalid class: " + str, th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    listenableWorkerAttabal = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    apical.dern().saneness(f14049attabal, "Could not instantiate " + str, th2);
                }
            }
        }
        if (listenableWorkerAttabal == null || !listenableWorkerAttabal.isUsed()) {
            return listenableWorkerAttabal;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
